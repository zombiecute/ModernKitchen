package com.zombie_cute.mc.bakingdelight.block.entities;

import com.google.common.collect.Maps;
import com.zombie_cute.mc.bakingdelight.block.ModBlockEntities;
import com.zombie_cute.mc.bakingdelight.recipe.FreezingRecipe;
import com.zombie_cute.mc.bakingdelight.screen.FreezerScreenHandler;
import com.zombie_cute.mc.bakingdelight.sound.ModSounds;
import com.zombie_cute.mc.bakingdelight.tag.ForgeTagKeys;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import static com.zombie_cute.mc.bakingdelight.block.custom.FreezerBlock.HAS_ICE;

public class FreezerBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory, IsStateChange, SidedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(20,ItemStack.EMPTY);
    private static final int INPUT_SLOT_1 = 0;
    private static final int INPUT_SLOT_2 = 1;
    private static final int INPUT_SLOT_3 = 2;
    private static final int ICE_SLOT = 3;
    private static final int OUTPUT_SLOT = 4;
    public static final String FREEZER_NAME = "display_name.bakingdelight.freezer_name";
    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 400;
    private int coolTime = 0;
    public FreezerBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.FREEZER_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> FreezerBlockEntity.this.progress;
                    case 1 -> FreezerBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index){
                    case 0 :{
                        FreezerBlockEntity.this.progress = value;break;
                    }
                    case 1 :{
                        FreezerBlockEntity.this.maxProgress = value;break;
                    }
                }
            }

            @Override
            public int size() {
                return 2;
            }
        };
    }
    public void playSound(SoundEvent sound, float volume, float pitch) {
        Objects.requireNonNull(world).playSound(null, pos.getX() + .5f, pos.getY() + .5f, pos.getZ() + .5f, sound, SoundCategory.BLOCKS, volume, pitch);
    }
    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("freezer.progress",progress);
        nbt.putInt("freezer.fuelTime", coolTime);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("freezer.progress");
        coolTime = nbt.getInt("freezer.coolTime");
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable(FREEZER_NAME);
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new FreezerScreenHandler(syncId, playerInventory,this,this.propertyDelegate);
    }
    public void tick(World world, BlockPos pos, BlockState state, FreezerBlockEntity entity){
        if (world.isClient){
            return;
        }
        if (this.isCool()){
            --this.coolTime;
            world.setBlockState(pos, state.with(HAS_ICE,true));
            playSound(ModSounds.BLOCK_FREEZER_RUNNING,0.3f,0.8f);
        } else {
            world.setBlockState(pos, state.with(HAS_ICE, false));
        }
        if (canUseAsIce(this.getStack(3))&&this.coolTime == 0){
            ItemStack ice = this.getStack(3);
            this.coolTime = this.getCoolTime(ice);
            if (this.getStack(ICE_SLOT).getItem() == Items.POWDER_SNOW_BUCKET){
                this.setStack(ICE_SLOT, Items.BUCKET.getDefaultStack());
            } else {
                this.removeStack(ICE_SLOT,1);
            }
        }
        if (isOutputSlotEmptyOrReceivable() && isCool()){
            if (this.hasRecipe(entity)){
                this.increaseCraftProgress();
                markDirty(world, pos, state);
                if (hasCraftingFinished()){
                    this.craftItem(entity);
                    if (this.getStack(INPUT_SLOT_1).getItem() == Items.WATER_BUCKET ||
                            this.getStack(INPUT_SLOT_1).getItem() == Items.LAVA_BUCKET){
                        this.setStack(INPUT_SLOT_1, new ItemStack(Items.BUCKET, 3));
                    } else {
                        this.removeStack(INPUT_SLOT_1,1);
                    }
                    this.removeStack(INPUT_SLOT_2,1);
                    this.removeStack(INPUT_SLOT_3,1);
                    this.resetProgress();
                }
            } else {
                if (this.progress != 0){
                    this.progress --;
                }
            }
        } else {
            if (this.progress != 0){
                this.progress --;
            }
            markDirty(world, pos, state);
        }
    }
    public static Map<Item, Integer> createCoolTimeMap() {
        LinkedHashMap<Item, Integer> map = Maps.newLinkedHashMap();
        FreezerBlockEntity.addIce(map, Items.ICE, 60);
        FreezerBlockEntity.addIce(map, Items.PACKED_ICE, 580);
        FreezerBlockEntity.addIce(map, Items.BLUE_ICE, 5500);
        FreezerBlockEntity.addIce(map, Items.SNOW_BLOCK, 50);
        FreezerBlockEntity.addIce(map, Items.SNOW, 30);
        FreezerBlockEntity.addIce(map, Items.POWDER_SNOW_BUCKET, 1200);
        FreezerBlockEntity.addIce(map, ForgeTagKeys.COLD_ITEMS, 10);
        return map;
    }
    private static void addIce(Map<Item, Integer> coolTimes, TagKey<Item> tag, int coolTime) {
        for (RegistryEntry<Item> registryEntry : Registries.ITEM.iterateEntries(tag)) {
            coolTimes.put(registryEntry.value(), coolTime);
        }
    }
    private static void addIce(Map<Item, Integer> coolTimes, ItemConvertible item, int coolTime) {
        Item item2 = item.asItem();
        coolTimes.put(item2, coolTime);
    }
    public static boolean canUseAsIce(ItemStack stack){
        return FreezerBlockEntity.createCoolTimeMap().containsKey(stack.getItem());
    }
    private int getCoolTime(ItemStack ice){
        if (ice.isEmpty()){
            return 0;
        }
        Item item = ice.getItem();
        return FreezerBlockEntity.createCoolTimeMap().getOrDefault(item,0);
    }
    private boolean isCool(){
        return this.coolTime > 0;
    }
    private void resetProgress(){
        this.progress = 0;
    }
    private void craftItem(FreezerBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for(int i = 0; i< entity.size();i++){
            inventory.setStack(i,entity.getStack(i));
        }
        Optional<FreezingRecipe> match = entity.getWorld().getRecipeManager()
                .getFirstMatch(FreezingRecipe.Type.INSTANCE, inventory,entity.getWorld());

        this.setStack(OUTPUT_SLOT, new ItemStack(match.get().getOutput(null).getItem(),
                getStack(OUTPUT_SLOT).getCount() + match.get().getOutput(null).getCount()));
    }
    private boolean hasCraftingFinished(){
        return progress >= maxProgress;
    }
    private void increaseCraftProgress(){
        progress++;
    }
    private boolean hasRecipe(FreezerBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for(int i = 0; i< entity.size();i++){
            inventory.setStack(i,entity.getStack(i));
        }
        Optional<FreezingRecipe> match = entity.getWorld().getRecipeManager()
                .getFirstMatch(FreezingRecipe.Type.INSTANCE, inventory,entity.getWorld());

        return match.isPresent() &&
                canInsertAmountIntoOutputSlot(match.get().getOutput(null)) &&
                canInsertItemIntoOutputSlot(match.get().getOutput(entity.world.getRegistryManager()).getItem());
    }

    private boolean canInsertItemIntoOutputSlot(Item item) {
        return this.getStack(OUTPUT_SLOT).getItem() == item || this.getStack(OUTPUT_SLOT).isEmpty();
    }

    private boolean canInsertAmountIntoOutputSlot(ItemStack result) {
        return this.getStack(OUTPUT_SLOT).getCount() + result.getCount() <= getStack(OUTPUT_SLOT).getMaxCount();
    }

    private boolean isOutputSlotEmptyOrReceivable() {
        return this.getStack(OUTPUT_SLOT).isEmpty() || this.getStack(OUTPUT_SLOT).getCount() < this.getStack(OUTPUT_SLOT).getMaxCount();
    }

    public boolean isCooling() {
        if (world == null){
            return false;
        }
        return isCooling(world,pos);
    }

    @Override
    public int[] getAvailableSlots(Direction side) {
        int[] result = new int[getItems().size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = i;
        }
        return result;
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
        if (dir == Direction.UP && slot >= 5){
            return true;
        } else if (dir == Direction.NORTH && slot == 3) {
            return true;
        } else if (dir == Direction.WEST && slot == 0) {
            return true;
        } else if (dir == Direction.SOUTH && slot == 1) {
            return true;
        } else return dir == Direction.EAST && slot == 2;
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        return dir == Direction.DOWN && slot >= 4;
    }
    public ItemStack getIceSlot(){
        if (world != null) {
            return this.getStack(ICE_SLOT);
        } else return ItemStack.EMPTY;
    }
    public ItemStack getCraftSlot(){
        if (world != null) {
            if (this.getStack(OUTPUT_SLOT).isEmpty()){
                return this.getStack(INPUT_SLOT_2);
            } else {
                return this.getStack(OUTPUT_SLOT);
            }
        } else return ItemStack.EMPTY;
    }
    public ItemStack getSlot1(){
        if (world != null) {
            return this.getStack(5);
        } else return ItemStack.EMPTY;
    }
    public ItemStack getSlot2(){
        if (world != null) {
            return this.getStack(6);
        } else return ItemStack.EMPTY;
    }
}

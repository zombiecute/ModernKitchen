package com.zombie_cute.mc.bakingdelight.block.entities;

import com.zombie_cute.mc.bakingdelight.recipe.OvenRecipe;
import com.zombie_cute.mc.bakingdelight.screen.OvenScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Optional;

import static com.zombie_cute.mc.bakingdelight.block.custom.OvenBlock.OVEN_BURNING;

public class OvenBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplementedInventory, IsStateChange, SidedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(6,ItemStack.EMPTY);
    private static final int INPUT_SLOT_1 = 0;
    private static final int INPUT_SLOT_2 = 1;
    private static final int INPUT_SLOT_3 = 2;
    private static final int INPUT_SLOT_4 = 3;
    private static final int FUEL_SLOT = 4;
    private static final int OUTPUT_SLOT = 5;
    public static final String OVEN_NAME = "display_name.bakingdelight.oven_name";
    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 200;
    private int burnTime = 0;

    public OvenBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.OVEN_BLOCK_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> OvenBlockEntity.this.progress;
                    case 1 -> OvenBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index){
                    case 0 :{
                        OvenBlockEntity.this.progress = value;break;
                    }
                    case 1 :{
                        OvenBlockEntity.this.maxProgress = value;break;
                    }
                }
            }

            @Override
            public int size() {
                return 2;
            }
        };
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("oven.progress",progress);
        nbt.putInt("oven.fuelTime", burnTime);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("oven.progress");
        burnTime = nbt.getInt("oven.fuelTime");
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
        return Text.translatable(OVEN_NAME);
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new OvenScreenHandler(syncId, playerInventory, this,this.propertyDelegate);
    }
    public void playSound(SoundEvent sound, float volume, float pitch) {
        Objects.requireNonNull(world).playSound(null, pos.getX() + .5f, pos.getY() + .5f, pos.getZ() + .5f, sound, SoundCategory.BLOCKS, volume, pitch);
    }
    public void tick(World world, BlockPos pos, BlockState state, OvenBlockEntity entity) {
        if (world.isClient){
            return;
        }
        if (this.isFuelBurning()){
            --this.burnTime;
            world.setBlockState(pos, state.with(OVEN_BURNING,true));
            playSound(SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, 1.0f,0.2f);
        } else {
            world.setBlockState(pos, state.with(OVEN_BURNING,false));
        }
        if (canUseAsFuel(this.getStack(4))&&(this.burnTime == 0)){
            ItemStack fuel = this.getStack(4);
            this.burnTime = this.getFuelTime(fuel);
            if (this.getStack(FUEL_SLOT).getItem() == Items.LAVA_BUCKET){
                this.setStack(FUEL_SLOT, Items.BUCKET.getDefaultStack());
            } else {
                this.removeStack(FUEL_SLOT,1);
            }
        }
        if ( isOutputSlotEmptyOrReceivable() && isFuelBurning() ){
            if (this.hasRecipe(entity)){
                this.increaseCraftProgress();
                markDirty(world, pos, state);
                if (hasCraftingFinished()){
                    this.craftItem(entity);
                    if (this.getStack(INPUT_SLOT_1).getItem() == Items.MILK_BUCKET){
                        this.setStack(INPUT_SLOT_1, new ItemStack(Items.BUCKET, 4));
                    } else {
                        this.removeStack(INPUT_SLOT_1,1);
                    }
                    this.removeStack(INPUT_SLOT_2,1);
                    this.removeStack(INPUT_SLOT_3,1);
                    this.removeStack(INPUT_SLOT_4,1);
                    this.resetProgress();
                }
            }
            else {
                if (this.progress != 0){
                    this.progress--;
                }
            }
        } else {
            if (this.progress != 0){
                this.progress--;
            }
            markDirty(world, pos, state);
        }
    }
    public static boolean canUseAsFuel(ItemStack stack) {
        return AbstractFurnaceBlockEntity.createFuelTimeMap().containsKey(stack.getItem());
    }
    private int getFuelTime(ItemStack fuel){
        if (fuel.isEmpty()) {
            return 0;
        }
        Item item = fuel.getItem();
        return AbstractFurnaceBlockEntity.createFuelTimeMap().getOrDefault(item, 0) * 2;
    }

    private boolean isFuelBurning() {
        return this.burnTime > 0;
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private void craftItem(OvenBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for(int i = 0; i< entity.size();i++){
            inventory.setStack(i,entity.getStack(i));
        }
        Optional<OvenRecipe> match = entity.getWorld().getRecipeManager()
                .getFirstMatch(OvenRecipe.Type.INSTANCE, inventory,entity.getWorld());

        this.setStack(OUTPUT_SLOT, new ItemStack(match.get().getOutput(null).getItem(),
                getStack(OUTPUT_SLOT).getCount() + match.get().getOutput(null).getCount()));
    }

    private boolean hasCraftingFinished() {
        return  progress >= maxProgress;
    }

    private void increaseCraftProgress() {
        progress++;
    }

    private boolean hasRecipe(OvenBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for(int i = 0; i< entity.size();i++){
            inventory.setStack(i,entity.getStack(i));
        }
        Optional<OvenRecipe> match = entity.getWorld().getRecipeManager()
                .getFirstMatch(OvenRecipe.Type.INSTANCE, inventory,entity.getWorld());

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
    public boolean isBurning(){
        if (world == null){
            return false;
        }
        return isHeated(world,pos);
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
        if (dir == Direction.UP && slot == 4){
            return true;
        } else if (dir == Direction.EAST && slot == 0) {
            return true;
        } else if (dir == Direction.SOUTH && slot == 1) {
            return true;
        } else if (dir == Direction.WEST && slot == 2) {
            return true;
        } else return dir == Direction.NORTH && slot == 3;
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        if (dir == Direction.DOWN && slot == 4){
            return stack.isOf(Items.BUCKET);
        } else return dir == Direction.DOWN && slot == 5;
    }
}

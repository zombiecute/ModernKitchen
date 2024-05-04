package com.zombie_cute.mc.bakingdelight.block.entities;

import com.zombie_cute.mc.bakingdelight.block.ModBlockEntities;
import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.block.custom.DeepFryerBlock;
import com.zombie_cute.mc.bakingdelight.block.entities.interfaces.ImplementedInventory;
import com.zombie_cute.mc.bakingdelight.item.ModItems;
import com.zombie_cute.mc.bakingdelight.recipe.custom.DeepFryingRecipe;
import com.zombie_cute.mc.bakingdelight.screen.custom.DeepFryerScreenHandler;
import com.zombie_cute.mc.bakingdelight.sound.ModSounds;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
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
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Optional;

public class DeepFryerBlockEntity extends BlockEntity implements ImplementedInventory, ExtendedScreenHandlerFactory {
    public DeepFryerBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.DEEP_FRYER_BLOCK_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> DeepFryerBlockEntity.this.progress1;
                    case 1 -> DeepFryerBlockEntity.this.progress2;
                    case 2 -> DeepFryerBlockEntity.this.progress3;
                    case 3 -> DeepFryerBlockEntity.this.progress4;
                    case 4 -> DeepFryerBlockEntity.this.isHeated;
                    case 5 -> DeepFryerBlockEntity.this.oilLevel;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index){
                    case 0 :{
                        DeepFryerBlockEntity.this.progress1 = value;break;
                    }
                    case 1 :{
                        DeepFryerBlockEntity.this.progress2 = value;break;
                    }
                    case 2 :{
                        DeepFryerBlockEntity.this.progress3 = value;break;
                    }
                    case 3 :{
                        DeepFryerBlockEntity.this.progress4 = value;break;
                    }
                    case 4 :{
                        DeepFryerBlockEntity.this.isHeated = value;break;
                    }
                    case 5 :{
                        DeepFryerBlockEntity.this.oilLevel = value;break;
                    }
                }
            }

            @Override
            public int size() {
                return 6;
            }
        };
    }
    private int progress1 = 0;
    private int progress2 = 0;
    private int progress3 = 0;
    private int progress4 = 0;
    private int oilLevel = 0;
    private int isHeated = 0;
    protected final PropertyDelegate propertyDelegate;
    public static final String DEEP_FRYER_NAME = "display_name.bakingdelight.deep_fryer_name";
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(4,ItemStack.EMPTY);
    public static final String ADD_OIL = "bakingdelight.deep_fryer_message.need_oil";
    public static final String TOO_HOT = "bakingdelight.deep_fryer_message.too_hot";

    public void onUse(BlockState state, World world, BlockPos pos, PlayerEntity player) {
        if (world.isClient){
            return;
        }
        Item mainHandItem = player.getMainHandStack().getItem();
        Item offHandItem = player.getOffHandStack().getItem();
        if (!state.get(DeepFryerBlock.HAS_OIL)){
            if (offHandItem == ModItems.VEGETABLE_OIL_BOTTLE){
                splitOilItem(state, world, pos, player,false, Items.GLASS_BOTTLE);
            } else if (mainHandItem == ModItems.VEGETABLE_OIL_BOTTLE){
                splitOilItem(state, world, pos, player,true,Items.GLASS_BOTTLE);
            } else if (offHandItem == ModItems.VEGETABLE_OIL_BUCKET){
                splitOilItem(state, world, pos, player,false,Items.BUCKET);
            } else if (mainHandItem == ModItems.VEGETABLE_OIL_BUCKET){
                splitOilItem(state, world, pos, player,true,Items.BUCKET);
            } else {
                if (getStack(0).isEmpty()&&getStack(1).isEmpty()&&getStack(3).isEmpty()){
                    player.sendMessage(Text.translatable(ADD_OIL),true);
                } else {
                    if (mainHandItem == ModBlocks.DEEP_FRY_BASKET.asItem() ||
                            offHandItem == ModBlocks.DEEP_FRY_BASKET.asItem()){
                        spawnItem(world);
                    } else {
                        spawnItemAndTryDamage(world,player,state);
                    }
                }
            }
        } else if (mainHandItem == ModBlocks.DEEP_FRY_BASKET.asItem() ||
        offHandItem == ModBlocks.DEEP_FRY_BASKET.asItem()) {
            spawnItem(world);
        } else {
            if (player.getOffHandStack().isEmpty()){
                if (player.getMainHandStack().isEmpty()){
                    spawnItemAndTryDamage(world,player,state);
                } else {
                    checkAndPut(mainHandItem,true,player,world);
                }
            } else {
                checkAndPut(offHandItem,false,player,world);
            }
        }
        markDirty();
    }
    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return createNbt();
    }
    private void spawnItemAndTryDamage(World world, PlayerEntity player, BlockState state){
        if (isHeated(world)){
            player.damage(world.getDamageSources().onFire(),1.5f);
            player.sendMessage(Text.translatable(TOO_HOT),true);
        } else if (state.get(DeepFryerBlock.HAS_OIL)) {
            player.damage(world.getDamageSources().onFire(),1.0f);
            player.sendMessage(Text.translatable(TOO_HOT),true);
        }
        spawnItem(world);
    }
    private void spawnItem(World world){
        if (!getStack(3).isEmpty()){
            spawnItem(3,world);
        } else if (!getStack(2).isEmpty()){
            spawnItem(2,world);
        } else if (!getStack(1).isEmpty()){
            spawnItem(1,world);
        } else if (!getStack(0).isEmpty()){
            spawnItem(0,world);
        }
    }
    private void spawnItem(int slot,World world){
        ItemScatterer.spawn(world,pos.getX()+0.5,pos.getY()+0.8,pos.getZ()+0.5,
                getStack(slot));
        setStack(slot,ItemStack.EMPTY);
        playSound(SoundEvents.ENTITY_ITEM_PICKUP,1.3f,world.random.nextFloat()+0.4f);
    }
    private void checkAndPut(Item item,boolean isMainHand,PlayerEntity player,World world){
        if (getStack(0).isEmpty()){
            setStack(0,item.getDefaultStack());
            checkHandAndDecrement(isMainHand,player);
            playSound(SoundEvents.ENTITY_ITEM_PICKUP,1.0f,world.random.nextFloat()+0.3f);
        } else if (getStack(1).isEmpty()){
            setStack(1,item.getDefaultStack());
            checkHandAndDecrement(isMainHand,player);
            playSound(SoundEvents.ENTITY_ITEM_PICKUP,1.0f,world.random.nextFloat()+0.3f);
        } else if (getStack(2).isEmpty()){
            setStack(2,item.getDefaultStack());
            checkHandAndDecrement(isMainHand,player);
            playSound(SoundEvents.ENTITY_ITEM_PICKUP,1.0f,world.random.nextFloat()+0.3f);
        } else if (getStack(3).isEmpty()){
            setStack(3,item.getDefaultStack());
            checkHandAndDecrement(isMainHand,player);
            playSound(SoundEvents.ENTITY_ITEM_PICKUP,1.0f,world.random.nextFloat()+0.3f);
        }
    }
    private void checkHandAndDecrement(boolean isMainHand,PlayerEntity player){
        if (isMainHand){
            player.getMainHandStack().decrement(1);
        } else {
            player.getOffHandStack().decrement(1);
        }
    }
    private void splitOilItem(BlockState state, World world, BlockPos pos, PlayerEntity player, boolean isMainHand, Item item) {
        checkHandAndDecrement(isMainHand,player);
        player.giveItemStack(item.getDefaultStack());
        playSound(SoundEvents.ITEM_BUCKET_EMPTY,1.0f, world.random.nextFloat()+0.3f);
        world.setBlockState(pos, state.with(DeepFryerBlock.HAS_OIL,true));
        oilLevel = 10;
    }
    int maxProgress = 300;
    public void tick(World world, BlockState state, DeepFryerBlockEntity blockEntity) {
        if (world.isClient){
            return;
        }
        if (progress1 != 0 || progress2 !=0 || progress3 != 0 || progress4 != 0){
            playSound(ModSounds.BLOCK_FOOD_FRYING,0.4f,1.0f);
        }
        if (isHeated(world)){
            isHeated = 1;
            if (getOilLevel() != 0){
                if (hasRecipe(0)){
                    blockEntity.progress1++;
                    if (blockEntity.progress1 == maxProgress){
                        craft(0);
                        decreaseOilLevel(world,state);
                        blockEntity.progress1 = 0;
                        playSound(ModSounds.BLOCK_FOOD_FRYING,1.0f,2.0f);
                        markDirty();
                    }
                } else {
                    blockEntity.progress1 = 0;
                }
                if (hasRecipe(1)){
                    blockEntity.progress2++;
                    if (blockEntity.progress2 == maxProgress){
                        craft(1);
                        decreaseOilLevel(world,state);
                        blockEntity.progress2 = 0;
                        playSound(ModSounds.BLOCK_FOOD_FRYING,1.0f,2.0f);
                        markDirty();
                    }
                } else {
                    blockEntity.progress2 = 0;
                }
                if (hasRecipe(2)){
                    blockEntity.progress3++;
                    if (blockEntity.progress3 == maxProgress){
                        craft(2);
                        decreaseOilLevel(world,state);
                        blockEntity.progress3 = 0;
                        playSound(ModSounds.BLOCK_FOOD_FRYING,1.0f,2.0f);
                        markDirty();
                    }
                } else {
                    blockEntity.progress3 = 0;
                }
                if (hasRecipe(3)) {
                    blockEntity.progress4++;
                    if (blockEntity.progress4 == maxProgress) {
                        craft(3);
                        decreaseOilLevel(world, state);
                        blockEntity.progress4 = 0;
                        playSound(ModSounds.BLOCK_FOOD_FRYING, 1.0f, 2.0f);
                        markDirty();
                    }
                } else {
                    blockEntity.progress4 = 0;
                }
            }
        } else {
            resetAllProgress();
            isHeated = 0;
        }
    }
    private void resetAllProgress(){
        progress1 = 0;
        progress2 = 0;
        progress3 = 0;
        progress4 = 0;
    }
    public void playSound(SoundEvent sound, float volume, float pitch) {
        Objects.requireNonNull(world).playSound(null, pos.getX() + .5f, pos.getY() + .5f, pos.getZ() + .5f, sound, SoundCategory.BLOCKS, volume, pitch);
    }
    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }
    private boolean isHeated(World world){
        return world.getBlockEntity(pos.down()) instanceof BurningGasCookingStoveBlockEntity;
    }
    private int getOilLevel(){
        return oilLevel;
    }
    private void decreaseOilLevel(World world,BlockState state){
        if (oilLevel - 1 != 0){
            oilLevel--;
        } else {
            world.setBlockState(pos,state.with(DeepFryerBlock.HAS_OIL,false));
            oilLevel = 0;
        }
    }
    private void craft(int slot){
        SimpleInventory inventory = new SimpleInventory(1);
        inventory.setStack(0,this.getStack(slot));
        Optional<DeepFryingRecipe> match = Objects.requireNonNull(this.getWorld()).getRecipeManager()
                .getFirstMatch(DeepFryingRecipe.Type.INSTANCE, inventory,this.getWorld());
        this.setStack(slot, new ItemStack(match.get().getOutput(null).getItem(),
                match.get().getOutput(null).getCount()));
    }
    private boolean hasRecipe(int slot) {
        SimpleInventory inventory = new SimpleInventory(1);
        inventory.setStack(0,this.getStack(slot));
        Optional<DeepFryingRecipe> match = Objects.requireNonNull(this.getWorld()).getRecipeManager()
                .getFirstMatch(DeepFryingRecipe.Type.INSTANCE, inventory,this.getWorld());
        return match.isPresent();
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("deep_fryer.progress1",progress1);
        nbt.putInt("deep_fryer.progress2",progress2);
        nbt.putInt("deep_fryer.progress3",progress3);
        nbt.putInt("deep_fryer.progress4",progress4);
        nbt.putInt("deep_fryer.oilLevel",oilLevel);
        nbt.putInt("deep_fryer.isHeated",isHeated);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
        progress1 = nbt.getInt("deep_fryer.progress1");
        progress2 = nbt.getInt("deep_fryer.progress2");
        progress3 = nbt.getInt("deep_fryer.progress3");
        progress4 = nbt.getInt("deep_fryer.progress4");
        oilLevel = nbt.getInt("deep_fryer.oilLevel");
        isHeated = nbt.getInt("deep_fryer.isHeated");
    }

    @Override
    public void markDirty() {
        if (world != null) {
            world.updateListeners(pos, getCachedState(), getCachedState(), 3);
        }
        super.markDirty();
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable(DEEP_FRYER_NAME);
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new DeepFryerScreenHandler(syncId,playerInventory,this,this.propertyDelegate);
    }
}

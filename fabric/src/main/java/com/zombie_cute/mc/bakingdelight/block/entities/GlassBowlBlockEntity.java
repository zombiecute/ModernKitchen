package com.zombie_cute.mc.bakingdelight.block.entities;

import com.zombie_cute.mc.bakingdelight.item.ModItems;
import com.zombie_cute.mc.bakingdelight.recipe.GlassBowlRecipe;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.Optional;

public class GlassBowlBlockEntity extends BlockEntity implements ImplementedInventory, SidedInventory {
    public static final String WHISK_FAIL = "glass_bowl_message.whisk_fail";
    public GlassBowlBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.GLASS_BOWL_ENTITY, pos, state);
    }
    public final DefaultedList<ItemStack> GLASS_BOWL_INV = DefaultedList.ofSize(2, ItemStack.EMPTY);
    public void use(PlayerEntity player){
        Item offHandItem = player.getOffHandStack().getItem();
        Item mainHandItem = player.getMainHandStack().getItem();
        if(GLASS_BOWL_INV.get(0).isEmpty()){
            if (offHandItem == Items.AIR){
                GLASS_BOWL_INV.set(0, player.getMainHandStack().split(1));
                if (mainHandItem != Items.AIR){
                    player.playSound(SoundEvents.ENTITY_ITEM_PICKUP, 0.4F,1.4F);
                }
            } else {
                GLASS_BOWL_INV.set(0, player.getOffHandStack().split(1));
                player.playSound(SoundEvents.ENTITY_ITEM_PICKUP, 0.4F,1.4F);
            }
        } else {
            if (mainHandItem == ModItems.AMETHYST_WHISK||
                    mainHandItem == ModItems.WOODEN_WHISK||
                    mainHandItem == ModItems.COPPER_WHISK||
                    mainHandItem == ModItems.STONE_WHISK||
                    mainHandItem == ModItems.IRON_WHISK||
                    mainHandItem == ModItems.GOLDEN_WHISK||
                    mainHandItem == ModItems.DIAMOND_WHISK||
                    mainHandItem == ModItems.NETHERITE_WHISK) {
                if (hasRecipe()){
                    craft(player);
                    player.playSound(SoundEvents.BLOCK_ROOTED_DIRT_PLACE, 1.5F,1.5F);
                } else if (GLASS_BOWL_INV.get(0).getItem() == ModItems.CREAM) {
                    ItemScatterer.spawn(Objects.requireNonNull(this.getWorld()),this.getPos().getX(),this.getPos().getY(),this.getPos().getZ(),
                            ModItems.BUTTER.getDefaultStack());
                    ItemScatterer.spawn(Objects.requireNonNull(this.getWorld()),this.getPos().getX(),this.getPos().getY(),this.getPos().getZ(),
                            Items.BOWL.getDefaultStack());
                    GLASS_BOWL_INV.set(0, ItemStack.EMPTY);
                    player.getMainHandStack().damage(1, (LivingEntity) player, playerEntity -> playerEntity.sendToolBreakStatus(Hand.MAIN_HAND));
                    player.playSound(SoundEvents.BLOCK_ROOTED_DIRT_PLACE, 1.5F,1.5F);
                }
            } else {
                ItemScatterer.spawn(Objects.requireNonNull(this.getWorld()),this.getPos().getX(),this.getPos().getY(),this.getPos().getZ(),
                        GLASS_BOWL_INV.get(0));
                GLASS_BOWL_INV.set(0, ItemStack.EMPTY);
                player.playSound(SoundEvents.ENTITY_ITEM_PICKUP, 0.8F,0.8F);
            }
        }
        markDirty();
    }
    private void craft(PlayerEntity player){
        SimpleInventory inventory = new SimpleInventory(this.size());
        inventory.setStack(0,this.getStack(0));
        Optional<GlassBowlRecipe> match = Objects.requireNonNull(this.getWorld()).getRecipeManager()
                .getFirstMatch(GlassBowlRecipe.Type.INSTANCE, inventory,this.getWorld());
        this.setStack(1, new ItemStack(match.get().getOutput(null).getItem(),1));
        ItemScatterer.spawn(Objects.requireNonNull(this.getWorld()),this.getPos().getX(),this.getPos().getY(),this.getPos().getZ(),
                GLASS_BOWL_INV.get(1));
        GLASS_BOWL_INV.set(0, ItemStack.EMPTY);
        player.getMainHandStack().damage(1, (LivingEntity) player, playerEntity -> playerEntity.sendToolBreakStatus(Hand.MAIN_HAND));
        player.playSound(SoundEvents.BLOCK_ROOTED_DIRT_PLACE, 1.5F,1.5F);
    }
    private boolean hasRecipe() {
        SimpleInventory inventory = new SimpleInventory(this.size());
        inventory.setStack(0,this.getStack(0));
        Optional<GlassBowlRecipe> match = Objects.requireNonNull(this.getWorld()).getRecipeManager()
                .getFirstMatch(GlassBowlRecipe.Type.INSTANCE, inventory,this.getWorld());
        return match.isPresent();
    }

    public void destroy(){
        ItemScatterer.spawn(Objects.requireNonNull(this.getWorld()),this.getPos().getX(),this.getPos().getY(),this.getPos().getZ(),
                GLASS_BOWL_INV.get(0));
    }
    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, GLASS_BOWL_INV);
    }
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, GLASS_BOWL_INV);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return GLASS_BOWL_INV;
    }

    @Override
    public int[] getAvailableSlots(Direction side) {
        return new int[1];
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
        return slot == 0;
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        return slot == 0;
    }
}

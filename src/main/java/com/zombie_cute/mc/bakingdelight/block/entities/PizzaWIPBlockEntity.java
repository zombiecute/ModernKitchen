package com.zombie_cute.mc.bakingdelight.block.entities;

import com.google.common.collect.Lists;
import com.zombie_cute.mc.bakingdelight.block.ModBlockEntities;
import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.item.ModItems;
import com.zombie_cute.mc.bakingdelight.tag.ForgeTagKeys;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Objects;

import static com.zombie_cute.mc.bakingdelight.block.custom.PizzaWIPBlock.CRAFT_STATE;

public class PizzaWIPBlockEntity extends BlockEntity implements ImplementedInventory {
    public PizzaWIPBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.PIZZA_WIP_ENTITY, pos, state);
    }
    public final DefaultedList<ItemStack> PIZZA_INV = DefaultedList.ofSize(5, ItemStack.EMPTY);
    public static final String NEED_INGREDIENT = "bakingdelight.pizza_message.need_ingredient";
    public static final String NEED_CHEESE = "bakingdelight.pizza_message.need_cheese";

    @Override
    public DefaultedList<ItemStack> getItems() {
        return PIZZA_INV;
    }
    public void onUse(PlayerEntity player, BlockState state, World world) {
        Item item = player.getMainHandStack().getItem();
        int currentState = state.get(CRAFT_STATE);
        if (currentState < 5){
            if (isPizzaIngredients(item)){
                int next = currentState + 1;
                world.setBlockState(pos, state.with(CRAFT_STATE, next));
                player.getMainHandStack().split(1);
                this.setStack(currentState, item.getDefaultStack());
                playSound(SoundEvents.ENTITY_ITEM_PICKUP,1.0f, world.random.nextFloat() + 0.1f);
            } else {
                player.sendMessage(Text.translatable(NEED_INGREDIENT),true);
            }
        } else if (currentState == 5){
            if (item == ModItems.CHEESE){
                for (int i = 0;i < 5;i++){
                    this.setStack(i,ItemStack.EMPTY);
                }
                player.getMainHandStack().split(1);
                playSound(SoundEvents.BLOCK_HONEY_BLOCK_PLACE,1.0f, world.random.nextFloat() + 0.1f);
                world.setBlockState(pos, ModBlocks.RAW_PIZZA.getDefaultState());
            } else {
                player.sendMessage(Text.translatable(NEED_CHEESE), true);
            }
        }
    }
    private boolean isPizzaIngredients(@NotNull Item item) {
        ItemStack stack = item.getDefaultStack();
        ArrayList<Item> list = Lists.newArrayList();
        for (RegistryEntry<Item> registryEntry : Registries.ITEM.iterateEntries(ForgeTagKeys.PIZZA_INGREDIENTS)) {
            list.add(registryEntry.value());
        }
        return list.contains(stack.getItem());
    }
    private void playSound(SoundEvent sound, float volume, float pitch) {
        Objects.requireNonNull(world).playSound(null, pos.getX() + .5f, pos.getY() + .5f, pos.getZ() + .5f, sound, SoundCategory.BLOCKS, volume, pitch);
    }
    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, PIZZA_INV);
    }
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, PIZZA_INV);
    }
    @Override
    public void markDirty() {
        if (world != null) {
            world.updateListeners(pos, getCachedState(), getCachedState(), 3);
        }
        super.markDirty();
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return createNbt();
    }
}

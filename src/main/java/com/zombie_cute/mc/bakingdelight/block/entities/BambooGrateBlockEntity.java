package com.zombie_cute.mc.bakingdelight.block.entities;

import com.zombie_cute.mc.bakingdelight.block.ModBlockEntities;
import com.zombie_cute.mc.bakingdelight.block.custom.BambooGrateBlock;
import com.zombie_cute.mc.bakingdelight.block.entities.utils.ImplementedInventory;
import com.zombie_cute.mc.bakingdelight.screen.custom.BambooSteamerScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BambooGrateBlockEntity extends BlockEntity implements ImplementedInventory, ExtendedScreenHandlerFactory {
    public BambooGrateBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BAMBOO_GRATE_BLOCK_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index){
                    case 0 -> BambooGrateBlockEntity.this.isCovered;
                    case 1 -> BambooGrateBlockEntity.this.isHeated;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index){
                    case 0 -> BambooGrateBlockEntity.this.isCovered = value;
                    case 1 -> BambooGrateBlockEntity.this.isHeated = value;
                }
            }

            @Override
            public int size() {
                return 2;
            }
        };
    }
    public static final String NAME = "display_name.bakingdelight.steamer_name";
    public final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(16,ItemStack.EMPTY);
    private final PropertyDelegate propertyDelegate;
    private int isCovered = 0;
    private int isHeated = 0;
    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }
    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
    }
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
    }
    public NbtCompound toInitialChunkDataNbt() {
        return createNbt();
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(pos);
        buf.writeInt(player.getWorld().getBlockState(pos).get(BambooGrateBlock.LAYER));
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable(NAME);
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        if (world != null){
            return new BambooSteamerScreenHandler(syncId,playerInventory,this,world.getBlockState(pos).get(BambooGrateBlock.LAYER),propertyDelegate);
        } else return null;
    }

    public void tick(World world, BlockPos pos, BlockState state) {

    }
}

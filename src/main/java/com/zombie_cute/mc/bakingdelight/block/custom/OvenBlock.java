package com.zombie_cute.mc.bakingdelight.block.custom;

import com.zombie_cute.mc.bakingdelight.block.ModBlockEntities;
import com.zombie_cute.mc.bakingdelight.block.entities.OvenBlockEntity;
import com.zombie_cute.mc.bakingdelight.tag.ModTagKeys;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class OvenBlock extends BlockWithEntity implements BlockEntityProvider {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public static final BooleanProperty OVEN_BURNING = BooleanProperty.of("oven_burning");

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite())
                .with(OVEN_BURNING, false);
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, OVEN_BURNING);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING,rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public OvenBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new OvenBlockEntity(pos, state);
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
            if (state.getBlock() != newState.getBlock()){
                BlockEntity blockEntity = world.getBlockEntity(pos);
                if (blockEntity instanceof OvenBlockEntity){
                    if (((OvenBlockEntity) blockEntity).getExperience() != 0){
                        ExperienceOrbEntity xp =
                                new ExperienceOrbEntity(world,pos.getX(),pos.getY(),pos.getZ(),
                                        ((OvenBlockEntity) blockEntity).getExperience());
                        world.spawnEntity(xp);
                        world.updateComparators(pos,this);
                    }
                    ItemScatterer.spawn(world ,pos, (OvenBlockEntity)blockEntity);
                    world.updateComparators(pos,this);
                }
            }
            super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            if (!world.isClient){
                NamedScreenHandlerFactory screenHandlerFactory = ((OvenBlockEntity) world.getBlockEntity(pos));
                if (isCrowbar(player)){
                    if (world.getBlockEntity(pos) instanceof OvenBlockEntity container) {
                        container.onUse(state, world);
                        return ActionResult.SUCCESS;
                    }
                } else if (screenHandlerFactory != null){
                    player.openHandledScreen(screenHandlerFactory);
                }
            }
            return ActionResult.SUCCESS;
    }
    private boolean isCrowbar(PlayerEntity player) {
        Item item = player.getMainHandStack().getItem();
        List<Item> items = new ArrayList<>();
        for (RegistryEntry<Item> registryEntry: Registries.ITEM.iterateEntries(ModTagKeys.CROWBARS)){
            items.add(registryEntry.value());
        }
        return items.contains(item);
    }


    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, ModBlockEntities.OVEN_BLOCK_ENTITY,
                (world1, pos, state1, blockEntity) -> blockEntity.tick(world1, pos, state1, blockEntity));
    }
}

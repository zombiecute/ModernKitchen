package com.zombie_cute.mc.bakingdelight.block.custom;

import com.zombie_cute.mc.bakingdelight.block.entities.FreezerBlockEntity;
import com.zombie_cute.mc.bakingdelight.block.ModBlockEntities;
import com.zombie_cute.mc.bakingdelight.sound.ModSounds;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class FreezerBlock extends BlockWithEntity implements BlockEntityProvider {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public static final BooleanProperty HAS_ICE = BooleanProperty.of("has_ice");
    public static final BooleanProperty IS_OPEN = BooleanProperty.of("is_open");
    private static final VoxelShape TYPE_WEST = Block.createCuboidShape(2,0,0,15,16,16);
    private static final VoxelShape TYPE_EAST = Block.createCuboidShape(1,0,0,14,16,16);
    private static final VoxelShape TYPE_SOUTH = Block.createCuboidShape(0,0,1,16,16,14);
    private static final VoxelShape TYPE_NORTH = Block.createCuboidShape(0,0,2,16,16,15);
    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite())
                .with(HAS_ICE,false).with(IS_OPEN,false);
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING,HAS_ICE,IS_OPEN);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING,rotation.rotate(state.get(FACING)));
    }
    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    public FreezerBlock(Settings settings) {
        super(settings);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        if (direction == Direction.WEST){
            return TYPE_WEST;
        } else if (direction == Direction.EAST) {
            return TYPE_EAST;
        } else if (direction == Direction.NORTH){
            return TYPE_NORTH;
        } else {
            return TYPE_SOUTH;
        }
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        if (direction == Direction.WEST){
            return TYPE_WEST;
        } else if (direction == Direction.EAST) {
            return TYPE_EAST;
        } else if (direction == Direction.NORTH){
            return TYPE_NORTH;
        } else {
            return TYPE_SOUTH;
        }
    }
    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new FreezerBlockEntity(pos, state);
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()){
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof FreezerBlockEntity){
                ItemScatterer.spawn(world ,pos, (FreezerBlockEntity)blockEntity);
                world.updateComparators(pos,this);
            }
        }
        super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient){
            if (state.get(IS_OPEN)){
                if (player.isSneaking()){
                    world.setBlockState(pos,state.with(IS_OPEN, false));
                    Objects.requireNonNull(world).playSound(null, pos.getX() + .5f, pos.getY() + .5f, pos.getZ() + .5f, ModSounds.BLOCK_FREEZER_CLOSE, SoundCategory.BLOCKS, 1.7f, world.random.nextFloat()+0.8f);
                } else {
                    NamedScreenHandlerFactory screenHandlerFactory = ((FreezerBlockEntity) world.getBlockEntity(pos));
                    if (screenHandlerFactory != null){
                        player.openHandledScreen(screenHandlerFactory);
                    }
                }
            } else {
                world.setBlockState(pos,state.with(IS_OPEN, true));
                Objects.requireNonNull(world).playSound(null, pos.getX() + .5f, pos.getY() + .5f, pos.getZ() + .5f, ModSounds.BLOCK_FREEZER_OPEN, SoundCategory.BLOCKS, 1.0f, world.random.nextFloat()+0.8f);
            }
        }
        return ActionResult.SUCCESS;
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, ModBlockEntities.FREEZER_ENTITY,
                (world1, pos, state1, blockEntity) -> blockEntity.tick(world1, pos, state1, blockEntity));
    }
}

package com.zombie_cute.mc.bakingdelight.block.custom;

import com.zombie_cute.mc.bakingdelight.block.ModBlockEntities;
import com.zombie_cute.mc.bakingdelight.block.entities.GasPipeBlockEntity;
import com.zombie_cute.mc.bakingdelight.util.ModUtil;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.tick.OrderedTick;
import org.jetbrains.annotations.Nullable;

public class GasPipeBlock extends BlockWithEntity implements Waterloggable {
    public GasPipeBlock() {
        super(FabricBlockSettings.copyOf(Blocks.IRON_BARS));
        setDefaultState(this.getStateManager().getDefaultState()
                .with(TYPE, 0).with(INDEX, 0).with(WATERLOGGED,false));
    }
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final IntProperty TYPE = IntProperty.of("type",0,5);
    public static final IntProperty INDEX = IntProperty.of("index",0,3);
    public static final VoxelShape SHAPED = Block.createCuboidShape(0,0,0,16,2,16);
    public static final VoxelShape NORTH_SIDE = Block.createCuboidShape(0,0,0,16,16,2);
    public static final VoxelShape SOUTH_SIDE = Block.createCuboidShape(0,0,14,16,16,16);
    public static final VoxelShape EAST_SIDE = Block.createCuboidShape(14,0,0,16,16,16);
    public static final VoxelShape WEST_SIDE = Block.createCuboidShape(0,0,0,2,16,16);

    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE, INDEX, WATERLOGGED);
    }
    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        FluidState fluidState = context.getWorld().getFluidState(context.getBlockPos());
        return getDefaultState().with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
    }
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos,
                                                BlockPos posFrom) {
        if (Boolean.TRUE.equals(state.get(WATERLOGGED))) {
            world.getFluidTickScheduler().scheduleTick(OrderedTick.create(Fluids.WATER, pos));
        }
        return (direction == Direction.WEST || direction == Direction.SOUTH || direction == Direction.EAST || direction == Direction.NORTH || direction == Direction.DOWN) && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState()
                : super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }
    @Override
    public FluidState getFluidState(BlockState state) {
        return Boolean.TRUE.equals(state.get(WATERLOGGED)) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.get(TYPE) >= 4){
            return getSideVoxelShape(state);
        } else return SHAPED;
    }
    private VoxelShape getSideVoxelShape(BlockState state) {
        return switch (state.get(INDEX)){
            case 0 -> EAST_SIDE;
            case 1 -> SOUTH_SIDE;
            case 2 -> WEST_SIDE;
            case 3 -> NORTH_SIDE;
            default -> SHAPED;
        };
    }
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.get(TYPE) >= 4){
            return getSideVoxelShape(state);
        } else return SHAPED;
    }

    @Override
    public void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
        if (world.isClient){
            return;
        }
        if (ModUtil.isCrowbar(player)){
            if (state.get(TYPE) < 5){
                world.setBlockState(pos,state.with(TYPE,state.get(TYPE) + 1));
            } else {
                world.setBlockState(pos,state.with(TYPE,0));
            }
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient){
            if (ModUtil.isCrowbar(player)){
                return ActionResult.SUCCESS;
            } else return ActionResult.FAIL;
        }
        if (ModUtil.isCrowbar(player)){
            if (state.get(TYPE) == 0){
                if (state.get(INDEX) < 2){
                    world.setBlockState(pos,state.with(INDEX,state.get(INDEX) + 1));
                } else {
                    world.setBlockState(pos,state.with(INDEX,0));
                }
            } else {
                if (state.get(INDEX) < 3){
                    world.setBlockState(pos,state.with(INDEX,state.get(INDEX) + 1));
                } else {
                    world.setBlockState(pos,state.with(INDEX,0));
                }
            }
            return ActionResult.SUCCESS;
        } else return ActionResult.FAIL;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new GasPipeBlockEntity(pos,state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, ModBlockEntities.GAS_PIPE_BLOCK_ENTITY,
                (world1, pos, state1, blockEntity) -> blockEntity.tick(world1, blockEntity,state1));
    }
}

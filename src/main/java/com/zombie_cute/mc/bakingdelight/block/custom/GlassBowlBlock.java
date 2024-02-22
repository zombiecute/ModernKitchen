package com.zombie_cute.mc.bakingdelight.block.custom;

import com.zombie_cute.mc.bakingdelight.block.entities.GlassBowlBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.tick.OrderedTick;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class GlassBowlBlock extends BlockWithEntity implements Waterloggable{
    public static final BooleanProperty HAS_ITEM = BooleanProperty.of("has_item");
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public GlassBowlBlock(Settings settings) {
        super(settings);
        setDefaultState(this.getStateManager().getDefaultState().with(HAS_ITEM, false).with(WATERLOGGED,false));
    }
    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HAS_ITEM, WATERLOGGED);
    }
    private static final VoxelShape SHAPED = Block.createCuboidShape(3,0,3,13,5,13);
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPED;
    }
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPED;
    }
    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new GlassBowlBlockEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.getBlockEntity(pos) instanceof GlassBowlBlockEntity container){
            container.use(player);
            if (container.GLASS_BOWL_INV.get(0).isEmpty()){
                world.setBlockState(pos, state.with(HAS_ITEM, false));
            } else {
                world.setBlockState(pos, state.with(HAS_ITEM, true));
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.SUCCESS;
    }
    @Override
    public void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
        if (world.getBlockEntity(pos) instanceof GlassBowlBlockEntity container){
            container.destroy();
        }
        super.onBlockBreakStart(state, world, pos, player);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return Boolean.TRUE.equals(state.get(WATERLOGGED)) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
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
        return direction == Direction.DOWN && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState()
                : super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
    }

    public static void destroyGlassBowl(World world, BlockPos pos) {
        if(world.getBlockEntity(pos) instanceof GlassBowlBlockEntity container && (!container.GLASS_BOWL_INV.get(0).isEmpty())){
            ItemScatterer.spawn(Objects.requireNonNull(container.getWorld()),container.getPos().getX(),container.getPos().getY(),container.getPos().getZ(),
                    container.GLASS_BOWL_INV.get(0));
        }
        world.playSound(null, pos, SoundEvents.BLOCK_GLASS_BREAK, SoundCategory.BLOCKS, 1.4f, 1.6f + world.random.nextFloat() * 0.2f);
        world.breakBlock(pos, true);
    }
    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        if (!world.isClient && world.random.nextFloat() < fallDistance - 0.5f && entity instanceof LivingEntity && (entity instanceof PlayerEntity || world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING)) && entity.getWidth() * entity.getWidth() * entity.getHeight() > 0.512f) {
            destroyGlassBowl(world, pos);
       }
        super.onLandedUpon(world, state, pos, entity, fallDistance);
    }
}

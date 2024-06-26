package com.zombie_cute.mc.bakingdelight.block.custom;

import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.block.custom.abstracts.AbstractBatteryBlock;
import com.zombie_cute.mc.bakingdelight.block.entities.BatteryBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class IntermediateBatteryBlock extends AbstractBatteryBlock {
    public IntermediateBatteryBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected Block getBlock() {
        return ModBlocks.INTERMEDIATE_BATTERY;
    }
    public static int getMaxPower(){
        return 15000;
    }

    private static final VoxelShape SHAPED = Block.createCuboidShape(2,0,2,14,16,14);
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
        return new BatteryBlockEntity(pos,state,getMaxPower());
    }
}

package com.zombie_cute.mc.bakingdelight.block.entities;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.zombie_cute.mc.bakingdelight.block.custom.FreezerBlock.HAS_ICE;
import static com.zombie_cute.mc.bakingdelight.block.custom.OvenBlock.OVEN_BURNING;

public interface IsStateChange {
    default boolean isHeated(World world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);

        return state.get(OVEN_BURNING);
    }
    default boolean isCooling(World world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);

        return state.get(HAS_ICE);
    }

}

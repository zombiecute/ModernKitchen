package com.zombie_cute.mc.bakingdelight.block.entities;

import com.zombie_cute.mc.bakingdelight.block.ModBlockEntities;
import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.block.custom.GasCanisterBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class BurningGasCookingStoveBlockEntity extends BlockEntity {
    public BurningGasCookingStoveBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BURNING_GAS_COOKING_STOVE_BLOCK_ENTITY, pos, state);
    }
    public void tick(World world, BlockPos pos,BlockState state1) {
        if (world.isClient){
            return;
        }
        world.playSound(null, pos.getX() + .5f, pos.getY() + .5f, pos.getZ() + .5f,
                SoundEvents.BLOCK_FIRE_AMBIENT, SoundCategory.BLOCKS,
                1.0f, world.random.nextFloat()+0.5f);
        boolean hasGas = false;
        Direction[] directions = {Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.NORTH};

        for (Direction direction : directions) {
            BlockPos neighborPos = pos.offset(direction);
            BlockState neighborState = world.getBlockState(neighborPos);

            if (neighborState.getBlock() instanceof GasCanisterBlock) {
                if (neighborState.get(GasCanisterBlock.FACING) == direction.getOpposite()) {
                    BlockEntity blockEntity = world.getBlockEntity(neighborPos);
                    if (blockEntity instanceof GasCanisterBlockEntity entity && entity.getGasValue() != 0) {
                        hasGas = true;
                        entity.reduceGas();
                        break;
                    }
                }
            }
        }
        if (!hasGas){
            world.playSound(null,
                    pos.getX() + .5f, pos.getY() + .5f, pos.getZ() + .5f,
                    SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS,
                    1.0f, world.random.nextFloat()+0.5f);
            world.setBlockState(pos, ModBlocks.GAS_COOKING_STOVE.getDefaultState());
        }
    }

}

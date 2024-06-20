package com.zombie_cute.mc.bakingdelight.block.entities;

import com.zombie_cute.mc.bakingdelight.block.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GasPipeBlockEntity extends BlockEntity {
    public GasPipeBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.GAS_PIPE_BLOCK_ENTITY, pos, state);
    }
    private BlockPos inputSide;
    private BlockPos outputSide;
    public BlockPos getInputSide(){
        return this.inputSide;
    }
    public BlockPos getOutputSide(){
        return this.outputSide;
    }
    public void tick(World world, GasPipeBlockEntity blockEntity, BlockState state) {
        if (world.isClient){
            return;
        }
        if (world.getTime() %20L == 0L){

        }
    }
}

package com.zombie_cute.mc.bakingdelight.block.entities.renderer;

import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.block.custom.DeepFryerBlock;
import com.zombie_cute.mc.bakingdelight.block.entities.DeepFryerBlockEntity;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

import java.util.Objects;

public class DeepFryerBlockEntityRenderer implements BlockEntityRenderer<DeepFryerBlockEntity> {
    public DeepFryerBlockEntityRenderer(BlockEntityRendererFactory.Context context){
    }
    @Override
    public void render(DeepFryerBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        ItemStack stack = ModBlocks.DEEP_FRY_BASKET.asItem().getDefaultStack();
        Direction direction;
        if (entity.getWorld() == null||
                entity.getPos()==null||
                entity.getWorld().getBlockState(entity.getPos())==null||
                entity.getWorld().getBlockState(entity.getPos()).getBlock() == Blocks.AIR
        ){
            return;
        }
        direction = Objects.requireNonNull(entity.getWorld()).getBlockState(entity.getPos()).get(DeepFryerBlock.FACING);
        matrices.push();
        matrices.translate(0.5f, 0.4f,0.5f);
        matrices.scale(2,2,2);
        switch (direction){
            case EAST:  {matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));break;}
            case SOUTH:   {matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90));break;}
            case WEST:  {matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(0));break;}
            case NORTH:  {matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(270));break;}
        }
        itemRenderer.renderItem(stack, ModelTransformationMode.GROUND,
                getLightLevel(Objects.requireNonNull(entity.getWorld()),entity.getPos()),
                OverlayTexture.DEFAULT_UV, matrices, vertexConsumers,entity.getWorld(),1);
        matrices.pop();
    }
    private int getLightLevel(World world, BlockPos pos){
        int blockLight = world.getLightLevel(LightType.BLOCK, pos);
        int skyLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(blockLight,skyLight);
    }
}

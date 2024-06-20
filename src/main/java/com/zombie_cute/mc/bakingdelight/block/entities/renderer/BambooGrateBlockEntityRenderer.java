package com.zombie_cute.mc.bakingdelight.block.entities.renderer;

import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.block.custom.BambooGrateBlock;
import com.zombie_cute.mc.bakingdelight.block.entities.BambooGrateBlockEntity;
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
import net.minecraft.world.LightType;
import net.minecraft.world.World;

import java.util.Objects;

public class BambooGrateBlockEntityRenderer implements BlockEntityRenderer<BambooGrateBlockEntity> {
    public BambooGrateBlockEntityRenderer(BlockEntityRendererFactory.Context context){
    }
    @Override
    public void render(BambooGrateBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        ItemStack stack = ModBlocks.BAMBOO_COVER.asItem().getDefaultStack();
        int layer = entity.getCachedState().get(BambooGrateBlock.LAYER);
        boolean covered = entity.getCachedState().get(BambooGrateBlock.COVERED);
        if (covered){
            matrices.push();
            switch (layer){
                case 1 -> matrices.translate(0.5f, 0.5f,0.5f);
                case 2 -> matrices.translate(0.5f, 0.75f,0.5f);
                case 3 -> matrices.translate(0.5f, 1.0f,0.5f);
                case 4 -> matrices.translate(0.5f, 1.25f,0.5f);
            }
            matrices.scale(2,2,2);
            itemRenderer.renderItem(stack, ModelTransformationMode.GROUND,
                    getLightLevel(Objects.requireNonNull(entity.getWorld()),entity.getPos()),
                    OverlayTexture.DEFAULT_UV, matrices, vertexConsumers,entity.getWorld(),1);
            matrices.pop();
        }
    }
    private int getLightLevel(World world, BlockPos pos){
        int blockLight = world.getLightLevel(LightType.BLOCK, pos);
        int skyLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(blockLight,skyLight);
    }
}

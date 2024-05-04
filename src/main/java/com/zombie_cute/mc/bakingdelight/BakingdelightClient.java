package com.zombie_cute.mc.bakingdelight;

import com.zombie_cute.mc.bakingdelight.block.ModBlockEntities;
import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.block.entities.renderer.*;
import com.zombie_cute.mc.bakingdelight.entity.ModEntities;
import com.zombie_cute.mc.bakingdelight.fluid.ModFluid;
import com.zombie_cute.mc.bakingdelight.screen.*;
import com.zombie_cute.mc.bakingdelight.screen.custom.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.util.Identifier;

public class BakingdelightClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_BOWL, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_PEPPER_CROP, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.BUTTER, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.CHERRY_BOMB, FlyingItemEntityRenderer::new);

        HandledScreens.register(ModScreenHandlers.OVEN_SCREEN_HANDLER, OvenScreen::new);
        HandledScreens.register(ModScreenHandlers.FREEZER_SCREEN_HANDLER, FreezerScreen::new);
        HandledScreens.register(ModScreenHandlers.ADVANCE_FURNACE_SCREEN_HANDLER, AdvanceFurnaceScreen::new);
        HandledScreens.register(ModScreenHandlers.WOODEN_BASIN_SCREEN_HANDLER, WoodenBasinScreen::new);
        HandledScreens.register(ModScreenHandlers.GAS_CANISTER_SCREEN_HANDLER, GasCanisterScreen::new);
        HandledScreens.register(ModScreenHandlers.BIOGAS_DIGESTER_CONTROLLER_SCREEN_HANDLER, BiogasDigesterControllerScreen::new);
        HandledScreens.register(ModScreenHandlers.BIOGAS_DIGESTER_IO_SCREEN_HANDLER, BiogasDigesterIOScreen::new);
        HandledScreens.register(ModScreenHandlers.DEEP_FRYER_SCREEN_HANDLER, DeepFryerScreen::new);

        BlockEntityRendererFactories.register(ModBlockEntities.GLASS_BOWL_ENTITY, GlassBowlBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.FREEZER_ENTITY, FreezerBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.BAKING_TRAY_BLOCK_ENTITY, BakingTrayBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.WOODEN_BASIN_BLOCK_ENTITY, WoodenBasinBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.DEEP_FRYER_BLOCK_ENTITY, DeepFryerBlockEntityRenderer::new);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluid.STILL_CREAM, ModFluid.FLOWING_CREAM,
                new SimpleFluidRenderHandler(
                new Identifier(Bakingdelight.MOD_ID,"block/cream_still"),
                new Identifier(Bakingdelight.MOD_ID,"block/cream_flow")
        ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getSolid(),
                ModFluid.STILL_CREAM, ModFluid.FLOWING_CREAM);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluid.STILL_VEGETABLE_OIL, ModFluid.FLOWING_VEGETABLE_OIL,
                new SimpleFluidRenderHandler(
                        new Identifier(Bakingdelight.MOD_ID,"block/vegetable_oil_still"),
                        new Identifier(Bakingdelight.MOD_ID,"block/vegetable_oil_flow")
                ));
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluid.STILL_VEGETABLE_OIL, ModFluid.FLOWING_VEGETABLE_OIL);
    }
}
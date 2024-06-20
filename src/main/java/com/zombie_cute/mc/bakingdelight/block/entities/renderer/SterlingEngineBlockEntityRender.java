package com.zombie_cute.mc.bakingdelight.block.entities.renderer;

import com.zombie_cute.mc.bakingdelight.block.entities.SterlingEngineBlockEntity;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class SterlingEngineBlockEntityRender extends GeoBlockRenderer<SterlingEngineBlockEntity> {
    public SterlingEngineBlockEntityRender(BlockEntityRendererFactory.Context context) {
        super(new SterlingEngineBlockEntityModel());
    }

}

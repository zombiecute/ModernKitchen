package com.zombie_cute.mc.bakingdelight.compat;

import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.compat.freezer.FreezerCategory;
import com.zombie_cute.mc.bakingdelight.compat.freezer.FreezerDisplay;
import com.zombie_cute.mc.bakingdelight.compat.glass_bowl.GlassBowlCategory;
import com.zombie_cute.mc.bakingdelight.compat.glass_bowl.GlassBowlDisplay;
import com.zombie_cute.mc.bakingdelight.compat.oven.OvenBakingCategory;
import com.zombie_cute.mc.bakingdelight.compat.oven.OvenBakingDisplay;
import com.zombie_cute.mc.bakingdelight.recipe.FreezerRecipe;
import com.zombie_cute.mc.bakingdelight.recipe.GlassBowlRecipe;
import com.zombie_cute.mc.bakingdelight.recipe.OvenRecipe;
import com.zombie_cute.mc.bakingdelight.screen.FreezerScreen;
import com.zombie_cute.mc.bakingdelight.screen.OvenScreen;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;

public class BakingDelightREIClientPlugin implements REIClientPlugin {
    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(
                new OvenBakingCategory(),
                new FreezerCategory(),
                new GlassBowlCategory()
        );
        registry.addWorkstations(OvenBakingCategory.OVEN_BAKING, EntryStacks.of(ModBlocks.OVEN));
        registry.addWorkstations(FreezerCategory.FREEZING, EntryStacks.of(ModBlocks.FREEZER));
        registry.addWorkstations(GlassBowlCategory.WHISKING, EntryStacks.of(ModBlocks.GLASS_BOWL));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(OvenRecipe.class, OvenRecipe.Type.INSTANCE, OvenBakingDisplay::new);
        registry.registerRecipeFiller(FreezerRecipe.class, FreezerRecipe.Type.INSTANCE, FreezerDisplay::new);
        registry.registerRecipeFiller(GlassBowlRecipe.class, GlassBowlRecipe.Type.INSTANCE, GlassBowlDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(221,68, 25,20), OvenScreen.class,
                OvenBakingCategory.OVEN_BAKING);
        registry.registerClickArea(screen -> new Rectangle(279,82, 12,16), FreezerScreen.class,
                FreezerCategory.FREEZING);
    }
}

package com.zombie_cute.mc.bakingdelight.compat;

import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.compat.freezer.FreezerFreezingCategory;
import com.zombie_cute.mc.bakingdelight.compat.freezer.FreezerFreezingDisplay;
import com.zombie_cute.mc.bakingdelight.compat.glass_bowl.GlassBowlMixWithWaterCategory;
import com.zombie_cute.mc.bakingdelight.compat.glass_bowl.GlassBowlMixWithWaterDisplay;
import com.zombie_cute.mc.bakingdelight.compat.glass_bowl.GlassBowlWhiskingCategory;
import com.zombie_cute.mc.bakingdelight.compat.glass_bowl.GlassBowlWhiskingDisplay;
import com.zombie_cute.mc.bakingdelight.compat.oven.OvenBakingCategory;
import com.zombie_cute.mc.bakingdelight.compat.oven.OvenBakingDisplay;
import com.zombie_cute.mc.bakingdelight.compat.pizza.PizzaMakingCategory;
import com.zombie_cute.mc.bakingdelight.compat.pizza.PizzaMakingDisplay;
import com.zombie_cute.mc.bakingdelight.recipe.BakingRecipe;
import com.zombie_cute.mc.bakingdelight.recipe.FreezingRecipe;
import com.zombie_cute.mc.bakingdelight.recipe.MixWithWaterRecipe;
import com.zombie_cute.mc.bakingdelight.recipe.WhiskingRecipe;
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
                new FreezerFreezingCategory(),
                new GlassBowlWhiskingCategory(),
                new GlassBowlMixWithWaterCategory(),
                new PizzaMakingCategory()
        );
        registry.addWorkstations(OvenBakingCategory.OVEN_BAKING, EntryStacks.of(ModBlocks.OVEN));
        registry.addWorkstations(FreezerFreezingCategory.FREEZING, EntryStacks.of(ModBlocks.FREEZER));
        registry.addWorkstations(GlassBowlWhiskingCategory.WHISKING, EntryStacks.of(ModBlocks.GLASS_BOWL));
        registry.addWorkstations(GlassBowlMixWithWaterCategory.MIX_WITH_WATER, EntryStacks.of(ModBlocks.GLASS_BOWL));

    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(BakingRecipe.class, BakingRecipe.Type.INSTANCE, OvenBakingDisplay::new);
        registry.registerRecipeFiller(FreezingRecipe.class, FreezingRecipe.Type.INSTANCE, FreezerFreezingDisplay::new);
        registry.registerRecipeFiller(WhiskingRecipe.class, WhiskingRecipe.Type.INSTANCE, GlassBowlWhiskingDisplay::new);
        registry.registerRecipeFiller(MixWithWaterRecipe.class, MixWithWaterRecipe.Type.INSTANCE, GlassBowlMixWithWaterDisplay::new);
        registry.add(new PizzaMakingDisplay());
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(226,68, 25,20), OvenScreen.class,
                OvenBakingCategory.OVEN_BAKING);
        registry.registerClickArea(screen -> new Rectangle(279,84, 12,16), FreezerScreen.class,
                FreezerFreezingCategory.FREEZING);
    }
}

package com.zombie_cute.mc.bakingdelight.recipe;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Bakingdelight.MOD_ID, OvenRecipe.Serializer.ID),
                OvenRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Bakingdelight.MOD_ID, OvenRecipe.Type.ID),
                OvenRecipe.Type.INSTANCE);
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Bakingdelight.MOD_ID, GlassBowlRecipe.Serializer.ID),
                GlassBowlRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Bakingdelight.MOD_ID, GlassBowlRecipe.Type.ID),
                GlassBowlRecipe.Type.INSTANCE);
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Bakingdelight.MOD_ID, FreezerRecipe.Serializer.ID),
                FreezerRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Bakingdelight.MOD_ID, FreezerRecipe.Type.ID),
                FreezerRecipe.Type.INSTANCE);
    }
}

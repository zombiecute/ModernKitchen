package com.zombie_cute.mc.bakingdelight.util;

import com.zombie_cute.mc.bakingdelight.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuels {
    public static void registerFuels(){
        FuelRegistry.INSTANCE.add(ModItems.WOODEN_WHISK, 200);
        FuelRegistry.INSTANCE.add(ModItems.KNEADING_STICK, 200);
        FuelRegistry.INSTANCE.add(ModItems.SUNFLOWER_SEED_PEEL, 20);

    }
}

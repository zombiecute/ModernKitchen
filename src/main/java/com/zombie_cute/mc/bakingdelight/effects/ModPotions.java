package com.zombie_cute.mc.bakingdelight.effects;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {



    public static Potion registerPotions(String name, Potion potion){
        return Registry.register(Registries.POTION, new Identifier(Bakingdelight.MOD_ID,name),potion);
    }
    public static void registerModPotions(){
        Bakingdelight.LOGGER.info("Registering Mod Potions for " + Bakingdelight.MOD_ID);
    }
}

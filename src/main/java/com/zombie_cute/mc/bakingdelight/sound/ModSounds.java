package com.zombie_cute.mc.bakingdelight.sound;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent ENTITY_BUTTER_HIT = registerSound("entity_butter_hit");
    public static final SoundEvent ENTITY_BUTTER_SHOOT = registerSound("entity_butter_shoot");
    public static final SoundEvent ENTITY_CHERRY_BOMB_EXPLOSION = registerSound("entity_cherry_bomb_explosion");
    public static final SoundEvent ENTITY_CHERRY_BOMB_SHOOT = registerSound("entity_cherry_bomb_shoot");
    public static final SoundEvent BLOCK_FREEZER_RUNNING = registerSound("block_freezer_running");
    public static final SoundEvent BLOCK_FREEZER_OPEN = registerSound("block_freezer_open");
    public static final SoundEvent BLOCK_GLASS_BOWL_WHISKING = registerSound("block_glass_bowl_whisking");
    public static SoundEvent registerSound(String name){
        Identifier id = new Identifier(Bakingdelight.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerModSounds(){
        Bakingdelight.LOGGER.info("Registering Mod Sounds for " + Bakingdelight.MOD_ID);
    }
}

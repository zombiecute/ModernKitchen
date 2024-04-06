package com.zombie_cute.mc.bakingdelight.tag;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTagKeys {
    public static final TagKey<Item> WHISKS = create("whisks", RegistryKeys.ITEM);
    public static final TagKey<Item> AMETHYST_TOOLS = create("amethyst_tools", RegistryKeys.ITEM);
    public static final TagKey<Item> KNEADING_STICKS = create("kneading_sticks", RegistryKeys.ITEM);
    public static final TagKey<Block> WHISK_MINEABLE = create("whisk_mineable", RegistryKeys.BLOCK);
    private static <E> TagKey<E> create(String pathName, RegistryKey<? extends Registry<E>> registry) {
        return TagKey.of(registry, new Identifier(Bakingdelight.MOD_ID, pathName));
    }
}

package com.zombie_cute.mc.bakingdelight.tag;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
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
    public static final TagKey<Item> FLAT_ON_BAKING_TRAY = create("flat_on_baking_tray", RegistryKeys.ITEM);
    public static final TagKey<Block> CROWBAR_DESTROYABLE = create("crowbar_destroyable", RegistryKeys.BLOCK);
    public static final TagKey<Item> CROWBARS = create("crowbars",RegistryKeys.ITEM);
    public static final TagKey<Item> SPATULAS = create("spatulas",RegistryKeys.ITEM);
    public static final TagKey<Block> DANGER_BLOCKS =create("danger_blocks",RegistryKeys.BLOCK);
    public static final TagKey<Item> OIL_PLANTS = create("oil_plants",RegistryKeys.ITEM);
    public static final TagKey<Item> FILTERS = create("filters",RegistryKeys.ITEM);
    public static final TagKey<Fluid> OIL = create("oil",RegistryKeys.FLUID);


    private static <E> TagKey<E> create(String pathName, RegistryKey<? extends Registry<E>> registry) {
        return TagKey.of(registry, new Identifier(Bakingdelight.MOD_ID, pathName));
    }
}

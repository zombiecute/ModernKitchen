package com.zombie_cute.mc.bakingdelight.tag;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ForgeTagKeys {
    public static final TagKey<Item> FOODS = forgeItemTag("foods");
        public static final TagKey<Item> TRUFFLES = forgeItemTag("foods/truffles");
        public static final TagKey<Item> PUDDINGS = forgeItemTag("foods/puddings");
        public static final TagKey<Item> FLOURS = forgeItemTag("foods/flours");
        public static final TagKey<Item> DOUGHS = forgeItemTag("foods/doughs");
            public static final TagKey<Item> DOUGH_WHEAT = forgeItemTag("foods/doughs/wheat");
        public static final TagKey<Item> CREAMS = forgeItemTag("foods/creams");
        public static final TagKey<Item> MOUSSES = forgeItemTag("foods/mousses");
        public static final TagKey<Item> RAW_FISHES = forgeItemTag("foods/raw_fishes");
            public static final TagKey<Item> PRAWNS = forgeItemTag("foods/raw_fishes/prawns");
            public static final TagKey<Item> SQUIDS = forgeItemTag("foods/raw_fishes/squids");
        public static final TagKey<Item> CUTTLEBONES = forgeItemTag("foods/cuttlebones");
        public static final TagKey<Item> SAUSAGES = forgeItemTag("foods/sausages");
        public static final TagKey<Item> BREADS = forgeItemTag("foods/breads");
            public static final TagKey<Item> BREAD_WHEAT = forgeItemTag("foods/breads/wheat");
        public static final TagKey<Item> PIZZA_INGREDIENTS = forgeItemTag("foods/pizza_ingredients");
        public static final TagKey<Item> PUMPKINS = forgeItemTag("foods/pumpkins");
    public static final TagKey<Item> TOOLS = forgeItemTag("tools");
        public static final TagKey<Item> TOOLS_HOES = forgeItemTag("hoes");
        public static final TagKey<Item> TOOLS_SWORDS = forgeItemTag("swords");
        public static final TagKey<Item> TOOLS_SHOVELS = forgeItemTag("shovels");
        public static final TagKey<Item> TOOLS_PICKAXES = forgeItemTag("pickaxes");
        public static final TagKey<Item> TOOLS_AXES = forgeItemTag("axes");
        public static final TagKey<Item> TOOLS_KNIVES = forgeItemTag("tools/knives");
    public static final TagKey<Item> COLD_ITEMS = forgeItemTag("cold_items");
    public static final TagKey<Item> SEEDS = forgeItemTag("seeds");
        public static final TagKey<Item> SEED_BLACK_PEPPERS = forgeItemTag("seeds/lack_peppers");
    public static final TagKey<Item> CROPS = forgeItemTag("crops");
        public static final TagKey<Item> CROP_BLACK_PEPPER = forgeItemTag("crops/black_peppers");
    private static TagKey<Block> forgeBlockTag(String path) {
        // Change namespace to 'c'. Porting Lib does this too.
        return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", path));
    }
    private static TagKey<Item> forgeItemTag(String path) {
        // Change namespace to 'c'. Porting Lib does this too.
        return TagKey.of(RegistryKeys.ITEM, new Identifier("c", path));
    }
}

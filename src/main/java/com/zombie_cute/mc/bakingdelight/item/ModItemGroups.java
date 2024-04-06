package com.zombie_cute.mc.bakingdelight.item;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final String GROUPS_TAB_NAME = "itemgroup.bakingdelight";
    public static final ItemGroup ITEM_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(Bakingdelight.MOD_ID,"bakingdelight_itemgroup"),
            FabricItemGroup.builder().displayName(Text.translatable(GROUPS_TAB_NAME))
                    .icon(()->new ItemStack(ModBlocks.GLASS_BOWL))
                    .entries((displayContext, entries) -> {
                        // Whisks
                        entries.add(ModItems.WOODEN_WHISK);
                        entries.add(ModItems.STONE_WHISK);
                        entries.add(ModItems.COPPER_WHISK);
                        entries.add(ModItems.IRON_WHISK);
                        entries.add(ModItems.GOLDEN_WHISK);
                        entries.add(ModItems.DIAMOND_WHISK);
                        entries.add(ModItems.NETHERITE_WHISK);
                        entries.add(ModItems.AMETHYST_WHISK);
                        // Amethyst Tools
                        entries.add(ModItems.AMETHYST_SWORD);
                        entries.add(ModItems.AMETHYST_PICKAXE);
                        entries.add(ModItems.AMETHYST_AXE);
                        entries.add(ModItems.AMETHYST_SHOVEL);
                        entries.add(ModItems.AMETHYST_HOE);
                        // Knifes
                        entries.add(ModItems.AMETHYST_KNIFE);
                        entries.add(ModItems.COPPER_KNIFE);
                        // Other Tools
                        entries.add(ModItems.KNEADING_STICK);
                        // Place Able Ingredients
                        entries.add(ModBlocks.WHEAT_DOUGH);
                        entries.add(ModBlocks.PIZZA_WIP);
                        entries.add(ModBlocks.RAW_PIZZA);
                        entries.add(ModBlocks.PIZZA);
                        // Craft Station
                        entries.add(ModBlocks.GLASS_BOWL);
                        entries.add(ModBlocks.OVEN);
                        entries.add(ModBlocks.FREEZER);
                        // Ingredients
                        entries.add(ModItems.ICE_BRICK);
                        // Truffles
                        entries.add(ModItems.BLACK_TRUFFLE);
                        entries.add(ModItems.WHITE_TRUFFLE);
                        // Black Pepper
                        entries.add(ModItems.BLACK_PEPPER_CORN);
                        entries.add(ModItems.BLACK_PEPPER_DUST);
                        // Starch
                        entries.add(ModItems.POTATO_STARCH);
                        entries.add(ModItems.WHEAT_FLOUR);
                        entries.add(ModItems.MIXED_DOUGH);
                        // Potato
                        entries.add(ModItems.MASHED_POTATO);
                        entries.add(ModItems.SAUCE_MASHED_POTATO);
                        entries.add(ModBlocks.MASHED_POTATO_BLOCK);
                        // Snacks
                        entries.add(ModItems.APPLE_PETAL);
                        entries.add(ModItems.CHERRY);
                        entries.add(ModItems.CHERRY_BOMB);
                        entries.add(ModItems.BUTTER);
                        entries.add(ModItems.CHEESE);
                        entries.add(ModItems.EGG_TART);
                        entries.add(ModItems.TRUFFLE_EGG_TART);
                        entries.add(ModItems.BRAISED_SHRIMP_BALL);
                        entries.add(ModItems.SUNFLOWER_SEED);
                        entries.add(ModItems.SUNFLOWER_SEED_PEEL);
                        // Puddings
                        entries.add(ModItems.PUDDING_WIP_1);
                        entries.add(ModItems.PUDDING_WIP_2);
                        entries.add(ModItems.APPLE_PUDDING);
                        entries.add(ModItems.MATCHA_PUDDING);
                        // Bread
                        entries.add(ModItems.BREAD_SLICE);
                        entries.add(ModItems.BUTTER_BREAD_SLICE);
                        // Creams
                        entries.add(ModItems.CREAM_BUCKET);
                        entries.add(ModItems.CREAM);
                        entries.add(ModItems.APPLE_CREAM);
                        entries.add(ModItems.CHERRY_CREAM);
                        entries.add(ModItems.CHOCOLATE_CREAM);
                        entries.add(ModItems.GOLDEN_APPLE_CREAM);
                        entries.add(ModItems.MATCHA_CREAM);
                        entries.add(ModItems.PUMPKIN_CREAM);
                        // Mousses
                        entries.add(ModItems.MOUSSE_WIP);
                        entries.add(ModItems.CREAM_MOUSSE);
                        entries.add(ModItems.CHERRY_MOUSSE);
                        entries.add(ModItems.CHOCOLATE_MOUSSE);
                        entries.add(ModItems.PUMPKIN_MOUSSE);
                        entries.add(ModItems.GOLDEN_APPLE_MOUSSE);
                        entries.add(ModItems.MATCHA_MOUSSE);
                        // Dumplings
                        entries.add(ModItems.CRYSTAL_DUMPLING);
                        // Squid
                        entries.add(ModItems.PRAWN);
                        entries.add(ModItems.SQUID);
                        entries.add(ModItems.ROASTED_SQUID);
                        entries.add(ModItems.CUTTLEBONE);
                        entries.add(ModItems.GLOW_SQUID);
                        entries.add(ModItems.ROASTED_GLOW_SQUID);
                        entries.add(ModItems.GLOW_CUTTLEBONE);
                        // Sausages
                        entries.add(ModItems.SAUSAGE);
                        entries.add(ModItems.SECTIONED_SAUSAGE);
                        entries.add(ModItems.GRILLED_SAUSAGE);
                        entries.add(ModItems.STARCH_SAUSAGE);
                        entries.add(ModItems.GRILLED_STARCH_SAUSAGE);
                        entries.add(ModItems.LITTLE_OCTOPUS_SAUSAGE);
                    }).build());
    public static void registerItemGroup(){
        Bakingdelight.LOGGER.info("Registering Item Group for " + Bakingdelight.MOD_ID);
    }
}

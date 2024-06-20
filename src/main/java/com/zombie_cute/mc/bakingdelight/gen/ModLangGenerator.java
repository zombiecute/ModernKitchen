package com.zombie_cute.mc.bakingdelight.gen;

import com.zombie_cute.mc.bakingdelight.BakingdelightClient;
import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.block.custom.BoxedCherriesBlock;
import com.zombie_cute.mc.bakingdelight.block.custom.FreezerBlock;
import com.zombie_cute.mc.bakingdelight.block.custom.abstracts.AbstractBatteryBlock;
import com.zombie_cute.mc.bakingdelight.block.entities.*;
import com.zombie_cute.mc.bakingdelight.compat.rei.baking_tray.BakingTrayCategory;
import com.zombie_cute.mc.bakingdelight.compat.rei.biogas_fermentation.BiogasFermentationCategory;
import com.zombie_cute.mc.bakingdelight.compat.rei.glass_bowl.GlassBowlMixWithWaterCategory;
import com.zombie_cute.mc.bakingdelight.compat.rei.glass_bowl.GlassBowlWhiskingCategory;
import com.zombie_cute.mc.bakingdelight.compat.rei.pizza.PizzaMakingCategory;
import com.zombie_cute.mc.bakingdelight.compat.rei.transform.OvenTransformCategory;
import com.zombie_cute.mc.bakingdelight.effects.ModEffectsAndPotions;
import com.zombie_cute.mc.bakingdelight.entity.ModEntities;
import com.zombie_cute.mc.bakingdelight.item.ModItemGroups;
import com.zombie_cute.mc.bakingdelight.item.ModItems;
import com.zombie_cute.mc.bakingdelight.screen.custom.*;
import com.zombie_cute.mc.bakingdelight.util.ModUtil;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModLangGenerator extends FabricLanguageProvider {
    public ModLangGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModUtil.SHIFT_FRONT, "Hold ");
        translationBuilder.add(ModUtil.SHIFT_END, " to view summary");
        translationBuilder.add(ModUtil.WHISK_1, "A whisk that can be used to mix ingredients,");
        translationBuilder.add(ModUtil.WHISK_2, "or... whisk the brains of monsters?");
        translationBuilder.add(ModUtil.BUTTER_1, "Sticky texture...Maybe it's used ");
        translationBuilder.add(ModUtil.BUTTER_2, "for something other than food");
        translationBuilder.add(ModUtil.TRUFFLE, "It can be found in podzol");
        translationBuilder.add(ModUtil.CUTTLEBONE, "It can be dropped when a squid killed by an amethyst tool");
        translationBuilder.add(ModUtil.FILTER_1, "A filter made of string that can be placed");
        translationBuilder.add(ModUtil.FILTER_2, "in a wooden basin to filter oil and slags");
        translationBuilder.add(ModUtil.KNEADING_STICK, "It beats and kneads people");
        translationBuilder.add(ModUtil.SPATULA, "It can be used with a heated tray to stir-fry foods");
        translationBuilder.add(ModUtil.BDC_1, "It is the core component that makes up the biogas digester,");
        translationBuilder.add(ModUtil.BDC_2, "and when a flat and completely sealed cuboid area exists underneath it,");
        translationBuilder.add(ModUtil.BDC_3, "it will automatically recognize this area as the digester.");
        translationBuilder.add(ModUtil.BDI_1, "It will be activated when it is a working biogas digester controller");
        translationBuilder.add(ModUtil.BDI_2, "underneath it, at which point you just need to fill it with any food");
        translationBuilder.add(ModUtil.BDI_3, "to start fermenting it to produce biogas. If a gas canister attached to");
        translationBuilder.add(ModUtil.BDI_4, "the side of it, it will allow you to fill the gas canister with biogas.");
        translationBuilder.add(ModUtil.GAS_COOKING_STOVE_1, "When it is flanked by a gas canister containing gas, right-click to activate it,");
        translationBuilder.add(ModUtil.GAS_COOKING_STOVE_2, "and when activated, it can heat up the block above it, including baking tray,");
        translationBuilder.add(ModUtil.GAS_COOKING_STOVE_3, "oven, and advance furnace, all of which are compatible.");
        translationBuilder.add(ModUtil.CROWBAR, "The Holy Sword of Physics");
        translationBuilder.add(ModUtil.PIZZA_INGREDIENTS, "Ingredients: ");
        translationBuilder.add(ModUtil.BAKING_TRAY_1, "A small, easy-to-use iron plate that can be used for upgrading an Advanced Furnace");
        translationBuilder.add(ModUtil.BAKING_TRAY_2, "or for stir-frying: with a Gas Cooking Stove underneath it to heat it up, ");
        translationBuilder.add(ModUtil.BAKING_TRAY_3, "place the food on top of it and use a spatula to stir-fry it five times to cook the food.");
        translationBuilder.add(ModUtil.DEEP_FRYER_1, "A deep fryer can be used to deep fry a variety of foods. Pour in cooking oil and it will start to consume the gas and heat up,");
        translationBuilder.add(ModUtil.DEEP_FRYER_2, "place a Gas Canister at the back of the fryer, then press the button on the front of the fryer,");
        translationBuilder.add(ModUtil.DEEP_FRYER_3, "then add the food to it to start frying, hold down Shift and right-click on the fryer to check its detailed status.");
        translationBuilder.add(ModUtil.WOODEN_BASIN_1, "A Wooden Basin that can be used to extract vegetable oil, put in an oil crop");
        translationBuilder.add(ModUtil.WOODEN_BASIN_2, "(e.g. stir-fried sunflower seeds) and a filter, then stand on it and jump to extract the oil,");
        translationBuilder.add(ModUtil.WOODEN_BASIN_3, "you can use a glass bottle or a bucket to take out the oil.");
        translationBuilder.add(ModUtil.DFB, "For safe and harmless removal of the contents of the Deep Fryer");


        translationBuilder.add(AdvanceFurnaceScreen.TOOLTIP,"Click to gain experiences");

        translationBuilder.add(GlassBowlBlockEntity.WHISK_FAIL, "This thing doesn't seem to be able to be handled by the whisk.");
        translationBuilder.add(GlassBowlBlockEntity.NEED_BOWL, "You need a bowl to take out this item.");
        translationBuilder.add(PizzaWIPBlockEntity.NEED_INGREDIENT, "You need to put a proper ingredient here.");
        translationBuilder.add(PizzaWIPBlockEntity.NEED_CHEESE, "You need to put a cheese here.");
        translationBuilder.add(FreezerBlock.FAIL_TO_OPEN, "The freezer door is blocked by a block.");

        translationBuilder.add(ModItems.WOODEN_WHISK, "Wooden Whisk");
        translationBuilder.add(ModItems.STONE_WHISK, "Stone Whisk");
        translationBuilder.add(ModItems.COPPER_WHISK, "Copper Whisk");
        translationBuilder.add(ModItems.IRON_WHISK, "Iron Whisk");
        translationBuilder.add(ModItems.GOLDEN_WHISK, "Golden Whisk");
        translationBuilder.add(ModItems.AMETHYST_WHISK, "Amethyst Whisk");
        translationBuilder.add(ModItems.DIAMOND_WHISK, "Diamond Whisk");
        translationBuilder.add(ModItems.NETHERITE_WHISK, "Netherite Whisk");

        translationBuilder.add(ModItems.COPPER_KNIFE, "Copper Knife");
        translationBuilder.add(ModItems.AMETHYST_KNIFE, "Amethyst Knife");

        translationBuilder.add(ModItems.KNEADING_STICK, "Kneading Stick");
        translationBuilder.add(ModItems.CROWBAR, "Crowbar");
        translationBuilder.add(ModItems.SPATULA, "Spatula");
        translationBuilder.add(ModItems.FILTER, "Filter");


        translationBuilder.add(ModItems.EGG_TART, "Egg Tart");
        translationBuilder.add(ModItems.APPLE_PUDDING, "Apple Pudding");
        translationBuilder.add(ModItems.BRAISED_SHRIMP_BALL, "Braised Shrimp Ball");
        translationBuilder.add(ModItems.MATCHA_PUDDING, "Matcha Pudding");
        translationBuilder.add(ModItems.SUNFLOWER_SEED, "Sunflower Seed");
        translationBuilder.add(ModItems.SUNFLOWER_SEED_PEEL, "Sunflower Seed Peel");
        translationBuilder.add(ModItems.SUNFLOWER_SEED_PULP, "Sunflower Seed Pulp");
        translationBuilder.add(ModItems.ROASTED_SUNFLOWER_SEED, "Stir-fried Sunflower Seed");
        translationBuilder.add(ModItems.OIL_IMPURITY, "Oil Slag");
        translationBuilder.add(ModItems.VEGETABLE_OIL_BOTTLE, "Vegetable Oil Bottle");
        translationBuilder.add(ModItems.VEGETABLE_OIL_BUCKET, "Vegetable Oil Bucket");

        translationBuilder.add(ModItems.TRUFFLE_EGG_TART, "Truffle Egg Tart");
        translationBuilder.add(ModItems.PUDDING_WIP_1, "Pudding (Work In Progress)");
        translationBuilder.add(ModItems.PUDDING_WIP_2, "Pudding (Work In Progress)");

        translationBuilder.add(ModItems.POTATO_STARCH, "Potato Starch");
        translationBuilder.add(ModItems.MIXED_DOUGH, "Mixed Dough");
        translationBuilder.add(ModItems.WHEAT_FLOUR, "Wheat Flour");
        translationBuilder.add(ModBlocks.WHEAT_DOUGH, "Wheat Dough");

        translationBuilder.add(ModItems.BLACK_PEPPER_CORN, "Black Pepper Corn");
        translationBuilder.add(ModItems.BLACK_PEPPER_DUST, "Black Pepper Dust");

        translationBuilder.add(ModItems.MASHED_POTATO, "Mashed Potato");
        translationBuilder.add(ModItems.SAUCE_MASHED_POTATO, "Mashed Potatoes with Sauce");
        translationBuilder.add(ModBlocks.MASHED_POTATO_BLOCK, "Block of Mashed Potato");

        translationBuilder.add(ModItems.APPLE_PETAL, "Apple Petal");
        translationBuilder.add(ModItems.CHERRY, "Cherry");
        translationBuilder.add(ModItems.CHERRY_BOMB, "Cherry");
        translationBuilder.add(ModItems.BUTTER, "Butter");
        translationBuilder.add(ModItems.CHEESE, "Cheese");

        translationBuilder.add(ModItems.BREAD_SLICE, "Bread Slice");
        translationBuilder.add(ModItems.BUTTER_BREAD_SLICE, "Butter Bread Slice");

        translationBuilder.add(ModItems.CREAM_BUCKET, "Bucket of Cream");
        translationBuilder.add(ModItems.CREAM, "Cream");
        translationBuilder.add(ModItems.APPLE_CREAM, "Apple Cream");
        translationBuilder.add(ModItems.CHERRY_CREAM, "Cherry Cream");
        translationBuilder.add(ModItems.CHOCOLATE_CREAM, "Chocolate Cream");
        translationBuilder.add(ModItems.PRAWN, "Prawn");
        translationBuilder.add(ModItems.GOLDEN_APPLE_CREAM, "Golden Apple Cream");
        translationBuilder.add(ModItems.MATCHA_CREAM, "Matcha Cream");
        translationBuilder.add(ModItems.PUMPKIN_CREAM, "Pumpkin Cream");

        translationBuilder.add(ModItems.MOUSSE_WIP, "Mousse (Work In Progress)");
        translationBuilder.add(ModItems.CREAM_MOUSSE, "Cream Mousse");
        translationBuilder.add(ModItems.CHERRY_MOUSSE, "Cherry Mouse");
        translationBuilder.add(ModItems.CHOCOLATE_MOUSSE, "Chocolate Mouse");
        translationBuilder.add(ModItems.PUMPKIN_MOUSSE, "Pumpkin Mouse");
        translationBuilder.add(ModItems.GOLDEN_APPLE_MOUSSE, "Golden Apple Mousse");
        translationBuilder.add(ModItems.MATCHA_MOUSSE, "Matcha Mousse");

        translationBuilder.add(ModItems.CRYSTAL_DUMPLING, "Crystal Dumpling");

        translationBuilder.add(ModItems.SQUID, "Squid");
        translationBuilder.add(ModItems.ROASTED_SQUID, "Roasted Squid");
        translationBuilder.add(ModItems.CUTTLEBONE, "Cuttlebone");
        translationBuilder.add(ModItems.GLOW_SQUID, "Glow Squid");
        translationBuilder.add(ModItems.ROASTED_GLOW_SQUID, "Roasted Glow Squid");
        translationBuilder.add(ModItems.GLOW_CUTTLEBONE, "Glow Cuttlebone");

        translationBuilder.add(ModItems.SAUSAGE, "Sausage");
        translationBuilder.add(ModItems.SECTIONED_SAUSAGE, "Sectioned Sausage");
        translationBuilder.add(ModItems.GRILLED_SAUSAGE, "Grilled Sausage");
        translationBuilder.add(ModItems.STARCH_SAUSAGE, "Starch Sausage");
        translationBuilder.add(ModItems.GRILLED_STARCH_SAUSAGE, "Grilled Starch Sausage");
        translationBuilder.add(ModItems.LITTLE_OCTOPUS_SAUSAGE, "Little Octopus Sausage");

        translationBuilder.add(ModItems.BLACK_TRUFFLE, "Black Truffle");
        translationBuilder.add(ModItems.WHITE_TRUFFLE, "White Truffle");
        translationBuilder.add(ModItems.ICE_BRICK, "Ice Brick");

        translationBuilder.add(ModItems.SILICON_INGOT, "Silicon Ingot");
        translationBuilder.add(ModBlocks.SILICON_BLOCK, "Block of Silicon");
        translationBuilder.add(ModItems.SILICON_COMPONENT, "Silicon Component");
        translationBuilder.add(ModItems.REDSTONE_COMPONENT, "Redstone Component");
        translationBuilder.add(ModItems.DIAMOND_COMPONENT, "Diamond Component");

        translationBuilder.add(ModItems.AMETHYST_SWORD, "Amethyst Sword");
        translationBuilder.add(ModItems.AMETHYST_PICKAXE, "Amethyst Pickaxe");
        translationBuilder.add(ModItems.AMETHYST_AXE, "Amethyst Axe");
        translationBuilder.add(ModItems.AMETHYST_SHOVEL, "Amethyst Shovel");
        translationBuilder.add(ModItems.AMETHYST_HOE, "Amethyst Hoe");

        translationBuilder.add(ModItems.EMPTY_CAKE, "Piecrust");
        translationBuilder.add(ModItems.BLUE_ORCHID_FLOWER_CAKE, "Blue Orchid Cake");
        translationBuilder.add(ModItems.CHERRY_CAKE, "Cherry Cake");
        translationBuilder.add(ModItems.LILAC_CAKE, "Lilac Cake");
        translationBuilder.add(ModItems.ORANGE_TULIP_CAKE, "Orange Tulip Cake");
        translationBuilder.add(ModItems.OXEYE_DAISY_CAKE, "Oxeye Daisy Cake");
        translationBuilder.add(ModItems.PINK_TULIP_CAKE, "Pink Tulip Cake");
        translationBuilder.add(ModItems.ROSE_CAKE, "Rose Cake");
        translationBuilder.add(ModItems.SUNFLOWER_CAKE, "Sunflower Cake");
        translationBuilder.add(ModItems.WHITE_TULIP_CAKE, "White Tulip Cake");
        translationBuilder.add(ModItems.WITHER_ROSE_CAKE, "Wither Rose Cake");

        translationBuilder.add(ModItems.RAW_ONION_RING, "Raw Onion Ring");
        translationBuilder.add(ModItems.ONION_RING, "Chicken Onion Rings");
        translationBuilder.add(ModItems.FRIED_COD, "Deep-fried Cod");
        translationBuilder.add(ModItems.FRIED_SALMON, "Deep-fried Salmon");
        translationBuilder.add(ModItems.FRIED_MILK_WIP, "Deep-fried Milk (Work In Progress)");
        translationBuilder.add(ModItems.FRIED_MILK, "Deep-fried Milk");
        translationBuilder.add(ModItems.FRIED_APPLE, "Deep-fried Apple");
        translationBuilder.add(ModItems.RAW_POTATO_CHIP, "Sliced Raw Potato");
        translationBuilder.add(ModItems.POTATO_CHIP, "Potato Chip");
        translationBuilder.add(ModItems.CHEESE_BALL, "Cheese Ball");
        translationBuilder.add(ModItems.FRIED_DOUGH_STICK, "Deep-fried Dough Stick");
        translationBuilder.add(ModItems.RAW_CHICKEN_FILLET, "Raw Chicken Fillet");
        translationBuilder.add(ModItems.CHICKEN_FILLET, "Deep-fried Chicken Fillet");

        translationBuilder.add(ModEntities.BUTTER,"Butter");
        translationBuilder.add(ModEntities.CHERRY_BOMB,"Cherry");

        translationBuilder.add(ModBlocks.PIZZA, "Pizza");
        translationBuilder.add(ModBlocks.RAW_PIZZA, "Raw Pizza");
        translationBuilder.add(ModBlocks.PIZZA_WIP, "Pizza (Work In Progress)");

        translationBuilder.add(ModBlocks.GLASS_BOWL, "Glass Bowl");
        translationBuilder.add(GlassBowlWhiskingCategory.GLASS_BOWL_NAME, "Whisk");
        translationBuilder.add(GlassBowlMixWithWaterCategory.WATER_GLASS_BOWL_NAME,"Mix with Water");
        translationBuilder.add(ModBlocks.OVEN, "Oven");
        translationBuilder.add(ModBlocks.ADVANCE_FURNACE, "Advance Furnace");
        translationBuilder.add(ModBlocks.BAKING_TRAY, "Baking Tray");
        translationBuilder.add(ModBlocks.DEEP_FRYER, "Deep Fryer");
        translationBuilder.add(BakingTrayCategory.BAKING_TRAY_NAME, "Stir-fried Dish");
        translationBuilder.add(ModBlocks.WOODEN_BASIN, "Wooden Basin");
        translationBuilder.add(WoodenBasinBlockEntity.WOODEN_BASIN_NAME, "Oil Extraction");
        translationBuilder.add(ModBlocks.GAS_CANISTER, "Gas Canister");
        translationBuilder.add(GasCanisterBlockEntity.GAS_CANISTER_NAME, "Gas Capacity");
        translationBuilder.add(ModBlocks.BIOGAS_DIGESTER_CONTROLLER, "Biogas Digester Controller");
        translationBuilder.add(BiogasDigesterControllerScreen.UNAVAILABLE, "The space under the controller is incomplete, not enclosed, or too large.");
        translationBuilder.add(BiogasDigesterControllerScreen.SIZE, "Size of the space under the controller.");
        translationBuilder.add(BiogasDigesterControllerScreen.GAS_VALUE, "Current gas storage capacity of the digester.");
        translationBuilder.add(BiogasDigesterControllerScreen.MAX_GAS_VALUE, "Maximum gas storage capacity of the digester.");
        translationBuilder.add(ModBlocks.BIOGAS_DIGESTER_IO, "Biogas Digester I/O port");
        translationBuilder.add(BiogasDigesterIOScreen.UNAVAILABLE, "The block below the port is not a controller, or the controller is not activated");
        translationBuilder.add(BiogasFermentationCategory.BIOGAS_FERMENTATION_NAME, "Biogas Fermentation");
        translationBuilder.add(BiogasFermentationCategory.FOOD, "Any Food");
        translationBuilder.add(ModBlocks.BURNING_GAS_COOKING_STOVE, "Burning Gas Cooking Stove");
        translationBuilder.add(ModBlocks.GAS_COOKING_STOVE, "Gas Cooking Stove");
        translationBuilder.add(ModBlocks.DEEP_FRY_BASKET, "Deep Fry Basket");
        translationBuilder.add(DeepFryerBlockEntity.ADD_OIL, "You need to add cooking oil to it.");
        translationBuilder.add(DeepFryerBlockEntity.TOO_HOT, "It's too hot! Please hold the deep fry basket to remove the items");
        translationBuilder.add(DeepFryerBlockEntity.DEEP_FRYER_NAME, "Deep Frying");
        translationBuilder.add(ModBlocks.KITCHEN_UTENSIL_HOLDER, "Kitchen Utensil Holder");
        translationBuilder.add(ModBlocks.CUISINE_TABLE, "Cuisine Table");
        translationBuilder.add(CuisineTableBlockEntity.CUISINE_TABLE_NAME, "Culinary");
        translationBuilder.add(ModBlocks.ANDESITE_CABINET, "Andesite Cabinet");
        translationBuilder.add(ModBlocks.DIORITE_CABINET, "Diorite Cabinet");
        translationBuilder.add(ModBlocks.GRANITE_CABINET, "Granite Cabinet");
        translationBuilder.add(ModBlocks.BLACKSTONE_CABINET, "Blackstone Cabinet");
        translationBuilder.add(ModBlocks.BASALT_CABINET, "Basalt Cabinet");
        translationBuilder.add(ModBlocks.DEEPSLATE_CABINET, "Deepslate Cabinet");
        translationBuilder.add(ModBlocks.OBSIDIAN_CABINET, "Obsidian Cabinet");
        translationBuilder.add(CabinetBlockEntity.CABINET_NAME, "Cabinet");
        translationBuilder.add(ModItems.ANCIENT_SCRAP, "Ancient Scrap");


        translationBuilder.add(OvenBlockEntity.OVEN_NAME, "Baking");
        translationBuilder.add(AdvanceFurnaceBlockEntity.ADVANCE_FURNACE_NAME, "Advance Furnace");
        translationBuilder.add(ModBlocks.FREEZER, "Freezer");
        translationBuilder.add(FreezerBlockEntity.FREEZER_NAME, "Refrigerate");
        translationBuilder.add(PizzaMakingCategory.PIZZA_TITLE, "Pizza Making");
        translationBuilder.add(OvenTransformCategory.TRANSFORM_TITLE, "Transform");
        translationBuilder.add(PhotovoltaicGeneratorBlockEntity.PHOTOVOLTAIC_GENERATOR_NAME, "Photovoltaic Power Generation");
        translationBuilder.add(ModBlocks.PHOTOVOLTAIC_GENERATOR, "Photovoltaic Generator");
        translationBuilder.add(PhotovoltaicGeneratorScreen.GREEN_TIP_1, "High efficiency model:");
        translationBuilder.add(PhotovoltaicGeneratorScreen.GREEN_TIP_2, "Daytime only and");
        translationBuilder.add(PhotovoltaicGeneratorScreen.GREEN_TIP_3, "open air only");
        translationBuilder.add(PhotovoltaicGeneratorScreen.YELLOW_TIP_1, "Inefficiency model:");
        translationBuilder.add(PhotovoltaicGeneratorScreen.YELLOW_TIP_2, "Activated when there is");
        translationBuilder.add(PhotovoltaicGeneratorScreen.YELLOW_TIP_3, "sufficient light nearby");
        translationBuilder.add(ModBlocks.GAS_PIPE, "Gas Pipe");
        translationBuilder.add(ModBlocks.AC_DC_CONVERTER, "AC/DC Converter");
        translationBuilder.add(ModBlocks.FAN_BLADE_ITEM, "Wind Turbine Blades");
        translationBuilder.add(ModBlocks.WIND_TURBINE_CONTROLLER, "Wind Turbine Controller");
        translationBuilder.add(ModBlocks.SIMPLE_BATTERY, "Simple Battery");
        translationBuilder.add(ModBlocks.INTERMEDIATE_BATTERY, "Intermediate Battery");
        translationBuilder.add(ModBlocks.ADVANCE_BATTERY, "Advance Battery");
        translationBuilder.add(ModBlocks.DIMENSION_BATTERY, "Dimension Battery");
        translationBuilder.add(AbstractBatteryBlock.TOOLTIP_TEXT, "Quantity of electric charge or power: ");
        translationBuilder.add(ModBlocks.STERLING_ENGINE_ITEM, "Sterling Engine");
        translationBuilder.add(ModBlocks.FARADAY_GENERATOR, "Faraday Generator");
        translationBuilder.add(ACDCConverterScreen.SPEED_NAME, "Working Speed");
        translationBuilder.add(ModBlocks.TESLA_COIL, "Tesla Coil");
        translationBuilder.add(ModBlocks.ELECTRICIANS_DESK, "Electrician's Desk");
        translationBuilder.add(ModBlocks.BOXED_CHERRIES, "Cherries Crate");
        translationBuilder.add(BoxedCherriesBlock.TIP, "You'll need at least 32 gunpowder to activate it.");
        translationBuilder.add(ModBlocks.BAMBOO_COVER, "Bamboo Steamer Cover");
        translationBuilder.add(ModBlocks.BAMBOO_GRATE, "Bamboo Steamer Grate");
        translationBuilder.add(BambooGrateBlockEntity.NAME, "Bamboo Steamer");

        translationBuilder.add("death.attack.bakingdelight_electroshock","%1$s was electrocuted!");

        translationBuilder.add(ModBlocks.CREAM_FLUID_BLOCK, "Cream");
        translationBuilder.add(ModBlocks.VEGETABLE_OIL_FLUID_BLOCK, "Vegetable Oil");

        translationBuilder.add(ModEffectsAndPotions.STICKY,"Sticky");

        translationBuilder.add("item.minecraft.potion.effect.sticky_potion","Potion of Sticky");
        translationBuilder.add("item.minecraft.potion.effect.sticky_long_potion","Potion of Sticky");
        translationBuilder.add("item.minecraft.potion.effect.squid_power_potion","Potion of the Squid Power");
        translationBuilder.add("item.minecraft.potion.effect.squid_power_long_potion","Potion of the Squid Power");
        translationBuilder.add("item.minecraft.potion.effect.squid_power_strong_potion","Potion of the Squid Power");
        translationBuilder.add("item.minecraft.potion.effect.glow_squid_power_potion","Potion of the Glow Squid Power");
        translationBuilder.add("item.minecraft.potion.effect.glow_squid_power_long_potion","Potion of the Glow Squid Power");
        translationBuilder.add("item.minecraft.potion.effect.glow_squid_power_strong_potion","Potion of the Glow Squid Power");
        translationBuilder.add("item.minecraft.splash_potion.effect.sticky_potion","Splash Potion of Sticky");
        translationBuilder.add("item.minecraft.splash_potion.effect.sticky_long_potion","Splash Potion of Sticky");
        translationBuilder.add("item.minecraft.splash_potion.effect.squid_power_potion","Splash Potion of the Squid Power");
        translationBuilder.add("item.minecraft.splash_potion.effect.squid_power_long_potion","Splash Potion of the Squid Power");
        translationBuilder.add("item.minecraft.splash_potion.effect.squid_power_strong_potion","Splash Potion of the Squid Power");
        translationBuilder.add("item.minecraft.splash_potion.effect.glow_squid_power_potion","Splash Potion of the Glow Squid Power");
        translationBuilder.add("item.minecraft.splash_potion.effect.glow_squid_power_long_potion","Splash Potion of the Glow Squid Power");
        translationBuilder.add("item.minecraft.splash_potion.effect.glow_squid_power_strong_potion","Splash Potion of the Glow Squid Power");
        translationBuilder.add("item.minecraft.lingering_potion.effect.sticky_potion","Lingering Potion of Sticky");
        translationBuilder.add("item.minecraft.lingering_potion.effect.sticky_long_potion","Lingering Potion of Sticky");
        translationBuilder.add("item.minecraft.lingering_potion.effect.squid_power_potion","Lingering Potion of the Squid Power");
        translationBuilder.add("item.minecraft.lingering_potion.effect.squid_power_long_potion","Lingering Potion of the Squid Power");
        translationBuilder.add("item.minecraft.lingering_potion.effect.squid_power_strong_potion","Lingering Potion of the Squid Power");
        translationBuilder.add("item.minecraft.lingering_potion.effect.glow_squid_power_potion","Lingering Potion of the Glow Squid Power");
        translationBuilder.add("item.minecraft.lingering_potion.effect.glow_squid_power_long_potion","Lingering Potion of the Glow Squid Power");
        translationBuilder.add("item.minecraft.lingering_potion.effect.glow_squid_power_strong_potion","Lingering Potion of the Glow Squid Power");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.sticky_potion","Arrow of Sticky");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.sticky_long_potion","Arrow of Sticky");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.squid_power_potion","Arrow of the Squid Power");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.squid_power_long_potion","Arrow of the Squid Power");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.squid_power_strong_potion","Arrow of the Squid Power");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.glow_squid_power_potion","Arrow of the Glow Squid Power");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.glow_squid_power_long_potion","Arrow of the Glow Squid Power");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.glow_squid_power_strong_potion","Arrow of the Glow Squid Power");

        translationBuilder.add(ModItemGroups.GROUPS_TAB_NAME, "Modern Kitchen");

        translationBuilder.add("sounds.bakingdelight.entity_butter_hit", "Butter: Hit");
        translationBuilder.add("sounds.bakingdelight.entity_butter_shoot", "Butter: Shoot");
        translationBuilder.add("sounds.bakingdelight.entity_cherry_bomb_explosion", "Cherry: Explosion");
        translationBuilder.add("sounds.bakingdelight.entity_cherry_bomb_shoot", "Cherry: Shoot");
        translationBuilder.add("sounds.bakingdelight.block_freezer_running", "Freezer: Running");
        translationBuilder.add("sounds.bakingdelight.block_freezer_open", "Freezer: Open");
        translationBuilder.add("sounds.bakingdelight.block_freezer_close", "Freezer: Close");
        translationBuilder.add("sounds.bakingdelight.block_glass_bowl_whisking", "Item: Whisked");
        translationBuilder.add("sounds.bakingdelight.block_food_frying", "Food: Frying");
        translationBuilder.add("sounds.bakingdelight.item_crowbar_hit", "Crowbar: Hit");
        translationBuilder.add("sounds.bakingdelight.item_crowbar_attack", "Crowbar: Attack");
        translationBuilder.add("sounds.bakingdelight.block_gas_canister_filling", "Gas Canister: Filling");
        translationBuilder.add("sounds.bakingdelight.block_gas_cooking_stove_ignite", "Gas Cooking Stove: Try to Ignite");
        translationBuilder.add("sounds.bakingdelight.block_sterling_engine", "Sterling Engine: Running");
        translationBuilder.add("sounds.bakingdelight.block_tesla_coil", "Tesla Coil: Electroshock");

        translationBuilder.add(BakingdelightClient.ORE_UI_DARK, "Ore UI Style (Dark)");
        translationBuilder.add(BakingdelightClient.ORE_UI_BRIGHT, "Ore UI Style (Bright)");

        translationBuilder.add(ModAdvancementGenerator.GET_WHISK_TITLE, "The truth is it's a whisk");
        translationBuilder.add(ModAdvancementGenerator.GET_WHISK_DESC, "Craft a whisk to start your new kitchen journey.");
        translationBuilder.add(ModAdvancementGenerator.GET_AMETHYST_TOOL_TITLE, "Sparkling!");
        translationBuilder.add(ModAdvancementGenerator.GET_AMETHYST_TOOL_DESC, "Craft a amethyst tool.");
        translationBuilder.add(ModAdvancementGenerator.GET_NETHERITE_WHISK_TITLE, "Huh?!");
        translationBuilder.add(ModAdvancementGenerator.GET_NETHERITE_WHISK_DESC, "Craft a netherite whisk or get out of the kitchen.");
        translationBuilder.add(ModAdvancementGenerator.GET_CUTTLEBONE_TITLE, "Better Than Milk");
        translationBuilder.add(ModAdvancementGenerator.GET_CUTTLEBONE_DESC, "Get a cuttlebone");
        translationBuilder.add(ModAdvancementGenerator.GET_TRUFFLE_TITLE, "Underground");
        translationBuilder.add(ModAdvancementGenerator.GET_TRUFFLE_DESC, "Find a truffle.");
        translationBuilder.add(ModAdvancementGenerator.GET_ALL_AMETHYST_TITLE, "Amethyst Lover");
        translationBuilder.add(ModAdvancementGenerator.GET_ALL_AMETHYST_DESC, "Own all amethyst tools.");
        translationBuilder.add(ModAdvancementGenerator.GET_CHERRY_BOMB_TITLE, "BOOM");
        translationBuilder.add(ModAdvancementGenerator.GET_CHERRY_BOMB_DESC, "✧(≖ ◡ ≖✿)");
        translationBuilder.add(ModAdvancementGenerator.GET_GLASS_BOWL_TITLE, "Handle with Care");
        translationBuilder.add(ModAdvancementGenerator.GET_GLASS_BOWL_DESC, "Be careful not to break the bowl.");
        translationBuilder.add(ModAdvancementGenerator.GET_MASHED_POTATO_TITLE, "Powdery Taste");
        translationBuilder.add(ModAdvancementGenerator.GET_MASHED_POTATO_DESC, "Put the potato in a glass bowl and whisk with a whisk to obtain the mashed potato.");
        translationBuilder.add(ModAdvancementGenerator.GET_POTATO_STARCH_TITLE, "Complete Powder");
        translationBuilder.add(ModAdvancementGenerator.GET_POTATO_STARCH_DESC, "Put the mashed potato in a glass bowl and whisk with a whisk to obtain the potato starch.");
        translationBuilder.add(ModAdvancementGenerator.GET_FREEZER_TITLE, "Cool Down");
        translationBuilder.add(ModAdvancementGenerator.GET_FREEZER_DESC, "What a great freezer, it actually needs to \"burn\" ice.");
        translationBuilder.add(ModAdvancementGenerator.GET_BLUE_ICE_TITLE, "Optimal \"Fuel\"");
        translationBuilder.add(ModAdvancementGenerator.GET_BLUE_ICE_DESC, "A good helper for the freezer.");
        translationBuilder.add(ModAdvancementGenerator.GET_OVEN_TITLE, "\"Hot\" Topic");
        translationBuilder.add(ModAdvancementGenerator.GET_OVEN_DESC, "The oven will help you bake better food.");
        translationBuilder.add(ModAdvancementGenerator.GET_EGG_TART_TITLE, "Sweety!");
        translationBuilder.add(ModAdvancementGenerator.GET_EGG_TART_DESC, "Sequentially place the cream, mixed dough, egg and sugar in the oven to make the tart.");
        translationBuilder.add(ModAdvancementGenerator.GET_PUDDING_WIP_1_TITLE, "Pudding step 1");
        translationBuilder.add(ModAdvancementGenerator.GET_PUDDING_WIP_1_DESC, "Follow the advancement, I believe you will make the pudding.");
        translationBuilder.add(ModAdvancementGenerator.GET_PUDDING_WIP_2_TITLE, "Pudding step 2");
        translationBuilder.add(ModAdvancementGenerator.GET_PUDDING_WIP_2_DESC, "Put 4 puddings (WIP) into the oven.");
        translationBuilder.add(ModAdvancementGenerator.GET_ALL_PUDDING_TITLE, "Chewy!");
        translationBuilder.add(ModAdvancementGenerator.GET_ALL_PUDDING_DESC, "Put the baked pudding in the middle slot of the freezer, and put the corresponding ingredients on both sides, and you will get real pudding.");
        translationBuilder.add(ModAdvancementGenerator.GET_MOUSSE_WIP_TITLE, "Mousse step 1");
        translationBuilder.add(ModAdvancementGenerator.GET_MOUSSE_WIP_DESC, "Follow the advancement, I believe you will make the mousse.");
        translationBuilder.add(ModAdvancementGenerator.GET_ALL_MOUSSE_TITLE, "Fluffy!");
        translationBuilder.add(ModAdvancementGenerator.GET_ALL_MOUSSE_DESC, "Put the mousse (WIP) in the middle slot of the freezer, and put the corresponding ingredients on both sides, and you will get real mousse.");
        translationBuilder.add(ModAdvancementGenerator.GET_CREAM_BUCKET_TITLE, "Slimy Milk");
        translationBuilder.add(ModAdvancementGenerator.GET_CREAM_BUCKET_DESC, "Put the milk bucket in a glass bowl and whisk with a whisk to obtain the cream bucket.");
        translationBuilder.add(ModAdvancementGenerator.GET_BUTTER_TITLE, "Sticky and Sweet");
        translationBuilder.add(ModAdvancementGenerator.GET_BUTTER_DESC, "Put the cream in a glass bowl and whisk with a whisk to obtain the butter.");
        translationBuilder.add("advancement.bakingdelight.get_start_desc", "After eating this piece of bread, does it seem too mediocre? It's time to prepare some brand new food!");
        translationBuilder.add("advancement.bakingdelight.get_kneading_stick.title", "Grandma's Kneading Stick");
        translationBuilder.add("advancement.bakingdelight.get_kneading_stick.desc", "It's just an ordinary wooden stick.");
        translationBuilder.add("advancement.bakingdelight.get_wheat_flour.title", "Better Bread Making");
        translationBuilder.add("advancement.bakingdelight.get_wheat_flour.desc", "Whisk wheat to obtain the wheat flour.");
        translationBuilder.add("advancement.bakingdelight.get_wheat_dough.title", "Sticky Mess");
        translationBuilder.add("advancement.bakingdelight.get_wheat_dough.desc", "Pour the water into a glass bowl, add the wheat flour and turn it into a dough! You can roll out with a kneading stick and flatten it, or you can go bake bread.");
        translationBuilder.add("advancement.bakingdelight.get_raw_pizza.title", "Getting ready to open a pizzeria!");
        translationBuilder.add("advancement.bakingdelight.get_raw_pizza.desc", "First, add the cheese to the flattened dough, then add 5 of your favorite ingredients and finish with a cheese.");
        translationBuilder.add("advancement.bakingdelight.get_pizza.title", "PIZZA!");
        translationBuilder.add("advancement.bakingdelight.get_pizza.desc", "Place in the oven in the order of black pepper dust, sugar, black pepper dust, raw pizza.");
        translationBuilder.add("advancement.bakingdelight.get_black_pepper.title", "Underchest");
        translationBuilder.add("advancement.bakingdelight.get_black_pepper.desc", "Finding new crops in villagers' homes or ruins.");
        translationBuilder.add("advancement.bakingdelight.get_cheese.title", "Not Sour");
        translationBuilder.add("advancement.bakingdelight.get_cheese.desc", "Put the milk in the oven to cook.");
        translationBuilder.add("advancement.bakingdelight.get_advance_furnace.title", "4x speed");
        translationBuilder.add("advancement.bakingdelight.get_advance_furnace.desc", "Craft an advanced furnace, which is 4 times faster than a normal furnace!");
        translationBuilder.add("advancement.bakingdelight.get_baking_tray.title", "Not just a \"Baking\" Tray");
        translationBuilder.add("advancement.bakingdelight.get_baking_tray.desc", "It can be placed inside an advanced furnace to upgrade your furnace to oven.");
        translationBuilder.add("advancement.bakingdelight.get_crowbar.title", "Rule Physics");
        translationBuilder.add("advancement.bakingdelight.get_crowbar.desc", "An awesome tool alright? You can right-click to demote the oven as well as right-click to quickly destroy doors and windows. Just remember, don't hit anyone with it.");
        translationBuilder.add("advancement.bakingdelight.wooden_basin.title", "It's not a Washbasin!");
        translationBuilder.add("advancement.bakingdelight.wooden_basin.desc", "Apparently it's a tool for extracting oil.");
        translationBuilder.add("advancement.bakingdelight.filter.title", "Beginning of a life of labor");
        translationBuilder.add("advancement.bakingdelight.filter.desc", "Putting filters and stir-fried oil crops (like sunflower seeds) into wooden basin and pressing the oil with feet on the basin");
        translationBuilder.add("advancement.bakingdelight.vegetable_oil.title", "Glossy");
        translationBuilder.add("advancement.bakingdelight.vegetable_oil.desc", "Congratulations, you're not far from deep-frying food.");
        translationBuilder.add("advancement.bakingdelight.deep_fryer.title", "Ordeal (For Food)");
        translationBuilder.add("advancement.bakingdelight.deep_fryer.desc", "Right click to put in oil or take out or deposit an item, sneak and right click to see its status. It must be oiled and have a gas canister connection in order to work");
        translationBuilder.add("advancement.bakingdelight.deep_fry_basket.title", "Watch out for hot oil");
        translationBuilder.add("advancement.bakingdelight.deep_fry_basket.desc", "Remember to use a deep fry basket to get items out of the deep fryer, beware of fryer killers!");
        translationBuilder.add("advancement.bakingdelight.all_fried.title", "All Fried");
        translationBuilder.add("advancement.bakingdelight.all_fried.desc", "Savor all the fried foods!");
        translationBuilder.add("advancement.bakingdelight.wither_rose_cake.title", "Bloom & Doom");
        translationBuilder.add("advancement.bakingdelight.wither_rose_cake.desc", "Eat the wither rose cake, then think about your life.");
        translationBuilder.add("advancement.bakingdelight.bdc_bdi.title", "Biogas Industry");
        translationBuilder.add("advancement.bakingdelight.bdc_bdi.desc", "Craft a biogas digester controller and a biogas digester I/O port. Remember to read their instructions and build your biogas digester!");
        translationBuilder.add("advancement.bakingdelight.gas_canister.title", "Flammable and Explosive");
        translationBuilder.add("advancement.bakingdelight.gas_canister.desc", "It can either load gas from the biogas digester I/O port or supply gas to a gas cooking stove. Remember to be safe though!");
        translationBuilder.add("advancement.bakingdelight.gas_cooking_stove.title", "Lit the Stove");
        translationBuilder.add("advancement.bakingdelight.gas_cooking_stove.desc", "Gas cooking stove can heat a lot of things, including yourself");
        translationBuilder.add("advancement.bakingdelight.spatula.title", "It's stir-fry time!");
        translationBuilder.add("advancement.bakingdelight.spatula.desc", "Heat up a baking tray on the burning gas cooking stove, then add ingredients to it and stir-fry with a spatula.");
        translationBuilder.add("advancement.bakingdelight.kuh.title", "Beautify the kitchen");
        translationBuilder.add("advancement.bakingdelight.kuh.desc", "Make a Kitchen Utensil Holder");
        translationBuilder.add("advancement.bakingdelight.cuisine_table.title", "Break Down Everything");
        translationBuilder.add("advancement.bakingdelight.cuisine_table.desc", "Make a Cuisine Table, with the top slot for tools and the bottom slot for items, you can break down a lot of items.");


    }
}

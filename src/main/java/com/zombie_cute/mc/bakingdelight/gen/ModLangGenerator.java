package com.zombie_cute.mc.bakingdelight.gen;

import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.block.entities.FreezerBlockEntity;
import com.zombie_cute.mc.bakingdelight.block.entities.GlassBowlBlockEntity;
import com.zombie_cute.mc.bakingdelight.block.entities.OvenBlockEntity;
import com.zombie_cute.mc.bakingdelight.block.entities.PizzaWIPBlockEntity;
import com.zombie_cute.mc.bakingdelight.compat.glass_bowl.GlassBowlWhiskingCategory;
import com.zombie_cute.mc.bakingdelight.compat.pizza.PizzaMakingCategory;
import com.zombie_cute.mc.bakingdelight.entity.ModEntities;
import com.zombie_cute.mc.bakingdelight.item.ModItemGroups;
import com.zombie_cute.mc.bakingdelight.item.ModItems;
import com.zombie_cute.mc.bakingdelight.item.custom.ButterItem;
import com.zombie_cute.mc.bakingdelight.item.custom.CuttleboneItem;
import com.zombie_cute.mc.bakingdelight.item.custom.TruffleItem;
import com.zombie_cute.mc.bakingdelight.item.custom.WhiskItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModLangGenerator extends FabricLanguageProvider {
    public ModLangGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(WhiskItem.WHISK_TOOL_TIP_1, "A whisk that can be used to mix ingredients, or... whisk the brains of monsters?");
        translationBuilder.add(CuttleboneItem.CUTTLEBONE_TOOL_TIP_1, "It can be dropped when a squid killed by an amethyst tool.");
        translationBuilder.add(TruffleItem.TRUFFLE_TOOL_TIP_1, "It can be found in podzol.");
        translationBuilder.add(WhiskItem.TOOL_TIP_0, "Press [SHIFT] to show more");
        translationBuilder.add(ButterItem.BUTTER_TOOL_TIP_0, "Sticky texture...Maybe it's used for something other than food");

        translationBuilder.add(GlassBowlBlockEntity.WHISK_FAIL, "This thing doesn't seem to be able to be handled by the whisk.");
        translationBuilder.add(GlassBowlBlockEntity.NEED_BOWL, "You need a bowl to take out this item.");
        translationBuilder.add(PizzaWIPBlockEntity.NEED_INGREDIENT, "You need to put a proper ingredient here.");
        translationBuilder.add(PizzaWIPBlockEntity.NEED_CHEESE, "You need to put a cheese here.");

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

        translationBuilder.add(ModItems.EGG_TART, "Egg Tart");
        translationBuilder.add(ModItems.APPLE_PUDDING, "Apple Pudding");
        translationBuilder.add(ModItems.BRAISED_SHRIMP_BALL, "Braised Shrimp Ball");
        translationBuilder.add(ModItems.MATCHA_PUDDING, "Matcha Pudding");
        translationBuilder.add(ModItems.SUNFLOWER_SEED, "Sunflower Seed");
        translationBuilder.add(ModItems.SUNFLOWER_SEED_PEEL, "Sunflower Seed Peel");
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

        translationBuilder.add(ModItems.AMETHYST_SWORD, "Amethyst Sword");
        translationBuilder.add(ModItems.AMETHYST_PICKAXE, "Amethyst Pickaxe");
        translationBuilder.add(ModItems.AMETHYST_AXE, "Amethyst Axe");
        translationBuilder.add(ModItems.AMETHYST_SHOVEL, "Amethyst Shovel");
        translationBuilder.add(ModItems.AMETHYST_HOE, "Amethyst Hoe");

        translationBuilder.add(ModEntities.BUTTER,"Butter");
        translationBuilder.add(ModEntities.CHERRY_BOMB,"Cherry");

        translationBuilder.add(ModBlocks.PIZZA, "Pizza");
        translationBuilder.add(ModBlocks.RAW_PIZZA, "Raw Pizza");
        translationBuilder.add(ModBlocks.PIZZA_WIP, "Pizza (Work In Progress)");

        translationBuilder.add(ModBlocks.GLASS_BOWL, "Glass Bowl");
        translationBuilder.add(GlassBowlWhiskingCategory.GLASS_BOWL_NAME, "Whisk");
        translationBuilder.add("display_name.bakingdelight.water_glass_bowl_name","Mix with Water");
        translationBuilder.add(ModBlocks.OVEN, "Oven");
        translationBuilder.add(OvenBlockEntity.OVEN_NAME, "Baking");
        translationBuilder.add(ModBlocks.FREEZER, "Freezer");
        translationBuilder.add(FreezerBlockEntity.FREEZER_NAME, "Refrigerate");
        translationBuilder.add(PizzaMakingCategory.PIZZA_TITLE, "Pizza Making");

        translationBuilder.add(ModItemGroups.GROUPS_TAB_NAME, "Baking Delight");

        translationBuilder.add("sounds.bakingdelight.entity_butter_hit", "Butter: Hit");
        translationBuilder.add("sounds.bakingdelight.entity_butter_shoot", "Butter: Shoot");
        translationBuilder.add("sounds.bakingdelight.entity_cherry_bomb_explosion", "Cherry: Explosion");
        translationBuilder.add("sounds.bakingdelight.entity_cherry_bomb_shoot", "Cherry: Shoot");
        translationBuilder.add("sounds.bakingdelight.block_freezer_running", "Freezer: Running");
        translationBuilder.add("sounds.bakingdelight.block_freezer_open", "Freezer: Open");
        translationBuilder.add("sounds.bakingdelight.block_freezer_close", "Freezer: Close");
        translationBuilder.add("sounds.bakingdelight.block_glass_bowl_whisking", "Item: Whisked");

        translationBuilder.add(ModAdvancementGenerator.GET_WHISK_TITLE, "Ready to Bake!");
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
        translationBuilder.add("advancement.bakingdelight.get_start_desc", "Ready to bake!");
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
    }
}

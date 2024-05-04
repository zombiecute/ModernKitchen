package com.zombie_cute.mc.bakingdelight.gen;

import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.item.ModItems;
import com.zombie_cute.mc.bakingdelight.tag.ForgeTagKeys;
import com.zombie_cute.mc.bakingdelight.tag.ModTagKeys;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends FabricTagProvider.ItemTagProvider {

    public ModItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // Filters
        getOrCreateTagBuilder(ModTagKeys.FILTERS).add(ModItems.FILTER);
        // Oil Plants
        getOrCreateTagBuilder(ModTagKeys.OIL_PLANTS).add(ModItems.ROASTED_SUNFLOWER_SEED);
        // Spatulas
        getOrCreateTagBuilder(ModTagKeys.SPATULAS).add(ModItems.SPATULA);
        // Crowbars
        getOrCreateTagBuilder(ModTagKeys.CROWBARS).add(ModItems.CROWBAR);
        getOrCreateTagBuilder(ModTagKeys.CROWBARS).addOptional(new Identifier("create:wrench"));
        // Upright on Belt
        getOrCreateTagBuilder(ForgeTagKeys.UPRIGHT_ON_BELT).add(ModItems.EGG_TART);
        getOrCreateTagBuilder(ForgeTagKeys.UPRIGHT_ON_BELT).add(ModItems.TRUFFLE_EGG_TART);
        getOrCreateTagBuilder(ForgeTagKeys.UPRIGHT_ON_BELT).add(ModItems.CUTTLEBONE);
        getOrCreateTagBuilder(ForgeTagKeys.UPRIGHT_ON_BELT).add(ModItems.GLOW_CUTTLEBONE);
        getOrCreateTagBuilder(ForgeTagKeys.UPRIGHT_ON_BELT).add(ModItems.CRYSTAL_DUMPLING);
        getOrCreateTagBuilder(ForgeTagKeys.UPRIGHT_ON_BELT).addTag(ForgeTagKeys.CREAMS);
        getOrCreateTagBuilder(ForgeTagKeys.UPRIGHT_ON_BELT).add(Items.BOWL);
        getOrCreateTagBuilder(ForgeTagKeys.UPRIGHT_ON_BELT).add(ModItems.MASHED_POTATO);
        getOrCreateTagBuilder(ForgeTagKeys.UPRIGHT_ON_BELT).add(ModItems.SAUCE_MASHED_POTATO);
        // Flat on Baking Tray
        getOrCreateTagBuilder(ModTagKeys.FLAT_ON_BAKING_TRAY).add(ModBlocks.RAW_PIZZA.asItem());
        getOrCreateTagBuilder(ModTagKeys.FLAT_ON_BAKING_TRAY).add(ModBlocks.PIZZA_WIP.asItem());
        getOrCreateTagBuilder(ModTagKeys.FLAT_ON_BAKING_TRAY).add(ModBlocks.PIZZA.asItem());
        getOrCreateTagBuilder(ModTagKeys.FLAT_ON_BAKING_TRAY).addOptionalTag(ItemTags.TRAPDOORS);
        getOrCreateTagBuilder(ModTagKeys.FLAT_ON_BAKING_TRAY).addOptionalTag(BlockTags.PRESSURE_PLATES.id());
        // Whisks
        getOrCreateTagBuilder(ModTagKeys.WHISKS).add(ModItems.AMETHYST_WHISK);
        getOrCreateTagBuilder(ModTagKeys.WHISKS).add(ModItems.WOODEN_WHISK);
        getOrCreateTagBuilder(ModTagKeys.WHISKS).add(ModItems.COPPER_WHISK);
        getOrCreateTagBuilder(ModTagKeys.WHISKS).add(ModItems.STONE_WHISK);
        getOrCreateTagBuilder(ModTagKeys.WHISKS).add(ModItems.IRON_WHISK);
        getOrCreateTagBuilder(ModTagKeys.WHISKS).add(ModItems.GOLDEN_WHISK);
        getOrCreateTagBuilder(ModTagKeys.WHISKS).add(ModItems.DIAMOND_WHISK);
        getOrCreateTagBuilder(ModTagKeys.WHISKS).add(ModItems.NETHERITE_WHISK);
        // Tools
        getOrCreateTagBuilder(ForgeTagKeys.TOOLS).addOptionalTag(ForgeTagKeys.TOOLS_KNIVES);
        getOrCreateTagBuilder(ForgeTagKeys.TOOLS).addOptionalTag(ForgeTagKeys.TOOLS_AXES);
        getOrCreateTagBuilder(ForgeTagKeys.TOOLS).addOptionalTag(ForgeTagKeys.TOOLS_HOES);
        getOrCreateTagBuilder(ForgeTagKeys.TOOLS).addOptionalTag(ForgeTagKeys.TOOLS_PICKAXES);
        getOrCreateTagBuilder(ForgeTagKeys.TOOLS).addOptionalTag(ForgeTagKeys.TOOLS_SWORDS);
        getOrCreateTagBuilder(ForgeTagKeys.TOOLS).addOptionalTag(ForgeTagKeys.TOOLS_SHOVELS);
        // Foods
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.SUNFLOWER_SEED_PULP);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.EMPTY_CAKE);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.RAW_ONION_RING);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.ONION_RING);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.FRIED_COD);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.FRIED_SALMON);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.FRIED_MILK_WIP);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.FRIED_MILK);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.FRIED_APPLE);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.RAW_POTATO_CHIP);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.POTATO_CHIP);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.CHEESE_BALL);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.FRIED_DOUGH_STICK);

        getOrCreateTagBuilder(ForgeTagKeys.FOODS).addOptionalTag(ForgeTagKeys.BREADS);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).addOptionalTag(ForgeTagKeys.TRUFFLES);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).addOptionalTag(ForgeTagKeys.PUDDINGS);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).addOptionalTag(ForgeTagKeys.FLOURS);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).addOptionalTag(ForgeTagKeys.DOUGHS);
        getOrCreateTagBuilder(ForgeTagKeys.DOUGHS).addOptionalTag(ForgeTagKeys.DOUGH_WHEAT);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).addOptionalTag(ForgeTagKeys.CREAMS);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).addOptionalTag(ForgeTagKeys.MOUSSES);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).addOptionalTag(ForgeTagKeys.RAW_FISHES);
        getOrCreateTagBuilder(ForgeTagKeys.RAW_FISHES).addOptionalTag(ForgeTagKeys.PRAWNS);
        getOrCreateTagBuilder(ForgeTagKeys.RAW_FISHES).addOptionalTag(ForgeTagKeys.SQUIDS);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).addOptionalTag(ForgeTagKeys.CUTTLEBONES);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).addOptionalTag(ForgeTagKeys.FLOWER_CAKES);
        getOrCreateTagBuilder(ForgeTagKeys.SAUSAGES).addOptionalTag(ForgeTagKeys.SAUSAGES);
        getOrCreateTagBuilder(ForgeTagKeys.BREADS).addOptionalTag(ForgeTagKeys.BREAD_WHEAT);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).addOptionalTag(ForgeTagKeys.PIZZA_INGREDIENTS);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).addOptionalTag(ForgeTagKeys.PUMPKINS);
        getOrCreateTagBuilder(ForgeTagKeys.SEEDS).addOptionalTag(ForgeTagKeys.SEED_BLACK_PEPPERS);
        getOrCreateTagBuilder(ForgeTagKeys.CROPS).addOptionalTag(ForgeTagKeys.CROP_BLACK_PEPPER);
        getOrCreateTagBuilder(ForgeTagKeys.C_WHEAT_FLOUR).add(ModItems.WHEAT_FLOUR);
        getOrCreateTagBuilder(ForgeTagKeys.C_FLOUR).add(ModItems.WHEAT_FLOUR);
        getOrCreateTagBuilder(ForgeTagKeys.C_FLOUR).add(ModItems.POTATO_STARCH);
        getOrCreateTagBuilder(ForgeTagKeys.C_WHEAT_DOUGH).add(ModBlocks.WHEAT_DOUGH.asItem());
        getOrCreateTagBuilder(ForgeTagKeys.C_DOUGH).add(ModItems.MIXED_DOUGH);
        getOrCreateTagBuilder(ForgeTagKeys.C_DOUGH).add(ModBlocks.WHEAT_DOUGH.asItem());
        // Flower Cakes
        getOrCreateTagBuilder(ForgeTagKeys.FLOWER_CAKES).add(ModItems.BLUE_ORCHID_FLOWER_CAKE);
        getOrCreateTagBuilder(ForgeTagKeys.FLOWER_CAKES).add(ModItems.CHERRY_CAKE);
        getOrCreateTagBuilder(ForgeTagKeys.FLOWER_CAKES).add(ModItems.LILAC_CAKE);
        getOrCreateTagBuilder(ForgeTagKeys.FLOWER_CAKES).add(ModItems.ORANGE_TULIP_CAKE);
        getOrCreateTagBuilder(ForgeTagKeys.FLOWER_CAKES).add(ModItems.OXEYE_DAISY_CAKE);
        getOrCreateTagBuilder(ForgeTagKeys.FLOWER_CAKES).add(ModItems.PINK_TULIP_CAKE);
        getOrCreateTagBuilder(ForgeTagKeys.FLOWER_CAKES).add(ModItems.ROSE_CAKE);
        getOrCreateTagBuilder(ForgeTagKeys.FLOWER_CAKES).add(ModItems.SUNFLOWER_CAKE);
        getOrCreateTagBuilder(ForgeTagKeys.FLOWER_CAKES).add(ModItems.WHITE_TULIP_CAKE);
        getOrCreateTagBuilder(ForgeTagKeys.FLOWER_CAKES).add(ModItems.WITHER_ROSE_CAKE);

        // Knives
        getOrCreateTagBuilder(ForgeTagKeys.TOOLS_KNIVES).add(ModItems.COPPER_KNIFE);
        getOrCreateTagBuilder(ForgeTagKeys.TOOLS_KNIVES).add(ModItems.AMETHYST_KNIFE);
        // Amethyst Tools
        getOrCreateTagBuilder(ModTagKeys.AMETHYST_TOOLS).add(ModItems.AMETHYST_WHISK);
        getOrCreateTagBuilder(ModTagKeys.AMETHYST_TOOLS).add(ModItems.AMETHYST_SWORD);
        getOrCreateTagBuilder(ModTagKeys.AMETHYST_TOOLS).add(ModItems.AMETHYST_PICKAXE);
        getOrCreateTagBuilder(ModTagKeys.AMETHYST_TOOLS).add(ModItems.AMETHYST_AXE);
        getOrCreateTagBuilder(ModTagKeys.AMETHYST_TOOLS).add(ModItems.AMETHYST_SHOVEL);
        getOrCreateTagBuilder(ModTagKeys.AMETHYST_TOOLS).add(ModItems.AMETHYST_HOE);
        getOrCreateTagBuilder(ModTagKeys.AMETHYST_TOOLS).add(ModItems.AMETHYST_KNIFE);
        // Kneading Sticks
        getOrCreateTagBuilder(ModTagKeys.KNEADING_STICKS).add(ModItems.KNEADING_STICK);
        // Vanilla Tools
        getOrCreateTagBuilder(ForgeTagKeys.TOOLS_SWORDS).add(ModItems.AMETHYST_SWORD);
        getOrCreateTagBuilder(ForgeTagKeys.TOOLS_AXES).add(ModItems.AMETHYST_AXE);
        getOrCreateTagBuilder(ForgeTagKeys.TOOLS_HOES).add(ModItems.AMETHYST_HOE);
        getOrCreateTagBuilder(ForgeTagKeys.TOOLS_PICKAXES).add(ModItems.AMETHYST_PICKAXE);
        getOrCreateTagBuilder(ForgeTagKeys.TOOLS_SHOVELS).add(ModItems.AMETHYST_SHOVEL);
        // Dough Wheat
        getOrCreateTagBuilder(ForgeTagKeys.DOUGH_WHEAT).add(ModBlocks.WHEAT_DOUGH.asItem());
        // Cold Items
        getOrCreateTagBuilder(ForgeTagKeys.COLD_ITEMS).add(ModItems.ICE_BRICK);
        getOrCreateTagBuilder(ForgeTagKeys.COLD_ITEMS).add(Items.SNOWBALL);
        // Foods
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(Items.POTATO);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(Items.CARROT);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(Items.BEEF);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(Items.COD);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(Items.SALMON);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(Items.CHICKEN);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(Items.RABBIT);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(Items.MUTTON);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(Items.PORKCHOP);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(Items.TROPICAL_FISH);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(ModItems.BUTTER);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(ModItems.PRAWN);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(ModItems.SQUID);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(ModItems.GLOW_SQUID);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(ModItems.WHITE_TRUFFLE);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(ModItems.BLACK_TRUFFLE);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(ModItems.SECTIONED_SAUSAGE);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).addOptional(new Identifier("farmersdelight:cabbage"));
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).add(Items.PUMPKIN);
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).addOptional(new Identifier("farmersdelight:tomato"));
        getOrCreateTagBuilder(ForgeTagKeys.PIZZA_INGREDIENTS).addOptional(new Identifier("farmersdelight:onion"));

        getOrCreateTagBuilder(ForgeTagKeys.TRUFFLES).add(ModItems.WHITE_TRUFFLE);
        getOrCreateTagBuilder(ForgeTagKeys.TRUFFLES).add(ModItems.BLACK_TRUFFLE);

        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.BLACK_PEPPER_CORN);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.BLACK_PEPPER_CORN);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.SUNFLOWER_SEED);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.MASHED_POTATO);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.SAUCE_MASHED_POTATO);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.APPLE_PETAL);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.CHERRY);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.CHEESE);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.EGG_TART);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.TRUFFLE_EGG_TART);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModItems.BRAISED_SHRIMP_BALL);
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModBlocks.PIZZA.asItem());
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModBlocks.RAW_PIZZA.asItem());
        getOrCreateTagBuilder(ForgeTagKeys.FOODS).add(ModBlocks.PIZZA_WIP.asItem());

        getOrCreateTagBuilder(ForgeTagKeys.FLOURS).add(ModItems.POTATO_STARCH);
        getOrCreateTagBuilder(ForgeTagKeys.FLOURS).add(ModItems.WHEAT_FLOUR);

        getOrCreateTagBuilder(ForgeTagKeys.DOUGHS).add(ModItems.MIXED_DOUGH);

        getOrCreateTagBuilder(ForgeTagKeys.PUDDINGS).add(ModItems.PUDDING_WIP_1);
        getOrCreateTagBuilder(ForgeTagKeys.PUDDINGS).add(ModItems.PUDDING_WIP_2);
        getOrCreateTagBuilder(ForgeTagKeys.PUDDINGS).add(ModItems.APPLE_PUDDING);
        getOrCreateTagBuilder(ForgeTagKeys.PUDDINGS).add(ModItems.MATCHA_PUDDING);
        getOrCreateTagBuilder(ForgeTagKeys.PUDDINGS).add(ModItems.MATCHA_PUDDING);

        getOrCreateTagBuilder(ForgeTagKeys.CREAMS).add(ModItems.CREAM);
        getOrCreateTagBuilder(ForgeTagKeys.CREAMS).add(ModItems.CREAM_BUCKET);
        getOrCreateTagBuilder(ForgeTagKeys.CREAMS).add(ModItems.CHERRY_CREAM);
        getOrCreateTagBuilder(ForgeTagKeys.CREAMS).add(ModItems.GOLDEN_APPLE_CREAM);
        getOrCreateTagBuilder(ForgeTagKeys.CREAMS).add(ModItems.CHOCOLATE_CREAM);
        getOrCreateTagBuilder(ForgeTagKeys.CREAMS).add(ModItems.APPLE_CREAM);
        getOrCreateTagBuilder(ForgeTagKeys.CREAMS).add(ModItems.MATCHA_CREAM);
        getOrCreateTagBuilder(ForgeTagKeys.CREAMS).add(ModItems.PUMPKIN_CREAM);

        getOrCreateTagBuilder(ForgeTagKeys.MOUSSES).add(ModItems.MOUSSE_WIP);
        getOrCreateTagBuilder(ForgeTagKeys.MOUSSES).add(ModItems.CREAM_MOUSSE);
        getOrCreateTagBuilder(ForgeTagKeys.MOUSSES).add(ModItems.MATCHA_MOUSSE);
        getOrCreateTagBuilder(ForgeTagKeys.MOUSSES).add(ModItems.CHERRY_MOUSSE);
        getOrCreateTagBuilder(ForgeTagKeys.MOUSSES).add(ModItems.CHOCOLATE_MOUSSE);
        getOrCreateTagBuilder(ForgeTagKeys.MOUSSES).add(ModItems.GOLDEN_APPLE_MOUSSE);
        getOrCreateTagBuilder(ForgeTagKeys.MOUSSES).add(ModItems.PUMPKIN_MOUSSE);

        getOrCreateTagBuilder(ForgeTagKeys.SQUIDS).add(ModItems.SQUID);
        getOrCreateTagBuilder(ForgeTagKeys.SQUIDS).add(ModItems.GLOW_SQUID);

        getOrCreateTagBuilder(ForgeTagKeys.PRAWNS).add(ModItems.PRAWN);

        getOrCreateTagBuilder(ForgeTagKeys.CUTTLEBONES).add(ModItems.CUTTLEBONE);
        getOrCreateTagBuilder(ForgeTagKeys.CUTTLEBONES).add(ModItems.GLOW_CUTTLEBONE);

        getOrCreateTagBuilder(ForgeTagKeys.SAUSAGES).add(ModItems.SAUSAGE);
        getOrCreateTagBuilder(ForgeTagKeys.SAUSAGES).add(ModItems.SECTIONED_SAUSAGE);
        getOrCreateTagBuilder(ForgeTagKeys.SAUSAGES).add(ModItems.STARCH_SAUSAGE);
        getOrCreateTagBuilder(ForgeTagKeys.SAUSAGES).add(ModItems.GRILLED_SAUSAGE);
        getOrCreateTagBuilder(ForgeTagKeys.SAUSAGES).add(ModItems.GRILLED_STARCH_SAUSAGE);
        getOrCreateTagBuilder(ForgeTagKeys.SAUSAGES).add(ModItems.LITTLE_OCTOPUS_SAUSAGE);

        getOrCreateTagBuilder(ForgeTagKeys.BREADS).add(ModItems.BUTTER_BREAD_SLICE);

        getOrCreateTagBuilder(ForgeTagKeys.BREAD_WHEAT).add(ModItems.BREAD_SLICE);

        getOrCreateTagBuilder(ForgeTagKeys.PUMPKINS).add(Items.PUMPKIN);
        getOrCreateTagBuilder(ForgeTagKeys.PUMPKINS).addOptional(new Identifier("farmersdelight:pumpkin_slice"));

        getOrCreateTagBuilder(ForgeTagKeys.SEED_BLACK_PEPPERS).add(ModItems.BLACK_PEPPER_CORN);
        getOrCreateTagBuilder(ForgeTagKeys.CROP_BLACK_PEPPER).add(ModItems.BLACK_PEPPER_CORN);
        getOrCreateTagBuilder(ItemTags.VILLAGER_PLANTABLE_SEEDS).add(ModItems.BLACK_PEPPER_CORN);

        // Gold
        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED).add(ModItems.GOLDEN_WHISK);
        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED).add(ModItems.GOLDEN_APPLE_CREAM);
        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED).add(ModItems.GOLDEN_APPLE_MOUSSE);
    }
}

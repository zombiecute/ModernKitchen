package com.zombie_cute.mc.bakingdelight.gen;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.block.custom.BlackPepperCropBlock;
import com.zombie_cute.mc.bakingdelight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelGenerator extends FabricModelProvider {
    public ModModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleState(ModBlocks.BIOGAS_DIGESTER_CONTROLLER);
        blockStateModelGenerator.registerSimpleState(ModBlocks.BIOGAS_DIGESTER_IO);
        blockStateModelGenerator.registerSimpleState(ModBlocks.RAW_PIZZA);
        blockStateModelGenerator.registerSimpleState(ModBlocks.BAKING_TRAY);
        blockStateModelGenerator.registerSimpleState(ModBlocks.BURNING_GAS_COOKING_STOVE);
        blockStateModelGenerator.registerSimpleState(ModBlocks.GAS_COOKING_STOVE);

        blockStateModelGenerator.registerCrop(ModBlocks.BLACK_PEPPER_CROP, BlackPepperCropBlock.AGE, 0,1,2,3,4,5,6);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModBlocks.MASHED_POTATO_BLOCK.asItem(), registerItemBlockModel(ModBlocks.MASHED_POTATO_BLOCK));
        itemModelGenerator.register(ModBlocks.GLASS_BOWL.asItem(), registerItemBlockModel(ModBlocks.GLASS_BOWL));
        itemModelGenerator.register(ModBlocks.OVEN.asItem(),registerItemBlockModel(ModBlocks.OVEN));
        itemModelGenerator.register(ModBlocks.FREEZER.asItem(),registerItemBlockModel(ModBlocks.FREEZER));
        itemModelGenerator.register(ModBlocks.WHEAT_DOUGH.asItem(),registerItemBlockModel(ModBlocks.WHEAT_DOUGH));
        itemModelGenerator.register(ModBlocks.PIZZA.asItem(),registerItemBlockModel(ModBlocks.PIZZA));
        itemModelGenerator.register(ModBlocks.PIZZA_WIP.asItem(),registerItemBlockModel(ModBlocks.PIZZA_WIP));
        itemModelGenerator.register(ModBlocks.RAW_PIZZA.asItem(),registerItemBlockModel(ModBlocks.RAW_PIZZA));
        itemModelGenerator.register(ModBlocks.BAKING_TRAY.asItem(),registerItemBlockModel(ModBlocks.BAKING_TRAY));
        itemModelGenerator.register(ModBlocks.DEEP_FRYER.asItem(),registerItemBlockModel(ModBlocks.DEEP_FRYER));
        itemModelGenerator.register(ModBlocks.ADVANCE_FURNACE.asItem(),registerItemBlockModel(ModBlocks.ADVANCE_FURNACE));
        itemModelGenerator.register(ModBlocks.WOODEN_BASIN.asItem(),registerItemBlockModel(ModBlocks.WOODEN_BASIN));
        itemModelGenerator.register(ModBlocks.GAS_CANISTER.asItem(),registerItemBlockModel(ModBlocks.GAS_CANISTER));
        itemModelGenerator.register(ModBlocks.BIOGAS_DIGESTER_CONTROLLER.asItem(),registerItemBlockModel(ModBlocks.BIOGAS_DIGESTER_CONTROLLER));
        itemModelGenerator.register(ModBlocks.BIOGAS_DIGESTER_IO.asItem(),registerItemBlockModel(ModBlocks.BIOGAS_DIGESTER_IO));
        itemModelGenerator.register(ModBlocks.BURNING_GAS_COOKING_STOVE.asItem(),registerItemBlockModel(ModBlocks.BURNING_GAS_COOKING_STOVE));
        itemModelGenerator.register(ModBlocks.GAS_COOKING_STOVE.asItem(),registerItemBlockModel(ModBlocks.GAS_COOKING_STOVE));
        itemModelGenerator.register(ModBlocks.DEEP_FRY_BASKET.asItem(),registerItemBlockModel(ModBlocks.DEEP_FRY_BASKET));
        itemModelGenerator.register(ModBlocks.KITCHEN_UTENSIL_HOLDER.asItem(),registerItemBlockModel(ModBlocks.KITCHEN_UTENSIL_HOLDER));
        itemModelGenerator.register(ModBlocks.CUISINE_TABLE.asItem(),registerItemBlockModel(ModBlocks.CUISINE_TABLE));
        itemModelGenerator.register(ModBlocks.ANDESITE_CABINET.asItem(),registerItemBlockModel(ModBlocks.ANDESITE_CABINET));
        itemModelGenerator.register(ModBlocks.DIORITE_CABINET.asItem(),registerItemBlockModel(ModBlocks.DIORITE_CABINET));
        itemModelGenerator.register(ModBlocks.GRANITE_CABINET.asItem(),registerItemBlockModel(ModBlocks.GRANITE_CABINET));
        itemModelGenerator.register(ModBlocks.DEEPSLATE_CABINET.asItem(),registerItemBlockModel(ModBlocks.DEEPSLATE_CABINET));
        itemModelGenerator.register(ModBlocks.BASALT_CABINET.asItem(),registerItemBlockModel(ModBlocks.BASALT_CABINET));
        itemModelGenerator.register(ModBlocks.BLACKSTONE_CABINET.asItem(),registerItemBlockModel(ModBlocks.BLACKSTONE_CABINET));
        itemModelGenerator.register(ModBlocks.OBSIDIAN_CABINET.asItem(),registerItemBlockModel(ModBlocks.OBSIDIAN_CABINET));

        itemModelGenerator.register(ModItems.BLACK_PEPPER_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.WOODEN_WHISK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_WHISK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_WHISK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_WHISK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_WHISK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_WHISK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_WHISK, Models.HANDHELD);

        itemModelGenerator.register(ModItems.AMETHYST_KNIFE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.KNEADING_STICK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SPATULA, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FILTER, Models.GENERATED);

        itemModelGenerator.register(ModItems.AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.BLACK_TRUFFLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_TRUFFLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICE_BRICK, Models.GENERATED);

        itemModelGenerator.register(ModItems.EGG_TART, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLE_PUDDING, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRAISED_SHRIMP_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MATCHA_PUDDING, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUNFLOWER_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUNFLOWER_SEED_PEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUNFLOWER_SEED_PULP, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_SUNFLOWER_SEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.OIL_IMPURITY, Models.GENERATED);
        itemModelGenerator.register(ModItems.VEGETABLE_OIL_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.VEGETABLE_OIL_BUCKET, Models.GENERATED);

        itemModelGenerator.register(ModItems.TRUFFLE_EGG_TART, Models.GENERATED);

        itemModelGenerator.register(ModItems.POTATO_STARCH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIXED_DOUGH, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHEAT_FLOUR, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUDDING_WIP_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUDDING_WIP_2, Models.GENERATED);

        itemModelGenerator.register(ModItems.MASHED_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAUCE_MASHED_POTATO, Models.GENERATED);

        itemModelGenerator.register(ModItems.APPLE_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY_BOMB, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUTTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);

        itemModelGenerator.register(ModItems.ANCIENT_SCRAP, Models.GENERATED);

        itemModelGenerator.register(ModItems.BREAD_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUTTER_BREAD_SLICE, Models.GENERATED);

        itemModelGenerator.register(ModItems.CREAM_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLE_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOLATE_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_APPLE_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MATCHA_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKIN_CREAM, Models.GENERATED);

        itemModelGenerator.register(ModItems.MOUSSE_WIP, Models.GENERATED);
        itemModelGenerator.register(ModItems.CREAM_MOUSSE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY_MOUSSE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOLATE_MOUSSE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKIN_MOUSSE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_APPLE_MOUSSE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MATCHA_MOUSSE, Models.GENERATED);

        itemModelGenerator.register(ModItems.CRYSTAL_DUMPLING, Models.GENERATED);

        itemModelGenerator.register(ModItems.SQUID, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_SQUID, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUTTLEBONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOW_SQUID, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_GLOW_SQUID, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOW_CUTTLEBONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRAWN, Models.GENERATED);

        itemModelGenerator.register(ModItems.SAUSAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SECTIONED_SAUSAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRILLED_SAUSAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STARCH_SAUSAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRILLED_STARCH_SAUSAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LITTLE_OCTOPUS_SAUSAGE, Models.GENERATED);

        itemModelGenerator.register(ModItems.EMPTY_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_ORCHID_FLOWER_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LILAC_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_TULIP_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_TULIP_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.OXEYE_DAISY_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUNFLOWER_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_TULIP_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WITHER_ROSE_CAKE, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_ONION_RING, Models.GENERATED);
        itemModelGenerator.register(ModItems.ONION_RING, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIED_COD, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIED_SALMON, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIED_MILK_WIP, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIED_MILK, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIED_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_POTATO_CHIP, Models.GENERATED);
        itemModelGenerator.register(ModItems.POTATO_CHIP, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIED_DOUGH_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKEN_FILLET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_CHICKEN_FILLET, Models.GENERATED);

    }
    private static Model registerItemBlockModel(Block parent, TextureKey ... requiredTextureKeys) {
        String name = ModelIds.getBlockModelId(parent).getPath();
        return new Model(Optional.of(new Identifier(Bakingdelight.MOD_ID, name)), Optional.empty(), requiredTextureKeys);
    }
}

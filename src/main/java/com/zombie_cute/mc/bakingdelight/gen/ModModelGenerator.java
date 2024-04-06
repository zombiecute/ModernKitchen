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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MASHED_POTATO_BLOCK);
        blockStateModelGenerator.registerSimpleState(ModBlocks.RAW_PIZZA);
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

    }
    private static Model registerItemBlockModel(Block parent, TextureKey ... requiredTextureKeys) {
        String name = ModelIds.getBlockModelId(parent).getPath();
        return new Model(Optional.of(new Identifier(Bakingdelight.MOD_ID, name)), Optional.empty(), requiredTextureKeys);
    }
}

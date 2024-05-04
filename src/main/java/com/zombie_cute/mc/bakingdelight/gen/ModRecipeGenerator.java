package com.zombie_cute.mc.bakingdelight.gen;

import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.item.ModItems;
import com.zombie_cute.mc.bakingdelight.tag.ForgeTagKeys;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BLACK_PEPPER_DUST, 1)
                .input(ForgeTagKeys.CROP_BLACK_PEPPER)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BLACK_PEPPER_CORN),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BLACK_PEPPER_CORN))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CREAM, 3)
                .input(ModItems.CREAM_BUCKET)
                .input(Items.BOWL).input(Items.BOWL).input(Items.BOWL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CREAM_BUCKET),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CREAM_BUCKET))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHERRY_CREAM, 1)
                .input(ModItems.CREAM)
                .input(ModItems.CHERRY).input(ModItems.CHERRY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CREAM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CREAM))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHOCOLATE_CREAM, 1)
                .input(ModItems.CREAM)
                .input(Items.COCOA_BEANS).input(Items.COCOA_BEANS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CREAM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CREAM))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_APPLE_CREAM, 1)
                .input(ModItems.CREAM)
                .input(Items.GOLDEN_APPLE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CREAM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CREAM))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MATCHA_CREAM, 1)
                .input(ModItems.CREAM)
                .input(ItemTags.LEAVES).input(ItemTags.LEAVES).input(ItemTags.LEAVES).input(ItemTags.LEAVES).input(ItemTags.LEAVES)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CREAM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CREAM))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BUTTER_BREAD_SLICE, 1)
                .input(ModItems.BUTTER)
                .input(ModItems.BREAD_SLICE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.APPLE_CREAM, 1)
                .input(ModItems.CREAM)
                .input(ModItems.APPLE_PETAL).input(ModItems.APPLE_PETAL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.TRUFFLE_EGG_TART, 1)
                .input(ModItems.EGG_TART)
                .input(ModItems.BLACK_TRUFFLE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BLACK_TRUFFLE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BLACK_TRUFFLE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PUDDING_WIP_1, 8)
                .input(Items.EGG)
                .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .input(ModItems.BUTTER)
                .criterion(FabricRecipeProvider.hasItem(ModItems.BUTTER),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BUTTER))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MOUSSE_WIP, 12)
                .input(Items.EGG)
                .input(ModItems.CREAM_BUCKET)
                .input(Items.SUGAR)
                .input(ModItems.BUTTER)
                .input(Items.WHEAT)
                .input(Items.WHEAT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CREAM_BUCKET),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CREAM_BUCKET))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.VEGETABLE_OIL_BOTTLE, 3)
                .input(ModItems.VEGETABLE_OIL_BUCKET)
                .input(Items.GLASS_BOTTLE)
                .input(Items.GLASS_BOTTLE)
                .input(Items.GLASS_BOTTLE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.VEGETABLE_OIL_BUCKET),
                        FabricRecipeProvider.conditionsFromItem(ModItems.VEGETABLE_OIL_BUCKET))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.EMPTY_CAKE, 4)
                .input(ForgeTagKeys.C_DOUGH)
                .input(ForgeTagKeys.C_DOUGH)
                .input(ForgeTagKeys.C_DOUGH)
                .input(Items.MILK_BUCKET)
                .criterion(FabricRecipeProvider.hasItem(Items.MILK_BUCKET),
                        FabricRecipeProvider.conditionsFromItem(Items.MILK_BUCKET))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BLUE_ORCHID_FLOWER_CAKE)
                .input(Items.BLUE_ORCHID)
                .input(Items.SUGAR)
                .input(ModItems.EMPTY_CAKE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.EMPTY_CAKE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.EMPTY_CAKE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHERRY_CAKE)
                .input(ModItems.CHERRY)
                .input(Items.SUGAR)
                .input(ModItems.EMPTY_CAKE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.EMPTY_CAKE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.EMPTY_CAKE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.LILAC_CAKE)
                .input(Items.LILAC)
                .input(Items.SUGAR)
                .input(ModItems.EMPTY_CAKE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.EMPTY_CAKE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.EMPTY_CAKE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.ORANGE_TULIP_CAKE)
                .input(Items.ORANGE_TULIP)
                .input(Items.SUGAR)
                .input(ModItems.EMPTY_CAKE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.EMPTY_CAKE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.EMPTY_CAKE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.OXEYE_DAISY_CAKE)
                .input(Items.OXEYE_DAISY)
                .input(Items.SUGAR)
                .input(ModItems.EMPTY_CAKE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.EMPTY_CAKE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.EMPTY_CAKE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PINK_TULIP_CAKE)
                .input(Items.PINK_TULIP)
                .input(Items.SUGAR)
                .input(ModItems.EMPTY_CAKE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.EMPTY_CAKE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.EMPTY_CAKE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.ROSE_CAKE)
                .input(Items.ROSE_BUSH)
                .input(Items.SUGAR)
                .input(ModItems.EMPTY_CAKE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.EMPTY_CAKE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.EMPTY_CAKE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SUNFLOWER_CAKE)
                .input(Items.SUNFLOWER)
                .input(Items.SUGAR)
                .input(ModItems.EMPTY_CAKE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.EMPTY_CAKE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.EMPTY_CAKE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.WHITE_TULIP_CAKE)
                .input(Items.WHITE_TULIP)
                .input(Items.SUGAR)
                .input(ModItems.EMPTY_CAKE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.EMPTY_CAKE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.EMPTY_CAKE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.WITHER_ROSE_CAKE)
                .input(Items.WITHER_ROSE)
                .input(Items.SUGAR)
                .input(ModItems.EMPTY_CAKE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.EMPTY_CAKE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.EMPTY_CAKE))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.FRIED_MILK_WIP,3)
                .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .input(ForgeTagKeys.C_FLOUR)
                .input(Items.EGG)
                .criterion(FabricRecipeProvider.hasItem(ModItems.EMPTY_CAKE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.EMPTY_CAKE))
                .offerTo(exporter);









        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModBlocks.MASHED_POTATO_BLOCK)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .input('A',ModItems.MASHED_POTATO)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MASHED_POTATO),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MASHED_POTATO))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.WOODEN_WHISK)
                .pattern("I")
                .pattern("N")
                .pattern("S")
                .input('I', ItemTags.PLANKS)
                .input('N', ItemTags.WOODEN_SLABS)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_WHISK)
                .pattern("I")
                .pattern("N")
                .pattern("S")
                .input('I', Items.COPPER_BLOCK)
                .input('N', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IRON_WHISK)
                .pattern("I")
                .pattern("N")
                .pattern("S")
                .input('I', Items.IRON_INGOT)
                .input('N', Items.IRON_NUGGET)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.GOLDEN_WHISK)
                .pattern("I")
                .pattern("N")
                .pattern("S")
                .input('I', Items.GOLD_INGOT)
                .input('N', Items.GOLD_NUGGET)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMETHYST_WHISK)
                .pattern("III")
                .pattern("INI")
                .pattern(" S ")
                .input('I', Items.AMETHYST_SHARD)
                .input('N', Items.REDSTONE_BLOCK)
                .input('S', Items.IRON_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_WHISK)
                .pattern("I")
                .pattern("N")
                .pattern("S")
                .input('I', Items.DIAMOND)
                .input('N', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND),
                        FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMETHYST_AXE)
                .pattern("AB")
                .pattern("AR")
                .pattern(" I")
                .input('I', Items.IRON_INGOT)
                .input('A', Items.AMETHYST_SHARD)
                .input('R', Items.REDSTONE_BLOCK)
                .input('B', Items.AMETHYST_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMETHYST_HOE)
                .pattern("AB")
                .pattern(" R")
                .pattern(" I")
                .input('I', Items.IRON_INGOT)
                .input('A', Items.AMETHYST_SHARD)
                .input('R', Items.REDSTONE_BLOCK)
                .input('B', Items.AMETHYST_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMETHYST_SHOVEL)
                .pattern("ABA")
                .pattern("ARA")
                .pattern(" I ")
                .input('I', Items.IRON_INGOT)
                .input('A', Items.AMETHYST_SHARD)
                .input('R', Items.REDSTONE_BLOCK)
                .input('B', Items.AMETHYST_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMETHYST_PICKAXE)
                .pattern("ABA")
                .pattern(" R ")
                .pattern(" I ")
                .input('I', Items.IRON_INGOT)
                .input('A', Items.AMETHYST_SHARD)
                .input('R', Items.REDSTONE_BLOCK)
                .input('B', Items.AMETHYST_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMETHYST_SWORD)
                .pattern("B")
                .pattern("R")
                .pattern("I")
                .input('I', Items.IRON_INGOT)
                .input('R', Items.REDSTONE_BLOCK)
                .input('B', Items.AMETHYST_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_KNIFE)
                .pattern("C")
                .pattern("S")
                .input('C', Items.COPPER_BLOCK)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMETHYST_KNIFE)
                .pattern("  A")
                .pattern("RA ")
                .pattern("IR ")
                .input('A', Items.AMETHYST_SHARD)
                .input('R', Items.REDSTONE)
                .input('I', Items.IRON_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GLASS_BOWL)
                .pattern("G G")
                .pattern("GGG")
                .input('G', Items.GLASS)
                .criterion(FabricRecipeProvider.hasItem(Items.GLASS),
                        FabricRecipeProvider.conditionsFromItem(Items.GLASS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHERRY_BOMB)
                .pattern(" G ")
                .pattern("GCG")
                .pattern(" G ")
                .input('G', Items.GUNPOWDER)
                .input('C', ModItems.CHERRY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CHERRY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CHERRY))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ADVANCE_FURNACE)
                .pattern("IFI")
                .pattern("CGC")
                .pattern("CTC")
                .input('F', Items.FURNACE)
                .input('T', Items.IRON_TRAPDOOR)
                .input('G', Items.COPPER_BLOCK)
                .input('I', Items.IRON_INGOT)
                .input('C', Items.DEEPSLATE)
                .criterion(FabricRecipeProvider.hasItem(Items.FURNACE),
                        FabricRecipeProvider.conditionsFromItem(Items.FURNACE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FREEZER)
                .pattern("GGG")
                .pattern("GPG")
                .pattern("GRB")
                .input('G', Items.IRON_INGOT)
                .input('B', Items.IRON_TRAPDOOR)
                .input('P', Items.CHEST)
                .input('R', Items.REDSTONE)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.KNEADING_STICK)
                .pattern("  S")
                .pattern(" P ")
                .pattern("S  ")
                .input('S', Items.STICK)
                .input('P', ItemTags.PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BAKING_TRAY)
                .pattern("B B")
                .pattern("III")
                .input('I', Items.IRON_INGOT)
                .input('B', Items.BRICK)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DEEP_FRYER)
                .pattern("  I")
                .pattern("IKI")
                .pattern("BBB")
                .input('I', Items.IRON_INGOT)
                .input('B', Items.QUARTZ_BLOCK)
                .input('K', ModBlocks.DEEP_FRY_BASKET)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CROWBAR)
                .pattern(" NB")
                .pattern(" IN")
                .pattern("I  ")
                .input('I', Items.STICK)
                .input('N', Items.IRON_INGOT)
                .input('B', Items.IRON_HOE)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_HOE),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_HOE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SPATULA)
                .pattern(" NB")
                .pattern(" IN")
                .pattern("I  ")
                .input('I', Items.STICK)
                .input('N', Items.IRON_NUGGET)
                .input('B', Items.IRON_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WOODEN_BASIN)
                .pattern("P P")
                .pattern("PSP")
                .input('P', ItemTags.PLANKS)
                .input('S', ItemTags.WOODEN_SLABS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FILTER)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', Items.STRING)
                .criterion(FabricRecipeProvider.hasItem(Items.STRING),
                        FabricRecipeProvider.conditionsFromItem(Items.STRING))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GAS_CANISTER)
                .pattern(" C ")
                .pattern("ITI")
                .pattern("III")
                .input('C', Items.COMPASS)
                .input('I', Items.IRON_INGOT)
                .input('T', Items.IRON_TRAPDOOR)
                .criterion(FabricRecipeProvider.hasItem(Items.COMPASS),
                        FabricRecipeProvider.conditionsFromItem(Items.COMPASS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BIOGAS_DIGESTER_CONTROLLER)
                .pattern("DAD")
                .pattern("ICI")
                .pattern("PRP")
                .input('A', Items.COMPASS)
                .input('I', Items.IRON_INGOT)
                .input('P', Items.COPPER_INGOT)
                .input('C', Items.COPPER_BLOCK)
                .input('R', Items.REDSTONE_BLOCK)
                .input('D', Items.QUARTZ)
                .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ),
                        FabricRecipeProvider.conditionsFromItem(Items.QUARTZ))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BIOGAS_DIGESTER_IO)
                .pattern("PHP")
                .pattern("ICI")
                .pattern("PRP")
                .input('H', Items.HOPPER)
                .input('I', Items.IRON_INGOT)
                .input('P', Items.COPPER_INGOT)
                .input('C', Items.CHEST)
                .input('R', Items.REDSTONE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GAS_COOKING_STOVE)
                .pattern("IPI")
                .pattern("SQS")
                .pattern("CRC")
                .input('S', Items.IRON_INGOT)
                .input('I', Items.FLINT_AND_STEEL)
                .input('P', Items.IRON_TRAPDOOR)
                .input('C', Items.COPPER_INGOT)
                .input('R', Items.REDSTONE_BLOCK)
                .input('Q', Items.QUARTZ)
                .criterion(FabricRecipeProvider.hasItem(Items.QUARTZ),
                        FabricRecipeProvider.conditionsFromItem(Items.QUARTZ))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DEEP_FRY_BASKET)
                .pattern("BBS")
                .pattern("BB ")
                .input('S', Items.STICK)
                .input('B', Items.IRON_BARS)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_BARS),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_BARS))
                .offerTo(exporter);
    }
}

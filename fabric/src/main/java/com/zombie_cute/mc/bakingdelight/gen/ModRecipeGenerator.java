package com.zombie_cute.mc.bakingdelight.gen;

import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.item.ModItems;
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
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MASHED_POTATO, 9)
                .input(ModBlocks.MASHED_POTATO_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MASHED_POTATO),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MASHED_POTATO))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BLACK_PEPPER_DUST, 1)
                .input(ModItems.BLACK_PEPPER_CORN)
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.OVEN)
                .pattern("GGG")
                .pattern("BPB")
                .pattern("BCB")
                .input('G', Items.IRON_INGOT)
                .input('C', Items.IRON_TRAPDOOR)
                .input('B', Items.BRICK)
                .input('P', Items.GLASS_PANE)
                .criterion(FabricRecipeProvider.hasItem(Items.BRICK),
                        FabricRecipeProvider.conditionsFromItem(Items.BRICK))
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
    }
}

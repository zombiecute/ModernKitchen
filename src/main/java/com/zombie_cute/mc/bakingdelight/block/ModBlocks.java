package com.zombie_cute.mc.bakingdelight.block;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import com.zombie_cute.mc.bakingdelight.block.custom.*;
import com.zombie_cute.mc.bakingdelight.fluid.ModFluid;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.MapColor;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MASHED_POTATO_BLOCK = registerBlock("mashed_potato_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.SAND)
                    .mapColor(MapColor.YELLOW)));
    public static final Block GLASS_BOWL = registerBlock("glass_bowl",
            new GlassBowlBlock(FabricBlockSettings.copyOf(Blocks.GLASS).hardness(0)
                    .mapColor(MapColor.WHITE).nonOpaque()));
    public static final Block BLACK_PEPPER_CROP = registerBlockWithoutItem("black_pepper_crop",
            new BlackPepperCropBlock(FabricBlockSettings.copyOf(Blocks.POTATOES)));
    public static final Block OVEN = registerBlock("oven",
            new OvenBlock(FabricBlockSettings.copyOf(Blocks.BRICKS)
                    .luminance(state -> state.get(OvenBlock.OVEN_BURNING) ? 15 : 0)));
    public static final Block FREEZER = registerBlock("freezer",
            new FreezerBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block WHEAT_DOUGH = registerBlockWithoutItem("wheat_dough",
            new WheatDoughBlock(FabricBlockSettings.copyOf(Blocks.REPEATER).burnable().sounds(BlockSoundGroup.HONEY)
                    .jumpVelocityMultiplier(0.5f).mapColor(MapColor.WHITE).nonOpaque()));
    public static final Block PIZZA_WIP = registerBlockWithoutItem("pizza_wip", new PizzaWIPBlock());
    public static final Block RAW_PIZZA = registerBlockWithoutItem("raw_pizza", new RawPizzaBlock());
    public static final Block PIZZA = registerBlockWithoutItem("pizza", new PizzaBlock());
    public static final Block BAKING_TRAY = registerBlock("baking_tray", new BakingTrayBlock());
    public static final Block DEEP_FRYER = registerBlock("deep_fryer", new DeepFryerBlock());
    public static final Block ADVANCE_FURNACE = registerBlock("advance_furnace", new AdvanceFurnaceBlock());
    public static final Block CREAM_FLUID_BLOCK = registerBlockWithoutItem("cream_fluid_block",
            new FluidBlock(ModFluid.STILL_CREAM,FabricBlockSettings.copyOf(Blocks.WATER)));
    public static final Block WOODEN_BASIN = registerBlock("wooden_basin",
            new WoodenBasinBlock());
    public static final Block VEGETABLE_OIL_FLUID_BLOCK = registerBlockWithoutItem("vegetable_oil_fluid_block",
            new FluidBlock(ModFluid.STILL_VEGETABLE_OIL,FabricBlockSettings.copyOf(Blocks.WATER)));
    public static final Block GAS_CANISTER = registerBlockWithoutItem("gas_canister",
            new GasCanisterBlock());
    public static final Block BIOGAS_DIGESTER_CONTROLLER = registerBlock("biogas_digester_controller",
            new BiogasDigesterControllerBlock());
    public static final Block BIOGAS_DIGESTER_IO = registerBlock("biogas_digester_io",
            new BiogasDigesterIOBlock());
    public static final Block BURNING_GAS_COOKING_STOVE = registerBlock("burning_gas_cooking_stove",
            new BurningGasCookingStoveBlock());
    public static final Block GAS_COOKING_STOVE = registerBlock("gas_cooking_stove",
            new GasCookingStoveBlock());
    public static final Block DEEP_FRY_BASKET = registerBlockWithoutItem("deep_fry_basket",
            new DeepFryBasketBlock());

    public static final BlockItem DEEP_FRY_BASKET_ITEM = Registry.register(Registries.ITEM,new Identifier(Bakingdelight.MOD_ID,"deep_fry_basket"),
            new BlockItem(DEEP_FRY_BASKET,new FabricItemSettings().maxCount(1)));
    public static final BlockItem GAS_CANISTER_ITEM = Registry.register(Registries.ITEM,new Identifier(Bakingdelight.MOD_ID,"gas_canister"),
            new BlockItem(GAS_CANISTER,new FabricItemSettings().maxCount(1)));
    public static final BlockItem PIZZA_ITEM = Registry.register(Registries.ITEM, new Identifier(Bakingdelight.MOD_ID, "pizza"),
            new BlockItem(PIZZA, new FabricItemSettings().maxCount(1)));
    public static final BlockItem RAW_PIZZA_ITEM = Registry.register(Registries.ITEM, new Identifier(Bakingdelight.MOD_ID, "raw_pizza"),
            new BlockItem(RAW_PIZZA, new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(12).saturationModifier(0.1f).build()).maxCount(1)));

    public static final BlockItem PIZZA_WIP_ITEM = Registry.register(Registries.ITEM, new Identifier(Bakingdelight.MOD_ID, "pizza_wip"),
            new BlockItem(PIZZA_WIP, new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(0.1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,200,0),0.3f).build()).maxCount(1)));
    public static final BlockItem WHEAT_DOUGH_ITEM = Registry.register(Registries.ITEM, new Identifier(Bakingdelight.MOD_ID, "wheat_dough"),
            new BlockItem(WHEAT_DOUGH, new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,200,0),0.5f).build())));
    private static Block registerBlockWithoutItem(String name,Block block){
        return Registry.register(Registries.BLOCK,new Identifier(Bakingdelight.MOD_ID,name),block);
    }
    private static Block registerBlock(String name,Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(Bakingdelight.MOD_ID,name),block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Bakingdelight.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        Bakingdelight.LOGGER.info("Registering Mod Blocks for " + Bakingdelight.MOD_ID);
    }
}

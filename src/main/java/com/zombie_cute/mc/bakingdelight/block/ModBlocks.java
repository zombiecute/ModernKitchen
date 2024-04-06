package com.zombie_cute.mc.bakingdelight.block;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import com.zombie_cute.mc.bakingdelight.block.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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

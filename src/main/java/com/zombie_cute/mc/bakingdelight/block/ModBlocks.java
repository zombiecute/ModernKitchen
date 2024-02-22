package com.zombie_cute.mc.bakingdelight.block;

import com.zombie_cute.mc.bakingdelight.Bakingdelight;
import com.zombie_cute.mc.bakingdelight.block.custom.BlackPepperCropBlock;
import com.zombie_cute.mc.bakingdelight.block.custom.FreezerBlock;
import com.zombie_cute.mc.bakingdelight.block.custom.GlassBowlBlock;
import com.zombie_cute.mc.bakingdelight.block.custom.OvenBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
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
            new FreezerBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));


    private static Block registerBlockWithoutItem(String name,Block block){
        return Registry.register(Registries.BLOCK,new Identifier(Bakingdelight.MOD_ID,name),block);
    }
    private static Block registerBlock(String name,Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(Bakingdelight.MOD_ID,name),block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM,new Identifier(Bakingdelight.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        Bakingdelight.LOGGER.info("Registering Mod Blocks for " + Bakingdelight.MOD_ID);
    }
}

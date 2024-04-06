package com.zombie_cute.mc.bakingdelight.gen;

import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.tag.ModTagKeys;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // Whisk Mineable
        getOrCreateTagBuilder(ModTagKeys.WHISK_MINEABLE)
                .add(ModBlocks.MASHED_POTATO_BLOCK);
        getOrCreateTagBuilder(ModTagKeys.WHISK_MINEABLE)
                .add(Blocks.DIRT);
        getOrCreateTagBuilder(ModTagKeys.WHISK_MINEABLE)
                .add(Blocks.DIRT_PATH);
        getOrCreateTagBuilder(ModTagKeys.WHISK_MINEABLE)
                .add(Blocks.GRASS_BLOCK);
        getOrCreateTagBuilder(ModTagKeys.WHISK_MINEABLE)
                .add(Blocks.SAND);
        getOrCreateTagBuilder(ModTagKeys.WHISK_MINEABLE)
                .add(Blocks.RED_SAND);
        getOrCreateTagBuilder(ModTagKeys.WHISK_MINEABLE)
                .add(Blocks.SOUL_SAND);
        getOrCreateTagBuilder(ModTagKeys.WHISK_MINEABLE)
                .add(Blocks.SOUL_SOIL);
        getOrCreateTagBuilder(ModTagKeys.WHISK_MINEABLE)
                .add(Blocks.COARSE_DIRT);
        getOrCreateTagBuilder(ModTagKeys.WHISK_MINEABLE)
                .add(Blocks.MYCELIUM);
        getOrCreateTagBuilder(ModTagKeys.WHISK_MINEABLE)
                .add(Blocks.PODZOL);
        // Mineable
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.OVEN);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.FREEZER);
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.FREEZER);

        getOrCreateTagBuilder(BlockTags.CROPS).add(ModBlocks.BLACK_PEPPER_CROP);
        getOrCreateTagBuilder(BlockTags.BEE_GROWABLES).add(ModBlocks.BLACK_PEPPER_CROP);
        getOrCreateTagBuilder(BlockTags.MAINTAINS_FARMLAND).add(ModBlocks.BLACK_PEPPER_CROP);

    }
}

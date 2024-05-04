package com.zombie_cute.mc.bakingdelight.gen;

import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import com.zombie_cute.mc.bakingdelight.block.custom.BlackPepperCropBlock;
import com.zombie_cute.mc.bakingdelight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModBlockLootGenerator extends FabricBlockLootTableProvider {

    public ModBlockLootGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MASHED_POTATO_BLOCK);
        addDrop(ModBlocks.GLASS_BOWL);
        addDrop(ModBlocks.FREEZER);
        addDrop(ModBlocks.WHEAT_DOUGH);
        addDrop(ModBlocks.PIZZA_WIP);
        addDrop(ModBlocks.RAW_PIZZA);
        addDrop(ModBlocks.BAKING_TRAY);
        addDrop(ModBlocks.DEEP_FRYER);
        addDrop(ModBlocks.ADVANCE_FURNACE);
        addDrop(ModBlocks.OVEN);
        addDrop(ModBlocks.WOODEN_BASIN);
        addDrop(ModBlocks.BIOGAS_DIGESTER_CONTROLLER);
        addDrop(ModBlocks.BIOGAS_DIGESTER_IO);
        addDrop(ModBlocks.GAS_COOKING_STOVE);
        addDrop(ModBlocks.BURNING_GAS_COOKING_STOVE,ModBlocks.GAS_COOKING_STOVE);
        addDrop(ModBlocks.DEEP_FRY_BASKET);

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition
                .builder(ModBlocks.BLACK_PEPPER_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(BlackPepperCropBlock.AGE, 6));
        this.addDrop(ModBlocks.BLACK_PEPPER_CROP,
                this.cropDrops(ModBlocks.BLACK_PEPPER_CROP, Items.STICK, ModItems.BLACK_PEPPER_CORN, builder2));
    }
}

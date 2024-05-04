package com.zombie_cute.mc.bakingdelight.compat.rei.biogas_fermentation;

import com.zombie_cute.mc.bakingdelight.block.ModBlocks;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.Display;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BiogasFermentationDisplay implements Display {

    @Override
    public List<EntryIngredient> getInputEntries() {
        Collection<ItemStack> stacks = new ArrayList<>();
        stacks.add(ModBlocks.BIOGAS_DIGESTER_IO.asItem().getDefaultStack());
        stacks.add(ModBlocks.BIOGAS_DIGESTER_CONTROLLER.asItem().getDefaultStack());
        return List.of(EntryIngredients.ofItemStacks(stacks));
    }

    @Override
    public List<EntryIngredient> getOutputEntries() {
        Collection<ItemStack> itemStacks = new ArrayList<>();
        itemStacks.add(ModBlocks.GAS_CANISTER.asItem().getDefaultStack());
        itemStacks.add(Items.BONE_MEAL.getDefaultStack());
        return List.of(EntryIngredients.ofItemStacks(itemStacks));
    }


    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return BiogasFermentationCategory.BIOGAS_FERMENTATION;
    }

}

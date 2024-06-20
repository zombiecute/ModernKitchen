package com.zombie_cute.mc.bakingdelight.util;

import com.zombie_cute.mc.bakingdelight.tag.ModTagKeys;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.HashSet;

public class ModUtil {
    public static final String SHIFT_FRONT = "bakingdelight.tooltips.shift_front";
    public static final String SHIFT_END = "bakingdelight.tooltips.shift_end";
    public static final String WHISK_1 = "bakingdelight.tooltips.whisk_1";
    public static final String WHISK_2 = "bakingdelight.tooltips.whisk_2";
    public static final String BUTTER_1 = "bakingdelight.tooltips.butter_1";
    public static final String BUTTER_2 = "bakingdelight.tooltips.butter_2";
    public static final String CUTTLEBONE = "bakingdelight.tooltips.cuttlebone";
    public static final String TRUFFLE = "bakingdelight.tooltips.truffle";
    public static final String FILTER_1 = "bakingdelight.tooltips.filter_1";
    public static final String FILTER_2 = "bakingdelight.tooltips.filter_2";
    public static final String KNEADING_STICK = "bakingdelight.tooltips.kneading_stick";
    public static final String SPATULA = "bakingdelight.tooltips.spatula";
    public static final String BDC_1 = "bakingdelight.tooltips.bdc_1";
    public static final String BDC_2 = "bakingdelight.tooltips.bdc_2";
    public static final String BDC_3 = "bakingdelight.tooltips.bdc_3";
    public static final String BDI_1 = "bakingdelight.tooltips.bdi_1";
    public static final String BDI_2 = "bakingdelight.tooltips.bdi_2";
    public static final String BDI_3 = "bakingdelight.tooltips.bdi_3";
    public static final String BDI_4 = "bakingdelight.tooltips.bdi_4";
    public static final String GAS_COOKING_STOVE_1 = "bakingdelight.tooltips.gas_cooking_stove_1";
    public static final String GAS_COOKING_STOVE_2 = "bakingdelight.tooltips.gas_cooking_stove_2";
    public static final String GAS_COOKING_STOVE_3 = "bakingdelight.tooltips.gas_cooking_stove_3";
    public static final String CROWBAR = "bakingdelight.tooltips.crowbar";
    public static final String PIZZA_INGREDIENTS = "bakingdelight.tooltips.pizza_ingredients";
    public static final String BAKING_TRAY_1 = "bakingdelight.tooltips.baking_tray_1";
    public static final String BAKING_TRAY_2 = "bakingdelight.tooltips.baking_tray_2";
    public static final String BAKING_TRAY_3 = "bakingdelight.tooltips.baking_tray_3";
    public static final String DEEP_FRYER_1 = "bakingdelight.tooltips.deep_fryer_1";
    public static final String DEEP_FRYER_2 = "bakingdelight.tooltips.deep_fryer_2";
    public static final String DEEP_FRYER_3 = "bakingdelight.tooltips.deep_fryer_3";
    public static final String WOODEN_BASIN_1 = "bakingdelight.tooltips.wooden_basin_1";
    public static final String WOODEN_BASIN_2 = "bakingdelight.tooltips.wooden_basin_2";
    public static final String WOODEN_BASIN_3 = "bakingdelight.tooltips.wooden_basin_3";
    public static final String DFB = "bakingdelight.tooltips.dfb";

    public static MutableText getShiftText(boolean hasDown){
        MutableText mutableText = Text.translatable(SHIFT_FRONT).formatted(Formatting.DARK_GRAY);
        mutableText.append(Text.literal("[").formatted(Formatting.DARK_GRAY));
        if (hasDown){
            mutableText.append(Text.literal("Shift").formatted(Formatting.WHITE));
        } else {
            mutableText.append(Text.literal("Shift").formatted(Formatting.GRAY));
        }
        mutableText.append(Text.literal("]").formatted(Formatting.DARK_GRAY));
        mutableText.append(Text.translatable(SHIFT_END).formatted(Formatting.DARK_GRAY));
        return mutableText;
    }

    public static boolean isCrowbar(PlayerEntity player) {
        Item item = player.getMainHandStack().getItem();
        HashSet<Item> items = new HashSet<>();
        for (RegistryEntry<Item> registryEntry: Registries.ITEM.iterateEntries(ModTagKeys.CROWBARS)){
            items.add(registryEntry.value());
        }
        return items.contains(item);
    }
}

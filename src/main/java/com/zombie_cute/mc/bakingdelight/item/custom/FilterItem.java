package com.zombie_cute.mc.bakingdelight.item.custom;

import com.zombie_cute.mc.bakingdelight.util.ToolTips;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FilterItem extends ToolItem {
    public FilterItem(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()){
            MutableText mutableText = Text.translatable(ToolTips.SHIFT_FRONT).formatted(Formatting.DARK_GRAY);
            mutableText.append(Text.literal("[SHIFT]")).formatted(Formatting.WHITE);
            mutableText.append(Text.translatable(ToolTips.SHIFT_END)).formatted(Formatting.DARK_GRAY);
            tooltip.add(mutableText);
            tooltip.add(Text.literal(" "));
            tooltip.add(Text.translatable(ToolTips.FILTER_1).formatted(Formatting.GOLD));
            tooltip.add(Text.translatable(ToolTips.FILTER_2).formatted(Formatting.GOLD));
        } else {
            MutableText mutableText = Text.translatable(ToolTips.SHIFT_FRONT).formatted(Formatting.DARK_GRAY);
            mutableText.append(Text.literal("[SHIFT]")).formatted(Formatting.GRAY);
            mutableText.append(Text.translatable(ToolTips.SHIFT_END)).formatted(Formatting.DARK_GRAY);
            tooltip.add(mutableText);
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}

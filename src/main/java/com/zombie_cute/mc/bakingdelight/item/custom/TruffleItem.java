package com.zombie_cute.mc.bakingdelight.item.custom;

import com.zombie_cute.mc.bakingdelight.util.ToolTips;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TruffleItem extends Item {
    public TruffleItem(Settings settings) {
        super(settings);
    }
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context){
        if(Screen.hasShiftDown()){
            tooltip.add(ToolTips.getShiftText(true));
            tooltip.add(Text.literal(" "));
            tooltip.add(Text.translatable(ToolTips.TRUFFLE).formatted(Formatting.GOLD));
        }else {
            tooltip.add(ToolTips.getShiftText(false));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}

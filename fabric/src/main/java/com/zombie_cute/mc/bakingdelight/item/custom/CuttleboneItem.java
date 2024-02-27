package com.zombie_cute.mc.bakingdelight.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.zombie_cute.mc.bakingdelight.item.custom.WhiskItem.TOOL_TIP_0;

public class CuttleboneItem extends Item {
    public CuttleboneItem(Settings settings) {
        super(settings);
    }
    public static final String CUTTLEBONE_TOOL_TIP_1 = "tooltips.bakingdelight.cuttlebone_tool_tip_1";
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context){
        if(Screen.hasShiftDown()){
            tooltip.add(Text.translatable(CUTTLEBONE_TOOL_TIP_1).formatted(Formatting.AQUA));
        }else {
            tooltip.add(Text.translatable(TOOL_TIP_0).formatted(Formatting.GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}

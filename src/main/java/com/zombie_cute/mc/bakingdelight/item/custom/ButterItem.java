package com.zombie_cute.mc.bakingdelight.item.custom;

import com.zombie_cute.mc.bakingdelight.entity.custom.ButterEntity;
import com.zombie_cute.mc.bakingdelight.sound.ModSounds;
import com.zombie_cute.mc.bakingdelight.util.ToolTips;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.stat.Stats;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ButterItem extends Item {
    public ButterItem(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack heldStack = player.getStackInHand(hand);
        player.getItemCooldownManager().set(this, 10);
        world.playSound(null, player.getX(), player.getY(), player.getZ(), ModSounds.ENTITY_BUTTER_SHOOT,
                SoundCategory.NEUTRAL, 1.5f, 0.4f / world.getRandom().nextFloat() * 0.4f + 0.8f);
        if (!world.isClient()) {
            ButterEntity projectile = new ButterEntity(world, player);
            projectile.setItem(heldStack);
            projectile.setVelocity(player, player.getPitch(), player.getYaw(), 0.3f, 1.8f, 1.5f);
            world.spawnEntity(projectile);
        }

        player.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!player.getAbilities().creativeMode) {
            heldStack.decrement(1);
        }

        return TypedActionResult.success(heldStack, world.isClient());
    }
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context){
        if(Screen.hasShiftDown()){
            MutableText mutableText = Text.translatable(ToolTips.SHIFT_FRONT).formatted(Formatting.DARK_GRAY);
            mutableText.append(Text.literal("[SHIFT]")).formatted(Formatting.WHITE);
            mutableText.append(Text.translatable(ToolTips.SHIFT_END)).formatted(Formatting.DARK_GRAY);
            tooltip.add(mutableText);
            tooltip.add(Text.literal(" "));
            tooltip.add(Text.translatable(ToolTips.BUTTER_1).formatted(Formatting.GOLD));
            tooltip.add(Text.translatable(ToolTips.BUTTER_2).formatted(Formatting.GOLD));
        }else {
            MutableText mutableText = Text.translatable(ToolTips.SHIFT_FRONT).formatted(Formatting.DARK_GRAY);
            mutableText.append(Text.literal("[SHIFT]")).formatted(Formatting.GRAY);
            mutableText.append(Text.translatable(ToolTips.SHIFT_END)).formatted(Formatting.DARK_GRAY);
            tooltip.add(mutableText);
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}

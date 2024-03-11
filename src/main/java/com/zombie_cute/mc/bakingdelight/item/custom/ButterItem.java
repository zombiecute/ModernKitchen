package com.zombie_cute.mc.bakingdelight.item.custom;

import com.zombie_cute.mc.bakingdelight.entity.custom.ButterEntity;
import com.zombie_cute.mc.bakingdelight.sound.ModSounds;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.zombie_cute.mc.bakingdelight.item.custom.WhiskItem.TOOL_TIP_0;

public class ButterItem extends Item {
    public ButterItem(Settings settings) {
        super(settings);
    }
    public static final String BUTTER_TOOL_TIP_0 = "tooltips.bakingdelight.butter_tool_tip_0";
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
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable(BUTTER_TOOL_TIP_0).formatted(Formatting.DARK_GREEN));
        } else {
            tooltip.add(Text.translatable(TOOL_TIP_0).formatted(Formatting.GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}

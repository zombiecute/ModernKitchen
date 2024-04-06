package com.zombie_cute.mc.bakingdelight.item.custom;

import com.zombie_cute.mc.bakingdelight.item.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SunFlowerSeedItem extends Item {
    public SunFlowerSeedItem() {
        super(new FabricItemSettings()
                .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).snack().build()));
    }
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        user.dropStack(ModItems.SUNFLOWER_SEED_PEEL.getDefaultStack(),0.5f);
        return super.finishUsing(stack, world, user);
    }
}

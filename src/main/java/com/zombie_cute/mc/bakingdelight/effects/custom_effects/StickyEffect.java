package com.zombie_cute.mc.bakingdelight.effects.custom_effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.particle.ParticleTypes;

public class StickyEffect extends StatusEffect {
    public StickyEffect() {
        super(StatusEffectCategory.HARMFUL, 0xB4C92A);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (!entity.getWorld().getBlockState(entity.getBlockPos().down()).isAir()){
            entity.setVelocity(0,0,0);
        }
        entity.getWorld().addParticle(ParticleTypes.LANDING_HONEY,true,entity.getX(),entity.getY() + 1,entity.getZ(),1,1,1);
        super.applyUpdateEffect(entity, amplifier);
    }
}

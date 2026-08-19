package dev.lazuline.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class BloodParchedEffect extends StatusEffect {
    public BloodParchedEffect() {

        super(StatusEffectCategory.HARMFUL, 0x780606);
    }
    // This method is called every tick to check whether it should apply the status effect or not
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        //this makes it apply the status effect every tick.
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {

            ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 2, 0, false, false));
            ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2, 0, false, false));

        }
    }
}

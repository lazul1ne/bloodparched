package dev.lazuline.enchantment;

import dev.lazuline.BloodParched;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

import java.util.Random;


public class LeechEnchantment extends Enchantment { ;

    public LeechEnchantment() {
        super(Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }

    @Override
    public int getMinPower(int level) { return (level - 1) * 11; }

    @Override
    public int getMaxLevel() {
        return 3;
    }
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity e) {
            int baseHealing = 2;
            double randDouble = Math.random();
            //BloodParched.LOGGER.info("Random number was: " + randDouble);

            if(level == 1 && randDouble <= 0.33D){
                user.heal(baseHealing * (level));

            }else if(level == 2 && randDouble <= 0.66D){
                user.heal(baseHealing * (level));

            }else if (level == 3 && randDouble <= 0.90D){
                user.heal(baseHealing * (level/2));
            }
        super.onTargetDamaged(user, target, level);
    }
        }
}

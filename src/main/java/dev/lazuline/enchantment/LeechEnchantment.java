package dev.lazuline.enchantment;

import dev.lazuline.BloodParched;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;



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

            if (Math.random() < level * 0.3) {
                user.heal(baseHealing * level);
            }
        super.onTargetDamaged(user, target, level);
    }
        }
}

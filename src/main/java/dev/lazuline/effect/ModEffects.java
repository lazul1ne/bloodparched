package dev.lazuline.effect;

import dev.lazuline.BloodParched;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final StatusEffect BLOOD_PARCHED = Registry.register(
            Registries.STATUS_EFFECT,
            new Identifier(BloodParched.MOD_ID, "bloodparched"),
            new BloodParchedEffect()
    );

    public static void registerModEffects(){
        BloodParched.LOGGER.info("Registering " + BloodParched.MOD_ID +"'s effects.");

    }
}

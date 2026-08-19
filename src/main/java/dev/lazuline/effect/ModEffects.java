package dev.lazuline.effect;

import dev.lazuline.BloodParched;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static void registerModEffects(){
        BloodParched.LOGGER.info("Registering " + BloodParched.MOD_ID +"'s effects.");
        Registry.register(Registries.STATUS_EFFECT, new Identifier(BloodParched.MOD_ID, "bloodparched"),
                new BloodParchedEffect());

    }
}

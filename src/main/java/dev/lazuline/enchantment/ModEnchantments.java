package dev.lazuline.enchantment;

import dev.lazuline.BloodParched;
import dev.lazuline.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    public static void registerModEnchantments(){
        BloodParched.LOGGER.info("Registering " + BloodParched.MOD_ID +"'s enchantments.");

        Registry.register(Registries.ENCHANTMENT, new Identifier(BloodParched.MOD_ID, "leech"),
                new LeechEnchantment());
    }
}

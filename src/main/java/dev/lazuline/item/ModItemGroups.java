package dev.lazuline.item;

import dev.lazuline.BloodParched;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup Parched_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BloodParched.MOD_ID, "parched"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.parched"))
                    .icon(() -> new ItemStack(ModItems.COAGULATED_BLOOD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COAGULATED_BLOOD);


                    }).build());


    public static void registerModItemGroups(){
        BloodParched.LOGGER.info("Registering " + BloodParched.MOD_ID + "'s Item Groups.");
    }
}

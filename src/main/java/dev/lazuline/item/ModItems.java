package dev.lazuline.item;

import dev.lazuline.BloodParched;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item COAGULATED_BLOOD = registerItem("coagulated_blood", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(BloodParched.MOD_ID, name),item);


    }

    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(COAGULATED_BLOOD);

    }

    public static void registerModItems(){
        BloodParched.LOGGER.info("Registering " + BloodParched.MOD_ID +"'s mod items.");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}

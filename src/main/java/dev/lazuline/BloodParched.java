package dev.lazuline;

import dev.lazuline.item.ModItemGroups;
import dev.lazuline.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BloodParched implements ModInitializer {
	public static final String MOD_ID = "bloodparched";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!!!");
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}

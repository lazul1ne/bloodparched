package dev.lazuline;

import dev.lazuline.effect.ModEffects;
import dev.lazuline.enchantment.ModEnchantments;
import dev.lazuline.item.ModItemGroups;
import dev.lazuline.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BloodParched implements ModInitializer {
	public static final String MOD_ID = "bloodparched";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private boolean isVampire = false;

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!!!");
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();
		ModEnchantments.registerModEnchantments();
		ModEffects.registerModEffects();

		//registerCommands();
	}
	/*private void registerCommands() {
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
			dispatcher.register(CommandManager.literal("bloodparched")
					.requires(source -> source.hasPermissionLevel(3))
					.then(CommandManager.literal("vampire")



	}*/

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}

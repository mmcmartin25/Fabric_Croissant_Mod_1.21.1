package net.michael.croissantmod;

import net.fabricmc.api.ModInitializer;

import net.michael.croissantmod.block.ModBlocks;
import net.michael.croissantmod.item.ModItemGroups;
import net.michael.croissantmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CroissantMod implements ModInitializer {
	public static final String MOD_ID = "croissantmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
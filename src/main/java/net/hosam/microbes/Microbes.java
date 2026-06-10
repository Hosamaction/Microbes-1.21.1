package net.hosam.microbes;

import net.fabricmc.api.ModInitializer;

import net.hosam.microbes.block.ModBlocks;
import net.hosam.microbes.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Microbes implements ModInitializer {
	public static final String MOD_ID = "microbes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
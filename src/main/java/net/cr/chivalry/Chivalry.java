package net.cr.chivalry;


import net.cr.chivalry.item.ModItemGroups;
import net.cr.chivalry.item.ModItems;
import net.cr.chivalry.util.ModCustomTrades;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chivalry implements ModInitializer {
	public static final String MOD_ID = "chivalry";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();

		ModCustomTrades.registerCustomTrades();
	}
}
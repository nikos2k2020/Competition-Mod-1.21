package net.nikolas2k2020.competition;

import net.fabricmc.api.ModInitializer;

import net.nikolas2k2020.competition.block.ModBlocks;
import net.nikolas2k2020.competition.item.advanced.ModItemGroups;
import net.nikolas2k2020.competition.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompetitionMod implements ModInitializer {
	public static final String MOD_ID = "competition";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registeringModBlocks();
	}
}
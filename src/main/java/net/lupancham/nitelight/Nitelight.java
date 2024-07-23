package net.lupancham.nitelight;

import net.fabricmc.api.ModInitializer;

import net.lupancham.nitelight.datagen.item.ModItemGroups;
import net.lupancham.nitelight.datagen.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Nitelight implements ModInitializer {
	public static final String MOD_ID = "nitelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModItemGroups.registerItemGroups();
	}
}
package net.redoptic.boozinmod;

import net.fabricmc.api.ModInitializer;

import net.redoptic.boozinmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoozinMod implements ModInitializer {
	public static final String MOD_ID = "boozinmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
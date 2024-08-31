package net.redoptic.boozinmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.redoptic.boozinmod.block.ModBlocks;
import net.redoptic.boozinmod.item.ModItemGroups;
import net.redoptic.boozinmod.item.ModItems;
import net.redoptic.boozinmod.mixin.ItemRendererAccessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoozinMod implements ModInitializer {
	public static final String MOD_ID = "boozinmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.load();
	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}

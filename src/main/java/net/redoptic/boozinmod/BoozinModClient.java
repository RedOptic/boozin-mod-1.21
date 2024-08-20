package net.redoptic.boozinmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.redoptic.boozinmod.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoozinModClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("boozinmod");

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CARBOY, RenderLayer.getCutout());
        LOGGER.info("BoozinModClient has been initialized!");
        System.out.println("Boozin' Mod: Hello World");
    }
}

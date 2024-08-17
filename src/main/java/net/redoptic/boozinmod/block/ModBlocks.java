package net.redoptic.boozinmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.redoptic.boozinmod.BoozinMod;
import net.minecraft.block.Block;
import net.redoptic.boozinmod.block.custom.CarboyBlock;
import net.redoptic.boozinmod.block.custom.RotatingBlock;

public class ModBlocks {

    public static final Block STILL = registerBlock("still",
            new RotatingBlock(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.COPPER_BULB).nonOpaque()));

    public static final Block AGEING_BARREL = registerBlock("ageing_barrel",
            new RotatingBlock(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.WOOD).nonOpaque()));

    public static final Block FERMENTATION_BARREL = registerBlock("fermentation_barrel",
            new RotatingBlock(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block CARBOY = registerBlock("carboy",
            new CarboyBlock(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.GLASS).nonOpaque())
    );


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BoozinMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(BoozinMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        BoozinMod.LOGGER.info("Registering Mod Items for " + BoozinMod.MOD_ID);
    }
}

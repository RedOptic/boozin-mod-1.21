package net.redoptic.boozinmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redoptic.boozinmod.BoozinMod;

public class ModItems {
    public static final Item YEAST = registerItem("yeast", new Item(new Item.Settings()));
    public static final Item MOLASSES = registerItem("molasses", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BoozinMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        BoozinMod.LOGGER.info("Registering Mod Items for " + BoozinMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(YEAST);
            entries.add(MOLASSES);
        });
    }
}

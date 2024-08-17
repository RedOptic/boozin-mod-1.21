package net.redoptic.boozinmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.redoptic.boozinmod.BoozinMod;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModItemGroups {
    private static final Text BOOZIN_TITLE = Text.translatable("itemgroup.boozin");
    public static final ItemGroup BOOZIN_GROUP = register("boozin_group", FabricItemGroup.builder()
            .displayName(BOOZIN_TITLE)
            .icon(ModItems.BEER_MUG_FULL::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace() .equals(BoozinMod.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());

    public static <T extends ItemGroup> T register(String name, T itemGroup){
        return Registry.register(Registries.ITEM_GROUP, BoozinMod.id(name), itemGroup);
    }

    public static void registerItemGroups(){
        BoozinMod.LOGGER.info("Registering Mod Items Groups for " + BoozinMod.MOD_ID);
    }

    public static void load(){}
}

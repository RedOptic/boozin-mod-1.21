package net.redoptic.boozinmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redoptic.boozinmod.BoozinMod;
import net.redoptic.boozinmod.item.custom.DrinkItem;
import net.redoptic.boozinmod.list.FoodList;

public class ModItems {
    public static final Item YEAST = registerItem("yeast", new Item(new Item.Settings()));
    public static final Item MOLASSES = registerItem("molasses", new Item(new Item.Settings()));
    public static final Item MASH = registerItem("mash", new Item(new Item.Settings()
            .maxCount(16)));
    public static final Item WORT = registerItem("wort", new Item(new Item.Settings()
            .maxCount(16)));
    public static final Item BEER_MUG_EMPTY = registerItem("beer_mug_empty", new Item(new Item.Settings()));
    public static final Item BEER_MUG_FULL = registerItem("beer_mug_full", new DrinkItem(new Item.Settings()
            .food(FoodList.BEER_WINE_MEAD_FOOD_COMPONENT)));
    public static final Item MEAD_GLASS_EMPTY = registerItem("mead_glass_empty", new Item(new Item.Settings()));
    public static final Item MEAD_GLASS_FULL = registerItem("mead_glass_full", new DrinkItem(new Item.Settings()
            .food(FoodList.BEER_WINE_MEAD_FOOD_COMPONENT)));
    public static final Item MOONSHINE_JAR_EMPTY = registerItem("moonshine_jar_empty", new Item(new Item.Settings()));
    public static final Item MOONSHINE_JAR_FULL = registerItem("moonshine_jar_full", new DrinkItem(new Item.Settings()
            .food(FoodList.MOONSHINE_FOOD_COMPONENT)));
    public static final Item RUM_GLASS_EMPTY = registerItem("rum_glass_empty", new Item(new Item.Settings()));
    public static final Item RUM_GLASS_FULL = registerItem("rum_glass_full", new DrinkItem(new Item.Settings()
            .food(FoodList.RUM_WHISKEY_VODKA_FOOD_COMPONENT)));
    public static final Item RUM_GLASS_UNAGED_FULL = registerItem("rum_glass_unaged_full", new DrinkItem(new Item.Settings()
            .food(FoodList.WHITE_RUM_FOOD_COMPONENT)));
    public static final Item WHISKEY_GLASS_EMPTY = registerItem("whiskey_glass_empty", new Item(new Item.Settings()));
    public static final Item WHISKEY_GLASS_FULL = registerItem("whiskey_glass_full", new DrinkItem(new Item.Settings()
            .food(FoodList.RUM_WHISKEY_VODKA_FOOD_COMPONENT)));
    public static final Item WINE_GLASS_EMPTY = registerItem("wine_glass_empty", new Item(new Item.Settings()));
    public static final Item WINE_GLASS_FULL = registerItem("wine_glass_full", new DrinkItem(new Item.Settings()
            .food(FoodList.BEER_WINE_MEAD_FOOD_COMPONENT)));
    public static final Item SUGAR_CANE_JUICE = registerItem("sugar_cane_juice", new DrinkItem(new Item.Settings()
            .food(FoodList.SUGAR_RUSH_FOOD_COMPONENT)));
    public static final Item UNDISTILLED_RUM = registerItem("undistilled_rum", new Item(new Item.Settings().maxCount(16)));
    public static final Item UNDISTILLED_WHISKEY = registerItem("undistilled_whiskey", new Item(new Item.Settings().maxCount(16)));
    public static final Item UNFERMENTED_UNDISTILLED_RUM = registerItem("unfermented_undistilled_rum", new Item(new Item.Settings().maxCount(16)));
    public static final Item UNFERMENTED_UNDISTILLED_WHISKEY = registerItem("unfermented_undistilled_whiskey", new Item(new Item.Settings().maxCount(16)));
    public static final Item WINE_MUST= registerItem("wine_must", new Item(new Item.Settings().maxCount(16)));
    public static final Item MEAD_MUST = registerItem("mead_must", new Item(new Item.Settings().maxCount(16)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BoozinMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        BoozinMod.LOGGER.info("Registering Mod Items for " + BoozinMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
        });
    }
}

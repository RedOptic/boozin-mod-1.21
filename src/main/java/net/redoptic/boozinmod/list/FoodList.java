package net.redoptic.boozinmod.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public static final FoodComponent BEER_WINE_MEAD_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(1.5f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,20 * 20, 0),0.5f)
            .build();
    public static final FoodComponent RUM_WHISKEY_VODKA_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(2.5f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,20 * 40, 2),0.75f)
            .build();
    public static final FoodComponent WHITE_RUM_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(2f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,20 * 40, 2),0.75f)
            .build();
    public static final FoodComponent MOONSHINE_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(2.5f)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,20 * 40, 2),1)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE,20 * 2, 10),0.15f)
            .build();
    public static final FoodComponent SUGAR_RUSH_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(0)
            .saturationModifier(0)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,20 * 15, 1),0.10f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,20 * 40, 3),0.75f)
            .build();
}

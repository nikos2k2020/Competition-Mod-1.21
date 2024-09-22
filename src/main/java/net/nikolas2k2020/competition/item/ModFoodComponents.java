package net.nikolas2k2020.competition.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Items;

public class ModFoodComponents {
    public static final FoodComponent MARSHMALLOW = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .build();

    public static final FoodComponent MARSHMALLOW_STICK = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .usingConvertsTo(Items.STICK).build();
    public static final FoodComponent MARSHMALLOW_STICK_BURNED = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .usingConvertsTo(Items.STICK).build();
    public static final FoodComponent MARSHMALLOW_STICK_COOKED = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .usingConvertsTo(Items.STICK).build();
    public static final FoodComponent MARSHMALLOW_STICK_PERFECT = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .usingConvertsTo(Items.STICK).build();
    public static final FoodComponent MARSHMALLOW_STICK_SLIGHTLY_COOKED = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .usingConvertsTo(Items.STICK).build();

    public static final FoodComponent BURGER = new FoodComponent.Builder().nutrition(11).saturationModifier(0.8f).build();
    public static final FoodComponent CABBAGE_LEAF = new FoodComponent.Builder().nutrition(1).saturationModifier(0.4f).build();
    public static final FoodComponent BEEF_PATTY = new FoodComponent.Builder().nutrition(4).saturationModifier(0.8f).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().nutrition(1).saturationModifier(0.3f).build();
    public static final FoodComponent ONION = new FoodComponent.Builder().nutrition(2).saturationModifier(0.4f).build();
}

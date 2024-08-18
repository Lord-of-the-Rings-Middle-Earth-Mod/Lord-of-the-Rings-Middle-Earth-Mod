package me.anedhel.lotr.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).alwaysEdible().build();
    public static final FoodComponent BAKED_TOMATO = new FoodComponent.Builder().hunger(6).saturationModifier(1f).alwaysEdible().build();
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).alwaysEdible().build();
    public static final FoodComponent COOKED_CORN = new FoodComponent.Builder().hunger(6).saturationModifier(1f).alwaysEdible().build();
}
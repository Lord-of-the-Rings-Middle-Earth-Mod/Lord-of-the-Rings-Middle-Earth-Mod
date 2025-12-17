package com.anedhel.lotr.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {

	public static final FoodComponent TOMATO = new FoodComponent.Builder()
			.nutrition(3).saturationModifier(0.25f).alwaysEdible().build();
	public static final FoodComponent BAKED_TOMATO = new FoodComponent.Builder()
			.nutrition(6).saturationModifier(1f).build();
	public static final FoodComponent CORN = new FoodComponent.Builder()
			.nutrition(3).saturationModifier(0.25f).alwaysEdible().build();
	public static final FoodComponent COOKED_CORN = new FoodComponent.Builder()
			.nutrition(6).saturationModifier(1f).build();
}

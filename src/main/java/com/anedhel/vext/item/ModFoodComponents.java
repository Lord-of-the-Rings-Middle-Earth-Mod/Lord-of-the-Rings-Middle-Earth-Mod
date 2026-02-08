/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.item;

import net.minecraft.component.type.FoodComponent;

/**
 * Defines food components for custom food items added by the mod.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
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

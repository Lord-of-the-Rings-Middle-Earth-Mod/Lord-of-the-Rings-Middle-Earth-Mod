/*
 * Copyright (c)
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * lord-of-the-rings-middle-earth is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * lord-of-the-rings-middle-earth is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package me.anedhel.lotr.item;

import net.minecraft.item.FoodComponent;

/**
 * This class contains the food components for the mod. It is used to define the hunger and saturation values for each
 * food item.
 */
public class ModFoodComponents {

    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).alwaysEdible().build();
    public static final FoodComponent BAKED_TOMATO = new FoodComponent.Builder().hunger(6).saturationModifier(1f).alwaysEdible().build();
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).alwaysEdible().build();
    public static final FoodComponent COOKED_CORN = new FoodComponent.Builder().hunger(6).saturationModifier(1f).alwaysEdible().build();
}

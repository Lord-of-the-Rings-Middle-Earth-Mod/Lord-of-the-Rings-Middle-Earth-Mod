/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.recipe;

import com.anedhel.vext.VExtMod;
import net.fabricmc.fabric.api.recipe.v1.sync.RecipeSynchronization;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * Central registry for all custom recipes and recipe displays added by the mod.
 * <p>
 * This class registers recipe serializers, recipe types, and recipe displays.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModRecipes {

	public static final RecipeSerializer<CarpentryRecipe> CARPENTRY_RECIPE_SERIALIZER = Registry.register(
			Registries.RECIPE_SERIALIZER, Identifier.of(VExtMod.MOD_ID, "carpentry"),
			new CarpentryRecipe.CarpentryRecipeSerializer()
	);
	public static final RecipeType<CarpentryRecipe> CARPENTRY_RECIPE_RECIPE_TYPE = Registry.register(
			Registries.RECIPE_TYPE, Identifier.of(VExtMod.MOD_ID, "carpentry"), new RecipeType<>() {
				@Override
				public String toString() {
					return "carpentry";
				}
			});

	public static void registerRecipes() {
		VExtMod.LOGGER.info("Registering Custom Recipes for " + VExtMod.MOD_ID);
		RecipeSynchronization.synchronizeRecipeSerializer(CARPENTRY_RECIPE_SERIALIZER);
		registerRecipeDisplays();
	}

	/**
	 * Registers custom recipe displays for client-side rendering.
	 */
	public static void registerRecipeDisplays() {
		Registry.register(Registries.RECIPE_DISPLAY, Identifier.of(VExtMod.MOD_ID, "carpentry"),
				CarpentryRecipeDisplay.SERIALIZER);
	}
}

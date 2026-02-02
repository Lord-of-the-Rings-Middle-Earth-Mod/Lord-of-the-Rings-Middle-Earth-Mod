package com.anedhel.lotr.recipe;

import com.anedhel.lotr.LotRMEMod;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {

	public static final RecipeSerializer<CarpentryRecipe> CARPENTRY_RECIPE_SERIALIZER = Registry.register(
			Registries.RECIPE_SERIALIZER, Identifier.of(LotRMEMod.MOD_ID, "carpentry"),
			new CarpentryRecipe.CarpentryRecipeSerializer()
	);
	public static final RecipeType<CarpentryRecipe> CARPENTRY_RECIPE_RECIPE_TYPE = Registry.register(
			Registries.RECIPE_TYPE, Identifier.of(LotRMEMod.MOD_ID, "carpentry"), new RecipeType<>() {
				@Override
				public String toString() {
					return "carpentry";
				}
			});

	public static void registerRecipes() {
		LotRMEMod.LOGGER.info("Registering Custom Recipes for " + LotRMEMod.MOD_ID);
		registerRecipeDisplays();
	}

	public static void registerRecipeDisplays() {
		Registry.register(Registries.RECIPE_DISPLAY, Identifier.of(LotRMEMod.MOD_ID, "carpentry"),
				CarpentryRecipeDisplay.SERIALIZER);
	}
}

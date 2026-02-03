/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.recipe;

import com.anedhel.lotr.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.RecipeBookCategories;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.recipe.display.RecipeDisplay;
import net.minecraft.recipe.display.SlotDisplay;

import java.util.List;

/**
 * Represents a carpentry recipe for the carpentry table.
 * <p>
 * Carpentry recipes take a single input item and produce a single output item,
 * similar to stonecutter recipes but processed at the carpentry table.
 * </p>
 *
 * @author Moritz Rohleder
 * @see CarpentryRecipeDisplay
 * @see com.anedhel.lotr.block.custom.CarpentryTable
 * @since 0.1.0
 */
public class CarpentryRecipe extends SingleStackRecipe {

	public CarpentryRecipe(String group, Ingredient ingredient, ItemStack result) {
		super(group, ingredient, result);
	}

	@Override
	public RecipeSerializer<? extends SingleStackRecipe> getSerializer() {
		return ModRecipes.CARPENTRY_RECIPE_SERIALIZER;
	}

	@Override
	public RecipeType<? extends SingleStackRecipe> getType() {
		return ModRecipes.CARPENTRY_RECIPE_RECIPE_TYPE;
	}

	@Override
	public List<RecipeDisplay> getDisplays() {
		return List.of(new CarpentryRecipeDisplay(this.ingredient().toDisplay(), this.createResultDisplay(),
				new SlotDisplay.ItemSlotDisplay(Item.fromBlock(ModBlocks.CARPENTRY_TABLE))));
	}

	/**
	 * Creates the display representation of the recipe result.
	 *
	 * @return the slot display for the result item
	 */
	public SlotDisplay createResultDisplay() {
		return new SlotDisplay.StackSlotDisplay(this.result());
	}

	@Override
	public RecipeBookCategory getRecipeBookCategory() {
		return RecipeBookCategories.STONECUTTER;
	}

	/**
	 * Serializer for carpentry recipes.
	 */
	public static class CarpentryRecipeSerializer extends SingleStackRecipe.Serializer<CarpentryRecipe> {
		public CarpentryRecipeSerializer() {
			super(CarpentryRecipe::new);
		}
	}
}

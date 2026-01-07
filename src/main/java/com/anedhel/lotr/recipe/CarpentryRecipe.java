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

	public SlotDisplay createResultDisplay() {
		return new SlotDisplay.StackSlotDisplay(this.result());
	}

	@Override
	public RecipeBookCategory getRecipeBookCategory() {
		return RecipeBookCategories.STONECUTTER;
	}

	public static class CarpentryRecipeSerializer extends SingleStackRecipe.Serializer<CarpentryRecipe> {
		public CarpentryRecipeSerializer() {
			super(CarpentryRecipe::new);
		}
	}
}

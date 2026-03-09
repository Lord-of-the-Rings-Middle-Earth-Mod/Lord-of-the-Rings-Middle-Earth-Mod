/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.datagen.builder;

import com.anedhel.vext.recipe.CarpentryRecipe;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.advancement.AdvancementRequirements;
import net.minecraft.advancement.AdvancementRewards;
import net.minecraft.advancement.criterion.RecipeUnlockedCriterion;
import net.minecraft.data.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.SingleStackRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import org.jspecify.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A custom implementation of {@link CraftingRecipeJsonBuilder} for carpentry recipes.
 * <p>
 * This builder allows defining carpentry recipes with a single input ingredient and a single output item,
 * along with advancement criteria for unlocking the recipe.
 *
 * @author Moritz Rohleder
 * @see CarpentryRecipe
 * @since x.y.z
 */
public class CarpentryRecipeJsonBuilder implements CraftingRecipeJsonBuilder {

	private final RecipeCategory category;
	private final Item output;
	private final Ingredient input;
	private final int count;
	private final Map<String, AdvancementCriterion<?>> criteria = new LinkedHashMap();
	@Nullable
	private String group;
	private final SingleStackRecipe.RecipeFactory<?> recipeFactory;

	public CarpentryRecipeJsonBuilder(RecipeCategory category, ItemConvertible output, Ingredient input, int count,
			SingleStackRecipe.RecipeFactory<?> recipeFactory) {
		this.category = category;
		this.output = output.asItem();
		this.input = input;
		this.count = count;
		this.recipeFactory = recipeFactory;
	}

	public static CarpentryRecipeJsonBuilder createCarpentryRecipeJsonBuilder(RecipeCategory category, ItemConvertible output,
			Ingredient input, int count) {
		return new CarpentryRecipeJsonBuilder(category, output, input, count, CarpentryRecipe::new);
	}

	@Override
	public CraftingRecipeJsonBuilder criterion(String name, AdvancementCriterion<?> criterion) {
		this.criteria.put(name, criterion);
		return this;
	}

	@Override
	public CraftingRecipeJsonBuilder group(@Nullable String group) {
		this.group = group;
		return this;
	}

	@Override
	public Item getOutputItem() {
		return this.output;
	}

	@Override
	public void offerTo(RecipeExporter exporter, RegistryKey<Recipe<?>> recipeKey) {
		if (this.criteria.isEmpty()) {
			throw new IllegalStateException("No way of obtaining recipe " + recipeKey);
		}
		Advancement.Builder builder = exporter.getAdvancementBuilder()
				.criterion("has_the_recipe", RecipeUnlockedCriterion.create(recipeKey))
				.rewards(AdvancementRewards.Builder.recipe(recipeKey))
				.criteriaMerger(AdvancementRequirements.CriterionMerger.OR);
		this.criteria.forEach(builder::criterion);
		SingleStackRecipe singleStackRecipe = this.recipeFactory.create(this.group == null ? "" : this.group,
				this.input, new ItemStack(this.output, this.count));
		exporter.accept(recipeKey, singleStackRecipe,
				builder.build(recipeKey.getValue().withPrefixedPath("recipes/" + this.category.getName() + "/")));
	}
}

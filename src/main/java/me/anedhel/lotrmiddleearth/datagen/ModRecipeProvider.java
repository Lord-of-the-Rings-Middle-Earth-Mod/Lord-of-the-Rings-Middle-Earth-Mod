/*
 * Copyright (c) 2024-2024
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
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package me.anedhel.lotrmiddleearth.datagen;

import me.anedhel.lotrmiddleearth.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

	public ModRecipeProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generate(Consumer<RecipeJsonProvider> exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHALK_BRICKS).pattern("##")
				.pattern("##").input('#', ModBlocks.CHALK)
				.criterion(hasItem(ModBlocks.CHALK), conditionsFromItem(ModBlocks.CHALK))
				.offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHALK_BRICKS)));

		ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OVERGROWN_CHALK_BRICKS)
				.input(ModBlocks.CHALK_BRICKS).input(Items.VINE)
				.criterion(hasItem(ModBlocks.CHALK_BRICKS), conditionsFromItem(ModBlocks.CHALK_BRICKS))
				.criterion(hasItem(Items.VINE), conditionsFromItem(Items.VINE))
				.offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OVERGROWN_CHALK_BRICKS)));

		ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_ORNAMENTED_CHALK_BRICKS)
				.input(ModBlocks.CHALK_BRICKS).input(Items.GOLD_INGOT)
				.criterion(hasItem(ModBlocks.CHALK_BRICKS), conditionsFromItem(ModBlocks.CHALK_BRICKS))
				.criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
				.offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GOLD_ORNAMENTED_CHALK_BRICKS)));

		ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,
						ModBlocks.GOLD_ORNAMENTED_OVERGROWN_CHALK_BRICKS).input(ModBlocks.OVERGROWN_CHALK_BRICKS)
				.input(Items.GOLD_INGOT).criterion(hasItem(ModBlocks.OVERGROWN_CHALK_BRICKS),
						conditionsFromItem(ModBlocks.OVERGROWN_CHALK_BRICKS))
				.criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
				.offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GOLD_ORNAMENTED_OVERGROWN_CHALK_BRICKS)));
	}
}

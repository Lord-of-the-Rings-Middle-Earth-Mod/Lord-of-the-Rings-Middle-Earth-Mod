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

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.recipe.display.RecipeDisplay;
import net.minecraft.recipe.display.SlotDisplay;

import java.util.List;
import java.util.Optional;

/**
 * Represents the visual display of a carpentry recipe in the GUI.
 * <p>
 * This record handles serialization and rendering of carpentry recipes
 * in the client-side GUI, including input, result, and crafting station displays.
 * </p>
 *
 * @author Moritz Rohleder
 * @see CarpentryRecipe
 * @since 0.1.0
 */
public record CarpentryRecipeDisplay(SlotDisplay input, SlotDisplay result, SlotDisplay craftingStation) implements RecipeDisplay {

	public static final MapCodec<CarpentryRecipeDisplay> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(
						SlotDisplay.CODEC.fieldOf("input").forGetter(CarpentryRecipeDisplay::input),
						SlotDisplay.CODEC.fieldOf("result").forGetter(CarpentryRecipeDisplay::result),
						SlotDisplay.CODEC.fieldOf("crafting_station").forGetter(CarpentryRecipeDisplay::craftingStation)
				)
				.apply(instance, CarpentryRecipeDisplay::new)
	);
	public static final PacketCodec<RegistryByteBuf, CarpentryRecipeDisplay> PACKET_CODEC = PacketCodec.tuple(
			SlotDisplay.PACKET_CODEC,
			CarpentryRecipeDisplay::input,
			SlotDisplay.PACKET_CODEC,
			CarpentryRecipeDisplay::result,
			SlotDisplay.PACKET_CODEC,
			CarpentryRecipeDisplay::craftingStation,
			CarpentryRecipeDisplay::new
	);
	public static final RecipeDisplay.Serializer<CarpentryRecipeDisplay> SERIALIZER = new RecipeDisplay.Serializer<>(CODEC, PACKET_CODEC);

	@Override
	public RecipeDisplay.Serializer<CarpentryRecipeDisplay> serializer() {
		return SERIALIZER;
	}

	/**
	 * Helper class for grouping recipe entries in the GUI.
	 *
	 * @param <T> the recipe type
	 */
	// Gruppierungs-Hilfstypen für Screen/Handler
	public static final class Grouping<T extends Recipe<?>> {
		private final List<GroupEntry<T>> entries;

		public Grouping(List<GroupEntry<T>> entries) {
			this.entries = entries;
		}

		public static <T extends Recipe<?>> Grouping<T> empty() {
			return new Grouping<>(List.of());
		}

		public boolean isEmpty() {
			return this.entries.isEmpty();
		}

		public int size() {
			return this.entries.size();
		}

		public List<GroupEntry<T>> entries() {
			return this.entries;
		}
	}

	/**
	 * Represents a single entry in a recipe grouping.
	 *
	 * @param <T> the recipe type
	 */
	public static final class GroupEntry<T extends Recipe<?>> {
		private final RecipeOption<T> recipe;

		public GroupEntry(RecipeOption<T> recipe) {
			this.recipe = recipe;
		}

		public RecipeOption<T> recipe() {
			return this.recipe;
		}
	}

	/**
	 * Represents a recipe option with its display and optional recipe entry.
	 *
	 * @param <T> the recipe type
	 */
	public static final class RecipeOption<T extends Recipe<?>> {
		private final SlotDisplay optionDisplay;
		private final Optional<RecipeEntry<T>> recipe;

		public RecipeOption(SlotDisplay optionDisplay, Optional<RecipeEntry<T>> recipe) {
			this.optionDisplay = optionDisplay;
			this.recipe = recipe;
		}

		public SlotDisplay optionDisplay() {
			return this.optionDisplay;
		}

		public Optional<RecipeEntry<T>> recipe() {
			return this.recipe;
		}
	}
}

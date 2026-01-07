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

	public static final class GroupEntry<T extends Recipe<?>> {
		private final RecipeOption<T> recipe;

		public GroupEntry(RecipeOption<T> recipe) {
			this.recipe = recipe;
		}

		public RecipeOption<T> recipe() {
			return this.recipe;
		}
	}

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

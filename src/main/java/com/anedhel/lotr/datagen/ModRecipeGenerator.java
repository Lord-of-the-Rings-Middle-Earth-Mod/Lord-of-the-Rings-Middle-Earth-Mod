package com.anedhel.lotr.datagen;

import com.anedhel.lotr.block.ModBlocks;
import com.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmokingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider {

	public ModRecipeGenerator(FabricDataOutput output,
			CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	/**
	 * Implement this method and then use the range of methods in {@link RecipeGenerator} or from one of the recipe json
	 * factories such as {@link ShapedRecipeJsonBuilder} or {@link ShapelessRecipeJsonBuilder}.
	 *
	 * @param registryLookup
	 * @param exporter
	 */
	@Override
	protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup,
			RecipeExporter exporter) {
		return new RecipeGenerator(registryLookup, exporter) {
			@Override
			public void generate() {
				List<ItemConvertible> TIN_SMELTABLES = List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE, ModBlocks.DEEPSLATE_TIN_ORE);
				List<ItemConvertible> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER, ModBlocks.SILVER_ORE, ModBlocks.DEEPSLATE_SILVER_ORE);

				offerSmelting(TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f, 200, "tin");
				offerBlasting(TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f, 100, "tin");
				offerSmelting(List.of(ModBlocks.RAW_TIN_BLOCK), RecipeCategory.MISC, ModBlocks.TIN_BLOCK.asItem(),
						1.5f, 1600, "tin_block");
				offerBlasting(List.of(ModBlocks.RAW_TIN_BLOCK), RecipeCategory.MISC, ModBlocks.TIN_BLOCK.asItem(),
						1.5f, 800, "tin_block");

				offerSmelting(SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT, 0.7f, 200, "silver");
				offerBlasting(SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT, 0.7f, 100, "silver");
				offerSmelting(List.of(ModBlocks.RAW_SILVER_BLOCK), RecipeCategory.MISC,
						ModBlocks.SILVER_BLOCK.asItem(), 1.5f, 1600, "silver_block");
				offerBlasting(List.of(ModBlocks.RAW_SILVER_BLOCK), RecipeCategory.MISC,
						ModBlocks.SILVER_BLOCK.asItem(), 1.5f, 800, "silver_block");

				offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TIN,
						RecipeCategory.DECORATIONS, ModBlocks.RAW_TIN_BLOCK);
				offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT,
						RecipeCategory.DECORATIONS, ModBlocks.TIN_BLOCK);
				offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_SILVER,
						RecipeCategory.DECORATIONS, ModBlocks.RAW_SILVER_BLOCK);
				offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.SILVER_INGOT,
						RecipeCategory.DECORATIONS, ModBlocks.SILVER_BLOCK);

				offerSmelting(List.of(ModItems.TOMATO), RecipeCategory.FOOD, ModItems.BAKED_TOMATO, 0.35f, 200,
						"baked_tomato");
				offerFoodCookingRecipe("smoker", RecipeSerializer.SMOKING, SmokingRecipe::new, 100, ModItems.TOMATO,
						ModItems.BAKED_TOMATO, 1f);
				offerFoodCookingRecipe("campfire", RecipeSerializer.CAMPFIRE_COOKING, CampfireCookingRecipe::new, 600,
						ModItems.TOMATO, ModItems.BAKED_TOMATO, 1f);

				offerSmelting(List.of(ModItems.CORN), RecipeCategory.FOOD, ModItems.COOKED_CORN, 0.35f, 200,
						"cooked_corn");
				offerFoodCookingRecipe("smoker", RecipeSerializer.SMOKING, SmokingRecipe::new, 100, ModItems.CORN,
						ModItems.COOKED_CORN, 1f);
				offerFoodCookingRecipe("campfire", RecipeSerializer.CAMPFIRE_COOKING, CampfireCookingRecipe::new, 600,
						ModItems.CORN, ModItems.COOKED_CORN, 1f);
			}
		};
	}

	@Override
	public String getName() {
		return "LotR-ME-Mod Recipes";
	}
}

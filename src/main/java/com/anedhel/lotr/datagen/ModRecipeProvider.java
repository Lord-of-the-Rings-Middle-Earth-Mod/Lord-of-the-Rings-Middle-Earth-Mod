/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.datagen;

import com.anedhel.lotr.block.ModBlocks;
import com.anedhel.lotr.block.stonetypes.ModStoneSet;
import com.anedhel.lotr.block.stonetypes.ModStoneSubSet;
import com.anedhel.lotr.block.stonetypes.ModStoneTypes;
import com.anedhel.lotr.block.stonetypes.StoneTypeVariants;
import com.anedhel.lotr.block.woodtypes.ModWoodSet;
import com.anedhel.lotr.block.woodtypes.ModWoodTypes;
import com.anedhel.lotr.block.woodtypes.PineBlocks;
import com.anedhel.lotr.item.ModGearType;
import com.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmokingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.resource.featuretoggle.FeatureFlags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

	public ModRecipeProvider(FabricDataOutput output,
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

			private final List<ItemConvertible> TIN_SMELTABLES = List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE,
					ModBlocks.DEEPSLATE_TIN_ORE);
			private final List<ItemConvertible> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER, ModBlocks.SILVER_ORE,
					ModBlocks.DEEPSLATE_SILVER_ORE);

			@Override
			public void generate() {
				generateModWoodTypeRecipes();
				generateModStoneTypeRecipes();
				generateModGearTypeRecipes();

				offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, PineBlocks.PINE_PLANKS, PineBlocks.PINE_LOG, 4);

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

				generateAlloyCrafting(Items.COPPER_INGOT, ModItems.TIN_INGOT, ModItems.BRONZE_INGOT, 1);
				offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_INGOT,
						RecipeCategory.DECORATIONS, ModBlocks.BRONZE_BLOCK);

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

			private void generateModWoodTypeRecipes() {
				for(ModWoodTypes woodType : ModWoodTypes.values()) {
					ModWoodSet woodSet = woodType.getModWoodSet();

					offerBarkBlockRecipe(woodSet.getWoodVariant("base"), woodSet.getLog());
					offerBarkBlockRecipe(woodSet.getStrippedWoodVariant("base"), woodSet.getStrippedLog());
					offerPlanksRecipe(woodSet.getPlanksVariant("base"), woodSet.getLogItemTag(), 4);

					generateFamily(woodSet.getPlanksFamily(), FeatureFlags.VANILLA_FEATURES);
					generateFamily(woodSet.getWoodFamily(), FeatureFlags.VANILLA_FEATURES);
					generateFamily(woodSet.getStrippedWoodFamily(), FeatureFlags.VANILLA_FEATURES);
				}
			}

			private void generateModStoneTypeRecipes() {
				//ToDo: Generate the stonecutting recipes too
				for(ModStoneTypes stoneType : ModStoneTypes.values()) {
					ModStoneSet stoneSet = stoneType.getModStoneSet();

					stoneSet.getAllBlockFamilies().forEach(family -> generateFamily(family, FeatureFlags.VANILLA_FEATURES));

					stoneSet.getAllStoneSubSets().forEach(subSet -> {
						generateModStoneSubSetRecipes(subSet, subSet.getName());
					});

					generateStoneCraftingTree(stoneSet);
				}
			}

			private void generateModGearTypeRecipes() {
				for(ModGearType gearType : ModGearType.values()) {
					generateSwordRecipe(gearType.getMaterial(), gearType.getSword());
					generateAxeRecipe(gearType.getMaterial(), gearType.getAxe());
					generatePickaxeRecipe(gearType.getMaterial(), gearType.getPickaxe());
					generateShovelRecipe(gearType.getMaterial(), gearType.getShovel());
					generateHoeRecipe(gearType.getMaterial(), gearType.getHoe());

					generateHelmetRecipe(gearType.getMaterial(), gearType.getHelmet());
					generateChestplateRecipe(gearType.getMaterial(), gearType.getChestplate());
					generateLeggingsRecipe(gearType.getMaterial(), gearType.getLeggings());
					generateBootsRecipe(gearType.getMaterial(), gearType.getBoots());
				}
			}

			private void generateStoneCraftingTree(ModStoneSet stoneSet) {
				generateStoneSmelting(stoneSet.getCobbledVariant("base"),
						stoneSet.getStoneVariant("base"),  null);
				generateStoneSmelting(stoneSet.getStoneVariant("base"),
						stoneSet.getSmoothVariant("base"),  null);

				generateStoneSmelting(stoneSet.getSmoothVariant("base"),
						stoneSet.getCrackedSmoothVariant("base"), null);

				generatePillarRecipe(stoneSet.getStoneVariant("base"),
						stoneSet.getPillarSet().getBaseFamilyVariant("base"), 3);
				generateFriezeRecipe(stoneSet.getStoneVariant("base"),
						stoneSet.getFriezeSet().getBaseFamilyVariant("base"), 3);

				generateStoneSmelting(stoneSet.getPillarSet().getBaseFamilyVariant("base"),
						stoneSet.getPillarSet().getCrackedFamilyVariant("base"), null);
				generateStoneSmelting(stoneSet.getFriezeSet().getBaseFamilyVariant("base"),
						stoneSet.getFriezeSet().getCrackedFamilyVariant("base"), null);

				generate2x2Recipe(stoneSet.getStoneVariant("base"),
						stoneSet.getPolishedSet().getBaseFamilyVariant("base"), 4);
				generate2x2Recipe(stoneSet.getPolishedSet().getBaseFamilyVariant("base"),
						stoneSet.getBrickSet().getBaseFamilyVariant("base"), 4);
				generate2x2Recipe(stoneSet.getBrickSet().getBaseFamilyVariant("base"),
						stoneSet.getFancyBrickSet().getBaseFamilyVariant("base"), 4);
				createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS,
						stoneSet.getBrickSet().getBaseFamilyVariant("chiseled"),
						Ingredient.ofItem(stoneSet.getBrickSet().getBaseFamilyVariant("slab")));

				generateStoneSmelting(stoneSet.getPolishedSet().getBaseFamilyVariant("base"),
						stoneSet.getPolishedSet().getCrackedFamilyVariant("base"), null);
				generate2x2Recipe(stoneSet.getPolishedSet().getCrackedFamilyVariant("base"),
						stoneSet.getBrickSet().getCrackedFamilyVariant("base"), 4);
				generate2x2Recipe(stoneSet.getBrickSet().getCrackedFamilyVariant("base"),
						stoneSet.getFancyBrickSet().getCrackedFamilyVariant("base"), 4);

				generate2x2Recipe(stoneSet.getCobbledVariant("base"),
						stoneSet.getCobbledBrickSet().getBaseFamilyVariant("base"), 4);

				generateStoneSmelting(stoneSet.getCobbledBrickSet().getBaseFamilyVariant("base"),
						stoneSet.getCobbledBrickSet().getCrackedFamilyVariant("base"), null);

				generate2x2CheckerboardRecipe(stoneSet.getStoneVariant("base"),
						stoneSet.getCobbledVariant("base"),
						stoneSet.getRusticBrickSet().getBaseFamilyVariant("base"), 4);
				generate2x2Recipe(stoneSet.getRusticBrickSet().getBaseFamilyVariant("base"),
						stoneSet.getTileSet().getBaseFamilyVariant("base"), 4);
				generatePavementRecipe(stoneSet.getTileSet().getBaseFamilyVariant("slab"),
						stoneSet.getPavementSet().getBaseFamilyVariant("base"), 1);

				generateStoneSmelting(stoneSet.getRusticBrickSet().getBaseFamilyVariant("base"),
						stoneSet.getRusticBrickSet().getCrackedFamilyVariant("base"), null);
				generate2x2Recipe(stoneSet.getRusticBrickSet().getCrackedFamilyVariant("base"),
						stoneSet.getTileSet().getCrackedFamilyVariant("base"), 4);
				generatePavementRecipe(stoneSet.getTileSet().getCrackedFamilyVariant("slab"),
						stoneSet.getPavementSet().getCrackedFamilyVariant("base"), 1);
			}

			private void generateModStoneSubSetRecipes(ModStoneSubSet subSet, String name) {
				subSet.getAllBlockFamilies().forEach(family -> generateFamily(family, FeatureFlags.VANILLA_FEATURES));

				generateOrnamentRecipe(subSet.getBaseFamilyVariant("base"),
						subSet.getBronzeFamilyVariant("base"), ModItems.BRONZE_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.BRONZE_STONE,
								StoneTypeVariants.STONE, "ct"));
				generateOrnamentRecipe(subSet.getBaseFamilyVariant("base"),
						subSet.getSilverFamilyVariant("base"), ModItems.SILVER_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.SILVER_STONE,
								StoneTypeVariants.STONE, "ct"));
				generateOrnamentRecipe(subSet.getBaseFamilyVariant("base"),
						subSet.getGoldFamilyVariant("base"), Items.GOLD_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.GOLD_STONE,
								StoneTypeVariants.STONE, "ct"));

				generateOrnamentRecipe(subSet.getMossyFamilyVariant("base"),
						subSet.getMossyBronzeFamilyVariant("base"), ModItems.BRONZE_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.MOSSY_BRONZE_STONE,
								StoneTypeVariants.MOSSY_STONE, "ct"));
				generateOrnamentRecipe(subSet.getMossyFamilyVariant("base"),
						subSet.getMossySilverFamilyVariant("base"), ModItems.SILVER_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.MOSSY_SILVER_STONE,
								StoneTypeVariants.MOSSY_STONE, "ct"));
				generateOrnamentRecipe(subSet.getMossyFamilyVariant("base"),
						subSet.getMossyGoldFamilyVariant("base"), Items.GOLD_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.MOSSY_GOLD_STONE,
								StoneTypeVariants.MOSSY_STONE, "ct"));

				generateOrnamentRecipe(subSet.getOvergrownFamilyVariant("base"),
						subSet.getOvergrownBronzeFamilyVariant("base"), ModItems.BRONZE_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.OVERGROWN_BRONZE_STONE,
								StoneTypeVariants.OVERGROWN_STONE, "ct"));
				generateOrnamentRecipe(subSet.getOvergrownFamilyVariant("base"),
						subSet.getOvergrownSilverFamilyVariant("base"), ModItems.SILVER_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.OVERGROWN_SILVER_STONE,
								StoneTypeVariants.OVERGROWN_STONE, "ct"));
				generateOrnamentRecipe(subSet.getOvergrownFamilyVariant("base"),
						subSet.getOvergrownGoldFamilyVariant("base"), Items.GOLD_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.OVERGROWN_GOLD_STONE,
								StoneTypeVariants.OVERGROWN_STONE, "ct"));

				generateOvergrownRecipe(
					subSet.getBaseFamilyVariant("base"),
					subSet.getMossyFamilyVariant("base"),
					subSet.getOvergrownFamilyVariant("base"),
					StoneTypeVariants.STONE,
					StoneTypeVariants.MOSSY_STONE,
					StoneTypeVariants.OVERGROWN_STONE, name);

				generateOvergrownRecipe(
					subSet.getBronzeFamilyVariant("base"),
					subSet.getMossyBronzeFamilyVariant("base"),
					subSet.getOvergrownBronzeFamilyVariant("base"),
					StoneTypeVariants.BRONZE_STONE,
					StoneTypeVariants.MOSSY_BRONZE_STONE,
					StoneTypeVariants.OVERGROWN_BRONZE_STONE, name);

				generateOvergrownRecipe(
					subSet.getSilverFamilyVariant("base"),
					subSet.getMossySilverFamilyVariant("base"),
					subSet.getOvergrownSilverFamilyVariant("base"),
					StoneTypeVariants.SILVER_STONE,
					StoneTypeVariants.MOSSY_SILVER_STONE,
					StoneTypeVariants.OVERGROWN_SILVER_STONE, name);

				generateOvergrownRecipe(
					subSet.getGoldFamilyVariant("base"),
					subSet.getMossyGoldFamilyVariant("base"),
					subSet.getOvergrownGoldFamilyVariant("base"),
					StoneTypeVariants.GOLD_STONE,
					StoneTypeVariants.MOSSY_GOLD_STONE,
					StoneTypeVariants.OVERGROWN_GOLD_STONE, name);

				generateOrnamentRecipe(subSet.getCrackedFamilyVariant("base"),
						subSet.getCrackedBronzeFamilyVariant("base"), ModItems.BRONZE_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_BRONZE_STONE,
								StoneTypeVariants.CRACKED_STONE, "ct"));
				generateOrnamentRecipe(subSet.getCrackedFamilyVariant("base"),
						subSet.getCrackedSilverFamilyVariant("base"), ModItems.SILVER_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_SILVER_STONE,
								StoneTypeVariants.CRACKED_STONE, "ct"));
				generateOrnamentRecipe(subSet.getCrackedFamilyVariant("base"),
						subSet.getCrackedGoldFamilyVariant("base"), Items.GOLD_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_GOLD_STONE,
								StoneTypeVariants.CRACKED_STONE, "ct"));

				generateOrnamentRecipe(subSet.getMossyCrackedFamilyVariant("base"),
						subSet.getMossyCrackedBronzeFamilyVariant("base"), ModItems.BRONZE_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE,
								StoneTypeVariants.CRACKED_MOSSY_STONE, "ct"));
				generateOrnamentRecipe(subSet.getMossyCrackedFamilyVariant("base"),
						subSet.getMossyCrackedSilverFamilyVariant("base"), ModItems.SILVER_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE,
								StoneTypeVariants.CRACKED_MOSSY_STONE, "ct"));
				generateOrnamentRecipe(subSet.getMossyCrackedFamilyVariant("base"),
						subSet.getMossyCrackedGoldFamilyVariant("base"), Items.GOLD_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE,
								StoneTypeVariants.CRACKED_MOSSY_STONE, "ct"));

				generateOrnamentRecipe(subSet.getOvergrownCrackedFamilyVariant("base"),
						subSet.getOvergrownCrackedBronzeFamilyVariant("base"), ModItems.BRONZE_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE,
								StoneTypeVariants.CRACKED_OVERGROWN_STONE, "ct"));
				generateOrnamentRecipe(subSet.getOvergrownCrackedFamilyVariant("base"),
						subSet.getOvergrownCrackedSilverFamilyVariant("base"), ModItems.SILVER_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE,
								StoneTypeVariants.CRACKED_OVERGROWN_STONE, "ct"));
				generateOrnamentRecipe(subSet.getOvergrownCrackedFamilyVariant("base"),
						subSet.getOvergrownCrackedGoldFamilyVariant("base"), Items.GOLD_INGOT,
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE,
								StoneTypeVariants.CRACKED_OVERGROWN_STONE, "ct"));

				generateOvergrownRecipe(
						subSet.getCrackedFamilyVariant("base"),
						subSet.getMossyCrackedFamilyVariant("base"),
						subSet.getOvergrownCrackedFamilyVariant("base"),
						StoneTypeVariants.CRACKED_STONE,
						StoneTypeVariants.CRACKED_MOSSY_STONE,
						StoneTypeVariants.CRACKED_OVERGROWN_STONE, name);

				generateOvergrownRecipe(
						subSet.getCrackedBronzeFamilyVariant("base"),
						subSet.getMossyCrackedBronzeFamilyVariant("base"),
						subSet.getOvergrownCrackedBronzeFamilyVariant("base"),
						StoneTypeVariants.CRACKED_BRONZE_STONE,
						StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE,
						StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, name);

				generateOvergrownRecipe(
						subSet.getCrackedSilverFamilyVariant("base"),
						subSet.getMossyCrackedSilverFamilyVariant("base"),
						subSet.getOvergrownCrackedSilverFamilyVariant("base"),
						StoneTypeVariants.CRACKED_SILVER_STONE,
						StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE,
						StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, name);

				generateOvergrownRecipe(
						subSet.getCrackedGoldFamilyVariant("base"),
						subSet.getMossyCrackedGoldFamilyVariant("base"),
						subSet.getOvergrownCrackedGoldFamilyVariant("base"),
						StoneTypeVariants.CRACKED_GOLD_STONE,
						StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE,
						StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, name);

				generateStoneSmelting(subSet.getBaseFamilyVariant("base"),
						subSet.getCrackedFamilyVariant("base"),
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_STONE,
								StoneTypeVariants.STONE, ""));
				generateStoneSmelting(subSet.getMossyFamilyVariant("base"),
						subSet.getMossyCrackedFamilyVariant("base"),
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_MOSSY_STONE,
								StoneTypeVariants.MOSSY_STONE, ""));
				generateStoneSmelting(subSet.getOvergrownFamilyVariant("base"),
						subSet.getOvergrownCrackedFamilyVariant("base"),
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_OVERGROWN_STONE,
								StoneTypeVariants.OVERGROWN_STONE, ""));

				generateStoneSmelting(subSet.getBronzeFamilyVariant("base"),
						subSet.getCrackedBronzeFamilyVariant("base"),
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_BRONZE_STONE,
								StoneTypeVariants.BRONZE_STONE, ""));
				generateStoneSmelting(subSet.getMossyBronzeFamilyVariant("base"),
						subSet.getMossyCrackedBronzeFamilyVariant("base"),
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE,
								StoneTypeVariants.MOSSY_BRONZE_STONE, ""));
				generateStoneSmelting(subSet.getOvergrownBronzeFamilyVariant("base"),
						subSet.getOvergrownCrackedBronzeFamilyVariant("base"),
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE,
								StoneTypeVariants.OVERGROWN_BRONZE_STONE, ""));

				generateStoneSmelting(subSet.getSilverFamilyVariant("base"),
						subSet.getCrackedSilverFamilyVariant("base"),
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_SILVER_STONE,
								StoneTypeVariants.SILVER_STONE, ""));
				generateStoneSmelting(subSet.getMossySilverFamilyVariant("base"),
						subSet.getMossyCrackedSilverFamilyVariant("base"),
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE,
								StoneTypeVariants.MOSSY_SILVER_STONE, ""));
				generateStoneSmelting(subSet.getOvergrownSilverFamilyVariant("base"),
						subSet.getOvergrownCrackedSilverFamilyVariant("base"),
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE,
								StoneTypeVariants.OVERGROWN_SILVER_STONE, ""));

				generateStoneSmelting(subSet.getGoldFamilyVariant("base"),
						subSet.getCrackedGoldFamilyVariant("base"),
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_GOLD_STONE,
								StoneTypeVariants.GOLD_STONE, ""));
				generateStoneSmelting(subSet.getMossyGoldFamilyVariant("base"),
						subSet.getMossyCrackedGoldFamilyVariant("base"),
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE,
								StoneTypeVariants.MOSSY_GOLD_STONE, ""));
				generateStoneSmelting(subSet.getOvergrownGoldFamilyVariant("base"),
						subSet.getOvergrownCrackedGoldFamilyVariant("base"),
						createModStoneRecipeName(name, StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE,
								StoneTypeVariants.OVERGROWN_GOLD_STONE, ""));
			}

			private void generateStoneSmelting(Block baseBlock, Block crackedBlock, String recipePath) {
				if(recipePath != null) {
					CookingRecipeJsonBuilder.createSmelting(
									Ingredient.ofItem(baseBlock), RecipeCategory.BUILDING_BLOCKS,
									crackedBlock.asItem(), 0.1F, 200
							)
							.criterion("has_stone_bricks", this.conditionsFromItem(baseBlock))
							.offerTo(this.exporter, recipePath);
				} else {
					CookingRecipeJsonBuilder.createSmelting(
									Ingredient.ofItem(baseBlock), RecipeCategory.BUILDING_BLOCKS,
									crackedBlock.asItem(), 0.1F, 200
							)
							.criterion("has_stone_bricks", this.conditionsFromItem(baseBlock))
							.offerTo(this.exporter);
				}
			}

			private void generateOrnamentRecipe(Block baseBlock, Block ornamentedBlock, Item ornament,
					String recipePath) {
				this.createShaped(RecipeCategory.BUILDING_BLOCKS, ornamentedBlock)
						.pattern(" O ")
						.pattern("OBO")
						.pattern(" O ")
						.input('O', ornament)
						.input('B', baseBlock)
						.group("ornamented_stone_bricks")
						.criterion("has_ornament", this.conditionsFromItem(ornament))
						.offerTo(this.exporter, recipePath);

			}

			private void generateMossyRecipe(Block normal, Block mossy, String recipePath) {
				this.createShapeless(RecipeCategory.BUILDING_BLOCKS, mossy)
						.input(normal)
						.input(Blocks.VINE)
						.group("mossy_stone_bricks")
						.criterion("has_vine", this.conditionsFromItem(Blocks.VINE))
						.offerTo(this.exporter, recipePath + "_vine");
				this.createShapeless(RecipeCategory.BUILDING_BLOCKS, mossy)
						.input(normal)
						.input(Blocks.MOSS_BLOCK)
						.group("mossy_stone_bricks")
						.criterion("has_moss_block", this.conditionsFromItem(Blocks.MOSS_BLOCK))
						.offerTo(this.exporter, recipePath + "_moss");
			}

			private void generateOvergrownRecipe(Block normal, Block mossy, Block overgrown,
					StoneTypeVariants normalVariant, StoneTypeVariants mossyVariant, StoneTypeVariants overgrownVariant,
					String name) {
				generateMossyRecipe(normal, mossy, createModStoneRecipeName(name, mossyVariant, normalVariant, "ct"));
				generateMossyRecipe(mossy, overgrown, createModStoneRecipeName(name, overgrownVariant, mossyVariant, "ct"));
				this.createShapeless(RecipeCategory.BUILDING_BLOCKS, overgrown)
						.input(normal)
						.input(Blocks.VINE, 2)
						.group("overgrown_stone_bricks")
						.criterion("has_vine", this.conditionsFromItem(Blocks.VINE))
						.offerTo(this.exporter, createModStoneRecipeName(name, overgrownVariant, normalVariant, "ct") + "_vine");
				this.createShapeless(RecipeCategory.BUILDING_BLOCKS, overgrown)
						.input(normal)
						.input(Blocks.MOSS_BLOCK, 2)
						.group("overgrown_stone_bricks")
						.criterion("has_moss_block", this.conditionsFromItem(Blocks.MOSS_BLOCK))
						.offerTo(this.exporter, createModStoneRecipeName(name, overgrownVariant, normalVariant, "ct") + "_moss");
			}

			private void generatePillarRecipe(Block input, Block pillar, int outputCount) {
				this.createShaped(RecipeCategory.BUILDING_BLOCKS, pillar, outputCount)
						.pattern("B")
						.pattern("B")
						.pattern("B")
						.input('B', input)
						.group("pillar_stone_bricks")
						.criterion("has_stone_bricks", this.conditionsFromItem(input))
						.offerTo(this.exporter);

			}

			private void generateFriezeRecipe(Block input, Block frieze, int outputCount) {
				this.createShaped(RecipeCategory.BUILDING_BLOCKS, frieze, outputCount)
						.pattern("BBB")
						.input('B', input)
						.group("frieze_stone_bricks")
						.criterion("has_stone_bricks", this.conditionsFromItem(input))
						.offerTo(this.exporter);
			}

			private void generatePavementRecipe(Block input, Block output, int outputCount) {
				this.createShaped(RecipeCategory.BUILDING_BLOCKS, output, outputCount)
						.pattern("B")
						.pattern("B")
						.input('B', input)
						.group("pavement_stone_bricks")
						.criterion("has_stone_bricks", this.conditionsFromItem(input))
						.offerTo(this.exporter);
			}

			private void generate2x2CheckerboardRecipe(Block inputA, Block inputB, Block output, int outputCount) {
				this.createShaped(RecipeCategory.BUILDING_BLOCKS, output, outputCount)
						.pattern("AB")
						.pattern("BA")
						.input('A', inputA)
						.input('B', inputB)
						.group("checkerboard_stone_bricks")
						.criterion("has_stone_bricks", this.conditionsFromItem(inputA))
						.criterion("has_stone_bricks_2", this.conditionsFromItem(inputB))
						.offerTo(this.exporter);
			}

			private void generate2x2Recipe(Block input, Block output, int outputCount) {
				this.createShaped(RecipeCategory.BUILDING_BLOCKS, output, outputCount)
						.pattern("AA")
						.pattern("AA")
						.input('A', input)
						.group("2x2_stone_bricks")
						.criterion("has_stone_bricks", this.conditionsFromItem(input))
						.offerTo(this.exporter);
			}

			private void generateAlloyCrafting(Item inputOne, Item inputTwo, Item output, int outputCount) {
				this.createShapeless(RecipeCategory.MISC, ModItems.BRONZE_INGOT, outputCount)
						.input(inputOne)
						.input(inputTwo)
						.group("bronze_alloy")
						.criterion("has_ingot" ,this.conditionsFromItem(inputOne))
						.criterion("has_ingot" ,this.conditionsFromItem(inputTwo))
						.offerTo(this.exporter, getItemPath(output) + "_from_alloy_crafting");
			}

			private void generateSwordRecipe(Item material, Item sword) {
				this.createShaped(RecipeCategory.COMBAT, sword)
						.pattern(" X ")
						.pattern(" X ")
						.pattern(" # ")
						.input('X', material)
						.input('#', ConventionalItemTags.WOODEN_RODS)
						.group("swords")
						.criterion("has_material", this.conditionsFromItem(material))
						.offerTo(this.exporter);
			}

			private void generateAxeRecipe(Item material, Item axe) {
				this.createShaped(RecipeCategory.TOOLS, axe)
						.pattern("XX ")
						.pattern("X# ")
						.pattern(" # ")
						.input('X', material)
						.input('#', ConventionalItemTags.WOODEN_RODS)
						.group("axes")
						.criterion("has_material", this.conditionsFromItem(material))
						.offerTo(this.exporter);
			}

			private void generatePickaxeRecipe(Item material, Item pickaxe) {
				this.createShaped(RecipeCategory.TOOLS, pickaxe)
						.pattern("XXX")
						.pattern(" # ")
						.pattern(" # ")
						.input('X', material)
						.input('#', ConventionalItemTags.WOODEN_RODS)
						.group("pickaxes")
						.criterion("has_material", this.conditionsFromItem(material))
						.offerTo(this.exporter);
			}

			private void generateShovelRecipe(Item material, Item shovel) {
				this.createShaped(RecipeCategory.TOOLS, shovel)
						.pattern(" X ")
						.pattern(" # ")
						.pattern(" # ")
						.input('X', material)
						.input('#', ConventionalItemTags.WOODEN_RODS)
						.group("shovels")
						.criterion("has_material", this.conditionsFromItem(material))
						.offerTo(this.exporter);
			}

			private void generateHoeRecipe(Item material, Item hoe) {
				this.createShaped(RecipeCategory.TOOLS, hoe)
						.pattern("XX ")
						.pattern(" # ")
						.pattern(" # ")
						.input('X', material)
						.input('#', ConventionalItemTags.WOODEN_RODS)
						.group("hoes")
						.criterion("has_material", this.conditionsFromItem(material))
						.offerTo(this.exporter);
			}

			private void generateHelmetRecipe(Item material, Item helmet) {
				this.createShaped(RecipeCategory.COMBAT, helmet)
						.pattern("XXX")
						.pattern("X X")
						.input('X', material)
						.group("helmets")
						.criterion("has_material", this.conditionsFromItem(material))
						.offerTo(this.exporter);
			}

			private void generateChestplateRecipe(Item material, Item chestplate) {
				this.createShaped(RecipeCategory.COMBAT, chestplate)
						.pattern("X X")
						.pattern("XXX")
						.pattern("XXX")
						.input('X', material)
						.group("chestplates")
						.criterion("has_material", this.conditionsFromItem(material))
						.offerTo(this.exporter);
			}

			private void generateLeggingsRecipe(Item material, Item leggings) {
				this.createShaped(RecipeCategory.COMBAT, leggings)
						.pattern("XXX")
						.pattern("X X")
						.pattern("X X")
						.input('X', material)
						.group("leggings")
						.criterion("has_material", this.conditionsFromItem(material))
						.offerTo(this.exporter);
			}

			private void generateBootsRecipe(Item material, Item boots) {
				this.createShaped(RecipeCategory.COMBAT, boots)
						.pattern("X X")
						.pattern("X X")
						.input('X', material)
						.group("boots")
						.criterion("has_material", this.conditionsFromItem(material))
						.offerTo(this.exporter);
			}
		};
	}

	protected String createModStoneRecipeName(String baseName, StoneTypeVariants variant,
			String recipeType) {
		return createModStoneRecipeName(baseName, variant, variant, recipeType);
	}

	protected String createModStoneRecipeName(String baseName, StoneTypeVariants outputVariant,
			StoneTypeVariants inputVariant, String recipeType) {
		String outputPath = StoneTypeVariants.getRecipePath(outputVariant, baseName);
		String inputPath = StoneTypeVariants.getRecipePath(inputVariant, baseName);
		return outputPath + "_from_" + inputPath + "_" + recipeType;
	}

	@Override
	public String getName() {
		return "LotR-ME-Mod Recipes";
	}
}

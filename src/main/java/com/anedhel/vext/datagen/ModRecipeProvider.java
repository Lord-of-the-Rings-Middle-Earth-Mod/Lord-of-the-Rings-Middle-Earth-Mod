/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.datagen;

import com.anedhel.vext.block.ModBlocks;
import com.anedhel.vext.block.stonetypes.ModStoneSet;
import com.anedhel.vext.block.stonetypes.ModStoneSubSet;
import com.anedhel.vext.block.stonetypes.ModStoneTypes;
import com.anedhel.vext.block.stonetypes.StoneTypeVariants;
import com.anedhel.vext.block.woodtypes.ModWoodSet;
import com.anedhel.vext.block.woodtypes.ModWoodTypes;
import com.anedhel.vext.datagen.builder.CarpentryRecipeJsonBuilder;
import com.anedhel.vext.datagen.util.DataGenUtils;
import com.anedhel.vext.item.ModGearType;
import com.anedhel.vext.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmokingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.resource.featuretoggle.FeatureFlags;

import java.util.*;
import java.util.concurrent.CompletableFuture;

/**
 * Data generator for crafting recipes.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModRecipeProvider extends FabricRecipeProvider {

	record VanillaWoodEntry(BlockFamily family, Block... logs) {};

	private static final VanillaWoodEntry[] VANILLA_WOOD_TYPES = {
			new VanillaWoodEntry(BlockFamilies.ACACIA, Blocks.ACACIA_LOG, Blocks.ACACIA_WOOD,
					Blocks.STRIPPED_ACACIA_LOG, Blocks.STRIPPED_ACACIA_WOOD),
			new VanillaWoodEntry(BlockFamilies.BIRCH, Blocks.BIRCH_LOG, Blocks.BIRCH_WOOD,
					Blocks.STRIPPED_BIRCH_LOG, Blocks.STRIPPED_BIRCH_WOOD),
			new VanillaWoodEntry(BlockFamilies.DARK_OAK, Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_WOOD,
					Blocks.STRIPPED_DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_WOOD),
			new VanillaWoodEntry(BlockFamilies.JUNGLE, Blocks.JUNGLE_LOG, Blocks.JUNGLE_WOOD,
					Blocks.STRIPPED_JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_WOOD),
			new VanillaWoodEntry(BlockFamilies.OAK, Blocks.OAK_LOG, Blocks.OAK_WOOD,
					Blocks.STRIPPED_OAK_LOG, Blocks.STRIPPED_OAK_WOOD),
			new VanillaWoodEntry(BlockFamilies.SPRUCE, Blocks.SPRUCE_LOG, Blocks.SPRUCE_WOOD,
					Blocks.STRIPPED_SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_WOOD),
			new VanillaWoodEntry(BlockFamilies.CHERRY, Blocks.CHERRY_LOG, Blocks.CHERRY_WOOD,
					Blocks.STRIPPED_CHERRY_LOG, Blocks.STRIPPED_CHERRY_WOOD),
			new VanillaWoodEntry(BlockFamilies.MANGROVE, Blocks.MANGROVE_LOG, Blocks.MANGROVE_WOOD,
					Blocks.STRIPPED_MANGROVE_LOG, Blocks.STRIPPED_MANGROVE_WOOD),
			new VanillaWoodEntry(BlockFamilies.PALE_OAK, Blocks.PALE_OAK_LOG, Blocks.PALE_OAK_WOOD,
					Blocks.STRIPPED_PALE_OAK_LOG, Blocks.STRIPPED_PALE_OAK_WOOD),
			new VanillaWoodEntry(BlockFamilies.BAMBOO, Blocks.BAMBOO_BLOCK,
					Blocks.STRIPPED_BAMBOO_BLOCK),
			new VanillaWoodEntry(BlockFamilies.WARPED, Blocks.WARPED_STEM, Blocks.WARPED_HYPHAE,
					Blocks.STRIPPED_WARPED_STEM, Blocks.STRIPPED_WARPED_HYPHAE),
			new VanillaWoodEntry(BlockFamilies.CRIMSON, Blocks.CRIMSON_STEM, Blocks.CRIMSON_HYPHAE,
					Blocks.STRIPPED_CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_HYPHAE)
	};

	private static final Set<BlockFamily.Variant> EXCLUDED_CARPENTRY_VARIANTS =
			EnumSet.of(BlockFamily.Variant.WALL_SIGN, BlockFamily.Variant.SIGN, BlockFamily.Variant.FENCE,
					BlockFamily.Variant.FENCE_GATE);

	public ModRecipeProvider(FabricDataOutput output,
			CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	/**
	 * Generate the recipe generator.
	 * @param registryLookup the {@link RegistryWrapper.WrapperLookup}
	 * @param exporter the {@link RecipeExporter}
	 * @return the {@link RecipeGenerator}
	 */
	@Override
	protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup,
			RecipeExporter exporter) {
		return new RecipeGenerator(registryLookup, exporter) {

			private final List<ItemConvertible> TIN_SMELTABLES = List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE,
					ModBlocks.DEEPSLATE_TIN_ORE);
			private final List<ItemConvertible> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER, ModBlocks.SILVER_ORE,
					ModBlocks.DEEPSLATE_SILVER_ORE);

			/**
			 * Helper method to create a carpentry recipe with advancement criteria.
			 *
			 * @param category the recipe category
			 * @param output the output item
			 * @param input the input item
			 * @param count the output count
			 */
			public void createCarpentryRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input,
					int count) {
				CarpentryRecipeJsonBuilder.createCarpentryRecipeJsonBuilder(category, output, Ingredient.ofItem(input), count)
						.criterion(hasItem(input), this.conditionsFromItem(input))
						.offerTo(this.exporter, DataGenUtils.createRegistryKey(RegistryKeys.RECIPE, convertBetween(output, input) + "_carpentry"));
			}

			 /**
			 * Helper method to create a carpentry recipe with advancement criteria and default count of 1.
			 *
			 * @param category the recipe category
			 * @param output the output item
			 * @param input the input item
			 */
			public void createCarpentryRecipe(RecipeCategory category, ItemConvertible output, ItemConvertible input) {
				CarpentryRecipeJsonBuilder.createCarpentryRecipeJsonBuilder(category, output,
								Ingredient.ofItem(input), 1)
						.criterion(hasItem(input), this.conditionsFromItem(input))
						.offerTo(this.exporter, convertBetween(output, input) + "_carpentry");
			}

			/**
			 * Generate the recipes.
			 */
			@Override
			public void generate() {
				generateModWoodTypeRecipes();
				generateModStoneTypeRecipes();
				generateModGearTypeRecipes();

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

				//ToDo: Replace this code with proper automation once Vanilla Wood Types are expended
				for(VanillaWoodEntry entry : VANILLA_WOOD_TYPES) {
					generateBlockFamilyCarpentryRecipes(entry.family(), entry.logs());
				}
			}

			/**
			 * Generate the recipes for all mod wood types.
			 */
			private void generateModWoodTypeRecipes() {
				for(ModWoodTypes woodType : ModWoodTypes.values()) {
					ModWoodSet woodSet = woodType.getModWoodSet();

					offerBarkBlockRecipe(woodSet.getWoodVariant("base"), woodSet.getLog());
					offerBarkBlockRecipe(woodSet.getStrippedWoodVariant("base"), woodSet.getStrippedLog());
					offerPlanksRecipe(woodSet.getPlanksVariant("base"), woodSet.getLogItemTag(), 4);

					generateFamily(woodSet.getPlanksFamily(), FeatureFlags.VANILLA_FEATURES);
					generateFamily(woodSet.getWoodFamily(), FeatureFlags.VANILLA_FEATURES);
					generateFamily(woodSet.getStrippedWoodFamily(), FeatureFlags.VANILLA_FEATURES);

					generateCarpentryRecipes(woodSet);
				}
			}

			/**
			 * Generate the recipes for all mod stone types.
			 */
			private void generateModStoneTypeRecipes() {
				for(ModStoneTypes stoneType : ModStoneTypes.values()) {
					ModStoneSet stoneSet = stoneType.getModStoneSet();

					stoneSet.getAllBlockFamilies().forEach(family -> generateFamily(family, FeatureFlags.VANILLA_FEATURES));

					stoneSet.getAllStoneSubSets().forEach(subSet -> generateModStoneSubSetRecipes(subSet, subSet.getName()));

					generateStoneCraftingTree(stoneSet);
					generateStoneCuttingRecipes(stoneSet, stoneType.getFileConformName());
				}
			}

			/**
			 * Generate the recipes for all mod gear types.
			 */
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

			/**
			 * Generate the crafting tree for a stone set.
			 *
			 * @param stoneSet the {@link ModStoneSet}
			 */
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

			/**
			 * Generate the stone cutting recipes for a stone set.
			 *
			 * @param stoneSet the {@link ModStoneSet}
			 * @param stoneTypeName the stone type name
			 */
			private void generateStoneCuttingRecipes(ModStoneSet stoneSet, String stoneTypeName) {
				for(StoneTypeVariants variant : StoneTypeVariants.values()) {
					Block stoneBaseBlock = stoneSet.getStoneVariantFamily(variant) != null ?
							stoneSet.getStoneVariantFamily(variant).getBaseBlock() : null;
					Block cobbledBaseBlock = stoneSet.getCobbledVariantFamily(variant) != null ?
							stoneSet.getCobbledVariantFamily(variant).getBaseBlock() : null;

					generateBlockFamilyStoneCutting(stoneSet.getStoneVariantFamily(variant), variant,
							stoneTypeName);
					generateBlockFamilyStoneCutting(stoneSet.getPillarSet().getStoneTypeVariantFamily(variant),
							variant, stoneTypeName + "_pillar",
							stoneBaseBlock);
					generateBlockFamilyStoneCutting(stoneSet.getFriezeSet().getStoneTypeVariantFamily(variant),
							variant, stoneTypeName + "_frieze",
							stoneBaseBlock);
					generateBlockFamilyStoneCutting(stoneSet.getPolishedSet().getStoneTypeVariantFamily(variant),
							variant, "polished_" + stoneTypeName,
							stoneBaseBlock);
					generateBlockFamilyStoneCutting(stoneSet.getBrickSet().getStoneTypeVariantFamily(variant),
							variant, stoneTypeName + "_bricks", stoneBaseBlock,
							stoneSet.getPolishedSet().getStoneTypeVariantFamily(variant).getBaseBlock());
					generateBlockFamilyStoneCutting(stoneSet.getFancyBrickSet().getStoneTypeVariantFamily(variant),
							variant, "fancy_" + stoneTypeName + "_bricks",
							stoneBaseBlock,
							stoneSet.getPolishedSet().getStoneTypeVariantFamily(variant).getBaseBlock(),
							stoneSet.getBrickSet().getStoneTypeVariantFamily(variant).getBaseBlock());

					generateBlockFamilyStoneCutting(stoneSet.getCobbledVariantFamily(variant), variant,
							"cobbled_" + stoneTypeName);
					generateBlockFamilyStoneCutting(stoneSet.getCobbledBrickSet().getStoneTypeVariantFamily(variant),
							variant, "cobbled_" + stoneTypeName + "_bricks",
							cobbledBaseBlock);

					generateBlockFamilyStoneCutting(stoneSet.getRusticBrickSet().getStoneTypeVariantFamily(variant),
							variant, "rustic_" + stoneTypeName + "_bricks");
					generateBlockFamilyStoneCutting(stoneSet.getTileSet().getStoneTypeVariantFamily(variant),
							variant, stoneTypeName + "_tiles",
							stoneSet.getRusticBrickSet().getStoneTypeVariantFamily(variant).getBaseBlock());
					generateBlockFamilyStoneCutting(stoneSet.getPavementSet().getStoneTypeVariantFamily(variant),
							variant, stoneTypeName + "_pavement",
							stoneSet.getRusticBrickSet().getStoneTypeVariantFamily(variant).getBaseBlock(),
							stoneSet.getTileSet().getStoneTypeVariantFamily(variant).getBaseBlock());

					generateBlockFamilyStoneCutting(stoneSet.getSmoothVariantFamily(variant),
							variant, "smooth" + stoneTypeName);
				}
			}

			/**
			 * Generate the recipes for a stone sub set.
			 *
			 * @param subSet the {@link ModStoneSubSet}
			 * @param name the name of the sub set
			 */
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

			/**
			 * Generate stone cutting recipes for a block family.
			 *
			 * @param family the {@link BlockFamily}
			 * @param variant the {@link StoneTypeVariants}
			 * @param familyName the family name
			 * @param baseBlocks optional base blocks for an integrated stone cutting recipe tree
			 */
			private void generateBlockFamilyStoneCutting(BlockFamily family, StoneTypeVariants variant,
					String familyName, Block... baseBlocks) {
				if(family == null) {
					return;
				}
				List<Block> filteredBaseBlocks = Arrays.stream(baseBlocks).filter(Objects::nonNull).toList();
				for(Map.Entry<BlockFamily.Variant, Block> entry : family.getVariants().entrySet()) {
					int count = entry.getKey() == BlockFamily.Variant.SLAB ? 2 : 1;
					RecipeCategory category = entry.getKey() == BlockFamily.Variant.BUTTON ?
							RecipeCategory.REDSTONE : entry.getKey() == BlockFamily.Variant.PRESSURE_PLATE ?
							RecipeCategory.REDSTONE : RecipeCategory.BUILDING_BLOCKS;
					String recipePath = createModStoneRecipeName(familyName,
							familyName + "_" + entry.getKey().getName(),
							variant, "sc");
					generateModStoneCuttingRecipe(category, family.getBaseBlock(),
							entry.getValue(), count, recipePath);
				}
				for(Block block : filteredBaseBlocks) {
					String inputName = DataGenUtils.extractNameFromTranslationKey(block.getTranslationKey());
					generateModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS, block,
							family.getBaseBlock(), 1,
							createModStoneRecipeName(inputName, familyName,
									variant, "sc"));
					for(Map.Entry<BlockFamily.Variant, Block> entry : family.getVariants().entrySet()) {
						int count = entry.getKey() == BlockFamily.Variant.SLAB ? 2 : 1;
						RecipeCategory category = entry.getKey() == BlockFamily.Variant.BUTTON ?
								RecipeCategory.REDSTONE : entry.getKey() == BlockFamily.Variant.PRESSURE_PLATE ?
								RecipeCategory.REDSTONE : RecipeCategory.BUILDING_BLOCKS;
						String recipePath = createModStoneRecipeName(inputName, familyName + entry.getKey().getName(),
								variant, "sc");
						generateModStoneCuttingRecipe(category, block,
								entry.getValue(), count, recipePath);
					}
				}
			}

			/**
			 * Generates a stone cutting recipe. The difference to
			 * {@link #offerStonecuttingRecipe(RecipeCategory, ItemConvertible, ItemConvertible, int)} is that the
			 * .json-filename is defined by the recipePath parameter.
			 *
			 * @param category the {@link RecipeCategory}
			 * @param input the input {@link Block}
			 * @param output the output {@link Block}
			 * @param count the output count
			 * @param recipePath the recipe path
			 */
			private void generateModStoneCuttingRecipe(RecipeCategory category, Block input, Block output, int count,
					String recipePath) {
				StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItem(input), category, output, count)
						.criterion(hasItem(input), this.conditionsFromItem(input))
						.offerTo(this.exporter, recipePath);
			}

			private void generateCarpentryRecipes(ModWoodSet woodSet) {
				generateBlockFamilyCarpentryRecipes(woodSet.getWoodFamily());
				generateBlockFamilyCarpentryRecipes(woodSet.getStrippedWoodFamily());
				generateBlockFamilyCarpentryRecipes(woodSet.getPlanksFamily(), woodSet.getLog(),
						woodSet.getStrippedLog(), woodSet.getWoodVariant("base"), woodSet.getStrippedWoodVariant("base"));
			}

			private void generateBlockFamilyCarpentryRecipes(BlockFamily family, Block... baseBlocks) {
				if (family == null) {
					return;
				}
				List<Block> filteredBaseBlocks = Arrays.stream(baseBlocks).filter(Objects::nonNull).toList();
				for(Map.Entry<BlockFamily.Variant, Block> entry : family.getVariants().entrySet()) {
					if(EXCLUDED_CARPENTRY_VARIANTS.contains(entry.getKey())) {
						continue;
					}
					int count = entry.getKey() == BlockFamily.Variant.SLAB ? 2 : 1;
					RecipeCategory category = entry.getKey() == BlockFamily.Variant.BUTTON ?
							RecipeCategory.REDSTONE : entry.getKey() == BlockFamily.Variant.PRESSURE_PLATE ?
							RecipeCategory.REDSTONE : RecipeCategory.BUILDING_BLOCKS;
					createCarpentryRecipe(category, entry.getValue(), family.getBaseBlock(), count);
				}
				for(Block block : filteredBaseBlocks) {
					createCarpentryRecipe(RecipeCategory.BUILDING_BLOCKS, block, family.getBaseBlock(), 4);
					for(Map.Entry<BlockFamily.Variant, Block> entry : family.getVariants().entrySet()) {
						if(EXCLUDED_CARPENTRY_VARIANTS.contains(entry.getKey())) {
							continue;
						}
						int count = entry.getKey() == BlockFamily.Variant.SLAB ? 2 : 1;
						RecipeCategory category = entry.getKey() == BlockFamily.Variant.BUTTON ?
								RecipeCategory.REDSTONE : entry.getKey() == BlockFamily.Variant.PRESSURE_PLATE ?
								RecipeCategory.REDSTONE : RecipeCategory.BUILDING_BLOCKS;
						createCarpentryRecipe(category, entry.getValue(), block, count*4);
					}
				}
			}

			/**
			 * Generate a stone smelting recipe.
			 *
			 * @param baseBlock the base {@link Block}
			 * @param crackedBlock the cracked {@link Block}
			 * @param recipePath the recipe path or null for default path naming
			 */
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

			/**
			 * Generate an ornamented stone block recipe.
			 *
			 * @param baseBlock the base {@link Block}
			 * @param ornamentedBlock the ornamented {@link Block}
			 * @param ornament the ornament {@link Item}
			 * @param recipePath the recipe path
			 */
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

			/**
			 * Generate a mossy stone block recipe.
			 *
			 * @param normal the normal {@link Block}
			 * @param mossy the mossy {@link Block}
			 * @param recipePath the recipe path
			 */
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

			/**
			 * Generate an overgrown stone block recipe and the mossy recipe using {@link #generateMossyRecipe(Block, Block, String)}.
			 *
			 * @param normal the normal {@link Block}
			 * @param mossy the mossy {@link Block}
			 * @param overgrown the overgrown {@link Block}
			 * @param normalVariant the normal {@link StoneTypeVariants}
			 * @param mossyVariant the mossy {@link StoneTypeVariants}
			 * @param overgrownVariant the overgrown {@link StoneTypeVariants}
			 * @param name the name of the stone sub set
			 */
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

			/**
			 * Generate a pillar stone block recipe.
			 * Intended for {@link com.anedhel.vext.block.custom.ModPillarBlock}
			 *
			 * @param input the input {@link Block}
			 * @param pillar the pillar {@link Block}
			 * @param outputCount the output count
			 */
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

			/**
			 * Generate a frieze stone block recipe.
			 * Intended for {@link com.anedhel.vext.block.custom.ModFriezeBlock}
			 *
			 * @param input the input {@link Block}
			 * @param frieze the frieze {@link Block}
			 * @param outputCount the output count
			 */
			private void generateFriezeRecipe(Block input, Block frieze, int outputCount) {
				this.createShaped(RecipeCategory.BUILDING_BLOCKS, frieze, outputCount)
						.pattern("BBB")
						.input('B', input)
						.group("frieze_stone_bricks")
						.criterion("has_stone_bricks", this.conditionsFromItem(input))
						.offerTo(this.exporter);
			}

			/**
			 * Generate a pavement stone block recipe.
			 *
			 * @param input the input {@link Block}
			 * @param output the pavement {@link Block}
			 * @param outputCount the output count
			 */
			private void generatePavementRecipe(Block input, Block output, int outputCount) {
				this.createShaped(RecipeCategory.BUILDING_BLOCKS, output, outputCount)
						.pattern("B")
						.pattern("B")
						.input('B', input)
						.group("pavement_stone_bricks")
						.criterion("has_stone_bricks", this.conditionsFromItem(input))
						.offerTo(this.exporter);
			}

			/**
			 * Generate a 2x2 checkerboard stone block recipe.
			 *
			 * @param inputA the first input {@link Block}
			 * @param inputB the second input {@link Block}
			 * @param output the checkerboard {@link Block}
			 * @param outputCount the output count
			 */
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

			/**
			 * Generate a 2x2 stone block recipe.
			 *
			 * @param input the input {@link Block}
			 * @param output the output {@link Block}
			 * @param outputCount the output count
			 */
			private void generate2x2Recipe(Block input, Block output, int outputCount) {
				this.createShaped(RecipeCategory.BUILDING_BLOCKS, output, outputCount)
						.pattern("AA")
						.pattern("AA")
						.input('A', input)
						.group("2x2_stone_bricks")
						.criterion("has_stone_bricks", this.conditionsFromItem(input))
						.offerTo(this.exporter);
			}

			/**
			 * Generate a alloy crafting recipe.
			 *
			 * @param inputOne the first input {@link Item}
			 * @param inputTwo the second input {@link Item}
			 * @param output the output {@link Item}
			 * @param outputCount the output count
			 */
			private void generateAlloyCrafting(Item inputOne, Item inputTwo, Item output, int outputCount) {
				this.createShapeless(RecipeCategory.MISC, ModItems.BRONZE_INGOT, outputCount)
						.input(inputOne)
						.input(inputTwo)
						.group("bronze_alloy")
						.criterion("has_ingot" ,this.conditionsFromItem(inputOne))
						.criterion("has_ingot" ,this.conditionsFromItem(inputTwo))
						.offerTo(this.exporter, getItemPath(output) + "_from_alloy_crafting");
			}

			/**
			 * Generate a sword crafting recipe.
			 *
			 * @param material the material {@link Item}
			 * @param sword the sword {@link Item}
			 */
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

			/**
			 * Generate an axe crafting recipe.
			 *
			 * @param material the material {@link Item}
			 * @param axe the axe {@link Item}
			 */
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

			/**
			 * Generate a pickaxe crafting recipe.
			 *
			 * @param material the material {@link Item}
			 * @param pickaxe the pickaxe {@link Item}
			 */
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

			/**
			 * Generate a shovel crafting recipe.
			 *
			 * @param material the material {@link Item}
			 * @param shovel the shovel {@link Item}
			 */
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

			/**
			 * Generate a hoe crafting recipe.
			 *
			 * @param material the material {@link Item}
			 * @param hoe the hoe {@link Item}
			 */
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

			/**
			 * Generate a helmet crafting recipe.
			 *
			 * @param material the material {@link Item}
			 * @param helmet the helmet {@link Item}
			 */
			private void generateHelmetRecipe(Item material, Item helmet) {
				this.createShaped(RecipeCategory.COMBAT, helmet)
						.pattern("XXX")
						.pattern("X X")
						.input('X', material)
						.group("helmets")
						.criterion("has_material", this.conditionsFromItem(material))
						.offerTo(this.exporter);
			}

			/**
			 * Generate a chestplate crafting recipe.
			 *
			 * @param material the material {@link Item}
			 * @param chestplate the chestplate {@link Item}
			 */
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

			/**
			 * Generate a leggings crafting recipe.
			 *
			 * @param material the material {@link Item}
			 * @param leggings the leggings {@link Item}
			 */
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

			/**
			 * Generate a boots crafting recipe.
			 *
			 * @param material the material {@link Item}
			 * @param boots the boots {@link Item}
			 */
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

	/**
	 * Create a mod stone recipe name.
	 *
	 * @param baseName the name of the base Block
	 * @param variant the {@link StoneTypeVariants}
	 * @param recipeType the recipe type suffix
	 * @return the recipe name as String
	 */
	protected String createModStoneRecipeName(String baseName, StoneTypeVariants variant,
			String recipeType) {
		return createModStoneRecipeName(baseName, variant, variant, recipeType);
	}

	/**
	 * Create a mod stone recipe name.
	 *
	 * @param baseName the name of the base Block
	 * @param outputVariant the output {@link StoneTypeVariants}
	 * @param inputVariant the input {@link StoneTypeVariants}
	 * @param recipeType the recipe type suffix
	 * @return the recipe name as String
	 */
	protected String createModStoneRecipeName(String baseName, StoneTypeVariants outputVariant,
			StoneTypeVariants inputVariant, String recipeType) {
		String outputPath = StoneTypeVariants.getRecipePath(outputVariant, baseName);
		String inputPath = StoneTypeVariants.getRecipePath(inputVariant, baseName);
		return outputPath + "_from_" + inputPath + "_" + recipeType;
	}

	/**
	 * Create a mod stone recipe name.
	 *
	 * @param input the name of the input Block
	 * @param output the name of the output Block
	 * @param variant the {@link StoneTypeVariants}
	 * @param recipeType the recipe type suffix
	 * @return the recipe name as String
	 */
	protected String createModStoneRecipeName(String input, String output, StoneTypeVariants variant, String recipeType) {
		String outputPath = StoneTypeVariants.getRecipePath(variant, output);
		String inputPath = StoneTypeVariants.getRecipePath(variant, input);
		return outputPath + "_from_" + inputPath + "_" + recipeType;
	}

	@Override
	public String getName() {
		return "VExt-Mod Recipes";
	}
}

package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModOreType;
import me.anedhel.lotr.block.ModStoneType;
import me.anedhel.lotr.block.ModWoodType;
import me.anedhel.lotr.block.custom.StoneTypeVariants;
import me.anedhel.lotr.item.ModGearType;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * This class is used to register all crafting recipes the mod provides.
 */
public class ModRecipeProvider extends FabricRecipeProvider {

	private static final List<ItemConvertible> TIN_BLOCK_SMELTABLES = List.of(
			ModBlocks.RAW_TIN_BLOCK);
	private static final List<ItemConvertible> IRON_BLOCK_SMELTABLES = List.of(
			Blocks.RAW_IRON_BLOCK);
	private static final List<ItemConvertible> GOLD_BLOCK_SMELTABLES = List.of(
			Blocks.RAW_GOLD_BLOCK);
	private static final List<ItemConvertible> COPPER_BLOCK_SMELTABLES = List.of(
			Blocks.RAW_COPPER_BLOCK);

	public ModRecipeProvider(FabricDataOutput output) {
		super(output);
	}

	/**
	 * This method is where all crafting recipes are added via code.
	 *
	 * @param exporter A RecipeJsonProvider, which is provided by minecraft
	 */
	@Override
	public void generate(RecipeExporter exporter) {
		offerSmelting(exporter, TIN_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.TIN_BLOCK,
		              5.6f, 1600, "tin_block");
		offerBlasting(exporter, TIN_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.TIN_BLOCK,
		              5.6f, 800, "tin_block");
		offerSmelting(exporter, IRON_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.IRON_BLOCK,
                      5.6f,
		              1600, "iron_block");
		offerBlasting(exporter, IRON_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.IRON_BLOCK,
                      5.6f,
		              800, "iron_block");
		offerSmelting(exporter, GOLD_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.GOLD_BLOCK,
                      5.6f,
		              1600, "gold_block");
		offerBlasting(exporter, GOLD_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.GOLD_BLOCK,
                      5.6f,
		              800, "gold_block");
		offerSmelting(exporter, COPPER_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.COPPER_BLOCK,
		              5.6f, 1600, "copper_block");
		offerBlasting(exporter, COPPER_BLOCK_SMELTABLES, RecipeCategory.MISC, Blocks.COPPER_BLOCK,
		              5.6f, 800, "copper_block");

		createCookedFoodRecipes(exporter, ModItems.CORN, ModItems.COOKED_CORN);
		createCookedFoodRecipes(exporter, ModItems.TOMATO, ModItems.BAKED_TOMATO);

		ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_INGOT)
		                          .input(ModItems.TIN_INGOT).input(Items.COPPER_INGOT)
		                          .criterion(hasItem(ModItems.TIN_INGOT),
		                                     conditionsFromItem(ModItems.TIN_INGOT))
		                          .criterion(hasItem(Items.COPPER_INGOT),
		                                     conditionsFromItem(Items.COPPER_INGOT))
		                          .offerTo(exporter, new Identifier(
				                          getRecipeName(ModItems.BRONZE_INGOT) + "_crafting"));

		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
                                         ModItems.RAW_TIN,
		                                 RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK);
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
		                                 ModItems.TIN_INGOT, RecipeCategory.MISC,
		                                 ModBlocks.TIN_BLOCK);
		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,
		                                 ModItems.BRONZE_INGOT, RecipeCategory.MISC,
		                                 ModBlocks.BRONZE_BLOCK);

		ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TOMATO_SEEDS, 1)
		                          .input(ModItems.TOMATO).criterion(hasItem(ModItems.TOMATO),
		                                                            conditionsFromItem(
				                                                            ModItems.TOMATO))
		                          .offerTo(exporter,
		                                   new Identifier(getRecipeName(ModItems.TOMATO_SEEDS)));

		ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORN_SEEDS, 1)
		                          .input(ModItems.CORN).criterion(hasItem(ModItems.CORN),
		                                                          conditionsFromItem(ModItems.CORN))
		                          .offerTo(exporter,
		                                   new Identifier(getRecipeName(ModItems.CORN_SEEDS)));

		createCrateRecipe(ModItems.TOMATO, ModBlocks.TOMATO_CRATE, exporter);
		createCrateRecipe(ModItems.LETTUCE, ModBlocks.LETTUCE_CRATE, exporter);
		createCrateRecipe(ModItems.CORN, ModBlocks.CORN_CRATE, exporter);
		createCrateRecipe(Items.POTATO, ModBlocks.POTATO_CRATE, exporter);
		createCrateRecipe(Items.CARROT, ModBlocks.CARROT_CRATE, exporter);
		createCrateRecipe(Items.BEETROOT, ModBlocks.BEETROOT_CRATE, exporter);

		createModGearTypeRecipes(ModGearType.BRONZE, exporter);
		createModStoneTypeRecipes(exporter);
		createModWoodTypesRecipes(exporter);
		createOreSmeltingRecipes(exporter);
	}

	/**
	 * This Method is used to generate all Crafting Recipes for the given GearType
	 *
	 * @param gearType The ModGearType that all craftingRecipes are to be generated for
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createModGearTypeRecipes(ModGearType gearType, RecipeExporter exporter) {
		Item material = gearType.getMaterial();
		Item helmet = gearType.getHelmet();
		Item chestplate = gearType.getChestplate();
		Item leggings = gearType.getLeggings();
		Item boots = gearType.getBoots();
		Item sword = gearType.getSword();
		Item axe = gearType.getAxe();
		Item pickaxe = gearType.getPickaxe();
		Item shovel = gearType.getShovel();
		Item hoe = gearType.getHoe();

		if(!gearType.isVanillaAddition()) {
			if(helmet != null) {
				createHelmetRecipe(material, helmet, exporter);
			}
			if(chestplate != null) {
				createChestplateRecipe(material, chestplate, exporter);
			}
			if(leggings != null) {
				createLegginsRecipe(material, leggings, exporter);
			}
			if(boots != null) {
				createBootsRecipe(material, boots, exporter);
			}
			if(sword != null) {
				createSwordRecipe(material, sword, exporter);
			}
			if(axe != null) {
				createAxeRecipe(material, axe, exporter);
			}
			if(pickaxe != null) {
				createPickaxeRecipe(material, pickaxe, exporter);
			}
			if(shovel != null) {
				createShovelRecipe(material, shovel, exporter);
			}
			if(hoe != null) {
				createHoeRecipe(material, hoe, exporter);
			}
		}
	}

	/**
	 * This Method is used to create all crafting recipes using the given ModStoneType
	 *
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createModStoneTypeRecipes(RecipeExporter exporter) {
		for(ModStoneType stoneType : ModStoneType.values()) {
			//Crafting
			generateStoneTypeCraftingRecipes(exporter, stoneType.getStoneFamily(),
					stoneType.getBrickFamily(), stoneType.getTilesFamily(),
					stoneType.getFancyBricksFamily(), stoneType.getPavementFamily(),
					stoneType.getPillar(), stoneType.getPillarSlab(),
					StoneTypeVariants.STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, stoneType.getMossyStoneFamily(),
					stoneType.getMossyBrickFamily(), stoneType.getMossyTilesFamily(),
					stoneType.getMossyFancyBricksFamily(), stoneType.getMossyPavementFamily(),
					stoneType.getMossyPillar(), stoneType.getMossyPillarSlab(),
					StoneTypeVariants.MOSSY_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, stoneType.getOvergrownStoneFamily(),
					stoneType.getOvergrownBrickFamily(), stoneType.getOvergrownTilesFamily(),
					stoneType.getOvergrownFancyBricksFamily(), stoneType.getOvergrownPavementFamily(),
					stoneType.getOvergrownPillar(), stoneType.getOvergrownPillarSlab(),
					StoneTypeVariants.OVERGROWN_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeCraftingRecipes(exporter, stoneType.getCobbledFamily(),
					stoneType.getCobbledBrickFamily(), null, null, null, null, null,
					StoneTypeVariants.STONE, "cobbled_" + stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, stoneType.getMossyCobbledFamily(),
					stoneType.getMossyCobbledBrickFamily(), null, null, null, null, null,
					StoneTypeVariants.MOSSY_STONE, "cobbled_" + stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, stoneType.getOvergrownCobbledFamily(),
					stoneType.getOvergrownCobbledBrickFamily(), null, null, null, null, null,
					StoneTypeVariants.OVERGROWN_STONE, "cobbled_" + stoneType.getName().toLowerCase());

			createBlockFamilyCrafting(exporter, stoneType.getCrackedCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyCrafting(exporter, stoneType.getCrackedMossyCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_MOSSY_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyCrafting(exporter, stoneType.getCrackedOvergrownCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_OVERGROWN_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());

			createBlockFamilyCrafting(exporter, stoneType.getBronzeCobbledBrickFamily(),
					StoneTypeVariants.BRONZE_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyCrafting(exporter, stoneType.getMossyBronzeCobbledBrickFamily(),
					StoneTypeVariants.MOSSY_BRONZE_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyCrafting(exporter, stoneType.getOvergrownBronzeCobbledBrickFamily(),
					StoneTypeVariants.OVERGROWN_BRONZE_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());

			createBlockFamilyCrafting(exporter, stoneType.getCrackedBronzeCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_BRONZE_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyCrafting(exporter, stoneType.getCrackedMossyBronzeCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyCrafting(exporter, stoneType.getCrackedOvergrownBronzeCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());

			createBlockFamilyCrafting(exporter, stoneType.getSilverCobbledBrickFamily(),
					StoneTypeVariants.SILVER_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyCrafting(exporter, stoneType.getMossySilverCobbledBrickFamily(),
					StoneTypeVariants.MOSSY_SILVER_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyCrafting(exporter, stoneType.getOvergrownSilverCobbledBrickFamily(),
					StoneTypeVariants.OVERGROWN_SILVER_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());

			createBlockFamilyCrafting(exporter, stoneType.getCrackedSilverCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_SILVER_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyCrafting(exporter, stoneType.getCrackedMossySilverCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyCrafting(exporter, stoneType.getCrackedOvergrownSilverCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());

			createBlockFamilyCrafting(exporter, stoneType.getGoldCobbledBrickFamily(),
					StoneTypeVariants.GOLD_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyCrafting(exporter, stoneType.getMossyGoldCobbledBrickFamily(),
					StoneTypeVariants.MOSSY_GOLD_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyCrafting(exporter, stoneType.getOvergrownGoldCobbledBrickFamily(),
					StoneTypeVariants.OVERGROWN_GOLD_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());

			createBlockFamilyCrafting(exporter, stoneType.getCrackedGoldCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_GOLD_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyCrafting(exporter, stoneType.getCrackedMossyGoldCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyCrafting(exporter, stoneType.getCrackedOvergrownGoldCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());

			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getCrackedBrickFamily(), stoneType.getCrackedTilesFamily(),
					stoneType.getCrackedFancyBricksFamily(), stoneType.getCrackedPavementFamily(),
					stoneType.getCrackedPillar(), stoneType.getCrackedPillarSlab(),
					StoneTypeVariants.CRACKED_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getCrackedBrickFamily(), stoneType.getCrackedTilesFamily(),
					stoneType.getCrackedFancyBricksFamily(), stoneType.getCrackedPavementFamily(),
					stoneType.getCrackedPillar(), stoneType.getCrackedPillarSlab(),
					StoneTypeVariants.CRACKED_MOSSY_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getCrackedBrickFamily(), stoneType.getCrackedTilesFamily(),
					stoneType.getCrackedFancyBricksFamily(), stoneType.getCrackedPavementFamily(),
					stoneType.getCrackedPillar(), stoneType.getCrackedPillarSlab(),
					StoneTypeVariants.CRACKED_OVERGROWN_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getBronzeBrickFamily(), stoneType.getBronzeTilesFamily(),
					stoneType.getBronzeFancyBricksFamily(), stoneType.getBronzePavementFamily(),
					stoneType.getBronzePillar(), stoneType.getBronzePillarSlab(),
					StoneTypeVariants.BRONZE_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getMossyBronzeBrickFamily(), stoneType.getMossyBronzeTilesFamily(),
					stoneType.getMossyBronzeFancyBricksFamily(), stoneType.getMossyBronzePavementFamily(),
					stoneType.getMossyBronzePillar(), stoneType.getMossyBronzePillarSlab(),
					StoneTypeVariants.MOSSY_BRONZE_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getOvergrownBronzeBrickFamily(), stoneType.getOvergrownBronzeTilesFamily(),
					stoneType.getOvergrownBronzeFancyBricksFamily(), stoneType.getOvergrownBronzePavementFamily(),
					stoneType.getOvergrownBronzePillar(), stoneType.getOvergrownBronzePillarSlab(),
					StoneTypeVariants.OVERGROWN_BRONZE_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getCrackedBronzeBrickFamily(), stoneType.getCrackedBronzeTilesFamily(),
					stoneType.getCrackedBronzeFancyBricksFamily(), stoneType.getCrackedBronzePavementFamily(),
					stoneType.getCrackedBronzePillar(), stoneType.getCrackedBronzePillarSlab(),
					StoneTypeVariants.CRACKED_BRONZE_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getCrackedMossyBronzeBrickFamily(), stoneType.getCrackedMossyBronzeTilesFamily(),
					stoneType.getCrackedMossyBronzeFancyBricksFamily(), stoneType.getCrackedMossyBronzePavementFamily(),
					stoneType.getCrackedMossyBronzePillar(), stoneType.getCrackedMossyBronzePillarSlab(),
					StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getCrackedOvergrownBronzeBrickFamily(), stoneType.getCrackedOvergrownBronzeTilesFamily(),
					stoneType.getCrackedOvergrownBronzeFancyBricksFamily(), stoneType.getCrackedOvergrownBronzePavementFamily(),
					stoneType.getCrackedOvergrownBronzePillar(), stoneType.getCrackedOvergrownBronzePillarSlab(),
					StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getSilverBrickFamily(), stoneType.getSilverTilesFamily(),
					stoneType.getSilverFancyBricksFamily(), stoneType.getSilverPavementFamily(),
					stoneType.getSilverPillar(), stoneType.getSilverPillarSlab(),
					StoneTypeVariants.SILVER_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getMossySilverBrickFamily(), stoneType.getMossySilverTilesFamily(),
					stoneType.getMossySilverFancyBricksFamily(), stoneType.getMossySilverPavementFamily(),
					stoneType.getMossySilverPillar(), stoneType.getMossySilverPillarSlab(),
					StoneTypeVariants.MOSSY_SILVER_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getOvergrownSilverBrickFamily(), stoneType.getOvergrownSilverTilesFamily(),
					stoneType.getOvergrownSilverFancyBricksFamily(), stoneType.getOvergrownSilverPavementFamily(),
					stoneType.getOvergrownSilverPillar(), stoneType.getOvergrownSilverPillarSlab(),
					StoneTypeVariants.OVERGROWN_SILVER_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getCrackedSilverBrickFamily(), stoneType.getCrackedSilverTilesFamily(),
					stoneType.getCrackedSilverFancyBricksFamily(), stoneType.getCrackedSilverPavementFamily(),
					stoneType.getCrackedSilverPillar(), stoneType.getCrackedSilverPillarSlab(),
					StoneTypeVariants.CRACKED_SILVER_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getCrackedMossySilverBrickFamily(), stoneType.getCrackedMossySilverTilesFamily(),
					stoneType.getCrackedMossySilverFancyBricksFamily(), stoneType.getCrackedMossySilverPavementFamily(),
					stoneType.getCrackedMossySilverPillar(), stoneType.getCrackedMossySilverPillarSlab(),
					StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getCrackedOvergrownSilverBrickFamily(), stoneType.getCrackedOvergrownSilverTilesFamily(),
					stoneType.getCrackedOvergrownSilverFancyBricksFamily(), stoneType.getCrackedOvergrownSilverPavementFamily(),
					stoneType.getCrackedOvergrownSilverPillar(), stoneType.getCrackedOvergrownSilverPillarSlab(),
					StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getGoldBrickFamily(), stoneType.getGoldTilesFamily(),
					stoneType.getGoldFancyBricksFamily(), stoneType.getGoldPavementFamily(),
					stoneType.getGoldPillar(), stoneType.getGoldPillarSlab(),
					StoneTypeVariants.GOLD_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getMossyGoldBrickFamily(), stoneType.getMossyGoldTilesFamily(),
					stoneType.getMossyGoldFancyBricksFamily(), stoneType.getMossyGoldPavementFamily(),
					stoneType.getMossyGoldPillar(), stoneType.getMossyGoldPillarSlab(),
					StoneTypeVariants.MOSSY_GOLD_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getOvergrownGoldBrickFamily(), stoneType.getOvergrownGoldTilesFamily(),
					stoneType.getOvergrownGoldFancyBricksFamily(), stoneType.getOvergrownGoldPavementFamily(),
					stoneType.getOvergrownGoldPillar(), stoneType.getOvergrownGoldPillarSlab(),
					StoneTypeVariants.OVERGROWN_GOLD_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getCrackedGoldBrickFamily(), stoneType.getCrackedGoldTilesFamily(),
					stoneType.getCrackedGoldFancyBricksFamily(), stoneType.getCrackedGoldPavementFamily(),
					stoneType.getCrackedGoldPillar(), stoneType.getCrackedGoldPillarSlab(),
					StoneTypeVariants.CRACKED_GOLD_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getCrackedMossyGoldBrickFamily(), stoneType.getCrackedMossyGoldTilesFamily(),
					stoneType.getCrackedMossyGoldFancyBricksFamily(), stoneType.getCrackedMossyGoldPavementFamily(),
					stoneType.getCrackedMossyGoldPillar(), stoneType.getCrackedMossyGoldPillarSlab(),
					StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeCraftingRecipes(exporter, null,
					stoneType.getCrackedOvergrownGoldBrickFamily(), stoneType.getCrackedOvergrownGoldTilesFamily(),
					stoneType.getCrackedOvergrownGoldFancyBricksFamily(), stoneType.getCrackedOvergrownGoldPavementFamily(),
					stoneType.getCrackedOvergrownGoldPillar(), stoneType.getCrackedOvergrownGoldPillarSlab(),
					StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, stoneType.getName().toLowerCase());

			//Stone-cutting
			generateStoneTypeVariantStoneCuttingRecipes(exporter, stoneType.getStoneFamily(),
					stoneType.getBrickFamily(), stoneType.getTilesFamily(),
					stoneType.getFancyBricksFamily(),	stoneType.getPavementFamily(),
					stoneType.getPillar(), stoneType.getPillarSlab(), StoneTypeVariants.STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, stoneType.getMossyStoneFamily(),
					stoneType.getMossyBrickFamily(), stoneType.getMossyTilesFamily(),
					stoneType.getMossyFancyBricksFamily(), stoneType.getMossyPavementFamily(),
					stoneType.getMossyPillar(), stoneType.getMossyPillarSlab(), StoneTypeVariants.MOSSY_STONE,
					stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, stoneType.getOvergrownStoneFamily(),
					stoneType.getOvergrownBrickFamily(), stoneType.getOvergrownTilesFamily(),
					stoneType.getOvergrownFancyBricksFamily(), stoneType.getOvergrownPavementFamily(),
					stoneType.getOvergrownPillar(), stoneType.getOvergrownPillarSlab(), StoneTypeVariants.OVERGROWN_STONE,
					stoneType.getName().toLowerCase());

			generateStoneTypeVariantStoneCuttingRecipes(exporter, stoneType.getCobbledFamily(),
					stoneType.getCobbledBrickFamily(), null, null, null, null, null,
					StoneTypeVariants.STONE, "cobbled_" + stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, stoneType.getMossyCobbledFamily(),
					stoneType.getMossyCobbledBrickFamily(), null, null, null, null, null,
					StoneTypeVariants.MOSSY_STONE, "cobbled_" + stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, stoneType.getOvergrownCobbledFamily(),
					stoneType.getOvergrownCobbledBrickFamily(), null, null, null, null, null,
					StoneTypeVariants.OVERGROWN_STONE, "cobbled_" + stoneType.getName().toLowerCase());

			createBlockFamilyStoneCutting(exporter, stoneType.getCrackedCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyStoneCutting(exporter, stoneType.getCrackedMossyCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_MOSSY_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyStoneCutting(exporter, stoneType.getCrackedOvergrownCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_OVERGROWN_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());

			createBlockFamilyStoneCutting(exporter, stoneType.getBronzeCobbledBrickFamily(),
					StoneTypeVariants.BRONZE_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyStoneCutting(exporter, stoneType.getMossyBronzeCobbledBrickFamily(),
					StoneTypeVariants.MOSSY_BRONZE_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyStoneCutting(exporter, stoneType.getOvergrownBronzeCobbledBrickFamily(),
					StoneTypeVariants.OVERGROWN_BRONZE_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());

			createBlockFamilyStoneCutting(exporter, stoneType.getCrackedBronzeCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_BRONZE_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyStoneCutting(exporter, stoneType.getCrackedMossyBronzeCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyStoneCutting(exporter, stoneType.getCrackedOvergrownBronzeCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());

			createBlockFamilyStoneCutting(exporter, stoneType.getSilverCobbledBrickFamily(),
					StoneTypeVariants.SILVER_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyStoneCutting(exporter, stoneType.getMossySilverCobbledBrickFamily(),
					StoneTypeVariants.MOSSY_SILVER_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyStoneCutting(exporter, stoneType.getOvergrownSilverCobbledBrickFamily(),
					StoneTypeVariants.OVERGROWN_SILVER_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());

			createBlockFamilyStoneCutting(exporter, stoneType.getGoldCobbledBrickFamily(),
					StoneTypeVariants.GOLD_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyStoneCutting(exporter, stoneType.getMossyGoldCobbledBrickFamily(),
					StoneTypeVariants.MOSSY_GOLD_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyStoneCutting(exporter, stoneType.getOvergrownGoldCobbledBrickFamily(),
					StoneTypeVariants.OVERGROWN_GOLD_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());

			createBlockFamilyStoneCutting(exporter, stoneType.getCrackedGoldCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_GOLD_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyStoneCutting(exporter, stoneType.getCrackedMossyGoldCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyStoneCutting(exporter, stoneType.getCrackedOvergrownGoldCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());

			createBlockFamilyStoneCutting(exporter, stoneType.getCrackedSilverCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_SILVER_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyStoneCutting(exporter, stoneType.getCrackedMossySilverCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());
			createBlockFamilyStoneCutting(exporter, stoneType.getCrackedOvergrownSilverCobbledBrickFamily(),
					StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getName().toLowerCase());

			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedBrickFamily(), stoneType.getCrackedTilesFamily(),
					stoneType.getCrackedFancyBricksFamily(), stoneType.getCrackedPavementFamily(),
					stoneType.getCrackedPillar(), stoneType.getCrackedPillarSlab(),
					StoneTypeVariants.CRACKED_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedMossyBrickFamily(), stoneType.getCrackedMossyTilesFamily(),
					stoneType.getCrackedMossyFancyBricksFamily(), stoneType.getCrackedMossyPavementFamily(),
					stoneType.getCrackedMossyPillar(), stoneType.getCrackedMossyPillarSlab(),
					StoneTypeVariants.CRACKED_MOSSY_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedOvergrownBrickFamily(), stoneType.getCrackedOvergrownTilesFamily(),
					stoneType.getCrackedOvergrownFancyBricksFamily(), stoneType.getCrackedOvergrownPavementFamily(),
					stoneType.getCrackedOvergrownPillar(), stoneType.getCrackedOvergrownPillarSlab(),
					StoneTypeVariants.CRACKED_OVERGROWN_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getBronzeBrickFamily(), stoneType.getBronzeTilesFamily(),
					stoneType.getBronzeFancyBricksFamily(), stoneType.getBronzePavementFamily(),
					stoneType.getBronzePillar(), stoneType.getBronzePillarSlab(), StoneTypeVariants.BRONZE_STONE,
					stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getMossyBronzeBrickFamily(), stoneType.getMossyBronzeTilesFamily(),
					stoneType.getMossyBronzeFancyBricksFamily(), stoneType.getMossyBronzePavementFamily(),
					stoneType.getMossyBronzePillar(), stoneType.getMossyBronzePillarSlab(),
					StoneTypeVariants.MOSSY_BRONZE_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getOvergrownBronzeBrickFamily(), stoneType.getOvergrownBronzeTilesFamily(),
					stoneType.getOvergrownBronzeFancyBricksFamily(), stoneType.getOvergrownBronzePavementFamily(),
					stoneType.getOvergrownBronzePillar(), stoneType.getOvergrownBronzePillarSlab(),
					StoneTypeVariants.OVERGROWN_BRONZE_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedBronzeBrickFamily(), stoneType.getCrackedBronzeTilesFamily(),
					stoneType.getCrackedBronzeFancyBricksFamily(), stoneType.getCrackedBronzePavementFamily(),
					stoneType.getCrackedBronzePillar(), stoneType.getCrackedBronzePillarSlab(),
					StoneTypeVariants.CRACKED_BRONZE_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedMossyBronzeBrickFamily(), stoneType.getCrackedMossyBronzeTilesFamily(),
					stoneType.getCrackedMossyBronzeFancyBricksFamily(), stoneType.getCrackedMossyBronzePavementFamily(),
					stoneType.getCrackedMossyBronzePillar(), stoneType.getCrackedMossyBronzePillarSlab(),
					StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedOvergrownBronzeBrickFamily(), stoneType.getCrackedOvergrownBronzeTilesFamily(),
					stoneType.getCrackedOvergrownBronzeFancyBricksFamily(), stoneType.getCrackedOvergrownBronzePavementFamily(),
					stoneType.getCrackedOvergrownBronzePillar(), stoneType.getCrackedOvergrownBronzePillarSlab(),
					StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getSilverBrickFamily(), stoneType.getSilverTilesFamily(),
					stoneType.getSilverFancyBricksFamily(), stoneType.getSilverPavementFamily(),
					stoneType.getSilverPillar(), stoneType.getSilverPillarSlab(), StoneTypeVariants.SILVER_STONE,
					stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getMossySilverBrickFamily(), stoneType.getMossySilverTilesFamily(),
					stoneType.getMossySilverFancyBricksFamily(), stoneType.getMossySilverPavementFamily(),
					stoneType.getMossySilverPillar(), stoneType.getMossySilverPillarSlab(),
					StoneTypeVariants.MOSSY_SILVER_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getOvergrownSilverBrickFamily(), stoneType.getOvergrownSilverTilesFamily(),
					stoneType.getOvergrownSilverFancyBricksFamily(), stoneType.getOvergrownSilverPavementFamily(),
					stoneType.getOvergrownSilverPillar(), stoneType.getOvergrownSilverPillarSlab(),
					StoneTypeVariants.OVERGROWN_SILVER_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedSilverBrickFamily(), stoneType.getCrackedSilverTilesFamily(),
					stoneType.getCrackedSilverFancyBricksFamily(), stoneType.getCrackedSilverPavementFamily(),
					stoneType.getCrackedSilverPillar(), stoneType.getCrackedSilverPillarSlab(),
					StoneTypeVariants.CRACKED_SILVER_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedMossySilverBrickFamily(), stoneType.getCrackedMossySilverTilesFamily(),
					stoneType.getCrackedMossySilverFancyBricksFamily(), stoneType.getCrackedMossySilverPavementFamily(),
					stoneType.getCrackedMossySilverPillar(), stoneType.getCrackedMossySilverPillarSlab(),
					StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedOvergrownSilverBrickFamily(), stoneType.getCrackedOvergrownSilverTilesFamily(),
					stoneType.getCrackedOvergrownSilverFancyBricksFamily(), stoneType.getCrackedOvergrownSilverPavementFamily(),
					stoneType.getCrackedOvergrownSilverPillar(), stoneType.getCrackedOvergrownSilverPillarSlab(),
					StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getGoldBrickFamily(), stoneType.getGoldTilesFamily(),
					stoneType.getGoldFancyBricksFamily(), stoneType.getGoldPavementFamily(),
					stoneType.getGoldPillar(), stoneType.getGoldPillarSlab(),
					StoneTypeVariants.GOLD_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getMossyGoldBrickFamily(), stoneType.getMossyGoldTilesFamily(),
					stoneType.getMossyGoldFancyBricksFamily(), stoneType.getMossyGoldPavementFamily(),
					stoneType.getMossyGoldPillar(), stoneType.getMossyGoldPillarSlab(),
					StoneTypeVariants.MOSSY_GOLD_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getOvergrownGoldBrickFamily(), stoneType.getOvergrownGoldTilesFamily(),
					stoneType.getOvergrownGoldFancyBricksFamily(), stoneType.getOvergrownGoldPavementFamily(),
					stoneType.getOvergrownGoldPillar(), stoneType.getOvergrownGoldPillarSlab(),
					StoneTypeVariants.OVERGROWN_GOLD_STONE, stoneType.getName().toLowerCase());

			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedGoldBrickFamily(), stoneType.getCrackedGoldTilesFamily(),
					stoneType.getCrackedGoldFancyBricksFamily(), stoneType.getCrackedGoldPavementFamily(),
					stoneType.getCrackedGoldPillar(), stoneType.getCrackedGoldPillarSlab(),
					StoneTypeVariants.CRACKED_GOLD_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedMossyGoldBrickFamily(), stoneType.getCrackedMossyGoldTilesFamily(),
					stoneType.getCrackedMossyGoldFancyBricksFamily(), stoneType.getCrackedMossyGoldPavementFamily(),
					stoneType.getCrackedMossyGoldPillar(), stoneType.getCrackedMossyGoldPillarSlab(),
					StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE, stoneType.getName().toLowerCase());
			generateStoneTypeVariantStoneCuttingRecipes(exporter, null,
					stoneType.getCrackedOvergrownGoldBrickFamily(), stoneType.getCrackedOvergrownGoldTilesFamily(),
					stoneType.getCrackedOvergrownGoldFancyBricksFamily(), stoneType.getCrackedOvergrownGoldPavementFamily(),
					stoneType.getCrackedOvergrownGoldPillar(), stoneType.getCrackedOvergrownGoldPillarSlab(),
					StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, stoneType.getName().toLowerCase());

			//ToDo: Detailing Crafting Recipes and Smooth Recipes

			if (stoneType.getSmooth() != null) {
				CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getStoneVariant("base")),
								RecipeCategory.BUILDING_BLOCKS, stoneType.getSmooth().asItem(),
								0.1f, 200)
						.criterion("has_stone", VanillaRecipeProvider
								.conditionsFromItem(stoneType.getStoneVariant("base"))).offerTo(exporter);
				if (stoneType.getSmoothSlab() != null) {
					offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getSmoothSlab(), stoneType.getSmooth());
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getSmoothSlab(), stoneType.getSmooth(), 1);
				}
				if (stoneType.getCrackedSmooth() != null) {
					CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getSmooth()),
									RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedSmooth().asItem(),
									0.1f, 200)
							.criterion("has_smooth_stone", VanillaRecipeProvider
									.conditionsFromItem(stoneType.getSmooth())).offerTo(exporter);
					if (stoneType.getCrackedSmoothSlab() != null) {
						offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedSmoothSlab(), stoneType.getCrackedSmooth());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedSmoothSlab(), stoneType.getCrackedSmooth(), 2);
					}
				}
			}
		}
	}

	/**
	 * This Method is used to create all crafting recipes for all ModWoodTypes
	 *
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createModWoodTypesRecipes(RecipeExporter exporter) {
		for(ModWoodType woodType : ModWoodType.values()) {
			if(!woodType.isVanillaAddition()) {
				generateFamily(exporter, woodType.getWoodFamily());
				generateFamily(exporter, woodType.getStrippedWoodFamily());
				generateFamily(exporter, woodType.getPlanksFamily());
				if(woodType.getLog() != null && woodType.getWood() != null
				   && woodType.getStrippedLog() != null && woodType.getStrippedWood() != null) {
					offerBarkBlockRecipe(exporter, woodType.getWood(), woodType.getLog());
					offerBarkBlockRecipe(exporter, woodType.getStrippedWood(),
					                     woodType.getStrippedLog());
					if(woodType.getPlanks() != null) {
						offerPlanksRecipe(exporter, woodType.getPlanks(),
						                  TagKey.of(RegistryKeys.ITEM, new Identifier("lotr",
						                                                              turnBlockIntoTag(
								                                                              woodType.getLog()))),
						                  4);
					}
				}
				if(woodType.getPlanksBoat() != null) {
					offerBoatRecipe(exporter, woodType.getPlanksBoat(), woodType.getPlanks());
					if(woodType.getPlanksChestBoat() != null) {
						offerChestBoatRecipe(exporter, woodType.getPlanksChestBoat(),
						                     woodType.getPlanksBoat());
					}
				}
			}
		}
	}

	/**
	 * This Method is used to create all smelting recipes for all ModOreTypes, that should have a
	 * smelting recipe
	 *
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createOreSmeltingRecipes(RecipeExporter exporter) {
		for(ModOreType oreType : ModOreType.values()) {
			ItemConvertible smeltedDrop;
			String smeltingGroup = switch(oreType) {
				case TIN_ORE -> {
					smeltedDrop = ModItems.TIN_INGOT;
					yield "tin";
				}
				default -> {
					smeltedDrop = null;
					yield "";
				}
			};
			if(smeltedDrop != null) {
				offerSmelting(exporter, oreType.getSmeltables(), RecipeCategory.MISC, smeltedDrop,
				              0.7f, 200, smeltingGroup);
				offerBlasting(exporter, oreType.getSmeltables(), RecipeCategory.MISC, smeltedDrop,
				              0.7f, 100, smeltingGroup);
			}
		}
	}

	private void createCookedFoodRecipes(RecipeExporter exporter, Item rawItem, Item cookedItem) {
		offerFoodCookingRecipe(exporter, "smooking", RecipeSerializer.SMOKING, 100, rawItem,
		                       cookedItem, 0.35f);
		offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING,
                               600,
		                       rawItem, cookedItem, 0.35f);
		CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(rawItem), RecipeCategory.FOOD,
		                                        cookedItem, 0.35f, 200).criterion("has_food",
		                                                                          VanillaRecipeProvider.conditionsFromItem(
				                                                                          rawItem))
		                        .offerTo(exporter);
	}

	/**
	 * This Method is used to generate a Crafting Recipe for a StorageCrate of the FarmItem
	 *
	 * @param item The Farm Item you wish to compact into a crate
	 * @param crate The Crate for the Farm Item
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createCrateRecipe(Item item, Block crate, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, crate, 1).pattern("###")
		                       .pattern("###").pattern("###").input('#', item)
		                       .criterion(hasItem(item), conditionsFromItem(item))
		                       .offerTo(exporter, new Identifier(getRecipeName(item) + "_crate"));

		ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, item, 9).input(crate)
		                          .criterion(hasItem(crate), conditionsFromItem(crate))
		                          .offerTo(exporter, new Identifier(getRecipeName(item)));

	}

	/**
	 * Generates stone cutting recipes for different variants of a stone type.
	 *
	 * @param exporter The exporter to offer the recipes to.
	 * @param stone The base stone block family.
	 * @param bricks The brick block family.
	 * @param tiles The tiles block family.
	 * @param fancyBricks The fancy bricks block family.
	 * @param pavement The pavement block family.
	 * @param pillar The pillar block.
	 * @param pillarSlab The pillar slab block.
	 * @param variant The stone type variant.
	 * @param name The name of the stone type.
	 */
	private void generateStoneTypeVariantStoneCuttingRecipes(RecipeExporter exporter,
			BlockFamily stone, BlockFamily bricks,
			BlockFamily tiles, BlockFamily fancyBricks, BlockFamily pavement, Block pillar, Block pillarSlab,
			StoneTypeVariants variant, String name) {
		if(stone != null) {
			createBlockFamilyStoneCutting(exporter, stone, variant, name, name);
		}
		createBlockFamilyStoneCutting(exporter, bricks, variant, name + "_bricks", name,
				stone != null ? stone.getBaseBlock() : null);
		if(tiles != null && fancyBricks != null && pavement != null) {
			createBlockFamilyStoneCutting(exporter, tiles, variant, name + "_tiles", name,
					stone != null ? stone.getBaseBlock() : null, bricks.getBaseBlock());
			createBlockFamilyStoneCutting(exporter, fancyBricks, variant, name + "_fancy_bricks", name,
					stone != null ? stone.getBaseBlock() : null, bricks.getBaseBlock(), tiles.getBaseBlock());
			createBlockFamilyStoneCutting(exporter, pavement, variant, name + "_pavement", name,
					stone != null ? stone.getBaseBlock() : null, bricks.getBaseBlock(), tiles.getBaseBlock());
		}

		if(pillar != null) {
			if(stone != null) {
				offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS, stone.getBaseBlock(), pillar, 1,
						createModStoneRecipeName(name + "_pillar", name, variant, "_sc"), exporter);
				offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS, stone.getBaseBlock(), pillarSlab, 1,
						createModStoneRecipeName(name + "_pillar_slab", name, variant, "_sc"), exporter);
			}
			offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS, pillar, pillarSlab, 2,
					createModStoneRecipeName(name + "_pillar_slab", name + "_pillar", variant, "_sc"), exporter);
		}
	}

	/**
	 * Creates stone cutting recipes for a block family.
	 *
	 * @param exporter The exporter to offer the recipes to.
	 * @param family The block family to create recipes for.
	 * @param variant The stone type variant.
	 * @param familyName The name of the block family.
	 * @param stoneTypeName The name of the stone type.
	 * @param baseBlocks The base blocks to use for the recipes.
	 */
	private void createBlockFamilyStoneCutting (RecipeExporter exporter, BlockFamily family,
			StoneTypeVariants variant, String familyName, String stoneTypeName, Block... baseBlocks) {
		List<Block> filteredBaseBlocks =
				Arrays.stream(baseBlocks).filter(Objects::nonNull).collect(Collectors.toList());
		for(Block block : filteredBaseBlocks) {
			String inputName = defineInputName(variant, filteredBaseBlocks, block);
			offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
					block, family.getBaseBlock(), 1,
					createModStoneRecipeName(familyName, stoneTypeName + inputName, variant, "_sc"), exporter);
		}
		if(family.getVariant(BlockFamily.Variant.CHISELED) != null) {
			offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
					family.getBaseBlock(), family.getVariant(BlockFamily.Variant.CHISELED), 1,
					createModStoneRecipeName(stoneTypeName + "_chiseled_bricks", familyName, variant, "_sc"), exporter);
			for(Block block : filteredBaseBlocks) {
				String inputName = defineInputName(variant, filteredBaseBlocks, block);
				offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
						block, family.getVariant(BlockFamily.Variant.CHISELED), 1,
						createModStoneRecipeName(stoneTypeName + "_chiseled_bricks", stoneTypeName + inputName, variant, "_sc"), exporter);
			}
		}
		if(family.getVariant(BlockFamily.Variant.STAIRS) != null) {
			offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
					family.getBaseBlock(), family.getVariant(BlockFamily.Variant.STAIRS), 1,
					createModStoneRecipeName(familyName + "_stairs", familyName, variant, "_sc"), exporter);
			for(Block block : filteredBaseBlocks) {
				String inputName = defineInputName(variant, filteredBaseBlocks, block);
				offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
						block, family.getVariant(BlockFamily.Variant.STAIRS), 1,
						createModStoneRecipeName(familyName + "_stairs", stoneTypeName + inputName, variant, "_sc"), exporter);
			}
		}
		if(family.getVariant(BlockFamily.Variant.SLAB) != null) {
			offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
					family.getBaseBlock(), family.getVariant(BlockFamily.Variant.SLAB), 2,
					createModStoneRecipeName(familyName + "_slab", familyName, variant, "_sc"), exporter);
			for(Block block : filteredBaseBlocks) {
				String inputName = defineInputName(variant, filteredBaseBlocks, block);
				offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
						block, family.getVariant(BlockFamily.Variant.SLAB), 2,
						createModStoneRecipeName(familyName + "_slab", stoneTypeName + inputName, variant, "_sc"), exporter);
			}
		}
		if(family.getVariant(BlockFamily.Variant.WALL) != null) {
			offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
					family.getBaseBlock(), family.getVariant(BlockFamily.Variant.WALL), 1,
					createModStoneRecipeName(familyName + "_wall", familyName, variant, "_sc"), exporter);
			for(Block block : filteredBaseBlocks) {
				String inputName = defineInputName(variant, filteredBaseBlocks, block);
				offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
						block, family.getVariant(BlockFamily.Variant.WALL), 1,
						createModStoneRecipeName(familyName + "_wall", stoneTypeName + inputName, variant, "_sc"), exporter);
			}
		}
		if(family.getVariant(BlockFamily.Variant.BUTTON) != null) {
			offerModStoneCuttingRecipe(RecipeCategory.REDSTONE,
					family.getBaseBlock(), family.getVariant(BlockFamily.Variant.BUTTON), 1,
					createModStoneRecipeName(familyName + "_button", familyName, variant, "_sc"), exporter);
			for(Block block : filteredBaseBlocks) {
				String inputName = defineInputName(variant, filteredBaseBlocks, block);
				offerModStoneCuttingRecipe(RecipeCategory.REDSTONE,
						block, family.getVariant(BlockFamily.Variant.BUTTON), 1,
						createModStoneRecipeName(familyName + "_button", stoneTypeName + inputName, variant, "_sc"), exporter);
			}
		}
		if(family.getVariant(BlockFamily.Variant.PRESSURE_PLATE) != null) {
			offerModStoneCuttingRecipe(RecipeCategory.REDSTONE,
					family.getBaseBlock(), family.getVariant(BlockFamily.Variant.PRESSURE_PLATE), 1,
					createModStoneRecipeName(familyName + "_pressure_plate", familyName, variant, "_sc"), exporter);
			for(Block block : filteredBaseBlocks) {
				String inputName = defineInputName(variant, filteredBaseBlocks, block);
				offerModStoneCuttingRecipe(RecipeCategory.REDSTONE,
						block, family.getVariant(BlockFamily.Variant.PRESSURE_PLATE), 1,
						createModStoneRecipeName(familyName + "_pressure_plate", stoneTypeName + inputName, variant, "_sc"), exporter);
			}
		}
	}

	/**
	 * Defines the input name based on the stone type variant and the block's position in the list.
	 *
	 * @param variant The stone type variant.
	 * @param filteredBaseBlocks The list of base blocks.
	 * @param block The block for which the input name is being defined.
	 * @return The input name as a string.
	 */
	private String defineInputName(StoneTypeVariants variant, List<Block> filteredBaseBlocks, Block block) {
		int blockIndex = filteredBaseBlocks.indexOf(block);
		String inputName;
		if(!StoneTypeVariants.isOrnamented(variant) && !StoneTypeVariants.isCracked(variant)) {
			inputName = blockIndex == 0 ? "" : blockIndex == 1 ? "_bricks" : "_tiles";
		} else {
			inputName = blockIndex == 0 ? "_bricks" : "tiles";
		}
		return inputName;
	}

	/**
	 * Generates crafting recipes for different variants of a stone type.
	 *
	 * @param exporter The exporter to offer the recipes to.
	 * @param stone The base stone block family.
	 * @param brick The brick block family.
	 * @param tiles The tiles block family.
	 * @param fancyBricks The fancy bricks block family.
	 * @param pavement The pavement block family.
	 * @param pillar The pillar block.
	 * @param pillarSlab The pillar slab block.
	 * @param variant The stone type variant.
	 * @param name The name of the stone type.
	 */
	private void generateStoneTypeCraftingRecipes(RecipeExporter exporter, BlockFamily stone, BlockFamily brick,
			BlockFamily tiles, BlockFamily fancyBricks, BlockFamily pavement, Block pillar, Block pillarSlab,
			StoneTypeVariants variant, String name) {
		if(stone != null) {
			createBlockFamilyCrafting(exporter, stone, variant, name, name);
			createModBricksRecipe(exporter, stone.getBaseBlock(), brick.getBaseBlock(),
					createModStoneRecipeName(name + "_bricks", name, variant, "_ct"));
		}
		createBlockFamilyCrafting(exporter, brick, variant, name + "_bricks", name);
		if(tiles != null && fancyBricks != null && pavement != null) {
			createModBricksRecipe(exporter, brick.getBaseBlock(), tiles.getBaseBlock(),
					createModStoneRecipeName(name + "_tiles", name + "_bricks", variant, "_ct"));
			createBlockFamilyCrafting(exporter, tiles, variant, name + "_tiles", name);

			createModBricksRecipe(exporter, tiles.getBaseBlock(), fancyBricks.getBaseBlock(),
					createModStoneRecipeName("fancy_" + name + "_bricks", name + "_tiles",
							variant, "_ct"));
			createBlockFamilyCrafting(exporter, fancyBricks, variant, "fancy_" + name + "_bricks", name);

			createModPavementRecipe(exporter, tiles.getBaseBlock(), pavement.getBaseBlock(),
					createModStoneRecipeName(name + "_pavement", name + "_tiles",
							variant, "_ct"));
			createBlockFamilyCrafting(exporter, pavement, variant, name + "_pavement", name);
		}

		if(pillar != null) {
			if(stone != null) {
				createModPillarRecipe(exporter, stone.getBaseBlock(), pillar,
						createModStoneRecipeName(name + "_pillar", name, variant, "_ct"));
			}
			createModSlabRecipe(exporter, pillar, pillarSlab,
					createModStoneRecipeName(name + "_pillar_slab", name + "_pillar", variant, "_ct"));
		}
	}

	/**
	 * Creates crafting recipes for a block family.
	 *
	 * @param exporter The exporter to offer the recipes to.
	 * @param family The block family to create recipes for.
	 * @param variant The stone type variant.
	 * @param familyName The name of the block family.
	 * @param stoneTypeName The name of the stone type.
	 */
	private void createBlockFamilyCrafting(RecipeExporter exporter, BlockFamily family,
			StoneTypeVariants variant, String familyName, String stoneTypeName) {
		if(family.getVariant(BlockFamily.Variant.CHISELED) != null) {
			createModChiseledRecipe(exporter, family.getVariant(BlockFamily.Variant.SLAB),
					family.getVariant(BlockFamily.Variant.CHISELED),
					createModStoneRecipeName(stoneTypeName + "_chiseled_bricks", familyName, variant, "_ct"));
		}
		if(family.getVariant(BlockFamily.Variant.STAIRS) != null) {
			createModStairRecipe(exporter, family.getBaseBlock(), family.getVariant(BlockFamily.Variant.STAIRS),
					createModStoneRecipeName(familyName + "_stairs", familyName, variant, "_ct"));
		}
		if(family.getVariant(BlockFamily.Variant.SLAB) != null) {
			createModSlabRecipe(exporter, family.getBaseBlock(), family.getVariant(BlockFamily.Variant.SLAB),
					createModStoneRecipeName(familyName + "_slab", familyName, variant, "_ct"));
		}
		if(family.getVariant(BlockFamily.Variant.WALL) != null) {
			createModWallRecipe(exporter, family.getBaseBlock(), family.getVariant(BlockFamily.Variant.WALL),
					createModStoneRecipeName(familyName + "_wall", familyName, variant, "_ct"));
		}
		if(family.getVariant(BlockFamily.Variant.BUTTON) != null) {
			createModButtonRecipe(exporter, family.getBaseBlock(), family.getVariant(BlockFamily.Variant.BUTTON),
					createModStoneRecipeName(familyName + "_button", familyName, variant, "_ct"));
		}
		if(family.getVariant(BlockFamily.Variant.PRESSURE_PLATE) != null) {
			createModPressurePlateRecipe(exporter, family.getBaseBlock(),
					family.getVariant(BlockFamily.Variant.PRESSURE_PLATE),
					createModStoneRecipeName(familyName + "_pressure_plate", familyName, variant, "_ct"));
		}
	}

	/**
	 * Creates a chiseled block recipe. The difference between this and the vanilla method, is that the
	 * .json-filename can be defined.
	 *
	 * @param exporter The exporter to offer the recipe to.
	 * @param input The input block for the recipe.
	 * @param output The output block for the recipe.
	 * @param recipePath The path for the recipe.
	 */
	private void createModChiseledRecipe(RecipeExporter exporter, Block input, Block output, String recipePath) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("#")
				.pattern("#").input('#', input)
				.criterion(hasItem(input), conditionsFromItem(input))
				.offerTo(exporter, recipePath);
	}

	/**
	 * Creates a crafting recipe for stairs from the given input block. The difference between this and the vanilla method, is that the
	 * .json-filename can be defined.
	 *
	 * @param exporter The exporter to offer the recipe to.
	 * @param input The input block for the recipe.
	 * @param output The output block (stairs) for the recipe.
	 * @param recipePath The path for the recipe.
	 */
	private void createModStairRecipe(RecipeExporter exporter, Block input, Block output, String recipePath) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4).pattern("  #")
				.pattern(" ##").pattern("###").input('#', input)
				.criterion(hasItem(input), conditionsFromItem(input))
				.offerTo(exporter, recipePath);
	}

	/**
	 * Creates a crafting recipe for slabs from the given input block.
	 * The difference between this and the vanilla method is that the
	 * .json-filename can be defined.
	 *
	 * @param exporter The exporter to offer the recipe to.
	 * @param input The input block for the recipe.
	 * @param output The output block (slabs) for the recipe.
	 * @param recipePath The path for the recipe.
	 */
	private void createModSlabRecipe(RecipeExporter exporter, Block input, Block output, String recipePath) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6).pattern("###")
				.input('#', input)
				.criterion(hasItem(input), conditionsFromItem(input))
				.offerTo(exporter, recipePath);
	}

	/**
	 * Creates a crafting recipe for walls from the given input block.
	 * The difference between this and the vanilla method is that the
	 * .json-filename can be defined.
	 *
	 * @param exporter The exporter to offer the recipe to.
	 * @param input The input block for the recipe.
	 * @param output The output block (walls) for the recipe.
	 * @param recipePath The path for the recipe.
	 */
	private void createModWallRecipe(RecipeExporter exporter, Block input, Block output, String recipePath){
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6).pattern("###")
				.pattern("###").input('#', input)
				.criterion(hasItem(input), conditionsFromItem(input))
				.offerTo(exporter, recipePath);
	}

	/**
	 * Creates a crafting recipe for a button from the given input block.
	 * The difference between this and the vanilla method is that the
	 * .json-filename can be defined.
	 *
	 * @param exporter The exporter to offer the recipe to.
	 * @param input The input block for the recipe.
	 * @param output The output block (button) for the recipe.
	 * @param recipePath The path for the recipe.
	 */
	private void createModButtonRecipe(RecipeExporter exporter, Block input, Block output, String recipePath) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 1).pattern(" # ")
				.input('#', input)
				.criterion(hasItem(input), conditionsFromItem(input))
				.offerTo(exporter, recipePath);
	}

	/**
	 * Creates a crafting recipe for a pressure plate from the given input block.
	 * The difference between this and the vanilla method is that the
	 * .json-filename can be defined.
	 *
	 * @param exporter The exporter to offer the recipe to.
	 * @param input The input block for the recipe.
	 * @param output The output block (pressure plate) for the recipe.
	 * @param recipePath The path for the recipe.
	 */
	private void createModPressurePlateRecipe(RecipeExporter exporter, Block input, Block output, String recipePath) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("##")
				.input('#', input)
				.criterion(hasItem(input), conditionsFromItem(input))
				.offerTo(exporter, recipePath);
	}

	/**
	 * Creates a crafting recipe for bricks from the given input block.
	 * The difference between this and the vanilla method is that the
	 * .json-filename can be defined.
	 *
	 * @param exporter The exporter to offer the recipe to.
	 * @param input The input block for the recipe.
	 * @param output The output block (bricks) for the recipe.
	 * @param recipePath The path for the recipe.
	 */
	private void createModBricksRecipe(RecipeExporter exporter, Block input, Block output, String recipePath) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4).pattern("##")
		                       .pattern("##").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, recipePath);
	}

	/**
	 * Creates a crafting recipe for pavement blocks from the given input block.
	 * The difference between this and the vanilla method is that the
	 * .json-filename can be defined.
	 *
	 * @param exporter The exporter to offer the recipe to.
	 * @param input The input block for the recipe.
	 * @param output The output block (pavement) for the recipe.
	 * @param recipePath The path for the recipe.
	 */
	private void createModPavementRecipe(RecipeExporter exporter, Block input, Block output, String recipePath) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 2).pattern("#")
				.pattern("#").input('#', input)
				.criterion(hasItem(input), conditionsFromItem(input))
				.offerTo(exporter, recipePath);
	}

	/**
	 * Creates a pillar recipe for the given input and output blocks. The difference between this and the vanilla method, is that the
	 * 	 * .json-filename can be defined.
	 *
	 * @param exporter The exporter to offer the recipe to.
	 * @param input The input block for the recipe.
	 * @param output The output block for the recipe.
	 * @param recipePath The path for the recipe.
	 */
	private void createModPillarRecipe(RecipeExporter exporter, Block input, Block output, String recipePath) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 3).pattern("#")
		                       .pattern("#").pattern("#").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, recipePath);
	}

	/**
	* Creates a shapeless crafting recipe for a mossy variant of a block.
	*
	* @param input The base block to be combined with a vine to create the mossy variant.
	* @param output The resulting mossy block.
	* @param exporter The exporter to which the recipe will be offered.
	*/
	private void createMossyRecipe(Block input, Block output, RecipeExporter exporter) {
	 ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
	         .input(input)
	         .input(Items.VINE)
	         .criterion(hasItem(input), conditionsFromItem(input))
	         .offerTo(exporter, new Identifier(getRecipeName(output) + "_crafting"));
	}

	/**
	* Creates a shapeless crafting recipe for an overgrown variant of a block.
	*
	* @param input The base block to be combined with vines to create the overgrown variant.
	* @param output The resulting overgrown block.
	* @param exporter The exporter to which the recipe will be offered.
	*/
	private void createOvergrownRecipe(Block input, Block output, RecipeExporter exporter) {
	ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
	    .input(input)
	    .input(Items.VINE)
	    .input(Items.VINE)
	    .criterion(hasItem(input), conditionsFromItem(input))
	    .offerTo(exporter, new Identifier(getRecipeName(output) + "_doublevines"));
	}

	/**
	* Creates a crafting recipe for an ornamented block.
	*
	* @param inputBlock The base block to be ornamented.
	* @param inputItem The item used for ornamentation.
	* @param output The resulting ornamented block.
	* @param exporter The exporter to which the recipe will be offered.
	*/
	private void createOrnamentedRecipe(Block inputBlock, Item inputItem, Block output, RecipeExporter exporter) {
	 ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
	         .pattern("OOO")
	         .pattern("O#O")
	         .pattern("OOO")
	         .input('#', inputBlock)
	         .input('O', inputItem)
	         .criterion(hasItem(inputItem), conditionsFromItem(inputItem))
	         .criterion(hasItem(inputBlock), conditionsFromItem(inputBlock))
	         .offerTo(exporter, new Identifier(getRecipeName(output) + "_crafting"));
	}

	/**
	 * Offers a stonecutting recipe to the exporter. The difference between this and the vanilla method, is that the
	 * .json-filename can be defined.
	 *
	 * @param category The category of the recipe.
	 * @param input The input block for the stonecutting recipe.
	 * @param output The output block for the stonecutting recipe.
	 * @param count The number of output items produced.
	 * @param recipePath The path identifier for the recipe.
	 * @param exporter The exporter to which the recipe will be offered.
	 */
	private void offerModStoneCuttingRecipe(RecipeCategory category, Block input, Block output, int count,
			String recipePath, RecipeExporter exporter) {
		SingleItemRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(input), category, output, count)
				.criterion(RecipeProvider.hasItem(input), conditionsFromItem(input))
				.offerTo(exporter, recipePath);
	}

	/**
	 * Creates a stone cutting recipe name based on various attributes.
	 *
	 * @param outputName The name of the output block.
	 * @param inputName The name of the input block.
	 * @param variant The variant of the stone type.
	 * @param recipeType The type of recipe ("_sc" for stonecutting, "_ct" for crafting grid, "_f" for furnace).
	 * @return The generated stone cutting recipe name.
	 */
	private String createModStoneRecipeName(String outputName, String inputName, StoneTypeVariants variant, String recipeType) {
		String outputPath = StoneTypeVariants.getRecipePath(variant, outputName);
		String inputPath = StoneTypeVariants.getRecipePath(variant, inputName);
		return outputPath + "_from_" + inputPath + recipeType;
	}

	/**
	 * This method creates a SwordRecipe for the given input.
	 *
	 * @param input Ingredient, that should be a ModToolMaterial
	 * @param output The sword made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createSwordRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("#")
		                       .pattern("#").pattern("S").input('#', input).input('S', Items.STICK)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a AxeRecipe for the given input.
	 *
	 * @param input Ingredient, that should be a ModToolMaterial
	 * @param output The axe made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createAxeRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("## ")
		                       .pattern("#S ").pattern(" S ").input('#', input)
		                       .input('S', Items.STICK)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a PickaxeRecipe for the given input.
	 *
	 * @param input Ingredient, that should be a ModToolMaterial
	 * @param output The pickaxe made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createPickaxeRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("###")
		                       .pattern(" S ").pattern(" S ").input('#', input)
		                       .input('S', Items.STICK)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a ShovelRecipe for the given input.
	 *
	 * @param input Ingredient, that should be a ModToolMaterial
	 * @param output The shovel made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createShovelRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("#")
		                       .pattern("S").pattern("S").input('#', input).input('S', Items.STICK)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a HoeRecipe for the given input.
	 *
	 * @param input Ingredient, that should be a ModToolMaterial
	 * @param output The how made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createHoeRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("## ")
		                       .pattern(" S ").pattern(" S ").input('#', input)
		                       .input('S', Items.STICK)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a HelmetRecipe for the given input
	 *
	 * @param input Ingredient, that should be a ModArmorMaterial
	 * @param output The helmet made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createHelmetRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("###")
		                       .pattern("# #").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a ChestplateRecipe for the given input
	 *
	 * @param input Ingredient, that should be a ModArmorMaterial
	 * @param output The chestplate made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createChestplateRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("# #")
		                       .pattern("###").pattern("###").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a LegginsRecipe for the given input
	 *
	 * @param input Ingredient, that should be a ModArmorMaterial
	 * @param output The leggins made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createLegginsRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("###")
		                       .pattern("# #").pattern("# #").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This method creates a BootsRecipe for the given input
	 *
	 * @param input Ingredient, that should be a ModArmorMaterial
	 * @param output The boots made from the Ingredient
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createBootsRecipe(Item input, Item output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("# #")
		                       .pattern("# #").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	private String turnBlockIntoTag(Block block) {
		return block.getName().getString().replace(' ', '_').toLowerCase();
	}
}
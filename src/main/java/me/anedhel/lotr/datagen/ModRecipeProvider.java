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

import java.util.*;
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
	 * This Method becomes more relevant, when more gearTypes are added
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

			//Detailing (Cracked, Mossy, Overgrown, Ornamented)
			createOvergrownBlockFamilyCrafting(exporter, stoneType.getStoneFamily(), stoneType.getMossyStoneFamily(),
					stoneType.getOvergrownStoneFamily(), StoneTypeVariants.OVERGROWN_STONE, stoneType.getName().toLowerCase());
			createOvergrownBlockFamilyCrafting(exporter, stoneType.getCobbledFamily(), stoneType.getMossyCobbledFamily(),
					stoneType.getOvergrownCobbledFamily(), StoneTypeVariants.OVERGROWN_STONE,
					"cobbled_" + stoneType.getName().toLowerCase());

			generateStoneTypeDecorationCrafting(exporter, "cobbled_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getCobbledBrickFamily(), stoneType.getMossyCobbledBrickFamily(), stoneType.getOvergrownCobbledBrickFamily(),
					stoneType.getBronzeCobbledBrickFamily(), stoneType.getMossyBronzeCobbledBrickFamily(),
					stoneType.getOvergrownBronzeCobbledBrickFamily(),
					stoneType.getSilverCobbledBrickFamily(), stoneType.getMossySilverCobbledBrickFamily(),
					stoneType.getOvergrownSilverCobbledBrickFamily(),
					stoneType.getGoldCobbledBrickFamily(), stoneType.getMossyGoldCobbledBrickFamily(),
					stoneType.getOvergrownGoldCobbledBrickFamily(),
					stoneType.getCrackedCobbledBrickFamily(), stoneType.getCrackedMossyCobbledBrickFamily(),
					stoneType.getCrackedOvergrownCobbledBrickFamily(),
					stoneType.getCrackedBronzeCobbledBrickFamily(), stoneType.getCrackedMossyBronzeCobbledBrickFamily(),
					stoneType.getCrackedOvergrownBronzeCobbledBrickFamily(),
					stoneType.getCrackedSilverCobbledBrickFamily(), stoneType.getCrackedMossySilverCobbledBrickFamily(),
					stoneType.getCrackedOvergrownSilverCobbledBrickFamily(),
					stoneType.getCrackedGoldCobbledBrickFamily(), stoneType.getCrackedMossyGoldCobbledBrickFamily(),
					stoneType.getCrackedOvergrownGoldCobbledBrickFamily());

			generateStoneTypeDecorationCrafting(exporter, stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getBrickFamily(), stoneType.getMossyBrickFamily(), stoneType.getOvergrownBrickFamily(),
					stoneType.getBronzeBrickFamily(), stoneType.getMossyBronzeBrickFamily(),
					stoneType.getOvergrownBronzeBrickFamily(),
					stoneType.getSilverBrickFamily(), stoneType.getMossySilverBrickFamily(),
					stoneType.getOvergrownSilverBrickFamily(),
					stoneType.getGoldBrickFamily(), stoneType.getMossyGoldBrickFamily(),
					stoneType.getOvergrownGoldBrickFamily(),
					stoneType.getCrackedBrickFamily(), stoneType.getCrackedMossyBrickFamily(),
					stoneType.getCrackedOvergrownBrickFamily(),
					stoneType.getCrackedBronzeBrickFamily(), stoneType.getCrackedMossyBronzeBrickFamily(),
					stoneType.getCrackedOvergrownBronzeBrickFamily(),
					stoneType.getCrackedSilverBrickFamily(), stoneType.getCrackedMossySilverBrickFamily(),
					stoneType.getCrackedOvergrownSilverBrickFamily(),
					stoneType.getCrackedGoldBrickFamily(), stoneType.getCrackedMossyGoldBrickFamily(),
					stoneType.getCrackedOvergrownGoldBrickFamily());

			generateStoneTypeDecorationCrafting(exporter, stoneType.getName().toLowerCase() + "_tiles",
					stoneType.getTilesFamily(), stoneType.getMossyTilesFamily(), stoneType.getOvergrownTilesFamily(),
					stoneType.getBronzeTilesFamily(), stoneType.getMossyBronzeTilesFamily(),
					stoneType.getOvergrownBronzeTilesFamily(),
					stoneType.getSilverTilesFamily(), stoneType.getMossySilverTilesFamily(),
					stoneType.getOvergrownSilverTilesFamily(),
					stoneType.getGoldTilesFamily(), stoneType.getMossyGoldTilesFamily(),
					stoneType.getOvergrownGoldTilesFamily(),
					stoneType.getCrackedTilesFamily(), stoneType.getCrackedMossyTilesFamily(),
					stoneType.getCrackedOvergrownTilesFamily(),
					stoneType.getCrackedBronzeTilesFamily(), stoneType.getCrackedMossyBronzeTilesFamily(),
					stoneType.getCrackedOvergrownBronzeTilesFamily(),
					stoneType.getCrackedSilverTilesFamily(), stoneType.getCrackedMossySilverTilesFamily(),
					stoneType.getCrackedOvergrownSilverTilesFamily(),
					stoneType.getCrackedGoldTilesFamily(), stoneType.getCrackedMossyGoldTilesFamily(),
					stoneType.getCrackedOvergrownGoldTilesFamily());

			generateStoneTypeDecorationCrafting(exporter, stoneType.getName().toLowerCase() + "_pavement",
					stoneType.getPavementFamily(), stoneType.getMossyPavementFamily(), stoneType.getOvergrownPavementFamily(),
					stoneType.getBronzePavementFamily(), stoneType.getMossyBronzePavementFamily(),
					stoneType.getOvergrownBronzePavementFamily(),
					stoneType.getSilverPavementFamily(), stoneType.getMossySilverPavementFamily(),
					stoneType.getOvergrownSilverPavementFamily(),
					stoneType.getGoldPavementFamily(), stoneType.getMossyGoldPavementFamily(),
					stoneType.getOvergrownGoldPavementFamily(),
					stoneType.getCrackedPavementFamily(), stoneType.getCrackedMossyPavementFamily(),
					stoneType.getCrackedOvergrownPavementFamily(),
					stoneType.getCrackedBronzePavementFamily(), stoneType.getCrackedMossyBronzePavementFamily(),
					stoneType.getCrackedOvergrownBronzePavementFamily(),
					stoneType.getCrackedSilverPavementFamily(), stoneType.getCrackedMossySilverPavementFamily(),
					stoneType.getCrackedOvergrownSilverPavementFamily(),
					stoneType.getCrackedGoldPavementFamily(), stoneType.getCrackedMossyGoldPavementFamily(),
					stoneType.getCrackedOvergrownGoldPavementFamily());

			generateStoneTypeDecorationCrafting(exporter, "fancy_" + stoneType.getName().toLowerCase() + "_bricks",
					stoneType.getFancyBricksFamily(), stoneType.getMossyFancyBricksFamily(),
					stoneType.getOvergrownFancyBricksFamily(),
					stoneType.getBronzeFancyBricksFamily(), stoneType.getMossyBronzeFancyBricksFamily(),
					stoneType.getOvergrownBronzeFancyBricksFamily(),
					stoneType.getSilverFancyBricksFamily(), stoneType.getMossySilverFancyBricksFamily(),
					stoneType.getOvergrownSilverFancyBricksFamily(),
					stoneType.getGoldFancyBricksFamily(), stoneType.getMossyGoldFancyBricksFamily(),
					stoneType.getOvergrownGoldFancyBricksFamily(),
					stoneType.getCrackedFancyBricksFamily(), stoneType.getCrackedMossyFancyBricksFamily(),
					stoneType.getCrackedOvergrownFancyBricksFamily(),
					stoneType.getCrackedBronzeFancyBricksFamily(), stoneType.getCrackedMossyBronzeFancyBricksFamily(),
					stoneType.getCrackedOvergrownBronzeFancyBricksFamily(),
					stoneType.getCrackedSilverFancyBricksFamily(), stoneType.getCrackedMossySilverFancyBricksFamily(),
					stoneType.getCrackedOvergrownSilverFancyBricksFamily(),
					stoneType.getCrackedGoldFancyBricksFamily(), stoneType.getCrackedMossyGoldFancyBricksFamily(),
					stoneType.getCrackedOvergrownGoldFancyBricksFamily());

			createBlockDecorating(exporter, stoneType.getPillarBlocks(), stoneType.getName().toLowerCase(), "_pillar");
			createBlockDecorating(exporter, stoneType.getPillarSlabs(), stoneType.getName().toLowerCase(),
					"_pillar_slab");

			CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getStoneVariant("base")),
							RecipeCategory.BUILDING_BLOCKS, stoneType.getSmooth().asItem(),
							0.1f, 200)
					.criterion("has_stone", VanillaRecipeProvider
							.conditionsFromItem(stoneType.getStoneVariant("base"))).offerTo(exporter,
							stoneType.getName().toLowerCase() + "_smooth_stone_smelting");
			CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(stoneType.getSmooth()),
					RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedSmooth().asItem(),
					0.1f, 200)
					.criterion("has_smooth", VanillaRecipeProvider
							.conditionsFromItem(stoneType.getSmooth())).offerTo(exporter,
							stoneType.getName().toLowerCase() + "_cracked_smooth_stone_smelting");

			createBlockDecorating(exporter, stoneType.getSmoothStone(), stoneType.getName().toLowerCase(),
					"_smooth_stone");
			createBlockDecorating(exporter, stoneType.getSmoothStoneSlabs(), stoneType.getName().toLowerCase(),
					"smooth_stone_slab");

			generateSmoothCrafting(exporter, stoneType.getSmoothStone(), stoneType.getSmoothStoneSlabs(),
					stoneType.getName().toLowerCase());
			generateSmoothStoneCutting(exporter, stoneType.getSmoothStone(), stoneType.getSmoothStoneSlabs(),
					stoneType.getName().toLowerCase());
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
	 * The <code>switch</code> expression will have more <code>case</code> statements in the future, therefor the
	 * warning can be ignored.
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
		//Possible change for the future: 8 cropDrops and wooden Planks/Log as alternative
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
	 * Generates decoration crafting recipes for different variants of a stone type.
	 *
	 * @param exporter The exporter to offer the recipes to.
	 * @param familyName The name of the stone type family.
	 * @param base The base block family.
	 * @param mossy The mossy block family.
	 * @param overgrown The overgrown block family.
	 * @param bronze The bronze block family.
	 * @param mossyBronze The mossy bronze block family.
	 * @param overgrownBronze The overgrown bronze block family.
	 * @param silver The silver block family.
	 * @param mossySilver The mossy silver block family.
	 * @param overgrownSilver The overgrown silver block family.
	 * @param gold The gold block family.
	 * @param mossyGold The mossy gold block family.
	 * @param overgrownGold The overgrown gold block family.
	 * @param cracked The cracked block family.
	 * @param mossyCracked The mossy cracked block family.
	 * @param overgrownCracked The overgrown cracked block family.
	 * @param crackedBronze The cracked bronze block family.
	 * @param crackedMossyBronze The cracked mossy bronze block family.
	 * @param crackedOvergrownBronze The cracked overgrown bronze block family.
	 * @param crackedSilver The cracked silver block family.
	 * @param crackedMossySilver The cracked mossy silver block family.
	 * @param crackedOvergrownSilver The cracked overgrown silver block family.
	 * @param crackedGold The cracked gold block family.
	 * @param crackedMossyGold The cracked mossy gold block family.
	 * @param crackedOvergrownGold The cracked overgrown gold block family.
	 */
	private void generateStoneTypeDecorationCrafting(RecipeExporter exporter, String familyName,
			BlockFamily base, BlockFamily mossy, BlockFamily overgrown,
			BlockFamily bronze, BlockFamily mossyBronze, BlockFamily overgrownBronze,
			BlockFamily silver, BlockFamily mossySilver, BlockFamily overgrownSilver,
			BlockFamily gold, BlockFamily mossyGold, BlockFamily overgrownGold,
			BlockFamily cracked, BlockFamily mossyCracked, BlockFamily overgrownCracked,
			BlockFamily crackedBronze, BlockFamily crackedMossyBronze, BlockFamily crackedOvergrownBronze,
			BlockFamily crackedSilver, BlockFamily crackedMossySilver, BlockFamily crackedOvergrownSilver,
			BlockFamily crackedGold, BlockFamily crackedMossyGold, BlockFamily crackedOvergrownGold) {
		createOvergrownBlockFamilyCrafting(exporter, base, mossy, overgrown, StoneTypeVariants.OVERGROWN_STONE, familyName);
		createOvergrownBlockFamilyCrafting(exporter, bronze, mossyBronze, overgrownBronze,
				StoneTypeVariants.OVERGROWN_BRONZE_STONE, familyName);
		createOvergrownBlockFamilyCrafting(exporter, silver, mossySilver, overgrownSilver,
				StoneTypeVariants.OVERGROWN_SILVER_STONE, familyName);
		createOvergrownBlockFamilyCrafting(exporter, gold, mossyGold, overgrownGold,
				StoneTypeVariants.OVERGROWN_GOLD_STONE, familyName);
		createOvergrownBlockFamilyCrafting(exporter, cracked, mossyCracked, overgrownCracked,
				StoneTypeVariants.CRACKED_OVERGROWN_STONE, familyName);
		createOvergrownBlockFamilyCrafting(exporter, crackedBronze, crackedMossyBronze, crackedOvergrownBronze,
				StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, familyName);
		createOvergrownBlockFamilyCrafting(exporter, crackedSilver, crackedMossySilver, crackedOvergrownSilver,
				StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, familyName);
		createOvergrownBlockFamilyCrafting(exporter, crackedGold, crackedMossyGold, crackedOvergrownGold,
				StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, familyName);

		createCrackedBlockFamilyCracking(exporter, base, cracked, StoneTypeVariants.CRACKED_STONE, familyName);
		createCrackedBlockFamilyCracking(exporter, mossy, mossyCracked, StoneTypeVariants.CRACKED_MOSSY_STONE,
				familyName);
		createCrackedBlockFamilyCracking(exporter, overgrown, overgrownCracked, StoneTypeVariants.CRACKED_OVERGROWN_STONE,
				familyName);
		createCrackedBlockFamilyCracking(exporter, bronze, crackedBronze, StoneTypeVariants.CRACKED_BRONZE_STONE,
				familyName);
		createCrackedBlockFamilyCracking(exporter, mossyBronze, crackedMossyBronze, StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE,
				familyName);
		createCrackedBlockFamilyCracking(exporter, overgrownBronze, crackedOvergrownBronze,
				StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, familyName);
		createCrackedBlockFamilyCracking(exporter, silver, crackedSilver, StoneTypeVariants.CRACKED_SILVER_STONE,
				familyName);
		createCrackedBlockFamilyCracking(exporter, mossySilver, crackedMossySilver, StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE,
				familyName);
		createCrackedBlockFamilyCracking(exporter, overgrownSilver, crackedOvergrownSilver,
				StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, familyName);
		createCrackedBlockFamilyCracking(exporter, gold, crackedGold, StoneTypeVariants.CRACKED_GOLD_STONE,
				familyName);
		createCrackedBlockFamilyCracking(exporter, mossyGold, crackedMossyGold, StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE,
				familyName);
		createCrackedBlockFamilyCracking(exporter, overgrownGold, crackedOvergrownGold,
				StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, familyName);

		createBlockFamilyOrnamentCrafting(exporter, base, bronze, ModItems.BRONZE_INGOT,
				StoneTypeVariants.BRONZE_STONE, familyName);
		createBlockFamilyOrnamentCrafting(exporter, mossy, mossyBronze, ModItems.BRONZE_INGOT,
				StoneTypeVariants.MOSSY_BRONZE_STONE, familyName);
		createBlockFamilyOrnamentCrafting(exporter, overgrown, overgrownBronze, ModItems.BRONZE_INGOT,
				StoneTypeVariants.OVERGROWN_BRONZE_STONE, familyName);
		createBlockFamilyOrnamentCrafting(exporter, cracked, crackedBronze, ModItems.BRONZE_INGOT,
				StoneTypeVariants.CRACKED_BRONZE_STONE, familyName);
		createBlockFamilyOrnamentCrafting(exporter, mossyCracked, crackedMossyBronze, ModItems.BRONZE_INGOT,
				StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE, familyName);
		createBlockFamilyOrnamentCrafting(exporter, overgrownCracked, crackedOvergrownBronze, ModItems.BRONZE_INGOT,
				StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, familyName);

		createBlockFamilyOrnamentCrafting(exporter, base, silver, Items.DIAMOND,
				StoneTypeVariants.SILVER_STONE, familyName);
		createBlockFamilyOrnamentCrafting(exporter, mossy, mossySilver, Items.DIAMOND,
				StoneTypeVariants.MOSSY_SILVER_STONE, familyName);
		createBlockFamilyOrnamentCrafting(exporter, overgrown, overgrownSilver, Items.DIAMOND,
				StoneTypeVariants.OVERGROWN_SILVER_STONE, familyName);
		createBlockFamilyOrnamentCrafting(exporter, cracked, crackedSilver, Items.DIAMOND,
				StoneTypeVariants.CRACKED_SILVER_STONE, familyName);
		createBlockFamilyOrnamentCrafting(exporter, mossyCracked, crackedMossySilver, Items.DIAMOND,
				StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE, familyName);
		createBlockFamilyOrnamentCrafting(exporter, overgrownCracked, crackedOvergrownSilver, Items.DIAMOND,
				StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, familyName);

		createBlockFamilyOrnamentCrafting(exporter, base, gold, Items.GOLD_INGOT,
				StoneTypeVariants.GOLD_STONE, familyName);
		createBlockFamilyOrnamentCrafting(exporter, mossy, mossyGold, Items.GOLD_INGOT,
				StoneTypeVariants.MOSSY_GOLD_STONE, familyName);
		createBlockFamilyOrnamentCrafting(exporter, overgrown, overgrownGold, Items.GOLD_INGOT,
				StoneTypeVariants.OVERGROWN_GOLD_STONE, familyName);
		createBlockFamilyOrnamentCrafting(exporter, cracked, crackedGold, Items.GOLD_INGOT,
				StoneTypeVariants.CRACKED_GOLD_STONE, familyName);
		createBlockFamilyOrnamentCrafting(exporter, mossyCracked, crackedMossyGold, Items.GOLD_INGOT,
				StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE, familyName);
		createBlockFamilyOrnamentCrafting(exporter, overgrownCracked, crackedOvergrownGold, Items.GOLD_INGOT,
				StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, familyName);
	}

	/**
	 * Creates crafting recipes for a mossy block family.
	 *
	 * @param exporter The exporter to offer the recipes to.
	 * @param normal The normal block family.
	 * @param mossy The mossy block family.
	 * @param normalVariant The stone type variant for the normal blocks.
	 * @param mossyVariant The stone type variant for the mossy blocks.
	 * @param familyName The name of the block family.
	 */
	private void createMossyBlockFamilyCrafting(RecipeExporter exporter, BlockFamily normal, BlockFamily mossy,
			StoneTypeVariants normalVariant, StoneTypeVariants mossyVariant, String familyName) {
		createModMossyRecipe(exporter, normal.getBaseBlock(), mossy.getBaseBlock(),
				createModStoneRecipeName(familyName, familyName, normalVariant, mossyVariant, "_ct"));
		if(mossy.getVariant(BlockFamily.Variant.STAIRS) != null) {
			createModMossyRecipe(exporter, normal.getVariant(BlockFamily.Variant.STAIRS),
					mossy.getVariant(BlockFamily.Variant.STAIRS),
					createModStoneRecipeName(familyName + "_stairs", familyName + "_stairs", normalVariant,
							mossyVariant, "_ct"));
		}
		if(mossy.getVariant(BlockFamily.Variant.SLAB) != null) {
			createModMossyRecipe(exporter, normal.getVariant(BlockFamily.Variant.SLAB),
					mossy.getVariant(BlockFamily.Variant.SLAB),
					createModStoneRecipeName(familyName + "_slab", familyName + "_slab", normalVariant,
							mossyVariant, "_ct"));
		}
		if(mossy.getVariant(BlockFamily.Variant.WALL) != null) {
			createModMossyRecipe(exporter, normal.getVariant(BlockFamily.Variant.WALL),
					mossy.getVariant(BlockFamily.Variant.WALL),
					createModStoneRecipeName(familyName + "_wall", familyName + "_wall", normalVariant,
							mossyVariant, "_ct"));
		}
		if(mossy.getVariant(BlockFamily.Variant.BUTTON) != null) {
			createModMossyRecipe(exporter, normal.getVariant(BlockFamily.Variant.BUTTON),
					mossy.getVariant(BlockFamily.Variant.BUTTON),
					createModStoneRecipeName(familyName + "_button", familyName + "_button", normalVariant,
							mossyVariant, "_ct"));
		}
		if(mossy.getVariant(BlockFamily.Variant.PRESSURE_PLATE) != null) {
			createModMossyRecipe(exporter, normal.getVariant(BlockFamily.Variant.PRESSURE_PLATE),
					mossy.getVariant(BlockFamily.Variant.PRESSURE_PLATE),
					createModStoneRecipeName(familyName + "_pressure_plate", familyName + "_pressure_plate", normalVariant,
							mossyVariant, "_ct"));
		}
	}

	/**
	 * Creates crafting recipes for overgrown block families.
	 *
	 * @param exporter The exporter to offer the recipes to.
	 * @param normal The normal block family.
	 * @param mossy The mossy block family.
	 * @param overgrown The overgrown block family.
	 * @param variant The stone type variant.
	 * @param familyName The name of the block family.
	 */
	private void createOvergrownBlockFamilyCrafting(RecipeExporter exporter, BlockFamily normal, BlockFamily mossy,
			BlockFamily overgrown, StoneTypeVariants variant, String familyName) {
		createMossyBlockFamilyCrafting(exporter, normal, mossy, StoneTypeVariants.getBaseFromMossyOrOvergrown(variant),
				StoneTypeVariants.getMossyFromOvergrown(variant), familyName);
		createMossyBlockFamilyCrafting(exporter, mossy, overgrown, StoneTypeVariants.getMossyFromOvergrown(variant),
				variant, familyName);

		createModOvergrownRecipe(exporter, normal.getBaseBlock(), overgrown.getBaseBlock(),
				createModStoneRecipeName(familyName, familyName, variant,
						StoneTypeVariants.getBaseFromMossyOrOvergrown(variant), "_ct"));
		if(overgrown.getVariant(BlockFamily.Variant.STAIRS) != null) {
			createModOvergrownRecipe(exporter, normal.getVariant(BlockFamily.Variant.STAIRS),
					overgrown.getVariant(BlockFamily.Variant.STAIRS),
					createModStoneRecipeName(familyName + "_stairs", familyName + "_stairs", variant,
							StoneTypeVariants.getBaseFromMossyOrOvergrown(variant), "_ct"));
		}
		if(overgrown.getVariant(BlockFamily.Variant.SLAB) != null) {
			createModOvergrownRecipe(exporter, normal.getVariant(BlockFamily.Variant.SLAB),
					overgrown.getVariant(BlockFamily.Variant.SLAB),
					createModStoneRecipeName(familyName + "_slab", familyName + "_slab", variant,
							StoneTypeVariants.getBaseFromMossyOrOvergrown(variant), "_ct"));
		}
		if(overgrown.getVariant(BlockFamily.Variant.WALL) != null) {
			createModOvergrownRecipe(exporter, normal.getVariant(BlockFamily.Variant.WALL),
					overgrown.getVariant(BlockFamily.Variant.WALL),
					createModStoneRecipeName(familyName + "_wall", familyName + "_wall", variant,
							StoneTypeVariants.getBaseFromMossyOrOvergrown(variant), "_ct"));
		}
		if(overgrown.getVariant(BlockFamily.Variant.BUTTON) != null) {
			createModOvergrownRecipe(exporter, normal.getVariant(BlockFamily.Variant.BUTTON),
					overgrown.getVariant(BlockFamily.Variant.BUTTON),
					createModStoneRecipeName(familyName + "_button", familyName + "_button", variant,
							StoneTypeVariants.getBaseFromMossyOrOvergrown(variant), "_ct"));
		}
		if(overgrown.getVariant(BlockFamily.Variant.PRESSURE_PLATE) != null) {
			createModOvergrownRecipe(exporter, normal.getVariant(BlockFamily.Variant.PRESSURE_PLATE),
					overgrown.getVariant(BlockFamily.Variant.PRESSURE_PLATE),
					createModStoneRecipeName(familyName + "_pressure_plate", familyName + "_pressure_plate", variant,
							StoneTypeVariants.getBaseFromMossyOrOvergrown(variant), "_ct"));
		}
	}

	/**
	 * Creates crafting recipes for cracked variants of a block family.
	 *
	 * @param exporter The exporter to offer the recipes to.
	 * @param normal The normal block family.
	 * @param cracked The cracked block family.
	 * @param variant The stone type variant.
	 * @param familyName The name of the block family.
	 */
	private void createCrackedBlockFamilyCracking(RecipeExporter exporter, BlockFamily normal, BlockFamily cracked,
			StoneTypeVariants variant, String familyName) {
		createModCrackedRecipe(exporter, normal.getBaseBlock(), cracked.getBaseBlock(),
				createModStoneRecipeName(familyName, familyName, variant,
						StoneTypeVariants.getBaseFromCracked(variant), "_ct"));
		if(cracked.getVariant(BlockFamily.Variant.STAIRS) != null) {
			createModCrackedRecipe(exporter, normal.getVariant(BlockFamily.Variant.STAIRS),
					cracked.getVariant(BlockFamily.Variant.STAIRS),
					createModStoneRecipeName(familyName + "_stairs", familyName + "_stairs", variant,
							StoneTypeVariants.getBaseFromCracked(variant), "_ct"));
		}
		if(cracked.getVariant(BlockFamily.Variant.SLAB) != null) {
			createModCrackedRecipe(exporter, normal.getVariant(BlockFamily.Variant.SLAB),
					cracked.getVariant(BlockFamily.Variant.SLAB),
					createModStoneRecipeName(familyName + "_slab", familyName + "_slab", variant,
							StoneTypeVariants.getBaseFromCracked(variant), "_ct"));
		}
		if(cracked.getVariant(BlockFamily.Variant.WALL) != null) {
			createModCrackedRecipe(exporter, normal.getVariant(BlockFamily.Variant.WALL),
					cracked.getVariant(BlockFamily.Variant.WALL),
					createModStoneRecipeName(familyName + "_wall", familyName + "_wall", variant,
							StoneTypeVariants.getBaseFromCracked(variant), "_ct"));
		}
	}

	/**
	 * Creates crafting recipes to ornament a block family
	 *
	 * @param exporter The exporter to offer the recipes to.
	 * @param normal The normal block family.
	 * @param ornamented The ornamented block family.
	 * @param ornament The item used as an ornament.
	 * @param variant The stone type variant.
	 * @param familyName The name of the block family.
	 */
	private void createBlockFamilyOrnamentCrafting(RecipeExporter exporter, BlockFamily normal, BlockFamily ornamented,
			Item ornament, StoneTypeVariants variant, String familyName) {
		createModOrnamentedRecipe(exporter, normal.getBaseBlock(), ornament, ornamented.getBaseBlock(),
				createModStoneRecipeName(familyName, familyName, variant, StoneTypeVariants.getBaseFromOrnamented(variant), "_ct"));
		if(ornamented.getVariant(BlockFamily.Variant.STAIRS) != null) {
			createModOrnamentedRecipe(exporter, normal.getVariant(BlockFamily.Variant.STAIRS), ornament, ornamented.getVariant(BlockFamily.Variant.STAIRS),
					createModStoneRecipeName(familyName + "_stairs", familyName + "_stairs", variant, StoneTypeVariants.getBaseFromOrnamented(variant), "_ct"));
		}
		if(ornamented.getVariant(BlockFamily.Variant.SLAB) != null) {
			createModOrnamentedRecipe(exporter, normal.getVariant(BlockFamily.Variant.SLAB), ornament, ornamented.getVariant(BlockFamily.Variant.SLAB),
					createModStoneRecipeName(familyName + "_slab", familyName + "_slab", variant, StoneTypeVariants.getBaseFromOrnamented(variant), "_ct"));
		}
		if(ornamented.getVariant(BlockFamily.Variant.WALL) != null) {
			createModOrnamentedRecipe(exporter, normal.getVariant(BlockFamily.Variant.WALL), ornament, ornamented.getVariant(BlockFamily.Variant.WALL),
					createModStoneRecipeName(familyName + "_wall", familyName + "_wall", variant, StoneTypeVariants.getBaseFromOrnamented(variant), "_ct"));
		}
	}

	/**
	 * Creates crafting recipes for decorating pillars with various stone type variants.
	 *
	 * @param exporter The exporter to offer the recipes to.
	 * @param blocks A map of stone type variants to their corresponding pillar blocks.
	 * @param stoneTypeName The name of the stone type.
	 */
	private void createBlockDecorating(RecipeExporter exporter, HashMap<StoneTypeVariants, Block> blocks,
			String stoneTypeName, String blockName) {
		createModCrackedRecipe(exporter, blocks.get(StoneTypeVariants.STONE), blocks.get(StoneTypeVariants.CRACKED_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, "cracked_" + stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_STONE, StoneTypeVariants.STONE, "_ct"));
		createModCrackedRecipe(exporter, blocks.get(StoneTypeVariants.MOSSY_STONE),
				blocks.get(StoneTypeVariants.CRACKED_MOSSY_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, "cracked_" + stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_MOSSY_STONE, StoneTypeVariants.MOSSY_STONE, "_ct"));
		createModCrackedRecipe(exporter, blocks.get(StoneTypeVariants.OVERGROWN_STONE),
				blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, "cracked_" + stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_OVERGROWN_STONE, StoneTypeVariants.OVERGROWN_STONE, "_ct"));

		createModCrackedRecipe(exporter, blocks.get(StoneTypeVariants.BRONZE_STONE),
				blocks.get(StoneTypeVariants.CRACKED_BRONZE_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, "cracked_" + stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_BRONZE_STONE, StoneTypeVariants.BRONZE_STONE, "_ct"));
		createModCrackedRecipe(exporter, blocks.get(StoneTypeVariants.MOSSY_BRONZE_STONE),
				blocks.get(StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, "cracked_" + stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE, StoneTypeVariants.MOSSY_BRONZE_STONE, "_ct"));
		createModCrackedRecipe(exporter, blocks.get(StoneTypeVariants.OVERGROWN_BRONZE_STONE),
				blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, "cracked_" + stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, StoneTypeVariants.OVERGROWN_BRONZE_STONE, "_ct"));

		createModCrackedRecipe(exporter, blocks.get(StoneTypeVariants.SILVER_STONE),
				blocks.get(StoneTypeVariants.CRACKED_SILVER_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, "cracked_" + stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_SILVER_STONE, StoneTypeVariants.SILVER_STONE, "_ct"));
		createModCrackedRecipe(exporter, blocks.get(StoneTypeVariants.MOSSY_SILVER_STONE),
				blocks.get(StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, "cracked_" + stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE, StoneTypeVariants.MOSSY_SILVER_STONE, "_ct"));
		createModCrackedRecipe(exporter, blocks.get(StoneTypeVariants.OVERGROWN_SILVER_STONE),
				blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, "cracked_" + stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, StoneTypeVariants.OVERGROWN_SILVER_STONE, "_ct"));

		createModCrackedRecipe(exporter, blocks.get(StoneTypeVariants.GOLD_STONE),
				blocks.get(StoneTypeVariants.CRACKED_GOLD_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, "cracked_" + stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_GOLD_STONE, StoneTypeVariants.GOLD_STONE, "_ct"));
		createModCrackedRecipe(exporter, blocks.get(StoneTypeVariants.MOSSY_GOLD_STONE),
				blocks.get(StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, "cracked_" + stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE, StoneTypeVariants.MOSSY_GOLD_STONE, "_ct"));
		createModCrackedRecipe(exporter, blocks.get(StoneTypeVariants.OVERGROWN_GOLD_STONE),
				blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, "cracked_" + stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, StoneTypeVariants.OVERGROWN_GOLD_STONE, "_ct"));

		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.STONE), blocks.get(StoneTypeVariants.MOSSY_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.MOSSY_STONE, StoneTypeVariants.STONE, "_ct"));
		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.BRONZE_STONE),
				blocks.get(StoneTypeVariants.MOSSY_BRONZE_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.MOSSY_BRONZE_STONE, StoneTypeVariants.BRONZE_STONE, "_ct"));
		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.SILVER_STONE),
				blocks.get(StoneTypeVariants.MOSSY_SILVER_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.MOSSY_SILVER_STONE, StoneTypeVariants.SILVER_STONE, "_ct"));
		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.GOLD_STONE),
				blocks.get(StoneTypeVariants.MOSSY_GOLD_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.MOSSY_GOLD_STONE, StoneTypeVariants.GOLD_STONE, "_ct"));

		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_STONE),
				blocks.get(StoneTypeVariants.CRACKED_MOSSY_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_MOSSY_STONE, StoneTypeVariants.CRACKED_STONE, "_ct"));
		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_BRONZE_STONE),
				blocks.get(StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE, StoneTypeVariants.CRACKED_BRONZE_STONE, "_ct"));
		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_SILVER_STONE),
				blocks.get(StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE, StoneTypeVariants.CRACKED_SILVER_STONE, "_ct"));
		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_GOLD_STONE),
				blocks.get(StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE, StoneTypeVariants.CRACKED_GOLD_STONE, "_ct"));

		createModOvergrownRecipe(exporter, blocks.get(StoneTypeVariants.STONE),
				blocks.get(StoneTypeVariants.OVERGROWN_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.OVERGROWN_STONE, StoneTypeVariants.STONE, "_ct"));
		createModOvergrownRecipe(exporter, blocks.get(StoneTypeVariants.BRONZE_STONE),
				blocks.get(StoneTypeVariants.OVERGROWN_BRONZE_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.OVERGROWN_BRONZE_STONE, StoneTypeVariants.BRONZE_STONE, "_ct"));
		createModOvergrownRecipe(exporter, blocks.get(StoneTypeVariants.SILVER_STONE),
				blocks.get(StoneTypeVariants.OVERGROWN_SILVER_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.OVERGROWN_SILVER_STONE, StoneTypeVariants.SILVER_STONE, "_ct"));
		createModOvergrownRecipe(exporter, blocks.get(StoneTypeVariants.GOLD_STONE),
				blocks.get(StoneTypeVariants.OVERGROWN_GOLD_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.OVERGROWN_GOLD_STONE, StoneTypeVariants.GOLD_STONE, "_ct"));

		createModOvergrownRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_STONE),
				blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_OVERGROWN_STONE, StoneTypeVariants.CRACKED_STONE, "_ct"));
		createModOvergrownRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_BRONZE_STONE),
				blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, StoneTypeVariants.CRACKED_BRONZE_STONE, "_ct"));
		createModOvergrownRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_SILVER_STONE),
				blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, StoneTypeVariants.CRACKED_SILVER_STONE, "_ct"));
		createModOvergrownRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_GOLD_STONE),
				blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, StoneTypeVariants.CRACKED_GOLD_STONE, "_ct"));

		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.MOSSY_STONE),
				blocks.get(StoneTypeVariants.OVERGROWN_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.OVERGROWN_STONE, StoneTypeVariants.MOSSY_STONE, "_ct"));
		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.MOSSY_BRONZE_STONE),
				blocks.get(StoneTypeVariants.OVERGROWN_BRONZE_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.OVERGROWN_BRONZE_STONE, StoneTypeVariants.MOSSY_BRONZE_STONE, "_ct"));
		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.MOSSY_SILVER_STONE),
				blocks.get(StoneTypeVariants.OVERGROWN_SILVER_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.OVERGROWN_SILVER_STONE, StoneTypeVariants.MOSSY_SILVER_STONE, "_ct"));
		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.MOSSY_GOLD_STONE),
				blocks.get(StoneTypeVariants.OVERGROWN_GOLD_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.OVERGROWN_GOLD_STONE, StoneTypeVariants.MOSSY_GOLD_STONE, "_ct"));

		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_MOSSY_STONE),
				blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_OVERGROWN_STONE, StoneTypeVariants.CRACKED_MOSSY_STONE, "_ct"));
		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE),
				blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE, "_ct"));
		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE),
				blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE, "_ct"));
		createModMossyRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE),
				blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE, "_ct"));

		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.STONE), ModItems.BRONZE_INGOT,
				blocks.get(StoneTypeVariants.BRONZE_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.BRONZE_STONE, StoneTypeVariants.STONE, "_ct"));
		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.MOSSY_STONE), ModItems.BRONZE_INGOT,
				blocks.get(StoneTypeVariants.MOSSY_BRONZE_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.MOSSY_BRONZE_STONE, StoneTypeVariants.MOSSY_STONE, "_ct"));
		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.OVERGROWN_STONE), ModItems.BRONZE_INGOT,
				blocks.get(StoneTypeVariants.OVERGROWN_BRONZE_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.OVERGROWN_BRONZE_STONE, StoneTypeVariants.OVERGROWN_STONE, "_ct"));
		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_STONE), ModItems.BRONZE_INGOT,
				blocks.get(StoneTypeVariants.CRACKED_BRONZE_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_BRONZE_STONE, StoneTypeVariants.CRACKED_STONE, "_ct"));
		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_MOSSY_STONE), ModItems.BRONZE_INGOT,
				blocks.get(StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_MOSSY_BRONZE_STONE, StoneTypeVariants.CRACKED_MOSSY_STONE, "_ct"));
		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_STONE), ModItems.BRONZE_INGOT,
				blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_OVERGROWN_BRONZE_STONE, StoneTypeVariants.CRACKED_OVERGROWN_STONE, "_ct"));

		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.STONE), Items.DIAMOND,
				blocks.get(StoneTypeVariants.SILVER_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.SILVER_STONE, StoneTypeVariants.STONE, "_ct"));
		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.MOSSY_STONE), Items.DIAMOND,
				blocks.get(StoneTypeVariants.MOSSY_SILVER_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.MOSSY_SILVER_STONE, StoneTypeVariants.MOSSY_STONE, "_ct"));
		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.OVERGROWN_STONE), Items.DIAMOND,
				blocks.get(StoneTypeVariants.OVERGROWN_SILVER_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.OVERGROWN_SILVER_STONE, StoneTypeVariants.OVERGROWN_STONE, "_ct"));
		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_STONE), Items.DIAMOND,
				blocks.get(StoneTypeVariants.CRACKED_SILVER_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_SILVER_STONE, StoneTypeVariants.CRACKED_STONE, "_ct"));
		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_MOSSY_STONE), Items.DIAMOND,
				blocks.get(StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_MOSSY_SILVER_STONE, StoneTypeVariants.CRACKED_MOSSY_STONE, "_ct"));
		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_STONE), Items.DIAMOND,
				blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_OVERGROWN_SILVER_STONE, StoneTypeVariants.CRACKED_OVERGROWN_STONE, "_ct"));

		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.STONE), Items.GOLD_INGOT,
				blocks.get(StoneTypeVariants.GOLD_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.GOLD_STONE, StoneTypeVariants.STONE, "_ct"));
		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.MOSSY_STONE), Items.GOLD_INGOT,
				blocks.get(StoneTypeVariants.MOSSY_GOLD_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.MOSSY_GOLD_STONE, StoneTypeVariants.MOSSY_STONE, "_ct"));
		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.OVERGROWN_STONE), Items.GOLD_INGOT,
				blocks.get(StoneTypeVariants.OVERGROWN_GOLD_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.OVERGROWN_GOLD_STONE, StoneTypeVariants.OVERGROWN_STONE, "_ct"));
		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_STONE), Items.GOLD_INGOT,
				blocks.get(StoneTypeVariants.CRACKED_GOLD_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_GOLD_STONE, StoneTypeVariants.CRACKED_STONE, "_ct"));
		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_MOSSY_STONE), Items.GOLD_INGOT,
				blocks.get(StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_MOSSY_GOLD_STONE, StoneTypeVariants.CRACKED_MOSSY_STONE, "_ct"));
		createModOrnamentedRecipe(exporter, blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_STONE), Items.GOLD_INGOT,
				blocks.get(StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE),
				createModStoneRecipeName(stoneTypeName + blockName, stoneTypeName + blockName,
						StoneTypeVariants.CRACKED_OVERGROWN_GOLD_STONE, StoneTypeVariants.CRACKED_OVERGROWN_STONE, "_ct"));
	}

	/**
	 * Generates crafting recipes for smooth stone slabs.
	 *
	 * @param exporter The exporter to offer the recipes to.
	 * @param blocks A map of stone type variants to their corresponding blocks.
	 * @param slabs A map of stone type variants to their corresponding slab blocks.
	 * @param stoneTypeName The name of the stone type.
	 */
	private void generateSmoothCrafting(RecipeExporter exporter, HashMap<StoneTypeVariants, Block> blocks,
			HashMap<StoneTypeVariants, Block> slabs, String stoneTypeName) {
		for(Map.Entry<StoneTypeVariants, Block> entry : blocks.entrySet()) {
			StoneTypeVariants key = entry.getKey();
			Block value = entry.getValue();
			createModSlabRecipe(exporter, value, slabs.get(key),
					createModStoneRecipeName("smooth_" + stoneTypeName + "_slab", "smooth_" + stoneTypeName, key,
							"_ct"));
		}
	}

	/**
	 * Generates stone cutting recipes for smooth stone slabs.
	 *
	 * @param exporter The exporter to offer the recipes to.
	 * @param blocks A map of stone type variants to their corresponding blocks.
	 * @param slabs A map of stone type variants to their corresponding slab blocks.
	 * @param stoneTypeName The name of the stone type.
	 */
	private void generateSmoothStoneCutting(RecipeExporter exporter, HashMap<StoneTypeVariants, Block> blocks,
			HashMap<StoneTypeVariants, Block> slabs, String stoneTypeName) {
		for(Map.Entry<StoneTypeVariants, Block> entry : blocks.entrySet()) {
			StoneTypeVariants key = entry.getKey();
			Block value = entry.getValue();
			offerModStoneCuttingRecipe(RecipeCategory.BUILDING_BLOCKS, value, slabs.get(key), 2,
					createModStoneRecipeName("smooth_" + stoneTypeName + "_slab", "smooth_" + stoneTypeName, key,
							"_sc"), exporter);
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
	 * Creates a crafting recipe for a mossy block from the given input block.
	 * The difference between this and the vanilla method is that the
	 * .json-filename can be defined.
	 *
	 * @param exporter The exporter to offer the recipe to.
	 * @param input The input block for the recipe.
	 * @param output The output block (mossy block) for the recipe.
	 * @param recipePath The path for the recipe.
	 */
	private void createModMossyRecipe(RecipeExporter exporter, Block input, Block output, String recipePath) {
		ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
		     .input(input)
		     .input(Items.VINE)
		     .criterion(hasItem(input), conditionsFromItem(input))
		     .offerTo(exporter, recipePath);
	}

	/**
	 * Creates a crafting recipe for an overgrown block.
	 * The .json-filename can be defined.
	 *
	 * @param exporter The exporter to offer the recipe to.
	 * @param input The input block for the recipe.
	 * @param output The output block (overgrown) for the recipe.
	 * @param recipePath The path for the recipe.
	 */
	private void createModOvergrownRecipe(RecipeExporter exporter, Block input, Block output, String recipePath) {
		ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
		    .input(input)
		    .input(Items.VINE)
		    .input(Items.VINE)
		    .criterion(hasItem(input), conditionsFromItem(input))
		    .offerTo(exporter, recipePath);
	}

	/**
	 * Creates a smelting recipe for a cracked block variant.
	 * The difference between this and the vanilla method is that the
	 * .json-filename can be defined.
	 *
	 * @param exporter The exporter to offer the recipe to.
	 * @param input The input block for the recipe.
	 * @param output The output block (cracked variant) for the recipe.
	 * @param recipePath The path for the recipe.
	 */
	private void createModCrackedRecipe(RecipeExporter exporter, Block input, Block output, String recipePath) {
		CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(input), RecipeCategory.BUILDING_BLOCKS, output,
						0.1f, 200)
				.criterion(hasItem(input), conditionsFromItem(input))
				.offerTo(exporter, recipePath);
	}

	/**
	 * Creates a crafting recipe for an ornamented block.
	 * The .json-filename can be defined.
	 *
	 * @param exporter The exporter to offer the recipe to.
	 * @param inputBlock The input block for the recipe.
	 * @param inputItem The item used as an ornament.
	 * @param output The output block for the recipe.
	 * @param recipePath The path for the recipe.
	 */
	private void createModOrnamentedRecipe(RecipeExporter exporter, Block inputBlock, Item inputItem, Block output,
			String recipePath) {
		 ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
         .pattern("OOO")
         .pattern("O#O")
         .pattern("OOO")
         .input('#', inputBlock)
         .input('O', inputItem)
         .criterion(hasItem(inputItem), conditionsFromItem(inputItem))
         .criterion(hasItem(inputBlock), conditionsFromItem(inputBlock))
         .offerTo(exporter, recipePath);
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
		return createModStoneRecipeName(outputName, inputName, variant, variant, recipeType);
	}

	/**
	 * Creates a stone cutting recipe name based on various attributes.
	 *
	 * @param outputName The name of the output block.
	 * @param inputName The name of the input block.
	 * @param outputVariant The variant of the output block.
	 * @param inputVariant The variant of the input block.
	 * @param recipeType The type of recipe ("_sc" for stonecutting, "_ct" for crafting grid, "_f" for furnace).
	 * @return The generated stone cutting recipe name.
	 */
	private String createModStoneRecipeName(String outputName, String inputName, StoneTypeVariants outputVariant,
			StoneTypeVariants inputVariant, String recipeType) {
		String outputPath = StoneTypeVariants.getRecipePath(outputVariant, outputName);
		String inputPath = StoneTypeVariants.getRecipePath(inputVariant, inputName);
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

	/**
	 * Converts the name of a block into a tag format.
	 * The tag format is a lowercase string with spaces replaced by underscores.
	 *
	 * @param block The block whose name is to be converted.
	 * @return The tag format of the block name.
	 */
	private String turnBlockIntoTag(Block block) {
		return block.getName().getString().replace(' ', '_').toLowerCase();
	}
}
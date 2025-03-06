package me.anedhel.lotr.datagen;

import me.anedhel.lotr.block.ModBlocks;
import me.anedhel.lotr.block.ModOreType;
import me.anedhel.lotr.block.ModStoneType;
import me.anedhel.lotr.block.ModWoodType;
import me.anedhel.lotr.item.ModGearType;
import me.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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

import java.util.List;

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
			if(stoneType.getStone() != null) {
				if(stoneType.getStoneStairs() != null) {
					createStairRecipe(stoneType.getStone(), stoneType.getStoneStairs(), exporter);
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					                        stoneType.getStoneStairs(), stoneType.getStone(), 1);
				}
				if(stoneType.getStoneSlab() != null) {
					offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					                stoneType.getStoneSlab(), stoneType.getStone());
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					                        stoneType.getStoneSlab(), stoneType.getStone(), 2);
				}
				if(stoneType.getStoneWall() != null) {
					offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					                stoneType.getStoneWall(), stoneType.getStone());
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					                        stoneType.getStoneWall(), stoneType.getStone(), 1);
				}
				if(stoneType.getStoneButton() != null) {
					createButtonRecipe(stoneType.getStone(), stoneType.getStoneButton(), exporter);
					offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE,
							stoneType.getStoneButton(), stoneType.getStone(), 1);
				}
				if(stoneType.getStonePressurePlate() != null) {
					offerPressurePlateRecipe(exporter, stoneType.getStonePressurePlate(),
					                         stoneType.getStone());
					offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE,
							stoneType.getStonePressurePlate(), stoneType.getStone());
				}
				if(stoneType.getCobbled() != null) {
					createCobbledStoneTypeRecipe(stoneType.getStone(), stoneType.getCobbled(),
					                             exporter);
					if(stoneType.getCobbledStairs() != null) {
						createStairRecipe(stoneType.getCobbled(), stoneType.getCobbledStairs(),
						                  exporter);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						                        stoneType.getCobbledStairs(),
						                        stoneType.getCobbled(), 1);
					}
					if(stoneType.getCobbledSlab() != null) {
						offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						                stoneType.getCobbledSlab(), stoneType.getCobbled());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						                        stoneType.getCobbledSlab(), stoneType.getCobbled(),
						                        2);
					}
					if(stoneType.getCobbledWall() != null) {
						offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						                stoneType.getCobbledWall(), stoneType.getCobbled());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						                        stoneType.getCobbledWall(), stoneType.getCobbled(),
						                        1);
					}
					if(stoneType.getCobbledButton() != null) {
						createButtonRecipe(stoneType.getCobbled(), stoneType.getCobbledButton(),
						                   exporter);
						offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE,
								stoneType.getCobbledButton(), stoneType.getCobbled());
					}
					if(stoneType.getCobbledPressurePlate() != null) {
						offerPressurePlateRecipe(exporter, stoneType.getCobbledPressurePlate(),
						                         stoneType.getCobbled());
						offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE,
								stoneType.getCobbledPressurePlate(), stoneType.getCobbled());
					}
				}
				if (stoneType.getSmooth() != null) {
					/*offerSmelting(exporter, (List<ItemConvertible>) stoneType.getStone(), RecipeCategory.BUILDING_BLOCKS,
							stoneType.getSmooth(),
							0.1f, 200, "stone");*/
					if (stoneType.getSmoothSlab() != null) {
						offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getSmoothSlab(), stoneType.getSmooth());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getSmoothSlab(), stoneType.getSmooth(), 1);
					}
					if (stoneType.getCrackedSmooth() != null) {
						/*offerSmelting(exporter, (List<ItemConvertible>) stoneType.getSmooth(), RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedSmooth(), 0.1f, 200, "stone");*/
						if (stoneType.getCrackedSmoothSlab() != null) {
							offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedSmoothSlab(), stoneType.getCrackedSmooth());
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedSmoothSlab(), stoneType.getCrackedSmooth(), 2);
						}
					}
				}
				if(stoneType.getBrick() != null) {
					createBricksRecipe(stoneType.getStone(), stoneType.getBrick(), exporter);
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
					                        stoneType.getBrick(), stoneType.getStone());
					if(stoneType.getBrickStairs() != null) {
						createStairRecipe(stoneType.getBrick(), stoneType.getBrickStairs(),
						                  exporter);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						                        stoneType.getBrickStairs(), stoneType.getStone(),
						                        1);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						                        stoneType.getBrickStairs(), stoneType.getBrick(),
						                        1);
					}
					if(stoneType.getBrickSlab() != null) {
						offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						                stoneType.getBrickSlab(), stoneType.getBrick());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						                        stoneType.getBrickSlab(), stoneType.getStone(), 2);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						                        stoneType.getBrickSlab(), stoneType.getBrick(), 2);
					}
					if(stoneType.getBrickWall() != null) {
						offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						                stoneType.getBrickWall(), stoneType.getBrick());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						                        stoneType.getBrickWall(), stoneType.getStone(), 1);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
						                        stoneType.getBrickWall(), stoneType.getBrick(), 1);
					}
					if (stoneType.getChiseledBrick() != null) {
						createChiseledRecipe(stoneType.getBrickSlab(), stoneType.getChiseledBrick(), exporter);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getChiseledBrick(), stoneType.getBrick());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getChiseledBrick(), stoneType.getStone());
					}
					if (stoneType.getCrackedBrick() != null) {
						/*offerSmelting(exporter, (List<ItemConvertible>) stoneType.getBrick(), RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedBrick(), 0.1f, 200, "stone");*/
						if (stoneType.getCrackedBrickStairs() != null) {
							createStairRecipe(stoneType.getCrackedBrick(), stoneType.getCrackedBrickStairs(), exporter);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedBrickStairs(), stoneType.getCrackedBrick(), 1);
						}
						if (stoneType.getCrackedBrickSlab() != null) {
							offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedBrickSlab(), stoneType.getCrackedBrick());
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedBrickSlab(), stoneType.getCrackedBrick(), 2);
						}
						if (stoneType.getCrackedBrickWall() != null) {
							offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedBrickWall(), stoneType.getCrackedBrick());
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedBrickWall(), stoneType.getCrackedBrick(), 1);
						}
					}
				}
				if (stoneType.getTiles() != null) {
					createBricksRecipe(stoneType.getBrick(), stoneType.getTiles(), exporter);
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getTiles(), stoneType.getBrick());
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getTiles(), stoneType.getStone());
					if (stoneType.getTilesStairs() != null) {
						createStairRecipe(stoneType.getTiles(), stoneType.getTilesStairs(), exporter);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getTilesStairs(), stoneType.getTiles(), 1);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getTilesStairs(), stoneType.getBrick(), 1);
					}
					if (stoneType.getTilesSlab() != null) {
						offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getTilesSlab(), stoneType.getTiles());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getTilesSlab(), stoneType.getBrick(), 2);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getTilesSlab(), stoneType.getTiles(), 2);
					}
					if (stoneType.getTilesWall() != null) {
						offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getTilesWall(), stoneType.getTiles());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getTilesWall(), stoneType.getBrick(), 1);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getTilesWall(), stoneType.getTiles(), 1);
					}
					if (stoneType.getCrackedTiles() != null) {
						createBricksRecipe(stoneType.getCrackedBrick(), stoneType.getCrackedTiles(), exporter);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedTiles(), stoneType.getCrackedBrick());
						if(stoneType.getCrackedTilesStairs() != null) {
							createStairRecipe(stoneType.getCrackedTiles(), stoneType.getCrackedTilesStairs(), exporter);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedTilesStairs(), stoneType.getCrackedTiles(), 1);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedTilesStairs(), stoneType.getCrackedBrick(), 1);
						}
						if (stoneType.getCrackedTilesSlab() != null) {
							offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedTilesSlab(), stoneType.getCrackedTiles());
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedTilesSlab(), stoneType.getCrackedBrick(), 2);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedTilesSlab(), stoneType.getCrackedTiles(), 2);
						}
						if (stoneType.getCrackedTilesWall() != null) {
							offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedTilesWall(), stoneType.getCrackedTiles());
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedTilesWall(), stoneType.getCrackedBrick(), 1);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedTilesWall(), stoneType.getCrackedTiles(), 1);
						}
					}
				}
				if (stoneType.getCobbledBrick() != null) {
					createBricksRecipe(stoneType.getCobbled(), stoneType.getCobbledBrick(), exporter);
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getCobbledBrick(), stoneType.getCobbled());
					if (stoneType.getCobbledBrickStairs() != null) {
						createStairRecipe(stoneType.getCobbledBrick(), stoneType.getCobbledBrickStairs(), exporter);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCobbledBrickStairs(), stoneType.getCobbledBrick(), 1);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCobbledBrickStairs(), stoneType.getCobbled(), 1);
					}
					if (stoneType.getCobbledBrickSlab() != null) {
						offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCobbledBrickSlab(), stoneType.getCobbledBrick());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCobbledBrickSlab(), stoneType.getCobbled(), 2);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCobbledBrickSlab(), stoneType.getCobbledBrick(), 2);
					}
					if (stoneType.getCobbledBrickWall() != null) {
						offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCobbledBrickWall(), stoneType.getCobbledBrick());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCobbledBrickWall(), stoneType.getCobbledBrick(), 1);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCobbledBrickWall(), stoneType.getCobbled(), 1);
					}
				}
				if (stoneType.getPillar() != null) {
					createPillarRecipe(stoneType.getStone(), stoneType.getPillar(), exporter);
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getPillar(), stoneType.getStone());
					if (stoneType.getPillarSlab() != null) {
						offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getPillarSlab(), stoneType.getPillar());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getPillarSlab(), stoneType.getPillar(), 2);
					}
					if (stoneType.getCrackedPillar() != null) {
						/*
						offerSmelting(exporter, (List<ItemConvertible>) stoneType.getPillar(), RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedPillar(), 0.1f, 200, "stone");
						 */
						if (stoneType.getCrackedPillarSlab() != null) {
							offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedPillarSlab(), stoneType.getCrackedPillar());
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedPillarSlab(), stoneType.getCrackedPillar(), 2);
						}					}
				}
				if (stoneType.getPavement() != null) {
					ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, stoneType.getPavement(), 2)
							.pattern("#").pattern("#").input('#', stoneType.getTiles())
							.criterion(hasItem(stoneType.getTiles()), conditionsFromItem(stoneType.getTiles()))
							.offerTo(exporter, new Identifier(getRecipeName(stoneType.getPavement())));
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getPavement(), stoneType.getTiles());
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getPavement(), stoneType.getBrick());
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getPavement(), stoneType.getStone());
					if (stoneType.getPavementStairs() != null) {
						createStairRecipe(stoneType.getPavement(), stoneType.getPavementStairs(), exporter);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getPavementStairs(), stoneType.getPavement(), 1);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getPavementStairs(), stoneType.getTiles(), 1);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getPavementStairs(), stoneType.getBrick(), 1);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getPavementStairs(), stoneType.getStone(), 1);
					}
					if (stoneType.getPavementSlab() != null) {
						offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getPavementSlab(), stoneType.getPavement());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getPavementSlab(), stoneType.getPavement(), 2);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getPavementSlab(), stoneType.getTiles(), 2);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getPavementSlab(), stoneType.getBrick(), 2);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getPavementSlab(), stoneType.getStone(), 2);
					}
					if (stoneType.getCrackedPavement() != null) {
						/*
						offerSmelting(exporter, (List<ItemConvertible>) stoneType.getPavement(), RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedPavement(), 0.1f, 200, "stone");
						 */
						ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedPavement(), 2)
								.pattern("#").pattern("#").input('#', stoneType.getCrackedTiles())
								.criterion(hasItem(stoneType.getPavement()), conditionsFromItem(stoneType.getPavement()))
								.offerTo(exporter, new Identifier(getRecipeName(stoneType.getCrackedPavement())));
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedPavement(), stoneType.getCrackedTiles());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedPavement(), stoneType.getCrackedBrick());
						if (stoneType.getCrackedPavementStairs() != null) {
							createStairRecipe(stoneType.getCrackedPavement(), stoneType.getCrackedPavementStairs(), exporter);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedPavementStairs(), stoneType.getCrackedPavement(), 1);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedPavementStairs(), stoneType.getCrackedTiles(), 1);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedPavementStairs(), stoneType.getCrackedBrick(), 1);
						}
						if (stoneType.getCrackedPavementSlab() != null) {
							offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedPavementSlab(), stoneType.getCrackedPavement());
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedPavementSlab(), stoneType.getCrackedPavement(), 2);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedPavementSlab(), stoneType.getCrackedTiles(), 2);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedPavementSlab(), stoneType.getCrackedBrick(), 2);
						}
					}
				}
				if (stoneType.getFancyBricks() != null) {
					createBricksRecipe(stoneType.getTiles(), stoneType.getFancyBricks(), exporter);
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getFancyBricks(), stoneType.getTiles());
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getFancyBricks(), stoneType.getBrick());
					offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
							stoneType.getFancyBricks(), stoneType.getStone());
					if (stoneType.getFancyBricksStairs() != null) {
						createStairRecipe(stoneType.getFancyBricks(), stoneType.getFancyBricksStairs(), exporter);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getFancyBricksStairs(), stoneType.getFancyBricks(), 1);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getFancyBricksStairs(), stoneType.getTiles(), 1);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getFancyBricksStairs(), stoneType.getBrick(), 1);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getFancyBricksStairs(), stoneType.getStone(), 1);
					}
					if (stoneType.getFancyBricksSlab() != null) {
						offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getFancyBricksSlab(), stoneType.getFancyBricks());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getFancyBricksSlab(), stoneType.getTiles(), 2);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getFancyBricksSlab(), stoneType.getBrick(), 2);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getFancyBricksSlab(), stoneType.getStone(), 2);
					}
					if (stoneType.getFancyBricksWall() != null) {
						offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getFancyBricksWall(), stoneType.getFancyBricks());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getFancyBricksWall(), stoneType.getTiles(), 1);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getFancyBricksWall(), stoneType.getBrick(), 1);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getFancyBricksWall(), stoneType.getStone(), 1);
					}
					if (stoneType.getCrackedFancyBricks() != null) {
						/*
						offerSmelting(exporter, (List<ItemConvertible>) stoneType.getFancyBricks(), RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedFancyBricks(), 0.1f, 200, "stone");
						 */
						createBricksRecipe(stoneType.getCrackedTiles(), stoneType.getCrackedFancyBricks(), exporter);
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedFancyBricks(), stoneType.getCrackedTiles());
						offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
								stoneType.getCrackedFancyBricks(), stoneType.getCrackedBrick());
						if (stoneType.getCrackedFancyBricksStairs() != null) {
							createStairRecipe(stoneType.getCrackedFancyBricks(), stoneType.getCrackedFancyBricksStairs(), exporter);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedFancyBricksStairs(), stoneType.getCrackedFancyBricks(), 1);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedFancyBricksStairs(), stoneType.getCrackedTiles(), 1);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedFancyBricksStairs(), stoneType.getCrackedBrick(), 1);
						}
						if (stoneType.getCrackedFancyBricksSlab() != null) {
							offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stoneType.getCrackedFancyBricksSlab(), stoneType.getCrackedFancyBricks());
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedFancyBricksSlab(), stoneType.getCrackedFancyBricks(), 2);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedFancyBricksSlab(), stoneType.getCrackedTiles(), 2);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedFancyBricksSlab(), stoneType.getCrackedBrick(), 2);
						}
						if (stoneType.getCrackedFancyBricksWall() != null) {
							offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedFancyBricksWall(), stoneType.getCrackedFancyBricks());
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedFancyBricksWall(), stoneType.getCrackedFancyBricks(), 1);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedFancyBricksWall(), stoneType.getCrackedTiles(), 1);
							offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
									stoneType.getCrackedFancyBricksWall(), stoneType.getCrackedBrick(), 1);
						}
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
	 * This Method creates a BrickRecipe for the given input-stone which will be turned into 4 of
	 * the given output-stone
	 *
	 * @param input a blank stone type
	 * @param output the brick of the blank stone type
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createBricksRecipe(Block input, Block output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4).pattern("##")
		                       .pattern("##").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	private void createPillarRecipe(Block input, Block output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 3).pattern("#")
		                       .pattern("#").pattern("#").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	private void createChiseledRecipe(Block input, Block output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1).pattern("#")
				               .pattern("#").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This Method creates a Crafting Recipe, that uses 2 input-stone and 2 cobble to create 4
	 * output-cobbled-stone
	 *
	 * @param input a blank stone type
	 * @param output the cobbled variant of the blank stone type
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createCobbledStoneTypeRecipe(Block input, Block output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4).pattern("#C")
		                       .pattern("C#").input('#', input).input('C', Items.COBBLESTONE)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .criterion(hasItem(Items.COBBLESTONE),
		                                  conditionsFromItem(Items.COBBLESTONE))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This Method creates a ButtonRecipe for the given input stone, which will be turned into 1
	 * button.
	 *
	 * @param input a blank stone type
	 * @param output the button of the blank stone type
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createButtonRecipe(Block input, Block output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 1).pattern(" # ")
		                       .input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
	}

	/**
	 * This Method creates a StairRecipe for the given input block.
	 *
	 * @param input a base block (stone, planks, etc.)
	 * @param output the stairs of the input
	 * @param exporter The exporter is an instance you offer the crafting recipe to. Usually one
	 * 		is provided in the parameters of the method you edit.
	 */
	private void createStairRecipe(Block input, Block output, RecipeExporter exporter) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4).pattern("#  ")
		                       .pattern("## ").pattern("###").input('#', input)
		                       .criterion(hasItem(input), conditionsFromItem(input))
		                       .offerTo(exporter, new Identifier(getRecipeName(output)));
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
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

import me.anedhel.lotrmiddleearth.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotrmiddleearth.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {

	/**
	 * These are the two example Models, that technically represent the JSON files in your code.<br>
	 *
	 * @see Models
	 */
	public static final Model EXAMPLE_1_OVERLAY = block("example_1_overlay", "_1_overlay", TextureKey.ALL,
			TextureKey.LAYER1);

	public static final Model EXAMPLE_2_OVERLAYS = block("example_2_overlays", "_2_overlays", TextureKey.ALL,
			TextureKey.LAYER1, TextureKey.LAYER2);



	/*I deleted the variant String since it caused the name to be really messy.
	* I also changed the name to be more universal*/
	public static final Model CUBE_ALL_OVERLAY = block("cube_all_overlay",
			TextureKey.ALL,
			TextureKey.LAYER1);

	//same thing here
	public static final Model CUBE_ALL_2_OVERLAYS = block("cube_all_2_overlays",
			TextureKey.ALL,
			TextureKey.LAYER1,
			TextureKey.LAYER2);

	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	//Renamed the blockStateModelGenerator param to be shorter
	public void generateBlockStateModels(BlockStateModelGenerator bsmg) {

		bsmg.registerSimpleCubeAll(ModBlocks.CHALK);
		bsmg.registerSimpleCubeAll(ModBlocks.CHALK_BRICKS);

		overgrownBlock(ModBlocks.OVERGROWN_CHALK_BRICKS,
				overlay1(
						//You have to change this block to the "base" block
						ModBlocks.CHALK_BRICKS,
						new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/overgrown_bricks_overlay")
				),
				bsmg);

		ornamentedBlock(ModBlocks.GOLD_ORNAMENTED_CHALK_BRICKS,
				overlay1(
						ModBlocks.CHALK_BRICKS,
						new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/gold_ornamented_brick_overlay")
				),
				bsmg);

		overgrownOrnamentedBlock(ModBlocks.GOLD_ORNAMENTED_OVERGROWN_CHALK_BRICKS,
				overlays2(
						ModBlocks.CHALK_BRICKS,
						new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/gold_ornamented_brick_overlay"),
						new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/overgrown_bricks_overlay")
				),
				bsmg);

		Test.overgrownBlock(ModBlocks.TEST_OVERGROWN,
				overlay1(
						ModBlocks.CHALK,
						new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/overgrown_bricks_overlay")
				),
				bsmg);
		Test.overgrownOrnamentedBlock(ModBlocks.TEST_OVERGROWN_ORNAMENTED,
				overlays2(
						ModBlocks.CHALK,
						new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/gold_ornamented_brick_overlay"),
						new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/overgrown_bricks_overlay")
				),
				bsmg);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {

	}

	//Testcode from AlPr

	/**
	 * This is the method creating the Models; The Identifier is the path to the JSON file:
	 * <code>Identifier.of("your_mod_id", "block/" + parent)</code> =>
	 * <code>resources/assets/your_mod_id/block/parent</code> Params:
	 *
	 * @param parent The literal name of the JSON file
	 * @param variant The literal name of the variant; e.g. you have two JSONs: "test_overgrown.json" &
	 * 		"test_ornamented.json". "Test" is the parent, "_overgrown" & "_ornamented" are the variants. These will get
	 * 		appended to the block JSON once generated => <code>"test_overgrown<strong>_1_overlay</strong>.json"</code>
	 * @param requiredTextureKeys These are the Texture keys your JSON file uses; <code>TextureKey.LAYER1</code> in
	 * 		code =>
	 * 		<code>"texture": "#layer1"</code> in the parent JSON => <code>"textures": { "layer1": "your_mod_id:block
	 * 		/test" }</code> in the generated JSON
	 */
	private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
		return new Model(Optional.of(new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + parent)), Optional.of(variant),
				requiredTextureKeys);
	}

	/**
	 * This is technically the same, just without the variant => <code>"test_overgrown.json"</code><br>
	 */
	private static Model block(String parent, TextureKey... requiredTextureKeys) {
		return new Model(Optional.of(new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "block/" + parent)), Optional.empty(),
				requiredTextureKeys);
	}

	/**
	 * The most crucial step - actually specify the identifiers to the generated JSON file. Here you create a new
	 * TextureMap and specify what ID goes where.<br> Let's look at this - <code>.put(TextureKey.ALL,
	 * TextureMap.getId(baseBlock))</code>:<br> You specify which to which TextureKey goes the Identifier (second
	 * param). The TextureMap class has a handy method for creating IDs just from passing a block/item.
	 * {@code TextureMap#getSubId(Block, String)} lets you append a string to the Identifier. <br> ALL TEXTUREKEYS HERE
	 * HAVE TO MATCH ALL TEXTUREKEYS IN YOUR MODEL INSTANCE! otherwise it won't work.
	 *
	 * @param baseBlock The block that makes the base texture.
	 * @param overlay1Id The path to the overlay PNG file.
	 * @see TextureMap
	 */
	public static TextureMap overlay1(Block baseBlock, Identifier overlay1Id) {
		return new TextureMap().put(TextureKey.ALL, TextureMap.getId(baseBlock)).put(TextureKey.LAYER1, overlay1Id);
	}

	public static TextureMap overlays2(Block baseBlock, Identifier overlay1Id, Identifier overlay2Id) {
		return new TextureMap().put(TextureKey.ALL, TextureMap.getId(baseBlock)).put(TextureKey.LAYER1, overlay1Id)
				.put(TextureKey.LAYER2, overlay2Id);
	}

	/**
	 * This is the method that you will call in your ModelProvider. HAS to be static, so you can import it. It creates
	 * the block and item model JSONs and blockstate JSON file.
	 *
	 * @param block The {@link Block} that gets the JSONs generated
	 * @param textureMap The {@link TextureMap} specifying the identifiers
	 * @param bsmg The {@link BlockStateModelGenerator} which you have to use for all of its constants. MAKING A NEW
	 * 		ONE, EVEN IDENTICAL, WON'T WORK! It'll just throw a {@link NullPointerException}.
	 * @see BlockStateModelGenerator
	 */
	public static void overgrownBlock(Block block, TextureMap textureMap, BlockStateModelGenerator bsmg) {
		//I merged the two models into one since they were identical. You don't need two separate models for two separate blocks.
		Identifier identifier = CUBE_ALL_OVERLAY.upload(block, textureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, identifier));
		bsmg.registerParentedItemModel(block, identifier);
	}

	public static void ornamentedBlock(Block block, TextureMap textureMap, BlockStateModelGenerator bsmg) {
		Identifier identifier = CUBE_ALL_OVERLAY.upload(block, textureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, identifier));
		bsmg.registerParentedItemModel(block, identifier);
	}

	public static void overgrownOrnamentedBlock(Block block, TextureMap textureMap, BlockStateModelGenerator bsmg) {
		Identifier identifier = CUBE_ALL_2_OVERLAYS.upload(block, textureMap, bsmg.modelCollector);
		bsmg.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, identifier));
		bsmg.registerParentedItemModel(block, identifier);
	}
}

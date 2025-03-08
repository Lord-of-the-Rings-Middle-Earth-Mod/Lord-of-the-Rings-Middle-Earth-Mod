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

package me.anedhel.lotrmiddleearth.blocks;

import me.anedhel.lotrmiddleearth.LordOfTheRingsMiddleEarthMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

	public static final Block CHALK = registerBlock("chalk", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CHALK_BRICKS = registerBlock("chalk_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
	public static final Block CHALK_BRICK_STAIRS = registerBlock("chalk_brick_stairs",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
	public static final Block GOLD_ORNAMENTED_CHALK_BRICKS = registerBlock("gold_ornamented_chalk_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
	public static final Block GOLD_ORNAMENTED_CHALK_BRICK_STAIRS = registerBlock("gold_ornamented_chalk_brick_stairs",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
	public static final Block OVERGROWN_CHALK_BRICKS = registerBlock("overgrown_chalk_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
	public static final Block GOLD_ORNAMENTED_OVERGROWN_CHALK_BRICKS = registerBlock(
			"gold_ornamented_overgrown_chalk_bricks", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
	public static final Block GOLD_ORNAMENTED_OVERGROWN_CHALK_BRICK_STAIRS = registerBlock(
			"gold_ornamented_overgrown_chalk_brick_stairs",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));

	public static final Block TEST_OVERGROWN = registerBlock("test_overgrown", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block TEST_OVERGROWN_ORNAMENTED = registerBlock("test_overgrown_ornamented", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registries.ITEM, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings()));
	}

	public static void registerModBlocks() {
		LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Blocks for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
	}
}

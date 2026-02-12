/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.block.stonetypes;

import com.anedhel.vext.VExtMod;
import com.anedhel.vext.block.custom.ModFriezeBlock;
import com.anedhel.vext.block.custom.ModPillarBlock;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.sound.BlockSoundGroup;

import static com.anedhel.vext.block.ModBlocks.registerBlock;

/**
 * Defines and registers all Chalk stone blocks and their variants.
 * <p>
 * This class creates a comprehensive set of Chalk blocks including base stone,
 * cobbled, smooth, and cracked variants, each with normal, mossy, and overgrown states.
 * It also includes specialized subsets for polished stone, pillars, friezes, and various
 * brick styles, all with optional metal ornamentations (bronze, silver, gold).
 *
 * @author Moritz Rohleder
 * @see ModStoneSet
 * @see ModStoneTypes
 * @since 0.1.0
 */
public class ChalkBlocks {

	public static Block CHALK = registerBlock("chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CHALK_STAIRS = registerBlock("chalk_stairs",
			settings -> new StairsBlock(ChalkBlocks.CHALK.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CHALK_SLAB = registerBlock("chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CHALK_BUTTON = registerBlock("chalk_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block CHALK_PRESSURE_PLATE = registerBlock("chalk_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block CHALK_WALL = registerBlock("chalk_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CHALK_FAMILY = BlockFamilies.register(CHALK)
			.stairs(CHALK_STAIRS)
			.slab(CHALK_SLAB)
			.button(CHALK_BUTTON)
			.pressurePlate(CHALK_PRESSURE_PLATE)
			.wall(CHALK_WALL)
			.build();

	public static Block MOSSY_CHALK = registerBlock("mossy_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CHALK_STAIRS = registerBlock("mossy_chalk_stairs",
			settings -> new StairsBlock(ChalkBlocks.MOSSY_CHALK.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CHALK_SLAB = registerBlock("mossy_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CHALK_BUTTON = registerBlock("mossy_chalk_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block MOSSY_CHALK_PRESSURE_PLATE = registerBlock("mossy_chalk_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block MOSSY_CHALK_WALL = registerBlock("mossy_chalk_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CHALK_FAMILY = BlockFamilies.register(MOSSY_CHALK)
			.stairs(MOSSY_CHALK_STAIRS)
			.slab(MOSSY_CHALK_SLAB)
			.button(MOSSY_CHALK_BUTTON)
			.pressurePlate(MOSSY_CHALK_PRESSURE_PLATE)
			.wall(MOSSY_CHALK_WALL)
			.build();

	public static Block OVERGROWN_CHALK = registerBlock("overgrown_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CHALK_STAIRS = registerBlock("overgrown_chalk_stairs",
			settings -> new StairsBlock(ChalkBlocks.OVERGROWN_CHALK.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CHALK_SLAB = registerBlock("overgrown_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CHALK_BUTTON = registerBlock("overgrown_chalk_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block OVERGROWN_CHALK_PRESSURE_PLATE = registerBlock("overgrown_chalk_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block OVERGROWN_CHALK_WALL = registerBlock("overgrown_chalk_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CHALK_FAMILY = BlockFamilies.register(OVERGROWN_CHALK)
			.stairs(OVERGROWN_CHALK_STAIRS)
			.slab(OVERGROWN_CHALK_SLAB)
			.button(OVERGROWN_CHALK_BUTTON)
			.pressurePlate(OVERGROWN_CHALK_PRESSURE_PLATE)
			.wall(OVERGROWN_CHALK_WALL)
			.build();

	public static Block COBBLED_CHALK = registerBlock("cobbled_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block COBBLED_CHALK_STAIRS = registerBlock("cobbled_chalk_stairs",
			settings -> new StairsBlock(ChalkBlocks.COBBLED_CHALK.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block COBBLED_CHALK_SLAB = registerBlock("cobbled_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block COBBLED_CHALK_BUTTON = registerBlock("cobbled_chalk_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block COBBLED_CHALK_PRESSURE_PLATE = registerBlock("cobbled_chalk_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block COBBLED_CHALK_WALL = registerBlock("cobbled_chalk_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily COBBLED_CHALK_FAMILY = BlockFamilies.register(COBBLED_CHALK)
			.stairs(COBBLED_CHALK_STAIRS)
			.slab(COBBLED_CHALK_SLAB)
			.button(COBBLED_CHALK_BUTTON)
			.pressurePlate(COBBLED_CHALK_PRESSURE_PLATE)
			.wall(COBBLED_CHALK_WALL)
			.build();

	public static Block MOSSY_COBBLED_CHALK = registerBlock("mossy_cobbled_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_COBBLED_CHALK_STAIRS = registerBlock("mossy_cobbled_chalk_stairs",
			settings -> new StairsBlock(ChalkBlocks.MOSSY_COBBLED_CHALK.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_COBBLED_CHALK_SLAB = registerBlock("mossy_cobbled_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_COBBLED_CHALK_BUTTON = registerBlock("mossy_cobbled_chalk_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block MOSSY_COBBLED_CHALK_PRESSURE_PLATE = registerBlock("mossy_cobbled_chalk_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block MOSSY_COBBLED_CHALK_WALL = registerBlock("mossy_cobbled_chalk_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_COBBLED_CHALK_FAMILY = BlockFamilies.register(MOSSY_COBBLED_CHALK)
			.stairs(MOSSY_COBBLED_CHALK_STAIRS)
			.slab(MOSSY_COBBLED_CHALK_SLAB)
			.button(MOSSY_COBBLED_CHALK_BUTTON)
			.pressurePlate(MOSSY_COBBLED_CHALK_PRESSURE_PLATE)
			.wall(MOSSY_COBBLED_CHALK_WALL)
			.build();

	public static Block OVERGROWN_COBBLED_CHALK = registerBlock("overgrown_cobbled_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_COBBLED_CHALK_STAIRS = registerBlock("overgrown_cobbled_chalk_stairs",
			settings -> new StairsBlock(ChalkBlocks.OVERGROWN_COBBLED_CHALK.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_COBBLED_CHALK_SLAB = registerBlock("overgrown_cobbled_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_COBBLED_CHALK_BUTTON = registerBlock("overgrown_cobbled_chalk_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block OVERGROWN_COBBLED_CHALK_PRESSURE_PLATE = registerBlock("overgrown_cobbled_chalk_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block OVERGROWN_COBBLED_CHALK_WALL = registerBlock("overgrown_cobbled_chalk_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_COBBLED_CHALK_FAMILY = BlockFamilies.register(OVERGROWN_COBBLED_CHALK)
			.stairs(OVERGROWN_COBBLED_CHALK_STAIRS)
			.slab(OVERGROWN_COBBLED_CHALK_SLAB)
			.button(OVERGROWN_COBBLED_CHALK_BUTTON)
			.pressurePlate(OVERGROWN_COBBLED_CHALK_PRESSURE_PLATE)
			.wall(OVERGROWN_COBBLED_CHALK_WALL)
			.build();

	public static Block SMOOTH_CHALK = registerBlock("smooth_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SMOOTH_CHALK_STAIRS = registerBlock("smooth_chalk_stairs",
			settings -> new StairsBlock(ChalkBlocks.SMOOTH_CHALK.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SMOOTH_CHALK_SLAB = registerBlock("smooth_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SMOOTH_CHALK_BUTTON = registerBlock("smooth_chalk_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block SMOOTH_CHALK_PRESSURE_PLATE = registerBlock("smooth_chalk_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block SMOOTH_CHALK_WALL = registerBlock("smooth_chalk_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SMOOTH_CHALK_FAMILY = BlockFamilies.register(SMOOTH_CHALK)
			.stairs(SMOOTH_CHALK_STAIRS)
			.slab(SMOOTH_CHALK_SLAB)
			.button(SMOOTH_CHALK_BUTTON)
			.pressurePlate(SMOOTH_CHALK_PRESSURE_PLATE)
			.wall(SMOOTH_CHALK_WALL)
			.build();

	public static Block MOSSY_SMOOTH_CHALK = registerBlock("mossy_smooth_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SMOOTH_CHALK_STAIRS = registerBlock("mossy_smooth_chalk_stairs",
			settings -> new StairsBlock(ChalkBlocks.MOSSY_SMOOTH_CHALK.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SMOOTH_CHALK_SLAB = registerBlock("mossy_smooth_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SMOOTH_CHALK_BUTTON = registerBlock("mossy_smooth_chalk_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block MOSSY_SMOOTH_CHALK_PRESSURE_PLATE = registerBlock("mossy_smooth_chalk_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block MOSSY_SMOOTH_CHALK_WALL = registerBlock("mossy_smooth_chalk_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SMOOTH_CHALK_FAMILY = BlockFamilies.register(MOSSY_SMOOTH_CHALK)
			.stairs(MOSSY_SMOOTH_CHALK_STAIRS)
			.slab(MOSSY_SMOOTH_CHALK_SLAB)
			.button(MOSSY_SMOOTH_CHALK_BUTTON)
			.pressurePlate(MOSSY_SMOOTH_CHALK_PRESSURE_PLATE)
			.wall(MOSSY_SMOOTH_CHALK_WALL)
			.build();

	public static Block OVERGROWN_SMOOTH_CHALK = registerBlock("overgrown_smooth_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SMOOTH_CHALK_STAIRS = registerBlock("overgrown_smooth_chalk_stairs",
			settings -> new StairsBlock(ChalkBlocks.OVERGROWN_SMOOTH_CHALK.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SMOOTH_CHALK_SLAB = registerBlock("overgrown_smooth_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SMOOTH_CHALK_BUTTON = registerBlock("overgrown_smooth_chalk_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block OVERGROWN_SMOOTH_CHALK_PRESSURE_PLATE = registerBlock("overgrown_smooth_chalk_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block OVERGROWN_SMOOTH_CHALK_WALL = registerBlock("overgrown_smooth_chalk_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SMOOTH_CHALK_FAMILY = BlockFamilies.register(OVERGROWN_SMOOTH_CHALK)
			.stairs(OVERGROWN_SMOOTH_CHALK_STAIRS)
			.slab(OVERGROWN_SMOOTH_CHALK_SLAB)
			.button(OVERGROWN_SMOOTH_CHALK_BUTTON)
			.pressurePlate(OVERGROWN_SMOOTH_CHALK_PRESSURE_PLATE)
			.wall(OVERGROWN_SMOOTH_CHALK_WALL)
			.build();

	public static Block CRACKED_SMOOTH_CHALK = registerBlock("cracked_smooth_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SMOOTH_CHALK_STAIRS = registerBlock("cracked_smooth_chalk_stairs",
			settings -> new StairsBlock(ChalkBlocks.CRACKED_SMOOTH_CHALK.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SMOOTH_CHALK_SLAB = registerBlock("cracked_smooth_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SMOOTH_CHALK_BUTTON = registerBlock("cracked_smooth_chalk_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block CRACKED_SMOOTH_CHALK_PRESSURE_PLATE = registerBlock("cracked_smooth_chalk_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block CRACKED_SMOOTH_CHALK_WALL = registerBlock("cracked_smooth_chalk_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SMOOTH_CHALK_FAMILY = BlockFamilies.register(CRACKED_SMOOTH_CHALK)
			.stairs(CRACKED_SMOOTH_CHALK_STAIRS)
			.slab(CRACKED_SMOOTH_CHALK_SLAB)
			.button(CRACKED_SMOOTH_CHALK_BUTTON)
			.pressurePlate(CRACKED_SMOOTH_CHALK_PRESSURE_PLATE)
			.wall(CRACKED_SMOOTH_CHALK_WALL)
			.build();

	public static Block CRACKED_MOSSY_SMOOTH_CHALK = registerBlock("cracked_mossy_smooth_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_MOSSY_SMOOTH_CHALK_STAIRS = registerBlock("cracked_mossy_smooth_chalk_stairs",
			settings -> new StairsBlock(ChalkBlocks.CRACKED_MOSSY_SMOOTH_CHALK.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_MOSSY_SMOOTH_CHALK_SLAB = registerBlock("cracked_mossy_smooth_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_MOSSY_SMOOTH_CHALK_BUTTON = registerBlock("cracked_mossy_smooth_chalk_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block CRACKED_MOSSY_SMOOTH_CHALK_PRESSURE_PLATE = registerBlock("cracked_mossy_smooth_chalk_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block CRACKED_MOSSY_SMOOTH_CHALK_WALL = registerBlock("cracked_mossy_smooth_chalk_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_MOSSY_SMOOTH_CHALK_FAMILY = BlockFamilies.register(CRACKED_MOSSY_SMOOTH_CHALK)
			.stairs(CRACKED_MOSSY_SMOOTH_CHALK_STAIRS)
			.slab(CRACKED_MOSSY_SMOOTH_CHALK_SLAB)
			.button(CRACKED_MOSSY_SMOOTH_CHALK_BUTTON)
			.pressurePlate(CRACKED_MOSSY_SMOOTH_CHALK_PRESSURE_PLATE)
			.wall(CRACKED_MOSSY_SMOOTH_CHALK_WALL)
			.build();

	public static Block CRACKED_OVERGROWN_SMOOTH_CHALK = registerBlock("cracked_overgrown_smooth_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_OVERGROWN_SMOOTH_CHALK_STAIRS = registerBlock("cracked_overgrown_smooth_chalk_stairs",
			settings -> new StairsBlock(ChalkBlocks.CRACKED_OVERGROWN_SMOOTH_CHALK.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_OVERGROWN_SMOOTH_CHALK_SLAB = registerBlock("cracked_overgrown_smooth_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_OVERGROWN_SMOOTH_CHALK_BUTTON = registerBlock("cracked_overgrown_smooth_chalk_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block CRACKED_OVERGROWN_SMOOTH_CHALK_PRESSURE_PLATE = registerBlock("cracked_overgrown_smooth_chalk_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block CRACKED_OVERGROWN_SMOOTH_CHALK_WALL = registerBlock("cracked_overgrown_smooth_chalk_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_OVERGROWN_SMOOTH_CHALK_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_SMOOTH_CHALK)
			.stairs(CRACKED_OVERGROWN_SMOOTH_CHALK_STAIRS)
			.slab(CRACKED_OVERGROWN_SMOOTH_CHALK_SLAB)
			.button(CRACKED_OVERGROWN_SMOOTH_CHALK_BUTTON)
			.pressurePlate(CRACKED_OVERGROWN_SMOOTH_CHALK_PRESSURE_PLATE)
			.wall(CRACKED_OVERGROWN_SMOOTH_CHALK_WALL)
			.build();

	public static Block POLISHED_CHALK = registerBlock("polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block POLISHED_CHALK_SLAB = registerBlock("polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily POLISHED_CHALK_FAMILY = BlockFamilies.register(POLISHED_CHALK)
			.slab(POLISHED_CHALK_SLAB)
			.build();

	public static Block MOSSY_POLISHED_CHALK = registerBlock("mossy_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_POLISHED_CHALK_SLAB = registerBlock("mossy_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_POLISHED_CHALK_FAMILY = BlockFamilies.register(MOSSY_POLISHED_CHALK)
			.slab(MOSSY_POLISHED_CHALK_SLAB)
			.build();

	public static Block OVERGROWN_POLISHED_CHALK = registerBlock("overgrown_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_POLISHED_CHALK_SLAB = registerBlock("overgrown_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_POLISHED_CHALK_FAMILY = BlockFamilies.register(OVERGROWN_POLISHED_CHALK)
			.slab(OVERGROWN_POLISHED_CHALK_SLAB)
			.build();

	public static Block CRACKED_POLISHED_CHALK = registerBlock("cracked_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_POLISHED_CHALK_SLAB = registerBlock("cracked_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_POLISHED_CHALK_FAMILY = BlockFamilies.register(CRACKED_POLISHED_CHALK)
			.slab(CRACKED_POLISHED_CHALK_SLAB)
			.build();

	public static Block MOSSY_CRACKED_POLISHED_CHALK = registerBlock("mossy_cracked_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_POLISHED_CHALK_SLAB = registerBlock("mossy_cracked_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_POLISHED_CHALK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_POLISHED_CHALK)
			.slab(MOSSY_CRACKED_POLISHED_CHALK_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_POLISHED_CHALK = registerBlock("overgrown_cracked_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_POLISHED_CHALK_SLAB = registerBlock("overgrown_cracked_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_POLISHED_CHALK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_POLISHED_CHALK)
			.slab(OVERGROWN_CRACKED_POLISHED_CHALK_SLAB)
			.build();

	public static Block BRONZE_POLISHED_CHALK = registerBlock("bronze_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_POLISHED_CHALK_SLAB = registerBlock("bronze_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_POLISHED_CHALK_FAMILY = BlockFamilies.register(BRONZE_POLISHED_CHALK)
			.slab(BRONZE_POLISHED_CHALK_SLAB)
			.build();

	public static Block MOSSY_BRONZE_POLISHED_CHALK = registerBlock("mossy_bronze_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_POLISHED_CHALK_SLAB = registerBlock("mossy_bronze_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_POLISHED_CHALK_FAMILY = BlockFamilies.register(MOSSY_BRONZE_POLISHED_CHALK)
			.slab(MOSSY_BRONZE_POLISHED_CHALK_SLAB)
			.build();

	public static Block OVERGROWN_BRONZE_POLISHED_CHALK = registerBlock("overgrown_bronze_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_POLISHED_CHALK_SLAB = registerBlock("overgrown_bronze_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_POLISHED_CHALK_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_POLISHED_CHALK)
			.slab(OVERGROWN_BRONZE_POLISHED_CHALK_SLAB)
			.build();

	public static Block CRACKED_BRONZE_POLISHED_CHALK = registerBlock("cracked_bronze_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_POLISHED_CHALK_SLAB = registerBlock("cracked_bronze_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_POLISHED_CHALK_FAMILY = BlockFamilies.register(CRACKED_BRONZE_POLISHED_CHALK)
			.slab(CRACKED_BRONZE_POLISHED_CHALK_SLAB)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_POLISHED_CHALK = registerBlock("mossy_cracked_bronze_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_POLISHED_CHALK_SLAB = registerBlock("mossy_cracked_bronze_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_POLISHED_CHALK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_POLISHED_CHALK)
			.slab(MOSSY_CRACKED_BRONZE_POLISHED_CHALK_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_POLISHED_CHALK = registerBlock("overgrown_cracked_bronze_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_POLISHED_CHALK_SLAB = registerBlock("overgrown_cracked_bronze_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_POLISHED_CHALK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_POLISHED_CHALK)
			.slab(OVERGROWN_CRACKED_BRONZE_POLISHED_CHALK_SLAB)
			.build();

	public static Block SILVER_POLISHED_CHALK = registerBlock("silver_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_POLISHED_CHALK_SLAB = registerBlock("silver_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_POLISHED_CHALK_FAMILY = BlockFamilies.register(SILVER_POLISHED_CHALK)
			.slab(SILVER_POLISHED_CHALK_SLAB)
			.build();

	public static Block MOSSY_SILVER_POLISHED_CHALK = registerBlock("mossy_silver_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_POLISHED_CHALK_SLAB = registerBlock("mossy_silver_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_POLISHED_CHALK_FAMILY = BlockFamilies.register(MOSSY_SILVER_POLISHED_CHALK)
			.slab(MOSSY_SILVER_POLISHED_CHALK_SLAB)
			.build();

	public static Block OVERGROWN_SILVER_POLISHED_CHALK = registerBlock("overgrown_silver_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_POLISHED_CHALK_SLAB = registerBlock("overgrown_silver_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_POLISHED_CHALK_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_POLISHED_CHALK)
			.slab(OVERGROWN_SILVER_POLISHED_CHALK_SLAB)
			.build();

	public static Block CRACKED_SILVER_POLISHED_CHALK = registerBlock("cracked_silver_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_POLISHED_CHALK_SLAB = registerBlock("cracked_silver_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_POLISHED_CHALK_FAMILY = BlockFamilies.register(CRACKED_SILVER_POLISHED_CHALK)
			.slab(CRACKED_SILVER_POLISHED_CHALK_SLAB)
			.build();

	public static Block MOSSY_CRACKED_SILVER_POLISHED_CHALK = registerBlock("mossy_cracked_silver_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_POLISHED_CHALK_SLAB = registerBlock("mossy_cracked_silver_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_POLISHED_CHALK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_POLISHED_CHALK)
			.slab(MOSSY_CRACKED_SILVER_POLISHED_CHALK_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_POLISHED_CHALK = registerBlock("overgrown_cracked_silver_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_POLISHED_CHALK_SLAB = registerBlock("overgrown_cracked_silver_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_POLISHED_CHALK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_POLISHED_CHALK)
			.slab(OVERGROWN_CRACKED_SILVER_POLISHED_CHALK_SLAB)
			.build();

	public static Block GOLD_POLISHED_CHALK = registerBlock("gold_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_POLISHED_CHALK_SLAB = registerBlock("gold_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_POLISHED_CHALK_FAMILY = BlockFamilies.register(GOLD_POLISHED_CHALK)
			.slab(GOLD_POLISHED_CHALK_SLAB)
			.build();

	public static Block MOSSY_GOLD_POLISHED_CHALK = registerBlock("mossy_gold_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_POLISHED_CHALK_SLAB = registerBlock("mossy_gold_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_POLISHED_CHALK_FAMILY = BlockFamilies.register(MOSSY_GOLD_POLISHED_CHALK)
			.slab(MOSSY_GOLD_POLISHED_CHALK_SLAB)
			.build();

	public static Block OVERGROWN_GOLD_POLISHED_CHALK = registerBlock("overgrown_gold_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_POLISHED_CHALK_SLAB = registerBlock("overgrown_gold_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_POLISHED_CHALK_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_POLISHED_CHALK)
			.slab(OVERGROWN_GOLD_POLISHED_CHALK_SLAB)
			.build();

	public static Block CRACKED_GOLD_POLISHED_CHALK = registerBlock("cracked_gold_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_POLISHED_CHALK_SLAB = registerBlock("cracked_gold_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_POLISHED_CHALK_FAMILY = BlockFamilies.register(CRACKED_GOLD_POLISHED_CHALK)
			.slab(CRACKED_GOLD_POLISHED_CHALK_SLAB)
			.build();

	public static Block MOSSY_CRACKED_GOLD_POLISHED_CHALK = registerBlock("mossy_cracked_gold_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_POLISHED_CHALK_SLAB = registerBlock("mossy_cracked_gold_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_POLISHED_CHALK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_POLISHED_CHALK)
			.slab(MOSSY_CRACKED_GOLD_POLISHED_CHALK_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_POLISHED_CHALK = registerBlock("overgrown_cracked_gold_polished_chalk",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_POLISHED_CHALK_SLAB = registerBlock("overgrown_cracked_gold_polished_chalk_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_POLISHED_CHALK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_POLISHED_CHALK)
			.slab(OVERGROWN_CRACKED_GOLD_POLISHED_CHALK_SLAB)
			.build();

	public static ModStoneSubSet POLISHED_CHALK_SUBSET = new ModStoneSubSet(
			POLISHED_CHALK_FAMILY,
			MOSSY_POLISHED_CHALK_FAMILY,
			OVERGROWN_POLISHED_CHALK_FAMILY,
			CRACKED_POLISHED_CHALK_FAMILY, MOSSY_CRACKED_POLISHED_CHALK_FAMILY, OVERGROWN_CRACKED_POLISHED_CHALK_FAMILY,
			BRONZE_POLISHED_CHALK_FAMILY, MOSSY_BRONZE_POLISHED_CHALK_FAMILY, OVERGROWN_BRONZE_POLISHED_CHALK_FAMILY,
			CRACKED_BRONZE_POLISHED_CHALK_FAMILY, MOSSY_CRACKED_BRONZE_POLISHED_CHALK_FAMILY, OVERGROWN_CRACKED_BRONZE_POLISHED_CHALK_FAMILY,
			SILVER_POLISHED_CHALK_FAMILY, MOSSY_SILVER_POLISHED_CHALK_FAMILY, OVERGROWN_SILVER_POLISHED_CHALK_FAMILY,
			CRACKED_SILVER_POLISHED_CHALK_FAMILY, MOSSY_CRACKED_SILVER_POLISHED_CHALK_FAMILY, OVERGROWN_CRACKED_SILVER_POLISHED_CHALK_FAMILY,
			GOLD_POLISHED_CHALK_FAMILY, MOSSY_GOLD_POLISHED_CHALK_FAMILY, OVERGROWN_GOLD_POLISHED_CHALK_FAMILY,
			CRACKED_GOLD_POLISHED_CHALK_FAMILY, MOSSY_CRACKED_GOLD_POLISHED_CHALK_FAMILY,
			OVERGROWN_CRACKED_GOLD_POLISHED_CHALK_FAMILY, "polished_chalk");

	public static Block CHALK_PILLAR = registerBlock("chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CHALK_PILLAR_SLAB = registerBlock("chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CHALK_PILLAR_FAMILY = BlockFamilies.register(CHALK_PILLAR)
			.slab(CHALK_PILLAR_SLAB)
			.build();

	public static Block MOSSY_CHALK_PILLAR = registerBlock("mossy_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CHALK_PILLAR_SLAB = registerBlock("mossy_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CHALK_PILLAR_FAMILY = BlockFamilies.register(MOSSY_CHALK_PILLAR)
			.slab(MOSSY_CHALK_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_CHALK_PILLAR = registerBlock("overgrown_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CHALK_PILLAR_SLAB = registerBlock("overgrown_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CHALK_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_CHALK_PILLAR)
			.slab(OVERGROWN_CHALK_PILLAR_SLAB)
			.build();

	public static Block CRACKED_CHALK_PILLAR = registerBlock("cracked_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_CHALK_PILLAR_SLAB = registerBlock("cracked_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_CHALK_PILLAR_FAMILY = BlockFamilies.register(CRACKED_CHALK_PILLAR)
			.slab(CRACKED_CHALK_PILLAR_SLAB)
			.build();

	public static Block MOSSY_CRACKED_CHALK_PILLAR = registerBlock("mossy_cracked_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_CHALK_PILLAR_SLAB = registerBlock("mossy_cracked_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_CHALK_PILLAR_FAMILY = BlockFamilies.register(MOSSY_CRACKED_CHALK_PILLAR)
			.slab(MOSSY_CRACKED_CHALK_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_CHALK_PILLAR = registerBlock("overgrown_cracked_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_CHALK_PILLAR_SLAB = registerBlock("overgrown_cracked_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_CHALK_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_CHALK_PILLAR)
			.slab(OVERGROWN_CRACKED_CHALK_PILLAR_SLAB)
			.build();

	public static Block BRONZE_CHALK_PILLAR = registerBlock("bronze_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_CHALK_PILLAR_SLAB = registerBlock("bronze_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_CHALK_PILLAR_FAMILY = BlockFamilies.register(BRONZE_CHALK_PILLAR)
			.slab(BRONZE_CHALK_PILLAR_SLAB)
			.build();

	public static Block MOSSY_BRONZE_CHALK_PILLAR = registerBlock("mossy_bronze_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_CHALK_PILLAR_SLAB = registerBlock("mossy_bronze_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_CHALK_PILLAR_FAMILY = BlockFamilies.register(MOSSY_BRONZE_CHALK_PILLAR)
			.slab(MOSSY_BRONZE_CHALK_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_BRONZE_CHALK_PILLAR = registerBlock("overgrown_bronze_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_CHALK_PILLAR_SLAB = registerBlock("overgrown_bronze_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_CHALK_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_CHALK_PILLAR)
			.slab(OVERGROWN_BRONZE_CHALK_PILLAR_SLAB)
			.build();

	public static Block CRACKED_BRONZE_CHALK_PILLAR = registerBlock("cracked_bronze_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_CHALK_PILLAR_SLAB = registerBlock("cracked_bronze_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_CHALK_PILLAR_FAMILY = BlockFamilies.register(CRACKED_BRONZE_CHALK_PILLAR)
			.slab(CRACKED_BRONZE_CHALK_PILLAR_SLAB)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_CHALK_PILLAR = registerBlock("mossy_cracked_bronze_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_CHALK_PILLAR_SLAB = registerBlock("mossy_cracked_bronze_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_CHALK_PILLAR_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_CHALK_PILLAR)
			.slab(MOSSY_CRACKED_BRONZE_CHALK_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_CHALK_PILLAR = registerBlock("overgrown_cracked_bronze_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_CHALK_PILLAR_SLAB = registerBlock("overgrown_cracked_bronze_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_CHALK_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_CHALK_PILLAR)
			.slab(OVERGROWN_CRACKED_BRONZE_CHALK_PILLAR_SLAB)
			.build();

	public static Block SILVER_CHALK_PILLAR = registerBlock("silver_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_CHALK_PILLAR_SLAB = registerBlock("silver_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_CHALK_PILLAR_FAMILY = BlockFamilies.register(SILVER_CHALK_PILLAR)
			.slab(SILVER_CHALK_PILLAR_SLAB)
			.build();

	public static Block MOSSY_SILVER_CHALK_PILLAR = registerBlock("mossy_silver_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_CHALK_PILLAR_SLAB = registerBlock("mossy_silver_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_CHALK_PILLAR_FAMILY = BlockFamilies.register(MOSSY_SILVER_CHALK_PILLAR)
			.slab(MOSSY_SILVER_CHALK_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_SILVER_CHALK_PILLAR = registerBlock("overgrown_silver_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_CHALK_PILLAR_SLAB = registerBlock("overgrown_silver_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_CHALK_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_CHALK_PILLAR)
			.slab(OVERGROWN_SILVER_CHALK_PILLAR_SLAB)
			.build();

	public static Block CRACKED_SILVER_CHALK_PILLAR = registerBlock("cracked_silver_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_CHALK_PILLAR_SLAB = registerBlock("cracked_silver_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_CHALK_PILLAR_FAMILY = BlockFamilies.register(CRACKED_SILVER_CHALK_PILLAR)
			.slab(CRACKED_SILVER_CHALK_PILLAR_SLAB)
			.build();

	public static Block MOSSY_CRACKED_SILVER_CHALK_PILLAR = registerBlock("mossy_cracked_silver_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_CHALK_PILLAR_SLAB = registerBlock("mossy_cracked_silver_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_CHALK_PILLAR_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_CHALK_PILLAR)
			.slab(MOSSY_CRACKED_SILVER_CHALK_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_CHALK_PILLAR = registerBlock("overgrown_cracked_silver_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_CHALK_PILLAR_SLAB = registerBlock("overgrown_cracked_silver_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_CHALK_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_CHALK_PILLAR)
			.slab(OVERGROWN_CRACKED_SILVER_CHALK_PILLAR_SLAB)
			.build();

	public static Block GOLD_CHALK_PILLAR = registerBlock("gold_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_CHALK_PILLAR_SLAB = registerBlock("gold_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_CHALK_PILLAR_FAMILY = BlockFamilies.register(GOLD_CHALK_PILLAR)
			.slab(GOLD_CHALK_PILLAR_SLAB)
			.build();

	public static Block MOSSY_GOLD_CHALK_PILLAR = registerBlock("mossy_gold_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_CHALK_PILLAR_SLAB = registerBlock("mossy_gold_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_CHALK_PILLAR_FAMILY = BlockFamilies.register(MOSSY_GOLD_CHALK_PILLAR)
			.slab(MOSSY_GOLD_CHALK_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_GOLD_CHALK_PILLAR = registerBlock("overgrown_gold_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_CHALK_PILLAR_SLAB = registerBlock("overgrown_gold_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_CHALK_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_CHALK_PILLAR)
			.slab(OVERGROWN_GOLD_CHALK_PILLAR_SLAB)
			.build();

	public static Block CRACKED_GOLD_CHALK_PILLAR = registerBlock("cracked_gold_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_CHALK_PILLAR_SLAB = registerBlock("cracked_gold_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_CHALK_PILLAR_FAMILY = BlockFamilies.register(CRACKED_GOLD_CHALK_PILLAR)
			.slab(CRACKED_GOLD_CHALK_PILLAR_SLAB)
			.build();

	public static Block MOSSY_CRACKED_GOLD_CHALK_PILLAR = registerBlock("mossy_cracked_gold_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_CHALK_PILLAR_SLAB = registerBlock("mossy_cracked_gold_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_CHALK_PILLAR_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_CHALK_PILLAR)
			.slab(MOSSY_CRACKED_GOLD_CHALK_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_CHALK_PILLAR = registerBlock("overgrown_cracked_gold_chalk_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_CHALK_PILLAR_SLAB = registerBlock("overgrown_cracked_gold_chalk_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_CHALK_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_CHALK_PILLAR)
			.slab(OVERGROWN_CRACKED_GOLD_CHALK_PILLAR_SLAB)
			.build();

	public static ModStoneSubSet CHALK_PILLAR_SUBSET = new ModStoneSubSet(
			CHALK_PILLAR_FAMILY,
			MOSSY_CHALK_PILLAR_FAMILY,
			OVERGROWN_CHALK_PILLAR_FAMILY,
			CRACKED_CHALK_PILLAR_FAMILY, MOSSY_CRACKED_CHALK_PILLAR_FAMILY, OVERGROWN_CRACKED_CHALK_PILLAR_FAMILY,
			BRONZE_CHALK_PILLAR_FAMILY, MOSSY_BRONZE_CHALK_PILLAR_FAMILY, OVERGROWN_BRONZE_CHALK_PILLAR_FAMILY,
			CRACKED_BRONZE_CHALK_PILLAR_FAMILY, MOSSY_CRACKED_BRONZE_CHALK_PILLAR_FAMILY, OVERGROWN_CRACKED_BRONZE_CHALK_PILLAR_FAMILY,
			SILVER_CHALK_PILLAR_FAMILY, MOSSY_SILVER_CHALK_PILLAR_FAMILY, OVERGROWN_SILVER_CHALK_PILLAR_FAMILY,
			CRACKED_SILVER_CHALK_PILLAR_FAMILY, MOSSY_CRACKED_SILVER_CHALK_PILLAR_FAMILY, OVERGROWN_CRACKED_SILVER_CHALK_PILLAR_FAMILY,
			GOLD_CHALK_PILLAR_FAMILY, MOSSY_GOLD_CHALK_PILLAR_FAMILY, OVERGROWN_GOLD_CHALK_PILLAR_FAMILY,
			CRACKED_GOLD_CHALK_PILLAR_FAMILY, MOSSY_CRACKED_GOLD_CHALK_PILLAR_FAMILY,
			OVERGROWN_CRACKED_GOLD_CHALK_PILLAR_FAMILY, "chalk_pillar");

	public static Block CHALK_FRIEZE = registerBlock("chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CHALK_FRIEZE_SLAB = registerBlock("chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CHALK_FRIEZE_FAMILY = BlockFamilies.register(CHALK_FRIEZE)
			.slab(CHALK_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_CHALK_FRIEZE = registerBlock("mossy_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CHALK_FRIEZE_SLAB = registerBlock("mossy_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CHALK_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_CHALK_FRIEZE)
			.slab(MOSSY_CHALK_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_CHALK_FRIEZE = registerBlock("overgrown_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CHALK_FRIEZE_SLAB = registerBlock("overgrown_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CHALK_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_CHALK_FRIEZE)
			.slab(OVERGROWN_CHALK_FRIEZE_SLAB)
			.build();

	public static Block CRACKED_CHALK_FRIEZE = registerBlock("cracked_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_CHALK_FRIEZE_SLAB = registerBlock("cracked_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_CHALK_FRIEZE_FAMILY = BlockFamilies.register(CRACKED_CHALK_FRIEZE)
			.slab(CRACKED_CHALK_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_CRACKED_CHALK_FRIEZE = registerBlock("mossy_cracked_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_CHALK_FRIEZE_SLAB = registerBlock("mossy_cracked_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_CHALK_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_CHALK_FRIEZE)
			.slab(MOSSY_CRACKED_CHALK_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_CHALK_FRIEZE = registerBlock("overgrown_cracked_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_CHALK_FRIEZE_SLAB = registerBlock("overgrown_cracked_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_CHALK_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_CHALK_FRIEZE)
			.slab(OVERGROWN_CRACKED_CHALK_FRIEZE_SLAB)
			.build();

	public static Block BRONZE_CHALK_FRIEZE = registerBlock("bronze_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_CHALK_FRIEZE_SLAB = registerBlock("bronze_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_CHALK_FRIEZE_FAMILY = BlockFamilies.register(BRONZE_CHALK_FRIEZE)
			.slab(BRONZE_CHALK_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_BRONZE_CHALK_FRIEZE = registerBlock("mossy_bronze_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_CHALK_FRIEZE_SLAB = registerBlock("mossy_bronze_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_CHALK_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_BRONZE_CHALK_FRIEZE)
			.slab(MOSSY_BRONZE_CHALK_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_BRONZE_CHALK_FRIEZE = registerBlock("overgrown_bronze_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_CHALK_FRIEZE_SLAB = registerBlock("overgrown_bronze_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_CHALK_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_CHALK_FRIEZE)
			.slab(OVERGROWN_BRONZE_CHALK_FRIEZE_SLAB)
			.build();

	public static Block CRACKED_BRONZE_CHALK_FRIEZE = registerBlock("cracked_bronze_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_CHALK_FRIEZE_SLAB = registerBlock("cracked_bronze_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_CHALK_FRIEZE_FAMILY = BlockFamilies.register(CRACKED_BRONZE_CHALK_FRIEZE)
			.slab(CRACKED_BRONZE_CHALK_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_CHALK_FRIEZE = registerBlock("mossy_cracked_bronze_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_CHALK_FRIEZE_SLAB = registerBlock("mossy_cracked_bronze_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_CHALK_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_CHALK_FRIEZE)
			.slab(MOSSY_CRACKED_BRONZE_CHALK_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_CHALK_FRIEZE = registerBlock("overgrown_cracked_bronze_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_CHALK_FRIEZE_SLAB = registerBlock("overgrown_cracked_bronze_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_CHALK_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_CHALK_FRIEZE)
			.slab(OVERGROWN_CRACKED_BRONZE_CHALK_FRIEZE_SLAB)
			.build();

	public static Block SILVER_CHALK_FRIEZE = registerBlock("silver_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_CHALK_FRIEZE_SLAB = registerBlock("silver_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_CHALK_FRIEZE_FAMILY = BlockFamilies.register(SILVER_CHALK_FRIEZE)
			.slab(SILVER_CHALK_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_SILVER_CHALK_FRIEZE = registerBlock("mossy_silver_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_CHALK_FRIEZE_SLAB = registerBlock("mossy_silver_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_CHALK_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_SILVER_CHALK_FRIEZE)
			.slab(MOSSY_SILVER_CHALK_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_SILVER_CHALK_FRIEZE = registerBlock("overgrown_silver_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_CHALK_FRIEZE_SLAB = registerBlock("overgrown_silver_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_CHALK_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_CHALK_FRIEZE)
			.slab(OVERGROWN_SILVER_CHALK_FRIEZE_SLAB)
			.build();

	public static Block CRACKED_SILVER_CHALK_FRIEZE = registerBlock("cracked_silver_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_CHALK_FRIEZE_SLAB = registerBlock("cracked_silver_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_CHALK_FRIEZE_FAMILY = BlockFamilies.register(CRACKED_SILVER_CHALK_FRIEZE)
			.slab(CRACKED_SILVER_CHALK_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_CRACKED_SILVER_CHALK_FRIEZE = registerBlock("mossy_cracked_silver_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_CHALK_FRIEZE_SLAB = registerBlock("mossy_cracked_silver_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_CHALK_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_CHALK_FRIEZE)
			.slab(MOSSY_CRACKED_SILVER_CHALK_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_CHALK_FRIEZE = registerBlock("overgrown_cracked_silver_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_CHALK_FRIEZE_SLAB = registerBlock("overgrown_cracked_silver_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_CHALK_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_CHALK_FRIEZE)
			.slab(OVERGROWN_CRACKED_SILVER_CHALK_FRIEZE_SLAB)
			.build();

	public static Block GOLD_CHALK_FRIEZE = registerBlock("gold_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_CHALK_FRIEZE_SLAB = registerBlock("gold_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_CHALK_FRIEZE_FAMILY = BlockFamilies.register(GOLD_CHALK_FRIEZE)
			.slab(GOLD_CHALK_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_GOLD_CHALK_FRIEZE = registerBlock("mossy_gold_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_CHALK_FRIEZE_SLAB = registerBlock("mossy_gold_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_CHALK_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_GOLD_CHALK_FRIEZE)
			.slab(MOSSY_GOLD_CHALK_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_GOLD_CHALK_FRIEZE = registerBlock("overgrown_gold_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_CHALK_FRIEZE_SLAB = registerBlock("overgrown_gold_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_CHALK_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_CHALK_FRIEZE)
			.slab(OVERGROWN_GOLD_CHALK_FRIEZE_SLAB)
			.build();

	public static Block CRACKED_GOLD_CHALK_FRIEZE = registerBlock("cracked_gold_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_CHALK_FRIEZE_SLAB = registerBlock("cracked_gold_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_CHALK_FRIEZE_FAMILY = BlockFamilies.register(CRACKED_GOLD_CHALK_FRIEZE)
			.slab(CRACKED_GOLD_CHALK_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_CRACKED_GOLD_CHALK_FRIEZE = registerBlock("mossy_cracked_gold_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_CHALK_FRIEZE_SLAB = registerBlock("mossy_cracked_gold_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_CHALK_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_CHALK_FRIEZE)
			.slab(MOSSY_CRACKED_GOLD_CHALK_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_CHALK_FRIEZE = registerBlock("overgrown_cracked_gold_chalk_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_CHALK_FRIEZE_SLAB = registerBlock("overgrown_cracked_gold_chalk_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_CHALK_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_CHALK_FRIEZE)
			.slab(OVERGROWN_CRACKED_GOLD_CHALK_FRIEZE_SLAB)
			.build();

	public static ModStoneSubSet CHALK_FRIEZE_SUBSET = new ModStoneSubSet(
			CHALK_FRIEZE_FAMILY,
			MOSSY_CHALK_FRIEZE_FAMILY,
			OVERGROWN_CHALK_FRIEZE_FAMILY,
			CRACKED_CHALK_FRIEZE_FAMILY, MOSSY_CRACKED_CHALK_FRIEZE_FAMILY, OVERGROWN_CRACKED_CHALK_FRIEZE_FAMILY,
			BRONZE_CHALK_FRIEZE_FAMILY, MOSSY_BRONZE_CHALK_FRIEZE_FAMILY, OVERGROWN_BRONZE_CHALK_FRIEZE_FAMILY,
			CRACKED_BRONZE_CHALK_FRIEZE_FAMILY, MOSSY_CRACKED_BRONZE_CHALK_FRIEZE_FAMILY, OVERGROWN_CRACKED_BRONZE_CHALK_FRIEZE_FAMILY,
			SILVER_CHALK_FRIEZE_FAMILY, MOSSY_SILVER_CHALK_FRIEZE_FAMILY, OVERGROWN_SILVER_CHALK_FRIEZE_FAMILY,
			CRACKED_SILVER_CHALK_FRIEZE_FAMILY, MOSSY_CRACKED_SILVER_CHALK_FRIEZE_FAMILY, OVERGROWN_CRACKED_SILVER_CHALK_FRIEZE_FAMILY,
			GOLD_CHALK_FRIEZE_FAMILY, MOSSY_GOLD_CHALK_FRIEZE_FAMILY, OVERGROWN_GOLD_CHALK_FRIEZE_FAMILY,
			CRACKED_GOLD_CHALK_FRIEZE_FAMILY, MOSSY_CRACKED_GOLD_CHALK_FRIEZE_FAMILY,
			OVERGROWN_CRACKED_GOLD_CHALK_FRIEZE_FAMILY, "chalk_frieze");

	public static Block COBBLED_CHALK_BRICKS = registerBlock("cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block COBBLED_CHALK_BRICK_STAIRS = registerBlock("cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block COBBLED_CHALK_BRICK_SLAB = registerBlock("cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block COBBLED_CHALK_BRICK_WALL = registerBlock("cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(COBBLED_CHALK_BRICKS)
			.stairs(COBBLED_CHALK_BRICK_STAIRS)
			.slab(COBBLED_CHALK_BRICK_SLAB)
			.wall(COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_COBBLED_CHALK_BRICKS = registerBlock("mossy_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_COBBLED_CHALK_BRICK_STAIRS = registerBlock("mossy_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_COBBLED_CHALK_BRICK_SLAB = registerBlock("mossy_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_COBBLED_CHALK_BRICK_WALL = registerBlock("mossy_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_COBBLED_CHALK_BRICKS)
			.stairs(MOSSY_COBBLED_CHALK_BRICK_STAIRS)
			.slab(MOSSY_COBBLED_CHALK_BRICK_SLAB)
			.wall(MOSSY_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_COBBLED_CHALK_BRICKS = registerBlock("overgrown_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_COBBLED_CHALK_BRICK_STAIRS = registerBlock("overgrown_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_COBBLED_CHALK_BRICK_SLAB = registerBlock("overgrown_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_COBBLED_CHALK_BRICK_WALL = registerBlock("overgrown_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_COBBLED_CHALK_BRICKS)
			.stairs(OVERGROWN_COBBLED_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_COBBLED_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_COBBLED_CHALK_BRICKS = registerBlock("cracked_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_COBBLED_CHALK_BRICK_STAIRS = registerBlock("cracked_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_COBBLED_CHALK_BRICK_SLAB = registerBlock("cracked_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_COBBLED_CHALK_BRICK_WALL = registerBlock("cracked_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_COBBLED_CHALK_BRICKS)
			.stairs(CRACKED_COBBLED_CHALK_BRICK_STAIRS)
			.slab(CRACKED_COBBLED_CHALK_BRICK_SLAB)
			.wall(CRACKED_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_COBBLED_CHALK_BRICKS = registerBlock("mossy_cracked_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_COBBLED_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_COBBLED_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_COBBLED_CHALK_BRICK_WALL = registerBlock("mossy_cracked_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_COBBLED_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_COBBLED_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_COBBLED_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_COBBLED_CHALK_BRICKS = registerBlock("overgrown_cracked_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_COBBLED_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_COBBLED_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_COBBLED_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_COBBLED_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_COBBLED_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_COBBLED_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block BRONZE_COBBLED_CHALK_BRICKS = registerBlock("bronze_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_COBBLED_CHALK_BRICK_STAIRS = registerBlock("bronze_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(BRONZE_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_COBBLED_CHALK_BRICK_SLAB = registerBlock("bronze_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_COBBLED_CHALK_BRICK_WALL = registerBlock("bronze_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(BRONZE_COBBLED_CHALK_BRICKS)
			.stairs(BRONZE_COBBLED_CHALK_BRICK_STAIRS)
			.slab(BRONZE_COBBLED_CHALK_BRICK_SLAB)
			.wall(BRONZE_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_BRONZE_COBBLED_CHALK_BRICKS = registerBlock("mossy_bronze_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_COBBLED_CHALK_BRICK_STAIRS = registerBlock("mossy_bronze_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_BRONZE_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_COBBLED_CHALK_BRICK_SLAB = registerBlock("mossy_bronze_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_COBBLED_CHALK_BRICK_WALL = registerBlock("mossy_bronze_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_BRONZE_COBBLED_CHALK_BRICKS)
			.stairs(MOSSY_BRONZE_COBBLED_CHALK_BRICK_STAIRS)
			.slab(MOSSY_BRONZE_COBBLED_CHALK_BRICK_SLAB)
			.wall(MOSSY_BRONZE_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_BRONZE_COBBLED_CHALK_BRICKS = registerBlock("overgrown_bronze_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_STAIRS = registerBlock("overgrown_bronze_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_BRONZE_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_SLAB = registerBlock("overgrown_bronze_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_WALL = registerBlock("overgrown_bronze_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_COBBLED_CHALK_BRICKS)
			.stairs(OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_BRONZE_COBBLED_CHALK_BRICKS = registerBlock("cracked_bronze_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_COBBLED_CHALK_BRICK_STAIRS = registerBlock("cracked_bronze_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_BRONZE_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_COBBLED_CHALK_BRICK_SLAB = registerBlock("cracked_bronze_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_COBBLED_CHALK_BRICK_WALL = registerBlock("cracked_bronze_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_BRONZE_COBBLED_CHALK_BRICKS)
			.stairs(CRACKED_BRONZE_COBBLED_CHALK_BRICK_STAIRS)
			.slab(CRACKED_BRONZE_COBBLED_CHALK_BRICK_SLAB)
			.wall(CRACKED_BRONZE_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_COBBLED_CHALK_BRICKS = registerBlock("mossy_cracked_bronze_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_COBBLED_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_bronze_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_BRONZE_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_COBBLED_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_bronze_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_COBBLED_CHALK_BRICK_WALL = registerBlock("mossy_cracked_bronze_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_COBBLED_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_BRONZE_COBBLED_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_BRONZE_COBBLED_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_BRONZE_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_COBBLED_CHALK_BRICKS = registerBlock("overgrown_cracked_bronze_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_COBBLED_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_bronze_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_BRONZE_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_COBBLED_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_bronze_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_COBBLED_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_bronze_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_COBBLED_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_BRONZE_COBBLED_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_BRONZE_COBBLED_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_BRONZE_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block SILVER_COBBLED_CHALK_BRICKS = registerBlock("silver_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_COBBLED_CHALK_BRICK_STAIRS = registerBlock("silver_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(SILVER_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_COBBLED_CHALK_BRICK_SLAB = registerBlock("silver_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_COBBLED_CHALK_BRICK_WALL = registerBlock("silver_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(SILVER_COBBLED_CHALK_BRICKS)
			.stairs(SILVER_COBBLED_CHALK_BRICK_STAIRS)
			.slab(SILVER_COBBLED_CHALK_BRICK_SLAB)
			.wall(SILVER_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_SILVER_COBBLED_CHALK_BRICKS = registerBlock("mossy_silver_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_COBBLED_CHALK_BRICK_STAIRS = registerBlock("mossy_silver_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_SILVER_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_COBBLED_CHALK_BRICK_SLAB = registerBlock("mossy_silver_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_COBBLED_CHALK_BRICK_WALL = registerBlock("mossy_silver_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_SILVER_COBBLED_CHALK_BRICKS)
			.stairs(MOSSY_SILVER_COBBLED_CHALK_BRICK_STAIRS)
			.slab(MOSSY_SILVER_COBBLED_CHALK_BRICK_SLAB)
			.wall(MOSSY_SILVER_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_SILVER_COBBLED_CHALK_BRICKS = registerBlock("overgrown_silver_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_COBBLED_CHALK_BRICK_STAIRS = registerBlock("overgrown_silver_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_SILVER_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_COBBLED_CHALK_BRICK_SLAB = registerBlock("overgrown_silver_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_COBBLED_CHALK_BRICK_WALL = registerBlock("overgrown_silver_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_COBBLED_CHALK_BRICKS)
			.stairs(OVERGROWN_SILVER_COBBLED_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_SILVER_COBBLED_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_SILVER_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_SILVER_COBBLED_CHALK_BRICKS = registerBlock("cracked_silver_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_COBBLED_CHALK_BRICK_STAIRS = registerBlock("cracked_silver_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_SILVER_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_COBBLED_CHALK_BRICK_SLAB = registerBlock("cracked_silver_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_COBBLED_CHALK_BRICK_WALL = registerBlock("cracked_silver_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_SILVER_COBBLED_CHALK_BRICKS)
			.stairs(CRACKED_SILVER_COBBLED_CHALK_BRICK_STAIRS)
			.slab(CRACKED_SILVER_COBBLED_CHALK_BRICK_SLAB)
			.wall(CRACKED_SILVER_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_SILVER_COBBLED_CHALK_BRICKS = registerBlock("mossy_cracked_silver_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_COBBLED_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_silver_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_SILVER_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_COBBLED_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_silver_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_COBBLED_CHALK_BRICK_WALL = registerBlock("mossy_cracked_silver_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_COBBLED_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_SILVER_COBBLED_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_SILVER_COBBLED_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_SILVER_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_COBBLED_CHALK_BRICKS = registerBlock("overgrown_cracked_silver_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_COBBLED_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_silver_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_SILVER_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_COBBLED_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_silver_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_COBBLED_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_silver_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_COBBLED_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_SILVER_COBBLED_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_SILVER_COBBLED_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_SILVER_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block GOLD_COBBLED_CHALK_BRICKS = registerBlock("gold_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_COBBLED_CHALK_BRICK_STAIRS = registerBlock("gold_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(GOLD_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_COBBLED_CHALK_BRICK_SLAB = registerBlock("gold_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_COBBLED_CHALK_BRICK_WALL = registerBlock("gold_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(GOLD_COBBLED_CHALK_BRICKS)
			.stairs(GOLD_COBBLED_CHALK_BRICK_STAIRS)
			.slab(GOLD_COBBLED_CHALK_BRICK_SLAB)
			.wall(GOLD_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_GOLD_COBBLED_CHALK_BRICKS = registerBlock("mossy_gold_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_COBBLED_CHALK_BRICK_STAIRS = registerBlock("mossy_gold_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_GOLD_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_COBBLED_CHALK_BRICK_SLAB = registerBlock("mossy_gold_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_COBBLED_CHALK_BRICK_WALL = registerBlock("mossy_gold_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_GOLD_COBBLED_CHALK_BRICKS)
			.stairs(MOSSY_GOLD_COBBLED_CHALK_BRICK_STAIRS)
			.slab(MOSSY_GOLD_COBBLED_CHALK_BRICK_SLAB)
			.wall(MOSSY_GOLD_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_GOLD_COBBLED_CHALK_BRICKS = registerBlock("overgrown_gold_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_COBBLED_CHALK_BRICK_STAIRS = registerBlock("overgrown_gold_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_GOLD_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_COBBLED_CHALK_BRICK_SLAB = registerBlock("overgrown_gold_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_COBBLED_CHALK_BRICK_WALL = registerBlock(
			"overgrown_gold_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_COBBLED_CHALK_BRICKS)
			.stairs(OVERGROWN_GOLD_COBBLED_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_GOLD_COBBLED_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_GOLD_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_GOLD_COBBLED_CHALK_BRICKS = registerBlock("cracked_gold_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_COBBLED_CHALK_BRICK_STAIRS = registerBlock("cracked_gold_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_GOLD_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_COBBLED_CHALK_BRICK_SLAB = registerBlock("cracked_gold_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_COBBLED_CHALK_BRICK_WALL = registerBlock("cracked_gold_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_GOLD_COBBLED_CHALK_BRICKS)
			.stairs(CRACKED_GOLD_COBBLED_CHALK_BRICK_STAIRS)
			.slab(CRACKED_GOLD_COBBLED_CHALK_BRICK_SLAB)
			.wall(CRACKED_GOLD_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_GOLD_COBBLED_CHALK_BRICKS = registerBlock("mossy_cracked_gold_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_COBBLED_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_gold_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GOLD_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_COBBLED_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_gold_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_COBBLED_CHALK_BRICK_WALL = registerBlock("mossy_cracked_gold_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_COBBLED_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_GOLD_COBBLED_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_GOLD_COBBLED_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_GOLD_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_COBBLED_CHALK_BRICKS = registerBlock("overgrown_cracked_gold_cobbled_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_COBBLED_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_gold_cobbled_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GOLD_COBBLED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_COBBLED_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_gold_cobbled_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_COBBLED_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_gold_cobbled_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_COBBLED_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_GOLD_COBBLED_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_GOLD_COBBLED_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_GOLD_COBBLED_CHALK_BRICK_WALL)
			.build();

	public static ModStoneSubSet COBBLED_CHALK_BRICK_SUBSET = new ModStoneSubSet(
			COBBLED_CHALK_BRICK_FAMILY,
			MOSSY_COBBLED_CHALK_BRICK_FAMILY,
			OVERGROWN_COBBLED_CHALK_BRICK_FAMILY,
			CRACKED_COBBLED_CHALK_BRICK_FAMILY, MOSSY_CRACKED_COBBLED_CHALK_BRICK_FAMILY, OVERGROWN_CRACKED_COBBLED_CHALK_BRICK_FAMILY,
			BRONZE_COBBLED_CHALK_BRICK_FAMILY, MOSSY_BRONZE_COBBLED_CHALK_BRICK_FAMILY, OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_FAMILY,
			CRACKED_BRONZE_COBBLED_CHALK_BRICK_FAMILY, MOSSY_CRACKED_BRONZE_COBBLED_CHALK_BRICK_FAMILY, OVERGROWN_CRACKED_BRONZE_COBBLED_CHALK_BRICK_FAMILY,
			SILVER_COBBLED_CHALK_BRICK_FAMILY, MOSSY_SILVER_COBBLED_CHALK_BRICK_FAMILY,
			OVERGROWN_SILVER_COBBLED_CHALK_BRICK_FAMILY,
			CRACKED_SILVER_COBBLED_CHALK_BRICK_FAMILY, MOSSY_CRACKED_SILVER_COBBLED_CHALK_BRICK_FAMILY, OVERGROWN_CRACKED_SILVER_COBBLED_CHALK_BRICK_FAMILY,
			GOLD_COBBLED_CHALK_BRICK_FAMILY, MOSSY_GOLD_COBBLED_CHALK_BRICK_FAMILY, OVERGROWN_GOLD_COBBLED_CHALK_BRICK_FAMILY,
			CRACKED_GOLD_COBBLED_CHALK_BRICK_FAMILY, MOSSY_CRACKED_GOLD_COBBLED_CHALK_BRICK_FAMILY,
			OVERGROWN_CRACKED_GOLD_COBBLED_CHALK_BRICK_FAMILY, "cobbled_chalk_brick");

	public static Block RUSTIC_CHALK_BRICKS = registerBlock("rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block RUSTIC_CHALK_BRICK_STAIRS = registerBlock("rustic_chalk_brick_stairs",
			settings -> new StairsBlock(RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block RUSTIC_CHALK_BRICK_SLAB = registerBlock("rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block RUSTIC_CHALK_BRICK_WALL = registerBlock("rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(RUSTIC_CHALK_BRICKS)
			.stairs(RUSTIC_CHALK_BRICK_STAIRS)
			.slab(RUSTIC_CHALK_BRICK_SLAB)
			.wall(RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_RUSTIC_CHALK_BRICKS = registerBlock("mossy_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("mossy_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_RUSTIC_CHALK_BRICK_SLAB = registerBlock("mossy_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_RUSTIC_CHALK_BRICK_WALL = registerBlock("mossy_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_RUSTIC_CHALK_BRICKS)
			.stairs(MOSSY_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(MOSSY_RUSTIC_CHALK_BRICK_SLAB)
			.wall(MOSSY_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_RUSTIC_CHALK_BRICKS = registerBlock("overgrown_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("overgrown_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_RUSTIC_CHALK_BRICK_SLAB = registerBlock("overgrown_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_RUSTIC_CHALK_BRICK_WALL = registerBlock("overgrown_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_RUSTIC_CHALK_BRICKS)
			.stairs(OVERGROWN_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_RUSTIC_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_RUSTIC_CHALK_BRICKS = registerBlock("cracked_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("cracked_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_RUSTIC_CHALK_BRICK_SLAB = registerBlock("cracked_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_RUSTIC_CHALK_BRICK_WALL = registerBlock("cracked_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_RUSTIC_CHALK_BRICKS)
			.stairs(CRACKED_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(CRACKED_RUSTIC_CHALK_BRICK_SLAB)
			.wall(CRACKED_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_RUSTIC_CHALK_BRICKS = registerBlock("mossy_cracked_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_RUSTIC_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_RUSTIC_CHALK_BRICK_WALL = registerBlock("mossy_cracked_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_RUSTIC_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_RUSTIC_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_RUSTIC_CHALK_BRICKS = registerBlock("overgrown_cracked_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_RUSTIC_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_RUSTIC_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_RUSTIC_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_RUSTIC_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block BRONZE_RUSTIC_CHALK_BRICKS = registerBlock("bronze_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("bronze_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(BRONZE_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_RUSTIC_CHALK_BRICK_SLAB = registerBlock("bronze_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_RUSTIC_CHALK_BRICK_WALL = registerBlock("bronze_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(BRONZE_RUSTIC_CHALK_BRICKS)
			.stairs(BRONZE_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(BRONZE_RUSTIC_CHALK_BRICK_SLAB)
			.wall(BRONZE_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_BRONZE_RUSTIC_CHALK_BRICKS = registerBlock("mossy_bronze_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("mossy_bronze_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_BRONZE_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_RUSTIC_CHALK_BRICK_SLAB = registerBlock("mossy_bronze_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_RUSTIC_CHALK_BRICK_WALL = registerBlock("mossy_bronze_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_BRONZE_RUSTIC_CHALK_BRICKS)
			.stairs(MOSSY_BRONZE_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(MOSSY_BRONZE_RUSTIC_CHALK_BRICK_SLAB)
			.wall(MOSSY_BRONZE_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_BRONZE_RUSTIC_CHALK_BRICKS = registerBlock("overgrown_bronze_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("overgrown_bronze_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_BRONZE_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_RUSTIC_CHALK_BRICK_SLAB = registerBlock("overgrown_bronze_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_RUSTIC_CHALK_BRICK_WALL = registerBlock("overgrown_bronze_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_RUSTIC_CHALK_BRICKS)
			.stairs(OVERGROWN_BRONZE_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_BRONZE_RUSTIC_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_BRONZE_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_BRONZE_RUSTIC_CHALK_BRICKS = registerBlock("cracked_bronze_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("cracked_bronze_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_BRONZE_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_RUSTIC_CHALK_BRICK_SLAB = registerBlock("cracked_bronze_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_RUSTIC_CHALK_BRICK_WALL = registerBlock("cracked_bronze_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_BRONZE_RUSTIC_CHALK_BRICKS)
			.stairs(CRACKED_BRONZE_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(CRACKED_BRONZE_RUSTIC_CHALK_BRICK_SLAB)
			.wall(CRACKED_BRONZE_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_RUSTIC_CHALK_BRICKS = registerBlock("mossy_cracked_bronze_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_bronze_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_BRONZE_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_bronze_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_WALL = registerBlock("mossy_cracked_bronze_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_RUSTIC_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_RUSTIC_CHALK_BRICKS = registerBlock("overgrown_cracked_bronze_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_bronze_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_BRONZE_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_bronze_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_bronze_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_RUSTIC_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block SILVER_RUSTIC_CHALK_BRICKS = registerBlock("silver_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("silver_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(SILVER_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_RUSTIC_CHALK_BRICK_SLAB = registerBlock("silver_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_RUSTIC_CHALK_BRICK_WALL = registerBlock("silver_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(SILVER_RUSTIC_CHALK_BRICKS)
			.stairs(SILVER_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(SILVER_RUSTIC_CHALK_BRICK_SLAB)
			.wall(SILVER_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_SILVER_RUSTIC_CHALK_BRICKS = registerBlock("mossy_silver_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("mossy_silver_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_SILVER_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_RUSTIC_CHALK_BRICK_SLAB = registerBlock("mossy_silver_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_RUSTIC_CHALK_BRICK_WALL = registerBlock("mossy_silver_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_SILVER_RUSTIC_CHALK_BRICKS)
			.stairs(MOSSY_SILVER_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(MOSSY_SILVER_RUSTIC_CHALK_BRICK_SLAB)
			.wall(MOSSY_SILVER_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_SILVER_RUSTIC_CHALK_BRICKS = registerBlock("overgrown_silver_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("overgrown_silver_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_SILVER_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_RUSTIC_CHALK_BRICK_SLAB = registerBlock("overgrown_silver_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_RUSTIC_CHALK_BRICK_WALL = registerBlock("overgrown_silver_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_RUSTIC_CHALK_BRICKS)
			.stairs(OVERGROWN_SILVER_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_SILVER_RUSTIC_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_SILVER_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_SILVER_RUSTIC_CHALK_BRICKS = registerBlock("cracked_silver_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("cracked_silver_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_SILVER_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_RUSTIC_CHALK_BRICK_SLAB = registerBlock("cracked_silver_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_RUSTIC_CHALK_BRICK_WALL = registerBlock("cracked_silver_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_SILVER_RUSTIC_CHALK_BRICKS)
			.stairs(CRACKED_SILVER_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(CRACKED_SILVER_RUSTIC_CHALK_BRICK_SLAB)
			.wall(CRACKED_SILVER_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_SILVER_RUSTIC_CHALK_BRICKS = registerBlock("mossy_cracked_silver_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_silver_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_SILVER_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_RUSTIC_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_silver_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_RUSTIC_CHALK_BRICK_WALL = registerBlock("mossy_cracked_silver_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_RUSTIC_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_SILVER_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_SILVER_RUSTIC_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_SILVER_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_RUSTIC_CHALK_BRICKS = registerBlock("overgrown_cracked_silver_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_silver_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_SILVER_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_RUSTIC_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_silver_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_RUSTIC_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_silver_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_RUSTIC_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_SILVER_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_SILVER_RUSTIC_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_SILVER_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block GOLD_RUSTIC_CHALK_BRICKS = registerBlock("gold_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("gold_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(GOLD_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_RUSTIC_CHALK_BRICK_SLAB = registerBlock("gold_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_RUSTIC_CHALK_BRICK_WALL = registerBlock("gold_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(GOLD_RUSTIC_CHALK_BRICKS)
			.stairs(GOLD_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(GOLD_RUSTIC_CHALK_BRICK_SLAB)
			.wall(GOLD_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_GOLD_RUSTIC_CHALK_BRICKS = registerBlock("mossy_gold_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("mossy_gold_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_GOLD_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_RUSTIC_CHALK_BRICK_SLAB = registerBlock("mossy_gold_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_RUSTIC_CHALK_BRICK_WALL = registerBlock("mossy_gold_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_GOLD_RUSTIC_CHALK_BRICKS)
			.stairs(MOSSY_GOLD_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(MOSSY_GOLD_RUSTIC_CHALK_BRICK_SLAB)
			.wall(MOSSY_GOLD_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_GOLD_RUSTIC_CHALK_BRICKS = registerBlock("overgrown_gold_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("overgrown_gold_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_GOLD_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_RUSTIC_CHALK_BRICK_SLAB = registerBlock("overgrown_gold_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_RUSTIC_CHALK_BRICK_WALL = registerBlock(
			"overgrown_gold_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_RUSTIC_CHALK_BRICKS)
			.stairs(OVERGROWN_GOLD_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_GOLD_RUSTIC_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_GOLD_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_GOLD_RUSTIC_CHALK_BRICKS = registerBlock("cracked_gold_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("cracked_gold_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_GOLD_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_RUSTIC_CHALK_BRICK_SLAB = registerBlock("cracked_gold_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_RUSTIC_CHALK_BRICK_WALL = registerBlock("cracked_gold_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_GOLD_RUSTIC_CHALK_BRICKS)
			.stairs(CRACKED_GOLD_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(CRACKED_GOLD_RUSTIC_CHALK_BRICK_SLAB)
			.wall(CRACKED_GOLD_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_GOLD_RUSTIC_CHALK_BRICKS = registerBlock("mossy_cracked_gold_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_gold_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GOLD_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_RUSTIC_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_gold_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_RUSTIC_CHALK_BRICK_WALL = registerBlock("mossy_cracked_gold_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_RUSTIC_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_GOLD_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_GOLD_RUSTIC_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_GOLD_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_RUSTIC_CHALK_BRICKS = registerBlock("overgrown_cracked_gold_rustic_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_RUSTIC_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_gold_rustic_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GOLD_RUSTIC_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_RUSTIC_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_gold_rustic_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_RUSTIC_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_gold_rustic_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_RUSTIC_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_RUSTIC_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_GOLD_RUSTIC_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_GOLD_RUSTIC_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_GOLD_RUSTIC_CHALK_BRICK_WALL)
			.build();

	public static ModStoneSubSet RUSTIC_CHALK_BRICK_SUBSET = new ModStoneSubSet(
			RUSTIC_CHALK_BRICK_FAMILY,
			MOSSY_RUSTIC_CHALK_BRICK_FAMILY,
			OVERGROWN_RUSTIC_CHALK_BRICK_FAMILY,
			CRACKED_RUSTIC_CHALK_BRICK_FAMILY, MOSSY_CRACKED_RUSTIC_CHALK_BRICK_FAMILY, OVERGROWN_CRACKED_RUSTIC_CHALK_BRICK_FAMILY,
			BRONZE_RUSTIC_CHALK_BRICK_FAMILY, MOSSY_BRONZE_RUSTIC_CHALK_BRICK_FAMILY, OVERGROWN_BRONZE_RUSTIC_CHALK_BRICK_FAMILY,
			CRACKED_BRONZE_RUSTIC_CHALK_BRICK_FAMILY, MOSSY_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_FAMILY, OVERGROWN_CRACKED_BRONZE_RUSTIC_CHALK_BRICK_FAMILY,
			SILVER_RUSTIC_CHALK_BRICK_FAMILY, MOSSY_SILVER_RUSTIC_CHALK_BRICK_FAMILY,
			OVERGROWN_SILVER_RUSTIC_CHALK_BRICK_FAMILY,
			CRACKED_SILVER_RUSTIC_CHALK_BRICK_FAMILY, MOSSY_CRACKED_SILVER_RUSTIC_CHALK_BRICK_FAMILY, OVERGROWN_CRACKED_SILVER_RUSTIC_CHALK_BRICK_FAMILY,
			GOLD_RUSTIC_CHALK_BRICK_FAMILY, MOSSY_GOLD_RUSTIC_CHALK_BRICK_FAMILY, OVERGROWN_GOLD_RUSTIC_CHALK_BRICK_FAMILY,
			CRACKED_GOLD_RUSTIC_CHALK_BRICK_FAMILY, MOSSY_CRACKED_GOLD_RUSTIC_CHALK_BRICK_FAMILY,
			OVERGROWN_CRACKED_GOLD_RUSTIC_CHALK_BRICK_FAMILY, "rustic_chalk_brick");

	public static Block CHALK_BRICKS = registerBlock("chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CHALK_BRICK_STAIRS = registerBlock("chalk_brick_stairs",
			settings -> new StairsBlock(CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CHALK_BRICK_SLAB = registerBlock("chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CHALK_BRICK_WALL = registerBlock("chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CHISELED_CHALK_BRICK = registerBlock("chiseled_chalk_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CHALK_BRICK_FAMILY = BlockFamilies.register(CHALK_BRICKS)
			.stairs(CHALK_BRICK_STAIRS)
			.slab(CHALK_BRICK_SLAB)
			.wall(CHALK_BRICK_WALL)
			.chiseled(CHISELED_CHALK_BRICK)
			.build();

	public static Block MOSSY_CHALK_BRICKS = registerBlock("mossy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CHALK_BRICK_STAIRS = registerBlock("mossy_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CHALK_BRICK_SLAB = registerBlock("mossy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CHALK_BRICK_WALL = registerBlock("mossy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CHALK_BRICKS)
			.stairs(MOSSY_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CHALK_BRICK_SLAB)
			.wall(MOSSY_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CHALK_BRICKS = registerBlock("overgrown_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CHALK_BRICK_STAIRS = registerBlock("overgrown_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CHALK_BRICK_SLAB = registerBlock("overgrown_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CHALK_BRICK_WALL = registerBlock("overgrown_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CHALK_BRICKS)
			.stairs(OVERGROWN_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_CHALK_BRICKS = registerBlock("cracked_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_CHALK_BRICK_STAIRS = registerBlock("cracked_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_CHALK_BRICK_SLAB = registerBlock("cracked_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_CHALK_BRICK_WALL = registerBlock("cracked_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_CHALK_BRICKS)
			.stairs(CRACKED_CHALK_BRICK_STAIRS)
			.slab(CRACKED_CHALK_BRICK_SLAB)
			.wall(CRACKED_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_CHALK_BRICKS = registerBlock("mossy_cracked_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_CHALK_BRICK_WALL = registerBlock("mossy_cracked_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_CHALK_BRICKS = registerBlock("overgrown_cracked_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_CHALK_BRICK_WALL)
			.build();

	public static Block BRONZE_CHALK_BRICKS = registerBlock("bronze_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_CHALK_BRICK_STAIRS = registerBlock("bronze_chalk_brick_stairs",
			settings -> new StairsBlock(BRONZE_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_CHALK_BRICK_SLAB = registerBlock("bronze_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_CHALK_BRICK_WALL = registerBlock("bronze_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_CHALK_BRICK_FAMILY = BlockFamilies.register(BRONZE_CHALK_BRICKS)
			.stairs(BRONZE_CHALK_BRICK_STAIRS)
			.slab(BRONZE_CHALK_BRICK_SLAB)
			.wall(BRONZE_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_BRONZE_CHALK_BRICKS = registerBlock("mossy_bronze_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_CHALK_BRICK_STAIRS = registerBlock("mossy_bronze_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_BRONZE_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_CHALK_BRICK_SLAB = registerBlock("mossy_bronze_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_CHALK_BRICK_WALL = registerBlock("mossy_bronze_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_BRONZE_CHALK_BRICKS)
			.stairs(MOSSY_BRONZE_CHALK_BRICK_STAIRS)
			.slab(MOSSY_BRONZE_CHALK_BRICK_SLAB)
			.wall(MOSSY_BRONZE_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_BRONZE_CHALK_BRICKS = registerBlock("overgrown_bronze_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_CHALK_BRICK_STAIRS = registerBlock("overgrown_bronze_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_BRONZE_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_CHALK_BRICK_SLAB = registerBlock("overgrown_bronze_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_CHALK_BRICK_WALL = registerBlock("overgrown_bronze_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_CHALK_BRICKS)
			.stairs(OVERGROWN_BRONZE_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_BRONZE_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_BRONZE_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_BRONZE_CHALK_BRICKS = registerBlock("cracked_bronze_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_CHALK_BRICK_STAIRS = registerBlock("cracked_bronze_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_BRONZE_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_CHALK_BRICK_SLAB = registerBlock("cracked_bronze_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_CHALK_BRICK_WALL = registerBlock("cracked_bronze_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_BRONZE_CHALK_BRICKS)
			.stairs(CRACKED_BRONZE_CHALK_BRICK_STAIRS)
			.slab(CRACKED_BRONZE_CHALK_BRICK_SLAB)
			.wall(CRACKED_BRONZE_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_CHALK_BRICKS = registerBlock("mossy_cracked_bronze_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_bronze_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_BRONZE_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_bronze_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_CHALK_BRICK_WALL = registerBlock("mossy_cracked_bronze_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_BRONZE_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_BRONZE_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_BRONZE_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_CHALK_BRICKS = registerBlock("overgrown_cracked_bronze_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_bronze_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_BRONZE_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_bronze_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_bronze_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_BRONZE_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_BRONZE_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_BRONZE_CHALK_BRICK_WALL)
			.build();

	public static Block SILVER_CHALK_BRICKS = registerBlock("silver_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_CHALK_BRICK_STAIRS = registerBlock("silver_chalk_brick_stairs",
			settings -> new StairsBlock(SILVER_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_CHALK_BRICK_SLAB = registerBlock("silver_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_CHALK_BRICK_WALL = registerBlock("silver_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_CHALK_BRICK_FAMILY = BlockFamilies.register(SILVER_CHALK_BRICKS)
			.stairs(SILVER_CHALK_BRICK_STAIRS)
			.slab(SILVER_CHALK_BRICK_SLAB)
			.wall(SILVER_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_SILVER_CHALK_BRICKS = registerBlock("mossy_silver_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_CHALK_BRICK_STAIRS = registerBlock("mossy_silver_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_SILVER_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_CHALK_BRICK_SLAB = registerBlock("mossy_silver_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_CHALK_BRICK_WALL = registerBlock("mossy_silver_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_SILVER_CHALK_BRICKS)
			.stairs(MOSSY_SILVER_CHALK_BRICK_STAIRS)
			.slab(MOSSY_SILVER_CHALK_BRICK_SLAB)
			.wall(MOSSY_SILVER_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_SILVER_CHALK_BRICKS = registerBlock("overgrown_silver_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_CHALK_BRICK_STAIRS = registerBlock("overgrown_silver_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_SILVER_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_CHALK_BRICK_SLAB = registerBlock("overgrown_silver_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_CHALK_BRICK_WALL = registerBlock("overgrown_silver_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_CHALK_BRICKS)
			.stairs(OVERGROWN_SILVER_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_SILVER_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_SILVER_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_SILVER_CHALK_BRICKS = registerBlock("cracked_silver_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_CHALK_BRICK_STAIRS = registerBlock("cracked_silver_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_SILVER_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_CHALK_BRICK_SLAB = registerBlock("cracked_silver_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_CHALK_BRICK_WALL = registerBlock("cracked_silver_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_SILVER_CHALK_BRICKS)
			.stairs(CRACKED_SILVER_CHALK_BRICK_STAIRS)
			.slab(CRACKED_SILVER_CHALK_BRICK_SLAB)
			.wall(CRACKED_SILVER_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_SILVER_CHALK_BRICKS = registerBlock("mossy_cracked_silver_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_silver_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_SILVER_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_silver_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_CHALK_BRICK_WALL = registerBlock("mossy_cracked_silver_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_SILVER_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_SILVER_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_SILVER_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_CHALK_BRICKS = registerBlock("overgrown_cracked_silver_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_silver_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_SILVER_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_silver_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_silver_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_SILVER_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_SILVER_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_SILVER_CHALK_BRICK_WALL)
			.build();

	public static Block GOLD_CHALK_BRICKS = registerBlock("gold_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_CHALK_BRICK_STAIRS = registerBlock("gold_chalk_brick_stairs",
			settings -> new StairsBlock(GOLD_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_CHALK_BRICK_SLAB = registerBlock("gold_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_CHALK_BRICK_WALL = registerBlock("gold_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_CHALK_BRICK_FAMILY = BlockFamilies.register(GOLD_CHALK_BRICKS)
			.stairs(GOLD_CHALK_BRICK_STAIRS)
			.slab(GOLD_CHALK_BRICK_SLAB)
			.wall(GOLD_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_GOLD_CHALK_BRICKS = registerBlock("mossy_gold_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_CHALK_BRICK_STAIRS = registerBlock("mossy_gold_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_GOLD_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_CHALK_BRICK_SLAB = registerBlock("mossy_gold_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_CHALK_BRICK_WALL = registerBlock("mossy_gold_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_GOLD_CHALK_BRICKS)
			.stairs(MOSSY_GOLD_CHALK_BRICK_STAIRS)
			.slab(MOSSY_GOLD_CHALK_BRICK_SLAB)
			.wall(MOSSY_GOLD_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_GOLD_CHALK_BRICKS = registerBlock("overgrown_gold_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_CHALK_BRICK_STAIRS = registerBlock("overgrown_gold_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_GOLD_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_CHALK_BRICK_SLAB = registerBlock("overgrown_gold_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_CHALK_BRICK_WALL = registerBlock("overgrown_gold_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_CHALK_BRICKS)
			.stairs(OVERGROWN_GOLD_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_GOLD_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_GOLD_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_GOLD_CHALK_BRICKS = registerBlock("cracked_gold_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_CHALK_BRICK_STAIRS = registerBlock("cracked_gold_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_GOLD_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_CHALK_BRICK_SLAB = registerBlock("cracked_gold_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_CHALK_BRICK_WALL = registerBlock("cracked_gold_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_GOLD_CHALK_BRICKS)
			.stairs(CRACKED_GOLD_CHALK_BRICK_STAIRS)
			.slab(CRACKED_GOLD_CHALK_BRICK_SLAB)
			.wall(CRACKED_GOLD_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_GOLD_CHALK_BRICKS = registerBlock("mossy_cracked_gold_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_gold_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GOLD_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_gold_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_CHALK_BRICK_WALL = registerBlock("mossy_cracked_gold_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_GOLD_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_GOLD_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_GOLD_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_CHALK_BRICKS = registerBlock("overgrown_cracked_gold_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_gold_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GOLD_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_gold_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_gold_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_GOLD_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_GOLD_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_GOLD_CHALK_BRICK_WALL)
			.build();

	public static ModStoneSubSet CHALK_BRICK_SUBSET = new ModStoneSubSet(
			CHALK_BRICK_FAMILY,
			MOSSY_CHALK_BRICK_FAMILY,
			OVERGROWN_CHALK_BRICK_FAMILY,
			CRACKED_CHALK_BRICK_FAMILY, MOSSY_CRACKED_CHALK_BRICK_FAMILY, OVERGROWN_CRACKED_CHALK_BRICK_FAMILY,
			BRONZE_CHALK_BRICK_FAMILY, MOSSY_BRONZE_CHALK_BRICK_FAMILY, OVERGROWN_BRONZE_CHALK_BRICK_FAMILY,
			CRACKED_BRONZE_CHALK_BRICK_FAMILY, MOSSY_CRACKED_BRONZE_CHALK_BRICK_FAMILY, OVERGROWN_CRACKED_BRONZE_CHALK_BRICK_FAMILY,
			SILVER_CHALK_BRICK_FAMILY, MOSSY_SILVER_CHALK_BRICK_FAMILY,
			OVERGROWN_SILVER_CHALK_BRICK_FAMILY,
			CRACKED_SILVER_CHALK_BRICK_FAMILY, MOSSY_CRACKED_SILVER_CHALK_BRICK_FAMILY, OVERGROWN_CRACKED_SILVER_CHALK_BRICK_FAMILY,
			GOLD_CHALK_BRICK_FAMILY, MOSSY_GOLD_CHALK_BRICK_FAMILY, OVERGROWN_GOLD_CHALK_BRICK_FAMILY,
			CRACKED_GOLD_CHALK_BRICK_FAMILY, MOSSY_CRACKED_GOLD_CHALK_BRICK_FAMILY,
			OVERGROWN_CRACKED_GOLD_CHALK_BRICK_FAMILY, "chalk_brick");

	public static Block CHALK_TILES = registerBlock("chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CHALK_TILE_STAIRS = registerBlock("chalk_tile_stairs",
			settings -> new StairsBlock(CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CHALK_TILE_SLAB = registerBlock("chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CHALK_TILE_WALL = registerBlock("chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CHALK_TILE_FAMILY = BlockFamilies.register(CHALK_TILES)
			.stairs(CHALK_TILE_STAIRS)
			.slab(CHALK_TILE_SLAB)
			.wall(CHALK_TILE_WALL)
			.build();

	public static Block MOSSY_CHALK_TILES = registerBlock("mossy_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CHALK_TILE_STAIRS = registerBlock("mossy_chalk_tile_stairs",
			settings -> new StairsBlock(MOSSY_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CHALK_TILE_SLAB = registerBlock("mossy_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CHALK_TILE_WALL = registerBlock("mossy_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CHALK_TILE_FAMILY = BlockFamilies.register(MOSSY_CHALK_TILES)
			.stairs(MOSSY_CHALK_TILE_STAIRS)
			.slab(MOSSY_CHALK_TILE_SLAB)
			.wall(MOSSY_CHALK_TILE_WALL)
			.build();

	public static Block OVERGROWN_CHALK_TILES = registerBlock("overgrown_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CHALK_TILE_STAIRS = registerBlock("overgrown_chalk_tile_stairs",
			settings -> new StairsBlock(OVERGROWN_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CHALK_TILE_SLAB = registerBlock("overgrown_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CHALK_TILE_WALL = registerBlock("overgrown_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CHALK_TILE_FAMILY = BlockFamilies.register(OVERGROWN_CHALK_TILES)
			.stairs(OVERGROWN_CHALK_TILE_STAIRS)
			.slab(OVERGROWN_CHALK_TILE_SLAB)
			.wall(OVERGROWN_CHALK_TILE_WALL)
			.build();

	public static Block CRACKED_CHALK_TILES = registerBlock("cracked_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_CHALK_TILE_STAIRS = registerBlock("cracked_chalk_tile_stairs",
			settings -> new StairsBlock(CRACKED_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_CHALK_TILE_SLAB = registerBlock("cracked_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_CHALK_TILE_WALL = registerBlock("cracked_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_CHALK_TILE_FAMILY = BlockFamilies.register(CRACKED_CHALK_TILES)
			.stairs(CRACKED_CHALK_TILE_STAIRS)
			.slab(CRACKED_CHALK_TILE_SLAB)
			.wall(CRACKED_CHALK_TILE_WALL)
			.build();

	public static Block MOSSY_CRACKED_CHALK_TILES = registerBlock("mossy_cracked_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_CHALK_TILE_STAIRS = registerBlock("mossy_cracked_chalk_tile_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_CHALK_TILE_SLAB = registerBlock("mossy_cracked_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_CHALK_TILE_WALL = registerBlock("mossy_cracked_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_CHALK_TILE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_CHALK_TILES)
			.stairs(MOSSY_CRACKED_CHALK_TILE_STAIRS)
			.slab(MOSSY_CRACKED_CHALK_TILE_SLAB)
			.wall(MOSSY_CRACKED_CHALK_TILE_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_CHALK_TILES = registerBlock("overgrown_cracked_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_CHALK_TILE_STAIRS = registerBlock("overgrown_cracked_chalk_tile_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_CHALK_TILE_SLAB = registerBlock("overgrown_cracked_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_CHALK_TILE_WALL = registerBlock("overgrown_cracked_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_CHALK_TILE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_CHALK_TILES)
			.stairs(OVERGROWN_CRACKED_CHALK_TILE_STAIRS)
			.slab(OVERGROWN_CRACKED_CHALK_TILE_SLAB)
			.wall(OVERGROWN_CRACKED_CHALK_TILE_WALL)
			.build();

	public static Block BRONZE_CHALK_TILES = registerBlock("bronze_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_CHALK_TILE_STAIRS = registerBlock("bronze_chalk_tile_stairs",
			settings -> new StairsBlock(BRONZE_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_CHALK_TILE_SLAB = registerBlock("bronze_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_CHALK_TILE_WALL = registerBlock("bronze_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_CHALK_TILE_FAMILY = BlockFamilies.register(BRONZE_CHALK_TILES)
			.stairs(BRONZE_CHALK_TILE_STAIRS)
			.slab(BRONZE_CHALK_TILE_SLAB)
			.wall(BRONZE_CHALK_TILE_WALL)
			.build();

	public static Block MOSSY_BRONZE_CHALK_TILES = registerBlock("mossy_bronze_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_CHALK_TILE_STAIRS = registerBlock("mossy_bronze_chalk_tile_stairs",
			settings -> new StairsBlock(MOSSY_BRONZE_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_CHALK_TILE_SLAB = registerBlock("mossy_bronze_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_CHALK_TILE_WALL = registerBlock("mossy_bronze_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_CHALK_TILE_FAMILY = BlockFamilies.register(MOSSY_BRONZE_CHALK_TILES)
			.stairs(MOSSY_BRONZE_CHALK_TILE_STAIRS)
			.slab(MOSSY_BRONZE_CHALK_TILE_SLAB)
			.wall(MOSSY_BRONZE_CHALK_TILE_WALL)
			.build();

	public static Block OVERGROWN_BRONZE_CHALK_TILES = registerBlock("overgrown_bronze_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_CHALK_TILE_STAIRS = registerBlock("overgrown_bronze_chalk_tile_stairs",
			settings -> new StairsBlock(OVERGROWN_BRONZE_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_CHALK_TILE_SLAB = registerBlock("overgrown_bronze_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_CHALK_TILE_WALL = registerBlock("overgrown_bronze_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_CHALK_TILE_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_CHALK_TILES)
			.stairs(OVERGROWN_BRONZE_CHALK_TILE_STAIRS)
			.slab(OVERGROWN_BRONZE_CHALK_TILE_SLAB)
			.wall(OVERGROWN_BRONZE_CHALK_TILE_WALL)
			.build();

	public static Block CRACKED_BRONZE_CHALK_TILES = registerBlock("cracked_bronze_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_CHALK_TILE_STAIRS = registerBlock("cracked_bronze_chalk_tile_stairs",
			settings -> new StairsBlock(CRACKED_BRONZE_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_CHALK_TILE_SLAB = registerBlock("cracked_bronze_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_CHALK_TILE_WALL = registerBlock("cracked_bronze_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_CHALK_TILE_FAMILY = BlockFamilies.register(CRACKED_BRONZE_CHALK_TILES)
			.stairs(CRACKED_BRONZE_CHALK_TILE_STAIRS)
			.slab(CRACKED_BRONZE_CHALK_TILE_SLAB)
			.wall(CRACKED_BRONZE_CHALK_TILE_WALL)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_CHALK_TILES = registerBlock("mossy_cracked_bronze_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_CHALK_TILE_STAIRS = registerBlock("mossy_cracked_bronze_chalk_tile_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_BRONZE_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_CHALK_TILE_SLAB = registerBlock("mossy_cracked_bronze_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_CHALK_TILE_WALL = registerBlock("mossy_cracked_bronze_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_CHALK_TILE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_CHALK_TILES)
			.stairs(MOSSY_CRACKED_BRONZE_CHALK_TILE_STAIRS)
			.slab(MOSSY_CRACKED_BRONZE_CHALK_TILE_SLAB)
			.wall(MOSSY_CRACKED_BRONZE_CHALK_TILE_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_CHALK_TILES = registerBlock("overgrown_cracked_bronze_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_CHALK_TILE_STAIRS = registerBlock("overgrown_cracked_bronze_chalk_tile_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_BRONZE_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_CHALK_TILE_SLAB = registerBlock("overgrown_cracked_bronze_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_CHALK_TILE_WALL = registerBlock("overgrown_cracked_bronze_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_CHALK_TILE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_CHALK_TILES)
			.stairs(OVERGROWN_CRACKED_BRONZE_CHALK_TILE_STAIRS)
			.slab(OVERGROWN_CRACKED_BRONZE_CHALK_TILE_SLAB)
			.wall(OVERGROWN_CRACKED_BRONZE_CHALK_TILE_WALL)
			.build();

	public static Block SILVER_CHALK_TILES = registerBlock("silver_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_CHALK_TILE_STAIRS = registerBlock("silver_chalk_tile_stairs",
			settings -> new StairsBlock(SILVER_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_CHALK_TILE_SLAB = registerBlock("silver_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_CHALK_TILE_WALL = registerBlock("silver_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_CHALK_TILE_FAMILY = BlockFamilies.register(SILVER_CHALK_TILES)
			.stairs(SILVER_CHALK_TILE_STAIRS)
			.slab(SILVER_CHALK_TILE_SLAB)
			.wall(SILVER_CHALK_TILE_WALL)
			.build();

	public static Block MOSSY_SILVER_CHALK_TILES = registerBlock("mossy_silver_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_CHALK_TILE_STAIRS = registerBlock("mossy_silver_chalk_tile_stairs",
			settings -> new StairsBlock(MOSSY_SILVER_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_CHALK_TILE_SLAB = registerBlock("mossy_silver_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_CHALK_TILE_WALL = registerBlock("mossy_silver_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_CHALK_TILE_FAMILY = BlockFamilies.register(MOSSY_SILVER_CHALK_TILES)
			.stairs(MOSSY_SILVER_CHALK_TILE_STAIRS)
			.slab(MOSSY_SILVER_CHALK_TILE_SLAB)
			.wall(MOSSY_SILVER_CHALK_TILE_WALL)
			.build();

	public static Block OVERGROWN_SILVER_CHALK_TILES = registerBlock("overgrown_silver_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_CHALK_TILE_STAIRS = registerBlock("overgrown_silver_chalk_tile_stairs",
			settings -> new StairsBlock(OVERGROWN_SILVER_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_CHALK_TILE_SLAB = registerBlock("overgrown_silver_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_CHALK_TILE_WALL = registerBlock("overgrown_silver_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_CHALK_TILE_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_CHALK_TILES)
			.stairs(OVERGROWN_SILVER_CHALK_TILE_STAIRS)
			.slab(OVERGROWN_SILVER_CHALK_TILE_SLAB)
			.wall(OVERGROWN_SILVER_CHALK_TILE_WALL)
			.build();

	public static Block CRACKED_SILVER_CHALK_TILES = registerBlock("cracked_silver_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_CHALK_TILE_STAIRS = registerBlock("cracked_silver_chalk_tile_stairs",
			settings -> new StairsBlock(CRACKED_SILVER_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_CHALK_TILE_SLAB = registerBlock("cracked_silver_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_CHALK_TILE_WALL = registerBlock("cracked_silver_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_CHALK_TILE_FAMILY = BlockFamilies.register(CRACKED_SILVER_CHALK_TILES)
			.stairs(CRACKED_SILVER_CHALK_TILE_STAIRS)
			.slab(CRACKED_SILVER_CHALK_TILE_SLAB)
			.wall(CRACKED_SILVER_CHALK_TILE_WALL)
			.build();

	public static Block MOSSY_CRACKED_SILVER_CHALK_TILES = registerBlock("mossy_cracked_silver_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_CHALK_TILE_STAIRS = registerBlock("mossy_cracked_silver_chalk_tile_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_SILVER_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_CHALK_TILE_SLAB = registerBlock("mossy_cracked_silver_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_CHALK_TILE_WALL = registerBlock("mossy_cracked_silver_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_CHALK_TILE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_CHALK_TILES)
			.stairs(MOSSY_CRACKED_SILVER_CHALK_TILE_STAIRS)
			.slab(MOSSY_CRACKED_SILVER_CHALK_TILE_SLAB)
			.wall(MOSSY_CRACKED_SILVER_CHALK_TILE_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_CHALK_TILES = registerBlock("overgrown_cracked_silver_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_CHALK_TILE_STAIRS = registerBlock("overgrown_cracked_silver_chalk_tile_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_SILVER_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_CHALK_TILE_SLAB = registerBlock("overgrown_cracked_silver_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_CHALK_TILE_WALL = registerBlock("overgrown_cracked_silver_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_CHALK_TILE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_CHALK_TILES)
			.stairs(OVERGROWN_CRACKED_SILVER_CHALK_TILE_STAIRS)
			.slab(OVERGROWN_CRACKED_SILVER_CHALK_TILE_SLAB)
			.wall(OVERGROWN_CRACKED_SILVER_CHALK_TILE_WALL)
			.build();

	public static Block GOLD_CHALK_TILES = registerBlock("gold_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_CHALK_TILE_STAIRS = registerBlock("gold_chalk_tile_stairs",
			settings -> new StairsBlock(GOLD_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_CHALK_TILE_SLAB = registerBlock("gold_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_CHALK_TILE_WALL = registerBlock("gold_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_CHALK_TILE_FAMILY = BlockFamilies.register(GOLD_CHALK_TILES)
			.stairs(GOLD_CHALK_TILE_STAIRS)
			.slab(GOLD_CHALK_TILE_SLAB)
			.wall(GOLD_CHALK_TILE_WALL)
			.build();

	public static Block MOSSY_GOLD_CHALK_TILES = registerBlock("mossy_gold_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_CHALK_TILE_STAIRS = registerBlock("mossy_gold_chalk_tile_stairs",
			settings -> new StairsBlock(MOSSY_GOLD_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_CHALK_TILE_SLAB = registerBlock("mossy_gold_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_CHALK_TILE_WALL = registerBlock("mossy_gold_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_CHALK_TILE_FAMILY = BlockFamilies.register(MOSSY_GOLD_CHALK_TILES)
			.stairs(MOSSY_GOLD_CHALK_TILE_STAIRS)
			.slab(MOSSY_GOLD_CHALK_TILE_SLAB)
			.wall(MOSSY_GOLD_CHALK_TILE_WALL)
			.build();

	public static Block OVERGROWN_GOLD_CHALK_TILES = registerBlock("overgrown_gold_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_CHALK_TILE_STAIRS = registerBlock("overgrown_gold_chalk_tile_stairs",
			settings -> new StairsBlock(OVERGROWN_GOLD_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_CHALK_TILE_SLAB = registerBlock("overgrown_gold_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_CHALK_TILE_WALL = registerBlock("overgrown_gold_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_CHALK_TILE_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_CHALK_TILES)
			.stairs(OVERGROWN_GOLD_CHALK_TILE_STAIRS)
			.slab(OVERGROWN_GOLD_CHALK_TILE_SLAB)
			.wall(OVERGROWN_GOLD_CHALK_TILE_WALL)
			.build();

	public static Block CRACKED_GOLD_CHALK_TILES = registerBlock("cracked_gold_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_CHALK_TILE_STAIRS = registerBlock("cracked_gold_chalk_tile_stairs",
			settings -> new StairsBlock(CRACKED_GOLD_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_CHALK_TILE_SLAB = registerBlock("cracked_gold_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_CHALK_TILE_WALL = registerBlock("cracked_gold_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_CHALK_TILE_FAMILY = BlockFamilies.register(CRACKED_GOLD_CHALK_TILES)
			.stairs(CRACKED_GOLD_CHALK_TILE_STAIRS)
			.slab(CRACKED_GOLD_CHALK_TILE_SLAB)
			.wall(CRACKED_GOLD_CHALK_TILE_WALL)
			.build();

	public static Block MOSSY_CRACKED_GOLD_CHALK_TILES = registerBlock("mossy_cracked_gold_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_CHALK_TILE_STAIRS = registerBlock("mossy_cracked_gold_chalk_tile_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GOLD_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_CHALK_TILE_SLAB = registerBlock("mossy_cracked_gold_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_CHALK_TILE_WALL = registerBlock("mossy_cracked_gold_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_CHALK_TILE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_CHALK_TILES)
			.stairs(MOSSY_CRACKED_GOLD_CHALK_TILE_STAIRS)
			.slab(MOSSY_CRACKED_GOLD_CHALK_TILE_SLAB)
			.wall(MOSSY_CRACKED_GOLD_CHALK_TILE_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_CHALK_TILES = registerBlock("overgrown_cracked_gold_chalk_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_CHALK_TILE_STAIRS = registerBlock("overgrown_cracked_gold_chalk_tile_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GOLD_CHALK_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_CHALK_TILE_SLAB = registerBlock("overgrown_cracked_gold_chalk_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_CHALK_TILE_WALL = registerBlock("overgrown_cracked_gold_chalk_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_CHALK_TILE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_CHALK_TILES)
			.stairs(OVERGROWN_CRACKED_GOLD_CHALK_TILE_STAIRS)
			.slab(OVERGROWN_CRACKED_GOLD_CHALK_TILE_SLAB)
			.wall(OVERGROWN_CRACKED_GOLD_CHALK_TILE_WALL)
			.build();

	public static ModStoneSubSet CHALK_TILE_SUBSET = new ModStoneSubSet(
			CHALK_TILE_FAMILY,
			MOSSY_CHALK_TILE_FAMILY,
			OVERGROWN_CHALK_TILE_FAMILY,
			CRACKED_CHALK_TILE_FAMILY, MOSSY_CRACKED_CHALK_TILE_FAMILY, OVERGROWN_CRACKED_CHALK_TILE_FAMILY,
			BRONZE_CHALK_TILE_FAMILY, MOSSY_BRONZE_CHALK_TILE_FAMILY, OVERGROWN_BRONZE_CHALK_TILE_FAMILY,
			CRACKED_BRONZE_CHALK_TILE_FAMILY, MOSSY_CRACKED_BRONZE_CHALK_TILE_FAMILY, OVERGROWN_CRACKED_BRONZE_CHALK_TILE_FAMILY,
			SILVER_CHALK_TILE_FAMILY, MOSSY_SILVER_CHALK_TILE_FAMILY,
			OVERGROWN_SILVER_CHALK_TILE_FAMILY,
			CRACKED_SILVER_CHALK_TILE_FAMILY, MOSSY_CRACKED_SILVER_CHALK_TILE_FAMILY, OVERGROWN_CRACKED_SILVER_CHALK_TILE_FAMILY,
			GOLD_CHALK_TILE_FAMILY, MOSSY_GOLD_CHALK_TILE_FAMILY, OVERGROWN_GOLD_CHALK_TILE_FAMILY,
			CRACKED_GOLD_CHALK_TILE_FAMILY, MOSSY_CRACKED_GOLD_CHALK_TILE_FAMILY,
			OVERGROWN_CRACKED_GOLD_CHALK_TILE_FAMILY, "chalk_tile");

	public static Block CHALK_PAVEMENT = registerBlock("chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CHALK_PAVEMENT_STAIRS = registerBlock("chalk_pavement_stairs",
			settings -> new StairsBlock(CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CHALK_PAVEMENT_SLAB = registerBlock("chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CHALK_PAVEMENT_FAMILY = BlockFamilies.register(CHALK_PAVEMENT)
			.stairs(CHALK_PAVEMENT_STAIRS)
			.slab(CHALK_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_CHALK_PAVEMENT = registerBlock("mossy_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CHALK_PAVEMENT_STAIRS = registerBlock("mossy_chalk_pavement_stairs",
			settings -> new StairsBlock(MOSSY_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CHALK_PAVEMENT_SLAB = registerBlock("mossy_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_CHALK_PAVEMENT)
			.stairs(MOSSY_CHALK_PAVEMENT_STAIRS)
			.slab(MOSSY_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_CHALK_PAVEMENT = registerBlock("overgrown_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CHALK_PAVEMENT_STAIRS = registerBlock("overgrown_chalk_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CHALK_PAVEMENT_SLAB = registerBlock("overgrown_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_CHALK_PAVEMENT)
			.stairs(OVERGROWN_CHALK_PAVEMENT_STAIRS)
			.slab(OVERGROWN_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block CRACKED_CHALK_PAVEMENT = registerBlock("cracked_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_CHALK_PAVEMENT_STAIRS = registerBlock("cracked_chalk_pavement_stairs",
			settings -> new StairsBlock(CRACKED_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_CHALK_PAVEMENT_SLAB = registerBlock("cracked_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_CHALK_PAVEMENT)
			.stairs(CRACKED_CHALK_PAVEMENT_STAIRS)
			.slab(CRACKED_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_CRACKED_CHALK_PAVEMENT = registerBlock("mossy_cracked_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_CHALK_PAVEMENT_STAIRS = registerBlock("mossy_cracked_chalk_pavement_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_CHALK_PAVEMENT_SLAB = registerBlock("mossy_cracked_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_CRACKED_CHALK_PAVEMENT)
			.stairs(MOSSY_CRACKED_CHALK_PAVEMENT_STAIRS)
			.slab(MOSSY_CRACKED_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_CHALK_PAVEMENT = registerBlock("overgrown_cracked_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_CHALK_PAVEMENT_STAIRS = registerBlock("overgrown_cracked_chalk_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_CHALK_PAVEMENT_SLAB = registerBlock("overgrown_cracked_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_CHALK_PAVEMENT)
			.stairs(OVERGROWN_CRACKED_CHALK_PAVEMENT_STAIRS)
			.slab(OVERGROWN_CRACKED_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block BRONZE_CHALK_PAVEMENT = registerBlock("bronze_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_CHALK_PAVEMENT_STAIRS = registerBlock("bronze_chalk_pavement_stairs",
			settings -> new StairsBlock(BRONZE_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_CHALK_PAVEMENT_SLAB = registerBlock("bronze_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(BRONZE_CHALK_PAVEMENT)
			.stairs(BRONZE_CHALK_PAVEMENT_STAIRS)
			.slab(BRONZE_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_BRONZE_CHALK_PAVEMENT = registerBlock("mossy_bronze_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_CHALK_PAVEMENT_STAIRS = registerBlock("mossy_bronze_chalk_pavement_stairs",
			settings -> new StairsBlock(MOSSY_BRONZE_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_CHALK_PAVEMENT_SLAB = registerBlock("mossy_bronze_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_BRONZE_CHALK_PAVEMENT)
			.stairs(MOSSY_BRONZE_CHALK_PAVEMENT_STAIRS)
			.slab(MOSSY_BRONZE_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_BRONZE_CHALK_PAVEMENT = registerBlock("overgrown_bronze_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_CHALK_PAVEMENT_STAIRS = registerBlock("overgrown_bronze_chalk_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_BRONZE_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_CHALK_PAVEMENT_SLAB = registerBlock("overgrown_bronze_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_CHALK_PAVEMENT)
			.stairs(OVERGROWN_BRONZE_CHALK_PAVEMENT_STAIRS)
			.slab(OVERGROWN_BRONZE_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block CRACKED_BRONZE_CHALK_PAVEMENT = registerBlock("cracked_bronze_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_CHALK_PAVEMENT_STAIRS = registerBlock("cracked_bronze_chalk_pavement_stairs",
			settings -> new StairsBlock(CRACKED_BRONZE_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_CHALK_PAVEMENT_SLAB = registerBlock("cracked_bronze_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_BRONZE_CHALK_PAVEMENT)
			.stairs(CRACKED_BRONZE_CHALK_PAVEMENT_STAIRS)
			.slab(CRACKED_BRONZE_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_CHALK_PAVEMENT = registerBlock("mossy_cracked_bronze_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_CHALK_PAVEMENT_STAIRS = registerBlock("mossy_cracked_bronze_chalk_pavement_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_BRONZE_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_CHALK_PAVEMENT_SLAB = registerBlock("mossy_cracked_bronze_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_CHALK_PAVEMENT)
			.stairs(MOSSY_CRACKED_BRONZE_CHALK_PAVEMENT_STAIRS)
			.slab(MOSSY_CRACKED_BRONZE_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_CHALK_PAVEMENT = registerBlock("overgrown_cracked_bronze_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_CHALK_PAVEMENT_STAIRS = registerBlock("overgrown_cracked_bronze_chalk_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_BRONZE_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_CHALK_PAVEMENT_SLAB = registerBlock("overgrown_cracked_bronze_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_CHALK_PAVEMENT)
			.stairs(OVERGROWN_CRACKED_BRONZE_CHALK_PAVEMENT_STAIRS)
			.slab(OVERGROWN_CRACKED_BRONZE_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block SILVER_CHALK_PAVEMENT = registerBlock("silver_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_CHALK_PAVEMENT_STAIRS = registerBlock("silver_chalk_pavement_stairs",
			settings -> new StairsBlock(SILVER_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_CHALK_PAVEMENT_SLAB = registerBlock("silver_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(SILVER_CHALK_PAVEMENT)
			.stairs(SILVER_CHALK_PAVEMENT_STAIRS)
			.slab(SILVER_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_SILVER_CHALK_PAVEMENT = registerBlock("mossy_silver_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_CHALK_PAVEMENT_STAIRS = registerBlock("mossy_silver_chalk_pavement_stairs",
			settings -> new StairsBlock(MOSSY_SILVER_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_CHALK_PAVEMENT_SLAB = registerBlock("mossy_silver_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_SILVER_CHALK_PAVEMENT)
			.stairs(MOSSY_SILVER_CHALK_PAVEMENT_STAIRS)
			.slab(MOSSY_SILVER_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_SILVER_CHALK_PAVEMENT = registerBlock("overgrown_silver_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_CHALK_PAVEMENT_STAIRS = registerBlock("overgrown_silver_chalk_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_SILVER_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_CHALK_PAVEMENT_SLAB = registerBlock("overgrown_silver_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_CHALK_PAVEMENT)
			.stairs(OVERGROWN_SILVER_CHALK_PAVEMENT_STAIRS)
			.slab(OVERGROWN_SILVER_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block CRACKED_SILVER_CHALK_PAVEMENT = registerBlock("cracked_silver_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_CHALK_PAVEMENT_STAIRS = registerBlock("cracked_silver_chalk_pavement_stairs",
			settings -> new StairsBlock(CRACKED_SILVER_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_CHALK_PAVEMENT_SLAB = registerBlock("cracked_silver_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_SILVER_CHALK_PAVEMENT)
			.stairs(CRACKED_SILVER_CHALK_PAVEMENT_STAIRS)
			.slab(CRACKED_SILVER_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_CRACKED_SILVER_CHALK_PAVEMENT = registerBlock("mossy_cracked_silver_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_CHALK_PAVEMENT_STAIRS = registerBlock("mossy_cracked_silver_chalk_pavement_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_SILVER_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_CHALK_PAVEMENT_SLAB = registerBlock("mossy_cracked_silver_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_CHALK_PAVEMENT)
			.stairs(MOSSY_CRACKED_SILVER_CHALK_PAVEMENT_STAIRS)
			.slab(MOSSY_CRACKED_SILVER_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_CHALK_PAVEMENT = registerBlock("overgrown_cracked_silver_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_CHALK_PAVEMENT_STAIRS = registerBlock("overgrown_cracked_silver_chalk_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_SILVER_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_CHALK_PAVEMENT_SLAB = registerBlock("overgrown_cracked_silver_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_CHALK_PAVEMENT)
			.stairs(OVERGROWN_CRACKED_SILVER_CHALK_PAVEMENT_STAIRS)
			.slab(OVERGROWN_CRACKED_SILVER_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block GOLD_CHALK_PAVEMENT = registerBlock("gold_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_CHALK_PAVEMENT_STAIRS = registerBlock("gold_chalk_pavement_stairs",
			settings -> new StairsBlock(GOLD_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_CHALK_PAVEMENT_SLAB = registerBlock("gold_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(GOLD_CHALK_PAVEMENT)
			.stairs(GOLD_CHALK_PAVEMENT_STAIRS)
			.slab(GOLD_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_GOLD_CHALK_PAVEMENT = registerBlock("mossy_gold_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_CHALK_PAVEMENT_STAIRS = registerBlock("mossy_gold_chalk_pavement_stairs",
			settings -> new StairsBlock(MOSSY_GOLD_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_CHALK_PAVEMENT_SLAB = registerBlock("mossy_gold_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_GOLD_CHALK_PAVEMENT)
			.stairs(MOSSY_GOLD_CHALK_PAVEMENT_STAIRS)
			.slab(MOSSY_GOLD_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_GOLD_CHALK_PAVEMENT = registerBlock("overgrown_gold_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_CHALK_PAVEMENT_STAIRS = registerBlock("overgrown_gold_chalk_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_GOLD_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_CHALK_PAVEMENT_SLAB = registerBlock("overgrown_gold_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_CHALK_PAVEMENT)
			.stairs(OVERGROWN_GOLD_CHALK_PAVEMENT_STAIRS)
			.slab(OVERGROWN_GOLD_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block CRACKED_GOLD_CHALK_PAVEMENT = registerBlock("cracked_gold_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_CHALK_PAVEMENT_STAIRS = registerBlock("cracked_gold_chalk_pavement_stairs",
			settings -> new StairsBlock(CRACKED_GOLD_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_CHALK_PAVEMENT_SLAB = registerBlock("cracked_gold_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_GOLD_CHALK_PAVEMENT)
			.stairs(CRACKED_GOLD_CHALK_PAVEMENT_STAIRS)
			.slab(CRACKED_GOLD_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_CRACKED_GOLD_CHALK_PAVEMENT = registerBlock("mossy_cracked_gold_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_CHALK_PAVEMENT_STAIRS = registerBlock("mossy_cracked_gold_chalk_pavement_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GOLD_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_CHALK_PAVEMENT_SLAB = registerBlock("mossy_cracked_gold_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_CHALK_PAVEMENT)
			.stairs(MOSSY_CRACKED_GOLD_CHALK_PAVEMENT_STAIRS)
			.slab(MOSSY_CRACKED_GOLD_CHALK_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_CHALK_PAVEMENT = registerBlock("overgrown_cracked_gold_chalk_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_CHALK_PAVEMENT_STAIRS = registerBlock("overgrown_cracked_gold_chalk_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GOLD_CHALK_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_CHALK_PAVEMENT_SLAB = registerBlock("overgrown_cracked_gold_chalk_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_CHALK_PAVEMENT)
			.stairs(OVERGROWN_CRACKED_GOLD_CHALK_PAVEMENT_STAIRS)
			.slab(OVERGROWN_CRACKED_GOLD_CHALK_PAVEMENT_SLAB)
			.build();

	public static ModStoneSubSet CHALK_PAVEMENT_SUBSET = new ModStoneSubSet(
			CHALK_PAVEMENT_FAMILY,
			MOSSY_CHALK_PAVEMENT_FAMILY,
			OVERGROWN_CHALK_PAVEMENT_FAMILY,
			CRACKED_CHALK_PAVEMENT_FAMILY, MOSSY_CRACKED_CHALK_PAVEMENT_FAMILY, OVERGROWN_CRACKED_CHALK_PAVEMENT_FAMILY,
			BRONZE_CHALK_PAVEMENT_FAMILY, MOSSY_BRONZE_CHALK_PAVEMENT_FAMILY, OVERGROWN_BRONZE_CHALK_PAVEMENT_FAMILY,
			CRACKED_BRONZE_CHALK_PAVEMENT_FAMILY, MOSSY_CRACKED_BRONZE_CHALK_PAVEMENT_FAMILY, OVERGROWN_CRACKED_BRONZE_CHALK_PAVEMENT_FAMILY,
			SILVER_CHALK_PAVEMENT_FAMILY, MOSSY_SILVER_CHALK_PAVEMENT_FAMILY,
			OVERGROWN_SILVER_CHALK_PAVEMENT_FAMILY,
			CRACKED_SILVER_CHALK_PAVEMENT_FAMILY, MOSSY_CRACKED_SILVER_CHALK_PAVEMENT_FAMILY, OVERGROWN_CRACKED_SILVER_CHALK_PAVEMENT_FAMILY,
			GOLD_CHALK_PAVEMENT_FAMILY, MOSSY_GOLD_CHALK_PAVEMENT_FAMILY, OVERGROWN_GOLD_CHALK_PAVEMENT_FAMILY,
			CRACKED_GOLD_CHALK_PAVEMENT_FAMILY, MOSSY_CRACKED_GOLD_CHALK_PAVEMENT_FAMILY,
			OVERGROWN_CRACKED_GOLD_CHALK_PAVEMENT_FAMILY, "chalk_pavement");

	public static Block FANCY_CHALK_BRICKS = registerBlock("fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block FANCY_CHALK_BRICK_STAIRS = registerBlock("fancy_chalk_brick_stairs",
			settings -> new StairsBlock(FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block FANCY_CHALK_BRICK_SLAB = registerBlock("fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block FANCY_CHALK_BRICK_WALL = registerBlock("fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(FANCY_CHALK_BRICKS)
			.stairs(FANCY_CHALK_BRICK_STAIRS)
			.slab(FANCY_CHALK_BRICK_SLAB)
			.wall(FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_FANCY_CHALK_BRICKS = registerBlock("mossy_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_FANCY_CHALK_BRICK_STAIRS = registerBlock("mossy_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_FANCY_CHALK_BRICK_SLAB = registerBlock("mossy_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_FANCY_CHALK_BRICK_WALL = registerBlock("mossy_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_FANCY_CHALK_BRICKS)
			.stairs(MOSSY_FANCY_CHALK_BRICK_STAIRS)
			.slab(MOSSY_FANCY_CHALK_BRICK_SLAB)
			.wall(MOSSY_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_FANCY_CHALK_BRICKS = registerBlock("overgrown_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_FANCY_CHALK_BRICK_STAIRS = registerBlock("overgrown_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_FANCY_CHALK_BRICK_SLAB = registerBlock("overgrown_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_FANCY_CHALK_BRICK_WALL = registerBlock("overgrown_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_FANCY_CHALK_BRICKS)
			.stairs(OVERGROWN_FANCY_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_FANCY_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_FANCY_CHALK_BRICKS = registerBlock("cracked_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_FANCY_CHALK_BRICK_STAIRS = registerBlock("cracked_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_FANCY_CHALK_BRICK_SLAB = registerBlock("cracked_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_FANCY_CHALK_BRICK_WALL = registerBlock("cracked_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_FANCY_CHALK_BRICKS)
			.stairs(CRACKED_FANCY_CHALK_BRICK_STAIRS)
			.slab(CRACKED_FANCY_CHALK_BRICK_SLAB)
			.wall(CRACKED_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_FANCY_CHALK_BRICKS = registerBlock("mossy_cracked_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_FANCY_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_FANCY_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_FANCY_CHALK_BRICK_WALL = registerBlock("mossy_cracked_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_FANCY_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_FANCY_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_FANCY_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_FANCY_CHALK_BRICKS = registerBlock("overgrown_cracked_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_FANCY_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_FANCY_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_FANCY_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_FANCY_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_FANCY_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_FANCY_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block BRONZE_FANCY_CHALK_BRICKS = registerBlock("bronze_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_FANCY_CHALK_BRICK_STAIRS = registerBlock("bronze_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(BRONZE_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_FANCY_CHALK_BRICK_SLAB = registerBlock("bronze_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_FANCY_CHALK_BRICK_WALL = registerBlock("bronze_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(BRONZE_FANCY_CHALK_BRICKS)
			.stairs(BRONZE_FANCY_CHALK_BRICK_STAIRS)
			.slab(BRONZE_FANCY_CHALK_BRICK_SLAB)
			.wall(BRONZE_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_BRONZE_FANCY_CHALK_BRICKS = registerBlock("mossy_bronze_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_FANCY_CHALK_BRICK_STAIRS = registerBlock("mossy_bronze_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_BRONZE_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_FANCY_CHALK_BRICK_SLAB = registerBlock("mossy_bronze_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_FANCY_CHALK_BRICK_WALL = registerBlock("mossy_bronze_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_BRONZE_FANCY_CHALK_BRICKS)
			.stairs(MOSSY_BRONZE_FANCY_CHALK_BRICK_STAIRS)
			.slab(MOSSY_BRONZE_FANCY_CHALK_BRICK_SLAB)
			.wall(MOSSY_BRONZE_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_BRONZE_FANCY_CHALK_BRICKS = registerBlock("overgrown_bronze_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_FANCY_CHALK_BRICK_STAIRS = registerBlock("overgrown_bronze_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_BRONZE_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_FANCY_CHALK_BRICK_SLAB = registerBlock("overgrown_bronze_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_FANCY_CHALK_BRICK_WALL = registerBlock("overgrown_bronze_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_FANCY_CHALK_BRICKS)
			.stairs(OVERGROWN_BRONZE_FANCY_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_BRONZE_FANCY_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_BRONZE_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_BRONZE_FANCY_CHALK_BRICKS = registerBlock("cracked_bronze_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_FANCY_CHALK_BRICK_STAIRS = registerBlock("cracked_bronze_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_BRONZE_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_FANCY_CHALK_BRICK_SLAB = registerBlock("cracked_bronze_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_FANCY_CHALK_BRICK_WALL = registerBlock("cracked_bronze_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_BRONZE_FANCY_CHALK_BRICKS)
			.stairs(CRACKED_BRONZE_FANCY_CHALK_BRICK_STAIRS)
			.slab(CRACKED_BRONZE_FANCY_CHALK_BRICK_SLAB)
			.wall(CRACKED_BRONZE_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_FANCY_CHALK_BRICKS = registerBlock("mossy_cracked_bronze_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_FANCY_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_bronze_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_BRONZE_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_FANCY_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_bronze_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_FANCY_CHALK_BRICK_WALL = registerBlock("mossy_cracked_bronze_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_FANCY_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_BRONZE_FANCY_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_BRONZE_FANCY_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_BRONZE_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_FANCY_CHALK_BRICKS = registerBlock("overgrown_cracked_bronze_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_FANCY_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_bronze_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_BRONZE_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_FANCY_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_bronze_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_FANCY_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_bronze_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_FANCY_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_BRONZE_FANCY_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_BRONZE_FANCY_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_BRONZE_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block SILVER_FANCY_CHALK_BRICKS = registerBlock("silver_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_FANCY_CHALK_BRICK_STAIRS = registerBlock("silver_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(SILVER_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_FANCY_CHALK_BRICK_SLAB = registerBlock("silver_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_FANCY_CHALK_BRICK_WALL = registerBlock("silver_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(SILVER_FANCY_CHALK_BRICKS)
			.stairs(SILVER_FANCY_CHALK_BRICK_STAIRS)
			.slab(SILVER_FANCY_CHALK_BRICK_SLAB)
			.wall(SILVER_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_SILVER_FANCY_CHALK_BRICKS = registerBlock("mossy_silver_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_FANCY_CHALK_BRICK_STAIRS = registerBlock("mossy_silver_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_SILVER_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_FANCY_CHALK_BRICK_SLAB = registerBlock("mossy_silver_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_FANCY_CHALK_BRICK_WALL = registerBlock("mossy_silver_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_SILVER_FANCY_CHALK_BRICKS)
			.stairs(MOSSY_SILVER_FANCY_CHALK_BRICK_STAIRS)
			.slab(MOSSY_SILVER_FANCY_CHALK_BRICK_SLAB)
			.wall(MOSSY_SILVER_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_SILVER_FANCY_CHALK_BRICKS = registerBlock("overgrown_silver_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_FANCY_CHALK_BRICK_STAIRS = registerBlock("overgrown_silver_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_SILVER_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_FANCY_CHALK_BRICK_SLAB = registerBlock("overgrown_silver_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_FANCY_CHALK_BRICK_WALL = registerBlock("overgrown_silver_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_FANCY_CHALK_BRICKS)
			.stairs(OVERGROWN_SILVER_FANCY_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_SILVER_FANCY_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_SILVER_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_SILVER_FANCY_CHALK_BRICKS = registerBlock("cracked_silver_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_FANCY_CHALK_BRICK_STAIRS = registerBlock("cracked_silver_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_SILVER_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_FANCY_CHALK_BRICK_SLAB = registerBlock("cracked_silver_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_FANCY_CHALK_BRICK_WALL = registerBlock("cracked_silver_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_SILVER_FANCY_CHALK_BRICKS)
			.stairs(CRACKED_SILVER_FANCY_CHALK_BRICK_STAIRS)
			.slab(CRACKED_SILVER_FANCY_CHALK_BRICK_SLAB)
			.wall(CRACKED_SILVER_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_SILVER_FANCY_CHALK_BRICKS = registerBlock("mossy_cracked_silver_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_FANCY_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_silver_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_SILVER_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_FANCY_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_silver_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_FANCY_CHALK_BRICK_WALL = registerBlock("mossy_cracked_silver_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_FANCY_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_SILVER_FANCY_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_SILVER_FANCY_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_SILVER_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_FANCY_CHALK_BRICKS = registerBlock("overgrown_cracked_silver_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_FANCY_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_silver_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_SILVER_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_FANCY_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_silver_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_FANCY_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_silver_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_FANCY_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_SILVER_FANCY_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_SILVER_FANCY_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_SILVER_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block GOLD_FANCY_CHALK_BRICKS = registerBlock("gold_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_FANCY_CHALK_BRICK_STAIRS = registerBlock("gold_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(GOLD_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_FANCY_CHALK_BRICK_SLAB = registerBlock("gold_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_FANCY_CHALK_BRICK_WALL = registerBlock("gold_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(GOLD_FANCY_CHALK_BRICKS)
			.stairs(GOLD_FANCY_CHALK_BRICK_STAIRS)
			.slab(GOLD_FANCY_CHALK_BRICK_SLAB)
			.wall(GOLD_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_GOLD_FANCY_CHALK_BRICKS = registerBlock("mossy_gold_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_FANCY_CHALK_BRICK_STAIRS = registerBlock("mossy_gold_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_GOLD_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_FANCY_CHALK_BRICK_SLAB = registerBlock("mossy_gold_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_FANCY_CHALK_BRICK_WALL = registerBlock("mossy_gold_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_GOLD_FANCY_CHALK_BRICKS)
			.stairs(MOSSY_GOLD_FANCY_CHALK_BRICK_STAIRS)
			.slab(MOSSY_GOLD_FANCY_CHALK_BRICK_SLAB)
			.wall(MOSSY_GOLD_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_GOLD_FANCY_CHALK_BRICKS = registerBlock("overgrown_gold_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_FANCY_CHALK_BRICK_STAIRS = registerBlock("overgrown_gold_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_GOLD_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_FANCY_CHALK_BRICK_SLAB = registerBlock("overgrown_gold_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_FANCY_CHALK_BRICK_WALL = registerBlock("overgrown_gold_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_FANCY_CHALK_BRICKS)
			.stairs(OVERGROWN_GOLD_FANCY_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_GOLD_FANCY_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_GOLD_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block CRACKED_GOLD_FANCY_CHALK_BRICKS = registerBlock("cracked_gold_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_FANCY_CHALK_BRICK_STAIRS = registerBlock("cracked_gold_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(CRACKED_GOLD_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_FANCY_CHALK_BRICK_SLAB = registerBlock("cracked_gold_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_FANCY_CHALK_BRICK_WALL = registerBlock("cracked_gold_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_GOLD_FANCY_CHALK_BRICKS)
			.stairs(CRACKED_GOLD_FANCY_CHALK_BRICK_STAIRS)
			.slab(CRACKED_GOLD_FANCY_CHALK_BRICK_SLAB)
			.wall(CRACKED_GOLD_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_GOLD_FANCY_CHALK_BRICKS = registerBlock("mossy_cracked_gold_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_FANCY_CHALK_BRICK_STAIRS = registerBlock("mossy_cracked_gold_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GOLD_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_FANCY_CHALK_BRICK_SLAB = registerBlock("mossy_cracked_gold_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_FANCY_CHALK_BRICK_WALL = registerBlock("mossy_cracked_gold_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_FANCY_CHALK_BRICKS)
			.stairs(MOSSY_CRACKED_GOLD_FANCY_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_GOLD_FANCY_CHALK_BRICK_SLAB)
			.wall(MOSSY_CRACKED_GOLD_FANCY_CHALK_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_FANCY_CHALK_BRICKS = registerBlock("overgrown_cracked_gold_fancy_chalk_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_FANCY_CHALK_BRICK_STAIRS = registerBlock("overgrown_cracked_gold_fancy_chalk_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GOLD_FANCY_CHALK_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_FANCY_CHALK_BRICK_SLAB = registerBlock("overgrown_cracked_gold_fancy_chalk_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_FANCY_CHALK_BRICK_WALL = registerBlock("overgrown_cracked_gold_fancy_chalk_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_FANCY_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_FANCY_CHALK_BRICKS)
			.stairs(OVERGROWN_CRACKED_GOLD_FANCY_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_GOLD_FANCY_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_GOLD_FANCY_CHALK_BRICK_WALL)
			.build();

	public static ModStoneSubSet FANCY_CHALK_BRICK_SUBSET = new ModStoneSubSet(
			FANCY_CHALK_BRICK_FAMILY,
			MOSSY_FANCY_CHALK_BRICK_FAMILY,
			OVERGROWN_FANCY_CHALK_BRICK_FAMILY,
			CRACKED_FANCY_CHALK_BRICK_FAMILY, MOSSY_CRACKED_FANCY_CHALK_BRICK_FAMILY, OVERGROWN_CRACKED_FANCY_CHALK_BRICK_FAMILY,
			BRONZE_FANCY_CHALK_BRICK_FAMILY, MOSSY_BRONZE_FANCY_CHALK_BRICK_FAMILY, OVERGROWN_BRONZE_FANCY_CHALK_BRICK_FAMILY,
			CRACKED_BRONZE_FANCY_CHALK_BRICK_FAMILY, MOSSY_CRACKED_BRONZE_FANCY_CHALK_BRICK_FAMILY, OVERGROWN_CRACKED_BRONZE_FANCY_CHALK_BRICK_FAMILY,
			SILVER_FANCY_CHALK_BRICK_FAMILY, MOSSY_SILVER_FANCY_CHALK_BRICK_FAMILY,
			OVERGROWN_SILVER_FANCY_CHALK_BRICK_FAMILY,
			CRACKED_SILVER_FANCY_CHALK_BRICK_FAMILY, MOSSY_CRACKED_SILVER_FANCY_CHALK_BRICK_FAMILY, OVERGROWN_CRACKED_SILVER_FANCY_CHALK_BRICK_FAMILY,
			GOLD_FANCY_CHALK_BRICK_FAMILY, MOSSY_GOLD_FANCY_CHALK_BRICK_FAMILY, OVERGROWN_GOLD_FANCY_CHALK_BRICK_FAMILY,
			CRACKED_GOLD_FANCY_CHALK_BRICK_FAMILY, MOSSY_CRACKED_GOLD_FANCY_CHALK_BRICK_FAMILY,
			OVERGROWN_CRACKED_GOLD_FANCY_CHALK_BRICK_FAMILY, "fancy_chalk_brick");

	public static ModStoneSet CHALK_SET = new ModStoneSet(CHALK_FAMILY, MOSSY_CHALK_FAMILY,
			OVERGROWN_CHALK_FAMILY,
			COBBLED_CHALK_FAMILY, MOSSY_COBBLED_CHALK_FAMILY, OVERGROWN_COBBLED_CHALK_FAMILY,
			SMOOTH_CHALK_FAMILY,MOSSY_SMOOTH_CHALK_FAMILY, OVERGROWN_SMOOTH_CHALK_FAMILY,
			CRACKED_SMOOTH_CHALK_FAMILY, CRACKED_MOSSY_SMOOTH_CHALK_FAMILY,
			CRACKED_OVERGROWN_SMOOTH_CHALK_FAMILY,
			POLISHED_CHALK_SUBSET, CHALK_PILLAR_SUBSET, CHALK_FRIEZE_SUBSET,
			COBBLED_CHALK_BRICK_SUBSET, RUSTIC_CHALK_BRICK_SUBSET, CHALK_BRICK_SUBSET,
			CHALK_TILE_SUBSET, CHALK_PAVEMENT_SUBSET, FANCY_CHALK_BRICK_SUBSET);

	public static void registerChalkBlocks() {
		VExtMod.LOGGER.info("Registering Chalk Blocks for " + VExtMod.MOD_ID);
	}
}
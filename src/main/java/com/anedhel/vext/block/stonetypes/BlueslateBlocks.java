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
 * Defines and registers all blueslate stone blocks and their variants.
 * <p>
 * This class creates a comprehensive set of blueslate blocks including base stone,
 * cobbled, smooth, and cracked variants, each with normal, mossy, and overgrown states.
 * It also includes specialized subsets for polished stone, pillars, friezes, and various
 * brick styles, all with optional metal ornamentations (bronze, silver, gold).
 *
 * @author Moritz Rohleder
 * @see ModStoneSet
 * @see ModStoneTypes
 * @since 0.1.0
 */
public class BlueslateBlocks {

	public static Block BLUESLATE = registerBlock("blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BLUESLATE_STAIRS = registerBlock("blueslate_stairs",
			settings -> new StairsBlock(BlueslateBlocks.BLUESLATE.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BLUESLATE_SLAB = registerBlock("blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BLUESLATE_BUTTON = registerBlock("blueslate_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block BLUESLATE_PRESSURE_PLATE = registerBlock("blueslate_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block BLUESLATE_WALL = registerBlock("blueslate_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BLUESLATE_FAMILY = BlockFamilies.register(BLUESLATE)
			.stairs(BLUESLATE_STAIRS)
			.slab(BLUESLATE_SLAB)
			.button(BLUESLATE_BUTTON)
			.pressurePlate(BLUESLATE_PRESSURE_PLATE)
			.wall(BLUESLATE_WALL)
			.build();

	public static Block MOSSY_BLUESLATE = registerBlock("mossy_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BLUESLATE_STAIRS = registerBlock("mossy_blueslate_stairs",
			settings -> new StairsBlock(BlueslateBlocks.MOSSY_BLUESLATE.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BLUESLATE_SLAB = registerBlock("mossy_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BLUESLATE_BUTTON = registerBlock("mossy_blueslate_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block MOSSY_BLUESLATE_PRESSURE_PLATE = registerBlock("mossy_blueslate_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block MOSSY_BLUESLATE_WALL = registerBlock("mossy_blueslate_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BLUESLATE_FAMILY = BlockFamilies.register(MOSSY_BLUESLATE)
			.stairs(MOSSY_BLUESLATE_STAIRS)
			.slab(MOSSY_BLUESLATE_SLAB)
			.button(MOSSY_BLUESLATE_BUTTON)
			.pressurePlate(MOSSY_BLUESLATE_PRESSURE_PLATE)
			.wall(MOSSY_BLUESLATE_WALL)
			.build();

	public static Block OVERGROWN_BLUESLATE = registerBlock("overgrown_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BLUESLATE_STAIRS = registerBlock("overgrown_blueslate_stairs",
			settings -> new StairsBlock(BlueslateBlocks.OVERGROWN_BLUESLATE.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BLUESLATE_SLAB = registerBlock("overgrown_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BLUESLATE_BUTTON = registerBlock("overgrown_blueslate_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block OVERGROWN_BLUESLATE_PRESSURE_PLATE = registerBlock("overgrown_blueslate_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block OVERGROWN_BLUESLATE_WALL = registerBlock("overgrown_blueslate_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BLUESLATE_FAMILY = BlockFamilies.register(OVERGROWN_BLUESLATE)
			.stairs(OVERGROWN_BLUESLATE_STAIRS)
			.slab(OVERGROWN_BLUESLATE_SLAB)
			.button(OVERGROWN_BLUESLATE_BUTTON)
			.pressurePlate(OVERGROWN_BLUESLATE_PRESSURE_PLATE)
			.wall(OVERGROWN_BLUESLATE_WALL)
			.build();

	public static Block COBBLED_BLUESLATE = registerBlock("cobbled_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block COBBLED_BLUESLATE_STAIRS = registerBlock("cobbled_blueslate_stairs",
			settings -> new StairsBlock(BlueslateBlocks.COBBLED_BLUESLATE.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block COBBLED_BLUESLATE_SLAB = registerBlock("cobbled_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block COBBLED_BLUESLATE_BUTTON = registerBlock("cobbled_blueslate_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block COBBLED_BLUESLATE_PRESSURE_PLATE = registerBlock("cobbled_blueslate_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block COBBLED_BLUESLATE_WALL = registerBlock("cobbled_blueslate_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily COBBLED_BLUESLATE_FAMILY = BlockFamilies.register(COBBLED_BLUESLATE)
			.stairs(COBBLED_BLUESLATE_STAIRS)
			.slab(COBBLED_BLUESLATE_SLAB)
			.button(COBBLED_BLUESLATE_BUTTON)
			.pressurePlate(COBBLED_BLUESLATE_PRESSURE_PLATE)
			.wall(COBBLED_BLUESLATE_WALL)
			.build();

	public static Block MOSSY_COBBLED_BLUESLATE = registerBlock("mossy_cobbled_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_COBBLED_BLUESLATE_STAIRS = registerBlock("mossy_cobbled_blueslate_stairs",
			settings -> new StairsBlock(BlueslateBlocks.MOSSY_COBBLED_BLUESLATE.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_COBBLED_BLUESLATE_SLAB = registerBlock("mossy_cobbled_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_COBBLED_BLUESLATE_BUTTON = registerBlock("mossy_cobbled_blueslate_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block MOSSY_COBBLED_BLUESLATE_PRESSURE_PLATE = registerBlock("mossy_cobbled_blueslate_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block MOSSY_COBBLED_BLUESLATE_WALL = registerBlock("mossy_cobbled_blueslate_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_COBBLED_BLUESLATE_FAMILY = BlockFamilies.register(MOSSY_COBBLED_BLUESLATE)
			.stairs(MOSSY_COBBLED_BLUESLATE_STAIRS)
			.slab(MOSSY_COBBLED_BLUESLATE_SLAB)
			.button(MOSSY_COBBLED_BLUESLATE_BUTTON)
			.pressurePlate(MOSSY_COBBLED_BLUESLATE_PRESSURE_PLATE)
			.wall(MOSSY_COBBLED_BLUESLATE_WALL)
			.build();

	public static Block OVERGROWN_COBBLED_BLUESLATE = registerBlock("overgrown_cobbled_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_COBBLED_BLUESLATE_STAIRS = registerBlock("overgrown_cobbled_blueslate_stairs",
			settings -> new StairsBlock(BlueslateBlocks.OVERGROWN_COBBLED_BLUESLATE.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_COBBLED_BLUESLATE_SLAB = registerBlock("overgrown_cobbled_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_COBBLED_BLUESLATE_BUTTON = registerBlock("overgrown_cobbled_blueslate_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block OVERGROWN_COBBLED_BLUESLATE_PRESSURE_PLATE = registerBlock("overgrown_cobbled_blueslate_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block OVERGROWN_COBBLED_BLUESLATE_WALL = registerBlock("overgrown_cobbled_blueslate_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_COBBLED_BLUESLATE_FAMILY = BlockFamilies.register(OVERGROWN_COBBLED_BLUESLATE)
			.stairs(OVERGROWN_COBBLED_BLUESLATE_STAIRS)
			.slab(OVERGROWN_COBBLED_BLUESLATE_SLAB)
			.button(OVERGROWN_COBBLED_BLUESLATE_BUTTON)
			.pressurePlate(OVERGROWN_COBBLED_BLUESLATE_PRESSURE_PLATE)
			.wall(OVERGROWN_COBBLED_BLUESLATE_WALL)
			.build();

	public static Block SMOOTH_BLUESLATE = registerBlock("smooth_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SMOOTH_BLUESLATE_STAIRS = registerBlock("smooth_blueslate_stairs",
			settings -> new StairsBlock(BlueslateBlocks.SMOOTH_BLUESLATE.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SMOOTH_BLUESLATE_SLAB = registerBlock("smooth_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SMOOTH_BLUESLATE_BUTTON = registerBlock("smooth_blueslate_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block SMOOTH_BLUESLATE_PRESSURE_PLATE = registerBlock("smooth_blueslate_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block SMOOTH_BLUESLATE_WALL = registerBlock("smooth_blueslate_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SMOOTH_BLUESLATE_FAMILY = BlockFamilies.register(SMOOTH_BLUESLATE)
			.stairs(SMOOTH_BLUESLATE_STAIRS)
			.slab(SMOOTH_BLUESLATE_SLAB)
			.button(SMOOTH_BLUESLATE_BUTTON)
			.pressurePlate(SMOOTH_BLUESLATE_PRESSURE_PLATE)
			.wall(SMOOTH_BLUESLATE_WALL)
			.build();

	public static Block MOSSY_SMOOTH_BLUESLATE = registerBlock("mossy_smooth_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SMOOTH_BLUESLATE_STAIRS = registerBlock("mossy_smooth_blueslate_stairs",
			settings -> new StairsBlock(BlueslateBlocks.MOSSY_SMOOTH_BLUESLATE.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SMOOTH_BLUESLATE_SLAB = registerBlock("mossy_smooth_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SMOOTH_BLUESLATE_BUTTON = registerBlock("mossy_smooth_blueslate_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block MOSSY_SMOOTH_BLUESLATE_PRESSURE_PLATE = registerBlock("mossy_smooth_blueslate_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block MOSSY_SMOOTH_BLUESLATE_WALL = registerBlock("mossy_smooth_blueslate_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SMOOTH_BLUESLATE_FAMILY = BlockFamilies.register(MOSSY_SMOOTH_BLUESLATE)
			.stairs(MOSSY_SMOOTH_BLUESLATE_STAIRS)
			.slab(MOSSY_SMOOTH_BLUESLATE_SLAB)
			.button(MOSSY_SMOOTH_BLUESLATE_BUTTON)
			.pressurePlate(MOSSY_SMOOTH_BLUESLATE_PRESSURE_PLATE)
			.wall(MOSSY_SMOOTH_BLUESLATE_WALL)
			.build();

	public static Block OVERGROWN_SMOOTH_BLUESLATE = registerBlock("overgrown_smooth_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SMOOTH_BLUESLATE_STAIRS = registerBlock("overgrown_smooth_blueslate_stairs",
			settings -> new StairsBlock(BlueslateBlocks.OVERGROWN_SMOOTH_BLUESLATE.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SMOOTH_BLUESLATE_SLAB = registerBlock("overgrown_smooth_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SMOOTH_BLUESLATE_BUTTON = registerBlock("overgrown_smooth_blueslate_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block OVERGROWN_SMOOTH_BLUESLATE_PRESSURE_PLATE = registerBlock("overgrown_smooth_blueslate_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block OVERGROWN_SMOOTH_BLUESLATE_WALL = registerBlock("overgrown_smooth_blueslate_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SMOOTH_BLUESLATE_FAMILY = BlockFamilies.register(OVERGROWN_SMOOTH_BLUESLATE)
			.stairs(OVERGROWN_SMOOTH_BLUESLATE_STAIRS)
			.slab(OVERGROWN_SMOOTH_BLUESLATE_SLAB)
			.button(OVERGROWN_SMOOTH_BLUESLATE_BUTTON)
			.pressurePlate(OVERGROWN_SMOOTH_BLUESLATE_PRESSURE_PLATE)
			.wall(OVERGROWN_SMOOTH_BLUESLATE_WALL)
			.build();

	public static Block CRACKED_SMOOTH_BLUESLATE = registerBlock("cracked_smooth_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SMOOTH_BLUESLATE_STAIRS = registerBlock("cracked_smooth_blueslate_stairs",
			settings -> new StairsBlock(BlueslateBlocks.CRACKED_SMOOTH_BLUESLATE.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SMOOTH_BLUESLATE_SLAB = registerBlock("cracked_smooth_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SMOOTH_BLUESLATE_BUTTON = registerBlock("cracked_smooth_blueslate_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block CRACKED_SMOOTH_BLUESLATE_PRESSURE_PLATE = registerBlock("cracked_smooth_blueslate_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block CRACKED_SMOOTH_BLUESLATE_WALL = registerBlock("cracked_smooth_blueslate_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SMOOTH_BLUESLATE_FAMILY = BlockFamilies.register(CRACKED_SMOOTH_BLUESLATE)
			.stairs(CRACKED_SMOOTH_BLUESLATE_STAIRS)
			.slab(CRACKED_SMOOTH_BLUESLATE_SLAB)
			.button(CRACKED_SMOOTH_BLUESLATE_BUTTON)
			.pressurePlate(CRACKED_SMOOTH_BLUESLATE_PRESSURE_PLATE)
			.wall(CRACKED_SMOOTH_BLUESLATE_WALL)
			.build();

	public static Block CRACKED_MOSSY_SMOOTH_BLUESLATE = registerBlock("cracked_mossy_smooth_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_MOSSY_SMOOTH_BLUESLATE_STAIRS = registerBlock("cracked_mossy_smooth_blueslate_stairs",
			settings -> new StairsBlock(BlueslateBlocks.CRACKED_MOSSY_SMOOTH_BLUESLATE.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_MOSSY_SMOOTH_BLUESLATE_SLAB = registerBlock("cracked_mossy_smooth_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_MOSSY_SMOOTH_BLUESLATE_BUTTON = registerBlock("cracked_mossy_smooth_blueslate_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block CRACKED_MOSSY_SMOOTH_BLUESLATE_PRESSURE_PLATE = registerBlock("cracked_mossy_smooth_blueslate_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block CRACKED_MOSSY_SMOOTH_BLUESLATE_WALL = registerBlock("cracked_mossy_smooth_blueslate_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_MOSSY_SMOOTH_BLUESLATE_FAMILY = BlockFamilies.register(CRACKED_MOSSY_SMOOTH_BLUESLATE)
			.stairs(CRACKED_MOSSY_SMOOTH_BLUESLATE_STAIRS)
			.slab(CRACKED_MOSSY_SMOOTH_BLUESLATE_SLAB)
			.button(CRACKED_MOSSY_SMOOTH_BLUESLATE_BUTTON)
			.pressurePlate(CRACKED_MOSSY_SMOOTH_BLUESLATE_PRESSURE_PLATE)
			.wall(CRACKED_MOSSY_SMOOTH_BLUESLATE_WALL)
			.build();

	public static Block CRACKED_OVERGROWN_SMOOTH_BLUESLATE = registerBlock("cracked_overgrown_smooth_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_OVERGROWN_SMOOTH_BLUESLATE_STAIRS = registerBlock("cracked_overgrown_smooth_blueslate_stairs",
			settings -> new StairsBlock(BlueslateBlocks.CRACKED_OVERGROWN_SMOOTH_BLUESLATE.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_OVERGROWN_SMOOTH_BLUESLATE_SLAB = registerBlock("cracked_overgrown_smooth_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_OVERGROWN_SMOOTH_BLUESLATE_BUTTON = registerBlock("cracked_overgrown_smooth_blueslate_button",
			settings -> new ButtonBlock(BlockSetType.STONE, 10, settings.requiresTool()));
	public static Block CRACKED_OVERGROWN_SMOOTH_BLUESLATE_PRESSURE_PLATE = registerBlock("cracked_overgrown_smooth_blueslate_pressure_plate",
			settings -> new PressurePlateBlock(BlockSetType.STONE, settings.requiresTool()));
	public static Block CRACKED_OVERGROWN_SMOOTH_BLUESLATE_WALL = registerBlock("cracked_overgrown_smooth_blueslate_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_OVERGROWN_SMOOTH_BLUESLATE_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_SMOOTH_BLUESLATE)
			.stairs(CRACKED_OVERGROWN_SMOOTH_BLUESLATE_STAIRS)
			.slab(CRACKED_OVERGROWN_SMOOTH_BLUESLATE_SLAB)
			.button(CRACKED_OVERGROWN_SMOOTH_BLUESLATE_BUTTON)
			.pressurePlate(CRACKED_OVERGROWN_SMOOTH_BLUESLATE_PRESSURE_PLATE)
			.wall(CRACKED_OVERGROWN_SMOOTH_BLUESLATE_WALL)
			.build();

	public static Block POLISHED_BLUESLATE = registerBlock("polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block POLISHED_BLUESLATE_SLAB = registerBlock("polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(POLISHED_BLUESLATE)
			.slab(POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block MOSSY_POLISHED_BLUESLATE = registerBlock("mossy_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_POLISHED_BLUESLATE_SLAB = registerBlock("mossy_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(MOSSY_POLISHED_BLUESLATE)
			.slab(MOSSY_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block OVERGROWN_POLISHED_BLUESLATE = registerBlock("overgrown_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_POLISHED_BLUESLATE_SLAB = registerBlock("overgrown_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(OVERGROWN_POLISHED_BLUESLATE)
			.slab(OVERGROWN_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block CRACKED_POLISHED_BLUESLATE = registerBlock("cracked_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_POLISHED_BLUESLATE_SLAB = registerBlock("cracked_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(CRACKED_POLISHED_BLUESLATE)
			.slab(CRACKED_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block MOSSY_CRACKED_POLISHED_BLUESLATE = registerBlock("mossy_cracked_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_POLISHED_BLUESLATE_SLAB = registerBlock("mossy_cracked_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_POLISHED_BLUESLATE)
			.slab(MOSSY_CRACKED_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_POLISHED_BLUESLATE = registerBlock("overgrown_cracked_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_POLISHED_BLUESLATE_SLAB = registerBlock("overgrown_cracked_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_POLISHED_BLUESLATE)
			.slab(OVERGROWN_CRACKED_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block BRONZE_POLISHED_BLUESLATE = registerBlock("bronze_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_POLISHED_BLUESLATE_SLAB = registerBlock("bronze_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(BRONZE_POLISHED_BLUESLATE)
			.slab(BRONZE_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block MOSSY_BRONZE_POLISHED_BLUESLATE = registerBlock("mossy_bronze_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_POLISHED_BLUESLATE_SLAB = registerBlock("mossy_bronze_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(MOSSY_BRONZE_POLISHED_BLUESLATE)
			.slab(MOSSY_BRONZE_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block OVERGROWN_BRONZE_POLISHED_BLUESLATE = registerBlock("overgrown_bronze_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_POLISHED_BLUESLATE_SLAB = registerBlock("overgrown_bronze_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_POLISHED_BLUESLATE)
			.slab(OVERGROWN_BRONZE_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block CRACKED_BRONZE_POLISHED_BLUESLATE = registerBlock("cracked_bronze_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_POLISHED_BLUESLATE_SLAB = registerBlock("cracked_bronze_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(CRACKED_BRONZE_POLISHED_BLUESLATE)
			.slab(CRACKED_BRONZE_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_POLISHED_BLUESLATE = registerBlock("mossy_cracked_bronze_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_POLISHED_BLUESLATE_SLAB = registerBlock("mossy_cracked_bronze_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_POLISHED_BLUESLATE)
			.slab(MOSSY_CRACKED_BRONZE_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_POLISHED_BLUESLATE = registerBlock("overgrown_cracked_bronze_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_POLISHED_BLUESLATE_SLAB = registerBlock("overgrown_cracked_bronze_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_POLISHED_BLUESLATE)
			.slab(OVERGROWN_CRACKED_BRONZE_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block SILVER_POLISHED_BLUESLATE = registerBlock("silver_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_POLISHED_BLUESLATE_SLAB = registerBlock("silver_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(SILVER_POLISHED_BLUESLATE)
			.slab(SILVER_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block MOSSY_SILVER_POLISHED_BLUESLATE = registerBlock("mossy_silver_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_POLISHED_BLUESLATE_SLAB = registerBlock("mossy_silver_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(MOSSY_SILVER_POLISHED_BLUESLATE)
			.slab(MOSSY_SILVER_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block OVERGROWN_SILVER_POLISHED_BLUESLATE = registerBlock("overgrown_silver_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_POLISHED_BLUESLATE_SLAB = registerBlock("overgrown_silver_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_POLISHED_BLUESLATE)
			.slab(OVERGROWN_SILVER_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block CRACKED_SILVER_POLISHED_BLUESLATE = registerBlock("cracked_silver_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_POLISHED_BLUESLATE_SLAB = registerBlock("cracked_silver_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(CRACKED_SILVER_POLISHED_BLUESLATE)
			.slab(CRACKED_SILVER_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block MOSSY_CRACKED_SILVER_POLISHED_BLUESLATE = registerBlock("mossy_cracked_silver_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_POLISHED_BLUESLATE_SLAB = registerBlock("mossy_cracked_silver_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_POLISHED_BLUESLATE)
			.slab(MOSSY_CRACKED_SILVER_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_POLISHED_BLUESLATE = registerBlock("overgrown_cracked_silver_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_POLISHED_BLUESLATE_SLAB = registerBlock("overgrown_cracked_silver_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_POLISHED_BLUESLATE)
			.slab(OVERGROWN_CRACKED_SILVER_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block GOLD_POLISHED_BLUESLATE = registerBlock("gold_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_POLISHED_BLUESLATE_SLAB = registerBlock("gold_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(GOLD_POLISHED_BLUESLATE)
			.slab(GOLD_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block MOSSY_GOLD_POLISHED_BLUESLATE = registerBlock("mossy_gold_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_POLISHED_BLUESLATE_SLAB = registerBlock("mossy_gold_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(MOSSY_GOLD_POLISHED_BLUESLATE)
			.slab(MOSSY_GOLD_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block OVERGROWN_GOLD_POLISHED_BLUESLATE = registerBlock("overgrown_gold_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_POLISHED_BLUESLATE_SLAB = registerBlock("overgrown_gold_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_POLISHED_BLUESLATE)
			.slab(OVERGROWN_GOLD_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block CRACKED_GOLD_POLISHED_BLUESLATE = registerBlock("cracked_gold_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_POLISHED_BLUESLATE_SLAB = registerBlock("cracked_gold_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(CRACKED_GOLD_POLISHED_BLUESLATE)
			.slab(CRACKED_GOLD_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block MOSSY_CRACKED_GOLD_POLISHED_BLUESLATE = registerBlock("mossy_cracked_gold_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_POLISHED_BLUESLATE_SLAB = registerBlock("mossy_cracked_gold_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_POLISHED_BLUESLATE)
			.slab(MOSSY_CRACKED_GOLD_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_POLISHED_BLUESLATE = registerBlock("overgrown_cracked_gold_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_POLISHED_BLUESLATE_SLAB = registerBlock("overgrown_cracked_gold_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_POLISHED_BLUESLATE)
			.slab(OVERGROWN_CRACKED_GOLD_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block GLOWSTONE_POLISHED_BLUESLATE = registerBlock("glowstone_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_POLISHED_BLUESLATE_SLAB = registerBlock("glowstone_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily GLOWSTONE_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(GLOWSTONE_POLISHED_BLUESLATE)
			.slab(GLOWSTONE_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block MOSSY_GLOWSTONE_POLISHED_BLUESLATE = registerBlock("mossy_glowstone_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_POLISHED_BLUESLATE_SLAB = registerBlock("mossy_glowstone_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily MOSSY_GLOWSTONE_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(MOSSY_GLOWSTONE_POLISHED_BLUESLATE)
			.slab(MOSSY_GLOWSTONE_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block OVERGROWN_GLOWSTONE_POLISHED_BLUESLATE = registerBlock("overgrown_glowstone_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_POLISHED_BLUESLATE_SLAB = registerBlock("overgrown_glowstone_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily OVERGROWN_GLOWSTONE_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(OVERGROWN_GLOWSTONE_POLISHED_BLUESLATE)
			.slab(OVERGROWN_GLOWSTONE_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block CRACKED_GLOWSTONE_POLISHED_BLUESLATE = registerBlock("cracked_glowstone_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_POLISHED_BLUESLATE_SLAB = registerBlock("cracked_glowstone_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily CRACKED_GLOWSTONE_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(CRACKED_GLOWSTONE_POLISHED_BLUESLATE)
			.slab(CRACKED_GLOWSTONE_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block MOSSY_CRACKED_GLOWSTONE_POLISHED_BLUESLATE = registerBlock("mossy_cracked_glowstone_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_POLISHED_BLUESLATE_SLAB = registerBlock("mossy_cracked_glowstone_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily MOSSY_CRACKED_GLOWSTONE_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GLOWSTONE_POLISHED_BLUESLATE)
			.slab(MOSSY_CRACKED_GLOWSTONE_POLISHED_BLUESLATE_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_GLOWSTONE_POLISHED_BLUESLATE = registerBlock("overgrown_cracked_glowstone_polished_blueslate",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_POLISHED_BLUESLATE_SLAB = registerBlock("overgrown_cracked_glowstone_polished_blueslate_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily OVERGROWN_CRACKED_GLOWSTONE_POLISHED_BLUESLATE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GLOWSTONE_POLISHED_BLUESLATE)
			.slab(OVERGROWN_CRACKED_GLOWSTONE_POLISHED_BLUESLATE_SLAB)
			.build();

	public static ModStoneSubSet POLISHED_BLUESLATE_SUBSET = new ModStoneSubSet(
			POLISHED_BLUESLATE_FAMILY,
			MOSSY_POLISHED_BLUESLATE_FAMILY,
			OVERGROWN_POLISHED_BLUESLATE_FAMILY,
			CRACKED_POLISHED_BLUESLATE_FAMILY, MOSSY_CRACKED_POLISHED_BLUESLATE_FAMILY, OVERGROWN_CRACKED_POLISHED_BLUESLATE_FAMILY,
			BRONZE_POLISHED_BLUESLATE_FAMILY, MOSSY_BRONZE_POLISHED_BLUESLATE_FAMILY, OVERGROWN_BRONZE_POLISHED_BLUESLATE_FAMILY,
			CRACKED_BRONZE_POLISHED_BLUESLATE_FAMILY, MOSSY_CRACKED_BRONZE_POLISHED_BLUESLATE_FAMILY, OVERGROWN_CRACKED_BRONZE_POLISHED_BLUESLATE_FAMILY,
			SILVER_POLISHED_BLUESLATE_FAMILY, MOSSY_SILVER_POLISHED_BLUESLATE_FAMILY, OVERGROWN_SILVER_POLISHED_BLUESLATE_FAMILY,
			CRACKED_SILVER_POLISHED_BLUESLATE_FAMILY, MOSSY_CRACKED_SILVER_POLISHED_BLUESLATE_FAMILY, OVERGROWN_CRACKED_SILVER_POLISHED_BLUESLATE_FAMILY,
			GOLD_POLISHED_BLUESLATE_FAMILY, MOSSY_GOLD_POLISHED_BLUESLATE_FAMILY, OVERGROWN_GOLD_POLISHED_BLUESLATE_FAMILY,
			CRACKED_GOLD_POLISHED_BLUESLATE_FAMILY, MOSSY_CRACKED_GOLD_POLISHED_BLUESLATE_FAMILY,
			OVERGROWN_CRACKED_GOLD_POLISHED_BLUESLATE_FAMILY,
			GLOWSTONE_POLISHED_BLUESLATE_FAMILY, MOSSY_GLOWSTONE_POLISHED_BLUESLATE_FAMILY, OVERGROWN_GLOWSTONE_POLISHED_BLUESLATE_FAMILY,
			CRACKED_GLOWSTONE_POLISHED_BLUESLATE_FAMILY, MOSSY_CRACKED_GLOWSTONE_POLISHED_BLUESLATE_FAMILY,
			OVERGROWN_CRACKED_GLOWSTONE_POLISHED_BLUESLATE_FAMILY, "polished_blueslate");

	public static Block BLUESLATE_PILLAR = registerBlock("blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BLUESLATE_PILLAR_SLAB = registerBlock("blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(BLUESLATE_PILLAR)
			.slab(BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block MOSSY_BLUESLATE_PILLAR = registerBlock("mossy_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BLUESLATE_PILLAR_SLAB = registerBlock("mossy_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(MOSSY_BLUESLATE_PILLAR)
			.slab(MOSSY_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_BLUESLATE_PILLAR = registerBlock("overgrown_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BLUESLATE_PILLAR_SLAB = registerBlock("overgrown_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_BLUESLATE_PILLAR)
			.slab(OVERGROWN_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block CRACKED_BLUESLATE_PILLAR = registerBlock("cracked_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(CRACKED_BLUESLATE_PILLAR)
			.slab(CRACKED_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block MOSSY_CRACKED_BLUESLATE_PILLAR = registerBlock("mossy_cracked_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BLUESLATE_PILLAR_SLAB = registerBlock("mossy_cracked_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BLUESLATE_PILLAR)
			.slab(MOSSY_CRACKED_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_BLUESLATE_PILLAR = registerBlock("overgrown_cracked_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BLUESLATE_PILLAR_SLAB = registerBlock("overgrown_cracked_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BLUESLATE_PILLAR)
			.slab(OVERGROWN_CRACKED_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block BRONZE_BLUESLATE_PILLAR = registerBlock("bronze_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_BLUESLATE_PILLAR_SLAB = registerBlock("bronze_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(BRONZE_BLUESLATE_PILLAR)
			.slab(BRONZE_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block MOSSY_BRONZE_BLUESLATE_PILLAR = registerBlock("mossy_bronze_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_BLUESLATE_PILLAR_SLAB = registerBlock("mossy_bronze_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(MOSSY_BRONZE_BLUESLATE_PILLAR)
			.slab(MOSSY_BRONZE_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_BRONZE_BLUESLATE_PILLAR = registerBlock("overgrown_bronze_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_BLUESLATE_PILLAR_SLAB = registerBlock("overgrown_bronze_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_BLUESLATE_PILLAR)
			.slab(OVERGROWN_BRONZE_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block CRACKED_BRONZE_BLUESLATE_PILLAR = registerBlock("cracked_bronze_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_bronze_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(CRACKED_BRONZE_BLUESLATE_PILLAR)
			.slab(CRACKED_BRONZE_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_BLUESLATE_PILLAR = registerBlock("mossy_cracked_bronze_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_BLUESLATE_PILLAR_SLAB = registerBlock("mossy_cracked_bronze_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_BLUESLATE_PILLAR)
			.slab(MOSSY_CRACKED_BRONZE_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_BLUESLATE_PILLAR = registerBlock("overgrown_cracked_bronze_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_BLUESLATE_PILLAR_SLAB = registerBlock("overgrown_cracked_bronze_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_BLUESLATE_PILLAR)
			.slab(OVERGROWN_CRACKED_BRONZE_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block SILVER_BLUESLATE_PILLAR = registerBlock("silver_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_BLUESLATE_PILLAR_SLAB = registerBlock("silver_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(SILVER_BLUESLATE_PILLAR)
			.slab(SILVER_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block MOSSY_SILVER_BLUESLATE_PILLAR = registerBlock("mossy_silver_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_BLUESLATE_PILLAR_SLAB = registerBlock("mossy_silver_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(MOSSY_SILVER_BLUESLATE_PILLAR)
			.slab(MOSSY_SILVER_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_SILVER_BLUESLATE_PILLAR = registerBlock("overgrown_silver_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_BLUESLATE_PILLAR_SLAB = registerBlock("overgrown_silver_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_BLUESLATE_PILLAR)
			.slab(OVERGROWN_SILVER_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block CRACKED_SILVER_BLUESLATE_PILLAR = registerBlock("cracked_silver_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_silver_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(CRACKED_SILVER_BLUESLATE_PILLAR)
			.slab(CRACKED_SILVER_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block MOSSY_CRACKED_SILVER_BLUESLATE_PILLAR = registerBlock("mossy_cracked_silver_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_BLUESLATE_PILLAR_SLAB = registerBlock("mossy_cracked_silver_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_BLUESLATE_PILLAR)
			.slab(MOSSY_CRACKED_SILVER_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_BLUESLATE_PILLAR = registerBlock("overgrown_cracked_silver_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_BLUESLATE_PILLAR_SLAB = registerBlock("overgrown_cracked_silver_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_BLUESLATE_PILLAR)
			.slab(OVERGROWN_CRACKED_SILVER_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block GOLD_BLUESLATE_PILLAR = registerBlock("gold_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_BLUESLATE_PILLAR_SLAB = registerBlock("gold_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(GOLD_BLUESLATE_PILLAR)
			.slab(GOLD_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block MOSSY_GOLD_BLUESLATE_PILLAR = registerBlock("mossy_gold_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_BLUESLATE_PILLAR_SLAB = registerBlock("mossy_gold_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(MOSSY_GOLD_BLUESLATE_PILLAR)
			.slab(MOSSY_GOLD_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_GOLD_BLUESLATE_PILLAR = registerBlock("overgrown_gold_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_BLUESLATE_PILLAR_SLAB = registerBlock("overgrown_gold_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_BLUESLATE_PILLAR)
			.slab(OVERGROWN_GOLD_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block CRACKED_GOLD_BLUESLATE_PILLAR = registerBlock("cracked_gold_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_gold_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(CRACKED_GOLD_BLUESLATE_PILLAR)
			.slab(CRACKED_GOLD_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block MOSSY_CRACKED_GOLD_BLUESLATE_PILLAR = registerBlock("mossy_cracked_gold_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_BLUESLATE_PILLAR_SLAB = registerBlock("mossy_cracked_gold_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_BLUESLATE_PILLAR)
			.slab(MOSSY_CRACKED_GOLD_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_BLUESLATE_PILLAR = registerBlock("overgrown_cracked_gold_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_BLUESLATE_PILLAR_SLAB = registerBlock("overgrown_cracked_gold_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_BLUESLATE_PILLAR)
			.slab(OVERGROWN_CRACKED_GOLD_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block GLOWSTONE_BLUESLATE_PILLAR = registerBlock("glowstone_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_BLUESLATE_PILLAR_SLAB = registerBlock("glowstone_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily GLOWSTONE_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(GLOWSTONE_BLUESLATE_PILLAR)
			.slab(GLOWSTONE_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block MOSSY_GLOWSTONE_BLUESLATE_PILLAR = registerBlock("mossy_glowstone_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_BLUESLATE_PILLAR_SLAB = registerBlock("mossy_glowstone_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily MOSSY_GLOWSTONE_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(MOSSY_GLOWSTONE_BLUESLATE_PILLAR)
			.slab(MOSSY_GLOWSTONE_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_GLOWSTONE_BLUESLATE_PILLAR = registerBlock("overgrown_glowstone_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_BLUESLATE_PILLAR_SLAB = registerBlock("overgrown_glowstone_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily OVERGROWN_GLOWSTONE_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_GLOWSTONE_BLUESLATE_PILLAR)
			.slab(OVERGROWN_GLOWSTONE_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block CRACKED_GLOWSTONE_BLUESLATE_PILLAR = registerBlock("cracked_glowstone_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_glowstone_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily CRACKED_GLOWSTONE_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(CRACKED_GLOWSTONE_BLUESLATE_PILLAR)
			.slab(CRACKED_GLOWSTONE_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block MOSSY_CRACKED_GLOWSTONE_BLUESLATE_PILLAR = registerBlock("mossy_cracked_glowstone_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_BLUESLATE_PILLAR_SLAB = registerBlock("mossy_cracked_glowstone_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily MOSSY_CRACKED_GLOWSTONE_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_PILLAR)
			.slab(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_PILLAR_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_PILLAR = registerBlock("overgrown_cracked_glowstone_blueslate_pillar",
			settings -> new ModPillarBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_PILLAR_SLAB = registerBlock("overgrown_cracked_glowstone_blueslate_pillar_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_PILLAR_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_PILLAR)
			.slab(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_PILLAR_SLAB)
			.build();

	public static ModStoneSubSet BLUESLATE_PILLAR_SUBSET = new ModStoneSubSet(
			BLUESLATE_PILLAR_FAMILY,
			MOSSY_BLUESLATE_PILLAR_FAMILY,
			OVERGROWN_BLUESLATE_PILLAR_FAMILY,
			CRACKED_BLUESLATE_PILLAR_FAMILY, MOSSY_CRACKED_BLUESLATE_PILLAR_FAMILY, OVERGROWN_CRACKED_BLUESLATE_PILLAR_FAMILY,
			BRONZE_BLUESLATE_PILLAR_FAMILY, MOSSY_BRONZE_BLUESLATE_PILLAR_FAMILY, OVERGROWN_BRONZE_BLUESLATE_PILLAR_FAMILY,
			CRACKED_BRONZE_BLUESLATE_PILLAR_FAMILY, MOSSY_CRACKED_BRONZE_BLUESLATE_PILLAR_FAMILY, OVERGROWN_CRACKED_BRONZE_BLUESLATE_PILLAR_FAMILY,
			SILVER_BLUESLATE_PILLAR_FAMILY, MOSSY_SILVER_BLUESLATE_PILLAR_FAMILY, OVERGROWN_SILVER_BLUESLATE_PILLAR_FAMILY,
			CRACKED_SILVER_BLUESLATE_PILLAR_FAMILY, MOSSY_CRACKED_SILVER_BLUESLATE_PILLAR_FAMILY, OVERGROWN_CRACKED_SILVER_BLUESLATE_PILLAR_FAMILY,
			GOLD_BLUESLATE_PILLAR_FAMILY, MOSSY_GOLD_BLUESLATE_PILLAR_FAMILY, OVERGROWN_GOLD_BLUESLATE_PILLAR_FAMILY,
			CRACKED_GOLD_BLUESLATE_PILLAR_FAMILY, MOSSY_CRACKED_GOLD_BLUESLATE_PILLAR_FAMILY,
			OVERGROWN_CRACKED_GOLD_BLUESLATE_PILLAR_FAMILY,
			GLOWSTONE_BLUESLATE_PILLAR_FAMILY, MOSSY_GLOWSTONE_BLUESLATE_PILLAR_FAMILY, OVERGROWN_GLOWSTONE_BLUESLATE_PILLAR_FAMILY,
			CRACKED_GLOWSTONE_BLUESLATE_PILLAR_FAMILY, MOSSY_CRACKED_GLOWSTONE_BLUESLATE_PILLAR_FAMILY,
			OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_PILLAR_FAMILY, "blueslate_pillar");

	public static Block BLUESLATE_FRIEZE = registerBlock("blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BLUESLATE_FRIEZE_SLAB = registerBlock("blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(BLUESLATE_FRIEZE)
			.slab(BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_BLUESLATE_FRIEZE = registerBlock("mossy_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BLUESLATE_FRIEZE_SLAB = registerBlock("mossy_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_BLUESLATE_FRIEZE)
			.slab(MOSSY_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_BLUESLATE_FRIEZE = registerBlock("overgrown_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BLUESLATE_FRIEZE_SLAB = registerBlock("overgrown_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_BLUESLATE_FRIEZE)
			.slab(OVERGROWN_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block CRACKED_BLUESLATE_FRIEZE = registerBlock("cracked_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BLUESLATE_FRIEZE_SLAB = registerBlock("cracked_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(CRACKED_BLUESLATE_FRIEZE)
			.slab(CRACKED_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_CRACKED_BLUESLATE_FRIEZE = registerBlock("mossy_cracked_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BLUESLATE_FRIEZE_SLAB = registerBlock("mossy_cracked_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BLUESLATE_FRIEZE)
			.slab(MOSSY_CRACKED_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_BLUESLATE_FRIEZE = registerBlock("overgrown_cracked_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BLUESLATE_FRIEZE_SLAB = registerBlock("overgrown_cracked_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BLUESLATE_FRIEZE)
			.slab(OVERGROWN_CRACKED_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block BRONZE_BLUESLATE_FRIEZE = registerBlock("bronze_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_BLUESLATE_FRIEZE_SLAB = registerBlock("bronze_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(BRONZE_BLUESLATE_FRIEZE)
			.slab(BRONZE_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_BRONZE_BLUESLATE_FRIEZE = registerBlock("mossy_bronze_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_BLUESLATE_FRIEZE_SLAB = registerBlock("mossy_bronze_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_BRONZE_BLUESLATE_FRIEZE)
			.slab(MOSSY_BRONZE_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_BRONZE_BLUESLATE_FRIEZE = registerBlock("overgrown_bronze_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_BLUESLATE_FRIEZE_SLAB = registerBlock("overgrown_bronze_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_BLUESLATE_FRIEZE)
			.slab(OVERGROWN_BRONZE_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block CRACKED_BRONZE_BLUESLATE_FRIEZE = registerBlock("cracked_bronze_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_BLUESLATE_FRIEZE_SLAB = registerBlock("cracked_bronze_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(CRACKED_BRONZE_BLUESLATE_FRIEZE)
			.slab(CRACKED_BRONZE_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_BLUESLATE_FRIEZE = registerBlock("mossy_cracked_bronze_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_BLUESLATE_FRIEZE_SLAB = registerBlock("mossy_cracked_bronze_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_BLUESLATE_FRIEZE)
			.slab(MOSSY_CRACKED_BRONZE_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_BLUESLATE_FRIEZE = registerBlock("overgrown_cracked_bronze_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_BLUESLATE_FRIEZE_SLAB = registerBlock("overgrown_cracked_bronze_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_BLUESLATE_FRIEZE)
			.slab(OVERGROWN_CRACKED_BRONZE_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block SILVER_BLUESLATE_FRIEZE = registerBlock("silver_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_BLUESLATE_FRIEZE_SLAB = registerBlock("silver_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(SILVER_BLUESLATE_FRIEZE)
			.slab(SILVER_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_SILVER_BLUESLATE_FRIEZE = registerBlock("mossy_silver_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_BLUESLATE_FRIEZE_SLAB = registerBlock("mossy_silver_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_SILVER_BLUESLATE_FRIEZE)
			.slab(MOSSY_SILVER_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_SILVER_BLUESLATE_FRIEZE = registerBlock("overgrown_silver_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_BLUESLATE_FRIEZE_SLAB = registerBlock("overgrown_silver_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_BLUESLATE_FRIEZE)
			.slab(OVERGROWN_SILVER_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block CRACKED_SILVER_BLUESLATE_FRIEZE = registerBlock("cracked_silver_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_BLUESLATE_FRIEZE_SLAB = registerBlock("cracked_silver_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(CRACKED_SILVER_BLUESLATE_FRIEZE)
			.slab(CRACKED_SILVER_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_CRACKED_SILVER_BLUESLATE_FRIEZE = registerBlock("mossy_cracked_silver_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_BLUESLATE_FRIEZE_SLAB = registerBlock("mossy_cracked_silver_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_BLUESLATE_FRIEZE)
			.slab(MOSSY_CRACKED_SILVER_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_BLUESLATE_FRIEZE = registerBlock("overgrown_cracked_silver_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_BLUESLATE_FRIEZE_SLAB = registerBlock("overgrown_cracked_silver_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_BLUESLATE_FRIEZE)
			.slab(OVERGROWN_CRACKED_SILVER_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block GOLD_BLUESLATE_FRIEZE = registerBlock("gold_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_BLUESLATE_FRIEZE_SLAB = registerBlock("gold_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(GOLD_BLUESLATE_FRIEZE)
			.slab(GOLD_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_GOLD_BLUESLATE_FRIEZE = registerBlock("mossy_gold_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_BLUESLATE_FRIEZE_SLAB = registerBlock("mossy_gold_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_GOLD_BLUESLATE_FRIEZE)
			.slab(MOSSY_GOLD_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_GOLD_BLUESLATE_FRIEZE = registerBlock("overgrown_gold_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_BLUESLATE_FRIEZE_SLAB = registerBlock("overgrown_gold_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_BLUESLATE_FRIEZE)
			.slab(OVERGROWN_GOLD_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block CRACKED_GOLD_BLUESLATE_FRIEZE = registerBlock("cracked_gold_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_BLUESLATE_FRIEZE_SLAB = registerBlock("cracked_gold_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(CRACKED_GOLD_BLUESLATE_FRIEZE)
			.slab(CRACKED_GOLD_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_CRACKED_GOLD_BLUESLATE_FRIEZE = registerBlock("mossy_cracked_gold_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_BLUESLATE_FRIEZE_SLAB = registerBlock("mossy_cracked_gold_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_BLUESLATE_FRIEZE)
			.slab(MOSSY_CRACKED_GOLD_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_BLUESLATE_FRIEZE = registerBlock("overgrown_cracked_gold_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_BLUESLATE_FRIEZE_SLAB = registerBlock("overgrown_cracked_gold_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_BLUESLATE_FRIEZE)
			.slab(OVERGROWN_CRACKED_GOLD_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block GLOWSTONE_BLUESLATE_FRIEZE = registerBlock("glowstone_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_BLUESLATE_FRIEZE_SLAB = registerBlock("glowstone_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily GLOWSTONE_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(GLOWSTONE_BLUESLATE_FRIEZE)
			.slab(GLOWSTONE_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_GLOWSTONE_BLUESLATE_FRIEZE = registerBlock("mossy_glowstone_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_BLUESLATE_FRIEZE_SLAB = registerBlock("mossy_glowstone_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily MOSSY_GLOWSTONE_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_GLOWSTONE_BLUESLATE_FRIEZE)
			.slab(MOSSY_GLOWSTONE_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_GLOWSTONE_BLUESLATE_FRIEZE = registerBlock("overgrown_glowstone_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_BLUESLATE_FRIEZE_SLAB = registerBlock("overgrown_glowstone_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily OVERGROWN_GLOWSTONE_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_GLOWSTONE_BLUESLATE_FRIEZE)
			.slab(OVERGROWN_GLOWSTONE_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block CRACKED_GLOWSTONE_BLUESLATE_FRIEZE = registerBlock("cracked_glowstone_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_BLUESLATE_FRIEZE_SLAB = registerBlock("cracked_glowstone_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily CRACKED_GLOWSTONE_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(CRACKED_GLOWSTONE_BLUESLATE_FRIEZE)
			.slab(CRACKED_GLOWSTONE_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block MOSSY_CRACKED_GLOWSTONE_BLUESLATE_FRIEZE = registerBlock("mossy_cracked_glowstone_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_BLUESLATE_FRIEZE_SLAB = registerBlock("mossy_cracked_glowstone_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily MOSSY_CRACKED_GLOWSTONE_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_FRIEZE)
			.slab(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_FRIEZE = registerBlock("overgrown_cracked_glowstone_blueslate_frieze",
			settings -> new ModFriezeBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_FRIEZE_SLAB = registerBlock("overgrown_cracked_glowstone_blueslate_frieze_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_FRIEZE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_FRIEZE)
			.slab(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_FRIEZE_SLAB)
			.build();

	public static ModStoneSubSet BLUESLATE_FRIEZE_SUBSET = new ModStoneSubSet(
			BLUESLATE_FRIEZE_FAMILY,
			MOSSY_BLUESLATE_FRIEZE_FAMILY,
			OVERGROWN_BLUESLATE_FRIEZE_FAMILY,
			CRACKED_BLUESLATE_FRIEZE_FAMILY, MOSSY_CRACKED_BLUESLATE_FRIEZE_FAMILY, OVERGROWN_CRACKED_BLUESLATE_FRIEZE_FAMILY,
			BRONZE_BLUESLATE_FRIEZE_FAMILY, MOSSY_BRONZE_BLUESLATE_FRIEZE_FAMILY, OVERGROWN_BRONZE_BLUESLATE_FRIEZE_FAMILY,
			CRACKED_BRONZE_BLUESLATE_FRIEZE_FAMILY, MOSSY_CRACKED_BRONZE_BLUESLATE_FRIEZE_FAMILY, OVERGROWN_CRACKED_BRONZE_BLUESLATE_FRIEZE_FAMILY,
			SILVER_BLUESLATE_FRIEZE_FAMILY, MOSSY_SILVER_BLUESLATE_FRIEZE_FAMILY, OVERGROWN_SILVER_BLUESLATE_FRIEZE_FAMILY,
			CRACKED_SILVER_BLUESLATE_FRIEZE_FAMILY, MOSSY_CRACKED_SILVER_BLUESLATE_FRIEZE_FAMILY, OVERGROWN_CRACKED_SILVER_BLUESLATE_FRIEZE_FAMILY,
			GOLD_BLUESLATE_FRIEZE_FAMILY, MOSSY_GOLD_BLUESLATE_FRIEZE_FAMILY, OVERGROWN_GOLD_BLUESLATE_FRIEZE_FAMILY,
			CRACKED_GOLD_BLUESLATE_FRIEZE_FAMILY, MOSSY_CRACKED_GOLD_BLUESLATE_FRIEZE_FAMILY,
			OVERGROWN_CRACKED_GOLD_BLUESLATE_FRIEZE_FAMILY,
			GLOWSTONE_BLUESLATE_FRIEZE_FAMILY, MOSSY_GLOWSTONE_BLUESLATE_FRIEZE_FAMILY, OVERGROWN_GLOWSTONE_BLUESLATE_FRIEZE_FAMILY,
			CRACKED_GLOWSTONE_BLUESLATE_FRIEZE_FAMILY, MOSSY_CRACKED_GLOWSTONE_BLUESLATE_FRIEZE_FAMILY,
			OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_FRIEZE_FAMILY, "blueslate_frieze");

	public static Block COBBLED_BLUESLATE_BRICKS = registerBlock("cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(COBBLED_BLUESLATE_BRICKS)
			.stairs(COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_COBBLED_BLUESLATE_BRICKS = registerBlock("mossy_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("mossy_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_COBBLED_BLUESLATE_BRICKS)
			.stairs(MOSSY_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_COBBLED_BLUESLATE_BRICKS = registerBlock("overgrown_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_COBBLED_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block CRACKED_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_COBBLED_BLUESLATE_BRICKS)
			.stairs(CRACKED_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_COBBLED_BLUESLATE_BRICKS = registerBlock("mossy_cracked_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_COBBLED_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_COBBLED_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_COBBLED_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block BRONZE_COBBLED_BLUESLATE_BRICKS = registerBlock("bronze_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("bronze_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(BRONZE_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("bronze_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("bronze_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(BRONZE_COBBLED_BLUESLATE_BRICKS)
			.stairs(BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(BRONZE_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(BRONZE_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_BRONZE_COBBLED_BLUESLATE_BRICKS = registerBlock("mossy_bronze_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_bronze_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_BRONZE_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("mossy_bronze_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("mossy_bronze_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_BRONZE_COBBLED_BLUESLATE_BRICKS)
			.stairs(MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICKS = registerBlock("overgrown_bronze_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_bronze_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_bronze_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("overgrown_bronze_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block CRACKED_BRONZE_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_bronze_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_bronze_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_BRONZE_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_bronze_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_bronze_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_BRONZE_COBBLED_BLUESLATE_BRICKS)
			.stairs(CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICKS = registerBlock("mossy_cracked_bronze_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_bronze_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_bronze_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_bronze_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_bronze_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_bronze_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_bronze_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_bronze_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block SILVER_COBBLED_BLUESLATE_BRICKS = registerBlock("silver_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("silver_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(SILVER_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("silver_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("silver_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(SILVER_COBBLED_BLUESLATE_BRICKS)
			.stairs(SILVER_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(SILVER_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(SILVER_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_SILVER_COBBLED_BLUESLATE_BRICKS = registerBlock("mossy_silver_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_silver_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_SILVER_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("mossy_silver_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("mossy_silver_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_SILVER_COBBLED_BLUESLATE_BRICKS)
			.stairs(MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICKS = registerBlock("overgrown_silver_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_silver_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_silver_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("overgrown_silver_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block CRACKED_SILVER_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_silver_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_silver_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_SILVER_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_silver_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_silver_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_SILVER_COBBLED_BLUESLATE_BRICKS)
			.stairs(CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_SILVER_COBBLED_BLUESLATE_BRICKS = registerBlock("mossy_cracked_silver_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_silver_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_SILVER_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_silver_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_silver_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_COBBLED_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_COBBLED_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_silver_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_silver_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_SILVER_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_silver_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_silver_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_COBBLED_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block GOLD_COBBLED_BLUESLATE_BRICKS = registerBlock("gold_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("gold_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(GOLD_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("gold_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("gold_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(GOLD_COBBLED_BLUESLATE_BRICKS)
			.stairs(GOLD_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(GOLD_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(GOLD_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_GOLD_COBBLED_BLUESLATE_BRICKS = registerBlock("mossy_gold_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_gold_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_GOLD_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("mossy_gold_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("mossy_gold_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_GOLD_COBBLED_BLUESLATE_BRICKS)
			.stairs(MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICKS = registerBlock("overgrown_gold_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_gold_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_gold_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_WALL = registerBlock(
			"overgrown_gold_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block CRACKED_GOLD_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_gold_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_gold_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_GOLD_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_gold_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_gold_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_GOLD_COBBLED_BLUESLATE_BRICKS)
			.stairs(CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_GOLD_COBBLED_BLUESLATE_BRICKS = registerBlock("mossy_cracked_gold_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_gold_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GOLD_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_gold_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_gold_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_COBBLED_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_COBBLED_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_gold_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_gold_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GOLD_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_gold_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_gold_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_COBBLED_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block GLOWSTONE_COBBLED_BLUESLATE_BRICKS = registerBlock("glowstone_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("glowstone_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(GLOWSTONE_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("glowstone_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("glowstone_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily GLOWSTONE_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(GLOWSTONE_COBBLED_BLUESLATE_BRICKS)
			.stairs(GLOWSTONE_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(GLOWSTONE_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(GLOWSTONE_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_GLOWSTONE_COBBLED_BLUESLATE_BRICKS = registerBlock("mossy_glowstone_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_glowstone_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_GLOWSTONE_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("mossy_glowstone_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("mossy_glowstone_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily MOSSY_GLOWSTONE_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_GLOWSTONE_COBBLED_BLUESLATE_BRICKS)
			.stairs(MOSSY_GLOWSTONE_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_GLOWSTONE_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_GLOWSTONE_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_GLOWSTONE_COBBLED_BLUESLATE_BRICKS = registerBlock("overgrown_glowstone_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_glowstone_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_GLOWSTONE_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_glowstone_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("overgrown_glowstone_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily OVERGROWN_GLOWSTONE_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_GLOWSTONE_COBBLED_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_GLOWSTONE_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_GLOWSTONE_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_GLOWSTONE_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_glowstone_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_glowstone_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_glowstone_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_glowstone_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICKS)
			.stairs(CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICKS = registerBlock("mossy_cracked_glowstone_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_glowstone_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_glowstone_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_glowstone_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily MOSSY_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_glowstone_cobbled_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_glowstone_cobbled_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_glowstone_cobbled_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_glowstone_cobbled_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily OVERGROWN_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_WALL)
			.build();

	public static ModStoneSubSet COBBLED_BLUESLATE_BRICK_SUBSET = new ModStoneSubSet(
			COBBLED_BLUESLATE_BRICK_FAMILY,
			MOSSY_COBBLED_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_COBBLED_BLUESLATE_BRICK_FAMILY,
			CRACKED_COBBLED_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_COBBLED_BLUESLATE_BRICK_FAMILY, OVERGROWN_CRACKED_COBBLED_BLUESLATE_BRICK_FAMILY,
			BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY, MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY, OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY,
			CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY, OVERGROWN_CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY,
			SILVER_COBBLED_BLUESLATE_BRICK_FAMILY, MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY,
			CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY, OVERGROWN_CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY,
			GOLD_COBBLED_BLUESLATE_BRICK_FAMILY, MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY, OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY,
			CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY,
			GLOWSTONE_COBBLED_BLUESLATE_BRICK_FAMILY, MOSSY_GLOWSTONE_COBBLED_BLUESLATE_BRICK_FAMILY, OVERGROWN_GLOWSTONE_COBBLED_BLUESLATE_BRICK_FAMILY,
			CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_CRACKED_GLOWSTONE_COBBLED_BLUESLATE_BRICK_FAMILY, "cobbled_blueslate_brick");

	public static Block RUSTIC_BLUESLATE_BRICKS = registerBlock("rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(RUSTIC_BLUESLATE_BRICKS)
			.stairs(RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_RUSTIC_BLUESLATE_BRICKS = registerBlock("mossy_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("mossy_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("mossy_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_RUSTIC_BLUESLATE_BRICKS)
			.stairs(MOSSY_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_RUSTIC_BLUESLATE_BRICKS = registerBlock("overgrown_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("overgrown_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_RUSTIC_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block CRACKED_RUSTIC_BLUESLATE_BRICKS = registerBlock("cracked_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("cracked_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("cracked_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_RUSTIC_BLUESLATE_BRICKS)
			.stairs(CRACKED_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_RUSTIC_BLUESLATE_BRICKS = registerBlock("mossy_cracked_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_RUSTIC_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_RUSTIC_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_RUSTIC_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block BRONZE_RUSTIC_BLUESLATE_BRICKS = registerBlock("bronze_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("bronze_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(BRONZE_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("bronze_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("bronze_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(BRONZE_RUSTIC_BLUESLATE_BRICKS)
			.stairs(BRONZE_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(BRONZE_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(BRONZE_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_BRONZE_RUSTIC_BLUESLATE_BRICKS = registerBlock("mossy_bronze_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_bronze_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_BRONZE_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("mossy_bronze_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("mossy_bronze_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_BRONZE_RUSTIC_BLUESLATE_BRICKS)
			.stairs(MOSSY_BRONZE_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_BRONZE_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_BRONZE_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_BRONZE_RUSTIC_BLUESLATE_BRICKS = registerBlock("overgrown_bronze_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_bronze_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_BRONZE_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_bronze_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("overgrown_bronze_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_RUSTIC_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_BRONZE_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_BRONZE_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_BRONZE_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICKS = registerBlock("cracked_bronze_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_bronze_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("cracked_bronze_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("cracked_bronze_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICKS)
			.stairs(CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICKS = registerBlock("mossy_cracked_bronze_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_bronze_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_bronze_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_bronze_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_bronze_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_bronze_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_bronze_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_bronze_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block SILVER_RUSTIC_BLUESLATE_BRICKS = registerBlock("silver_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("silver_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(SILVER_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("silver_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("silver_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(SILVER_RUSTIC_BLUESLATE_BRICKS)
			.stairs(SILVER_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(SILVER_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(SILVER_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_SILVER_RUSTIC_BLUESLATE_BRICKS = registerBlock("mossy_silver_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_silver_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_SILVER_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("mossy_silver_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("mossy_silver_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_SILVER_RUSTIC_BLUESLATE_BRICKS)
			.stairs(MOSSY_SILVER_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_SILVER_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_SILVER_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_SILVER_RUSTIC_BLUESLATE_BRICKS = registerBlock("overgrown_silver_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_silver_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_SILVER_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_silver_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("overgrown_silver_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_RUSTIC_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_SILVER_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_SILVER_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_SILVER_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block CRACKED_SILVER_RUSTIC_BLUESLATE_BRICKS = registerBlock("cracked_silver_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_silver_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_SILVER_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("cracked_silver_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("cracked_silver_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_SILVER_RUSTIC_BLUESLATE_BRICKS)
			.stairs(CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICKS = registerBlock("mossy_cracked_silver_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_silver_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_silver_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_silver_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_silver_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_silver_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_silver_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_silver_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block GOLD_RUSTIC_BLUESLATE_BRICKS = registerBlock("gold_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("gold_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(GOLD_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("gold_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("gold_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(GOLD_RUSTIC_BLUESLATE_BRICKS)
			.stairs(GOLD_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(GOLD_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(GOLD_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_GOLD_RUSTIC_BLUESLATE_BRICKS = registerBlock("mossy_gold_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_gold_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_GOLD_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("mossy_gold_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("mossy_gold_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_GOLD_RUSTIC_BLUESLATE_BRICKS)
			.stairs(MOSSY_GOLD_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_GOLD_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_GOLD_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_GOLD_RUSTIC_BLUESLATE_BRICKS = registerBlock("overgrown_gold_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_gold_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_GOLD_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_gold_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock(
			"overgrown_gold_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_RUSTIC_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_GOLD_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_GOLD_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_GOLD_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block CRACKED_GOLD_RUSTIC_BLUESLATE_BRICKS = registerBlock("cracked_gold_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_gold_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_GOLD_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("cracked_gold_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("cracked_gold_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_GOLD_RUSTIC_BLUESLATE_BRICKS)
			.stairs(CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICKS = registerBlock("mossy_cracked_gold_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_gold_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_gold_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_gold_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_gold_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_gold_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_gold_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_gold_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block GLOWSTONE_RUSTIC_BLUESLATE_BRICKS = registerBlock("glowstone_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("glowstone_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(GLOWSTONE_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("glowstone_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("glowstone_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily GLOWSTONE_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(GLOWSTONE_RUSTIC_BLUESLATE_BRICKS)
			.stairs(GLOWSTONE_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(GLOWSTONE_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(GLOWSTONE_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_GLOWSTONE_RUSTIC_BLUESLATE_BRICKS = registerBlock("mossy_glowstone_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_glowstone_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_GLOWSTONE_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("mossy_glowstone_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("mossy_glowstone_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily MOSSY_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_GLOWSTONE_RUSTIC_BLUESLATE_BRICKS)
			.stairs(MOSSY_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_GLOWSTONE_RUSTIC_BLUESLATE_BRICKS = registerBlock("overgrown_glowstone_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_glowstone_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_GLOWSTONE_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_glowstone_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("overgrown_glowstone_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily OVERGROWN_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_GLOWSTONE_RUSTIC_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICKS = registerBlock("cracked_glowstone_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_glowstone_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("cracked_glowstone_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("cracked_glowstone_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICKS)
			.stairs(CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICKS = registerBlock("mossy_cracked_glowstone_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_glowstone_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_glowstone_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_glowstone_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily MOSSY_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_glowstone_rustic_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_glowstone_rustic_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_glowstone_rustic_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_glowstone_rustic_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily OVERGROWN_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_WALL)
			.build();

	public static ModStoneSubSet RUSTIC_BLUESLATE_BRICK_SUBSET = new ModStoneSubSet(
			RUSTIC_BLUESLATE_BRICK_FAMILY,
			MOSSY_RUSTIC_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_RUSTIC_BLUESLATE_BRICK_FAMILY,
			CRACKED_RUSTIC_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_RUSTIC_BLUESLATE_BRICK_FAMILY, OVERGROWN_CRACKED_RUSTIC_BLUESLATE_BRICK_FAMILY,
			BRONZE_RUSTIC_BLUESLATE_BRICK_FAMILY, MOSSY_BRONZE_RUSTIC_BLUESLATE_BRICK_FAMILY, OVERGROWN_BRONZE_RUSTIC_BLUESLATE_BRICK_FAMILY,
			CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_FAMILY, OVERGROWN_CRACKED_BRONZE_RUSTIC_BLUESLATE_BRICK_FAMILY,
			SILVER_RUSTIC_BLUESLATE_BRICK_FAMILY, MOSSY_SILVER_RUSTIC_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_SILVER_RUSTIC_BLUESLATE_BRICK_FAMILY,
			CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_FAMILY, OVERGROWN_CRACKED_SILVER_RUSTIC_BLUESLATE_BRICK_FAMILY,
			GOLD_RUSTIC_BLUESLATE_BRICK_FAMILY, MOSSY_GOLD_RUSTIC_BLUESLATE_BRICK_FAMILY, OVERGROWN_GOLD_RUSTIC_BLUESLATE_BRICK_FAMILY,
			CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_CRACKED_GOLD_RUSTIC_BLUESLATE_BRICK_FAMILY,
			GLOWSTONE_RUSTIC_BLUESLATE_BRICK_FAMILY, MOSSY_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_FAMILY, OVERGROWN_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_FAMILY,
			CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_CRACKED_GLOWSTONE_RUSTIC_BLUESLATE_BRICK_FAMILY, "rustic_blueslate_brick");

	public static Block BLUESLATE_BRICKS = registerBlock("blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BLUESLATE_BRICK_STAIRS = registerBlock("blueslate_brick_stairs",
			settings -> new StairsBlock(BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BLUESLATE_BRICK_SLAB = registerBlock("blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BLUESLATE_BRICK_WALL = registerBlock("blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CHISELED_BLUESLATE_BRICK = registerBlock("chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BLUESLATE_BRICK_FAMILY = BlockFamilies.register(BLUESLATE_BRICKS)
			.stairs(BLUESLATE_BRICK_STAIRS)
			.slab(BLUESLATE_BRICK_SLAB)
			.wall(BLUESLATE_BRICK_WALL)
			.chiseled(CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block MOSSY_BLUESLATE_BRICKS = registerBlock("mossy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BLUESLATE_BRICK_SLAB = registerBlock("mossy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BLUESLATE_BRICK_WALL = registerBlock("mossy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CHISELED_BLUESLATE_BRICK = registerBlock("mossy_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_BLUESLATE_BRICKS)
			.stairs(MOSSY_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_BLUESLATE_BRICK_WALL)
			.chiseled(MOSSY_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block OVERGROWN_BLUESLATE_BRICKS = registerBlock("overgrown_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BLUESLATE_BRICK_WALL = registerBlock("overgrown_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CHISELED_BLUESLATE_BRICK = registerBlock("overgrown_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_BLUESLATE_BRICK_WALL)
			.chiseled(OVERGROWN_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block CRACKED_BLUESLATE_BRICKS = registerBlock("cracked_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BLUESLATE_BRICK_WALL = registerBlock("cracked_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_CHISELED_BLUESLATE_BRICK = registerBlock("cracked_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_BLUESLATE_BRICKS)
			.stairs(CRACKED_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_BLUESLATE_BRICK_WALL)
			.chiseled(CRACKED_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block MOSSY_CRACKED_BLUESLATE_BRICKS = registerBlock("mossy_cracked_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_CHISELED_BLUESLATE_BRICK = registerBlock("mossy_cracked_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_BLUESLATE_BRICK_WALL)
			.chiseled(MOSSY_CRACKED_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block OVERGROWN_CRACKED_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_CHISELED_BLUESLATE_BRICK = registerBlock(
			"overgrown_cracked_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_BLUESLATE_BRICK_WALL)
			.chiseled(OVERGROWN_CRACKED_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block BRONZE_BLUESLATE_BRICKS = registerBlock("bronze_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_BLUESLATE_BRICK_STAIRS = registerBlock("bronze_blueslate_brick_stairs",
			settings -> new StairsBlock(BRONZE_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_BLUESLATE_BRICK_SLAB = registerBlock("bronze_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_BLUESLATE_BRICK_WALL = registerBlock("bronze_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_CHISELED_BLUESLATE_BRICK = registerBlock("bronze_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(BRONZE_BLUESLATE_BRICKS)
			.stairs(BRONZE_BLUESLATE_BRICK_STAIRS)
			.slab(BRONZE_BLUESLATE_BRICK_SLAB)
			.wall(BRONZE_BLUESLATE_BRICK_WALL)
			.chiseled(BRONZE_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block MOSSY_BRONZE_BLUESLATE_BRICKS = registerBlock("mossy_bronze_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_bronze_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_BRONZE_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_BLUESLATE_BRICK_SLAB = registerBlock("mossy_bronze_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_BLUESLATE_BRICK_WALL = registerBlock("mossy_bronze_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_CHISELED_BLUESLATE_BRICK = registerBlock("mossy_bronze_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_BRONZE_BLUESLATE_BRICKS)
			.stairs(MOSSY_BRONZE_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_BRONZE_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_BRONZE_BLUESLATE_BRICK_WALL)
			.chiseled(MOSSY_BRONZE_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block OVERGROWN_BRONZE_BLUESLATE_BRICKS = registerBlock("overgrown_bronze_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_bronze_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_BRONZE_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_bronze_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_BLUESLATE_BRICK_WALL = registerBlock("overgrown_bronze_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_CHISELED_BLUESLATE_BRICK = registerBlock(
			"overgrown_bronze_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_BRONZE_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_BRONZE_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_BRONZE_BLUESLATE_BRICK_WALL)
			.chiseled(OVERGROWN_BRONZE_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block CRACKED_BRONZE_BLUESLATE_BRICKS = registerBlock("cracked_bronze_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_bronze_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_BRONZE_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_BLUESLATE_BRICK_SLAB = registerBlock("cracked_bronze_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_BLUESLATE_BRICK_WALL = registerBlock("cracked_bronze_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_CHISELED_BLUESLATE_BRICK = registerBlock("cracked_bronze_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_BRONZE_BLUESLATE_BRICKS)
			.stairs(CRACKED_BRONZE_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_BRONZE_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_BRONZE_BLUESLATE_BRICK_WALL)
			.chiseled(CRACKED_BRONZE_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_BLUESLATE_BRICKS = registerBlock("mossy_cracked_bronze_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_bronze_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_BRONZE_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_bronze_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_bronze_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_CHISELED_BLUESLATE_BRICK = registerBlock("mossy_cracked_bronze_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_BRONZE_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_BRONZE_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_BRONZE_BLUESLATE_BRICK_WALL)
			.chiseled(MOSSY_CRACKED_BRONZE_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_bronze_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_bronze_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_BRONZE_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_bronze_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_bronze_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_CHISELED_BLUESLATE_BRICK = registerBlock("overgrown_cracked_bronze_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_BRONZE_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_BRONZE_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_BRONZE_BLUESLATE_BRICK_WALL)
			.chiseled(OVERGROWN_CRACKED_BRONZE_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block SILVER_BLUESLATE_BRICKS = registerBlock("silver_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_BLUESLATE_BRICK_STAIRS = registerBlock("silver_blueslate_brick_stairs",
			settings -> new StairsBlock(SILVER_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_BLUESLATE_BRICK_SLAB = registerBlock("silver_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_BLUESLATE_BRICK_WALL = registerBlock("silver_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_CHISELED_BLUESLATE_BRICK = registerBlock("silver_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(SILVER_BLUESLATE_BRICKS)
			.stairs(SILVER_BLUESLATE_BRICK_STAIRS)
			.slab(SILVER_BLUESLATE_BRICK_SLAB)
			.wall(SILVER_BLUESLATE_BRICK_WALL)
			.chiseled(SILVER_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block MOSSY_SILVER_BLUESLATE_BRICKS = registerBlock("mossy_silver_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_silver_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_SILVER_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_BLUESLATE_BRICK_SLAB = registerBlock("mossy_silver_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_BLUESLATE_BRICK_WALL = registerBlock("mossy_silver_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_CHISELED_BLUESLATE_BRICK = registerBlock("mossy_silver_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_SILVER_BLUESLATE_BRICKS)
			.stairs(MOSSY_SILVER_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_SILVER_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_SILVER_BLUESLATE_BRICK_WALL)
			.chiseled(MOSSY_SILVER_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block OVERGROWN_SILVER_BLUESLATE_BRICKS = registerBlock("overgrown_silver_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_silver_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_SILVER_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_silver_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_BLUESLATE_BRICK_WALL = registerBlock("overgrown_silver_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_CHISELED_BLUESLATE_BRICK = registerBlock("overgrown_silver_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_SILVER_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_SILVER_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_SILVER_BLUESLATE_BRICK_WALL)
			.chiseled(OVERGROWN_SILVER_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block CRACKED_SILVER_BLUESLATE_BRICKS = registerBlock("cracked_silver_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_silver_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_SILVER_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_BLUESLATE_BRICK_SLAB = registerBlock("cracked_silver_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_BLUESLATE_BRICK_WALL = registerBlock("cracked_silver_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_CHISELED_BLUESLATE_BRICK = registerBlock("cracked_silver_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_SILVER_BLUESLATE_BRICKS)
			.stairs(CRACKED_SILVER_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_SILVER_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_SILVER_BLUESLATE_BRICK_WALL)
			.chiseled(CRACKED_SILVER_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block MOSSY_CRACKED_SILVER_BLUESLATE_BRICKS = registerBlock("mossy_cracked_silver_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_silver_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_SILVER_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_silver_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_silver_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_CHISELED_BLUESLATE_BRICK = registerBlock("mossy_cracked_silver_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_SILVER_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_SILVER_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_SILVER_BLUESLATE_BRICK_WALL)
			.chiseled(MOSSY_CRACKED_SILVER_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_silver_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_silver_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_SILVER_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_silver_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_silver_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_CHISELED_BLUESLATE_BRICK = registerBlock("overgrown_cracked_silver_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_SILVER_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_SILVER_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_SILVER_BLUESLATE_BRICK_WALL)
			.chiseled(OVERGROWN_CRACKED_SILVER_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block GOLD_BLUESLATE_BRICKS = registerBlock("gold_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_BLUESLATE_BRICK_STAIRS = registerBlock("gold_blueslate_brick_stairs",
			settings -> new StairsBlock(GOLD_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_BLUESLATE_BRICK_SLAB = registerBlock("gold_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_BLUESLATE_BRICK_WALL = registerBlock("gold_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_CHISELED_BLUESLATE_BRICK = registerBlock("gold_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(GOLD_BLUESLATE_BRICKS)
			.stairs(GOLD_BLUESLATE_BRICK_STAIRS)
			.slab(GOLD_BLUESLATE_BRICK_SLAB)
			.wall(GOLD_BLUESLATE_BRICK_WALL)
			.chiseled(GOLD_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block MOSSY_GOLD_BLUESLATE_BRICKS = registerBlock("mossy_gold_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_gold_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_GOLD_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_BLUESLATE_BRICK_SLAB = registerBlock("mossy_gold_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_BLUESLATE_BRICK_WALL = registerBlock("mossy_gold_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_CHISELED_BLUESLATE_BRICK = registerBlock("mossy_gold_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_GOLD_BLUESLATE_BRICKS)
			.stairs(MOSSY_GOLD_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_GOLD_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_GOLD_BLUESLATE_BRICK_WALL)
			.chiseled(MOSSY_GOLD_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block OVERGROWN_GOLD_BLUESLATE_BRICKS = registerBlock("overgrown_gold_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_gold_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_GOLD_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_gold_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_BLUESLATE_BRICK_WALL = registerBlock("overgrown_gold_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_CHISELED_BLUESLATE_BRICK = registerBlock("overgrown_gold_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_GOLD_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_GOLD_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_GOLD_BLUESLATE_BRICK_WALL)
			.chiseled(OVERGROWN_GOLD_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block CRACKED_GOLD_BLUESLATE_BRICKS = registerBlock("cracked_gold_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_gold_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_GOLD_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_BLUESLATE_BRICK_SLAB = registerBlock("cracked_gold_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_BLUESLATE_BRICK_WALL = registerBlock("cracked_gold_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_CHISELED_BLUESLATE_BRICK = registerBlock("cracked_gold_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_GOLD_BLUESLATE_BRICKS)
			.stairs(CRACKED_GOLD_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_GOLD_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_GOLD_BLUESLATE_BRICK_WALL)
			.chiseled(CRACKED_GOLD_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block MOSSY_CRACKED_GOLD_BLUESLATE_BRICKS = registerBlock("mossy_cracked_gold_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_gold_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GOLD_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_gold_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_gold_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_CHISELED_BLUESLATE_BRICK = registerBlock("mossy_cracked_gold_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_GOLD_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_GOLD_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_GOLD_BLUESLATE_BRICK_WALL)
			.chiseled(MOSSY_CRACKED_GOLD_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_gold_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_gold_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GOLD_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_gold_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_gold_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_CHISELED_BLUESLATE_BRICK = registerBlock("overgrown_cracked_gold_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_GOLD_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_GOLD_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_GOLD_BLUESLATE_BRICK_WALL)
			.chiseled(OVERGROWN_CRACKED_GOLD_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block GLOWSTONE_BLUESLATE_BRICKS = registerBlock("glowstone_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_BLUESLATE_BRICK_STAIRS = registerBlock("glowstone_blueslate_brick_stairs",
			settings -> new StairsBlock(GLOWSTONE_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_BLUESLATE_BRICK_SLAB = registerBlock("glowstone_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_BLUESLATE_BRICK_WALL = registerBlock("glowstone_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_CHISELED_BLUESLATE_BRICK = registerBlock("glowstone_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily GLOWSTONE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(GLOWSTONE_BLUESLATE_BRICKS)
			.stairs(GLOWSTONE_BLUESLATE_BRICK_STAIRS)
			.slab(GLOWSTONE_BLUESLATE_BRICK_SLAB)
			.wall(GLOWSTONE_BLUESLATE_BRICK_WALL)
			.chiseled(GLOWSTONE_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block MOSSY_GLOWSTONE_BLUESLATE_BRICKS = registerBlock("mossy_glowstone_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_glowstone_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_GLOWSTONE_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_BLUESLATE_BRICK_SLAB = registerBlock("mossy_glowstone_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_BLUESLATE_BRICK_WALL = registerBlock("mossy_glowstone_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_CHISELED_BLUESLATE_BRICK = registerBlock("mossy_glowstone_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily MOSSY_GLOWSTONE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_GLOWSTONE_BLUESLATE_BRICKS)
			.stairs(MOSSY_GLOWSTONE_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_GLOWSTONE_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_GLOWSTONE_BLUESLATE_BRICK_WALL)
			.chiseled(MOSSY_GLOWSTONE_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block OVERGROWN_GLOWSTONE_BLUESLATE_BRICKS = registerBlock("overgrown_glowstone_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_glowstone_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_GLOWSTONE_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_glowstone_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_BLUESLATE_BRICK_WALL = registerBlock("overgrown_glowstone_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_CHISELED_BLUESLATE_BRICK = registerBlock("overgrown_glowstone_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily OVERGROWN_GLOWSTONE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_GLOWSTONE_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_GLOWSTONE_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_GLOWSTONE_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_GLOWSTONE_BLUESLATE_BRICK_WALL)
			.chiseled(OVERGROWN_GLOWSTONE_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block CRACKED_GLOWSTONE_BLUESLATE_BRICKS = registerBlock("cracked_glowstone_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_glowstone_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_GLOWSTONE_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_BLUESLATE_BRICK_SLAB = registerBlock("cracked_glowstone_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_BLUESLATE_BRICK_WALL = registerBlock("cracked_glowstone_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_CHISELED_BLUESLATE_BRICK = registerBlock("cracked_glowstone_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily CRACKED_GLOWSTONE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_GLOWSTONE_BLUESLATE_BRICKS)
			.stairs(CRACKED_GLOWSTONE_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_GLOWSTONE_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_GLOWSTONE_BLUESLATE_BRICK_WALL)
			.chiseled(CRACKED_GLOWSTONE_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block MOSSY_CRACKED_GLOWSTONE_BLUESLATE_BRICKS = registerBlock("mossy_cracked_glowstone_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_glowstone_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_glowstone_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_glowstone_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_CHISELED_BLUESLATE_BRICK = registerBlock("mossy_cracked_glowstone_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily MOSSY_CRACKED_GLOWSTONE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_BRICK_WALL)
			.chiseled(MOSSY_CRACKED_GLOWSTONE_CHISELED_BLUESLATE_BRICK)
			.build();

	public static Block OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_glowstone_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_glowstone_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_glowstone_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_glowstone_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_CHISELED_BLUESLATE_BRICK = registerBlock("overgrown_cracked_glowstone_chiseled_blueslate_brick",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_BRICK_WALL)
			.chiseled(OVERGROWN_CRACKED_GLOWSTONE_CHISELED_BLUESLATE_BRICK)
			.build();

	public static ModStoneSubSet BLUESLATE_BRICK_SUBSET = new ModStoneSubSet(
			BLUESLATE_BRICK_FAMILY,
			MOSSY_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_BLUESLATE_BRICK_FAMILY,
			CRACKED_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_BLUESLATE_BRICK_FAMILY, OVERGROWN_CRACKED_BLUESLATE_BRICK_FAMILY,
			BRONZE_BLUESLATE_BRICK_FAMILY, MOSSY_BRONZE_BLUESLATE_BRICK_FAMILY, OVERGROWN_BRONZE_BLUESLATE_BRICK_FAMILY,
			CRACKED_BRONZE_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_BRONZE_BLUESLATE_BRICK_FAMILY, OVERGROWN_CRACKED_BRONZE_BLUESLATE_BRICK_FAMILY,
			SILVER_BLUESLATE_BRICK_FAMILY, MOSSY_SILVER_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_SILVER_BLUESLATE_BRICK_FAMILY,
			CRACKED_SILVER_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_SILVER_BLUESLATE_BRICK_FAMILY, OVERGROWN_CRACKED_SILVER_BLUESLATE_BRICK_FAMILY,
			GOLD_BLUESLATE_BRICK_FAMILY, MOSSY_GOLD_BLUESLATE_BRICK_FAMILY, OVERGROWN_GOLD_BLUESLATE_BRICK_FAMILY,
			CRACKED_GOLD_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_GOLD_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_CRACKED_GOLD_BLUESLATE_BRICK_FAMILY,
			GLOWSTONE_BLUESLATE_BRICK_FAMILY, MOSSY_GLOWSTONE_BLUESLATE_BRICK_FAMILY, OVERGROWN_GLOWSTONE_BLUESLATE_BRICK_FAMILY,
			CRACKED_GLOWSTONE_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_GLOWSTONE_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_BRICK_FAMILY, "blueslate_brick");

	public static Block BLUESLATE_TILES = registerBlock("blueslate_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BLUESLATE_TILE_STAIRS = registerBlock("blueslate_tile_stairs",
			settings -> new StairsBlock(BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BLUESLATE_TILE_SLAB = registerBlock("blueslate_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BLUESLATE_TILE_WALL = registerBlock("blueslate_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BLUESLATE_TILE_FAMILY = BlockFamilies.register(BLUESLATE_TILES)
			.stairs(BLUESLATE_TILE_STAIRS)
			.slab(BLUESLATE_TILE_SLAB)
			.wall(BLUESLATE_TILE_WALL)
			.build();

	public static Block MOSSY_BLUESLATE_TILES = registerBlock("mossy_blueslate_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BLUESLATE_TILE_STAIRS = registerBlock("mossy_blueslate_tile_stairs",
			settings -> new StairsBlock(MOSSY_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BLUESLATE_TILE_SLAB = registerBlock("mossy_blueslate_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BLUESLATE_TILE_WALL = registerBlock("mossy_blueslate_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BLUESLATE_TILE_FAMILY = BlockFamilies.register(MOSSY_BLUESLATE_TILES)
			.stairs(MOSSY_BLUESLATE_TILE_STAIRS)
			.slab(MOSSY_BLUESLATE_TILE_SLAB)
			.wall(MOSSY_BLUESLATE_TILE_WALL)
			.build();

	public static Block OVERGROWN_BLUESLATE_TILES = registerBlock("overgrown_blueslate_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BLUESLATE_TILE_STAIRS = registerBlock("overgrown_blueslate_tile_stairs",
			settings -> new StairsBlock(OVERGROWN_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BLUESLATE_TILE_SLAB = registerBlock("overgrown_blueslate_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BLUESLATE_TILE_WALL = registerBlock("overgrown_blueslate_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BLUESLATE_TILE_FAMILY = BlockFamilies.register(OVERGROWN_BLUESLATE_TILES)
			.stairs(OVERGROWN_BLUESLATE_TILE_STAIRS)
			.slab(OVERGROWN_BLUESLATE_TILE_SLAB)
			.wall(OVERGROWN_BLUESLATE_TILE_WALL)
			.build();

	public static Block CRACKED_BLUESLATE_TILES = registerBlock("cracked_blueslate_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BLUESLATE_TILE_STAIRS = registerBlock("cracked_blueslate_tile_stairs",
			settings -> new StairsBlock(CRACKED_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BLUESLATE_TILE_SLAB = registerBlock("cracked_blueslate_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BLUESLATE_TILE_WALL = registerBlock("cracked_blueslate_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BLUESLATE_TILE_FAMILY = BlockFamilies.register(CRACKED_BLUESLATE_TILES)
			.stairs(CRACKED_BLUESLATE_TILE_STAIRS)
			.slab(CRACKED_BLUESLATE_TILE_SLAB)
			.wall(CRACKED_BLUESLATE_TILE_WALL)
			.build();

	public static Block MOSSY_CRACKED_BLUESLATE_TILES = registerBlock("mossy_cracked_blueslate_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BLUESLATE_TILE_STAIRS = registerBlock("mossy_cracked_blueslate_tile_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BLUESLATE_TILE_SLAB = registerBlock("mossy_cracked_blueslate_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BLUESLATE_TILE_WALL = registerBlock("mossy_cracked_blueslate_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BLUESLATE_TILE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BLUESLATE_TILES)
			.stairs(MOSSY_CRACKED_BLUESLATE_TILE_STAIRS)
			.slab(MOSSY_CRACKED_BLUESLATE_TILE_SLAB)
			.wall(MOSSY_CRACKED_BLUESLATE_TILE_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_BLUESLATE_TILES = registerBlock("overgrown_cracked_blueslate_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BLUESLATE_TILE_STAIRS = registerBlock("overgrown_cracked_blueslate_tile_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BLUESLATE_TILE_SLAB = registerBlock("overgrown_cracked_blueslate_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BLUESLATE_TILE_WALL = registerBlock("overgrown_cracked_blueslate_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BLUESLATE_TILE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BLUESLATE_TILES)
			.stairs(OVERGROWN_CRACKED_BLUESLATE_TILE_STAIRS)
			.slab(OVERGROWN_CRACKED_BLUESLATE_TILE_SLAB)
			.wall(OVERGROWN_CRACKED_BLUESLATE_TILE_WALL)
			.build();

	public static Block BRONZE_BLUESLATE_TILES = registerBlock("bronze_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_BLUESLATE_TILE_STAIRS = registerBlock("bronze_blueslate_tiles_stairs",
			settings -> new StairsBlock(BRONZE_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_BLUESLATE_TILE_SLAB = registerBlock("bronze_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_BLUESLATE_TILE_WALL = registerBlock("bronze_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_BLUESLATE_TILE_FAMILY = BlockFamilies.register(BRONZE_BLUESLATE_TILES)
			.stairs(BRONZE_BLUESLATE_TILE_STAIRS)
			.slab(BRONZE_BLUESLATE_TILE_SLAB)
			.wall(BRONZE_BLUESLATE_TILE_WALL)
			.build();

	public static Block MOSSY_BRONZE_BLUESLATE_TILES = registerBlock("mossy_bronze_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_BLUESLATE_TILE_STAIRS = registerBlock("mossy_bronze_blueslate_tiles_stairs",
			settings -> new StairsBlock(MOSSY_BRONZE_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_BLUESLATE_TILE_SLAB = registerBlock("mossy_bronze_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_BLUESLATE_TILE_WALL = registerBlock("mossy_bronze_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_BLUESLATE_TILE_FAMILY = BlockFamilies.register(MOSSY_BRONZE_BLUESLATE_TILES)
			.stairs(MOSSY_BRONZE_BLUESLATE_TILE_STAIRS)
			.slab(MOSSY_BRONZE_BLUESLATE_TILE_SLAB)
			.wall(MOSSY_BRONZE_BLUESLATE_TILE_WALL)
			.build();

	public static Block OVERGROWN_BRONZE_BLUESLATE_TILES = registerBlock("overgrown_bronze_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_BLUESLATE_TILE_STAIRS = registerBlock("overgrown_bronze_blueslate_tiles_stairs",
			settings -> new StairsBlock(OVERGROWN_BRONZE_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_BLUESLATE_TILE_SLAB = registerBlock("overgrown_bronze_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_BLUESLATE_TILE_WALL = registerBlock("overgrown_bronze_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_BLUESLATE_TILE_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_BLUESLATE_TILES)
			.stairs(OVERGROWN_BRONZE_BLUESLATE_TILE_STAIRS)
			.slab(OVERGROWN_BRONZE_BLUESLATE_TILE_SLAB)
			.wall(OVERGROWN_BRONZE_BLUESLATE_TILE_WALL)
			.build();

	public static Block CRACKED_BRONZE_BLUESLATE_TILES = registerBlock("cracked_bronze_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_BLUESLATE_TILE_STAIRS = registerBlock("cracked_bronze_blueslate_tiles_stairs",
			settings -> new StairsBlock(CRACKED_BRONZE_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_BLUESLATE_TILE_SLAB = registerBlock("cracked_bronze_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_BLUESLATE_TILE_WALL = registerBlock("cracked_bronze_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_BLUESLATE_TILE_FAMILY = BlockFamilies.register(CRACKED_BRONZE_BLUESLATE_TILES)
			.stairs(CRACKED_BRONZE_BLUESLATE_TILE_STAIRS)
			.slab(CRACKED_BRONZE_BLUESLATE_TILE_SLAB)
			.wall(CRACKED_BRONZE_BLUESLATE_TILE_WALL)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_BLUESLATE_TILES = registerBlock("mossy_cracked_bronze_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_BLUESLATE_TILE_STAIRS = registerBlock("mossy_cracked_bronze_blueslate_tiles_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_BRONZE_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_BLUESLATE_TILE_SLAB = registerBlock("mossy_cracked_bronze_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_BLUESLATE_TILE_WALL = registerBlock("mossy_cracked_bronze_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_BLUESLATE_TILE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_BLUESLATE_TILES)
			.stairs(MOSSY_CRACKED_BRONZE_BLUESLATE_TILE_STAIRS)
			.slab(MOSSY_CRACKED_BRONZE_BLUESLATE_TILE_SLAB)
			.wall(MOSSY_CRACKED_BRONZE_BLUESLATE_TILE_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_BLUESLATE_TILES = registerBlock("overgrown_cracked_bronze_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_BLUESLATE_TILE_STAIRS = registerBlock("overgrown_cracked_bronze_blueslate_tiles_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_BRONZE_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_BLUESLATE_TILE_SLAB = registerBlock("overgrown_cracked_bronze_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_BLUESLATE_TILE_WALL = registerBlock("overgrown_cracked_bronze_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_BLUESLATE_TILE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_BLUESLATE_TILES)
			.stairs(OVERGROWN_CRACKED_BRONZE_BLUESLATE_TILE_STAIRS)
			.slab(OVERGROWN_CRACKED_BRONZE_BLUESLATE_TILE_SLAB)
			.wall(OVERGROWN_CRACKED_BRONZE_BLUESLATE_TILE_WALL)
			.build();

	public static Block SILVER_BLUESLATE_TILES = registerBlock("silver_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_BLUESLATE_TILE_STAIRS = registerBlock("silver_blueslate_tiles_stairs",
			settings -> new StairsBlock(SILVER_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_BLUESLATE_TILE_SLAB = registerBlock("silver_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_BLUESLATE_TILE_WALL = registerBlock("silver_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_BLUESLATE_TILE_FAMILY = BlockFamilies.register(SILVER_BLUESLATE_TILES)
			.stairs(SILVER_BLUESLATE_TILE_STAIRS)
			.slab(SILVER_BLUESLATE_TILE_SLAB)
			.wall(SILVER_BLUESLATE_TILE_WALL)
			.build();

	public static Block MOSSY_SILVER_BLUESLATE_TILES = registerBlock("mossy_silver_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_BLUESLATE_TILE_STAIRS = registerBlock("mossy_silver_blueslate_tiles_stairs",
			settings -> new StairsBlock(MOSSY_SILVER_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_BLUESLATE_TILE_SLAB = registerBlock("mossy_silver_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_BLUESLATE_TILE_WALL = registerBlock("mossy_silver_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_BLUESLATE_TILE_FAMILY = BlockFamilies.register(MOSSY_SILVER_BLUESLATE_TILES)
			.stairs(MOSSY_SILVER_BLUESLATE_TILE_STAIRS)
			.slab(MOSSY_SILVER_BLUESLATE_TILE_SLAB)
			.wall(MOSSY_SILVER_BLUESLATE_TILE_WALL)
			.build();

	public static Block OVERGROWN_SILVER_BLUESLATE_TILES = registerBlock("overgrown_silver_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_BLUESLATE_TILE_STAIRS = registerBlock("overgrown_silver_blueslate_tiles_stairs",
			settings -> new StairsBlock(OVERGROWN_SILVER_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_BLUESLATE_TILE_SLAB = registerBlock("overgrown_silver_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_BLUESLATE_TILE_WALL = registerBlock("overgrown_silver_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_BLUESLATE_TILE_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_BLUESLATE_TILES)
			.stairs(OVERGROWN_SILVER_BLUESLATE_TILE_STAIRS)
			.slab(OVERGROWN_SILVER_BLUESLATE_TILE_SLAB)
			.wall(OVERGROWN_SILVER_BLUESLATE_TILE_WALL)
			.build();

	public static Block CRACKED_SILVER_BLUESLATE_TILES = registerBlock("cracked_silver_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_BLUESLATE_TILE_STAIRS = registerBlock("cracked_silver_blueslate_tiles_stairs",
			settings -> new StairsBlock(CRACKED_SILVER_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_BLUESLATE_TILE_SLAB = registerBlock("cracked_silver_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_BLUESLATE_TILE_WALL = registerBlock("cracked_silver_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_BLUESLATE_TILE_FAMILY = BlockFamilies.register(CRACKED_SILVER_BLUESLATE_TILES)
			.stairs(CRACKED_SILVER_BLUESLATE_TILE_STAIRS)
			.slab(CRACKED_SILVER_BLUESLATE_TILE_SLAB)
			.wall(CRACKED_SILVER_BLUESLATE_TILE_WALL)
			.build();

	public static Block MOSSY_CRACKED_SILVER_BLUESLATE_TILES = registerBlock("mossy_cracked_silver_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_BLUESLATE_TILE_STAIRS = registerBlock("mossy_cracked_silver_blueslate_tiles_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_SILVER_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_BLUESLATE_TILE_SLAB = registerBlock("mossy_cracked_silver_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_BLUESLATE_TILE_WALL = registerBlock("mossy_cracked_silver_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_BLUESLATE_TILE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_BLUESLATE_TILES)
			.stairs(MOSSY_CRACKED_SILVER_BLUESLATE_TILE_STAIRS)
			.slab(MOSSY_CRACKED_SILVER_BLUESLATE_TILE_SLAB)
			.wall(MOSSY_CRACKED_SILVER_BLUESLATE_TILE_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_BLUESLATE_TILES = registerBlock("overgrown_cracked_silver_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_BLUESLATE_TILE_STAIRS = registerBlock("overgrown_cracked_silver_blueslate_tiles_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_SILVER_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_BLUESLATE_TILE_SLAB = registerBlock("overgrown_cracked_silver_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_BLUESLATE_TILE_WALL = registerBlock("overgrown_cracked_silver_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_BLUESLATE_TILE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_BLUESLATE_TILES)
			.stairs(OVERGROWN_CRACKED_SILVER_BLUESLATE_TILE_STAIRS)
			.slab(OVERGROWN_CRACKED_SILVER_BLUESLATE_TILE_SLAB)
			.wall(OVERGROWN_CRACKED_SILVER_BLUESLATE_TILE_WALL)
			.build();

	public static Block GOLD_BLUESLATE_TILES = registerBlock("gold_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_BLUESLATE_TILE_STAIRS = registerBlock("gold_blueslate_tiles_stairs",
			settings -> new StairsBlock(GOLD_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_BLUESLATE_TILE_SLAB = registerBlock("gold_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_BLUESLATE_TILE_WALL = registerBlock("gold_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_BLUESLATE_TILE_FAMILY = BlockFamilies.register(GOLD_BLUESLATE_TILES)
			.stairs(GOLD_BLUESLATE_TILE_STAIRS)
			.slab(GOLD_BLUESLATE_TILE_SLAB)
			.wall(GOLD_BLUESLATE_TILE_WALL)
			.build();

	public static Block MOSSY_GOLD_BLUESLATE_TILES = registerBlock("mossy_gold_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_BLUESLATE_TILE_STAIRS = registerBlock("mossy_gold_blueslate_tiles_stairs",
			settings -> new StairsBlock(MOSSY_GOLD_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_BLUESLATE_TILE_SLAB = registerBlock("mossy_gold_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_BLUESLATE_TILE_WALL = registerBlock("mossy_gold_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_BLUESLATE_TILE_FAMILY = BlockFamilies.register(MOSSY_GOLD_BLUESLATE_TILES)
			.stairs(MOSSY_GOLD_BLUESLATE_TILE_STAIRS)
			.slab(MOSSY_GOLD_BLUESLATE_TILE_SLAB)
			.wall(MOSSY_GOLD_BLUESLATE_TILE_WALL)
			.build();

	public static Block OVERGROWN_GOLD_BLUESLATE_TILES = registerBlock("overgrown_gold_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_BLUESLATE_TILE_STAIRS = registerBlock("overgrown_gold_blueslate_tiles_stairs",
			settings -> new StairsBlock(OVERGROWN_GOLD_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_BLUESLATE_TILE_SLAB = registerBlock("overgrown_gold_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_BLUESLATE_TILE_WALL = registerBlock("overgrown_gold_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_BLUESLATE_TILE_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_BLUESLATE_TILES)
			.stairs(OVERGROWN_GOLD_BLUESLATE_TILE_STAIRS)
			.slab(OVERGROWN_GOLD_BLUESLATE_TILE_SLAB)
			.wall(OVERGROWN_GOLD_BLUESLATE_TILE_WALL)
			.build();

	public static Block CRACKED_GOLD_BLUESLATE_TILES = registerBlock("cracked_gold_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_BLUESLATE_TILE_STAIRS = registerBlock("cracked_gold_blueslate_tiles_stairs",
			settings -> new StairsBlock(CRACKED_GOLD_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_BLUESLATE_TILE_SLAB = registerBlock("cracked_gold_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_BLUESLATE_TILE_WALL = registerBlock("cracked_gold_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_BLUESLATE_TILE_FAMILY = BlockFamilies.register(CRACKED_GOLD_BLUESLATE_TILES)
			.stairs(CRACKED_GOLD_BLUESLATE_TILE_STAIRS)
			.slab(CRACKED_GOLD_BLUESLATE_TILE_SLAB)
			.wall(CRACKED_GOLD_BLUESLATE_TILE_WALL)
			.build();

	public static Block MOSSY_CRACKED_GOLD_BLUESLATE_TILES = registerBlock("mossy_cracked_gold_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_BLUESLATE_TILE_STAIRS = registerBlock("mossy_cracked_gold_blueslate_tiles_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GOLD_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_BLUESLATE_TILE_SLAB = registerBlock("mossy_cracked_gold_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_BLUESLATE_TILE_WALL = registerBlock("mossy_cracked_gold_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_BLUESLATE_TILE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_BLUESLATE_TILES)
			.stairs(MOSSY_CRACKED_GOLD_BLUESLATE_TILE_STAIRS)
			.slab(MOSSY_CRACKED_GOLD_BLUESLATE_TILE_SLAB)
			.wall(MOSSY_CRACKED_GOLD_BLUESLATE_TILE_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_BLUESLATE_TILES = registerBlock("overgrown_cracked_gold_blueslate_tiless",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_BLUESLATE_TILE_STAIRS = registerBlock("overgrown_cracked_gold_blueslate_tiles_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GOLD_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_BLUESLATE_TILE_SLAB = registerBlock("overgrown_cracked_gold_blueslate_tiles_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_BLUESLATE_TILE_WALL = registerBlock("overgrown_cracked_gold_blueslate_tiles_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_BLUESLATE_TILE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_BLUESLATE_TILES)
			.stairs(OVERGROWN_CRACKED_GOLD_BLUESLATE_TILE_STAIRS)
			.slab(OVERGROWN_CRACKED_GOLD_BLUESLATE_TILE_SLAB)
			.wall(OVERGROWN_CRACKED_GOLD_BLUESLATE_TILE_WALL)
			.build();

	public static Block GLOWSTONE_BLUESLATE_TILES = registerBlock("glowstone_blueslate_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_BLUESLATE_TILE_STAIRS = registerBlock("glowstone_blueslate_tile_stairs",
			settings -> new StairsBlock(GLOWSTONE_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_BLUESLATE_TILE_SLAB = registerBlock("glowstone_blueslate_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_BLUESLATE_TILE_WALL = registerBlock("glowstone_blueslate_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily GLOWSTONE_BLUESLATE_TILE_FAMILY = BlockFamilies.register(GLOWSTONE_BLUESLATE_TILES)
			.stairs(GLOWSTONE_BLUESLATE_TILE_STAIRS)
			.slab(GLOWSTONE_BLUESLATE_TILE_SLAB)
			.wall(GLOWSTONE_BLUESLATE_TILE_WALL)
			.build();

	public static Block MOSSY_GLOWSTONE_BLUESLATE_TILES = registerBlock("mossy_glowstone_blueslate_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_BLUESLATE_TILE_STAIRS = registerBlock("mossy_glowstone_blueslate_tile_stairs",
			settings -> new StairsBlock(MOSSY_GLOWSTONE_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_BLUESLATE_TILE_SLAB = registerBlock("mossy_glowstone_blueslate_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_BLUESLATE_TILE_WALL = registerBlock("mossy_glowstone_blueslate_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily MOSSY_GLOWSTONE_BLUESLATE_TILE_FAMILY = BlockFamilies.register(MOSSY_GLOWSTONE_BLUESLATE_TILES)
			.stairs(MOSSY_GLOWSTONE_BLUESLATE_TILE_STAIRS)
			.slab(MOSSY_GLOWSTONE_BLUESLATE_TILE_SLAB)
			.wall(MOSSY_GLOWSTONE_BLUESLATE_TILE_WALL)
			.build();

	public static Block OVERGROWN_GLOWSTONE_BLUESLATE_TILES = registerBlock("overgrown_glowstone_blueslate_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_BLUESLATE_TILE_STAIRS = registerBlock("overgrown_glowstone_blueslate_tile_stairs",
			settings -> new StairsBlock(OVERGROWN_GLOWSTONE_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_BLUESLATE_TILE_SLAB = registerBlock("overgrown_glowstone_blueslate_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_BLUESLATE_TILE_WALL = registerBlock("overgrown_glowstone_blueslate_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily OVERGROWN_GLOWSTONE_BLUESLATE_TILE_FAMILY = BlockFamilies.register(OVERGROWN_GLOWSTONE_BLUESLATE_TILES)
			.stairs(OVERGROWN_GLOWSTONE_BLUESLATE_TILE_STAIRS)
			.slab(OVERGROWN_GLOWSTONE_BLUESLATE_TILE_SLAB)
			.wall(OVERGROWN_GLOWSTONE_BLUESLATE_TILE_WALL)
			.build();

	public static Block CRACKED_GLOWSTONE_BLUESLATE_TILES = registerBlock("cracked_glowstone_blueslate_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_BLUESLATE_TILE_STAIRS = registerBlock("cracked_glowstone_blueslate_tile_stairs",
			settings -> new StairsBlock(CRACKED_GLOWSTONE_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_BLUESLATE_TILE_SLAB = registerBlock("cracked_glowstone_blueslate_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_BLUESLATE_TILE_WALL = registerBlock("cracked_glowstone_blueslate_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily CRACKED_GLOWSTONE_BLUESLATE_TILE_FAMILY = BlockFamilies.register(CRACKED_GLOWSTONE_BLUESLATE_TILES)
			.stairs(CRACKED_GLOWSTONE_BLUESLATE_TILE_STAIRS)
			.slab(CRACKED_GLOWSTONE_BLUESLATE_TILE_SLAB)
			.wall(CRACKED_GLOWSTONE_BLUESLATE_TILE_WALL)
			.build();

	public static Block MOSSY_CRACKED_GLOWSTONE_BLUESLATE_TILES = registerBlock("mossy_cracked_glowstone_blueslate_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_BLUESLATE_TILE_STAIRS = registerBlock("mossy_cracked_glowstone_blueslate_tile_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_BLUESLATE_TILE_SLAB = registerBlock("mossy_cracked_glowstone_blueslate_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_BLUESLATE_TILE_WALL = registerBlock("mossy_cracked_glowstone_blueslate_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily MOSSY_CRACKED_GLOWSTONE_BLUESLATE_TILE_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_TILES)
			.stairs(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_TILE_STAIRS)
			.slab(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_TILE_SLAB)
			.wall(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_TILE_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_TILES = registerBlock("overgrown_cracked_glowstone_blueslate_tiles",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_TILE_STAIRS = registerBlock("overgrown_cracked_glowstone_blueslate_tile_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_TILES.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_TILE_SLAB = registerBlock("overgrown_cracked_glowstone_blueslate_tile_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_TILE_WALL = registerBlock("overgrown_cracked_glowstone_blueslate_tile_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_TILE_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_TILES)
			.stairs(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_TILE_STAIRS)
			.slab(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_TILE_SLAB)
			.wall(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_TILE_WALL)
			.build();

	public static ModStoneSubSet BLUESLATE_TILE_SUBSET = new ModStoneSubSet(
			BLUESLATE_TILE_FAMILY,
			MOSSY_BLUESLATE_TILE_FAMILY,
			OVERGROWN_BLUESLATE_TILE_FAMILY,
			CRACKED_BLUESLATE_TILE_FAMILY, MOSSY_CRACKED_BLUESLATE_TILE_FAMILY, OVERGROWN_CRACKED_BLUESLATE_TILE_FAMILY,
			BRONZE_BLUESLATE_TILE_FAMILY, MOSSY_BRONZE_BLUESLATE_TILE_FAMILY, OVERGROWN_BRONZE_BLUESLATE_TILE_FAMILY,
			CRACKED_BRONZE_BLUESLATE_TILE_FAMILY, MOSSY_CRACKED_BRONZE_BLUESLATE_TILE_FAMILY, OVERGROWN_CRACKED_BRONZE_BLUESLATE_TILE_FAMILY,
			SILVER_BLUESLATE_TILE_FAMILY, MOSSY_SILVER_BLUESLATE_TILE_FAMILY,
			OVERGROWN_SILVER_BLUESLATE_TILE_FAMILY,
			CRACKED_SILVER_BLUESLATE_TILE_FAMILY, MOSSY_CRACKED_SILVER_BLUESLATE_TILE_FAMILY, OVERGROWN_CRACKED_SILVER_BLUESLATE_TILE_FAMILY,
			GOLD_BLUESLATE_TILE_FAMILY, MOSSY_GOLD_BLUESLATE_TILE_FAMILY, OVERGROWN_GOLD_BLUESLATE_TILE_FAMILY,
			CRACKED_GOLD_BLUESLATE_TILE_FAMILY, MOSSY_CRACKED_GOLD_BLUESLATE_TILE_FAMILY,
			OVERGROWN_CRACKED_GOLD_BLUESLATE_TILE_FAMILY,
			GLOWSTONE_BLUESLATE_TILE_FAMILY, MOSSY_GLOWSTONE_BLUESLATE_TILE_FAMILY, OVERGROWN_GLOWSTONE_BLUESLATE_TILE_FAMILY,
			CRACKED_GLOWSTONE_BLUESLATE_TILE_FAMILY, MOSSY_CRACKED_GLOWSTONE_BLUESLATE_TILE_FAMILY,
			OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_TILE_FAMILY, "blueslate_tiles");

	public static Block BLUESLATE_PAVEMENT = registerBlock("blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BLUESLATE_PAVEMENT_STAIRS = registerBlock("blueslate_pavement_stairs",
			settings -> new StairsBlock(BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BLUESLATE_PAVEMENT_SLAB = registerBlock("blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(BLUESLATE_PAVEMENT)
			.stairs(BLUESLATE_PAVEMENT_STAIRS)
			.slab(BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_BLUESLATE_PAVEMENT = registerBlock("mossy_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BLUESLATE_PAVEMENT_STAIRS = registerBlock("mossy_blueslate_pavement_stairs",
			settings -> new StairsBlock(MOSSY_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BLUESLATE_PAVEMENT_SLAB = registerBlock("mossy_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_BLUESLATE_PAVEMENT)
			.stairs(MOSSY_BLUESLATE_PAVEMENT_STAIRS)
			.slab(MOSSY_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_BLUESLATE_PAVEMENT = registerBlock("overgrown_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BLUESLATE_PAVEMENT_STAIRS = registerBlock("overgrown_blueslate_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BLUESLATE_PAVEMENT_SLAB = registerBlock("overgrown_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_BLUESLATE_PAVEMENT)
			.stairs(OVERGROWN_BLUESLATE_PAVEMENT_STAIRS)
			.slab(OVERGROWN_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block CRACKED_BLUESLATE_PAVEMENT = registerBlock("cracked_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_blueslate_pavement_stairs",
			settings -> new StairsBlock(CRACKED_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_CRACKED_BLUESLATE_PAVEMENT = registerBlock("mossy_cracked_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BLUESLATE_PAVEMENT_STAIRS = registerBlock("mossy_cracked_blueslate_pavement_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BLUESLATE_PAVEMENT_SLAB = registerBlock("mossy_cracked_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BLUESLATE_PAVEMENT)
			.stairs(MOSSY_CRACKED_BLUESLATE_PAVEMENT_STAIRS)
			.slab(MOSSY_CRACKED_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_BLUESLATE_PAVEMENT = registerBlock("overgrown_cracked_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BLUESLATE_PAVEMENT_STAIRS = registerBlock("overgrown_cracked_blueslate_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BLUESLATE_PAVEMENT_SLAB = registerBlock("overgrown_cracked_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BLUESLATE_PAVEMENT)
			.stairs(OVERGROWN_CRACKED_BLUESLATE_PAVEMENT_STAIRS)
			.slab(OVERGROWN_CRACKED_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block BRONZE_BLUESLATE_PAVEMENT = registerBlock("bronze_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("bronze_blueslate_pavement_stairs",
			settings -> new StairsBlock(BRONZE_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_BLUESLATE_PAVEMENT_SLAB = registerBlock("bronze_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(BRONZE_BLUESLATE_PAVEMENT)
			.stairs(BRONZE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(BRONZE_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_BRONZE_BLUESLATE_PAVEMENT = registerBlock("mossy_bronze_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("mossy_bronze_blueslate_pavement_stairs",
			settings -> new StairsBlock(MOSSY_BRONZE_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_BLUESLATE_PAVEMENT_SLAB = registerBlock("mossy_bronze_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_BRONZE_BLUESLATE_PAVEMENT)
			.stairs(MOSSY_BRONZE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(MOSSY_BRONZE_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_BRONZE_BLUESLATE_PAVEMENT = registerBlock("overgrown_bronze_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("overgrown_bronze_blueslate_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_BRONZE_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_SLAB = registerBlock("overgrown_bronze_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_BLUESLATE_PAVEMENT)
			.stairs(OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block CRACKED_BRONZE_BLUESLATE_PAVEMENT = registerBlock("cracked_bronze_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_bronze_blueslate_pavement_stairs",
			settings -> new StairsBlock(CRACKED_BRONZE_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_bronze_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_BRONZE_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_BRONZE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_BRONZE_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_BLUESLATE_PAVEMENT = registerBlock("mossy_cracked_bronze_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("mossy_cracked_bronze_blueslate_pavement_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_BRONZE_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_BLUESLATE_PAVEMENT_SLAB = registerBlock("mossy_cracked_bronze_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_BLUESLATE_PAVEMENT)
			.stairs(MOSSY_CRACKED_BRONZE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(MOSSY_CRACKED_BRONZE_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_BLUESLATE_PAVEMENT = registerBlock("overgrown_cracked_bronze_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("overgrown_cracked_bronze_blueslate_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_BRONZE_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_BLUESLATE_PAVEMENT_SLAB = registerBlock("overgrown_cracked_bronze_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_BLUESLATE_PAVEMENT)
			.stairs(OVERGROWN_CRACKED_BRONZE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(OVERGROWN_CRACKED_BRONZE_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block SILVER_BLUESLATE_PAVEMENT = registerBlock("silver_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_BLUESLATE_PAVEMENT_STAIRS = registerBlock("silver_blueslate_pavement_stairs",
			settings -> new StairsBlock(SILVER_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_BLUESLATE_PAVEMENT_SLAB = registerBlock("silver_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(SILVER_BLUESLATE_PAVEMENT)
			.stairs(SILVER_BLUESLATE_PAVEMENT_STAIRS)
			.slab(SILVER_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_SILVER_BLUESLATE_PAVEMENT = registerBlock("mossy_silver_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_BLUESLATE_PAVEMENT_STAIRS = registerBlock("mossy_silver_blueslate_pavement_stairs",
			settings -> new StairsBlock(MOSSY_SILVER_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_BLUESLATE_PAVEMENT_SLAB = registerBlock("mossy_silver_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_SILVER_BLUESLATE_PAVEMENT)
			.stairs(MOSSY_SILVER_BLUESLATE_PAVEMENT_STAIRS)
			.slab(MOSSY_SILVER_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_SILVER_BLUESLATE_PAVEMENT = registerBlock("overgrown_silver_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_BLUESLATE_PAVEMENT_STAIRS = registerBlock("overgrown_silver_blueslate_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_SILVER_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_BLUESLATE_PAVEMENT_SLAB = registerBlock("overgrown_silver_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_BLUESLATE_PAVEMENT)
			.stairs(OVERGROWN_SILVER_BLUESLATE_PAVEMENT_STAIRS)
			.slab(OVERGROWN_SILVER_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block CRACKED_SILVER_BLUESLATE_PAVEMENT = registerBlock("cracked_silver_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_silver_blueslate_pavement_stairs",
			settings -> new StairsBlock(CRACKED_SILVER_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_silver_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_SILVER_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_SILVER_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_SILVER_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_CRACKED_SILVER_BLUESLATE_PAVEMENT = registerBlock("mossy_cracked_silver_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_BLUESLATE_PAVEMENT_STAIRS = registerBlock("mossy_cracked_silver_blueslate_pavement_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_SILVER_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_BLUESLATE_PAVEMENT_SLAB = registerBlock("mossy_cracked_silver_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_BLUESLATE_PAVEMENT)
			.stairs(MOSSY_CRACKED_SILVER_BLUESLATE_PAVEMENT_STAIRS)
			.slab(MOSSY_CRACKED_SILVER_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_BLUESLATE_PAVEMENT = registerBlock("overgrown_cracked_silver_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_BLUESLATE_PAVEMENT_STAIRS = registerBlock("overgrown_cracked_silver_blueslate_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_SILVER_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_BLUESLATE_PAVEMENT_SLAB = registerBlock("overgrown_cracked_silver_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_BLUESLATE_PAVEMENT)
			.stairs(OVERGROWN_CRACKED_SILVER_BLUESLATE_PAVEMENT_STAIRS)
			.slab(OVERGROWN_CRACKED_SILVER_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block GOLD_BLUESLATE_PAVEMENT = registerBlock("gold_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_BLUESLATE_PAVEMENT_STAIRS = registerBlock("gold_blueslate_pavement_stairs",
			settings -> new StairsBlock(GOLD_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_BLUESLATE_PAVEMENT_SLAB = registerBlock("gold_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(GOLD_BLUESLATE_PAVEMENT)
			.stairs(GOLD_BLUESLATE_PAVEMENT_STAIRS)
			.slab(GOLD_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_GOLD_BLUESLATE_PAVEMENT = registerBlock("mossy_gold_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_BLUESLATE_PAVEMENT_STAIRS = registerBlock("mossy_gold_blueslate_pavement_stairs",
			settings -> new StairsBlock(MOSSY_GOLD_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_BLUESLATE_PAVEMENT_SLAB = registerBlock("mossy_gold_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_GOLD_BLUESLATE_PAVEMENT)
			.stairs(MOSSY_GOLD_BLUESLATE_PAVEMENT_STAIRS)
			.slab(MOSSY_GOLD_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_GOLD_BLUESLATE_PAVEMENT = registerBlock("overgrown_gold_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_BLUESLATE_PAVEMENT_STAIRS = registerBlock("overgrown_gold_blueslate_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_GOLD_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_BLUESLATE_PAVEMENT_SLAB = registerBlock("overgrown_gold_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_BLUESLATE_PAVEMENT)
			.stairs(OVERGROWN_GOLD_BLUESLATE_PAVEMENT_STAIRS)
			.slab(OVERGROWN_GOLD_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block CRACKED_GOLD_BLUESLATE_PAVEMENT = registerBlock("cracked_gold_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_gold_blueslate_pavement_stairs",
			settings -> new StairsBlock(CRACKED_GOLD_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_gold_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_GOLD_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_GOLD_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_GOLD_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_CRACKED_GOLD_BLUESLATE_PAVEMENT = registerBlock("mossy_cracked_gold_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_BLUESLATE_PAVEMENT_STAIRS = registerBlock("mossy_cracked_gold_blueslate_pavement_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GOLD_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_BLUESLATE_PAVEMENT_SLAB = registerBlock("mossy_cracked_gold_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_BLUESLATE_PAVEMENT)
			.stairs(MOSSY_CRACKED_GOLD_BLUESLATE_PAVEMENT_STAIRS)
			.slab(MOSSY_CRACKED_GOLD_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_BLUESLATE_PAVEMENT = registerBlock("overgrown_cracked_gold_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_BLUESLATE_PAVEMENT_STAIRS = registerBlock("overgrown_cracked_gold_blueslate_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GOLD_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_BLUESLATE_PAVEMENT_SLAB = registerBlock("overgrown_cracked_gold_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_BLUESLATE_PAVEMENT)
			.stairs(OVERGROWN_CRACKED_GOLD_BLUESLATE_PAVEMENT_STAIRS)
			.slab(OVERGROWN_CRACKED_GOLD_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block GLOWSTONE_BLUESLATE_PAVEMENT = registerBlock("glowstone_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("glowstone_blueslate_pavement_stairs",
			settings -> new StairsBlock(GLOWSTONE_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_BLUESLATE_PAVEMENT_SLAB = registerBlock("glowstone_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily GLOWSTONE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(GLOWSTONE_BLUESLATE_PAVEMENT)
			.stairs(GLOWSTONE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(GLOWSTONE_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_GLOWSTONE_BLUESLATE_PAVEMENT = registerBlock("mossy_glowstone_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("mossy_glowstone_blueslate_pavement_stairs",
			settings -> new StairsBlock(MOSSY_GLOWSTONE_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_BLUESLATE_PAVEMENT_SLAB = registerBlock("mossy_glowstone_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily MOSSY_GLOWSTONE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_GLOWSTONE_BLUESLATE_PAVEMENT)
			.stairs(MOSSY_GLOWSTONE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(MOSSY_GLOWSTONE_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_GLOWSTONE_BLUESLATE_PAVEMENT = registerBlock("overgrown_glowstone_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("overgrown_glowstone_blueslate_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_GLOWSTONE_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_BLUESLATE_PAVEMENT_SLAB = registerBlock("overgrown_glowstone_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily OVERGROWN_GLOWSTONE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_GLOWSTONE_BLUESLATE_PAVEMENT)
			.stairs(OVERGROWN_GLOWSTONE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(OVERGROWN_GLOWSTONE_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT = registerBlock("cracked_glowstone_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_glowstone_blueslate_pavement_stairs",
			settings -> new StairsBlock(CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_glowstone_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block MOSSY_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT = registerBlock("mossy_cracked_glowstone_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("mossy_cracked_glowstone_blueslate_pavement_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_SLAB = registerBlock("mossy_cracked_glowstone_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily MOSSY_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT)
			.stairs(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(MOSSY_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static Block OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT = registerBlock("overgrown_cracked_glowstone_blueslate_pavement",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("overgrown_cracked_glowstone_blueslate_pavement_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_SLAB = registerBlock("overgrown_cracked_glowstone_blueslate_pavement_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT)
			.stairs(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_SLAB)
			.build();

	public static ModStoneSubSet BLUESLATE_PAVEMENT_SUBSET = new ModStoneSubSet(
			BLUESLATE_PAVEMENT_FAMILY,
			MOSSY_BLUESLATE_PAVEMENT_FAMILY,
			OVERGROWN_BLUESLATE_PAVEMENT_FAMILY,
			CRACKED_BLUESLATE_PAVEMENT_FAMILY, MOSSY_CRACKED_BLUESLATE_PAVEMENT_FAMILY, OVERGROWN_CRACKED_BLUESLATE_PAVEMENT_FAMILY,
			BRONZE_BLUESLATE_PAVEMENT_FAMILY, MOSSY_BRONZE_BLUESLATE_PAVEMENT_FAMILY, OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_FAMILY,
			CRACKED_BRONZE_BLUESLATE_PAVEMENT_FAMILY, MOSSY_CRACKED_BRONZE_BLUESLATE_PAVEMENT_FAMILY, OVERGROWN_CRACKED_BRONZE_BLUESLATE_PAVEMENT_FAMILY,
			SILVER_BLUESLATE_PAVEMENT_FAMILY, MOSSY_SILVER_BLUESLATE_PAVEMENT_FAMILY,
			OVERGROWN_SILVER_BLUESLATE_PAVEMENT_FAMILY,
			CRACKED_SILVER_BLUESLATE_PAVEMENT_FAMILY, MOSSY_CRACKED_SILVER_BLUESLATE_PAVEMENT_FAMILY, OVERGROWN_CRACKED_SILVER_BLUESLATE_PAVEMENT_FAMILY,
			GOLD_BLUESLATE_PAVEMENT_FAMILY, MOSSY_GOLD_BLUESLATE_PAVEMENT_FAMILY, OVERGROWN_GOLD_BLUESLATE_PAVEMENT_FAMILY,
			CRACKED_GOLD_BLUESLATE_PAVEMENT_FAMILY, MOSSY_CRACKED_GOLD_BLUESLATE_PAVEMENT_FAMILY,
			OVERGROWN_CRACKED_GOLD_BLUESLATE_PAVEMENT_FAMILY,
			GLOWSTONE_BLUESLATE_PAVEMENT_FAMILY, MOSSY_GLOWSTONE_BLUESLATE_PAVEMENT_FAMILY, OVERGROWN_GLOWSTONE_BLUESLATE_PAVEMENT_FAMILY,
			CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_FAMILY, MOSSY_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_FAMILY,
			OVERGROWN_CRACKED_GLOWSTONE_BLUESLATE_PAVEMENT_FAMILY, "blueslate_pavement");

	public static Block FANCY_BLUESLATE_BRICKS = registerBlock("fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block FANCY_BLUESLATE_BRICK_SLAB = registerBlock("fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block FANCY_BLUESLATE_BRICK_WALL = registerBlock("fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(FANCY_BLUESLATE_BRICKS)
			.stairs(FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(FANCY_BLUESLATE_BRICK_SLAB)
			.wall(FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_FANCY_BLUESLATE_BRICKS = registerBlock("mossy_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("mossy_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_FANCY_BLUESLATE_BRICK_WALL = registerBlock("mossy_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_FANCY_BLUESLATE_BRICKS)
			.stairs(MOSSY_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_FANCY_BLUESLATE_BRICKS = registerBlock("overgrown_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_FANCY_BLUESLATE_BRICK_WALL = registerBlock("overgrown_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_FANCY_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block CRACKED_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("cracked_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_FANCY_BLUESLATE_BRICK_WALL = registerBlock("cracked_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_FANCY_BLUESLATE_BRICKS = registerBlock("mossy_cracked_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_FANCY_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_FANCY_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_FANCY_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_FANCY_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_FANCY_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block BRONZE_FANCY_BLUESLATE_BRICKS = registerBlock("bronze_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("bronze_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(BRONZE_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("bronze_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block BRONZE_FANCY_BLUESLATE_BRICK_WALL = registerBlock("bronze_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily BRONZE_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(BRONZE_FANCY_BLUESLATE_BRICKS)
			.stairs(BRONZE_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(BRONZE_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(BRONZE_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS = registerBlock("mossy_bronze_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_bronze_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("mossy_bronze_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_BRONZE_FANCY_BLUESLATE_BRICK_WALL = registerBlock("mossy_bronze_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_BRONZE_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS)
			.stairs(MOSSY_BRONZE_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_BRONZE_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_BRONZE_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS = registerBlock("overgrown_bronze_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_bronze_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_bronze_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICK_WALL = registerBlock("overgrown_bronze_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_bronze_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_bronze_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("cracked_bronze_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_WALL = registerBlock("cracked_bronze_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS = registerBlock("mossy_cracked_bronze_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_bronze_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_bronze_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_bronze_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_bronze_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_bronze_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_bronze_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_bronze_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block SILVER_FANCY_BLUESLATE_BRICKS = registerBlock("silver_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("silver_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(SILVER_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("silver_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block SILVER_FANCY_BLUESLATE_BRICK_WALL = registerBlock("silver_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily SILVER_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(SILVER_FANCY_BLUESLATE_BRICKS)
			.stairs(SILVER_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(SILVER_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(SILVER_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_SILVER_FANCY_BLUESLATE_BRICKS = registerBlock("mossy_silver_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_silver_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_SILVER_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("mossy_silver_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_SILVER_FANCY_BLUESLATE_BRICK_WALL = registerBlock("mossy_silver_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_SILVER_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_SILVER_FANCY_BLUESLATE_BRICKS)
			.stairs(MOSSY_SILVER_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_SILVER_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_SILVER_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS = registerBlock("overgrown_silver_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_silver_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_silver_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_SILVER_FANCY_BLUESLATE_BRICK_WALL = registerBlock("overgrown_silver_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_SILVER_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_SILVER_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_SILVER_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_SILVER_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block CRACKED_SILVER_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_silver_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_silver_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_SILVER_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("cracked_silver_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_SILVER_FANCY_BLUESLATE_BRICK_WALL = registerBlock("cracked_silver_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_SILVER_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_SILVER_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_SILVER_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_SILVER_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_SILVER_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_SILVER_FANCY_BLUESLATE_BRICKS = registerBlock("mossy_cracked_silver_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_silver_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_SILVER_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_silver_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_silver_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_SILVER_FANCY_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_SILVER_FANCY_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_silver_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_silver_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_SILVER_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_silver_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_silver_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_SILVER_FANCY_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block GOLD_FANCY_BLUESLATE_BRICKS = registerBlock("gold_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("gold_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(GOLD_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("gold_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block GOLD_FANCY_BLUESLATE_BRICK_WALL = registerBlock("gold_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily GOLD_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(GOLD_FANCY_BLUESLATE_BRICKS)
			.stairs(GOLD_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(GOLD_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(GOLD_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_GOLD_FANCY_BLUESLATE_BRICKS = registerBlock("mossy_gold_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_gold_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_GOLD_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("mossy_gold_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_GOLD_FANCY_BLUESLATE_BRICK_WALL = registerBlock("mossy_gold_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_GOLD_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_GOLD_FANCY_BLUESLATE_BRICKS)
			.stairs(MOSSY_GOLD_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_GOLD_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_GOLD_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS = registerBlock("overgrown_gold_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_gold_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_gold_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_GOLD_FANCY_BLUESLATE_BRICK_WALL = registerBlock("overgrown_gold_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_GOLD_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_GOLD_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_GOLD_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_GOLD_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block CRACKED_GOLD_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_gold_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_gold_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_GOLD_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("cracked_gold_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block CRACKED_GOLD_FANCY_BLUESLATE_BRICK_WALL = registerBlock("cracked_gold_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily CRACKED_GOLD_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_GOLD_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_GOLD_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_GOLD_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_GOLD_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_GOLD_FANCY_BLUESLATE_BRICKS = registerBlock("mossy_cracked_gold_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_gold_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GOLD_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_gold_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block MOSSY_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_gold_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily MOSSY_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GOLD_FANCY_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_GOLD_FANCY_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_gold_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_gold_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GOLD_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_gold_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static Block OVERGROWN_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_gold_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE)));
	public static BlockFamily OVERGROWN_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GOLD_FANCY_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block GLOWSTONE_FANCY_BLUESLATE_BRICKS = registerBlock("glowstone_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("glowstone_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(GLOWSTONE_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("glowstone_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block GLOWSTONE_FANCY_BLUESLATE_BRICK_WALL = registerBlock("glowstone_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily GLOWSTONE_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(GLOWSTONE_FANCY_BLUESLATE_BRICKS)
			.stairs(GLOWSTONE_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(GLOWSTONE_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(GLOWSTONE_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_GLOWSTONE_FANCY_BLUESLATE_BRICKS = registerBlock("mossy_glowstone_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_glowstone_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_GLOWSTONE_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("mossy_glowstone_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block MOSSY_GLOWSTONE_FANCY_BLUESLATE_BRICK_WALL = registerBlock("mossy_glowstone_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily MOSSY_GLOWSTONE_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_GLOWSTONE_FANCY_BLUESLATE_BRICKS)
			.stairs(MOSSY_GLOWSTONE_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_GLOWSTONE_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_GLOWSTONE_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_GLOWSTONE_FANCY_BLUESLATE_BRICKS = registerBlock("overgrown_glowstone_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_glowstone_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_GLOWSTONE_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_glowstone_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static Block OVERGROWN_GLOWSTONE_FANCY_BLUESLATE_BRICK_WALL = registerBlock("overgrown_glowstone_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 15)));
	public static BlockFamily OVERGROWN_GLOWSTONE_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_GLOWSTONE_FANCY_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_GLOWSTONE_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_GLOWSTONE_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_GLOWSTONE_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_glowstone_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_glowstone_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("cracked_glowstone_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_WALL = registerBlock("cracked_glowstone_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block MOSSY_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICKS = registerBlock("mossy_cracked_glowstone_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cracked_glowstone_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(MOSSY_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cracked_glowstone_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block MOSSY_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_WALL = registerBlock("mossy_cracked_glowstone_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily MOSSY_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICKS)
			.stairs(MOSSY_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static Block OVERGROWN_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICKS = registerBlock("overgrown_cracked_glowstone_fancy_blueslate_bricks",
			settings -> new Block(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cracked_glowstone_fancy_blueslate_brick_stairs",
			settings -> new StairsBlock(OVERGROWN_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICKS.getDefaultState(),
					settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cracked_glowstone_fancy_blueslate_brick_slab",
			settings -> new SlabBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static Block OVERGROWN_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cracked_glowstone_fancy_blueslate_brick_wall",
			settings -> new WallBlock(settings.strength(2.0f).requiresTool().sounds(BlockSoundGroup.STONE).luminance(state -> 7)));
	public static BlockFamily OVERGROWN_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_WALL)
			.build();

	public static ModStoneSubSet FANCY_BLUESLATE_BRICK_SUBSET = new ModStoneSubSet(
			FANCY_BLUESLATE_BRICK_FAMILY,
			MOSSY_FANCY_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_FANCY_BLUESLATE_BRICK_FAMILY,
			CRACKED_FANCY_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_FANCY_BLUESLATE_BRICK_FAMILY, OVERGROWN_CRACKED_FANCY_BLUESLATE_BRICK_FAMILY,
			BRONZE_FANCY_BLUESLATE_BRICK_FAMILY, MOSSY_BRONZE_FANCY_BLUESLATE_BRICK_FAMILY, OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICK_FAMILY,
			CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_FAMILY, OVERGROWN_CRACKED_BRONZE_FANCY_BLUESLATE_BRICK_FAMILY,
			SILVER_FANCY_BLUESLATE_BRICK_FAMILY, MOSSY_SILVER_FANCY_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_SILVER_FANCY_BLUESLATE_BRICK_FAMILY,
			CRACKED_SILVER_FANCY_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_FAMILY, OVERGROWN_CRACKED_SILVER_FANCY_BLUESLATE_BRICK_FAMILY,
			GOLD_FANCY_BLUESLATE_BRICK_FAMILY, MOSSY_GOLD_FANCY_BLUESLATE_BRICK_FAMILY, OVERGROWN_GOLD_FANCY_BLUESLATE_BRICK_FAMILY,
			CRACKED_GOLD_FANCY_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_CRACKED_GOLD_FANCY_BLUESLATE_BRICK_FAMILY,
			GLOWSTONE_FANCY_BLUESLATE_BRICK_FAMILY, MOSSY_GLOWSTONE_FANCY_BLUESLATE_BRICK_FAMILY, OVERGROWN_GLOWSTONE_FANCY_BLUESLATE_BRICK_FAMILY,
			CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_FAMILY, MOSSY_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_FAMILY,
			OVERGROWN_CRACKED_GLOWSTONE_FANCY_BLUESLATE_BRICK_FAMILY, "fancy_blueslate_brick");

	public static ModStoneSet BLUESLATE_SET = new ModStoneSet(BLUESLATE_FAMILY, MOSSY_BLUESLATE_FAMILY,
			OVERGROWN_BLUESLATE_FAMILY,
			COBBLED_BLUESLATE_FAMILY, MOSSY_COBBLED_BLUESLATE_FAMILY, OVERGROWN_COBBLED_BLUESLATE_FAMILY,
			SMOOTH_BLUESLATE_FAMILY,MOSSY_SMOOTH_BLUESLATE_FAMILY, OVERGROWN_SMOOTH_BLUESLATE_FAMILY,
			CRACKED_SMOOTH_BLUESLATE_FAMILY, CRACKED_MOSSY_SMOOTH_BLUESLATE_FAMILY,
			CRACKED_OVERGROWN_SMOOTH_BLUESLATE_FAMILY,
			POLISHED_BLUESLATE_SUBSET, BLUESLATE_PILLAR_SUBSET, BLUESLATE_FRIEZE_SUBSET,
			COBBLED_BLUESLATE_BRICK_SUBSET, RUSTIC_BLUESLATE_BRICK_SUBSET, BLUESLATE_BRICK_SUBSET,
			BLUESLATE_TILE_SUBSET, BLUESLATE_PAVEMENT_SUBSET, FANCY_BLUESLATE_BRICK_SUBSET);

	public static void registerBlueslateBlocks() {
		VExtMod.LOGGER.info("Registering Blueslate Blocks for " + VExtMod.MOD_ID);
	}
}
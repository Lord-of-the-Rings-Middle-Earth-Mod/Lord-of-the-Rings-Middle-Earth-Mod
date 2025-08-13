/*
 * Copyright (c)
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
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package me.anedhel.lotr.block;

import me.anedhel.lotr.LordOfTheRingsMiddleEarthMod;
import me.anedhel.lotr.block.custom.ModPillarBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * This class is used to register all the different stone blocks in the mod.
 * It uses the Fabric API to register blocks and block items.
 * The blocks are registered with a unique identifier and are added to the game.
 */
public class ModStoneBlocks {

    public static final Block BLUESLATE = registerBlock("blueslate",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block BLUESLATE_STAIRS = registerBlock("blueslate_stairs",
            new StairsBlock(BLUESLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block BLUESLATE_SLAB = registerBlock("blueslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final Block BLUESLATE_WALL = registerBlock("blueslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
    public static final Block BLUESLATE_BUTTON = registerBlock("blueslate_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block BLUESLATE_PRESSURE_PLATE = registerBlock("blueslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));
    public static final BlockFamily BLUESLATE_FAMILY = BlockFamilies.register(BLUESLATE)
            .stairs(BLUESLATE_STAIRS)
            .slab(BLUESLATE_SLAB)
            .wall(BLUESLATE_WALL)
            .button(BLUESLATE_BUTTON)
            .pressurePlate(BLUESLATE_PRESSURE_PLATE)
            .group("stone").unlockCriterionName("has_stone").build();

	public static final Block MOSSY_BLUESLATE = registerBlock("mossy_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_BLUESLATE_STAIRS = registerBlock("mossy_blueslate_stairs",
			new StairsBlock(MOSSY_BLUESLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_BLUESLATE_SLAB = registerBlock("mossy_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_BLUESLATE_WALL = registerBlock("mossy_blueslate_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final Block MOSSY_BLUESLATE_BUTTON = registerBlock("mossy_blueslate_button",
			new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
	public static final Block MOSSY_BLUESLATE_PRESSURE_PLATE = registerBlock("mossy_blueslate_pressure_plate",
			new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
					FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));
	public static final BlockFamily MOSSY_BLUESLATE_FAMILY = BlockFamilies.register(MOSSY_BLUESLATE)
			.stairs(MOSSY_BLUESLATE_STAIRS)
			.slab(MOSSY_BLUESLATE_SLAB)
			.wall(MOSSY_BLUESLATE_WALL)
			.button(MOSSY_BLUESLATE_BUTTON)
			.pressurePlate(MOSSY_BLUESLATE_PRESSURE_PLATE)
			.group("stone").unlockCriterionName("has_stone").build();

	public static final Block OVERGROWN_BLUESLATE = registerBlock("overgrown_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_BLUESLATE_STAIRS = registerBlock("overgrown_blueslate_stairs",
			new StairsBlock(OVERGROWN_BLUESLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_BLUESLATE_SLAB = registerBlock("overgrown_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_BLUESLATE_WALL = registerBlock("overgrown_blueslate_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final Block OVERGROWN_BLUESLATE_BUTTON = registerBlock("overgrown_blueslate_button",
			new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
	public static final Block OVERGROWN_BLUESLATE_PRESSURE_PLATE = registerBlock("overgrown_blueslate_pressure_plate",
			new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
					FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));
	public static final BlockFamily OVERGROWN_BLUESLATE_FAMILY = BlockFamilies.register(OVERGROWN_BLUESLATE)
			.stairs(OVERGROWN_BLUESLATE_STAIRS)
			.slab(OVERGROWN_BLUESLATE_SLAB)
			.wall(OVERGROWN_BLUESLATE_WALL)
			.button(OVERGROWN_BLUESLATE_BUTTON)
			.pressurePlate(OVERGROWN_BLUESLATE_PRESSURE_PLATE)
			.group("stone").unlockCriterionName("has_stone").build();

    public static final Block COBBLED_BLUESLATE = registerBlock("cobbled_blueslate",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block COBBLED_BLUESLATE_STAIRS = registerBlock("cobbled_blueslate_stairs",
            new StairsBlock(COBBLED_BLUESLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block COBBLED_BLUESLATE_SLAB = registerBlock("cobbled_blueslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final Block COBBLED_BLUESLATE_WALL = registerBlock("cobbled_blueslate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
    public static final Block COBBLED_BLUESLATE_BUTTON = registerBlock("cobbled_blueslate_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block COBBLED_BLUESLATE_PRESSURE_PLATE = registerBlock("cobbled_blueslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));
    public static final BlockFamily COBBLED_BLUESLATE_FAMILY = BlockFamilies.register(COBBLED_BLUESLATE)
            .stairs(COBBLED_BLUESLATE_STAIRS)
            .slab(COBBLED_BLUESLATE_SLAB)
            .wall(COBBLED_BLUESLATE_WALL)
            .button(COBBLED_BLUESLATE_BUTTON)
            .pressurePlate(COBBLED_BLUESLATE_PRESSURE_PLATE)
            .group("stone").unlockCriterionName("has_cobbled_stone").build();

	public static final Block MOSSY_COBBLED_BLUESLATE = registerBlock("mossy_cobbled_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_COBBLED_BLUESLATE_STAIRS = registerBlock("mossy_cobbled_blueslate_stairs",
			new StairsBlock(MOSSY_COBBLED_BLUESLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_COBBLED_BLUESLATE_SLAB = registerBlock("mossy_cobbled_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_COBBLED_BLUESLATE_WALL = registerBlock("mossy_cobbled_blueslate_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final Block MOSSY_COBBLED_BLUESLATE_BUTTON = registerBlock("mossy_cobbled_blueslate_button",
			new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
	public static final Block MOSSY_COBBLED_BLUESLATE_PRESSURE_PLATE = registerBlock("mossy_cobbled_blueslate_pressure_plate",
			new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
					FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));
	public static final BlockFamily MOSSY_COBBLED_BLUESLATE_FAMILY = BlockFamilies.register(MOSSY_COBBLED_BLUESLATE)
			.stairs(MOSSY_COBBLED_BLUESLATE_STAIRS)
			.slab(MOSSY_COBBLED_BLUESLATE_SLAB)
			.wall(MOSSY_COBBLED_BLUESLATE_WALL)
			.button(MOSSY_COBBLED_BLUESLATE_BUTTON)
			.pressurePlate(MOSSY_COBBLED_BLUESLATE_PRESSURE_PLATE)
			.group("stone").unlockCriterionName("has_mossy_cobbled_stone").build();

	public static final Block OVERGROWN_COBBLED_BLUESLATE = registerBlock("overgrown_cobbled_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_COBBLED_BLUESLATE_STAIRS = registerBlock("overgrown_cobbled_blueslate_stairs",
			new StairsBlock(OVERGROWN_COBBLED_BLUESLATE.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_COBBLED_BLUESLATE_SLAB = registerBlock("overgrown_cobbled_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_COBBLED_BLUESLATE_WALL = registerBlock("overgrown_cobbled_blueslate_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final Block OVERGROWN_COBBLED_BLUESLATE_BUTTON = registerBlock("overgrown_cobbled_blueslate_button",
			new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
	public static final Block OVERGROWN_COBBLED_BLUESLATE_PRESSURE_PLATE = registerBlock(
			"overgrown_cobbled_blueslate_pressure_plate",
			new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
					FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));
	public static final BlockFamily OVERGROWN_COBBLED_BLUESLATE_FAMILY = BlockFamilies.register(OVERGROWN_COBBLED_BLUESLATE)
			.stairs(OVERGROWN_COBBLED_BLUESLATE_STAIRS)
			.slab(OVERGROWN_COBBLED_BLUESLATE_SLAB)
			.wall(OVERGROWN_COBBLED_BLUESLATE_WALL)
			.button(OVERGROWN_COBBLED_BLUESLATE_BUTTON)
			.pressurePlate(OVERGROWN_COBBLED_BLUESLATE_PRESSURE_PLATE)
			.group("stone").unlockCriterionName("has_overgrown_cobbled_stone").build();

	public static final Block COBBLED_BLUESLATE_BRICKS = registerBlock("cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block COBBLED_BLUESLATE_BRICKS_STAIRS = registerBlock("cobbled_blueslate_bricks_stairs",
			new StairsBlock(COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block COBBLED_BLUESLATE_BRICKS_SLAB = registerBlock("cobbled_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block COBBLED_BLUESLATE_BRICKS_WALL = registerBlock("cobbled_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily COBBLED_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(COBBLED_BLUESLATE_BRICKS)
			.stairs(COBBLED_BLUESLATE_BRICKS_STAIRS)
			.slab(COBBLED_BLUESLATE_BRICKS_SLAB)
			.wall(COBBLED_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cobbled_brick").build();
	public static final Block CRACKED_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CRACKED_COBBLED_BLUESLATE_BRICKS_STAIRS = registerBlock("cracked_cobbled_blueslate_bricks_stairs",
			new StairsBlock(CRACKED_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block CRACKED_COBBLED_BLUESLATE_BRICKS_SLAB = registerBlock("cracked_cobbled_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block CRACKED_COBBLED_BLUESLATE_BRICKS_WALL = registerBlock("cracked_cobbled_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily CRACKED_COBBLED_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(CRACKED_COBBLED_BLUESLATE_BRICKS)
			.stairs(CRACKED_COBBLED_BLUESLATE_BRICKS_STAIRS)
			.slab(CRACKED_COBBLED_BLUESLATE_BRICKS_SLAB)
			.wall(CRACKED_COBBLED_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_cobbled_brick").build();

	public static final Block MOSSY_COBBLED_BLUESLATE_BRICKS = registerBlock("mossy_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block MOSSY_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_cobbled_blueslate_brick_stairs",
			new StairsBlock(MOSSY_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block MOSSY_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("mossy_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block MOSSY_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("mossy_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily MOSSY_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(MOSSY_COBBLED_BLUESLATE_BRICKS)
					.stairs(MOSSY_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(MOSSY_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(MOSSY_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_mossy_cobbled_brick").build();
	public static final Block CRACKED_MOSSY_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_mossy_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CRACKED_MOSSY_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_mossy_cobbled_blueslate_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block CRACKED_MOSSY_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_mossy_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block CRACKED_MOSSY_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_mossy_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(CRACKED_MOSSY_COBBLED_BLUESLATE_BRICKS)
					.stairs(CRACKED_MOSSY_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(CRACKED_MOSSY_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(CRACKED_MOSSY_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_cracked_mossy_cobbled_brick").build();

	public static final Block OVERGROWN_COBBLED_BLUESLATE_BRICKS = registerBlock("overgrown_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block OVERGROWN_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_cobbled_blueslate_brick_stairs",
			new StairsBlock(OVERGROWN_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block OVERGROWN_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block OVERGROWN_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("overgrown_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily OVERGROWN_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(OVERGROWN_COBBLED_BLUESLATE_BRICKS)
					.stairs(OVERGROWN_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(OVERGROWN_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(OVERGROWN_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_overgrown_cobbled_brick").build();
	public static final Block CRACKED_OVERGROWN_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_overgrown_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CRACKED_OVERGROWN_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_overgrown_cobbled_blueslate_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_overgrown_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_overgrown_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(CRACKED_OVERGROWN_COBBLED_BLUESLATE_BRICKS)
					.stairs(CRACKED_OVERGROWN_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(CRACKED_OVERGROWN_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(CRACKED_OVERGROWN_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_cracked_overgrown_cobbled_brick").build();

	public static final Block BRONZE_COBBLED_BLUESLATE_BRICKS = registerBlock("bronze_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("bronze_cobbled_blueslate_brick_stairs",
			new StairsBlock(BRONZE_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block BRONZE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("bronze_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block BRONZE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("bronze_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(BRONZE_COBBLED_BLUESLATE_BRICKS)
					.stairs(BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(BRONZE_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(BRONZE_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_bronze_cobbled_brick").build();
	public static final Block CRACKED_BRONZE_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_bronze_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_bronze_cobbled_blueslate_brick_stairs",
			new StairsBlock(CRACKED_BRONZE_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_bronze_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_bronze_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(CRACKED_BRONZE_COBBLED_BLUESLATE_BRICKS)
					.stairs(CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(CRACKED_BRONZE_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_cracked_bronze_cobbled_brick").build();

	public static final Block MOSSY_BRONZE_COBBLED_BLUESLATE_BRICKS = registerBlock("mossy_bronze_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_bronze_cobbled_blueslate_brick_stairs",
			new StairsBlock(MOSSY_BRONZE_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("mossy_bronze_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("mossy_bronze_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(MOSSY_BRONZE_COBBLED_BLUESLATE_BRICKS)
					.stairs(MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_mossy_bronze_cobbled_brick").build();
	public static final Block CRACKED_MOSSY_BRONZE_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_mossy_bronze_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CRACKED_MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_mossy_bronze_cobbled_blueslate_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_BRONZE_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block CRACKED_MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_mossy_bronze_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block CRACKED_MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_mossy_bronze_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(CRACKED_MOSSY_BRONZE_COBBLED_BLUESLATE_BRICKS)
					.stairs(CRACKED_MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(CRACKED_MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(CRACKED_MOSSY_BRONZE_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_cracked_mossy_bronze_cobbled_brick").build();

	public static final Block OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICKS = registerBlock("overgrown_bronze_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_bronze_cobbled_blueslate_brick_stairs",
			new StairsBlock(OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_bronze_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("overgrown_bronze_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICKS)
					.stairs(OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_overgrown_bronze_cobbled_brick").build();
	public static final Block CRACKED_OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_overgrown_bronze_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CRACKED_OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_overgrown_bronze_cobbled_blueslate_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_overgrown_bronze_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_overgrown_bronze_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(CRACKED_OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICKS)
					.stairs(CRACKED_OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(CRACKED_OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(CRACKED_OVERGROWN_BRONZE_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_cracked_overgrown_bronze_cobbled_brick").build();

	public static final Block SILVER_COBBLED_BLUESLATE_BRICKS = registerBlock("silver_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block SILVER_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("silver_cobbled_blueslate_brick_stairs",
			new StairsBlock(SILVER_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block SILVER_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("silver_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block SILVER_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("silver_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily SILVER_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(SILVER_COBBLED_BLUESLATE_BRICKS)
					.stairs(SILVER_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(SILVER_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(SILVER_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_silver_cobbled_brick").build();
	public static final Block CRACKED_SILVER_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_silver_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_silver_cobbled_blueslate_brick_stairs",
			new StairsBlock(CRACKED_SILVER_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_silver_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_silver_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(CRACKED_SILVER_COBBLED_BLUESLATE_BRICKS)
					.stairs(CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(CRACKED_SILVER_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_cracked_silver_cobbled_brick").build();

	public static final Block MOSSY_SILVER_COBBLED_BLUESLATE_BRICKS = registerBlock("mossy_silver_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_silver_cobbled_blueslate_brick_stairs",
			new StairsBlock(MOSSY_SILVER_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("mossy_silver_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("mossy_silver_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(MOSSY_SILVER_COBBLED_BLUESLATE_BRICKS)
					.stairs(MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_mossy_silver_cobbled_brick").build();
	public static final Block CRACKED_MOSSY_SILVER_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_mossy_silver_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CRACKED_MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_mossy_silver_cobbled_blueslate_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_SILVER_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block CRACKED_MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_mossy_silver_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block CRACKED_MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_mossy_silver_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(CRACKED_MOSSY_SILVER_COBBLED_BLUESLATE_BRICKS)
					.stairs(CRACKED_MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(CRACKED_MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(CRACKED_MOSSY_SILVER_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_cracked_mossy_silver_cobbled_brick").build();

	public static final Block OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICKS = registerBlock("overgrown_silver_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_silver_cobbled_blueslate_brick_stairs",
			new StairsBlock(OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_silver_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("overgrown_silver_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICKS)
					.stairs(OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_overgrown_silver_cobbled_brick").build();
	public static final Block CRACKED_OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_overgrown_silver_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CRACKED_OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_overgrown_silver_cobbled_blueslate_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_overgrown_silver_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_overgrown_silver_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(CRACKED_OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICKS)
					.stairs(CRACKED_OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(CRACKED_OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(CRACKED_OVERGROWN_SILVER_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_cracked_overgrown_silver_cobbled_brick").build();

	public static final Block GOLD_COBBLED_BLUESLATE_BRICKS = registerBlock("gold_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block GOLD_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("gold_cobbled_blueslate_brick_stairs",
			new StairsBlock(GOLD_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block GOLD_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("gold_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block GOLD_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("gold_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily GOLD_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(GOLD_COBBLED_BLUESLATE_BRICKS)
					.stairs(GOLD_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(GOLD_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(GOLD_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_gold_cobbled_brick").build();
	public static final Block CRACKED_GOLD_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_gold_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_gold_cobbled_blueslate_brick_stairs",
			new StairsBlock(CRACKED_GOLD_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_gold_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_gold_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(CRACKED_GOLD_COBBLED_BLUESLATE_BRICKS)
					.stairs(CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(CRACKED_GOLD_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_cracked_gold_cobbled_brick").build();

	public static final Block MOSSY_GOLD_COBBLED_BLUESLATE_BRICKS = registerBlock("mossy_gold_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_gold_cobbled_blueslate_brick_stairs",
			new StairsBlock(MOSSY_GOLD_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("mossy_gold_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("mossy_gold_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(MOSSY_GOLD_COBBLED_BLUESLATE_BRICKS)
					.stairs(MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_mossy_gold_cobbled_brick").build();
	public static final Block CRACKED_MOSSY_GOLD_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_mossy_gold_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CRACKED_MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_mossy_gold_cobbled_blueslate_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_GOLD_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block CRACKED_MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_mossy_gold_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block CRACKED_MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_mossy_gold_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(CRACKED_MOSSY_GOLD_COBBLED_BLUESLATE_BRICKS)
					.stairs(CRACKED_MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(CRACKED_MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(CRACKED_MOSSY_GOLD_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_cracked_mossy_gold_cobbled_brick").build();

	public static final Block OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICKS = registerBlock("overgrown_gold_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_gold_cobbled_blueslate_brick_stairs",
			new StairsBlock(OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_gold_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("overgrown_gold_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICKS)
					.stairs(OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_overgrown_gold_cobbled_brick").build();
	public static final Block CRACKED_OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICKS = registerBlock("cracked_overgrown_gold_cobbled_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CRACKED_OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_overgrown_gold_cobbled_blueslate_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_overgrown_gold_cobbled_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_WALL = registerBlock("cracked_overgrown_gold_cobbled_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_FAMILY =
			BlockFamilies.register(CRACKED_OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICKS)
					.stairs(CRACKED_OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_STAIRS)
					.slab(CRACKED_OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_SLAB)
					.wall(CRACKED_OVERGROWN_GOLD_COBBLED_BLUESLATE_BRICK_WALL)
					.group("stone").unlockCriterionName("has_cracked_overgrown_gold_cobbled_brick").build();

    public static final Block SMOOTH_BLUESLATE = registerBlock("smooth_blueslate",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
    public static final Block SMOOTH_BLUESLATE_SLAB = registerBlock("smooth_blueslate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block CRACKED_SMOOTH_BLUESLATE = registerBlock("cracked_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block CRACKED_SMOOTH_BLUESLATE_SLAB = registerBlock("cracked_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));

	public static final Block MOSSY_SMOOTH_BLUESLATE = registerBlock("mossy_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block MOSSY_SMOOTH_BLUESLATE_SLAB = registerBlock("mossy_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block CRACKED_MOSSY_SMOOTH_BLUESLATE = registerBlock("cracked_mossy_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block CRACKED_MOSSY_SMOOTH_BLUESLATE_SLAB = registerBlock(
			"cracked_mossy_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));

	public static final Block OVERGROWN_SMOOTH_BLUESLATE = registerBlock("overgrown_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block OVERGROWN_SMOOTH_BLUESLATE_SLAB = registerBlock("overgrown_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_SMOOTH_BLUESLATE = registerBlock("cracked_overgrown_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block CRACKED_OVERGROWN_SMOOTH_BLUESLATE_SLAB = registerBlock(
			"cracked_overgrown_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));

	public static final Block BRONZE_SMOOTH_BLUESLATE = registerBlock("bronze_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block BRONZE_SMOOTH_BLUESLATE_SLAB = registerBlock("bronze_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block CRACKED_BRONZE_SMOOTH_BLUESLATE = registerBlock("cracked_bronze_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block CRACKED_BRONZE_SMOOTH_BLUESLATE_SLAB = registerBlock(
			"cracked_bronze_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));

	public static final Block MOSSY_BRONZE_SMOOTH_BLUESLATE = registerBlock("mossy_bronze_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block MOSSY_BRONZE_SMOOTH_BLUESLATE_SLAB = registerBlock("mossy_bronze_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block CRACKED_MOSSY_BRONZE_SMOOTH_BLUESLATE = registerBlock("cracked_mossy_bronze_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block CRACKED_MOSSY_BRONZE_SMOOTH_BLUESLATE_SLAB = registerBlock(
			"cracked_mossy_bronze_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));

	public static final Block OVERGROWN_BRONZE_SMOOTH_BLUESLATE = registerBlock("overgrown_bronze_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block OVERGROWN_BRONZE_SMOOTH_BLUESLATE_SLAB = registerBlock("overgrown_bronze_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_BRONZE_SMOOTH_BLUESLATE = registerBlock("cracked_overgrown_bronze_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block CRACKED_OVERGROWN_BRONZE_SMOOTH_BLUESLATE_SLAB = registerBlock(
			"cracked_overgrown_bronze_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));

	public static final Block SILVER_SMOOTH_BLUESLATE = registerBlock("silver_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block SILVER_SMOOTH_BLUESLATE_SLAB = registerBlock("silver_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block CRACKED_SILVER_SMOOTH_BLUESLATE = registerBlock("cracked_silver_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block CRACKED_SILVER_SMOOTH_BLUESLATE_SLAB = registerBlock(
			"cracked_silver_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));

	public static final Block MOSSY_SILVER_SMOOTH_BLUESLATE = registerBlock("mossy_silver_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block MOSSY_SILVER_SMOOTH_BLUESLATE_SLAB = registerBlock("mossy_silver_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block CRACKED_MOSSY_SILVER_SMOOTH_BLUESLATE = registerBlock("cracked_mossy_silver_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block CRACKED_MOSSY_SILVER_SMOOTH_BLUESLATE_SLAB = registerBlock(
			"cracked_mossy_silver_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));

	public static final Block OVERGROWN_SILVER_SMOOTH_BLUESLATE = registerBlock("overgrown_silver_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block OVERGROWN_SILVER_SMOOTH_BLUESLATE_SLAB = registerBlock("overgrown_silver_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_SILVER_SMOOTH_BLUESLATE = registerBlock("cracked_overgrown_silver_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block CRACKED_OVERGROWN_SILVER_SMOOTH_BLUESLATE_SLAB = registerBlock(
			"cracked_overgrown_silver_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));

	public static final Block GOLD_SMOOTH_BLUESLATE = registerBlock("gold_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block GOLD_SMOOTH_BLUESLATE_SLAB = registerBlock("gold_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block CRACKED_GOLD_SMOOTH_BLUESLATE = registerBlock("cracked_gold_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block CRACKED_GOLD_SMOOTH_BLUESLATE_SLAB = registerBlock(
			"cracked_gold_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));

	public static final Block MOSSY_GOLD_SMOOTH_BLUESLATE = registerBlock("mossy_gold_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block MOSSY_GOLD_SMOOTH_BLUESLATE_SLAB = registerBlock("mossy_gold_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block CRACKED_MOSSY_GOLD_SMOOTH_BLUESLATE = registerBlock("cracked_mossy_gold_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block CRACKED_MOSSY_GOLD_SMOOTH_BLUESLATE_SLAB = registerBlock(
			"cracked_mossy_gold_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));

	public static final Block OVERGROWN_GOLD_SMOOTH_BLUESLATE = registerBlock("overgrown_gold_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block OVERGROWN_GOLD_SMOOTH_BLUESLATE_SLAB = registerBlock("overgrown_gold_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_GOLD_SMOOTH_BLUESLATE = registerBlock("cracked_overgrown_gold_smooth_blueslate",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block CRACKED_OVERGROWN_GOLD_SMOOTH_BLUESLATE_SLAB = registerBlock(
			"cracked_overgrown_gold_smooth_blueslate_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));

    public static final Block BLUESLATE_BRICK = registerBlock("blueslate_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block BLUESLATE_BRICK_STAIRS = registerBlock("blueslate_brick_stairs",
            new StairsBlock(BLUESLATE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block BLUESLATE_BRICK_SLAB = registerBlock("blueslate_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final Block BLUESLATE_BRICK_WALL = registerBlock("blueslate_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
    public static final Block CHISELED_BLUESLATE_BRICK = registerBlock("chiseled_blueslate_brick",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final BlockFamily BLUESLATE_BRICK_FAMILY = BlockFamilies.register(BLUESLATE_BRICK)
            .stairs(BLUESLATE_BRICK_STAIRS)
            .slab(BLUESLATE_BRICK_SLAB)
            .wall(BLUESLATE_BRICK_WALL)
            .chiseled(CHISELED_BLUESLATE_BRICK)
            .group("stone").unlockCriterionName("has_brick").build();
	public static final Block CRACKED_BLUESLATE_BRICK = registerBlock("cracked_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_blueslate_brick_stairs",
			new StairsBlock(CRACKED_BLUESLATE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_BLUESLATE_BRICK_SLAB = registerBlock("cracked_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_BLUESLATE_BRICK_WALL = registerBlock("cracked_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_BLUESLATE_BRICK)
			.stairs(CRACKED_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_brick").build();

	public static final Block MOSSY_BLUESLATE_BRICK = registerBlock("mossy_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_blueslate_brick_stairs",
			new StairsBlock(MOSSY_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_BLUESLATE_BRICK_SLAB = registerBlock("mossy_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_BLUESLATE_BRICK_WALL = registerBlock("mossy_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_BLUESLATE_BRICK)
			.stairs(MOSSY_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_mossy_blueslate_brick").build();
	public static final Block CRACKED_MOSSY_BLUESLATE_BRICK = registerBlock("cracked_mossy_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_mossy_blueslate_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_BLUESLATE_BRICK_SLAB = registerBlock("cracked_mossy_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_BLUESLATE_BRICK_WALL = registerBlock("cracked_mossy_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_MOSSY_BLUESLATE_BRICK)
			.stairs(CRACKED_MOSSY_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_MOSSY_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_MOSSY_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_blueslate_brick").build();

	public static final Block OVERGROWN_BLUESLATE_BRICK = registerBlock("overgrown_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_blueslate_brick_stairs",
			new StairsBlock(OVERGROWN_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_BLUESLATE_BRICK_WALL = registerBlock("overgrown_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_BLUESLATE_BRICK)
			.stairs(OVERGROWN_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_overgrown_blueslate_brick").build();
	public static final Block CRACKED_OVERGROWN_BLUESLATE_BRICK = registerBlock("cracked_overgrown_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_overgrown_blueslate_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_BLUESLATE_BRICK_SLAB = registerBlock("cracked_overgrown_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_BLUESLATE_BRICK_WALL = registerBlock("cracked_overgrown_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_BLUESLATE_BRICK)
			.stairs(CRACKED_OVERGROWN_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_OVERGROWN_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_OVERGROWN_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_blueslate_brick").build();

	public static final Block BRONZE_BLUESLATE_BRICK = registerBlock("bronze_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block BRONZE_BLUESLATE_BRICK_STAIRS = registerBlock("bronze_blueslate_brick_stairs",
			new StairsBlock(BRONZE_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block BRONZE_BLUESLATE_BRICK_SLAB = registerBlock("bronze_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block BRONZE_BLUESLATE_BRICK_WALL = registerBlock("bronze_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily BRONZE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(BRONZE_BLUESLATE_BRICK)
			.stairs(BRONZE_BLUESLATE_BRICK_STAIRS)
			.slab(BRONZE_BLUESLATE_BRICK_SLAB)
			.wall(BRONZE_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_bronze_blueslate_brick").build();
	public static final Block CRACKED_BRONZE_BLUESLATE_BRICK = registerBlock("cracked_bronze_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_BRONZE_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_bronze_blueslate_brick_stairs",
			new StairsBlock(CRACKED_BRONZE_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_BRONZE_BLUESLATE_BRICK_SLAB = registerBlock("cracked_bronze_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_BRONZE_BLUESLATE_BRICK_WALL = registerBlock("cracked_bronze_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_BRONZE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_BRONZE_BLUESLATE_BRICK)
			.stairs(CRACKED_BRONZE_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_BRONZE_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_BRONZE_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_bronze_blueslate_brick").build();

	public static final Block MOSSY_BRONZE_BLUESLATE_BRICK = registerBlock("mossy_bronze_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_BRONZE_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_bronze_blueslate_brick_stairs",
			new StairsBlock(MOSSY_BRONZE_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_BRONZE_BLUESLATE_BRICK_SLAB = registerBlock("mossy_bronze_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_BRONZE_BLUESLATE_BRICK_WALL = registerBlock("mossy_bronze_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_BRONZE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_BRONZE_BLUESLATE_BRICK)
			.stairs(MOSSY_BRONZE_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_BRONZE_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_BRONZE_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_mossy_bronze_blueslate_brick").build();
	public static final Block CRACKED_MOSSY_BRONZE_BLUESLATE_BRICK = registerBlock("cracked_mossy_bronze_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_BRONZE_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_mossy_bronze_blueslate_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_BRONZE_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_BRONZE_BLUESLATE_BRICK_SLAB = registerBlock("cracked_mossy_bronze_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_BRONZE_BLUESLATE_BRICK_WALL = registerBlock("cracked_mossy_bronze_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_BRONZE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_MOSSY_BRONZE_BLUESLATE_BRICK)
			.stairs(CRACKED_MOSSY_BRONZE_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_MOSSY_BRONZE_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_MOSSY_BRONZE_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_bronze_blueslate_brick").build();

	public static final Block OVERGROWN_BRONZE_BLUESLATE_BRICK = registerBlock("overgrown_bronze_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_BRONZE_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_bronze_blueslate_brick_stairs",
			new StairsBlock(OVERGROWN_BRONZE_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_BRONZE_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_bronze_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_BRONZE_BLUESLATE_BRICK_WALL = registerBlock("overgrown_bronze_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_BRONZE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_BLUESLATE_BRICK)
			.stairs(OVERGROWN_BRONZE_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_BRONZE_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_BRONZE_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_overgrown_bronze_blueslate_brick").build();
	public static final Block CRACKED_OVERGROWN_BRONZE_BLUESLATE_BRICK = registerBlock("cracked_overgrown_bronze_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_BRONZE_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_overgrown_bronze_blueslate_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_BRONZE_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_BRONZE_BLUESLATE_BRICK_SLAB = registerBlock("cracked_overgrown_bronze_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_BRONZE_BLUESLATE_BRICK_WALL = registerBlock("cracked_overgrown_bronze_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_BRONZE_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_BRONZE_BLUESLATE_BRICK)
			.stairs(CRACKED_OVERGROWN_BRONZE_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_OVERGROWN_BRONZE_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_OVERGROWN_BRONZE_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_bronze_blueslate_brick").build();

	public static final Block SILVER_BLUESLATE_BRICK = registerBlock("silver_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block SILVER_BLUESLATE_BRICK_STAIRS = registerBlock("silver_blueslate_brick_stairs",
			new StairsBlock(SILVER_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block SILVER_BLUESLATE_BRICK_SLAB = registerBlock("silver_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block SILVER_BLUESLATE_BRICK_WALL = registerBlock("silver_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily SILVER_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(SILVER_BLUESLATE_BRICK)
			.stairs(SILVER_BLUESLATE_BRICK_STAIRS)
			.slab(SILVER_BLUESLATE_BRICK_SLAB)
			.wall(SILVER_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_silver_blueslate_brick").build();
	public static final Block CRACKED_SILVER_BLUESLATE_BRICK = registerBlock("cracked_silver_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_SILVER_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_silver_blueslate_brick_stairs",
			new StairsBlock(CRACKED_SILVER_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_SILVER_BLUESLATE_BRICK_SLAB = registerBlock("cracked_silver_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_SILVER_BLUESLATE_BRICK_WALL = registerBlock("cracked_silver_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_SILVER_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_SILVER_BLUESLATE_BRICK)
			.stairs(CRACKED_SILVER_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_SILVER_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_SILVER_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_silver_blueslate_brick").build();

	public static final Block MOSSY_SILVER_BLUESLATE_BRICK = registerBlock("mossy_silver_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_SILVER_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_silver_blueslate_brick_stairs",
			new StairsBlock(MOSSY_SILVER_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_SILVER_BLUESLATE_BRICK_SLAB = registerBlock("mossy_silver_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_SILVER_BLUESLATE_BRICK_WALL = registerBlock("mossy_silver_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_SILVER_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_SILVER_BLUESLATE_BRICK)
			.stairs(MOSSY_SILVER_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_SILVER_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_SILVER_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_mossy_silver_blueslate_brick").build();
	public static final Block CRACKED_MOSSY_SILVER_BLUESLATE_BRICK = registerBlock("cracked_mossy_silver_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_SILVER_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_mossy_silver_blueslate_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_SILVER_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_SILVER_BLUESLATE_BRICK_SLAB = registerBlock("cracked_mossy_silver_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_SILVER_BLUESLATE_BRICK_WALL = registerBlock("cracked_mossy_silver_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_SILVER_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_MOSSY_SILVER_BLUESLATE_BRICK)
			.stairs(CRACKED_MOSSY_SILVER_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_MOSSY_SILVER_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_MOSSY_SILVER_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_silver_blueslate_brick").build();

	public static final Block OVERGROWN_SILVER_BLUESLATE_BRICK = registerBlock("overgrown_silver_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_SILVER_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_silver_blueslate_brick_stairs",
			new StairsBlock(OVERGROWN_SILVER_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_SILVER_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_silver_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_SILVER_BLUESLATE_BRICK_WALL = registerBlock("overgrown_silver_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_SILVER_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_BLUESLATE_BRICK)
			.stairs(OVERGROWN_SILVER_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_SILVER_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_SILVER_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_overgrown_silver_blueslate_brick").build();
	public static final Block CRACKED_OVERGROWN_SILVER_BLUESLATE_BRICK = registerBlock("cracked_overgrown_silver_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_SILVER_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_overgrown_silver_blueslate_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_SILVER_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_SILVER_BLUESLATE_BRICK_SLAB = registerBlock("cracked_overgrown_silver_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_SILVER_BLUESLATE_BRICK_WALL = registerBlock("cracked_overgrown_silver_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_SILVER_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_SILVER_BLUESLATE_BRICK)
			.stairs(CRACKED_OVERGROWN_SILVER_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_OVERGROWN_SILVER_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_OVERGROWN_SILVER_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_silver_blueslate_brick").build();

	public static final Block GOLD_BLUESLATE_BRICK = registerBlock("gold_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block GOLD_BLUESLATE_BRICK_STAIRS = registerBlock("gold_blueslate_brick_stairs",
			new StairsBlock(GOLD_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block GOLD_BLUESLATE_BRICK_SLAB = registerBlock("gold_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block GOLD_BLUESLATE_BRICK_WALL = registerBlock("gold_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily GOLD_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(GOLD_BLUESLATE_BRICK)
			.stairs(GOLD_BLUESLATE_BRICK_STAIRS)
			.slab(GOLD_BLUESLATE_BRICK_SLAB)
			.wall(GOLD_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_gold_blueslate_brick").build();
	public static final Block CRACKED_GOLD_BLUESLATE_BRICK = registerBlock("cracked_gold_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_GOLD_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_gold_blueslate_brick_stairs",
			new StairsBlock(CRACKED_GOLD_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_GOLD_BLUESLATE_BRICK_SLAB = registerBlock("cracked_gold_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_GOLD_BLUESLATE_BRICK_WALL = registerBlock("cracked_gold_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_GOLD_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_GOLD_BLUESLATE_BRICK)
			.stairs(CRACKED_GOLD_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_GOLD_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_GOLD_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_gold_blueslate_brick").build();

	public static final Block MOSSY_GOLD_BLUESLATE_BRICK = registerBlock("mossy_gold_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_GOLD_BLUESLATE_BRICK_STAIRS = registerBlock("mossy_gold_blueslate_brick_stairs",
			new StairsBlock(MOSSY_GOLD_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_GOLD_BLUESLATE_BRICK_SLAB = registerBlock("mossy_gold_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_GOLD_BLUESLATE_BRICK_WALL = registerBlock("mossy_gold_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_GOLD_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(MOSSY_GOLD_BLUESLATE_BRICK)
			.stairs(MOSSY_GOLD_BLUESLATE_BRICK_STAIRS)
			.slab(MOSSY_GOLD_BLUESLATE_BRICK_SLAB)
			.wall(MOSSY_GOLD_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_mossy_gold_blueslate_brick").build();
	public static final Block CRACKED_MOSSY_GOLD_BLUESLATE_BRICK = registerBlock("cracked_mossy_gold_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_GOLD_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_mossy_gold_blueslate_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_GOLD_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_GOLD_BLUESLATE_BRICK_SLAB = registerBlock("cracked_mossy_gold_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_GOLD_BLUESLATE_BRICK_WALL = registerBlock("cracked_mossy_gold_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_GOLD_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_MOSSY_GOLD_BLUESLATE_BRICK)
			.stairs(CRACKED_MOSSY_GOLD_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_MOSSY_GOLD_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_MOSSY_GOLD_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_gold_blueslate_brick").build();

	public static final Block OVERGROWN_GOLD_BLUESLATE_BRICK = registerBlock("overgrown_gold_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_GOLD_BLUESLATE_BRICK_STAIRS = registerBlock("overgrown_gold_blueslate_brick_stairs",
			new StairsBlock(OVERGROWN_GOLD_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_GOLD_BLUESLATE_BRICK_SLAB = registerBlock("overgrown_gold_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_GOLD_BLUESLATE_BRICK_WALL = registerBlock("overgrown_gold_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_GOLD_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_BLUESLATE_BRICK)
			.stairs(OVERGROWN_GOLD_BLUESLATE_BRICK_STAIRS)
			.slab(OVERGROWN_GOLD_BLUESLATE_BRICK_SLAB)
			.wall(OVERGROWN_GOLD_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_overgrown_gold_blueslate_brick").build();
	public static final Block CRACKED_OVERGROWN_GOLD_BLUESLATE_BRICK = registerBlock("cracked_overgrown_gold_blueslate_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_GOLD_BLUESLATE_BRICK_STAIRS = registerBlock("cracked_overgrown_gold_blueslate_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_GOLD_BLUESLATE_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_GOLD_BLUESLATE_BRICK_SLAB = registerBlock("cracked_overgrown_gold_blueslate_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_GOLD_BLUESLATE_BRICK_WALL = registerBlock("cracked_overgrown_gold_blueslate_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_GOLD_BLUESLATE_BRICK_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_GOLD_BLUESLATE_BRICK)
			.stairs(CRACKED_OVERGROWN_GOLD_BLUESLATE_BRICK_STAIRS)
			.slab(CRACKED_OVERGROWN_GOLD_BLUESLATE_BRICK_SLAB)
			.wall(CRACKED_OVERGROWN_GOLD_BLUESLATE_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_gold_blueslate_brick").build();

    public static final Block BLUESLATE_TILES = registerBlock("blueslate_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block BLUESLATE_TILES_STAIRS = registerBlock("blueslate_tiles_stairs",
            new StairsBlock(BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block BLUESLATE_TILES_SLAB = registerBlock("blueslate_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final Block BLUESLATE_TILES_WALL = registerBlock("blueslate_tiles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
    public static final BlockFamily BLUESLATE_TILES_FAMILY = BlockFamilies.register(BLUESLATE_TILES)
            .stairs(BLUESLATE_TILES_STAIRS)
            .slab(BLUESLATE_TILES_SLAB)
            .wall(BLUESLATE_TILES_WALL)
            .group("stone").unlockCriterionName("has_tile").build();
	public static final Block CRACKED_BLUESLATE_TILES = registerBlock("cracked_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_BLUESLATE_TILES_STAIRS = registerBlock("cracked_blueslate_tiles_stairs",
			new StairsBlock(CRACKED_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_BLUESLATE_TILES_SLAB = registerBlock("cracked_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_BLUESLATE_TILES_WALL = registerBlock("cracked_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_BLUESLATE_TILES_FAMILY = BlockFamilies.register(CRACKED_BLUESLATE_TILES)
			.stairs(CRACKED_BLUESLATE_TILES_STAIRS)
			.slab(CRACKED_BLUESLATE_TILES_SLAB)
			.wall(CRACKED_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_cracked_tile").build();

	public static final Block MOSSY_BLUESLATE_TILES = registerBlock("mossy_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_BLUESLATE_TILES_STAIRS = registerBlock("mossy_blueslate_tiles_stairs",
			new StairsBlock(MOSSY_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_BLUESLATE_TILES_SLAB = registerBlock("mossy_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_BLUESLATE_TILES_WALL = registerBlock("mossy_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_BLUESLATE_TILES_FAMILY = BlockFamilies.register(MOSSY_BLUESLATE_TILES)
			.stairs(MOSSY_BLUESLATE_TILES_STAIRS)
			.slab(MOSSY_BLUESLATE_TILES_SLAB)
			.wall(MOSSY_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_mossy_tiles").build();
	public static final Block CRACKED_MOSSY_BLUESLATE_TILES = registerBlock("cracked_mossy_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_BLUESLATE_TILES_STAIRS = registerBlock("cracked_mossy_blueslate_tiles_stairs",
			new StairsBlock(CRACKED_MOSSY_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_BLUESLATE_TILES_SLAB = registerBlock("cracked_mossy_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_BLUESLATE_TILES_WALL = registerBlock("cracked_mossy_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_BLUESLATE_TILES_FAMILY = BlockFamilies.register(CRACKED_MOSSY_BLUESLATE_TILES)
			.stairs(CRACKED_MOSSY_BLUESLATE_TILES_STAIRS)
			.slab(CRACKED_MOSSY_BLUESLATE_TILES_SLAB)
			.wall(CRACKED_MOSSY_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_tiles").build();

	public static final Block OVERGROWN_BLUESLATE_TILES = registerBlock("overgrown_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_BLUESLATE_TILES_STAIRS = registerBlock("overgrown_blueslate_tiles_stairs",
			new StairsBlock(OVERGROWN_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_BLUESLATE_TILES_SLAB = registerBlock("overgrown_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_BLUESLATE_TILES_WALL = registerBlock("overgrown_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_BLUESLATE_TILES_FAMILY = BlockFamilies.register(OVERGROWN_BLUESLATE_TILES)
			.stairs(OVERGROWN_BLUESLATE_TILES_STAIRS)
			.slab(OVERGROWN_BLUESLATE_TILES_SLAB)
			.wall(OVERGROWN_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_overgrown_tiles").build();
	public static final Block CRACKED_OVERGROWN_BLUESLATE_TILES = registerBlock("cracked_overgrown_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_BLUESLATE_TILES_STAIRS = registerBlock("cracked_overgrown_blueslate_tiles_stairs",
			new StairsBlock(CRACKED_OVERGROWN_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_BLUESLATE_TILES_SLAB = registerBlock("cracked_overgrown_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_BLUESLATE_TILES_WALL = registerBlock("cracked_overgrown_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_BLUESLATE_TILES_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_BLUESLATE_TILES)
			.stairs(CRACKED_OVERGROWN_BLUESLATE_TILES_STAIRS)
			.slab(CRACKED_OVERGROWN_BLUESLATE_TILES_SLAB)
			.wall(CRACKED_OVERGROWN_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_tiles").build();

	public static final Block BRONZE_BLUESLATE_TILES = registerBlock("bronze_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block BRONZE_BLUESLATE_TILES_STAIRS = registerBlock("bronze_blueslate_tiles_stairs",
			new StairsBlock(BRONZE_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block BRONZE_BLUESLATE_TILES_SLAB = registerBlock("bronze_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block BRONZE_BLUESLATE_TILES_WALL = registerBlock("bronze_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily BRONZE_BLUESLATE_TILES_FAMILY = BlockFamilies.register(BRONZE_BLUESLATE_TILES)
			.stairs(BRONZE_BLUESLATE_TILES_STAIRS)
			.slab(BRONZE_BLUESLATE_TILES_SLAB)
			.wall(BRONZE_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_bronze_tiles").build();
	public static final Block CRACKED_BRONZE_BLUESLATE_TILES = registerBlock("cracked_bronze_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_BRONZE_BLUESLATE_TILES_STAIRS = registerBlock("cracked_bronze_blueslate_tiles_stairs",
			new StairsBlock(CRACKED_BRONZE_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_BRONZE_BLUESLATE_TILES_SLAB = registerBlock("cracked_bronze_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_BRONZE_BLUESLATE_TILES_WALL = registerBlock("cracked_bronze_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_BRONZE_BLUESLATE_TILES_FAMILY = BlockFamilies.register(CRACKED_BRONZE_BLUESLATE_TILES)
			.stairs(CRACKED_BRONZE_BLUESLATE_TILES_STAIRS)
			.slab(CRACKED_BRONZE_BLUESLATE_TILES_SLAB)
			.wall(CRACKED_BRONZE_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_cracked_bronze_tiles").build();

	public static final Block MOSSY_BRONZE_BLUESLATE_TILES = registerBlock("mossy_bronze_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_BRONZE_BLUESLATE_TILES_STAIRS = registerBlock("mossy_bronze_blueslate_tiles_stairs",
			new StairsBlock(MOSSY_BRONZE_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_BRONZE_BLUESLATE_TILES_SLAB = registerBlock("mossy_bronze_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_BRONZE_BLUESLATE_TILES_WALL = registerBlock("mossy_bronze_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_BRONZE_BLUESLATE_TILES_FAMILY = BlockFamilies.register(MOSSY_BRONZE_BLUESLATE_TILES)
			.stairs(MOSSY_BRONZE_BLUESLATE_TILES_STAIRS)
			.slab(MOSSY_BRONZE_BLUESLATE_TILES_SLAB)
			.wall(MOSSY_BRONZE_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_mossy_bronze_blueslate_tiles").build();
	public static final Block CRACKED_MOSSY_BRONZE_BLUESLATE_TILES = registerBlock("cracked_mossy_bronze_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_BRONZE_BLUESLATE_TILES_STAIRS = registerBlock("cracked_mossy_bronze_blueslate_tiles_stairs",
			new StairsBlock(CRACKED_MOSSY_BRONZE_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_BRONZE_BLUESLATE_TILES_SLAB = registerBlock("cracked_mossy_bronze_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_BRONZE_BLUESLATE_TILES_WALL = registerBlock("cracked_mossy_bronze_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_BRONZE_BLUESLATE_TILES_FAMILY = BlockFamilies.register(CRACKED_MOSSY_BRONZE_BLUESLATE_TILES)
			.stairs(CRACKED_MOSSY_BRONZE_BLUESLATE_TILES_STAIRS)
			.slab(CRACKED_MOSSY_BRONZE_BLUESLATE_TILES_SLAB)
			.wall(CRACKED_MOSSY_BRONZE_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_bronze_blueslate_tiles").build();

	public static final Block OVERGROWN_BRONZE_BLUESLATE_TILES = registerBlock("overgrown_bronze_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_BRONZE_BLUESLATE_TILES_STAIRS = registerBlock("overgrown_bronze_blueslate_tiles_stairs",
			new StairsBlock(OVERGROWN_BRONZE_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_BRONZE_BLUESLATE_TILES_SLAB = registerBlock("overgrown_bronze_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_BRONZE_BLUESLATE_TILES_WALL = registerBlock("overgrown_bronze_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_BRONZE_BLUESLATE_TILES_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_BLUESLATE_TILES)
			.stairs(OVERGROWN_BRONZE_BLUESLATE_TILES_STAIRS)
			.slab(OVERGROWN_BRONZE_BLUESLATE_TILES_SLAB)
			.wall(OVERGROWN_BRONZE_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_overgrown_bronze_blueslate_tiles").build();
	public static final Block CRACKED_OVERGROWN_BRONZE_BLUESLATE_TILES = registerBlock("cracked_overgrown_bronze_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_BRONZE_BLUESLATE_TILES_STAIRS = registerBlock("cracked_overgrown_bronze_blueslate_tiles_stairs",
			new StairsBlock(CRACKED_OVERGROWN_BRONZE_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_BRONZE_BLUESLATE_TILES_SLAB = registerBlock("cracked_overgrown_bronze_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_BRONZE_BLUESLATE_TILES_WALL = registerBlock("cracked_overgrown_bronze_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_BRONZE_BLUESLATE_TILES_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_BRONZE_BLUESLATE_TILES)
			.stairs(CRACKED_OVERGROWN_BRONZE_BLUESLATE_TILES_STAIRS)
			.slab(CRACKED_OVERGROWN_BRONZE_BLUESLATE_TILES_SLAB)
			.wall(CRACKED_OVERGROWN_BRONZE_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_bronze_blueslate_tiles").build();

	public static final Block SILVER_BLUESLATE_TILES = registerBlock("silver_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block SILVER_BLUESLATE_TILES_STAIRS = registerBlock("silver_blueslate_tiles_stairs",
			new StairsBlock(SILVER_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block SILVER_BLUESLATE_TILES_SLAB = registerBlock("silver_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block SILVER_BLUESLATE_TILES_WALL = registerBlock("silver_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily SILVER_BLUESLATE_TILES_FAMILY = BlockFamilies.register(SILVER_BLUESLATE_TILES)
			.stairs(SILVER_BLUESLATE_TILES_STAIRS)
			.slab(SILVER_BLUESLATE_TILES_SLAB)
			.wall(SILVER_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_silver_tiles").build();
	public static final Block CRACKED_SILVER_BLUESLATE_TILES = registerBlock("cracked_silver_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_SILVER_BLUESLATE_TILES_STAIRS = registerBlock("cracked_silver_blueslate_tiles_stairs",
			new StairsBlock(CRACKED_SILVER_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_SILVER_BLUESLATE_TILES_SLAB = registerBlock("cracked_silver_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_SILVER_BLUESLATE_TILES_WALL = registerBlock("cracked_silver_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_SILVER_BLUESLATE_TILES_FAMILY = BlockFamilies.register(CRACKED_SILVER_BLUESLATE_TILES)
			.stairs(CRACKED_SILVER_BLUESLATE_TILES_STAIRS)
			.slab(CRACKED_SILVER_BLUESLATE_TILES_SLAB)
			.wall(CRACKED_SILVER_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_cracked_silver_tiles").build();

	public static final Block MOSSY_SILVER_BLUESLATE_TILES = registerBlock("mossy_silver_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_SILVER_BLUESLATE_TILES_STAIRS = registerBlock("mossy_silver_blueslate_tiles_stairs",
			new StairsBlock(MOSSY_SILVER_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_SILVER_BLUESLATE_TILES_SLAB = registerBlock("mossy_silver_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_SILVER_BLUESLATE_TILES_WALL = registerBlock("mossy_silver_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_SILVER_BLUESLATE_TILES_FAMILY = BlockFamilies.register(MOSSY_SILVER_BLUESLATE_TILES)
			.stairs(MOSSY_SILVER_BLUESLATE_TILES_STAIRS)
			.slab(MOSSY_SILVER_BLUESLATE_TILES_SLAB)
			.wall(MOSSY_SILVER_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_silver_tiles").build();
	public static final Block CRACKED_MOSSY_SILVER_BLUESLATE_TILES = registerBlock("cracked_mossy_silver_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_SILVER_BLUESLATE_TILES_STAIRS = registerBlock("cracked_mossy_silver_blueslate_tiles_stairs",
			new StairsBlock(CRACKED_MOSSY_SILVER_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_SILVER_BLUESLATE_TILES_SLAB = registerBlock("cracked_mossy_silver_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_SILVER_BLUESLATE_TILES_WALL = registerBlock("cracked_mossy_silver_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_SILVER_BLUESLATE_TILES_FAMILY = BlockFamilies.register(CRACKED_MOSSY_SILVER_BLUESLATE_TILES)
			.stairs(CRACKED_MOSSY_SILVER_BLUESLATE_TILES_STAIRS)
			.slab(CRACKED_MOSSY_SILVER_BLUESLATE_TILES_SLAB)
			.wall(CRACKED_MOSSY_SILVER_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_cracked_silver_tiles").build();

	public static final Block OVERGROWN_SILVER_BLUESLATE_TILES = registerBlock("overgrown_silver_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_SILVER_BLUESLATE_TILES_STAIRS = registerBlock("overgrown_silver_blueslate_tiles_stairs",
			new StairsBlock(OVERGROWN_SILVER_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_SILVER_BLUESLATE_TILES_SLAB = registerBlock("overgrown_silver_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_SILVER_BLUESLATE_TILES_WALL = registerBlock("overgrown_silver_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_SILVER_BLUESLATE_TILES_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_BLUESLATE_TILES)
			.stairs(OVERGROWN_SILVER_BLUESLATE_TILES_STAIRS)
			.slab(OVERGROWN_SILVER_BLUESLATE_TILES_SLAB)
			.wall(OVERGROWN_SILVER_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_silver_tiles").build();
	public static final Block CRACKED_OVERGROWN_SILVER_BLUESLATE_TILES = registerBlock("cracked_overgrown_silver_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_SILVER_BLUESLATE_TILES_STAIRS = registerBlock("cracked_overgrown_silver_blueslate_tiles_stairs",
			new StairsBlock(CRACKED_OVERGROWN_SILVER_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_SILVER_BLUESLATE_TILES_SLAB = registerBlock("cracked_overgrown_silver_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_SILVER_BLUESLATE_TILES_WALL = registerBlock("cracked_overgrown_silver_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_SILVER_BLUESLATE_TILES_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_SILVER_BLUESLATE_TILES)
			.stairs(CRACKED_OVERGROWN_SILVER_BLUESLATE_TILES_STAIRS)
			.slab(CRACKED_OVERGROWN_SILVER_BLUESLATE_TILES_SLAB)
			.wall(CRACKED_OVERGROWN_SILVER_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_cracked_silver_tiles").build();

	public static final Block GOLD_BLUESLATE_TILES = registerBlock("gold_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block GOLD_BLUESLATE_TILES_STAIRS = registerBlock("gold_blueslate_tiles_stairs",
			new StairsBlock(GOLD_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block GOLD_BLUESLATE_TILES_SLAB = registerBlock("gold_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block GOLD_BLUESLATE_TILES_WALL = registerBlock("gold_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily GOLD_BLUESLATE_TILES_FAMILY = BlockFamilies.register(GOLD_BLUESLATE_TILES)
			.stairs(GOLD_BLUESLATE_TILES_STAIRS)
			.slab(GOLD_BLUESLATE_TILES_SLAB)
			.wall(GOLD_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_gold_tiles").build();
	public static final Block CRACKED_GOLD_BLUESLATE_TILES = registerBlock("cracked_gold_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_GOLD_BLUESLATE_TILES_STAIRS = registerBlock("cracked_gold_blueslate_tiles_stairs",
			new StairsBlock(CRACKED_GOLD_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_GOLD_BLUESLATE_TILES_SLAB = registerBlock("cracked_gold_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_GOLD_BLUESLATE_TILES_WALL = registerBlock("cracked_gold_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_GOLD_BLUESLATE_TILES_FAMILY = BlockFamilies.register(CRACKED_GOLD_BLUESLATE_TILES)
			.stairs(CRACKED_GOLD_BLUESLATE_TILES_STAIRS)
			.slab(CRACKED_GOLD_BLUESLATE_TILES_SLAB)
			.wall(CRACKED_GOLD_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_cracked_gold_tiles").build();

	public static final Block MOSSY_GOLD_BLUESLATE_TILES = registerBlock("mossy_gold_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_GOLD_BLUESLATE_TILES_STAIRS = registerBlock("mossy_gold_blueslate_tiles_stairs",
			new StairsBlock(MOSSY_GOLD_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_GOLD_BLUESLATE_TILES_SLAB = registerBlock("mossy_gold_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_GOLD_BLUESLATE_TILES_WALL = registerBlock("mossy_gold_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_GOLD_BLUESLATE_TILES_FAMILY = BlockFamilies.register(MOSSY_GOLD_BLUESLATE_TILES)
			.stairs(MOSSY_GOLD_BLUESLATE_TILES_STAIRS)
			.slab(MOSSY_GOLD_BLUESLATE_TILES_SLAB)
			.wall(MOSSY_GOLD_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_gold_tiles").build();
	public static final Block CRACKED_MOSSY_GOLD_BLUESLATE_TILES = registerBlock("cracked_mossy_gold_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_GOLD_BLUESLATE_TILES_STAIRS = registerBlock("cracked_mossy_gold_blueslate_tiles_stairs",
			new StairsBlock(CRACKED_MOSSY_GOLD_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_GOLD_BLUESLATE_TILES_SLAB = registerBlock("cracked_mossy_gold_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_GOLD_BLUESLATE_TILES_WALL = registerBlock("cracked_mossy_gold_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_GOLD_BLUESLATE_TILES_FAMILY = BlockFamilies.register(CRACKED_MOSSY_GOLD_BLUESLATE_TILES)
			.stairs(CRACKED_MOSSY_GOLD_BLUESLATE_TILES_STAIRS)
			.slab(CRACKED_MOSSY_GOLD_BLUESLATE_TILES_SLAB)
			.wall(CRACKED_MOSSY_GOLD_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_cracked_gold_tiles").build();

	public static final Block OVERGROWN_GOLD_BLUESLATE_TILES = registerBlock("overgrown_gold_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_GOLD_BLUESLATE_TILES_STAIRS = registerBlock("overgrown_gold_blueslate_tiles_stairs",
			new StairsBlock(OVERGROWN_GOLD_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_GOLD_BLUESLATE_TILES_SLAB = registerBlock("overgrown_gold_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_GOLD_BLUESLATE_TILES_WALL = registerBlock("overgrown_gold_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_GOLD_BLUESLATE_TILES_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_BLUESLATE_TILES)
			.stairs(OVERGROWN_GOLD_BLUESLATE_TILES_STAIRS)
			.slab(OVERGROWN_GOLD_BLUESLATE_TILES_SLAB)
			.wall(OVERGROWN_GOLD_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_gold_tiles").build();
	public static final Block CRACKED_OVERGROWN_GOLD_BLUESLATE_TILES = registerBlock("cracked_overgrown_gold_blueslate_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_GOLD_BLUESLATE_TILES_STAIRS = registerBlock("cracked_overgrown_gold_blueslate_tiles_stairs",
			new StairsBlock(CRACKED_OVERGROWN_GOLD_BLUESLATE_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_GOLD_BLUESLATE_TILES_SLAB = registerBlock("cracked_overgrown_gold_blueslate_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_GOLD_BLUESLATE_TILES_WALL = registerBlock("cracked_overgrown_gold_blueslate_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_GOLD_BLUESLATE_TILES_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_GOLD_BLUESLATE_TILES)
			.stairs(CRACKED_OVERGROWN_GOLD_BLUESLATE_TILES_STAIRS)
			.slab(CRACKED_OVERGROWN_GOLD_BLUESLATE_TILES_SLAB)
			.wall(CRACKED_OVERGROWN_GOLD_BLUESLATE_TILES_WALL)
			.group("stone").unlockCriterionName("has_cracked_gold_tiles").build();

    public static final Block BLUESLATE_PILLAR = registerBlock("blueslate_pillar",
            new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block BLUESLATE_PILLAR_SLAB = registerBlock("blueslate_pillar_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_BLUESLATE_PILLAR = registerBlock("cracked_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

	public static final Block MOSSY_BLUESLATE_PILLAR = registerBlock("mossy_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_BLUESLATE_PILLAR_SLAB = registerBlock("mossy_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_BLUESLATE_PILLAR = registerBlock("cracked_mossy_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_mossy_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

	public static final Block OVERGROWN_BLUESLATE_PILLAR = registerBlock("overgrown_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_BLUESLATE_PILLAR_SLAB = registerBlock("overgrown_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_BLUESLATE_PILLAR = registerBlock("cracked_overgrown_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_overgrown_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

	public static final Block BRONZE_BLUESLATE_PILLAR = registerBlock("bronze_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block BRONZE_BLUESLATE_PILLAR_SLAB = registerBlock("bronze_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_BRONZE_BLUESLATE_PILLAR = registerBlock("cracked_bronze_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_BRONZE_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_bronze_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

	public static final Block MOSSY_BRONZE_BLUESLATE_PILLAR = registerBlock("mossy_bronze_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_BRONZE_BLUESLATE_PILLAR_SLAB = registerBlock("mossy_bronze_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_BRONZE_BLUESLATE_PILLAR = registerBlock("cracked_mossy_bronze_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_BRONZE_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_mossy_bronze_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

	public static final Block OVERGROWN_BRONZE_BLUESLATE_PILLAR = registerBlock("overgrown_bronze_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_BRONZE_BLUESLATE_PILLAR_SLAB = registerBlock("overgrown_bronze_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_BRONZE_BLUESLATE_PILLAR = registerBlock("cracked_overgrown_bronze_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_BRONZE_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_overgrown_bronze_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

	public static final Block SILVER_BLUESLATE_PILLAR = registerBlock("silver_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block SILVER_BLUESLATE_PILLAR_SLAB = registerBlock("silver_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_SILVER_BLUESLATE_PILLAR = registerBlock("cracked_silver_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_SILVER_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_silver_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

	public static final Block MOSSY_SILVER_BLUESLATE_PILLAR = registerBlock("mossy_silver_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_SILVER_BLUESLATE_PILLAR_SLAB = registerBlock("mossy_silver_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_SILVER_BLUESLATE_PILLAR = registerBlock("cracked_mossy_silver_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_SILVER_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_mossy_silver_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

	public static final Block OVERGROWN_SILVER_BLUESLATE_PILLAR = registerBlock("overgrown_silver_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_SILVER_BLUESLATE_PILLAR_SLAB = registerBlock("overgrown_silver_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_SILVER_BLUESLATE_PILLAR = registerBlock("cracked_overgrown_silver_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_SILVER_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_overgrown_silver_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

	public static final Block GOLD_BLUESLATE_PILLAR = registerBlock("gold_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block GOLD_BLUESLATE_PILLAR_SLAB = registerBlock("gold_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_GOLD_BLUESLATE_PILLAR = registerBlock("cracked_gold_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_GOLD_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_gold_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

	public static final Block MOSSY_GOLD_BLUESLATE_PILLAR = registerBlock("mossy_gold_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_GOLD_BLUESLATE_PILLAR_SLAB = registerBlock("mossy_gold_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_GOLD_BLUESLATE_PILLAR = registerBlock("cracked_mossy_gold_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_GOLD_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_mossy_gold_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

	public static final Block OVERGROWN_GOLD_BLUESLATE_PILLAR = registerBlock("overgrown_gold_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_GOLD_BLUESLATE_PILLAR_SLAB = registerBlock("overgrown_gold_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_GOLD_BLUESLATE_PILLAR = registerBlock("cracked_overgrown_gold_blueslate_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_GOLD_BLUESLATE_PILLAR_SLAB = registerBlock("cracked_overgrown_gold_blueslate_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

    public static final Block BLUESLATE_PAVEMENT = registerBlock("blueslate_pavement",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block BLUESLATE_PAVEMENT_STAIRS = registerBlock("blueslate_pavement_stairs",
            new StairsBlock(BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
    public static final Block BLUESLATE_PAVEMENT_SLAB = registerBlock("blueslate_pavement_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
    public static final BlockFamily BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(BLUESLATE_PAVEMENT)
            .stairs(BLUESLATE_PAVEMENT_STAIRS)
            .slab(BLUESLATE_PAVEMENT_SLAB)
            .group("stone").unlockCriterionName("has_pavement").build();
	public static final Block CRACKED_BLUESLATE_PAVEMENT = registerBlock("cracked_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_blueslate_pavement_stairs",
			new StairsBlock(CRACKED_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CRACKED_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_cracked_pavement").build();

	public static final Block MOSSY_BLUESLATE_PAVEMENT = registerBlock("mossy_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_BLUESLATE_PAVEMENT_STAIRS = registerBlock("mossy_blueslate_pavement_stairs",
			new StairsBlock(MOSSY_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_BLUESLATE_PAVEMENT_SLAB = registerBlock("mossy_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily MOSSY_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_BLUESLATE_PAVEMENT)
			.stairs(MOSSY_BLUESLATE_PAVEMENT_STAIRS)
			.slab(MOSSY_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_mossy_pavement").build();
	public static final Block CRACKED_MOSSY_BLUESLATE_PAVEMENT = registerBlock("cracked_mossy_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_mossy_blueslate_pavement_stairs",
			new StairsBlock(CRACKED_MOSSY_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_mossy_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CRACKED_MOSSY_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_MOSSY_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_MOSSY_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_MOSSY_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_cracked_mossy_pavement").build();

	public static final Block OVERGROWN_BLUESLATE_PAVEMENT = registerBlock("overgrown_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_BLUESLATE_PAVEMENT_STAIRS = registerBlock("overgrown_blueslate_pavement_stairs",
			new StairsBlock(OVERGROWN_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_BLUESLATE_PAVEMENT_SLAB = registerBlock("overgrown_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily OVERGROWN_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_BLUESLATE_PAVEMENT)
			.stairs(OVERGROWN_BLUESLATE_PAVEMENT_STAIRS)
			.slab(OVERGROWN_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_overgrown_pavement").build();
	public static final Block CRACKED_OVERGROWN_BLUESLATE_PAVEMENT = registerBlock("cracked_overgrown_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_overgrown_blueslate_pavement_stairs",
			new StairsBlock(CRACKED_OVERGROWN_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_overgrown_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CRACKED_OVERGROWN_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_OVERGROWN_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_OVERGROWN_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_cracked_overgrown_pavement").build();

	public static final Block BRONZE_BLUESLATE_PAVEMENT = registerBlock("bronze_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block BRONZE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("bronze_blueslate_pavement_stairs",
			new StairsBlock(BRONZE_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block BRONZE_BLUESLATE_PAVEMENT_SLAB = registerBlock("bronze_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily BRONZE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(BRONZE_BLUESLATE_PAVEMENT)
			.stairs(BRONZE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(BRONZE_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_bronze_pavement").build();
	public static final Block CRACKED_BRONZE_BLUESLATE_PAVEMENT = registerBlock("cracked_bronze_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_BRONZE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_bronze_blueslate_pavement_stairs",
			new StairsBlock(CRACKED_BRONZE_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_BRONZE_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_bronze_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CRACKED_BRONZE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_BRONZE_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_BRONZE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_BRONZE_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_cracked_bronze_pavement").build();

	public static final Block MOSSY_BRONZE_BLUESLATE_PAVEMENT = registerBlock("mossy_bronze_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_BRONZE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("mossy_bronze_blueslate_pavement_stairs",
			new StairsBlock(MOSSY_BRONZE_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_BRONZE_BLUESLATE_PAVEMENT_SLAB = registerBlock("mossy_bronze_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily MOSSY_BRONZE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_BRONZE_BLUESLATE_PAVEMENT)
			.stairs(MOSSY_BRONZE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(MOSSY_BRONZE_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_bronze_pavement").build();
	public static final Block CRACKED_MOSSY_BRONZE_BLUESLATE_PAVEMENT = registerBlock("cracked_mossy_bronze_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_BRONZE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_mossy_bronze_blueslate_pavement_stairs",
			new StairsBlock(CRACKED_MOSSY_BRONZE_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_BRONZE_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_mossy_bronze_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CRACKED_MOSSY_BRONZE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_MOSSY_BRONZE_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_MOSSY_BRONZE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_MOSSY_BRONZE_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_cracked_bronze_pavement").build();

	public static final Block OVERGROWN_BRONZE_BLUESLATE_PAVEMENT = registerBlock("overgrown_bronze_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("overgrown_bronze_blueslate_pavement_stairs",
			new StairsBlock(OVERGROWN_BRONZE_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_SLAB = registerBlock("overgrown_bronze_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_BLUESLATE_PAVEMENT)
			.stairs(OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_bronze_pavement").build();
	public static final Block CRACKED_OVERGROWN_BRONZE_BLUESLATE_PAVEMENT = registerBlock("cracked_overgrown_bronze_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_overgrown_bronze_blueslate_pavement_stairs",
			new StairsBlock(CRACKED_OVERGROWN_BRONZE_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_overgrown_bronze_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CRACKED_OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_BRONZE_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_OVERGROWN_BRONZE_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_cracked_bronze_pavement").build();

	public static final Block SILVER_BLUESLATE_PAVEMENT = registerBlock("silver_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block SILVER_BLUESLATE_PAVEMENT_STAIRS = registerBlock("silver_blueslate_pavement_stairs",
			new StairsBlock(SILVER_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block SILVER_BLUESLATE_PAVEMENT_SLAB = registerBlock("silver_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily SILVER_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(SILVER_BLUESLATE_PAVEMENT)
			.stairs(SILVER_BLUESLATE_PAVEMENT_STAIRS)
			.slab(SILVER_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_silver_pavement").build();
	public static final Block CRACKED_SILVER_BLUESLATE_PAVEMENT = registerBlock("cracked_silver_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_SILVER_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_silver_blueslate_pavement_stairs",
			new StairsBlock(CRACKED_SILVER_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_SILVER_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_silver_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CRACKED_SILVER_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_SILVER_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_SILVER_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_SILVER_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_cracked_silver_pavement").build();

	public static final Block MOSSY_SILVER_BLUESLATE_PAVEMENT = registerBlock("mossy_silver_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_SILVER_BLUESLATE_PAVEMENT_STAIRS = registerBlock("mossy_silver_blueslate_pavement_stairs",
			new StairsBlock(MOSSY_SILVER_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_SILVER_BLUESLATE_PAVEMENT_SLAB = registerBlock("mossy_silver_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily MOSSY_SILVER_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_SILVER_BLUESLATE_PAVEMENT)
			.stairs(MOSSY_SILVER_BLUESLATE_PAVEMENT_STAIRS)
			.slab(MOSSY_SILVER_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_silver_pavement").build();
	public static final Block CRACKED_MOSSY_SILVER_BLUESLATE_PAVEMENT = registerBlock("cracked_mossy_silver_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_SILVER_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_mossy_silver_blueslate_pavement_stairs",
			new StairsBlock(CRACKED_MOSSY_SILVER_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_SILVER_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_mossy_silver_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CRACKED_MOSSY_SILVER_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_MOSSY_SILVER_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_MOSSY_SILVER_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_MOSSY_SILVER_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_cracked_silver_pavement").build();

	public static final Block OVERGROWN_SILVER_BLUESLATE_PAVEMENT = registerBlock("overgrown_silver_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_SILVER_BLUESLATE_PAVEMENT_STAIRS = registerBlock("overgrown_silver_blueslate_pavement_stairs",
			new StairsBlock(OVERGROWN_SILVER_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_SILVER_BLUESLATE_PAVEMENT_SLAB = registerBlock("overgrown_silver_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily OVERGROWN_SILVER_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_BLUESLATE_PAVEMENT)
			.stairs(OVERGROWN_SILVER_BLUESLATE_PAVEMENT_STAIRS)
			.slab(OVERGROWN_SILVER_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_silver_pavement").build();
	public static final Block CRACKED_OVERGROWN_SILVER_BLUESLATE_PAVEMENT = registerBlock("cracked_overgrown_silver_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_SILVER_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_overgrown_silver_blueslate_pavement_stairs",
			new StairsBlock(CRACKED_OVERGROWN_SILVER_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_SILVER_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_overgrown_silver_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CRACKED_OVERGROWN_SILVER_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_SILVER_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_OVERGROWN_SILVER_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_OVERGROWN_SILVER_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_cracked_silver_pavement").build();

	public static final Block GOLD_BLUESLATE_PAVEMENT = registerBlock("gold_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block GOLD_BLUESLATE_PAVEMENT_STAIRS = registerBlock("gold_blueslate_pavement_stairs",
			new StairsBlock(GOLD_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block GOLD_BLUESLATE_PAVEMENT_SLAB = registerBlock("gold_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily GOLD_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(GOLD_BLUESLATE_PAVEMENT)
			.stairs(GOLD_BLUESLATE_PAVEMENT_STAIRS)
			.slab(GOLD_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_gold_pavement").build();
	public static final Block CRACKED_GOLD_BLUESLATE_PAVEMENT = registerBlock("cracked_gold_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_GOLD_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_gold_blueslate_pavement_stairs",
			new StairsBlock(CRACKED_GOLD_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_GOLD_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_gold_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CRACKED_GOLD_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_GOLD_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_GOLD_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_GOLD_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_cracked_gold_pavement").build();

	public static final Block MOSSY_GOLD_BLUESLATE_PAVEMENT = registerBlock("mossy_gold_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_GOLD_BLUESLATE_PAVEMENT_STAIRS = registerBlock("mossy_gold_blueslate_pavement_stairs",
			new StairsBlock(MOSSY_GOLD_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_GOLD_BLUESLATE_PAVEMENT_SLAB = registerBlock("mossy_gold_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily MOSSY_GOLD_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_GOLD_BLUESLATE_PAVEMENT)
			.stairs(MOSSY_GOLD_BLUESLATE_PAVEMENT_STAIRS)
			.slab(MOSSY_GOLD_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_gold_pavement").build();
	public static final Block CRACKED_MOSSY_GOLD_BLUESLATE_PAVEMENT = registerBlock("cracked_mossy_gold_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_GOLD_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_mossy_gold_blueslate_pavement_stairs",
			new StairsBlock(CRACKED_MOSSY_GOLD_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_GOLD_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_mossy_gold_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CRACKED_MOSSY_GOLD_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_MOSSY_GOLD_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_MOSSY_GOLD_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_MOSSY_GOLD_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_cracked_gold_pavement").build();

	public static final Block OVERGROWN_GOLD_BLUESLATE_PAVEMENT = registerBlock("overgrown_gold_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_GOLD_BLUESLATE_PAVEMENT_STAIRS = registerBlock("overgrown_gold_blueslate_pavement_stairs",
			new StairsBlock(OVERGROWN_GOLD_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_GOLD_BLUESLATE_PAVEMENT_SLAB = registerBlock("overgrown_gold_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily OVERGROWN_GOLD_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_BLUESLATE_PAVEMENT)
			.stairs(OVERGROWN_GOLD_BLUESLATE_PAVEMENT_STAIRS)
			.slab(OVERGROWN_GOLD_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_gold_pavement").build();
	public static final Block CRACKED_OVERGROWN_GOLD_BLUESLATE_PAVEMENT = registerBlock("cracked_overgrown_gold_blueslate_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_GOLD_BLUESLATE_PAVEMENT_STAIRS = registerBlock("cracked_overgrown_gold_blueslate_pavement_stairs",
			new StairsBlock(CRACKED_OVERGROWN_GOLD_BLUESLATE_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_GOLD_BLUESLATE_PAVEMENT_SLAB = registerBlock("cracked_overgrown_gold_blueslate_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CRACKED_OVERGROWN_GOLD_BLUESLATE_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_GOLD_BLUESLATE_PAVEMENT)
			.stairs(CRACKED_OVERGROWN_GOLD_BLUESLATE_PAVEMENT_STAIRS)
			.slab(CRACKED_OVERGROWN_GOLD_BLUESLATE_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_cracked_gold_pavement").build();

	public static final Block FANCY_BLUESLATE_BRICKS = registerBlock("fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock("fancy_blueslate_bricks_stairs",
			new StairsBlock(FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block FANCY_BLUESLATE_BRICKS_WALL = registerBlock("fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(FANCY_BLUESLATE_BRICKS)
			.stairs(FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_fancy_bricks").build();
	public static final Block CRACKED_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock(
			"cracked_fancy_blueslate_bricks_stairs",
			new StairsBlock(CRACKED_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("cracked_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("cracked_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(CRACKED_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(CRACKED_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(CRACKED_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_fancy_bricks").build();

	public static final Block MOSSY_FANCY_BLUESLATE_BRICKS = registerBlock("mossy_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock("mossy_fancy_blueslate_bricks_stairs",
			new StairsBlock(MOSSY_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("mossy_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("mossy_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(MOSSY_FANCY_BLUESLATE_BRICKS)
			.stairs(MOSSY_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(MOSSY_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(MOSSY_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_mossy_fancy_bricks").build();
	public static final Block CRACKED_MOSSY_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_mossy_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock(
			"cracked_mossy_fancy_blueslate_bricks_stairs",
			new StairsBlock(CRACKED_MOSSY_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("cracked_mossy_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("cracked_mossy_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(CRACKED_MOSSY_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_MOSSY_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(CRACKED_MOSSY_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(CRACKED_MOSSY_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_fancy_bricks").build();

	public static final Block OVERGROWN_FANCY_BLUESLATE_BRICKS = registerBlock("overgrown_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock("overgrown_fancy_blueslate_bricks_stairs",
			new StairsBlock(OVERGROWN_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("overgrown_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("overgrown_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(OVERGROWN_FANCY_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(OVERGROWN_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(OVERGROWN_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_overgrown_fancy_bricks").build();
	public static final Block CRACKED_OVERGROWN_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_overgrown_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock(
			"cracked_overgrown_fancy_blueslate_bricks_stairs",
			new StairsBlock(CRACKED_OVERGROWN_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("cracked_overgrown_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("cracked_overgrown_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_OVERGROWN_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(CRACKED_OVERGROWN_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(CRACKED_OVERGROWN_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_fancy_bricks").build();

	public static final Block BRONZE_FANCY_BLUESLATE_BRICKS = registerBlock("bronze_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block BRONZE_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock("bronze_fancy_blueslate_bricks_stairs",
			new StairsBlock(BRONZE_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block BRONZE_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("bronze_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block BRONZE_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("bronze_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily BRONZE_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(BRONZE_FANCY_BLUESLATE_BRICKS)
			.stairs(BRONZE_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(BRONZE_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(BRONZE_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_bronze_fancy_bricks").build();
	public static final Block CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_bronze_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock(
			"cracked_bronze_fancy_blueslate_bricks_stairs",
			new StairsBlock(CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("cracked_bronze_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("cracked_bronze_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(CRACKED_BRONZE_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_bronze_fancy_bricks").build();

	public static final Block MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS = registerBlock("mossy_bronze_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock("mossy_bronze_fancy_blueslate_bricks_stairs",
			new StairsBlock(MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("mossy_bronze_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("mossy_bronze_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS)
			.stairs(MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_bronze_fancy_bricks").build();
	public static final Block CRACKED_MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_mossy_bronze_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock(
			"cracked_mossy_bronze_fancy_blueslate_bricks_stairs",
			new StairsBlock(CRACKED_MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("cracked_mossy_bronze_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("cracked_mossy_bronze_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(CRACKED_MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(CRACKED_MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(CRACKED_MOSSY_BRONZE_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_bronze_fancy_bricks").build();

	public static final Block OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS = registerBlock("overgrown_bronze_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock("overgrown_bronze_fancy_blueslate_bricks_stairs",
			new StairsBlock(OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("overgrown_bronze_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("overgrown_bronze_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_bronze_fancy_bricks").build();
	public static final Block CRACKED_OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_overgrown_bronze_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock(
			"cracked_overgrown_bronze_fancy_blueslate_bricks_stairs",
			new StairsBlock(CRACKED_OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("cracked_overgrown_bronze_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("cracked_overgrown_bronze_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(CRACKED_OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(CRACKED_OVERGROWN_BRONZE_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_bronze_fancy_bricks").build();

	public static final Block SILVER_FANCY_BLUESLATE_BRICKS = registerBlock("silver_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block SILVER_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock("silver_fancy_blueslate_bricks_stairs",
			new StairsBlock(SILVER_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block SILVER_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("silver_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block SILVER_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("silver_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily SILVER_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(SILVER_FANCY_BLUESLATE_BRICKS)
			.stairs(SILVER_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(SILVER_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(SILVER_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_silver_fancy_bricks").build();
	public static final Block CRACKED_SILVER_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_silver_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_SILVER_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock(
			"cracked_silver_fancy_blueslate_bricks_stairs",
			new StairsBlock(CRACKED_SILVER_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_SILVER_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("cracked_silver_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_SILVER_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("cracked_silver_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_SILVER_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(CRACKED_SILVER_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_SILVER_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(CRACKED_SILVER_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(CRACKED_SILVER_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_silver_fancy_bricks").build();

	public static final Block MOSSY_SILVER_FANCY_BLUESLATE_BRICKS = registerBlock("mossy_silver_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock("mossy_silver_fancy_blueslate_bricks_stairs",
			new StairsBlock(MOSSY_SILVER_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("mossy_silver_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("mossy_silver_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(MOSSY_SILVER_FANCY_BLUESLATE_BRICKS)
			.stairs(MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_silver_fancy_bricks").build();
	public static final Block CRACKED_MOSSY_SILVER_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_mossy_silver_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock(
			"cracked_mossy_silver_fancy_blueslate_bricks_stairs",
			new StairsBlock(CRACKED_MOSSY_SILVER_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("cracked_mossy_silver_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("cracked_mossy_silver_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(CRACKED_MOSSY_SILVER_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(CRACKED_MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(CRACKED_MOSSY_SILVER_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_silver_fancy_bricks").build();

	public static final Block OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS = registerBlock("overgrown_silver_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock("overgrown_silver_fancy_blueslate_bricks_stairs",
			new StairsBlock(OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("overgrown_silver_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("overgrown_silver_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_silver_fancy_bricks").build();
	public static final Block CRACKED_OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_overgrown_silver_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock(
			"cracked_overgrown_silver_fancy_blueslate_bricks_stairs",
			new StairsBlock(CRACKED_OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("cracked_overgrown_silver_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("cracked_overgrown_silver_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(CRACKED_OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(CRACKED_OVERGROWN_SILVER_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_silver_fancy_bricks").build();

	public static final Block GOLD_FANCY_BLUESLATE_BRICKS = registerBlock("gold_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block GOLD_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock("gold_fancy_blueslate_bricks_stairs",
			new StairsBlock(GOLD_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block GOLD_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("gold_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block GOLD_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("gold_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily GOLD_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(GOLD_FANCY_BLUESLATE_BRICKS)
			.stairs(GOLD_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(GOLD_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(GOLD_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_gold_fancy_bricks").build();
	public static final Block CRACKED_GOLD_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_gold_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_GOLD_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock(
			"cracked_gold_fancy_blueslate_bricks_stairs",
			new StairsBlock(CRACKED_GOLD_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_GOLD_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("cracked_gold_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_GOLD_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("cracked_gold_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_GOLD_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(CRACKED_GOLD_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_GOLD_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(CRACKED_GOLD_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(CRACKED_GOLD_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_gold_fancy_bricks").build();

	public static final Block MOSSY_GOLD_FANCY_BLUESLATE_BRICKS = registerBlock("mossy_gold_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock("mossy_gold_fancy_blueslate_bricks_stairs",
			new StairsBlock(MOSSY_GOLD_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("mossy_gold_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("mossy_gold_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(MOSSY_GOLD_FANCY_BLUESLATE_BRICKS)
			.stairs(MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_gold_fancy_bricks").build();
	public static final Block CRACKED_MOSSY_GOLD_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_mossy_gold_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock(
			"cracked_mossy_gold_fancy_blueslate_bricks_stairs",
			new StairsBlock(CRACKED_MOSSY_GOLD_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("cracked_mossy_gold_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("cracked_mossy_gold_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(CRACKED_MOSSY_GOLD_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(CRACKED_MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(CRACKED_MOSSY_GOLD_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_gold_fancy_bricks").build();

	public static final Block OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS = registerBlock("overgrown_gold_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock("overgrown_gold_fancy_blueslate_bricks_stairs",
			new StairsBlock(OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("overgrown_gold_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("overgrown_gold_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS)
			.stairs(OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_gold_fancy_bricks").build();
	public static final Block CRACKED_OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS = registerBlock("cracked_overgrown_gold_fancy_blueslate_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_STAIRS = registerBlock(
			"cracked_overgrown_gold_fancy_blueslate_bricks_stairs",
			new StairsBlock(CRACKED_OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_SLAB = registerBlock("cracked_overgrown_gold_fancy_blueslate_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_WALL = registerBlock("cracked_overgrown_gold_fancy_blueslate_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS)
			.stairs(CRACKED_OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_STAIRS)
			.slab(CRACKED_OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_SLAB)
			.wall(CRACKED_OVERGROWN_GOLD_FANCY_BLUESLATE_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_gold_fancy_bricks").build();

	// CHALK BLOCKS - Following the same pattern as blueslate
	public static final Block CHALK = registerBlock("chalk",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CHALK_STAIRS = registerBlock("chalk_stairs",
			new StairsBlock(CHALK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CHALK_SLAB = registerBlock("chalk_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CHALK_WALL = registerBlock("chalk_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final Block CHALK_BUTTON = registerBlock("chalk_button",
			new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
	public static final Block CHALK_PRESSURE_PLATE = registerBlock("chalk_pressure_plate",
			new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
					FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));
	public static final BlockFamily CHALK_FAMILY = BlockFamilies.register(CHALK)
			.stairs(CHALK_STAIRS)
			.slab(CHALK_SLAB)
			.wall(CHALK_WALL)
			.button(CHALK_BUTTON)
			.pressurePlate(CHALK_PRESSURE_PLATE)
			.group("stone").unlockCriterionName("has_stone").build();

	public static final Block MOSSY_CHALK = registerBlock("mossy_chalk",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_CHALK_STAIRS = registerBlock("mossy_chalk_stairs",
			new StairsBlock(MOSSY_CHALK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_CHALK_SLAB = registerBlock("mossy_chalk_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_CHALK_WALL = registerBlock("mossy_chalk_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final Block MOSSY_CHALK_BUTTON = registerBlock("mossy_chalk_button",
			new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
	public static final Block MOSSY_CHALK_PRESSURE_PLATE = registerBlock("mossy_chalk_pressure_plate",
			new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
					FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));
	public static final BlockFamily MOSSY_CHALK_FAMILY = BlockFamilies.register(MOSSY_CHALK)
			.stairs(MOSSY_CHALK_STAIRS)
			.slab(MOSSY_CHALK_SLAB)
			.wall(MOSSY_CHALK_WALL)
			.button(MOSSY_CHALK_BUTTON)
			.pressurePlate(MOSSY_CHALK_PRESSURE_PLATE)
			.group("stone").unlockCriterionName("has_stone").build();

	public static final Block OVERGROWN_CHALK = registerBlock("overgrown_chalk",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_CHALK_STAIRS = registerBlock("overgrown_chalk_stairs",
			new StairsBlock(OVERGROWN_CHALK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_CHALK_SLAB = registerBlock("overgrown_chalk_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_CHALK_WALL = registerBlock("overgrown_chalk_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final Block OVERGROWN_CHALK_BUTTON = registerBlock("overgrown_chalk_button",
			new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
	public static final Block OVERGROWN_CHALK_PRESSURE_PLATE = registerBlock("overgrown_chalk_pressure_plate",
			new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
					FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));
	public static final BlockFamily OVERGROWN_CHALK_FAMILY = BlockFamilies.register(OVERGROWN_CHALK)
			.stairs(OVERGROWN_CHALK_STAIRS)
			.slab(OVERGROWN_CHALK_SLAB)
			.wall(OVERGROWN_CHALK_WALL)
			.button(OVERGROWN_CHALK_BUTTON)
			.pressurePlate(OVERGROWN_CHALK_PRESSURE_PLATE)
			.group("stone").unlockCriterionName("has_stone").build();

	public static final Block COBBLED_CHALK = registerBlock("cobbled_chalk",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block COBBLED_CHALK_STAIRS = registerBlock("cobbled_chalk_stairs",
			new StairsBlock(COBBLED_CHALK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block COBBLED_CHALK_SLAB = registerBlock("cobbled_chalk_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block COBBLED_CHALK_WALL = registerBlock("cobbled_chalk_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final Block COBBLED_CHALK_BUTTON = registerBlock("cobbled_chalk_button",
			new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
	public static final Block COBBLED_CHALK_PRESSURE_PLATE = registerBlock("cobbled_chalk_pressure_plate",
			new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
					FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));
	public static final BlockFamily COBBLED_CHALK_FAMILY = BlockFamilies.register(COBBLED_CHALK)
			.stairs(COBBLED_CHALK_STAIRS)
			.slab(COBBLED_CHALK_SLAB)
			.wall(COBBLED_CHALK_WALL)
			.button(COBBLED_CHALK_BUTTON)
			.pressurePlate(COBBLED_CHALK_PRESSURE_PLATE)
			.group("stone").unlockCriterionName("has_cobbled_stone").build();

	public static final Block MOSSY_COBBLED_CHALK = registerBlock("mossy_cobbled_chalk",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_COBBLED_CHALK_STAIRS = registerBlock("mossy_cobbled_chalk_stairs",
			new StairsBlock(MOSSY_COBBLED_CHALK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_COBBLED_CHALK_SLAB = registerBlock("mossy_cobbled_chalk_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_COBBLED_CHALK_WALL = registerBlock("mossy_cobbled_chalk_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final Block MOSSY_COBBLED_CHALK_BUTTON = registerBlock("mossy_cobbled_chalk_button",
			new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
	public static final Block MOSSY_COBBLED_CHALK_PRESSURE_PLATE = registerBlock("mossy_cobbled_chalk_pressure_plate",
			new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
					FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));
	public static final BlockFamily MOSSY_COBBLED_CHALK_FAMILY = BlockFamilies.register(MOSSY_COBBLED_CHALK)
			.stairs(MOSSY_COBBLED_CHALK_STAIRS)
			.slab(MOSSY_COBBLED_CHALK_SLAB)
			.wall(MOSSY_COBBLED_CHALK_WALL)
			.button(MOSSY_COBBLED_CHALK_BUTTON)
			.pressurePlate(MOSSY_COBBLED_CHALK_PRESSURE_PLATE)
			.group("stone").unlockCriterionName("has_mossy_cobbled_stone").build();

	public static final Block OVERGROWN_COBBLED_CHALK = registerBlock("overgrown_cobbled_chalk",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_COBBLED_CHALK_STAIRS = registerBlock("overgrown_cobbled_chalk_stairs",
			new StairsBlock(OVERGROWN_COBBLED_CHALK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_COBBLED_CHALK_SLAB = registerBlock("overgrown_cobbled_chalk_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_COBBLED_CHALK_WALL = registerBlock("overgrown_cobbled_chalk_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final Block OVERGROWN_COBBLED_CHALK_BUTTON = registerBlock("overgrown_cobbled_chalk_button",
			new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
	public static final Block OVERGROWN_COBBLED_CHALK_PRESSURE_PLATE = registerBlock(
			"overgrown_cobbled_chalk_pressure_plate",
			new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
					FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE), BlockSetType.STONE));
	public static final BlockFamily OVERGROWN_COBBLED_CHALK_FAMILY = BlockFamilies.register(OVERGROWN_COBBLED_CHALK)
			.stairs(OVERGROWN_COBBLED_CHALK_STAIRS)
			.slab(OVERGROWN_COBBLED_CHALK_SLAB)
			.wall(OVERGROWN_COBBLED_CHALK_WALL)
			.button(OVERGROWN_COBBLED_CHALK_BUTTON)
			.pressurePlate(OVERGROWN_COBBLED_CHALK_PRESSURE_PLATE)
			.group("stone").unlockCriterionName("has_overgrown_cobbled_stone").build();

	public static final Block COBBLED_CHALK_BRICKS = registerBlock("cobbled_chalk_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block COBBLED_CHALK_BRICKS_STAIRS = registerBlock("cobbled_chalk_bricks_stairs",
			new StairsBlock(COBBLED_CHALK_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block COBBLED_CHALK_BRICKS_SLAB = registerBlock("cobbled_chalk_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block COBBLED_CHALK_BRICKS_WALL = registerBlock("cobbled_chalk_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily COBBLED_CHALK_BRICKS_FAMILY = BlockFamilies.register(COBBLED_CHALK_BRICKS)
			.stairs(COBBLED_CHALK_BRICKS_STAIRS)
			.slab(COBBLED_CHALK_BRICKS_SLAB)
			.wall(COBBLED_CHALK_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cobbled_brick").build();
	public static final Block CRACKED_COBBLED_CHALK_BRICKS = registerBlock("cracked_cobbled_chalk_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CRACKED_COBBLED_CHALK_BRICKS_STAIRS = registerBlock("cracked_cobbled_chalk_bricks_stairs",
			new StairsBlock(CRACKED_COBBLED_CHALK_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block CRACKED_COBBLED_CHALK_BRICKS_SLAB = registerBlock("cracked_cobbled_chalk_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block CRACKED_COBBLED_CHALK_BRICKS_WALL = registerBlock("cracked_cobbled_chalk_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily CRACKED_COBBLED_CHALK_BRICKS_FAMILY = BlockFamilies.register(CRACKED_COBBLED_CHALK_BRICKS)
			.stairs(CRACKED_COBBLED_CHALK_BRICKS_STAIRS)
			.slab(CRACKED_COBBLED_CHALK_BRICKS_SLAB)
			.wall(CRACKED_COBBLED_CHALK_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_cobbled_brick").build();

	public static final Block MOSSY_COBBLED_CHALK_BRICKS = registerBlock("mossy_cobbled_chalk_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block MOSSY_COBBLED_CHALK_BRICK_STAIRS = registerBlock("mossy_cobbled_chalk_brick_stairs",
			new StairsBlock(MOSSY_COBBLED_CHALK_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block MOSSY_COBBLED_CHALK_BRICK_SLAB = registerBlock("mossy_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block MOSSY_COBBLED_CHALK_BRICK_WALL = registerBlock("mossy_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily MOSSY_COBBLED_CHALK_BRICK_FAMILY =
			BlockFamilies.register(MOSSY_COBBLED_CHALK_BRICKS)
					.stairs(MOSSY_COBBLED_CHALK_BRICK_STAIRS)
					.slab(MOSSY_COBBLED_CHALK_BRICK_SLAB)
					.wall(MOSSY_COBBLED_CHALK_BRICK_WALL)
					.group("stone").unlockCriterionName("has_mossy_cobbled_brick").build();
	public static final Block CRACKED_MOSSY_COBBLED_CHALK_BRICKS = registerBlock("cracked_mossy_cobbled_chalk_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CRACKED_MOSSY_COBBLED_CHALK_BRICK_STAIRS = registerBlock("cracked_mossy_cobbled_chalk_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_COBBLED_CHALK_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block CRACKED_MOSSY_COBBLED_CHALK_BRICK_SLAB = registerBlock("cracked_mossy_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block CRACKED_MOSSY_COBBLED_CHALK_BRICK_WALL = registerBlock("cracked_mossy_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_COBBLED_CHALK_BRICK_FAMILY =
			BlockFamilies.register(CRACKED_MOSSY_COBBLED_CHALK_BRICKS)
					.stairs(CRACKED_MOSSY_COBBLED_CHALK_BRICK_STAIRS)
					.slab(CRACKED_MOSSY_COBBLED_CHALK_BRICK_SLAB)
					.wall(CRACKED_MOSSY_COBBLED_CHALK_BRICK_WALL)
					.group("stone").unlockCriterionName("has_cracked_mossy_cobbled_brick").build();

	public static final Block OVERGROWN_COBBLED_CHALK_BRICKS = registerBlock("overgrown_cobbled_chalk_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block OVERGROWN_COBBLED_CHALK_BRICK_STAIRS = registerBlock("overgrown_cobbled_chalk_brick_stairs",
			new StairsBlock(OVERGROWN_COBBLED_CHALK_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block OVERGROWN_COBBLED_CHALK_BRICK_SLAB = registerBlock("overgrown_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block OVERGROWN_COBBLED_CHALK_BRICK_WALL = registerBlock("overgrown_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily OVERGROWN_COBBLED_CHALK_BRICK_FAMILY =
			BlockFamilies.register(OVERGROWN_COBBLED_CHALK_BRICKS)
					.stairs(OVERGROWN_COBBLED_CHALK_BRICK_STAIRS)
					.slab(OVERGROWN_COBBLED_CHALK_BRICK_SLAB)
					.wall(OVERGROWN_COBBLED_CHALK_BRICK_WALL)
					.group("stone").unlockCriterionName("has_overgrown_cobbled_brick").build();
	public static final Block CRACKED_OVERGROWN_COBBLED_CHALK_BRICKS = registerBlock("cracked_overgrown_cobbled_chalk_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
	public static final Block CRACKED_OVERGROWN_COBBLED_CHALK_BRICK_STAIRS = registerBlock("cracked_overgrown_cobbled_chalk_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_COBBLED_CHALK_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_COBBLED_CHALK_BRICK_SLAB = registerBlock("cracked_overgrown_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_COBBLED_CHALK_BRICK_WALL = registerBlock("cracked_overgrown_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_COBBLED_CHALK_BRICK_FAMILY =
			BlockFamilies.register(CRACKED_OVERGROWN_COBBLED_CHALK_BRICKS)
					.stairs(CRACKED_OVERGROWN_COBBLED_CHALK_BRICK_STAIRS)
					.slab(CRACKED_OVERGROWN_COBBLED_CHALK_BRICK_SLAB)
					.wall(CRACKED_OVERGROWN_COBBLED_CHALK_BRICK_WALL)
					.group("stone").unlockCriterionName("has_cracked_overgrown_cobbled_brick").build();

	public static final Block SMOOTH_CHALK = registerBlock("smooth_chalk",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block SMOOTH_CHALK_SLAB = registerBlock("smooth_chalk_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block CRACKED_SMOOTH_CHALK = registerBlock("cracked_smooth_chalk",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block CRACKED_SMOOTH_CHALK_SLAB = registerBlock("cracked_smooth_chalk_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));

	public static final Block MOSSY_SMOOTH_CHALK = registerBlock("mossy_smooth_chalk",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block MOSSY_SMOOTH_CHALK_SLAB = registerBlock("mossy_smooth_chalk_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block CRACKED_MOSSY_SMOOTH_CHALK = registerBlock("cracked_mossy_smooth_chalk",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block CRACKED_MOSSY_SMOOTH_CHALK_SLAB = registerBlock(
			"cracked_mossy_smooth_chalk_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));

	public static final Block OVERGROWN_SMOOTH_CHALK = registerBlock("overgrown_smooth_chalk",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block OVERGROWN_SMOOTH_CHALK_SLAB = registerBlock("overgrown_smooth_chalk_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_SMOOTH_CHALK = registerBlock("cracked_overgrown_smooth_chalk",
			new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE)));
	public static final Block CRACKED_OVERGROWN_SMOOTH_CHALK_SLAB = registerBlock(
			"cracked_overgrown_smooth_chalk_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE_SLAB)));

	public static final Block CHALK_BRICK = registerBlock("chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CHALK_BRICK_STAIRS = registerBlock("chalk_brick_stairs",
			new StairsBlock(CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CHALK_BRICK_SLAB = registerBlock("chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CHALK_BRICK_WALL = registerBlock("chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final Block CHISELED_CHALK_BRICK = registerBlock("chiseled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final BlockFamily CHALK_BRICK_FAMILY = BlockFamilies.register(CHALK_BRICK)
			.stairs(CHALK_BRICK_STAIRS)
			.slab(CHALK_BRICK_SLAB)
			.wall(CHALK_BRICK_WALL)
			.chiseled(CHISELED_CHALK_BRICK)
			.group("stone").unlockCriterionName("has_brick").build();
	public static final Block CRACKED_CHALK_BRICK = registerBlock("cracked_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_CHALK_BRICK_STAIRS = registerBlock("cracked_chalk_brick_stairs",
			new StairsBlock(CRACKED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_CHALK_BRICK_SLAB = registerBlock("cracked_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_CHALK_BRICK_WALL = registerBlock("cracked_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_CHALK_BRICK)
			.stairs(CRACKED_CHALK_BRICK_STAIRS)
			.slab(CRACKED_CHALK_BRICK_SLAB)
			.wall(CRACKED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_brick").build();

	public static final Block MOSSY_CHALK_BRICK = registerBlock("mossy_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_CHALK_BRICK_STAIRS = registerBlock("mossy_chalk_brick_stairs",
			new StairsBlock(MOSSY_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_CHALK_BRICK_SLAB = registerBlock("mossy_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_CHALK_BRICK_WALL = registerBlock("mossy_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_CHALK_BRICK)
			.stairs(MOSSY_CHALK_BRICK_STAIRS)
			.slab(MOSSY_CHALK_BRICK_SLAB)
			.wall(MOSSY_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_mossy_brick").build();
	public static final Block CRACKED_MOSSY_CHALK_BRICK = registerBlock("cracked_mossy_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_CHALK_BRICK_STAIRS = registerBlock("cracked_mossy_chalk_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_CHALK_BRICK_SLAB = registerBlock("cracked_mossy_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_CHALK_BRICK_WALL = registerBlock("cracked_mossy_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_MOSSY_CHALK_BRICK)
			.stairs(CRACKED_MOSSY_CHALK_BRICK_STAIRS)
			.slab(CRACKED_MOSSY_CHALK_BRICK_SLAB)
			.wall(CRACKED_MOSSY_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_brick").build();

	public static final Block OVERGROWN_CHALK_BRICK = registerBlock("overgrown_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_CHALK_BRICK_STAIRS = registerBlock("overgrown_chalk_brick_stairs",
			new StairsBlock(OVERGROWN_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_CHALK_BRICK_SLAB = registerBlock("overgrown_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_CHALK_BRICK_WALL = registerBlock("overgrown_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_CHALK_BRICK)
			.stairs(OVERGROWN_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_overgrown_brick").build();
	public static final Block CRACKED_OVERGROWN_CHALK_BRICK = registerBlock("cracked_overgrown_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_CHALK_BRICK_STAIRS = registerBlock("cracked_overgrown_chalk_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_CHALK_BRICK_SLAB = registerBlock("cracked_overgrown_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_CHALK_BRICK_WALL = registerBlock("cracked_overgrown_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_CHALK_BRICK)
			.stairs(CRACKED_OVERGROWN_CHALK_BRICK_STAIRS)
			.slab(CRACKED_OVERGROWN_CHALK_BRICK_SLAB)
			.wall(CRACKED_OVERGROWN_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_brick").build();

	public static final Block CHALK_TILES = registerBlock("chalk_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CHALK_TILES_STAIRS = registerBlock("chalk_tiles_stairs",
			new StairsBlock(CHALK_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CHALK_TILES_SLAB = registerBlock("chalk_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CHALK_TILES_WALL = registerBlock("chalk_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CHALK_TILES_FAMILY = BlockFamilies.register(CHALK_TILES)
			.stairs(CHALK_TILES_STAIRS)
			.slab(CHALK_TILES_SLAB)
			.wall(CHALK_TILES_WALL)
			.group("stone").unlockCriterionName("has_tile").build();
	public static final Block CRACKED_CHALK_TILES = registerBlock("cracked_chalk_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_CHALK_TILES_STAIRS = registerBlock("cracked_chalk_tiles_stairs",
			new StairsBlock(CRACKED_CHALK_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_CHALK_TILES_SLAB = registerBlock("cracked_chalk_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_CHALK_TILES_WALL = registerBlock("cracked_chalk_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_CHALK_TILES_FAMILY = BlockFamilies.register(CRACKED_CHALK_TILES)
			.stairs(CRACKED_CHALK_TILES_STAIRS)
			.slab(CRACKED_CHALK_TILES_SLAB)
			.wall(CRACKED_CHALK_TILES_WALL)
			.group("stone").unlockCriterionName("has_cracked_tile").build();

	public static final Block MOSSY_CHALK_TILES = registerBlock("mossy_chalk_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_CHALK_TILES_STAIRS = registerBlock("mossy_chalk_tiles_stairs",
			new StairsBlock(MOSSY_CHALK_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_CHALK_TILES_SLAB = registerBlock("mossy_chalk_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_CHALK_TILES_WALL = registerBlock("mossy_chalk_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_CHALK_TILES_FAMILY = BlockFamilies.register(MOSSY_CHALK_TILES)
			.stairs(MOSSY_CHALK_TILES_STAIRS)
			.slab(MOSSY_CHALK_TILES_SLAB)
			.wall(MOSSY_CHALK_TILES_WALL)
			.group("stone").unlockCriterionName("has_mossy_tile").build();
	public static final Block CRACKED_MOSSY_CHALK_TILES = registerBlock("cracked_mossy_chalk_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_CHALK_TILES_STAIRS = registerBlock("cracked_mossy_chalk_tiles_stairs",
			new StairsBlock(CRACKED_MOSSY_CHALK_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_CHALK_TILES_SLAB = registerBlock("cracked_mossy_chalk_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_CHALK_TILES_WALL = registerBlock("cracked_mossy_chalk_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_CHALK_TILES_FAMILY = BlockFamilies.register(CRACKED_MOSSY_CHALK_TILES)
			.stairs(CRACKED_MOSSY_CHALK_TILES_STAIRS)
			.slab(CRACKED_MOSSY_CHALK_TILES_SLAB)
			.wall(CRACKED_MOSSY_CHALK_TILES_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_tile").build();

	public static final Block OVERGROWN_CHALK_TILES = registerBlock("overgrown_chalk_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_CHALK_TILES_STAIRS = registerBlock("overgrown_chalk_tiles_stairs",
			new StairsBlock(OVERGROWN_CHALK_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_CHALK_TILES_SLAB = registerBlock("overgrown_chalk_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_CHALK_TILES_WALL = registerBlock("overgrown_chalk_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_CHALK_TILES_FAMILY = BlockFamilies.register(OVERGROWN_CHALK_TILES)
			.stairs(OVERGROWN_CHALK_TILES_STAIRS)
			.slab(OVERGROWN_CHALK_TILES_SLAB)
			.wall(OVERGROWN_CHALK_TILES_WALL)
			.group("stone").unlockCriterionName("has_overgrown_tile").build();
	public static final Block CRACKED_OVERGROWN_CHALK_TILES = registerBlock("cracked_overgrown_chalk_tiles",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_CHALK_TILES_STAIRS = registerBlock("cracked_overgrown_chalk_tiles_stairs",
			new StairsBlock(CRACKED_OVERGROWN_CHALK_TILES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_CHALK_TILES_SLAB = registerBlock("cracked_overgrown_chalk_tiles_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_CHALK_TILES_WALL = registerBlock("cracked_overgrown_chalk_tiles_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_CHALK_TILES_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_CHALK_TILES)
			.stairs(CRACKED_OVERGROWN_CHALK_TILES_STAIRS)
			.slab(CRACKED_OVERGROWN_CHALK_TILES_SLAB)
			.wall(CRACKED_OVERGROWN_CHALK_TILES_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_tile").build();

	public static final Block CHALK_PILLAR = registerBlock("chalk_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CHALK_PILLAR_SLAB = registerBlock("chalk_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_CHALK_PILLAR = registerBlock("cracked_chalk_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_CHALK_PILLAR_SLAB = registerBlock("cracked_chalk_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

	public static final Block MOSSY_CHALK_PILLAR = registerBlock("mossy_chalk_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_CHALK_PILLAR_SLAB = registerBlock("mossy_chalk_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_CHALK_PILLAR = registerBlock("cracked_mossy_chalk_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_CHALK_PILLAR_SLAB = registerBlock("cracked_mossy_chalk_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

	public static final Block OVERGROWN_CHALK_PILLAR = registerBlock("overgrown_chalk_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_CHALK_PILLAR_SLAB = registerBlock("overgrown_chalk_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_CHALK_PILLAR = registerBlock("cracked_overgrown_chalk_pillar",
			new ModPillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_CHALK_PILLAR_SLAB = registerBlock("cracked_overgrown_chalk_pillar_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));

	public static final Block CHALK_PAVEMENT = registerBlock("chalk_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CHALK_PAVEMENT_STAIRS = registerBlock("chalk_pavement_stairs",
			new StairsBlock(CHALK_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CHALK_PAVEMENT_SLAB = registerBlock("chalk_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CHALK_PAVEMENT_FAMILY = BlockFamilies.register(CHALK_PAVEMENT)
			.stairs(CHALK_PAVEMENT_STAIRS)
			.slab(CHALK_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_pavement").build();
	public static final Block CRACKED_CHALK_PAVEMENT = registerBlock("cracked_chalk_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_CHALK_PAVEMENT_STAIRS = registerBlock("cracked_chalk_pavement_stairs",
			new StairsBlock(CRACKED_CHALK_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_CHALK_PAVEMENT_SLAB = registerBlock("cracked_chalk_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CRACKED_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_CHALK_PAVEMENT)
			.stairs(CRACKED_CHALK_PAVEMENT_STAIRS)
			.slab(CRACKED_CHALK_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_cracked_pavement").build();

	public static final Block MOSSY_CHALK_PAVEMENT = registerBlock("mossy_chalk_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_CHALK_PAVEMENT_STAIRS = registerBlock("mossy_chalk_pavement_stairs",
			new StairsBlock(MOSSY_CHALK_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_CHALK_PAVEMENT_SLAB = registerBlock("mossy_chalk_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily MOSSY_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(MOSSY_CHALK_PAVEMENT)
			.stairs(MOSSY_CHALK_PAVEMENT_STAIRS)
			.slab(MOSSY_CHALK_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_mossy_pavement").build();
	public static final Block CRACKED_MOSSY_CHALK_PAVEMENT = registerBlock("cracked_mossy_chalk_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_CHALK_PAVEMENT_STAIRS = registerBlock("cracked_mossy_chalk_pavement_stairs",
			new StairsBlock(CRACKED_MOSSY_CHALK_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_CHALK_PAVEMENT_SLAB = registerBlock("cracked_mossy_chalk_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CRACKED_MOSSY_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_MOSSY_CHALK_PAVEMENT)
			.stairs(CRACKED_MOSSY_CHALK_PAVEMENT_STAIRS)
			.slab(CRACKED_MOSSY_CHALK_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_cracked_mossy_pavement").build();

	public static final Block OVERGROWN_CHALK_PAVEMENT = registerBlock("overgrown_chalk_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_CHALK_PAVEMENT_STAIRS = registerBlock("overgrown_chalk_pavement_stairs",
			new StairsBlock(OVERGROWN_CHALK_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_CHALK_PAVEMENT_SLAB = registerBlock("overgrown_chalk_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily OVERGROWN_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(OVERGROWN_CHALK_PAVEMENT)
			.stairs(OVERGROWN_CHALK_PAVEMENT_STAIRS)
			.slab(OVERGROWN_CHALK_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_overgrown_pavement").build();
	public static final Block CRACKED_OVERGROWN_CHALK_PAVEMENT = registerBlock("cracked_overgrown_chalk_pavement",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_CHALK_PAVEMENT_STAIRS = registerBlock("cracked_overgrown_chalk_pavement_stairs",
			new StairsBlock(CRACKED_OVERGROWN_CHALK_PAVEMENT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_CHALK_PAVEMENT_SLAB = registerBlock("cracked_overgrown_chalk_pavement_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final BlockFamily CRACKED_OVERGROWN_CHALK_PAVEMENT_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_CHALK_PAVEMENT)
			.stairs(CRACKED_OVERGROWN_CHALK_PAVEMENT_STAIRS)
			.slab(CRACKED_OVERGROWN_CHALK_PAVEMENT_SLAB)
			.group("stone").unlockCriterionName("has_cracked_overgrown_pavement").build();

	public static final Block FANCY_CHALK_BRICKS = registerBlock("fancy_chalk_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block FANCY_CHALK_BRICKS_STAIRS = registerBlock("fancy_chalk_bricks_stairs",
			new StairsBlock(FANCY_CHALK_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block FANCY_CHALK_BRICKS_SLAB = registerBlock("fancy_chalk_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block FANCY_CHALK_BRICKS_WALL = registerBlock("fancy_chalk_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily FANCY_CHALK_BRICKS_FAMILY = BlockFamilies.register(FANCY_CHALK_BRICKS)
			.stairs(FANCY_CHALK_BRICKS_STAIRS)
			.slab(FANCY_CHALK_BRICKS_SLAB)
			.wall(FANCY_CHALK_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_fancy_bricks").build();
	public static final Block CRACKED_FANCY_CHALK_BRICKS = registerBlock("cracked_fancy_chalk_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_FANCY_CHALK_BRICKS_STAIRS = registerBlock(
			"cracked_fancy_chalk_bricks_stairs",
			new StairsBlock(CRACKED_FANCY_CHALK_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_FANCY_CHALK_BRICKS_SLAB = registerBlock("cracked_fancy_chalk_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_FANCY_CHALK_BRICKS_WALL = registerBlock("cracked_fancy_chalk_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_FANCY_CHALK_BRICKS_FAMILY = BlockFamilies.register(CRACKED_FANCY_CHALK_BRICKS)
			.stairs(CRACKED_FANCY_CHALK_BRICKS_STAIRS)
			.slab(CRACKED_FANCY_CHALK_BRICKS_SLAB)
			.wall(CRACKED_FANCY_CHALK_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_fancy_bricks").build();

	public static final Block MOSSY_FANCY_CHALK_BRICKS = registerBlock("mossy_fancy_chalk_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_FANCY_CHALK_BRICKS_STAIRS = registerBlock("mossy_fancy_chalk_bricks_stairs",
			new StairsBlock(MOSSY_FANCY_CHALK_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_FANCY_CHALK_BRICKS_SLAB = registerBlock("mossy_fancy_chalk_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_FANCY_CHALK_BRICKS_WALL = registerBlock("mossy_fancy_chalk_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_FANCY_CHALK_BRICKS_FAMILY = BlockFamilies.register(MOSSY_FANCY_CHALK_BRICKS)
			.stairs(MOSSY_FANCY_CHALK_BRICKS_STAIRS)
			.slab(MOSSY_FANCY_CHALK_BRICKS_SLAB)
			.wall(MOSSY_FANCY_CHALK_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_mossy_fancy_bricks").build();
	public static final Block CRACKED_MOSSY_FANCY_CHALK_BRICKS = registerBlock("cracked_mossy_fancy_chalk_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_FANCY_CHALK_BRICKS_STAIRS = registerBlock(
			"cracked_mossy_fancy_chalk_bricks_stairs",
			new StairsBlock(CRACKED_MOSSY_FANCY_CHALK_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_FANCY_CHALK_BRICKS_SLAB = registerBlock("cracked_mossy_fancy_chalk_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_FANCY_CHALK_BRICKS_WALL = registerBlock("cracked_mossy_fancy_chalk_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_FANCY_CHALK_BRICKS_FAMILY = BlockFamilies.register(CRACKED_MOSSY_FANCY_CHALK_BRICKS)
			.stairs(CRACKED_MOSSY_FANCY_CHALK_BRICKS_STAIRS)
			.slab(CRACKED_MOSSY_FANCY_CHALK_BRICKS_SLAB)
			.wall(CRACKED_MOSSY_FANCY_CHALK_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_fancy_bricks").build();

	public static final Block OVERGROWN_FANCY_CHALK_BRICKS = registerBlock("overgrown_fancy_chalk_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_FANCY_CHALK_BRICKS_STAIRS = registerBlock("overgrown_fancy_chalk_bricks_stairs",
			new StairsBlock(OVERGROWN_FANCY_CHALK_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_FANCY_CHALK_BRICKS_SLAB = registerBlock("overgrown_fancy_chalk_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_FANCY_CHALK_BRICKS_WALL = registerBlock("overgrown_fancy_chalk_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_FANCY_CHALK_BRICKS_FAMILY = BlockFamilies.register(OVERGROWN_FANCY_CHALK_BRICKS)
			.stairs(OVERGROWN_FANCY_CHALK_BRICKS_STAIRS)
			.slab(OVERGROWN_FANCY_CHALK_BRICKS_SLAB)
			.wall(OVERGROWN_FANCY_CHALK_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_overgrown_fancy_bricks").build();
	public static final Block CRACKED_OVERGROWN_FANCY_CHALK_BRICKS = registerBlock("cracked_overgrown_fancy_chalk_bricks",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_FANCY_CHALK_BRICKS_STAIRS = registerBlock(
			"cracked_overgrown_fancy_chalk_bricks_stairs",
			new StairsBlock(CRACKED_OVERGROWN_FANCY_CHALK_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_FANCY_CHALK_BRICKS_SLAB = registerBlock("cracked_overgrown_fancy_chalk_bricks_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_FANCY_CHALK_BRICKS_WALL = registerBlock("cracked_overgrown_fancy_chalk_bricks_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_FANCY_CHALK_BRICKS_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_FANCY_CHALK_BRICKS)
			.stairs(CRACKED_OVERGROWN_FANCY_CHALK_BRICKS_STAIRS)
			.slab(CRACKED_OVERGROWN_FANCY_CHALK_BRICKS_SLAB)
			.wall(CRACKED_OVERGROWN_FANCY_CHALK_BRICKS_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_fancy_bricks").build();

	// BRONZE ORNAMENTED CHALK VARIANTS

	// Bronze Chalk Brick
	public static final Block BRONZE_CHALK_BRICK = registerBlock("bronze_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block BRONZE_CHALK_BRICK_STAIRS = registerBlock("bronze_chalk_brick_stairs",
			new StairsBlock(BRONZE_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block BRONZE_CHALK_BRICK_SLAB = registerBlock("bronze_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block BRONZE_CHALK_BRICK_WALL = registerBlock("bronze_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily BRONZE_CHALK_BRICK_FAMILY = BlockFamilies.register(BRONZE_CHALK_BRICK)
			.stairs(BRONZE_CHALK_BRICK_STAIRS)
			.slab(BRONZE_CHALK_BRICK_SLAB)
			.wall(BRONZE_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_bronze_brick").build();

	public static final Block CRACKED_BRONZE_CHALK_BRICK = registerBlock("cracked_bronze_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_BRONZE_CHALK_BRICK_STAIRS = registerBlock("cracked_bronze_chalk_brick_stairs",
			new StairsBlock(CRACKED_BRONZE_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_BRONZE_CHALK_BRICK_SLAB = registerBlock("cracked_bronze_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_BRONZE_CHALK_BRICK_WALL = registerBlock("cracked_bronze_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_BRONZE_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_BRONZE_CHALK_BRICK)
			.stairs(CRACKED_BRONZE_CHALK_BRICK_STAIRS)
			.slab(CRACKED_BRONZE_CHALK_BRICK_SLAB)
			.wall(CRACKED_BRONZE_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_bronze_brick").build();

	public static final Block MOSSY_BRONZE_CHALK_BRICK = registerBlock("mossy_bronze_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_BRONZE_CHALK_BRICK_STAIRS = registerBlock("mossy_bronze_chalk_brick_stairs",
			new StairsBlock(MOSSY_BRONZE_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_BRONZE_CHALK_BRICK_SLAB = registerBlock("mossy_bronze_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_BRONZE_CHALK_BRICK_WALL = registerBlock("mossy_bronze_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_BRONZE_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_BRONZE_CHALK_BRICK)
			.stairs(MOSSY_BRONZE_CHALK_BRICK_STAIRS)
			.slab(MOSSY_BRONZE_CHALK_BRICK_SLAB)
			.wall(MOSSY_BRONZE_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_mossy_bronze_brick").build();

	public static final Block CRACKED_MOSSY_BRONZE_CHALK_BRICK = registerBlock("cracked_mossy_bronze_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_BRONZE_CHALK_BRICK_STAIRS = registerBlock("cracked_mossy_bronze_chalk_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_BRONZE_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_BRONZE_CHALK_BRICK_SLAB = registerBlock("cracked_mossy_bronze_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_BRONZE_CHALK_BRICK_WALL = registerBlock("cracked_mossy_bronze_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_BRONZE_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_MOSSY_BRONZE_CHALK_BRICK)
			.stairs(CRACKED_MOSSY_BRONZE_CHALK_BRICK_STAIRS)
			.slab(CRACKED_MOSSY_BRONZE_CHALK_BRICK_SLAB)
			.wall(CRACKED_MOSSY_BRONZE_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_bronze_brick").build();

	public static final Block OVERGROWN_BRONZE_CHALK_BRICK = registerBlock("overgrown_bronze_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_BRONZE_CHALK_BRICK_STAIRS = registerBlock("overgrown_bronze_chalk_brick_stairs",
			new StairsBlock(OVERGROWN_BRONZE_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_BRONZE_CHALK_BRICK_SLAB = registerBlock("overgrown_bronze_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_BRONZE_CHALK_BRICK_WALL = registerBlock("overgrown_bronze_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_BRONZE_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_CHALK_BRICK)
			.stairs(OVERGROWN_BRONZE_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_BRONZE_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_BRONZE_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_overgrown_bronze_brick").build();

	public static final Block CRACKED_OVERGROWN_BRONZE_CHALK_BRICK = registerBlock("cracked_overgrown_bronze_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_BRONZE_CHALK_BRICK_STAIRS = registerBlock("cracked_overgrown_bronze_chalk_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_BRONZE_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_BRONZE_CHALK_BRICK_SLAB = registerBlock("cracked_overgrown_bronze_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_BRONZE_CHALK_BRICK_WALL = registerBlock("cracked_overgrown_bronze_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_BRONZE_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_BRONZE_CHALK_BRICK)
			.stairs(CRACKED_OVERGROWN_BRONZE_CHALK_BRICK_STAIRS)
			.slab(CRACKED_OVERGROWN_BRONZE_CHALK_BRICK_SLAB)
			.wall(CRACKED_OVERGROWN_BRONZE_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_bronze_brick").build();

	// Silver Chalk Brick
	public static final Block SILVER_CHALK_BRICK = registerBlock("silver_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block SILVER_CHALK_BRICK_STAIRS = registerBlock("silver_chalk_brick_stairs",
			new StairsBlock(SILVER_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block SILVER_CHALK_BRICK_SLAB = registerBlock("silver_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block SILVER_CHALK_BRICK_WALL = registerBlock("silver_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily SILVER_CHALK_BRICK_FAMILY = BlockFamilies.register(SILVER_CHALK_BRICK)
			.stairs(SILVER_CHALK_BRICK_STAIRS)
			.slab(SILVER_CHALK_BRICK_SLAB)
			.wall(SILVER_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_silver_brick").build();

	public static final Block CRACKED_SILVER_CHALK_BRICK = registerBlock("cracked_silver_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_SILVER_CHALK_BRICK_STAIRS = registerBlock("cracked_silver_chalk_brick_stairs",
			new StairsBlock(CRACKED_SILVER_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_SILVER_CHALK_BRICK_SLAB = registerBlock("cracked_silver_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_SILVER_CHALK_BRICK_WALL = registerBlock("cracked_silver_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_SILVER_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_SILVER_CHALK_BRICK)
			.stairs(CRACKED_SILVER_CHALK_BRICK_STAIRS)
			.slab(CRACKED_SILVER_CHALK_BRICK_SLAB)
			.wall(CRACKED_SILVER_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_silver_brick").build();

	public static final Block MOSSY_SILVER_CHALK_BRICK = registerBlock("mossy_silver_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_SILVER_CHALK_BRICK_STAIRS = registerBlock("mossy_silver_chalk_brick_stairs",
			new StairsBlock(MOSSY_SILVER_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_SILVER_CHALK_BRICK_SLAB = registerBlock("mossy_silver_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_SILVER_CHALK_BRICK_WALL = registerBlock("mossy_silver_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_SILVER_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_SILVER_CHALK_BRICK)
			.stairs(MOSSY_SILVER_CHALK_BRICK_STAIRS)
			.slab(MOSSY_SILVER_CHALK_BRICK_SLAB)
			.wall(MOSSY_SILVER_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_mossy_silver_brick").build();

	public static final Block CRACKED_MOSSY_SILVER_CHALK_BRICK = registerBlock("cracked_mossy_silver_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_SILVER_CHALK_BRICK_STAIRS = registerBlock("cracked_mossy_silver_chalk_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_SILVER_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_SILVER_CHALK_BRICK_SLAB = registerBlock("cracked_mossy_silver_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_SILVER_CHALK_BRICK_WALL = registerBlock("cracked_mossy_silver_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_SILVER_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_MOSSY_SILVER_CHALK_BRICK)
			.stairs(CRACKED_MOSSY_SILVER_CHALK_BRICK_STAIRS)
			.slab(CRACKED_MOSSY_SILVER_CHALK_BRICK_SLAB)
			.wall(CRACKED_MOSSY_SILVER_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_silver_brick").build();

	public static final Block OVERGROWN_SILVER_CHALK_BRICK = registerBlock("overgrown_silver_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_SILVER_CHALK_BRICK_STAIRS = registerBlock("overgrown_silver_chalk_brick_stairs",
			new StairsBlock(OVERGROWN_SILVER_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_SILVER_CHALK_BRICK_SLAB = registerBlock("overgrown_silver_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_SILVER_CHALK_BRICK_WALL = registerBlock("overgrown_silver_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_SILVER_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_CHALK_BRICK)
			.stairs(OVERGROWN_SILVER_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_SILVER_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_SILVER_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_overgrown_silver_brick").build();

	public static final Block CRACKED_OVERGROWN_SILVER_CHALK_BRICK = registerBlock("cracked_overgrown_silver_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_SILVER_CHALK_BRICK_STAIRS = registerBlock("cracked_overgrown_silver_chalk_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_SILVER_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_SILVER_CHALK_BRICK_SLAB = registerBlock("cracked_overgrown_silver_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_SILVER_CHALK_BRICK_WALL = registerBlock("cracked_overgrown_silver_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_SILVER_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_SILVER_CHALK_BRICK)
			.stairs(CRACKED_OVERGROWN_SILVER_CHALK_BRICK_STAIRS)
			.slab(CRACKED_OVERGROWN_SILVER_CHALK_BRICK_SLAB)
			.wall(CRACKED_OVERGROWN_SILVER_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_silver_brick").build();

	// Gold Chalk Brick
	public static final Block GOLD_CHALK_BRICK = registerBlock("gold_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block GOLD_CHALK_BRICK_STAIRS = registerBlock("gold_chalk_brick_stairs",
			new StairsBlock(GOLD_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block GOLD_CHALK_BRICK_SLAB = registerBlock("gold_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block GOLD_CHALK_BRICK_WALL = registerBlock("gold_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily GOLD_CHALK_BRICK_FAMILY = BlockFamilies.register(GOLD_CHALK_BRICK)
			.stairs(GOLD_CHALK_BRICK_STAIRS)
			.slab(GOLD_CHALK_BRICK_SLAB)
			.wall(GOLD_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_gold_brick").build();

	public static final Block CRACKED_GOLD_CHALK_BRICK = registerBlock("cracked_gold_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_GOLD_CHALK_BRICK_STAIRS = registerBlock("cracked_gold_chalk_brick_stairs",
			new StairsBlock(CRACKED_GOLD_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_GOLD_CHALK_BRICK_SLAB = registerBlock("cracked_gold_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_GOLD_CHALK_BRICK_WALL = registerBlock("cracked_gold_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_GOLD_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_GOLD_CHALK_BRICK)
			.stairs(CRACKED_GOLD_CHALK_BRICK_STAIRS)
			.slab(CRACKED_GOLD_CHALK_BRICK_SLAB)
			.wall(CRACKED_GOLD_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_gold_brick").build();

	public static final Block MOSSY_GOLD_CHALK_BRICK = registerBlock("mossy_gold_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_GOLD_CHALK_BRICK_STAIRS = registerBlock("mossy_gold_chalk_brick_stairs",
			new StairsBlock(MOSSY_GOLD_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_GOLD_CHALK_BRICK_SLAB = registerBlock("mossy_gold_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_GOLD_CHALK_BRICK_WALL = registerBlock("mossy_gold_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_GOLD_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_GOLD_CHALK_BRICK)
			.stairs(MOSSY_GOLD_CHALK_BRICK_STAIRS)
			.slab(MOSSY_GOLD_CHALK_BRICK_SLAB)
			.wall(MOSSY_GOLD_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_mossy_gold_brick").build();

	public static final Block CRACKED_MOSSY_GOLD_CHALK_BRICK = registerBlock("cracked_mossy_gold_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_GOLD_CHALK_BRICK_STAIRS = registerBlock("cracked_mossy_gold_chalk_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_GOLD_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_GOLD_CHALK_BRICK_SLAB = registerBlock("cracked_mossy_gold_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_GOLD_CHALK_BRICK_WALL = registerBlock("cracked_mossy_gold_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_GOLD_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_MOSSY_GOLD_CHALK_BRICK)
			.stairs(CRACKED_MOSSY_GOLD_CHALK_BRICK_STAIRS)
			.slab(CRACKED_MOSSY_GOLD_CHALK_BRICK_SLAB)
			.wall(CRACKED_MOSSY_GOLD_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_gold_brick").build();

	public static final Block OVERGROWN_GOLD_CHALK_BRICK = registerBlock("overgrown_gold_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_GOLD_CHALK_BRICK_STAIRS = registerBlock("overgrown_gold_chalk_brick_stairs",
			new StairsBlock(OVERGROWN_GOLD_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_GOLD_CHALK_BRICK_SLAB = registerBlock("overgrown_gold_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_GOLD_CHALK_BRICK_WALL = registerBlock("overgrown_gold_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_GOLD_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_CHALK_BRICK)
			.stairs(OVERGROWN_GOLD_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_GOLD_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_GOLD_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_overgrown_gold_brick").build();

	public static final Block CRACKED_OVERGROWN_GOLD_CHALK_BRICK = registerBlock("cracked_overgrown_gold_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_GOLD_CHALK_BRICK_STAIRS = registerBlock("cracked_overgrown_gold_chalk_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_GOLD_CHALK_BRICK.getDefaultState(),
					FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_GOLD_CHALK_BRICK_SLAB = registerBlock("cracked_overgrown_gold_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_GOLD_CHALK_BRICK_WALL = registerBlock("cracked_overgrown_gold_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_GOLD_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_GOLD_CHALK_BRICK)
			.stairs(CRACKED_OVERGROWN_GOLD_CHALK_BRICK_STAIRS)
			.slab(CRACKED_OVERGROWN_GOLD_CHALK_BRICK_SLAB)
			.wall(CRACKED_OVERGROWN_GOLD_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_gold_brick").build();

	// BRONZE COBBLED CHALK BRICK VARIANTS
	public static final Block BRONZE_COBBLED_CHALK_BRICK = registerBlock("bronze_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block BRONZE_COBBLED_CHALK_BRICK_STAIRS = registerBlock("bronze_cobbled_chalk_brick_stairs",
			new StairsBlock(BRONZE_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block BRONZE_COBBLED_CHALK_BRICK_SLAB = registerBlock("bronze_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block BRONZE_COBBLED_CHALK_BRICK_WALL = registerBlock("bronze_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily BRONZE_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(BRONZE_COBBLED_CHALK_BRICK)
			.stairs(BRONZE_COBBLED_CHALK_BRICK_STAIRS)
			.slab(BRONZE_COBBLED_CHALK_BRICK_SLAB)
			.wall(BRONZE_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_bronze_cobbled_brick").build();

	public static final Block CRACKED_BRONZE_COBBLED_CHALK_BRICK = registerBlock("cracked_bronze_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_BRONZE_COBBLED_CHALK_BRICK_STAIRS = registerBlock("cracked_bronze_cobbled_chalk_brick_stairs",
			new StairsBlock(CRACKED_BRONZE_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_BRONZE_COBBLED_CHALK_BRICK_SLAB = registerBlock("cracked_bronze_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_BRONZE_COBBLED_CHALK_BRICK_WALL = registerBlock("cracked_bronze_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_BRONZE_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_BRONZE_COBBLED_CHALK_BRICK)
			.stairs(CRACKED_BRONZE_COBBLED_CHALK_BRICK_STAIRS)
			.slab(CRACKED_BRONZE_COBBLED_CHALK_BRICK_SLAB)
			.wall(CRACKED_BRONZE_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_bronze_cobbled_brick").build();

	public static final Block MOSSY_BRONZE_COBBLED_CHALK_BRICK = registerBlock("mossy_bronze_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_BRONZE_COBBLED_CHALK_BRICK_STAIRS = registerBlock("mossy_bronze_cobbled_chalk_brick_stairs",
			new StairsBlock(MOSSY_BRONZE_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_BRONZE_COBBLED_CHALK_BRICK_SLAB = registerBlock("mossy_bronze_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_BRONZE_COBBLED_CHALK_BRICK_WALL = registerBlock("mossy_bronze_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_BRONZE_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_BRONZE_COBBLED_CHALK_BRICK)
			.stairs(MOSSY_BRONZE_COBBLED_CHALK_BRICK_STAIRS)
			.slab(MOSSY_BRONZE_COBBLED_CHALK_BRICK_SLAB)
			.wall(MOSSY_BRONZE_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_mossy_bronze_cobbled_brick").build();

	public static final Block CRACKED_MOSSY_BRONZE_COBBLED_CHALK_BRICK = registerBlock("cracked_mossy_bronze_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_BRONZE_COBBLED_CHALK_BRICK_STAIRS = registerBlock("cracked_mossy_bronze_cobbled_chalk_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_BRONZE_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_BRONZE_COBBLED_CHALK_BRICK_SLAB = registerBlock("cracked_mossy_bronze_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_BRONZE_COBBLED_CHALK_BRICK_WALL = registerBlock("cracked_mossy_bronze_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_BRONZE_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_MOSSY_BRONZE_COBBLED_CHALK_BRICK)
			.stairs(CRACKED_MOSSY_BRONZE_COBBLED_CHALK_BRICK_STAIRS)
			.slab(CRACKED_MOSSY_BRONZE_COBBLED_CHALK_BRICK_SLAB)
			.wall(CRACKED_MOSSY_BRONZE_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_bronze_cobbled_brick").build();

	public static final Block OVERGROWN_BRONZE_COBBLED_CHALK_BRICK = registerBlock("overgrown_bronze_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_STAIRS = registerBlock("overgrown_bronze_cobbled_chalk_brick_stairs",
			new StairsBlock(OVERGROWN_BRONZE_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_SLAB = registerBlock("overgrown_bronze_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_WALL = registerBlock("overgrown_bronze_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_BRONZE_COBBLED_CHALK_BRICK)
			.stairs(OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_overgrown_bronze_cobbled_brick").build();

	public static final Block CRACKED_OVERGROWN_BRONZE_COBBLED_CHALK_BRICK = registerBlock("cracked_overgrown_bronze_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_STAIRS = registerBlock("cracked_overgrown_bronze_cobbled_chalk_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_BRONZE_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_SLAB = registerBlock("cracked_overgrown_bronze_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_WALL = registerBlock("cracked_overgrown_bronze_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_BRONZE_COBBLED_CHALK_BRICK)
			.stairs(CRACKED_OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_STAIRS)
			.slab(CRACKED_OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_SLAB)
			.wall(CRACKED_OVERGROWN_BRONZE_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_bronze_cobbled_brick").build();

	// SILVER COBBLED CHALK BRICK VARIANTS
	public static final Block SILVER_COBBLED_CHALK_BRICK = registerBlock("silver_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block SILVER_COBBLED_CHALK_BRICK_STAIRS = registerBlock("silver_cobbled_chalk_brick_stairs",
			new StairsBlock(SILVER_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block SILVER_COBBLED_CHALK_BRICK_SLAB = registerBlock("silver_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block SILVER_COBBLED_CHALK_BRICK_WALL = registerBlock("silver_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily SILVER_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(SILVER_COBBLED_CHALK_BRICK)
			.stairs(SILVER_COBBLED_CHALK_BRICK_STAIRS)
			.slab(SILVER_COBBLED_CHALK_BRICK_SLAB)
			.wall(SILVER_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_silver_cobbled_brick").build();

	public static final Block CRACKED_SILVER_COBBLED_CHALK_BRICK = registerBlock("cracked_silver_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_SILVER_COBBLED_CHALK_BRICK_STAIRS = registerBlock("cracked_silver_cobbled_chalk_brick_stairs",
			new StairsBlock(CRACKED_SILVER_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_SILVER_COBBLED_CHALK_BRICK_SLAB = registerBlock("cracked_silver_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_SILVER_COBBLED_CHALK_BRICK_WALL = registerBlock("cracked_silver_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_SILVER_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_SILVER_COBBLED_CHALK_BRICK)
			.stairs(CRACKED_SILVER_COBBLED_CHALK_BRICK_STAIRS)
			.slab(CRACKED_SILVER_COBBLED_CHALK_BRICK_SLAB)
			.wall(CRACKED_SILVER_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_silver_cobbled_brick").build();

	public static final Block MOSSY_SILVER_COBBLED_CHALK_BRICK = registerBlock("mossy_silver_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_SILVER_COBBLED_CHALK_BRICK_STAIRS = registerBlock("mossy_silver_cobbled_chalk_brick_stairs",
			new StairsBlock(MOSSY_SILVER_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_SILVER_COBBLED_CHALK_BRICK_SLAB = registerBlock("mossy_silver_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_SILVER_COBBLED_CHALK_BRICK_WALL = registerBlock("mossy_silver_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_SILVER_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_SILVER_COBBLED_CHALK_BRICK)
			.stairs(MOSSY_SILVER_COBBLED_CHALK_BRICK_STAIRS)
			.slab(MOSSY_SILVER_COBBLED_CHALK_BRICK_SLAB)
			.wall(MOSSY_SILVER_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_mossy_silver_cobbled_brick").build();

	public static final Block CRACKED_MOSSY_SILVER_COBBLED_CHALK_BRICK = registerBlock("cracked_mossy_silver_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_SILVER_COBBLED_CHALK_BRICK_STAIRS = registerBlock("cracked_mossy_silver_cobbled_chalk_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_SILVER_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_SILVER_COBBLED_CHALK_BRICK_SLAB = registerBlock("cracked_mossy_silver_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_SILVER_COBBLED_CHALK_BRICK_WALL = registerBlock("cracked_mossy_silver_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_SILVER_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_MOSSY_SILVER_COBBLED_CHALK_BRICK)
			.stairs(CRACKED_MOSSY_SILVER_COBBLED_CHALK_BRICK_STAIRS)
			.slab(CRACKED_MOSSY_SILVER_COBBLED_CHALK_BRICK_SLAB)
			.wall(CRACKED_MOSSY_SILVER_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_silver_cobbled_brick").build();

	public static final Block OVERGROWN_SILVER_COBBLED_CHALK_BRICK = registerBlock("overgrown_silver_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_SILVER_COBBLED_CHALK_BRICK_STAIRS = registerBlock("overgrown_silver_cobbled_chalk_brick_stairs",
			new StairsBlock(OVERGROWN_SILVER_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_SILVER_COBBLED_CHALK_BRICK_SLAB = registerBlock("overgrown_silver_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_SILVER_COBBLED_CHALK_BRICK_WALL = registerBlock("overgrown_silver_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_SILVER_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_SILVER_COBBLED_CHALK_BRICK)
			.stairs(OVERGROWN_SILVER_COBBLED_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_SILVER_COBBLED_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_SILVER_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_overgrown_silver_cobbled_brick").build();

	public static final Block CRACKED_OVERGROWN_SILVER_COBBLED_CHALK_BRICK = registerBlock("cracked_overgrown_silver_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_SILVER_COBBLED_CHALK_BRICK_STAIRS = registerBlock("cracked_overgrown_silver_cobbled_chalk_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_SILVER_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_SILVER_COBBLED_CHALK_BRICK_SLAB = registerBlock("cracked_overgrown_silver_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_SILVER_COBBLED_CHALK_BRICK_WALL = registerBlock("cracked_overgrown_silver_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_SILVER_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_SILVER_COBBLED_CHALK_BRICK)
			.stairs(CRACKED_OVERGROWN_SILVER_COBBLED_CHALK_BRICK_STAIRS)
			.slab(CRACKED_OVERGROWN_SILVER_COBBLED_CHALK_BRICK_SLAB)
			.wall(CRACKED_OVERGROWN_SILVER_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_silver_cobbled_brick").build();

	// GOLD COBBLED CHALK BRICK VARIANTS
	public static final Block GOLD_COBBLED_CHALK_BRICK = registerBlock("gold_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block GOLD_COBBLED_CHALK_BRICK_STAIRS = registerBlock("gold_cobbled_chalk_brick_stairs",
			new StairsBlock(GOLD_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block GOLD_COBBLED_CHALK_BRICK_SLAB = registerBlock("gold_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block GOLD_COBBLED_CHALK_BRICK_WALL = registerBlock("gold_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily GOLD_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(GOLD_COBBLED_CHALK_BRICK)
			.stairs(GOLD_COBBLED_CHALK_BRICK_STAIRS)
			.slab(GOLD_COBBLED_CHALK_BRICK_SLAB)
			.wall(GOLD_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_gold_cobbled_brick").build();

	public static final Block CRACKED_GOLD_COBBLED_CHALK_BRICK = registerBlock("cracked_gold_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_GOLD_COBBLED_CHALK_BRICK_STAIRS = registerBlock("cracked_gold_cobbled_chalk_brick_stairs",
			new StairsBlock(CRACKED_GOLD_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_GOLD_COBBLED_CHALK_BRICK_SLAB = registerBlock("cracked_gold_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_GOLD_COBBLED_CHALK_BRICK_WALL = registerBlock("cracked_gold_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_GOLD_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_GOLD_COBBLED_CHALK_BRICK)
			.stairs(CRACKED_GOLD_COBBLED_CHALK_BRICK_STAIRS)
			.slab(CRACKED_GOLD_COBBLED_CHALK_BRICK_SLAB)
			.wall(CRACKED_GOLD_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_gold_cobbled_brick").build();

	public static final Block MOSSY_GOLD_COBBLED_CHALK_BRICK = registerBlock("mossy_gold_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block MOSSY_GOLD_COBBLED_CHALK_BRICK_STAIRS = registerBlock("mossy_gold_cobbled_chalk_brick_stairs",
			new StairsBlock(MOSSY_GOLD_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block MOSSY_GOLD_COBBLED_CHALK_BRICK_SLAB = registerBlock("mossy_gold_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block MOSSY_GOLD_COBBLED_CHALK_BRICK_WALL = registerBlock("mossy_gold_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily MOSSY_GOLD_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(MOSSY_GOLD_COBBLED_CHALK_BRICK)
			.stairs(MOSSY_GOLD_COBBLED_CHALK_BRICK_STAIRS)
			.slab(MOSSY_GOLD_COBBLED_CHALK_BRICK_SLAB)
			.wall(MOSSY_GOLD_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_mossy_gold_cobbled_brick").build();

	public static final Block CRACKED_MOSSY_GOLD_COBBLED_CHALK_BRICK = registerBlock("cracked_mossy_gold_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_MOSSY_GOLD_COBBLED_CHALK_BRICK_STAIRS = registerBlock("cracked_mossy_gold_cobbled_chalk_brick_stairs",
			new StairsBlock(CRACKED_MOSSY_GOLD_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_MOSSY_GOLD_COBBLED_CHALK_BRICK_SLAB = registerBlock("cracked_mossy_gold_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_MOSSY_GOLD_COBBLED_CHALK_BRICK_WALL = registerBlock("cracked_mossy_gold_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_MOSSY_GOLD_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_MOSSY_GOLD_COBBLED_CHALK_BRICK)
			.stairs(CRACKED_MOSSY_GOLD_COBBLED_CHALK_BRICK_STAIRS)
			.slab(CRACKED_MOSSY_GOLD_COBBLED_CHALK_BRICK_SLAB)
			.wall(CRACKED_MOSSY_GOLD_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_mossy_gold_cobbled_brick").build();

	public static final Block OVERGROWN_GOLD_COBBLED_CHALK_BRICK = registerBlock("overgrown_gold_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block OVERGROWN_GOLD_COBBLED_CHALK_BRICK_STAIRS = registerBlock("overgrown_gold_cobbled_chalk_brick_stairs",
			new StairsBlock(OVERGROWN_GOLD_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block OVERGROWN_GOLD_COBBLED_CHALK_BRICK_SLAB = registerBlock("overgrown_gold_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block OVERGROWN_GOLD_COBBLED_CHALK_BRICK_WALL = registerBlock("overgrown_gold_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily OVERGROWN_GOLD_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(OVERGROWN_GOLD_COBBLED_CHALK_BRICK)
			.stairs(OVERGROWN_GOLD_COBBLED_CHALK_BRICK_STAIRS)
			.slab(OVERGROWN_GOLD_COBBLED_CHALK_BRICK_SLAB)
			.wall(OVERGROWN_GOLD_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_overgrown_gold_cobbled_brick").build();

	public static final Block CRACKED_OVERGROWN_GOLD_COBBLED_CHALK_BRICK = registerBlock("cracked_overgrown_gold_cobbled_chalk_brick",
			new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
	public static final Block CRACKED_OVERGROWN_GOLD_COBBLED_CHALK_BRICK_STAIRS = registerBlock("cracked_overgrown_gold_cobbled_chalk_brick_stairs",
			new StairsBlock(CRACKED_OVERGROWN_GOLD_COBBLED_CHALK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS)));
	public static final Block CRACKED_OVERGROWN_GOLD_COBBLED_CHALK_BRICK_SLAB = registerBlock("cracked_overgrown_gold_cobbled_chalk_brick_slab",
			new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)));
	public static final Block CRACKED_OVERGROWN_GOLD_COBBLED_CHALK_BRICK_WALL = registerBlock("cracked_overgrown_gold_cobbled_chalk_brick_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.ANDESITE_WALL)));
	public static final BlockFamily CRACKED_OVERGROWN_GOLD_COBBLED_CHALK_BRICK_FAMILY = BlockFamilies.register(CRACKED_OVERGROWN_GOLD_COBBLED_CHALK_BRICK)
			.stairs(CRACKED_OVERGROWN_GOLD_COBBLED_CHALK_BRICK_STAIRS)
			.slab(CRACKED_OVERGROWN_GOLD_COBBLED_CHALK_BRICK_SLAB)
			.wall(CRACKED_OVERGROWN_GOLD_COBBLED_CHALK_BRICK_WALL)
			.group("stone").unlockCriterionName("has_cracked_overgrown_gold_cobbled_brick").build();

    /**
     * This Method is used to register a Block with minecraft and also register the Item for the block
     * @param name the name of the Block
     * @param block the Block to be registered
     * @return The Block after it has been registered
     */
    private static Block registerBlock (String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,
                new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name),
                block);
    }

    /**
     * This Method is used to register a Block Item with minecraft
     * @param name The name of the Block
     * @param block The Block to be registered as Item
     * @return The BlockItem after it has been registered
     */
    private static Item registerBlockItem (String name, Block block) {
        return Registry.register(Registries.ITEM,
                new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    /**
     * This Method is run on startup and informs that Blocks are being registered.
     */
    public static void registerModStoneBlocks () {
        LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Mod Stone Blocks for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
    }
}
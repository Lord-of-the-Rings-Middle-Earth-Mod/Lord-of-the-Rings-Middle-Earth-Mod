/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.datagen.util;

import com.anedhel.lotr.LotRMEMod;
import net.minecraft.client.data.Model;
import net.minecraft.client.data.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

/**
 * Custom model definitions for data generation.
 *
 * @author Moritz Rohleder, AnoJedt
 * @since 0.1.0
 */
public class ModModels {

	public static final Model PILLAR = block(Identifier.of("minecraft", "block/cube_column"),
			TextureKey.END, TextureKey.SIDE);
	public static final Model PILLAR_TOP = block(Identifier.of("minecraft", "block/cube_column"), "_top",
			TextureKey.END, TextureKey.SIDE);
	public static final Model PILLAR_MIDDLE = block(Identifier.of("minecraft", "block/cube_column"), "_middle",
			TextureKey.END, TextureKey.SIDE);
	public static final Model PILLAR_BASE = block(Identifier.of("minecraft", "block/cube_column"), "_bottom",
			TextureKey.END, TextureKey.SIDE);

	public static final Model PILLAR_OVERLAY = block("pillar_overlay", TextureKey.END, TextureKey.SIDE,
			TextureKey.LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model PILLAR_TOP_OVERLAY = block("pillar_overlay", "_top", TextureKey.END, TextureKey.SIDE,
			TextureKey.LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model PILLAR_MIDDLE_OVERLAY = block("pillar_overlay", "_middle", TextureKey.END, TextureKey.SIDE,
			TextureKey.LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model PILLAR_BASE_OVERLAY = block("pillar_overlay", "_base", TextureKey.END, TextureKey.SIDE,
			TextureKey.LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model PILLAR_SLAB_OVERLAY = block("pillar_slab_overlay", TextureKey.END, TextureKey.SIDE,
			TextureKey.LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model PILLAR_SLAB_TOP_OVERLAY = block("pillar_slab_top_overlay", "_top", TextureKey.END,
			TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.END_LAYER1);

	public static final Model PILLAR_TWO_OVERLAY = block("pillar_two_overlay", TextureKey.END, TextureKey.SIDE,
			TextureKey.LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2, ModTextureKeys.END_LAYER2);
	public static final Model PILLAR_TOP_TWO_OVERLAY = block("pillar_two_overlay", "_top", TextureKey.END, TextureKey.SIDE,
			TextureKey.LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2, ModTextureKeys.END_LAYER2);
	public static final Model PILLAR_MIDDLE_TWO_OVERLAY = block("pillar_two_overlay", "_middle", TextureKey.END, TextureKey.SIDE,
			TextureKey.LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2, ModTextureKeys.END_LAYER2);
	public static final Model PILLAR_BASE_TWO_OVERLAY = block("pillar_two_overlay", "_base", TextureKey.END,
			TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2, ModTextureKeys.END_LAYER2);
	public static final Model PILLAR_SLAB_TWO_OVERLAY = block("pillar_slab_two_overlay", TextureKey.END, TextureKey.SIDE,
			TextureKey.LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2, ModTextureKeys.END_LAYER2);
	public static final Model PILLAR_SLAB_TOP_TWO_OVERLAY = block("pillar_slab_top_two_overlay", "_top", TextureKey.END,
			TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2, ModTextureKeys.END_LAYER2);

	public static final Model FRIEZE = block("frieze", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);
	public static final Model FRIEZE_NORTHEND = block("frieze", "_northend", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);
	public static final Model FRIEZE_EASTEND = block("frieze", "_eastend", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);
	public static final Model FRIEZE_SOUTHEND = block("frieze", "_southend", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);
	public static final Model FRIEZE_WESTEND = block("frieze","_westend", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);
	public static final Model FRIEZE_NORTHEASTCORNER = block("frieze", "_northeastcorner", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);
	public static final Model FRIEZE_NORTHWESTCORNER = block("frieze", "_northwestcorner", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);
	public static final Model FRIEZE_SOUTHEASTCORNER = block("frieze", "_southeastcorner", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);
	public static final Model FRIEZE_SOUTHWESTCORNER = block("frieze", "_southwestcorner", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);
	public static final Model FRIEZE_NORTHSOUTHMIDDLE = block("frieze", "_northsouthmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);
	public static final Model FRIEZE_EASTWESTMIDDLE = block("frieze", "_eastwestmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);
	public static final Model FRIEZE_TNORTHMIDDLE = block("frieze", "_tnorthmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);
	public static final Model FRIEZE_TEASTMIDDLE = block("frieze", "_teastmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);
	public static final Model FRIEZE_TSOUTHMIDDLE = block("frieze", "_tsouthmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);
	public static final Model FRIEZE_TWESTMIDDLE = block("frieze", "_twestmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);
	public static final Model FRIEZE_CROSSMIDDLE = block("frieze", "_crossmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST);

	public static final Model FRIEZE_OVERLAY = block("frieze_overlay", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_NORTHEND_OVERLAY = block("frieze_overlay", "_northend", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_EASTEND_OVERLAY = block("frieze_overlay", "_eastend", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_SOUTHEND_OVERLAY = block("frieze_overlay", "_southend", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_WESTEND_OVERLAY = block("frieze_overlay","_westend", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_NORTHEASTCORNER_OVERLAY = block("frieze_overlay", "_northeastcorner", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_NORTHWESTCORNER_OVERLAY = block("frieze_overlay", "_northwestcorner", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_SOUTHEASTCORNER_OVERLAY = block("frieze_overlay", "_southeastcorner", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_SOUTHWESTCORNER_OVERLAY = block("frieze_overlay", "_southwestcorner", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_NORTHSOUTHMIDDLE_OVERLAY = block("frieze_overlay", "_northsouthmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_EASTWESTMIDDLE_OVERLAY = block("frieze_overlay", "_eastwestmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_TNORTHMIDDLE_OVERLAY = block("frieze_overlay", "_tnorthmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_TEASTMIDDLE_OVERLAY = block("frieze_overlay", "_teastmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_TSOUTHMIDDLE_OVERLAY = block("frieze_overlay", "_tsouthmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_TWESTMIDDLE_OVERLAY = block("frieze_overlay", "_twestmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_CROSSMIDDLE_OVERLAY = block("frieze_overlay", "_crossmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_SLAB_OVERLAY = block("frieze_slab_overlay", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model FRIEZE_SLAB_TOP_OVERLAY = block("frieze_slab_top_overlay", "_top", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1);

	public static final Model FRIEZE_TWO_OVERLAY = block("frieze_two_overlay", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_NORTHEND_TWO_OVERLAY = block("frieze_two_overlay", "_northend", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_EASTEND_TWO_OVERLAY = block("frieze_two_overlay", "_eastend", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_SOUTHEND_TWO_OVERLAY = block("frieze_two_overlay", "_southend", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_WESTEND_TWO_OVERLAY = block("frieze_two_overlay","_westend", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_NORTHEASTCORNER_TWO_OVERLAY = block("frieze_two_overlay", "_northeastcorner", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_NORTHWESTCORNER_TWO_OVERLAY = block("frieze_two_overlay", "_northwestcorner", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_SOUTHEASTCORNER_TWO_OVERLAY = block("frieze_two_overlay", "_southeastcorner", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_SOUTHWESTCORNER_TWO_OVERLAY = block("frieze_two_overlay", "_southwestcorner", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_NORTHSOUTHMIDDLE_TWO_OVERLAY = block("frieze_two_overlay", "_northsouthmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_EASTWESTMIDDLE_TWO_OVERLAY = block("frieze_two_overlay", "_eastwestmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_TNORTHMIDDLE_TWO_OVERLAY = block("frieze_two_overlay", "_tnorthmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_TEASTMIDDLE_TWO_OVERLAY = block("frieze_two_overlay", "_teastmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_TSOUTHMIDDLE_TWO_OVERLAY = block("frieze_two_overlay", "_tsouthmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_TWESTMIDDLE_TWO_OVERLAY = block("frieze_two_overlay", "_twestmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_CROSSMIDDLE_TWO_OVERLAY = block("frieze_two_overlay", "_crossmiddle", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_SLAB_TWO_OVERLAY = block("frieze_slab_two_overlay", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);
	public static final Model FRIEZE_SLAB_TOP_TWO_OVERLAY = block("frieze_slab_top_two_overlay", "_top", TextureKey.END, TextureKey.NORTH, TextureKey.EAST,
			TextureKey.SOUTH, TextureKey.WEST, ModTextureKeys.NORTH_LAYER1, ModTextureKeys.EAST_LAYER1, ModTextureKeys.SOUTH_LAYER1,
			ModTextureKeys.WEST_LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2);

	public static final Model CUBE_ALL_OVERLAY = block("cube_all_overlay", TextureKey.ALL,
			TextureKey.LAYER1);
	public static final Model STAIRS_ALL_OVERLAY = block("stairs_all_overlay",
			TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1);
	public static final Model INNER_STAIRS_ALL_OVERLAY = block("inner_stairs_all_overlay",
			"_inner", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1);
	public static final Model OUTER_STAIRS_ALL_OVERLAY = block("outer_stairs_all_overlay",
			"_outer", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1);
	public static final Model SLAB_ALL_OVERLAY = block("slab_all_overlay",
			TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1);
	public static final Model SLAB_TOP_ALL_OVERLAY = block("slab_top_all_overlay",
			"_top", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1);
	public static final Model WALL_POST_ALL_OVERLAY = block("wall_post_all_overlay",
			"_post", TextureKey.WALL, TextureKey.LAYER1);
	public static final Model WALL_SIDE_ALL_OVERLAY = block("wall_side_all_overlay",
			"_side", TextureKey.WALL, TextureKey.LAYER1);
	public static final Model WALL_SIDE_TALL_ALL_OVERLAY = block("wall_side_tall_all_overlay",
			"_side_tall", TextureKey.WALL, TextureKey.LAYER1);
	public static final Model WALL_INVENTORY_ALL_OVERLAY = block("wall_inventory_all_overlay",
			"_inventory", TextureKey.WALL, TextureKey.LAYER1);
	public static final Model BUTTON_ALL_OVERLAY = block("button_all_overlay",
			TextureKey.TEXTURE, TextureKey.LAYER1);
	public static final Model BUTTON_PRESSED_ALL_OVERLAY = block("button_pressed_all_overlay",
			"_pressed", TextureKey.TEXTURE, TextureKey.LAYER1);
	public static final Model BUTTON_INVENTORY_ALL_OVERLAY = block("button_inventory_all_overlay",
			"_inventory", TextureKey.TEXTURE, TextureKey.LAYER1);
	public static final Model PRESSURE_PLATE_UP_ALL_OVERLAY = block("pressure_plate_up_all_overlay",
			"", TextureKey.TEXTURE, TextureKey.LAYER1);
	public static final Model PRESSURE_PLATE_DOWN_ALL_OVERLAY = block("pressure_plate_down_all_overlay",
			"_down", TextureKey.TEXTURE, TextureKey.LAYER1);

	public static final Model CUBE_ALL_TWO_OVERLAY = block("cube_all_two_overlay", TextureKey.ALL,
			TextureKey.LAYER1, TextureKey.LAYER2);
	public static final Model STAIRS_ALL_TWO_OVERLAY = block("stairs_all_two_overlay",
			TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, TextureKey.LAYER2);
	public static final Model INNER_STAIRS_ALL_TWO_OVERLAY = block("inner_stairs_all_two_overlay",
			"_inner", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, TextureKey.LAYER2);
	public static final Model OUTER_STAIRS_ALL_TWO_OVERLAY = block("outer_stairs_all_two_overlay",
			"_outer", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, TextureKey.LAYER2);
	public static final Model SLAB_ALL_TWO_OVERLAY = block("slab_all_two_overlay",
			TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, TextureKey.LAYER2);
	public static final Model SLAB_TOP_ALL_TWO_OVERLAY = block("slab_top_all_two_overlay",
			"_top", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, TextureKey.LAYER2);
	public static final Model WALL_POST_ALL_TWO_OVERLAY = block("wall_post_all_two_overlay",
			"_post", TextureKey.WALL, TextureKey.LAYER1, TextureKey.LAYER2);
	public static final Model WALL_SIDE_ALL_TWO_OVERLAY = block("wall_side_all_two_overlay",
			"_side", TextureKey.WALL, TextureKey.LAYER1, TextureKey.LAYER2);
	public static final Model WALL_SIDE_TALL_ALL_TWO_OVERLAY = block("wall_side_tall_all_two_overlay",
			"_side_tall", TextureKey.WALL, TextureKey.LAYER1, TextureKey.LAYER2);
	public static final Model WALL_INVENTORY_ALL_TWO_OVERLAY = block("wall_inventory_all_two_overlay",
			"_inventory", TextureKey.WALL, TextureKey.LAYER1, TextureKey.LAYER2);

	public static final Model PAVEMENT_OVERLAY = block("pavement_overlay",
			TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.TOP_LAYER1);
	public static final Model PAVEMENT_STAIRS_OVERLAY = block("pavement_stairs_overlay",
			TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.TOP_LAYER1);
	public static final Model PAVEMENT_INNER_STAIRS_OVERLAY = block("pavement_inner_stairs_overlay",
			"_inner", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.TOP_LAYER1);
	public static final Model PAVEMENT_OUTER_STAIRS_OVERLAY = block("pavement_outer_stairs_overlay",
			"_outer", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.TOP_LAYER1);
	public static final Model PAVEMENT_SLAB_OVERLAY = block("pavement_slab_overlay",
			TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.TOP_LAYER1);
	public static final Model PAVEMENT_SLAB_TOP_OVERLAY = block("pavement_slab_top_overlay",
			"_top", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.TOP_LAYER1);

	public static final Model PAVEMENT_TWO_OVERLAY = block("pavement_two_overlay",
			TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.TOP_LAYER1, TextureKey.LAYER2);
	public static final Model PAVEMENT_STAIRS_TWO_OVERLAY = block("pavement_stairs_two_overlay",
			TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.TOP_LAYER1, TextureKey.LAYER2);
	public static final Model PAVEMENT_INNER_STAIRS_TWO_OVERLAY = block("pavement_inner_stairs_two_overlay",
			"_inner", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.TOP_LAYER1, TextureKey.LAYER2);
	public static final Model PAVEMENT_OUTER_STAIRS_TWO_OVERLAY = block("pavement_outer_stairs_two_overlay",
			"_outer", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.TOP_LAYER1, TextureKey.LAYER2);
	public static final Model PAVEMENT_SLAB_TWO_OVERLAY = block("pavement_slab_two_overlay",
			TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.TOP_LAYER1, TextureKey.LAYER2);
	public static final Model PAVEMENT_SLAB_TOP_TWO_OVERLAY = block("pavement_slab_top_two_overlay",
			"_top", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.TOP_LAYER1, TextureKey.LAYER2);

	public static final Model POLISHED_SLAB_OVERLAY = block("polished_slab_overlay",
			TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model POLISHED_SLAB_TOP_OVERLAY = block("polished_slab_top_overlay",
			"_top", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.END_LAYER1);
	public static final Model DOUBLE_POLISHED_OVERLAY = block("polished_overlay",
			TextureKey.END, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.END_LAYER1);

	public static final Model POLISHED_SLAB_TWO_OVERLAY = block("polished_slab_two_overlay",
			TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2, ModTextureKeys.END_LAYER2);
	public static final Model POLISHED_SLAB_TOP_TWO_OVERLAY = block("polished_slab_top_two_overlay",
			"_top", TextureKey.BOTTOM, TextureKey.TOP, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2, ModTextureKeys.END_LAYER2);
	public static final Model DOUBLE_POLISHED_TWO_OVERLAY = block("polished_two_overlay",
			TextureKey.END, TextureKey.SIDE, TextureKey.LAYER1, ModTextureKeys.END_LAYER1, TextureKey.LAYER2, ModTextureKeys.END_LAYER2);

	/**
	 * Helper method to create a block model with the given parent and required texture keys.
	 * @param parent the parent model's name as String
	 * @param requiredTextureKeys the required texture keys, seperated by commas
	 * @return the created block {@link Model}
	 */
	private static Model block(String parent, TextureKey ... requiredTextureKeys) {
		return block(Identifier.of(LotRMEMod.MOD_ID, "block/" + parent), requiredTextureKeys);
	}

	/**
	 * Helper method to create a block model with the given parent, variant and required texture keys.
	 *
	 * @param parent the parent model's name as String
	 * @param variant the variant suffix
	 * @param requiredTextureKeys the required texture keys, seperated by commas
	 * @return the created block {@link Model}
	 */
	private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
		return block(Identifier.of(LotRMEMod.MOD_ID, "block/" + parent), variant, requiredTextureKeys);
	}

	/**
	 * Helper method to create a block model with the given parent and required texture keys.
	 *
	 * @param parent the parent model's {@link Identifier}
	 * @param requiredTextureKeys the required texture keys, seperated by commas
	 * @return the created block {@link Model}
	 */
	private static Model block(Identifier parent, TextureKey ... requiredTextureKeys) {
		return new Model(Optional.of(parent),
				Optional.empty(), requiredTextureKeys);
	}

	/**
	 * Helper method to create a block model with the given parent, variant and required texture keys.
	 *
	 * @param parent the parent model's {@link Identifier}
	 * @param variant the variant suffix
	 * @param requiredTextureKeys the required texture keys, seperated by commas
	 * @return the created block {@link Model}
	 */
	private static Model block(Identifier parent, String variant, TextureKey... requiredTextureKeys) {
		return new Model(Optional.of(parent) ,Optional.of(variant), requiredTextureKeys);
	}
}

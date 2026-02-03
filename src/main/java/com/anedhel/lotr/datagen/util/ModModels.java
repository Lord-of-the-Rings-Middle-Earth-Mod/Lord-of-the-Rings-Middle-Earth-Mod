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

	private static Model block(String parent, TextureKey ... requiredTextureKeys) {
		return block(Identifier.of(LotRMEMod.MOD_ID, "block/" + parent), requiredTextureKeys);
	}

	private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
		return block(Identifier.of(LotRMEMod.MOD_ID, "block/" + parent), variant, requiredTextureKeys);
	}

	private static Model block(Identifier parent, TextureKey ... requiredTextureKeys) {
		return new Model(Optional.of(parent),
				Optional.empty(), requiredTextureKeys);
	}

	private static Model block(Identifier parent, String variant, TextureKey... requiredTextureKeys) {
		return new Model(Optional.of(parent) ,Optional.of(variant), requiredTextureKeys);
	}
}

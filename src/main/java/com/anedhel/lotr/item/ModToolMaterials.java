/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.item;

import com.anedhel.lotr.block.ModBlockTags;
import net.minecraft.item.ToolMaterial;

/**
 * Defines tool materials for custom tools added by the mod.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModToolMaterials {

	public static ToolMaterial BRONZE = new ToolMaterial(ModBlockTags.INCORRECT_FOR_BRONZE_TOOL, 225,
			5.5f, 1.5f, 13, ModItemTags.BRONZE_MATERIALS);
}

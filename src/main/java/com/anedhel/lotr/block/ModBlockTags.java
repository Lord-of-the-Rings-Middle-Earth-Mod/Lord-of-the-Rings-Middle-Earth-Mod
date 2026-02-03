/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.block;

import com.anedhel.lotr.LotRMEMod;
import net.fabricmc.fabric.api.tag.convention.v2.TagUtil;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

/**
 * Defines block tags used by the mod for grouping and identifying blocks.
 * <p>
 * Tags are used for various purposes including recipes, mining requirements,
 * block behavior, and block connections (pillars and friezes).
 * </p>
 *
 * @author Moritz Rohleder
 * @see ModBlocks
 * @since 0.1.0
 */
public class ModBlockTags {

	public static final TagKey<Block> PILLARS = createCommonTag("pillars");
	public static final TagKey<Block> FRIEZES = createCommonTag("friezes");

	public static final TagKey<Block> PINE_LOGS = createModTag("pine_logs");

	public static final TagKey<Block> INCORRECT_FOR_BRONZE_TOOL = createModTag("incorrect_for_bronze_tool");

	/**
	 * Creates a tag in the common namespace for cross-mod compatibility.
	 *
	 * @param name the tag name
	 * @return the created tag key
	 */
	private static TagKey<Block> createCommonTag(String name) {
		return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TagUtil.C_TAG_NAMESPACE, name));
	}

	/**
	 * Creates a tag in this mod's namespace.
	 *
	 * @param name the tag name
	 * @return the created tag key
	 */
	private static TagKey<Block> createModTag(String name) {
		return TagKey.of(RegistryKeys.BLOCK, Identifier.of(LotRMEMod.MOD_ID, name));
	}
}

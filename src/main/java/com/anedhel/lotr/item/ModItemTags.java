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

import com.anedhel.lotr.LotRMEMod;
import net.fabricmc.fabric.api.tag.convention.v2.TagUtil;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {

	public static TagKey<Item> PINE_LOGS = createModTag("pine_logs");

	public static TagKey<Item> BRONZE_MATERIALS = createModTag("bronze_materials");

	private static TagKey<Item> createCommonTag(String name) {
		return TagKey.of(RegistryKeys.ITEM, Identifier.of(TagUtil.C_TAG_NAMESPACE, name));
	}

	private static TagKey<Item> createModTag(String name) {
		return TagKey.of(RegistryKeys.ITEM, Identifier.of(LotRMEMod.MOD_ID, name));
	}
}

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
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class ModArmorMaterials {
	static RegistryKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY =
			RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset"));
	public static final RegistryKey<EquipmentAsset> BRONZE_ARMOR_KEY =
			RegistryKey.of(REGISTRY_KEY, Identifier.of(LotRMEMod.MOD_ID, "bronze"));

	public static final ArmorMaterial BRONZE_ARMOR_MATERIAL = new ArmorMaterial(
		13, Util.make(new EnumMap<>(EquipmentType.class), map -> {
			map.put(EquipmentType.BOOTS, 2);
			map.put(EquipmentType.LEGGINGS, 4);
			map.put(EquipmentType.CHESTPLATE, 5);
			map.put(EquipmentType.HELMET, 2);
			map.put(EquipmentType.BODY, 4);
		}), 9, SoundEvents.ITEM_ARMOR_EQUIP_COPPER,0,0,
			ModItemTags.BRONZE_MATERIALS, BRONZE_ARMOR_KEY);
}

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

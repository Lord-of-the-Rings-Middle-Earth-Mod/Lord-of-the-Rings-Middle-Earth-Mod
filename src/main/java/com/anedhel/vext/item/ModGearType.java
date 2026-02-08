/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.registry.RegistryKey;

import java.util.List;

/**
 * Enum representing complete gear sets including tools and armor.
 * <p>
 * Each gear type associates all related items (tools and armor pieces) with
 * their material and provides methods to retrieve items for creative tabs.
 *
 * @author Moritz Rohleder
 * @see ModArmorMaterials
 * @see ModToolMaterials
 * @since 0.1.0
 */
public enum ModGearType {
	BRONZE(ModItems.BRONZE_INGOT, ModArmorMaterials.BRONZE_ARMOR_KEY,
			ModItems.BRONZE_HELMET, ModItems.BRONZE_CHESTPLATE, ModItems.BRONZE_LEGGINGS,
			ModItems.BRONZE_BOOTS, ModItems.BRONZE_SWORD, ModItems.BRONZE_AXE, ModItems.BRONZE_PICKAXE,
			ModItems.BRONZE_SHOVEL, ModItems.BRONZE_HOE);

	private final Item material;
	private final RegistryKey<EquipmentAsset> armorMaterialKey;

	private final Item helmet;
	private final Item chestplate;
	private final Item leggings;
	private final Item boots;

	private final Item sword;
	private final Item axe;
	private final Item pickaxe;
	private final Item shovel;
	private final Item hoe;

	ModGearType(Item material, RegistryKey<EquipmentAsset> armorMaterialKey, Item helmet, Item chestplate,
			Item leggings, Item boots, Item sword, Item axe,
			Item pickaxe, Item shovel, Item hoe) {
		this.material = material;
		this.armorMaterialKey = armorMaterialKey;
		this.helmet = helmet;
		this.chestplate = chestplate;
		this.leggings = leggings;
		this.boots = boots;
		this.sword = sword;
		this.axe = axe;
		this.pickaxe = pickaxe;
		this.shovel = shovel;
		this.hoe = hoe;
	}

	/**
	 * Generates a list of tool items for display in the tools item group.
	 *
	 * @return a list of {@link ItemStack} containing all tools in this gear set
	 */
	public List<ItemStack> getToolItemGroupList() {
		return List.of(
				new ItemStack(this.axe),
				new ItemStack(this.pickaxe),
				new ItemStack(this.shovel),
				new ItemStack(this.hoe)
		);
	}

	/**
	 * Generates a list of armor items and weapons for display in the combat item group.
	 *
	 * @return a list of {@link ItemStack} containing armor pieces and sword
	 */
	public List<ItemStack> getArmorItemGroupList() {
		return List.of(
				new ItemStack(this.helmet),
				new ItemStack(this.chestplate),
				new ItemStack(this.leggings),
				new ItemStack(this.boots),
				new ItemStack(this.sword)
		);
	}

	public Item getMaterial() {
		return material;
	}

	public RegistryKey<EquipmentAsset> getArmorMaterialKey() {
		return armorMaterialKey;
	}

	public Item getHelmet() {
		return helmet;
	}

	public Item getChestplate() {
		return chestplate;
	}

	public Item getLeggings() {
		return leggings;
	}

	public Item getBoots() {
		return boots;
	}

	public Item getSword() {
		return sword;
	}

	public Item getAxe() {
		return axe;
	}

	public Item getPickaxe() {
		return pickaxe;
	}

	public Item getShovel() {
		return shovel;
	}

	public Item getHoe() {
		return hoe;
	}
}

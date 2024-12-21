/*
 * Copyright (c) 2024-2024
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
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package me.anedhel.lotrmiddleearth.item;

import me.anedhel.lotrmiddleearth.LordOfTheRingsMiddleEarthMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

	/**
	 * This adds the following Items to the Ingredient Tab in the creative Menu. - RUBY
	 *
	 * @param entries The Item Group that the items should be added to. Should always be ItemGroups.INGREDIENTS.
	 */
	private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
		//entries.add();
	}

	/**
	 * Registers a given Item with the game.
	 *
	 * @param name The name, by which the item will be referred to for textures, models and the language files.
	 * @param item The Item that is meant to be registered.
	 * @return The registered Item.
	 */
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, name), item);
	}

	public static void registerModItems() {
		LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Items for " + LordOfTheRingsMiddleEarthMod.MOD_ID);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
	}
}

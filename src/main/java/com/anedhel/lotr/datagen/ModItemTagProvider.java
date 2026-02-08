/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.datagen;

import com.anedhel.lotr.block.woodtypes.ModWoodSet;
import com.anedhel.lotr.block.woodtypes.ModWoodTypes;
import com.anedhel.lotr.item.ModGearType;
import com.anedhel.lotr.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

/**
 * Data generator for item tags.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

	public ModItemTagProvider(FabricDataOutput output,
			CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	/**
	 * Configures the item tags by adding mod items to the appropriate tags.
	 *
	 * @param wrapperLookup The registry wrapper lookup.
	 */
	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
		configureModGearTypes();
		configureModWoodTypes();

		valueLookupBuilder(ConventionalItemTags.RAW_MATERIALS)
				.add(ModItems.RAW_TIN)
				.add(ModItems.RAW_SILVER);
		valueLookupBuilder(ConventionalItemTags.INGOTS)
				.add(ModItems.TIN_INGOT)
				.add(ModItems.SILVER_INGOT)
				.add(ModItems.BRONZE_INGOT);
		valueLookupBuilder(ConventionalItemTags.NUGGETS)
				.add(ModItems.SILVER_NUGGET);
	}

	/**
	 * Configures item tags for all mod gear types.
	 */
	private void configureModGearTypes() {
		for(ModGearType gearType : ModGearType.values()) {
			valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
					.add(gearType.getHelmet())
					.add(gearType.getChestplate())
					.add(gearType.getLeggings())
					.add(gearType.getBoots());
		}
	}

	/**
	 * Configures item tags for all mod wood types.
	 */
	private void configureModWoodTypes() {
		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();

			valueLookupBuilder(woodSet.getLogItemTag())
					.add(woodSet.getLog().asItem())
					.add(woodSet.getStrippedLog().asItem())
					.add(woodSet.getWoodVariant("base").asItem())
					.add(woodSet.getStrippedWoodVariant("base").asItem());

			valueLookupBuilder(ItemTags.PLANKS)
					.add(woodSet.getPlanksVariant("base").asItem());

			valueLookupBuilder(ItemTags.LEAVES)
					.add(woodSet.getLeaves().asItem());
		}
	}

}

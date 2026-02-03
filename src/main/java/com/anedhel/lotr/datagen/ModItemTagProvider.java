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

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

	public ModItemTagProvider(FabricDataOutput output,
			CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

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

	private void configureModGearTypes() {
		for(ModGearType gearType : ModGearType.values()) {
			valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
					.add(gearType.getHelmet())
					.add(gearType.getChestplate())
					.add(gearType.getLeggings())
					.add(gearType.getBoots());
		}
	}

	private void configureModWoodTypes() {
		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();

			valueLookupBuilder(woodSet.getLogItemTag())
					.add(woodSet.getLog().asItem())
					.add(woodSet.getStrippedLog().asItem())
					.add(woodSet.getWoodVariant("base").asItem())
					.add(woodSet.getStrippedWoodVariant("base").asItem());
		}
	}

}

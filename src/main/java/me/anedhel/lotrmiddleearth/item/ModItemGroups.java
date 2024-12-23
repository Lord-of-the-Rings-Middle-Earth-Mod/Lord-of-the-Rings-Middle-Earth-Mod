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
import me.anedhel.lotrmiddleearth.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

	public static final ItemGroup testGroup = Registry.register(Registries.ITEM_GROUP,
			new Identifier(LordOfTheRingsMiddleEarthMod.MOD_ID, "test_group"),
			FabricItemGroup.builder().displayName(Text.translatable("test_group"))
					.icon(() -> new ItemStack(ModBlocks.CHALK)).entries((displayContext, entries) -> {
						entries.add(new ItemStack(ModBlocks.CHALK));
						entries.add(new ItemStack(ModBlocks.CHALK_BRICKS));
						entries.add(new ItemStack(ModBlocks.GOLD_ORNAMENTED_CHALK_BRICKS));
						entries.add(new ItemStack(ModBlocks.OVERGROWN_CHALK_BRICKS));
						entries.add(new ItemStack(ModBlocks.GOLD_ORNAMENTED_OVERGROWN_CHALK_BRICKS));
						entries.add(new ItemStack(ModBlocks.TEST_OVERGROWN));
						entries.add(new ItemStack(ModBlocks.TEST_OVERGROWN_ORNAMENTED));
					}).build());

	/**
	 * Helper Method to register the ItemGroups (Just prints out the line)
	 */
	public static void registerItemGroups() {
		LordOfTheRingsMiddleEarthMod.LOGGER.info("Registering Item Groups for " + LordOfTheRingsMiddleEarthMod.MOD_ID);
	}
}

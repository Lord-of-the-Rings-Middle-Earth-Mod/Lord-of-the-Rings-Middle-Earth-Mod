/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext;

import com.anedhel.vext.block.ModBlocks;
import com.anedhel.vext.block.woodtypes.ModWoodSet;
import com.anedhel.vext.block.woodtypes.ModWoodTypes;
import com.anedhel.vext.entity.ModEntities;
import com.anedhel.vext.entity.custom.HobbitEntity;
import com.anedhel.vext.item.ModItemGroups;
import com.anedhel.vext.item.ModItems;
import com.anedhel.vext.recipe.ModRecipes;
import com.anedhel.vext.screen.ModScreenHandlers;
import com.anedhel.vext.world.dimension.ModDimensions;
import com.anedhel.vext.world.gen.ModEntitySpawns;
import com.anedhel.vext.world.gen.ModWorldGenerator;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.ComposterBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main mod initialization class for the Vanilla Extensions Mod.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class VExtMod implements ModInitializer {

	public static final String MOD_ID = "vext";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	/**
	 * Called when the mod is initialized.
	 */
	@Override
	public void onInitialize() {
		LOGGER.info("Initializing " + MOD_ID + " mod.");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		ModScreenHandlers.registerScreenHandlers();
		ModRecipes.registerRecipes();

		ModEntities.registerModEntities();
		ModEntitySpawns.addSpawns();

		ModWorldGenerator.generateModWorldGen();
		ModDimensions.register();

		addCompostableItems();
		addDefaultAttributes();
		addFuelItems();
		addStrippableBlocks();
	}

	/**
	 * Registers mod items as compostable with their respective composting chances.
	 */
	private void addCompostableItems() {
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_TOMATO, 0.45f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModBlocks.WILD_CORN, 0.45f);

		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO_SEEDS, 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.TOMATO, 0.65f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORN_SEEDS, 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CORN, 0.65f);

		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.WARPED_BARK, 0.5f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CRIMSON_BARK, 0.5f);

		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.OAK_BARK, 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.BIRCH_BARK, 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.SPRUCE_BARK, 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.JUNGLE_BARK, 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.ACACIA_BARK, 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.DARK_OAK_BARK, 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.PALE_OAK_BARK, 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.MANGROVE_BARK, 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.BAMBOO_BARK, 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(ModItems.CHERRY_BARK, 0.3f);

		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();
			ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(woodSet.getBark(), 0.3f);
		}
	}

	/**
	 * Registers mod items as fuel with their respective burn times.
	 */
	private void addFuelItems() {
		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();
			FuelRegistryEvents.BUILD.register((builder, context) -> {
				switch(woodType) {
					case PINE:
						builder.add(woodSet.getBark(), 150);
						break;
				}
			});
		}
		FuelRegistryEvents.BUILD.register((builder, context) ->{
			builder.add(ModItems.OAK_BARK, 180);
			builder.add(ModItems.BIRCH_BARK, 120);
			builder.add(ModItems.SPRUCE_BARK, 140);
			builder.add(ModItems.JUNGLE_BARK, 150);
			builder.add(ModItems.CHERRY_BARK, 160);
			builder.add(ModItems.ACACIA_BARK, 170);
			builder.add(ModItems.PALE_OAK_BARK, 190);
			builder.add(ModItems.DARK_OAK_BARK, 200);
			builder.add(ModItems.MANGROVE_BARK, 110);
			builder.add(ModItems.BAMBOO_BARK, 80);
		});
	}

	/**
	 * Registers all custom mod wood blocks and their stripped variants with the
	 * {@link StrippableBlockRegistry}.
	 */
	private void addStrippableBlocks() {
		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();
			StrippableBlockRegistry.register(woodSet.getLog(), woodSet.getStrippedLog());
			StrippableBlockRegistry.register(woodSet.getWoodVariant("base"), woodSet.getStrippedWoodVariant("base"));
			woodSet.getWoodFamily().getVariants().forEach((variant, block) -> {
				StrippableBlockRegistry.register(block, woodSet.getStrippedWoodVariant(variant.getName()));
			});
		}
	}

	/**
	 * Registers default attributes for custom entities added by the mod.
	 */
	private void addDefaultAttributes() {
		FabricDefaultAttributeRegistry.register(ModEntities.HOBBIT, HobbitEntity.createHobbitAttributes());
	}
}
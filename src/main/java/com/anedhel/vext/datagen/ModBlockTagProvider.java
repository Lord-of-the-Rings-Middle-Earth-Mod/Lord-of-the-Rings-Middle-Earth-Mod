/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.datagen;

import com.anedhel.vext.block.ModBlockTags;
import com.anedhel.vext.block.ModBlocks;
import com.anedhel.vext.block.stonetypes.ModStoneSet;
import com.anedhel.vext.block.stonetypes.ModStoneSubSet;
import com.anedhel.vext.block.stonetypes.ModStoneTypes;
import com.anedhel.vext.block.woodtypes.ModWoodSet;
import com.anedhel.vext.block.woodtypes.ModWoodTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.tag.ProvidedTagBuilder;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

/**
 * Data generator for block tags.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

	public ModBlockTagProvider(FabricDataOutput output,
			CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, registriesFuture);
	}

	/**
	 * Configure block tags by adding mod blocks to the appropriate tags.
	 * @param wrapperLookup the {@link RegistryWrapper.WrapperLookup}
	 */
	@Override
	protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
		configureModWoodTypes();
		configureModStoneTypes();

		valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
				.add(ModBlocks.TIN_ORE)
				.add(ModBlocks.DEEPSLATE_TIN_ORE)
				.add(ModBlocks.RAW_TIN_BLOCK)
				.add(ModBlocks.TIN_BLOCK)
				.add(ModBlocks.SILVER_ORE)
				.add(ModBlocks.DEEPSLATE_SILVER_ORE)
				.add(ModBlocks.RAW_SILVER_BLOCK)
				.add(ModBlocks.SILVER_BLOCK);

		valueLookupBuilder(BlockTags.STONE_ORE_REPLACEABLES)
				.add(ModBlocks.TIN_ORE)
				.add(ModBlocks.SILVER_ORE);
		valueLookupBuilder(ConventionalBlockTags.ORES_IN_GROUND_STONE)
				.add(ModBlocks.TIN_ORE)
				.add(ModBlocks.SILVER_ORE);

		valueLookupBuilder(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
				.add(ModBlocks.DEEPSLATE_TIN_ORE)
				.add(ModBlocks.DEEPSLATE_SILVER_ORE);
		valueLookupBuilder(ConventionalBlockTags.ORES_IN_GROUND_DEEPSLATE)
				.add(ModBlocks.DEEPSLATE_TIN_ORE)
				.add(ModBlocks.DEEPSLATE_SILVER_ORE);

		valueLookupBuilder(ConventionalBlockTags.ORES)
				.add(ModBlocks.TIN_ORE)
				.add(ModBlocks.DEEPSLATE_TIN_ORE)
				.add(ModBlocks.SILVER_ORE)
				.add(ModBlocks.DEEPSLATE_SILVER_ORE);

		valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)
				.add(ModBlocks.TIN_ORE)
				.add(ModBlocks.DEEPSLATE_TIN_ORE)
				.add(ModBlocks.RAW_TIN_BLOCK)
				.add(ModBlocks.TIN_BLOCK);

		valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
				.add(ModBlocks.SILVER_ORE)
				.add(ModBlocks.DEEPSLATE_SILVER_ORE)
				.add(ModBlocks.RAW_SILVER_BLOCK)
				.add(ModBlocks.SILVER_BLOCK);
	}

	/**
	 * Configure tags for all wood types.
	 */
	private void configureModWoodTypes() {
		for(ModWoodTypes woodType : ModWoodTypes.values()) {
			ModWoodSet woodSet = woodType.getModWoodSet();

			configureWoodFamilyTags(woodSet.getWoodFamily());
			configureWoodFamilyTags(woodSet.getStrippedWoodFamily());
			configureWoodFamilyTags(woodSet.getPlanksFamily());

			valueLookupBuilder(woodSet.getLogBlockTag())
					.add(woodSet.getLog())
					.add(woodSet.getWoodVariant("base"))
					.add(woodSet.getStrippedLog())
					.add(woodSet.getStrippedWoodVariant("base"));

			valueLookupBuilder(BlockTags.LOGS_THAT_BURN)
					.add(woodSet.getLog())
					.add(woodSet.getStrippedLog())
					.add(woodSet.getWoodVariant("base"))
					.add(woodSet.getStrippedWoodVariant("base"));

			valueLookupBuilder(BlockTags.AXE_MINEABLE)
					.add(woodSet.getLog())
					.add(woodSet.getStrippedLog());

			valueLookupBuilder(BlockTags.LEAVES)
					.add(woodSet.getLeaves());
		}
	}

	/**
	 * Configure tags for all stone types.
	 */
	private void configureModStoneTypes() {
		for(ModStoneTypes stoneType : ModStoneTypes.values()) {
			ModStoneSet stoneSet = stoneType.getModStoneSet();
			for(ModStoneSubSet subSet : stoneSet.getAllStoneSubSets()) {
				configureStoneSubSetTags(subSet);
			}
			for(BlockFamily family : stoneSet.getAllBlockFamilies()) {
				configureStoneFamilyTags(family);
			}
			stoneSet.getPillarSet().getAllBlockFamilies().forEach(blockFamily -> valueLookupBuilder(ModBlockTags.PILLARS)
					.add(blockFamily.getBaseBlock()));
			stoneSet.getFriezeSet().getAllBlockFamilies().forEach(blockFamily -> valueLookupBuilder(ModBlockTags.FRIEZES)
					.add(blockFamily.getBaseBlock()));
		}
	}

	/**
	 * Configure tags for a wood block family.
	 * @param family the {@link BlockFamily} to configure tags for
	 */
	private void configureWoodFamilyTags(BlockFamily family) {
		ProvidedTagBuilder<Block, Block> axeMinableBuilder = valueLookupBuilder(BlockTags.AXE_MINEABLE)
				.add(family.getBaseBlock());
		family.getVariants().values().forEach(axeMinableBuilder::add);

		valueLookupBuilder(BlockTags.WOODEN_FENCES)
				.add(family.getVariant(BlockFamily.Variant.FENCE));

		valueLookupBuilder(BlockTags.FENCE_GATES)
				.add(family.getVariant(BlockFamily.Variant.FENCE_GATE));
	}

	/**
	 * Configure tags for all block families in a stone sub set.
	 * @param subSet the {@link ModStoneSubSet} to configure tags for
	 */
	private void configureStoneSubSetTags(ModStoneSubSet subSet) {
		subSet.getAllBlockFamilies().forEach(this::configureStoneFamilyTags);
	}

	/**
	 * Configure tags for a stone block family.
	 * @param family the {@link BlockFamily} to configure tags for
	 */
	private void configureStoneFamilyTags(BlockFamily family) {
		ProvidedTagBuilder<Block, Block> pickaxeMineableBuilder = valueLookupBuilder(BlockTags.PICKAXE_MINEABLE);
		family.getVariants().values().forEach(pickaxeMineableBuilder::add);

		if(family.getVariant(BlockFamily.Variant.WALL) != null) {
			valueLookupBuilder(BlockTags.WALLS)
					.add(family.getVariant(BlockFamily.Variant.WALL));
		}
	}
}

/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.world.biome;

import com.anedhel.vext.block.stonetypes.BlueslateBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

/**
 * This class defines the material rules in the Lord of the Rings mod.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModMaterialRules {

	/**
	 * Creates the material rules for the Shire biome, which includes grass, moss, dirt, rooted dirt, stone, andesite,
	 * granite, diorite, gravel, blueslate, deepslate, tuff, and bedrock. The rules are based on noise thresholds and
	 * depth conditions to create a natural variation in the terrain.
	 *
	 * @return A MaterialRule that defines the block placement for the Shire biome.
	 */
	public static MaterialRules.MaterialRule makeShireRules() {
		MaterialRules.MaterialCondition isShire = MaterialRules.biome(ModBiomes.SHIRE);

		MaterialRules.MaterialRule grass = MaterialRules.block(Blocks.GRASS_BLOCK.getDefaultState());
		MaterialRules.MaterialRule moss = MaterialRules.block(Blocks.MOSS_BLOCK.getDefaultState());

		MaterialRules.MaterialRule dirt = MaterialRules.block(Blocks.DIRT.getDefaultState());
		MaterialRules.MaterialRule rootedDirt = MaterialRules.block(Blocks.ROOTED_DIRT.getDefaultState());

		MaterialRules.MaterialRule stone = MaterialRules.block(Blocks.STONE.getDefaultState());
		MaterialRules.MaterialRule andesite = MaterialRules.block(Blocks.ANDESITE.getDefaultState());
		MaterialRules.MaterialRule granite = MaterialRules.block(Blocks.GRANITE.getDefaultState());
		MaterialRules.MaterialRule diorite = MaterialRules.block(Blocks.DIORITE.getDefaultState());
		MaterialRules.MaterialRule gravel = MaterialRules.block(Blocks.GRAVEL.getDefaultState());
		MaterialRules.MaterialRule blueslate = MaterialRules.block(BlueslateBlocks.BLUESLATE.getDefaultState());

		MaterialRules.MaterialRule deepslate = MaterialRules.block(Blocks.DEEPSLATE.getDefaultState());
		MaterialRules.MaterialRule tuff = MaterialRules.block(Blocks.TUFF.getDefaultState());
		MaterialRules.MaterialRule deepBlueslate = MaterialRules.block(BlueslateBlocks.BLUESLATE.getDefaultState());

		MaterialRules.MaterialRule surfaceLayer = MaterialRules.condition(
				MaterialRules.STONE_DEPTH_FLOOR,
				MaterialRules.sequence(
						MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, 0.4, 0.5),
								moss), grass));

		MaterialRules.MaterialRule dirtLayer = MaterialRules.condition(
				MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH,
				MaterialRules.sequence(
						MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, 0.45, 0.55),
								rootedDirt), dirt));

		MaterialRules.MaterialRule stoneLayer = MaterialRules.condition(
				MaterialRules.aboveY(YOffset.fixed(0), 0),
				MaterialRules.sequence(
						MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.GRAVEL, -1.0, -0.7),
								andesite),
						MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.GRAVEL, -0.5, -0.3),
								granite),
						MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.GRAVEL, 0.6, 0.9),
								gravel),
						MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, -0.12, 0.12),
								blueslate),
						MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.GRAVEL, 0.2, 0.5),
								diorite), stone));

		MaterialRules.MaterialRule deepslateLayer = MaterialRules.condition(
				MaterialRules.not(MaterialRules.aboveY(YOffset.fixed(0), 0)),
				MaterialRules.sequence(
						MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.GRAVEL, -0.12, 0.12),
								deepBlueslate),
						MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.GRAVEL, 0.3, 0.5),
								tuff), deepslate));

		MaterialRules.MaterialRule bedrockLayer = MaterialRules.condition(
				MaterialRules.verticalGradient("bedrock_floor", YOffset.getBottom(), YOffset.aboveBottom(5)),
				MaterialRules.block(Blocks.BEDROCK.getDefaultState()));

		MaterialRules.MaterialRule shireRule = MaterialRules.sequence(
				surfaceLayer,
				dirtLayer,
				stoneLayer,
				deepslateLayer,
				bedrockLayer
		);

		return MaterialRules.condition(isShire, shireRule);
	}
}

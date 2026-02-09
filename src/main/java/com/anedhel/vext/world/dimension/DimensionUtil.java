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

package com.anedhel.vext.world.dimension;

import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.gen.densityfunction.DensityFunction;
import net.minecraft.world.gen.densityfunction.DensityFunctionTypes;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
import net.minecraft.world.gen.noise.NoiseRouter;

/**
 * Utility class for creating NoiseRouters for custom dimensions.
 * Uses only public Minecraft APIs.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class DimensionUtil {

	/**
	 * Creates a NoiseRouter similar to the vanilla Overworld.
	 * This method uses only publicly accessible APIs and can
	 * be used for custom dimensions.
	 *
	 * @param densityFunctionLookup Lookup for DensityFunctions from the registry
	 * @param noiseParametersLookup Lookup for NoiseParameters from the registry
	 * @param largeBiomes Whether large biomes should be used
	 * @param amplified Whether amplified terrain should be generated
	 * @return A NoiseRouter for terrain generation
	 */
	public static NoiseRouter createSurfaceNoiseRouter(
			RegistryEntryLookup<DensityFunction> densityFunctionLookup,
			RegistryEntryLookup<DoublePerlinNoiseSampler.NoiseParameters> noiseParametersLookup,
			boolean largeBiomes,
			boolean amplified
	) {
		DensityFunction zero = DensityFunctionTypes.constant(0);

		DensityFunction barrierNoise = DensityFunctionTypes.noise(
				noiseParametersLookup.getOrThrow(NoiseParametersKeys.AQUIFER_BARRIER), 0.5
		);
		DensityFunction fluidLevelFloodedness = DensityFunctionTypes.noise(
				noiseParametersLookup.getOrThrow(NoiseParametersKeys.AQUIFER_FLUID_LEVEL_FLOODEDNESS), 0.67
		);
		DensityFunction fluidLevelSpread = DensityFunctionTypes.noise(
				noiseParametersLookup.getOrThrow(NoiseParametersKeys.AQUIFER_FLUID_LEVEL_SPREAD), 0.7142857142857143
		);
		DensityFunction lavaNoise = DensityFunctionTypes.noise(
				noiseParametersLookup.getOrThrow(NoiseParametersKeys.AQUIFER_LAVA)
		);

		RegistryEntry<DoublePerlinNoiseSampler.NoiseParameters> shiftNoiseParams =
				noiseParametersLookup.getOrThrow(NoiseParametersKeys.OFFSET);
		DensityFunction shiftX = DensityFunctionTypes.noise(shiftNoiseParams, 0.25, 0.0);
		DensityFunction shiftZ = DensityFunctionTypes.noise(shiftNoiseParams, 0.0, 0.25);

		DensityFunction temperature = DensityFunctionTypes.shiftedNoise(
				shiftX,
				shiftZ,
				0.25,
				noiseParametersLookup.getOrThrow(largeBiomes ? NoiseParametersKeys.TEMPERATURE_LARGE : NoiseParametersKeys.TEMPERATURE)
		);
		DensityFunction vegetation = DensityFunctionTypes.shiftedNoise(
				shiftX,
				shiftZ,
				0.25,
				noiseParametersLookup.getOrThrow(largeBiomes ? NoiseParametersKeys.VEGETATION_LARGE : NoiseParametersKeys.VEGETATION)
		);

		DensityFunction continents = DensityFunctionTypes.flatCache(
				DensityFunctionTypes.shiftedNoise(
						shiftX,
						shiftZ,
						0.25,
						noiseParametersLookup.getOrThrow(NoiseParametersKeys.CONTINENTALNESS)
				)
		);

		DensityFunction erosion = DensityFunctionTypes.flatCache(
				DensityFunctionTypes.shiftedNoise(
						shiftX,
						shiftZ,
						0.25,
						noiseParametersLookup.getOrThrow(NoiseParametersKeys.EROSION)
				)
		);

		DensityFunction ridges = DensityFunctionTypes.flatCache(
				DensityFunctionTypes.shiftedNoise(
						shiftX,
						shiftZ,
						0.25,
						noiseParametersLookup.getOrThrow(NoiseParametersKeys.RIDGE)
				)
		);

		DensityFunction yClampedGradient = DensityFunctionTypes.yClampedGradient(-64, 384, 1.5, -1.5);

		DensityFunction offset = DensityFunctionTypes.add(
				DensityFunctionTypes.constant(-0.50375),
				yClampedGradient
		);

		DensityFunction continentFactor = DensityFunctionTypes.mul(continents, DensityFunctionTypes.constant(0.4));
		DensityFunction erosionFactor = DensityFunctionTypes.mul(erosion, DensityFunctionTypes.constant(0.2));
		DensityFunction ridgeFactor = DensityFunctionTypes.mul(ridges, DensityFunctionTypes.constant(0.15));

		DensityFunction baseDensity = DensityFunctionTypes.add(
				offset,
				DensityFunctionTypes.add(continentFactor, DensityFunctionTypes.add(erosionFactor, ridgeFactor))
		);

		DensityFunction finalDensity = amplified
				? DensityFunctionTypes.interpolated(baseDensity)
				: DensityFunctionTypes.interpolated(baseDensity);

		DensityFunction y = DensityFunctionTypes.yClampedGradient(-64, 64, 0.0, 1.0);

		DensityFunction oreVeininessNoise = DensityFunctionTypes.noise(
				noiseParametersLookup.getOrThrow(NoiseParametersKeys.ORE_VEININESS), 1.5, 1.5
		);
		DensityFunction oreVeininess = DensityFunctionTypes.interpolated(
				DensityFunctionTypes.rangeChoice(
						y,
						-60.0, 51.0,
						oreVeininessNoise,
						DensityFunctionTypes.constant(0)
				)
		);

		DensityFunction oreVeinA = DensityFunctionTypes.noise(
				noiseParametersLookup.getOrThrow(NoiseParametersKeys.ORE_VEIN_A), 4.0, 4.0
		).abs();
		DensityFunction oreVeinB = DensityFunctionTypes.noise(
				noiseParametersLookup.getOrThrow(NoiseParametersKeys.ORE_VEIN_B), 4.0, 4.0
		).abs();

		DensityFunction oreVeinRidged = DensityFunctionTypes.add(
				DensityFunctionTypes.constant(-0.08),
				DensityFunctionTypes.max(oreVeinA, oreVeinB)
		);

		DensityFunction oreGap = DensityFunctionTypes.noise(
				noiseParametersLookup.getOrThrow(NoiseParametersKeys.ORE_GAP)
		);

		return new NoiseRouter(
				barrierNoise,
				fluidLevelFloodedness,
				fluidLevelSpread,
				lavaNoise,
				temperature,
				vegetation,
				continents,
				erosion,
				zero,
				ridges,
				baseDensity,
				finalDensity,
				oreVeininess,
				oreVeinRidged,
				oreGap
		);
	}
}

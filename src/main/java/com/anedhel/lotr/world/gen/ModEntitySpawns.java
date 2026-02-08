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

package com.anedhel.lotr.world.gen;

import com.anedhel.lotr.entity.ModEntities;
import com.anedhel.lotr.world.biome.ModBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnLocationTypes;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.Heightmap;

/**
 * Handles the registration of entity spawns in the world.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModEntitySpawns {

	/**
	 * Adds entity spawns to the world.
	 */
	public static void addSpawns() {
		BiomeModifications.addSpawn(BiomeSelectors.includeByKey(ModBiomes.SHIRE), SpawnGroup.CREATURE,
				ModEntities.HOBBIT, 20, 2, 4);

		SpawnRestriction.register(ModEntities.HOBBIT, SpawnLocationTypes.ON_GROUND,
				Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, PathAwareEntity::canMobSpawn);
	}
}

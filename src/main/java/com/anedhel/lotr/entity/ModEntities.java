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

package com.anedhel.lotr.entity;

import com.anedhel.lotr.LotRMEMod;
import com.anedhel.lotr.entity.custom.HobbitEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

/**
 * This class is responsible for registering all custom entities for the mod.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModEntities {

	private static final RegistryKey<EntityType<?>> HOBBIT_KEY =
			RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(LotRMEMod.MOD_ID, "hobbit"));

	public static final EntityType<HobbitEntity> HOBBIT = Registry.register(Registries.ENTITY_TYPE,
			Identifier.of(LotRMEMod.MOD_ID, "hobbit"),
			EntityType.Builder.create(HobbitEntity::new, SpawnGroup.CREATURE)
					.dimensions(1f, 2.5f).build(HOBBIT_KEY));

	/**
	 * Registers all mod entities. This method should be called during the mod initialization phase.
	 */
	public static void registerModEntities() {
		LotRMEMod.LOGGER.info("Registering Mod Entities for " + LotRMEMod.MOD_ID);
	}
}

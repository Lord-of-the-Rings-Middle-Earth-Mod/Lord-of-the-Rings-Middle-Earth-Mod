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

/**
 * Handles the overall world generation for the mod.
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class ModWorldGenerator {

	/**
	 * Generates all mod world generation features.
	 */
	public static void generateModWorldGen() {
		ModOreGeneration.oreGeneration();

		ModTreeGeneration.generateTrees();
	}
}

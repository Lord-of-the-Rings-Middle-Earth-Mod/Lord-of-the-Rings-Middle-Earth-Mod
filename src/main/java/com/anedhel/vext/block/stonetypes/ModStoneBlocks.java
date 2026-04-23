/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.vext.block.stonetypes;

import com.anedhel.vext.VExtMod;
import com.anedhel.vext.block.stonetypes.factories.StoneSetFactory;
import com.anedhel.vext.block.stonetypes.factories.StoneSetSettings;

/**
 * Defines and registers all mod stone blocks and their variants.
 * <p>
 * This class creates a comprehensive set of chalk blocks including base stone,
 * cobbled, smooth, and cracked variants, each with normal, mossy, and overgrown states.
 * It also includes specialized subsets for polished stone, pillars, friezes, and various
 * brick styles, all with optional metal ornamentations (bronze, silver, gold).
 *
 * @author Moritz Rohleder
 * @see ModStoneSet
 * @see ModStoneTypes
 * @since 0.1.0
 */
public class ModStoneBlocks {

	public static ModStoneSet CHALK_SET = StoneSetFactory.createStoneSet("chalk",
			new StoneSetSettings(2.0f, 6.0f));
	public static ModStoneSet BLUESLATE_SET = StoneSetFactory.createStoneSet("blueslate",
			new StoneSetSettings(2.0f, 6.0f));

	public static void registerModStoneBlocks() {
		VExtMod.LOGGER.info("Registering Mod Stone Blocks for " + VExtMod.MOD_ID);
	}
}
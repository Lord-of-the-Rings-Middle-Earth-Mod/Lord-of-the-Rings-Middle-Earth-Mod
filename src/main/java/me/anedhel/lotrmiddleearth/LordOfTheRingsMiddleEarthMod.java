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

package me.anedhel.lotrmiddleearth;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LordOfTheRingsMiddleEarthMod implements ModInitializer {

	public static final String MOD_ID = "lotr";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final String COPYRIGHT =
			"LotR ME Mod Copyright (C) 2024\n" + "    Authors are found in the CONTRIBUTORS-File.\n"
			+ "    This program comes with ABSOLUTELY NO WARRANTY.\n"
			+ "    This is free software under the GNU General public License."
			+ "    You are welcome to redistribute it\n"
			+ "    under certain conditions, described in the LICENSE-File.";

	@Override
	public void onInitialize() {
		LOGGER.info("The Lord of the Rings Mod starts to initialise.");
		LOGGER.info(COPYRIGHT); //Logging the Copyright notice as defined in the GNU General Public License

		LOGGER.info("The Lord of the Rings Mod is loaded.");
	}
}
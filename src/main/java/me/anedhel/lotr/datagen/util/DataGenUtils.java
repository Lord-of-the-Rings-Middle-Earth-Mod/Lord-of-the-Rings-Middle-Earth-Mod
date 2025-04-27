/*
 * Copyright (c)
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
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package me.anedhel.lotr.datagen.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class for data generation.
 */
public class DataGenUtils {

	private final static Pattern FIRST_LETTER_PATTERN = Pattern.compile("\\b[a-z]");

	/**
	 * Converts a translation key to a name by capitalizing the first letter of each word.
	 *
	 * @param translationKey The translation key to convert.
	 * @return The converted name.
	 */
	public static String capitaliseWords(String translationKey) {
		Matcher matcher = FIRST_LETTER_PATTERN.matcher(translationKey);
		StringBuilder result = new StringBuilder();

		while(matcher.find()) {
			matcher.appendReplacement(result, matcher.group().toUpperCase());
		}
		matcher.appendTail(result);

		return result.toString();
	}
}

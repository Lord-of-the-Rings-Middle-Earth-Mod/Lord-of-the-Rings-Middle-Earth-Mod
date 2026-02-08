/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.datagen.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class for data generation operations.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public class DataGenUtils {

	private final static Pattern FIRST_LETTER_PATTERN = Pattern.compile("\\b[a-z]");

	/**
	 * Extracts the name portion from a translation key.
	 *
	 * @param translationKey the translation key to extract from
	 * @return the name portion after "lotr."
	 */
	public static String extractNameFromTranslationKey(String translationKey){
		return translationKey.substring(translationKey.indexOf("lotr.") + 5);
	}

	/**
	 * Capitalizes the first letter of each word in a string.
	 *
	 * @param translationKey the string to capitalize
	 * @return the string with capitalized words
	 */
	public static String capitalizeWords(String translationKey){
		Matcher matcher = FIRST_LETTER_PATTERN.matcher(translationKey);
		StringBuilder result = new StringBuilder();

		while(matcher.find()){
			matcher.appendReplacement(result,
					matcher.group().toUpperCase());
		}
		matcher.appendTail(result);
		return result.toString();
	}
}

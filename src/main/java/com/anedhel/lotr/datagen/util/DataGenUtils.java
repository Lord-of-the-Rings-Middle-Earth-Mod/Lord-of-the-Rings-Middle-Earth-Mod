package com.anedhel.lotr.datagen.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataGenUtils {

	private final static Pattern FIRST_LETTER_PATTERN = Pattern.compile("\\b[a-z]");

	public static String extractNameFromTranslationKey(String translationKey){
		return translationKey.substring(translationKey.indexOf("lotr.") + 5);
	}

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

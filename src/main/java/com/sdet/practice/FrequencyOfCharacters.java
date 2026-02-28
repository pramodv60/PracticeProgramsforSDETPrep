package com.sdet.practice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

	public static void main(String[] args) {

		String input = "DISCOMBOMBULATED";

		Map<Character, Integer> result = countFrequency(input);

		if(!(result.isEmpty())) {
			for (char eachCharacter : result.keySet()) {
				System.out
						.println("Character: " + eachCharacter + " is repeated: " + result.get(eachCharacter) + " times.");
			}
		}
	}

	public static Map<Character, Integer> countFrequency(String input) {

		char[] characterArray = null;
		HashMap<Character, Integer> resultMap = null;
		int counter = 0;

		if (!input.isEmpty()) {
			
			characterArray = input.toCharArray();
			resultMap = new HashMap<Character, Integer>();

			for (char eachCharacter : characterArray) {

				if (!(resultMap.containsKey(eachCharacter))) {
					resultMap.put(eachCharacter, ++counter);
					counter = 0;
				}

				else {
					counter = resultMap.get(eachCharacter);
					resultMap.put(eachCharacter, ++counter);
					counter = 0;
				}
			}
		}

		return resultMap;
	}
}
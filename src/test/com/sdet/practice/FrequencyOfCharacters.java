package com.sdet.practice;

import java.util.HashMap;

public class FrequencyOfCharacters {

	public static void main(String[] args) {

		String input = "DISCOMBOMBULATED";

		HashMap<Character, Integer> result = countFrequency(input);

		for (char eachCharacter : result.keySet()) {
			System.out
					.println("Character: " + eachCharacter + " is repeated: " + result.get(eachCharacter) + " times.");
		}
	}

	public static HashMap<Character, Integer> countFrequency(String input) {

		char[] characterArray = input.toCharArray();
		HashMap<Character, Integer> resultMap = new HashMap<Character, Integer>();
		int counter = 0;

		if (input.length() > 0) {

			for (char eachCharacter : characterArray) {

				if (!(resultMap.containsKey(eachCharacter))) {
					++counter;
					resultMap.put(eachCharacter, counter);
					counter = 0;
				}

				else {
					counter = (int) resultMap.get(eachCharacter);
					++counter;
					resultMap.put(eachCharacter, counter);
					counter = 0;
				}
			}
		}

		return resultMap;
	}

}

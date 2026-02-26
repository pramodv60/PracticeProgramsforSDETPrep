package com.sdet.practice;

import java.util.HashMap;
import java.util.Map;

public class SpecialCharacterFrequency {

	public static void main(String[] args) {

		String input = "!@234!3445!@@@asdasdasdasdfaljfslej2394823904)((&*^";
		Map<Character, Integer> characterMap = countSpecialCharacter(input);
		
		if(characterMap != null && !(characterMap.isEmpty())) {
			
			for (char eachCharacter : characterMap.keySet()) {
				System.out
				.println("Character: " + eachCharacter + " is repeated: " + characterMap.get(eachCharacter) + " times.");
			}
		}
	}

	public static Map<Character, Integer> countSpecialCharacter(String input) {
		
		Map<Character,Integer> characterCountMap = null;
		char[] characterArray = null;
		int counter = 0;
		
		if(!input.isEmpty()) {
			
			characterArray = input.trim().toCharArray();
			characterCountMap = new HashMap<Character, Integer>();
			
			for(char eachCharacter: characterArray) {
				
				if(!(Character.isAlphabetic(eachCharacter) || Character.isDigit(eachCharacter))) {
					
					if((characterCountMap.containsKey(eachCharacter))) {
						characterCountMap.put(eachCharacter, (characterCountMap.getOrDefault(eachCharacter, 0)) + 1);
					}
					else {
						characterCountMap.put(eachCharacter, ++counter);
						counter = 0;
					}
				}
			}
		}
		return characterCountMap;
	}
}
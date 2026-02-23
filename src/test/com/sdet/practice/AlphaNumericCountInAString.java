package com.sdet.practice;

import java.util.HashMap;

public class AlphaNumericCountInAString {

	public static void main(String[] args) {

		String input = "a1b2c3d4";
		System.out.println("Different characters in String: " + input);
		
		HashMap<String, Integer> alphaNumericCount = getAlphaNumericCount(input);
		
		for(String eachKey: alphaNumericCount.keySet()) {
			System.out.println( eachKey + " are repeated: " + alphaNumericCount.get(eachKey) + " times.");
		}
	}
	
	public static HashMap<String, Integer> getAlphaNumericCount(String input){
		
		HashMap<String, Integer> countMap = new HashMap<String, Integer>();
		
		if(input.length() > 0) {
			
			char[] inputCharArray = input.toLowerCase().trim().toCharArray();
			int digitsCounter = 0;
			int alpahabetsCounter = 0;
			
			for(char eachCharacter: inputCharArray) {
				
				if(Character.isDigit(eachCharacter)) {
					countMap.put("Digits", ++digitsCounter);
				}
				else if(Character.isAlphabetic(eachCharacter)){
					countMap.put("Alphabets", ++alpahabetsCounter);
				}			
			}
		}
		
		return countMap;
	}
}
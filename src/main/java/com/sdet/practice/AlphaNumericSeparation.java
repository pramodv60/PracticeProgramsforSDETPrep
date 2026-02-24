package com.sdet.practice;

import java.util.HashMap;

public class AlphaNumericSeparation {

	public static void main(String[] args) {

		String input = "a1b2c3d4";
		System.out.println("Character separation in String: " + input + "\n");
		
		HashMap<String, StringBuilder> alphaNumericSegregationMap = alphaNumericSegregation(input);
		
		for(String eachKey: alphaNumericSegregationMap.keySet()) {
			System.out.println("Separated Strings: " + alphaNumericSegregationMap.get(eachKey) + "\n");
		}
	}
	
	public static HashMap<String, StringBuilder> alphaNumericSegregation(String input){
		
		HashMap<String, StringBuilder> segregationMap = new HashMap<String, StringBuilder>();
		StringBuilder alphabets = new StringBuilder() ;
		StringBuilder digits = new StringBuilder();
		
		if(input.length() > 0) {
			
			char[] inputCharArray = input.toLowerCase().trim().toCharArray();
			
			for(char eachCharacter: inputCharArray) {
				
				if(Character.isDigit(eachCharacter)) {
					segregationMap.put("Digits", alphabets.append(eachCharacter));
				}
				else if(Character.isAlphabetic(eachCharacter)){
					segregationMap.put("Alphabets", digits.append(eachCharacter));
				}			
			}
		}
	
		return segregationMap;
	}
}
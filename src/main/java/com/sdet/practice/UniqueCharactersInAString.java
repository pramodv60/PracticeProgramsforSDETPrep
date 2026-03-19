package com.sdet.practice;

import java.util.LinkedHashSet;

public class UniqueCharactersInAString {

	public static void main(String[] args) {
		
		String input = "aaabababalksadkljasdasdjlikljda";
		System.out.println("Unique characters: ");
		
		for (Character ch : storeUniqueValues(input)) {
	        System.out.print(ch + " ");
	    }
	}
	
	public static LinkedHashSet<Character> storeUniqueValues(String input){
		
		LinkedHashSet<Character> uniqueValueSet = null;
		
		if(!input.isEmpty()) {
			
			uniqueValueSet = new LinkedHashSet<Character>();
			
			char[] characterArray = input.toCharArray();
			
			for(char eachCharacter: characterArray) {
				uniqueValueSet.add(eachCharacter);
			}
		}
		
		return uniqueValueSet;
	}
}
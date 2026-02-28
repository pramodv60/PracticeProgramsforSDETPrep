package com.sdet.practice;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {

		String romanNumberInput = "CCCXLIII";
		System.out.println("Roman number to Integer: " + romanToInteger(romanNumberInput));
	}
	
	public static int romanToInteger(String romanNumber) {
		
		Map<Character,Integer> romanNumeralsMap = new HashMap<Character, Integer>();
		int result = 0;
		
		if(!romanNumber.isEmpty()) {
			
			romanNumeralsMap.put('I', 1);
			romanNumeralsMap.put('V', 5);
			romanNumeralsMap.put('X', 10);
			romanNumeralsMap.put('L', 50);
			romanNumeralsMap.put('C', 100);
			romanNumeralsMap.put('D', 500);
			romanNumeralsMap.put('M', 1000);
			
			int currentValue = 0;
			int previousValue = 0;
			char currentCharacter;
			
			for(int index = romanNumber.length() - 1; index >= 0; index--) {
				
				currentCharacter = romanNumber.charAt(index);
				currentValue = romanNumeralsMap.get(currentCharacter); 
				
				if(currentValue >= previousValue) {
					result = result + currentValue;
				}
				else {
					result = result - currentValue;
				}
				
				previousValue = currentValue;
			}
		}
		return result;
	}
}
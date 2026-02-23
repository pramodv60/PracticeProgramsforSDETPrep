package com.sdet.practice;

public class ReplaceVowelsWithStrings {

	public static void main(String[] args) {

		String input = "DEEKSHA";
		System.out.println("Replacing vowels by" + " 'X' in the input: " + replaceVowelsByX(input));
	}
	
	public static String replaceVowelsByX(String input) {

		String vowels = "aeiouAEIOU";
		char[] characterArray = null;
		
		if(input.length() > 0 ) {
			
			characterArray = input.toCharArray();
			
			for(int index = 0; index < characterArray.length; index++){
				if(! (vowels.indexOf(characterArray[index]) == -1) ) {
					characterArray[index] = 'X';
				}
			}		
		}
		return new String(characterArray);
	}
}
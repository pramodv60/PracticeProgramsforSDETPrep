package com.sdet.practice;

public class ReverseCharactersOnly {

	public static void main(String[] args) {
		
		
		String input = "1ab2";
		
		System.out.println("Character only reversed string: " + characterOnlyReversed(input));

	}
	
	public static String characterOnlyReversed(String input) {

		char[] characterArray = input.toCharArray();

		if(input.length() > 0) {
			
			int rightPointer = characterArray.length - 1;
			int leftPointer = 0;
			char temp;
			
			while(leftPointer < rightPointer) {
				
				if(! (Character.isLetter(characterArray[leftPointer]))) {
					leftPointer++;
				}
				else if(! (Character.isLetter(characterArray[rightPointer]))) {
					rightPointer--;
				}
				else {
					temp = characterArray[rightPointer];
					characterArray[rightPointer] = characterArray[leftPointer];
					characterArray[leftPointer] = temp;
					leftPointer++;
					rightPointer--;
				}
			}
		}
		
		return new String(characterArray);
	}

}

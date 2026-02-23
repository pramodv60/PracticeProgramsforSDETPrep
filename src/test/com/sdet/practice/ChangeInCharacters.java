package com.sdet.practice;

public class ChangeInCharacters {

	public static void main(String[] args) {

		String input = "abbasdasdasd";
		System.out.println("Change in characters: " + countOfChangeInCharacters(input));
	}
	
	public static int countOfChangeInCharacters(String input) {
		
		char[] inputArray = input.toLowerCase().trim().toCharArray();
		
		if (inputArray.length > 0){
			
			int firstPointer = 0;
			int nextPointer = 1;
			int counter = 0;
			
			while ( (firstPointer < nextPointer) && (nextPointer < inputArray.length) ) {
				
				if(inputArray[firstPointer] != inputArray[nextPointer] ) {
					++counter;
				}
				
				++firstPointer;
				++nextPointer;
			}
			
			return counter;
			
		}
		else {
			return 0;
		}
	}
}
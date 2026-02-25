package com.sdet.practice;

public class ReverseOnlyVowels {

	public static void main(String[] args) {
		
		String input = "MUGHDa";
		System.out.println("Vowels reversed in the string: " + vowelsReverse(input));
	}
	
	public static String vowelsReverse(String input) {
		
		char[] inputArray = input.toCharArray();
		String vowels = "aeioAEIOU";
		
		if (!input.isEmpty()) {
			
			int leftPointer = 0;
			int rightPointer = inputArray.length - 1;
			char temp = ' ';
			
			while(leftPointer < rightPointer) {
				
				if(vowels.indexOf(inputArray[leftPointer]) == -1) {
					++leftPointer;
				}
				else if(vowels.indexOf(inputArray[rightPointer]) == -1) {
					rightPointer--;
				}
				
				else {
					
					temp = inputArray[leftPointer];
					inputArray[leftPointer] = inputArray[rightPointer];
					inputArray[rightPointer] = temp;
				
					++leftPointer;
					rightPointer--;
				}
			}
		}
		
		return new String(inputArray);
	}
}

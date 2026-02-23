package com.sdet.practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "9876543210";
		char[] inputCharArray = input.toCharArray();
		System.out.println("Reversed string: " + reverseString(inputCharArray));
	}
	
	public static String reverseString(char[] inputCharArray) {
		
		int leftPointer = 0;
		int rightPointer = inputCharArray.length - 1;		
		char temp;
		
		while(leftPointer < rightPointer) {
			
			temp = inputCharArray[rightPointer];
			inputCharArray[rightPointer] = inputCharArray[leftPointer];
			inputCharArray[leftPointer] = temp;
		
			++leftPointer;
			--rightPointer;			
		}
		
		return new String(inputCharArray);
	}

}

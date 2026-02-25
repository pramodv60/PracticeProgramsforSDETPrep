package com.sdet.practice;

public class ReverseString {

	public static void main(String[] args) {

		String input = "9876543210";
		System.out.println("Reversed string: " + reverseString(input));

		input = "Same pinch";
		System.out.println("Reveresed string in same index: " + reverseStringInSameIndex(input));
	}

	public static String reverseString(String input) {

		char[] inputCharArray = input.toCharArray();
		int leftPointer = 0;
		int rightPointer = inputCharArray.length - 1;
		char temp;

		while (leftPointer < rightPointer) {

			temp = inputCharArray[rightPointer];
			inputCharArray[rightPointer] = inputCharArray[leftPointer];
			inputCharArray[leftPointer] = temp;

			++leftPointer;
			--rightPointer;
		}

		return new String(inputCharArray);
	}

	public static String reverseStringInSameIndex(String input) {

		StringBuilder stringBuilder = null;

		if (!input.isEmpty()) {

			String[] stringArray = input.split(" ");
			stringBuilder = new StringBuilder();

			for (String eachItem : stringArray) {
				stringBuilder.append(reverseString(eachItem)).append(" ");
			}
		}

		return stringBuilder.toString().trim();
	}
}
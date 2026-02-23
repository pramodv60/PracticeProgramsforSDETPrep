package com.sdet.practice;

import java.util.Arrays;

public class ReverseStringUsingTwoPointerApproach {

	public static void main(String[] args) {

		String name = "hello";
		System.out.println("Reversed string: " + revereseStringUsingStringBuilder(name));
	}

	public static String revereseStringUsingTempVariable(String input) {

		char[] inputArray = null;
		int leftPointer = 0;
		int rightPointer = 0;
		char tempChar;

		if (!input.isEmpty()) {

			inputArray = input.toCharArray();
			rightPointer = inputArray.length - 1;

			while (leftPointer <= rightPointer) {
				tempChar = inputArray[rightPointer];
				inputArray[rightPointer] = inputArray[leftPointer];
				inputArray[leftPointer] = tempChar;

				++leftPointer;
				--rightPointer;
			}
		}

		return Arrays.toString(inputArray);
	}

	public static StringBuilder revereseStringUsingStringBuilder(String input) {

		char[] inputArray = null;
		int leftPointer = 0;
		int rightPointer = 0;
		StringBuilder reversedString = new StringBuilder();

		if (!input.isEmpty()) {

			inputArray = input.toCharArray();
			rightPointer = input.length() - 1;

			while (leftPointer <= rightPointer) {

				reversedString.append(inputArray[rightPointer]);
				--rightPointer;
			}
		}

		return reversedString;
	}

}
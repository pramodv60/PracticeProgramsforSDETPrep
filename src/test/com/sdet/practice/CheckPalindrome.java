package com.sdet.practice;

import java.util.Arrays;

public class CheckPalindrome {

	public static void main(String[] args) {

		// String input = "A man, a plan, a canal: Panama";
		// System.out.println("Is: " + input + " a valid Palindrome? " +
		// palindromeCheckUsingTwoPointers(input));

		String[] inputArray = { "Anandita", "is", "in", "the", "interview" };
		System.out.println("Array with elements reversed in the mid: " + Arrays.toString(inputArray));
	}

	public static boolean isPalindrome(String input) {

		StringBuilder stringBuilder = null;
		char[] characterArray = null;
		String reversedString = null;

		if (!input.isEmpty()) {

			characterArray = input.trim().toCharArray();
			stringBuilder = new StringBuilder();

			for (char eachChar : characterArray) {

				if (Character.isLetterOrDigit(eachChar)) {
					stringBuilder.append(Character.toLowerCase(eachChar));
				}
			}

			if (stringBuilder.length() > 0) {

				input = stringBuilder.toString().trim();
				reversedString = stringBuilder.reverse().toString();
			}

			if (reversedString != null && reversedString.equals(input)) {
				return true;
			}
		}

		return false;
	}

	public static boolean palindromeCheckUsingTwoPointers(String input) {

		char[] characterArray = null;
		char[] characterArrayFromBuilder = null;
		boolean isPalindrome = false;
		int rightPointer = 0;
		int leftPointer = 0;
		StringBuilder stringBuilder = null;

		if (!input.trim().isEmpty()) {

			stringBuilder = new StringBuilder();
			characterArray = input.trim().toCharArray();

			for (char eachCharacter : characterArray) {

				if (Character.isLetterOrDigit(eachCharacter)) {
					stringBuilder.append(Character.toLowerCase(eachCharacter));
				}
			}

			if (stringBuilder.length() > 0) {

				characterArrayFromBuilder = stringBuilder.toString().toCharArray();
				rightPointer = characterArrayFromBuilder.length - 1;

				while (leftPointer <= rightPointer) {

					if (characterArrayFromBuilder[leftPointer] == characterArrayFromBuilder[rightPointer]) {
						isPalindrome = true;
					} else {
						isPalindrome = false;
					}
					++leftPointer;
					--rightPointer;
				}
			}
		}

		return isPalindrome;
	}

	public static String[] reverseMidArray(String[] input) {

		int rightPointer = 0;
		int leftPointer = 0;
		String tempString = null;

		if (input != null && input.length > 1) {

			leftPointer = 1; // Start from the first element
			rightPointer = input.length - 2; // Start from the pen-ultimate element

			while (leftPointer <= rightPointer) {

				if (isNullOrEmpty(input[leftPointer]) && isNullOrEmpty(input[rightPointer])) {

					tempString = input[rightPointer];
					input[rightPointer] = input[leftPointer];
					input[leftPointer] = tempString;
				}

				++leftPointer;
				--rightPointer;
			}
		}

		return input;
	}

	public static boolean isNullOrEmpty(String inputString) {
		return (inputString.trim() != null && !inputString.trim().isEmpty() && inputString.trim().length() > 0);
	}
}
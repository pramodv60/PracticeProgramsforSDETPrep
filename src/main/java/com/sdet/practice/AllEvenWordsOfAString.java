package com.sdet.practice;

public class AllEvenWordsOfAString {

	public static void main(String[] args) {

		String input = "Calculate the diameter of the sun";
		evenWordsOfAString(input);
	}

	public static void evenWordsOfAString(String input) {

		if (!input.isEmpty()) {

			String[] stringArray = input.split(" ");

			for (String eachString : stringArray) {

				if (isEvenLength(eachString)) {
					System.out.println("Even length string: " + eachString);
				}
			}
		}
	}

	private static boolean isEvenLength(String eachString) {
		return (eachString.length() % 2 == 0);
	}
}
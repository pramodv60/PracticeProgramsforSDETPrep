package com.sdet.practice;

public class MissingNumberInAnArray {

	public static void main(String[] args) {

		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		// printMissingNumber(input);
		printMissingNumberUsingExOR(input);
	}

	public static void printMissingNumber(int[] input) {

		if (input.length > 0) {

			int sum = 0;
			int missingNumber = 0;
			int totalSumOfArrayElements = calculateArraySum(input);

			for (int index = 0; index < input.length; index++) {
				sum = sum + input[index];
			}

			if (sum > totalSumOfArrayElements) {

				missingNumber = sum - totalSumOfArrayElements;
				System.out.println("Missing number is: " + missingNumber);
			}
		}
	}

	private static int calculateArraySum(int[] input) {
		return ((input.length) * (input.length + 1)) / 2;
	}

	private static void printMissingNumberUsingExOR(int[] input) {

		if (input.length > 0) {

			int missingNumber = 0;

			for (int eachElement : input) {
				missingNumber = missingNumber ^ eachElement;
			}

			int lastArrayElement = input[input.length - 1];

			for (int index = 0; index <= lastArrayElement; index++) {
				missingNumber = missingNumber ^ index;
			}

			System.out.println("Missing number in the Array is: " + missingNumber);
		}
	}
}
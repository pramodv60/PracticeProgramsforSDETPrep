package com.sdet.practice;

public class LargestAndSecondLargestNumber {

	public static void main(String[] args) {

		int[] inputArray = { 0, 1, 8, 6, 17, 77, 103, 65, 35 };
		firstAndSecondLargestNumberInArray(inputArray);
	}

	public static void firstAndSecondLargestNumberInArray(int[] inputArray) {

		if (inputArray == null || inputArray.length < 2) {
			System.out.println("Array must contain at least two elements.");
			return;
		}

		int largestNumber = Integer.MIN_VALUE;
		int secondLargestNumber = Integer.MIN_VALUE;

		for (int eachItem : inputArray) {

			if (eachItem > largestNumber) {
				secondLargestNumber = largestNumber;
				largestNumber = eachItem;
			}

			else if (eachItem > secondLargestNumber && eachItem != largestNumber) {
				secondLargestNumber = eachItem;
			}
		}

		System.out.println("Largest number: " + largestNumber);
		System.out.println("Second Largest number: " + secondLargestNumber);
	}
}
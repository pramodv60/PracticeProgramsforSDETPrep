package com.sdet.practice;

public class MaximumProductOfTriplets {

	public static void main(String[] args) {

		int[] inputArray = { -10, -3, 5, 6, -20 };
		System.out.println("Max Triplet Product: " + findMaxTripletProduct(inputArray));
	}

	public static int findMaxTripletProduct(int[] inputArray) {

		int result1 = 0, result2 = 0;
		int max1 = 0, max2 = 0, max3 = 0;
		int min1 = 999999, min2 = 999999;

		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i] > max1) {
				max3 = max2;
				max2 = max1;
				max1 = inputArray[i];
			}

			else if (inputArray[i] > max2) {
				max3 = max2;
				max2 = inputArray[i];
			}

			else if (inputArray[i] > max3) {
				max3 = inputArray[i];
			}

			if (inputArray[i] < min1) {
				min2 = min1;
				min1 = inputArray[i];
			}

			else if (inputArray[i] < min2) {
				min2 = inputArray[i];
			}
		}

		result1 = max1 * max2 * max3;
		result2 = min1 * min2 * max1;

		return Math.max(result1, result2);
	}
}
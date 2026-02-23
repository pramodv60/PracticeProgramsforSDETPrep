package com.sdet.practice;

import java.util.Arrays;

public class MountainArray {

	public static void main(String[] args) {

		int[] inputArray = { 1, 2, 3, 4, 3, 2, 1 };
		System.out.println("Is the given Array: " + Arrays.toString(inputArray) + " MOUNTAIN ARRAY? : "
				+ checkClimbingArray(inputArray));
	}

	public static boolean checkClimbingArray(int[] inputArray) {

		if (inputArray.length > 3) {

			int currentIndex = 0;
			int arrayLength = inputArray.length - 1;

			while ((currentIndex < arrayLength) && inputArray[currentIndex] < inputArray[currentIndex + 1]) {
				++currentIndex;
			}

			while ((currentIndex < arrayLength) && inputArray[currentIndex] > inputArray[currentIndex + 1]) {
				++currentIndex;
			}

			if (currentIndex == inputArray.length - 1) {
				return true;
			}
		}

		return false;
	}
}
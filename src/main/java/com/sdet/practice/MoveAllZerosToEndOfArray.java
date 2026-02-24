package com.sdet.practice;

import java.util.Arrays;

public class MoveAllZerosToEndOfArray {

	public static void main(String[] args) {

		int[] input = { 1, 0, 2, 0, 3, 0, 4, 0 };
		moveZerosToEnd(input);
	}

	public static void moveZerosToEnd(int[] input) {

		int nonZeroIndex = 0;
		int temp = 0;

		for (int index = 0; index < input.length; index++) {

			if (input[index] != 0) {

				temp = input[nonZeroIndex];
				input[nonZeroIndex] = input[index];
				input[index] = temp;
				++nonZeroIndex;
			}
		}

		System.out.println("Updated Array: " + Arrays.toString(input));
	}
}
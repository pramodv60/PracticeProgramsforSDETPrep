package com.sdet.practice;

public class SumOfArrayElements {

	public static void main(String[] args) {

		int[] inputArray = { 1, 2, 33, 444, 5555 };
		System.out.println("Sum of Array Elements: " + sumOfArrayElements(inputArray));
	}

	private static int sumOfArrayElements(int[] inputArray) {
		int sum = 0;

		for (int eachElement : inputArray) {
			sum = sum + eachElement;
		}

		return sum;
	}

}

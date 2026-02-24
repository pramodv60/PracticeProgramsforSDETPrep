package com.sdet.practice;

public class FactorialOfANumber {

	public static void main(String[] args) {

		long number = 12;
		System.out.println("Facotial of " + number + " is: " + factorialOfANumber(number));
	}

	public static long factorialOfANumber(long number) {

		long result = 1;

		if (number == 0 || number == 1) {
			return result;
		}

		else {

			for (int i = 1; i <= number; i++) {
				result = result * i;
			}
		}

		return result;
	}
}
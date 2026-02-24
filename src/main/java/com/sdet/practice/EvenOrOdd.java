package com.sdet.practice;

public class EvenOrOdd {

	public static void main(String[] args) {

		int number = 22334;
		isEvenOROdd(number);
	}

	public static void isEvenOROddWithOutModulus(int number) {

		while (number > 1) {
			number = number - 2;
		}

		if (number == 1) {
			System.out.println("Odd number!");
		} else {
			System.out.println("Even number!");
		}
	}

	public static void isEvenOROdd(int number) {

		if (number % 2 == 0) {
			System.out.println("Even number!");
		} else {
			System.out.println("Odd number!");
		}
	}
}
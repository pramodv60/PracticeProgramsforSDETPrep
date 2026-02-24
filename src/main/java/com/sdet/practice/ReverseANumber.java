package com.sdet.practice;

public class ReverseANumber {

	public static void main(String[] args) {

		int input = 654321;
		reverseANumber(input);
	}

	public static void reverseANumber(int number) {

		int remainder = 0;
		int reversedNum = 0;

		while (number % 10 != 0) {
			remainder = number % 10;
			number = number / 10;
			reversedNum = reversedNum * 10 + remainder;
		}

		System.out.println(reversedNum);
	}
}
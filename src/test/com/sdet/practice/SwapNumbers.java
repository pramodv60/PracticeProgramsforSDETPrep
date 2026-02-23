package com.sdet.practice;

public class SwapNumbers {

	public static void main(String[] args) {

		int a = 67;
		int b = 77;

		// swapUsingTempVariable(a, b);
		// swapUsingArithmetic(a, b);
		swapUsingXor(a, b);
	}

	public static void swapUsingTempVariable(int a, int b) {

		int temp = 0;

		temp = a;
		a = b;
		b = temp;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	public static void swapUsingArithmetic(int a, int b) {

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	public static void swapUsingXor(int a, int b) {

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}
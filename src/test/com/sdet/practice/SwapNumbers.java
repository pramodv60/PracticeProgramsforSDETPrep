package com.sdet.practice;

public class SwapNumbers {

	public static void main(String[] args) {

		int a = 67;
		int b = 77;

		// method_1(a, b);
		// method_2(a, b);
		method_3(a, b);
	}

	public static void method_1(int a, int b) {

		int temp = 0;

		temp = a;
		a = b;
		b = temp;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	public static void method_2(int a, int b) {

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	public static void method_3(int a, int b) {

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
}
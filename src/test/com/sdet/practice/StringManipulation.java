package com.sdet.practice;

public class StringManipulation {

	public static void main(String[] args) {
		
		double input = 123.3456;
		System.out.println("No of digits after decimal: " + numberOfCharactersAfterDecimal(input));
	}
	
	public static int numberOfCharactersAfterDecimal(double number) {
		
		String inputString = String.valueOf(number);
		return inputString.length() - inputString.indexOf(".") - 1;
	}
}
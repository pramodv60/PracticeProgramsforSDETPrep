package com.sdet.practice;

public class PangramString {

	public static void main(String[] args) {

		String input = "The quick brown fox jumps over the lazy dog";
		System.out.println("Is the input " + "\"" + input + "\"" + " Panagram? " + isPangramString(input));
	}

	public static boolean isPangramString(String input) {

		if (input.length() < 26) {
			return false;
		} else {

			input = input.toLowerCase().trim();

			for (char eachChar = 'a'; eachChar <= 'z'; eachChar++) {

				if (input.indexOf(eachChar) < 0) {
					return false;
				}
			}
		}
		return true;
	}
}
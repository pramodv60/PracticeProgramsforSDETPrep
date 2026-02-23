package com.sdet.practice;

public class CaseToggleInString {

	public static void main(String[] args) {

		String input = "Hello World";
		System.out.println("Toggled case converted string: " + caseToggle(input));
	}

	public static StringBuilder caseToggle(String input) {

		StringBuilder stringBuilder = null;

		if (!input.isEmpty()) {

			stringBuilder = new StringBuilder();
			char[] characterArray = input.toCharArray();

			for (char eachCharacter : characterArray) {

				if (Character.isAlphabetic(eachCharacter)) {
					if (Character.isLowerCase(eachCharacter)) {
						stringBuilder.append(Character.toUpperCase(eachCharacter));
					}

					else if (Character.isUpperCase(eachCharacter)) {
						stringBuilder.append(Character.toLowerCase(eachCharacter));
					}
				}
			}
		}

		return stringBuilder;
	}
}
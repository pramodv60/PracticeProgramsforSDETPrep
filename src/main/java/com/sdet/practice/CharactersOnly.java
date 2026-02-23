package com.sdet.practice;

public class CharactersOnly {

	public static void main(String[] args) {

		String input = "r@vi56 ku%$mar 67";
		System.out.println(characterOnly(input));
	}

	public static StringBuilder characterOnly(String input) {

		char[] characterInputArray = null;
		StringBuilder stringBuilder = null;
		int sum = 0;

		if (!input.isEmpty()) {

			characterInputArray = input.toCharArray();
			stringBuilder = new StringBuilder();

			for (char eachCharacter : characterInputArray) {

				if (Character.isLetter(eachCharacter) || eachCharacter == ' ') {
					stringBuilder = stringBuilder.append(eachCharacter);
				}

				else if (Character.isDigit(eachCharacter)) {
					sum = sum + Character.getNumericValue(eachCharacter);
				}
			}
		}

		else {
			return null;
		}

		stringBuilder.append(sum);
		return stringBuilder;
	}

}

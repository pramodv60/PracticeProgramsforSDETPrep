package com.sdet.practice;

import java.util.ArrayList;
import java.util.List;

public class OrderOfElementsInString {

	public static void main(String[] args) {

		String input = "a1b2c3";
		orderCharacters(input);
	}

	public static void orderCharacters(String input) {

		if (!input.isEmpty()) {

			char[] characterArray = input.toCharArray();
			StringBuilder stringBuilder = new StringBuilder();
			List<Character> digitList = new ArrayList<Character>();

			for (char eachCharacter : characterArray) {

				if (Character.isDigit(eachCharacter)) {
					digitList.add(eachCharacter);
				}
			}

			int index = digitList.size() - 1;

			for (char eachCharacter : characterArray) {

				if (Character.isDigit(eachCharacter)) {
					stringBuilder.append(digitList.get(index));
					index--;
				} else {
					stringBuilder.append(eachCharacter);
				}
			}

			System.out.println(stringBuilder);
		}
	}

}
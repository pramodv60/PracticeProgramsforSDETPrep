package com.sdet.practice;

public class LengthOfLastWordInString {

	public static void main(String[] args) {

		String[] inputStringArray = { "Hello World", "   LAST MINUTE ", "DEEKSHA disastrous       " };
		lengthOfLastString(inputStringArray);
	}

	public static void lengthOfLastString(String[] inputStringArray) {

		if (inputStringArray.length > 0) {

			int characterCount = 0;
			String[] lastElementInStringArray = null;

			String lastStringElement = inputStringArray[inputStringArray.length - 1];

			if (lastStringElement != null && !lastStringElement.isEmpty()) {

				lastStringElement = lastStringElement.trim();

				if (lastStringElement != null && !lastStringElement.isEmpty()) {

					lastElementInStringArray = lastStringElement.split(" ");

					if (lastElementInStringArray.length > 0) {

						characterCount = lastElementInStringArray[lastElementInStringArray.length - 1].length();

						if (characterCount != 0) {
							System.out.println("Word count of last string is: " + characterCount);
						}
					}
				}
			}
		}
	}
}
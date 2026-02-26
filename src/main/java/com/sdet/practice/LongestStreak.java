package com.sdet.practice;

public class LongestStreak {

	public static void main(String[] args) {

		String[] input = {"YYY","YYY","YNN","YYY","YYY","YYY"};
		System.out.println("Longest Streak days: " + longestStreakInDays(input));
	}

	public static int longestStreakInDays(String[] input) {
		
		int longestStreak = 0;
		int currentStreak = 0;
		
		if(input.length > 0) {
			
			for(String eachDayReading: input) {

				if(eachDayReading != null && !(eachDayReading.isEmpty())) {
					
					if(!(eachDayReading.contains("N"))) {
						
						currentStreak = currentStreak + 1;
						longestStreak = Math.max(longestStreak, currentStreak);
					}
					else {
						currentStreak = 0;
					}
			}
		}
	}
		
		return longestStreak;
	}
}
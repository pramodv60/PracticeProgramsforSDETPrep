package com.sdet.practice;

public class MountainBuildingPattern {

	public static void main(String[] args) {

		int input = 5;
		printMountainPattern(input);
	}
	
	public static void printMountainPattern(int input) {

		for(int row = 1; row <= input; ++row) {	
			for(int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println(" ");
		}
		
		for(int row = input - 1; row >= 1; row--) {
			for(int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println(" ");
		}
	}
}
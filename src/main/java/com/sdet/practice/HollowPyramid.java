package com.sdet.practice;

public class HollowPyramid {

	public static void main(String[] args) {

		int rows = 5;
		hollowPyramidDisplay(rows);
	}
	
	public static void hollowPyramidDisplay(int input) {
		
		for(int row = 1; row <= input; row++) {
			
			for(int column = 1; column <= row; column++) {
				
				if (column == 1 || column == row || row == input) {
					System.out.print(column);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
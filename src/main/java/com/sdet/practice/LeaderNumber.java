package com.sdet.practice;

public class LeaderNumber {

	public static void main(String[] args) {

		int[] inputArray = {16, 17, 4, 3, 5, 2};
		printLeaderNumber(inputArray);
	}
	
	public static void printLeaderNumber(int[] input) {

	    if (input.length == 0) return;

	    int maxFromRight = input[input.length - 1];
	    System.out.println("Leader numbers: " + maxFromRight);

	    for (int i = input.length - 2; i >= 0; i--) {

	        if (input[i] > maxFromRight) {
	            maxFromRight = input[i];
	            System.out.println("Leader numbers: " + maxFromRight);
	        }
	    }
	}
}
package com.sdet.practice;

public class MonotonicArrayCheck {

	public static void main(String[] args) {

		int[] inputArray = {0,13,2,4,6,8}; 
		System.out.println("Given array is Monotonic?? " + isMonotonicArray(inputArray));
	}
	
	public static boolean isMonotonicArray(int[] inputArray) {
	
		boolean isIncreasing = true;
		boolean isDecreasing = true;
		
		for(int i = 1; i < inputArray.length - 1; i++) {
			
			if(inputArray[i-1] > inputArray[i]) {
				isIncreasing = false;
			}
			
			else if(inputArray[i-1] < inputArray[i]) {
				isDecreasing = false;
			}
		}
		
		return (isIncreasing || isDecreasing);
	}
}
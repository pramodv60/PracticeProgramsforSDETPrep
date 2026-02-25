package com.sdet.practice;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		String input = "()(())";
		System.out.println("Are parentheses matching?: " + hasValidParenthesis(input));
	}
	
	public static boolean hasValidParenthesis(String input) {
		
		Stack<Character> stack = new Stack<Character>();
		
		if(!input.isEmpty()) {
			
			char[] characterArray = input.toCharArray();
			
			if(characterArray.length > 0) {
				
				for(char eachCharacter: characterArray) {
					
					if(eachCharacter == '(') {
						stack.push('(');
					}
					
					else if(eachCharacter == ')' && stack.isEmpty()) {
						return false;
					}
					
					else {
						if(stack.pop() != '(') {
							return false;
						}
					}
				}
			}
		}
		return stack.isEmpty();
	}
}
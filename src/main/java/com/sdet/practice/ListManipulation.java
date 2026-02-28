package com.sdet.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListManipulation {

	public static void main(String[] args) {

		List<Integer> numberList = Arrays.asList(1, 22, 32, null, 123, 100);
		filterArray(numberList);
	}

	public static void filterArray(List<Integer> numberList) {

		if (!numberList.isEmpty()) {

			List<Integer> result = numberList.stream().filter(eachNumber -> Objects.nonNull(eachNumber))
					.filter(eachNumber -> eachNumber.toString().startsWith("1")).collect(Collectors.toList());
			System.out.println("No null array list and list items starting with 1: " + result);
		}
	}

}
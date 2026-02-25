package com.tutorialspoint.wildcards;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWildCardDemo {
	
	public static double sum(List<? extends Number> numberList) {
		double sum = 0.0;
		for (Number n : numberList) sum += n.doubleValue();
		return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3);
		System.out.println("Sum = "+sum(intList));
		List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("Sum = "+sum(doubleList));
	}

}

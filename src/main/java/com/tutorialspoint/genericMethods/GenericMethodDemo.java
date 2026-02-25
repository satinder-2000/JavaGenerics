package com.tutorialspoint.genericMethods;

/**
 * You can write a single generic method declaration that can be called with arguments of different types. 
 * Based on the types of the arguments passed to the generic method, the compiler handles each method call appropriately. 
 * Following are the rules to define Generic Methods −
 * All generic method declarations have a type parameter section delimited by angle brackets (< and >) that precedes the method's return type ( < E > in the next example).
 * Each type parameter section contains one or more type parameters separated by commas. A type parameter, also known as a type 
 * variable, is an identifier that specifies a generic type name.
 * The type parameters can be used to declare the return type and act as placeholders for the types of the arguments passed to the 
 * generic method, which are known as actual type arguments.
 * A generic method's body is declared like that of any other method. Note that type parameters can represent only reference types,
 * not primitive types (like int, double and char).
 */



public class GenericMethodDemo {
	// generic method printArray
	public static <E> void printArray(E[] inputArray) {
		System.out.println("Display array elements");
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Create arrays of Integer, Double and Character");
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		System.out.println("Array intArray contains");
		printArray(intArray);
		System.out.println();
		System.out.println("Array doubleArray contains");
		printArray(doubleArray);
		System.out.println();
		System.out.println("Array charArray contains");
		printArray(charArray);
		System.out.println();
	}

}

package com.tutorialspoint.parameterisedTypes;

import java.util.ArrayList;
import java.util.List;

/*
 * A Generic class can have parameterized types where a type parameter can be substituted with a parameterized type.
 */
public class ParameterisedTypesDemo {
	
	public static void main(String[] args) {
		Box<Integer, List<String>> box = new Box<Integer, List<String>>();
		
		List<String> messages = new ArrayList<String>();
		messages.add("Hi");
		messages.add("Hello");
		messages.add("Bye");
		
		box.add(Integer.valueOf(10), messages);
		System.out.printf("Integer value :%d\n", box.getFirst());
		System.out.printf("String value :%s\n", box.getSecond());
	}

}

class Box<T, S> {
	private T t;
	private S s;

	public void add(T t, S s) {
		this.t = t;
		this.s = s;
	}

	public T getFirst() {
		return t;
	}

	public S getSecond() {
		return s;
	}
}
package com.tutorialspoint.genericClasses;

public class GenericClassDemo {
	
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();
		
		integerBox.add(Integer.valueOf(10));
		stringBox.add(new String("hello world"));
		
		System.out.printf("Integer value: %d\n", integerBox.getT());
		System.out.printf("String value: %s\n", stringBox.getT());
		
	}

}

class Box<T> {
	private T t;
	
	public void add(T t) {
		this.t=t;
	}
	
	public T getT() {
		return t;
	}
}
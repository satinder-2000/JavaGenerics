package com.tutorialspoint.rawTypes;

/**
 * A raw type is an object of a generic class or interface if its type arguments are not passed during its creation. 
 */

public class RawTypeDemo {
	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		
		box.set(Integer.valueOf(10));
		System.out.printf("Integer Value :%d\n", box.getData());
		
		Box rawBox = new Box();
		System.out.println("No warning");
		rawBox = box;
		System.out.printf("Integer Value :%d\n", rawBox.getData());
		System.out.println("Warning for unchecked invocation to set(T)");
		rawBox.set(Integer.valueOf(10));
		System.out.printf("Integer Value :%d\n", rawBox.getData());
		
		System.out.println("Warning for unchecked conversion");
		box = rawBox;
		System.out.printf("Integer Value :%d\n", box.getData());
		
	}

}

class Box<T>{
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T getData() {
		return t;
	}
}

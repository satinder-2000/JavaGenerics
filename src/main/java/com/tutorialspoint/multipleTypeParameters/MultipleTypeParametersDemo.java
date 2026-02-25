package com.tutorialspoint.multipleTypeParameters;

/**
 * A Generic class can have muliple type parameters. Following example will showcase above mentioned concept.
 */
public class MultipleTypeParametersDemo {
	
	public static void main(String[] args) {
		Box<Integer, String> box = new Box<Integer, String>();
		box.add(Integer.valueOf(10), "Hello World");
		System.out.printf("Integer value :%d\n", box.getFirst());
		System.out.printf("String value :%s\n", box.getSecond());
		
		Box<String, String> box1 = new Box<String, String>();
		box1.add("Message", "Hello World");
		System.out.printf("String value :%s\n", box1.getFirst());
		System.out.printf("String value :%s\n", box1.getSecond());
	}

}

class Box<T, S>{
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
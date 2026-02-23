package com.tutorialspoint.typeInferences;
/**
 * Type inference represents the Java compiler's ability to look at a method 
 * invocation and its corresponding declaration to check and determine the type 
 * argument(s). The inference algorithm checks the types of the arguments and, 
 * if available, assigned type is returned. Inference algorithms tries to find a 
 * specific type which can fullfill all type parameters.
 */

public class TypeInferenceDemo {
	
	public static void main(String[] args) {
		System.out.println("type inference");
		Box<Integer> integerBox = new Box<>();
		System.out.println("unchecked conversion warning");
	}

}
class Box<T> {
	private T t;
	
	public void add(T t) {
		this.t=t;
	}
	
	public T get() {
		return t;
	}
}
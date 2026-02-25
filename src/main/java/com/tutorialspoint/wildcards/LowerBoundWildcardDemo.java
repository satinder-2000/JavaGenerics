package com.tutorialspoint.wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcardDemo {
	
	public static void addCat(List<? super Cat> catList) {
		catList.add(new RedCat());
		System.out.println("New cat added");
	}
	
	public static void main(String[] args) {
		
		List<Animal> animalList = new ArrayList<Animal>();
		List<Cat> catList = new ArrayList<Cat>();
		List<RedCat> redCatList = new ArrayList<RedCat>();
		List<Dog> dogList = new ArrayList<Dog>();
		
		System.out.println("add list of super class Animal of Cat class");
		addCat(animalList);
		System.out.println();
		
		System.out.println("add list of Cat class");
		addCat(catList);
		System.out.println();
		
		System.out.println("can not add list of subclass RedCat of Cat class");
		//addCat(redCatList);
		//System.out.println();
		
		System.out.println("can not add list of subclass Dog of Superclass Animal of Cat class");
		//addCat(dogList);
		//System.out.println();
		
		
	}

}

class Animal {}

class Cat extends Animal{}

class RedCat extends Cat{}
class Dog extends Animal{}
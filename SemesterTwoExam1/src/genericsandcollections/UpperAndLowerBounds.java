package genericsandcollections;

import java.util.ArrayList;
import java.util.List;

public class UpperAndLowerBounds {

	/* The below method allows both reading and adding
	 * It will take any super or subtype of cat as a parameter
	 * It will allow you to read any element whether it is a super or subtype of Cat
	 * But it will only allow you to add subtypes of Cat
	 */
	public void upperLowerBoundMethod(List<? super Cat> list){
		
		list.add(new Cat()); // Fine, Cat is-a cat
		list.add(new LongHaired()); // Also fine, longhaired is-a cat
		// list.add(new Animal()); problem: Animal is a supertype, but not a cat. Can't be added
		//list.add(new Dog()); What are you even doing here dog?#
		
		/* 
		 * Compilation error below: We don't know that the list is cats. Could be animals.
		 */
//		for(Cat c : list){
//			System.out.println(c);
//		}
		
		/*
		 * We'll just take objects instead
		 */
		for(Object a : list){
			System.out.println(a);
		}
	}
}

class Animal{
	
}

class Cat extends Animal{
	
}

class LongHaired extends Cat
{
	
}

class Dog extends Animal{
	public static void main(String[] args){
		ArrayList<Cat> cats = new ArrayList<>();
		cats.add(new Cat());
		cats.add(new LongHaired());
		new UpperAndLowerBounds().upperLowerBoundMethod(cats); // This is fine, cats is-a cat
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal());
		new UpperAndLowerBounds().upperLowerBoundMethod(animals); // This is fine, animal is a supertype of cat
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		// new UpperAndLowerBounds().upperLowerBoundMethod(dogs); compilation error: dog is not a cat or one of its supertypes
	}
}
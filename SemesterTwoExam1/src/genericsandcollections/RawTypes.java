package genericsandcollections;

import java.util.LinkedList;
import java.util.List;

public class RawTypes {
	/*
	 * List and its subclasses (ArrayList, etc) are considered generics because they can use the diamond operator
	 * to take any type of Object, but not primitives.
	 * When declared without the use of the diamond operator, they are considered raw types.
	 */
	
	public static void main(String[] args){
		// IMPORTANT: Notice that the list below gives no indication as to what can be added to it
		List list = new LinkedList();
		
		/* 
		 * The below produces no compiler error, despite the change in Object type from String to Integer.
		 */
		
		list.add("Hello");
		list.add("World");
		list.add(12);
		
		List<Integer> listOfInts = new LinkedList<>(); // Declared with type Integer.
		// listOfInts.add("Hello world!");  Compilation error, as String is not an Integer.
	}
}

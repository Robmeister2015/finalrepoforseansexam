package genericsandcollections;

import java.util.ArrayList;
import java.util.List;

public class WildCardsWithBoundedGenerics{
	
	public static void main(String[] args){
		
		/*
		 * All of the below are ok because this list allows Number and any of its subtypes
		 */
		List<? extends Number> numberList = new ArrayList<Integer>();
		numberList = new ArrayList<Double>();
		numberList = new ArrayList<Float>();
		numberList = new ArrayList<Number>();
		
		// numberList = new ArrayList<String>(); Compilation error because String is not a subclass of Number
	}
}

package genericsandcollections;

import java.util.ArrayList;
import java.util.List;

public class BoundedWildcards {

	/*
	 * The below method will take a list parameter of Number or any of its subtypes
	 */
	public static Double sum(List<? extends Number> numList){
		Double result = 0.0;
		
		for(Number num : numList){
			result += num.doubleValue();
		}
		return result;
	}
	
	public static void main(String[] args){
		List<Integer> intList = new ArrayList<>();
		List<Double> doubleList = new ArrayList<>();
		
		for(int i = 0; i < 5; i ++){
			intList.add(i);
			doubleList.add((double) i * i);
		}
		
		/*
		 * No compilation errors below, as both Double and Integer are subclasses of Number and are therefore
		 * valid parameters for the sum method above.
		 */
		System.out.println("The intList is: " + intList);
		System.out.println("The sum of the elements in intList is: " + sum(intList));
		
		System.out.println("The doubleList is: " + doubleList);
		System.out.println("The sum of the elements in doubleList is: " + sum(doubleList));
	}
}

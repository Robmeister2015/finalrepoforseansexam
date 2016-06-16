package genericsandcollections;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

	/*
	 * The below method has a generic return and takes a generic list as a parameter
	 * It is capable of calling the set method on any generic list.
	 * It can also add items of type T
	 * The list type must match the value type given with it or a compilation error will result
	 */
	public static <T> void fill(List<T> list, T val){
		for(int i = 0; i < list.size(); i ++){
			list.set(i, val);
			list.add(val);
		}
	}
}

class TestGenericMethods{
	public static void main(String[] args){
		
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		System.out.println("Original intList: " + intList);
		GenericMethods.fill(intList, 100);
		System.out.println("intList after calling fill: " + intList);
		
		List<String> strList = new ArrayList<>();
		strList.add("Hello");
		strList.add("World!");
		System.out.println(strList);
		// GenericMethods.fill(strList, 10); Compilation error due to type mismatch between Integer and String.
		System.out.println(strList);
	}
}

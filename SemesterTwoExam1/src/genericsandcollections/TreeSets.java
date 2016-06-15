package genericsandcollections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {

	/*
	 * A TreeSet will sort an array based on ASCII values.
	 * In this case, a whitespace comes first as it does have an ASCII value.
	 */
	
	public static void main(String[] args){
		String pangram = "the quick brown fox jumps over the lazy dog";
		
		Set<Character> aToZ = new TreeSet<Character>();
		
		for(char gram : pangram.toCharArray()){
			aToZ.add(gram);
		}
		
		System.out.println("Original: " + pangram);
		System.out.println("Sorted characters: " + aToZ);
	}
}

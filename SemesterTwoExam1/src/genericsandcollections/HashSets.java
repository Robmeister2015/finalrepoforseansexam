package genericsandcollections;

import java.util.HashSet;
import java.util.Set;

public class HashSets {

	/*
	 * HashSets do not allow duplicates
	 * See below example from Seán on this
	 */
	
	public static void main(String[] args){
		
		String tongueTwister = "I feel, a feel, a funny feel, ";
		tongueTwister += "a funny feel I feel, if you feel the feel ";
		tongueTwister += "I feel, I feel the feel you feel";
		
		Set<String> words = new HashSet<>();
		
		for(String word : tongueTwister.split("\\W+")){
			words.add(word);
		}
		
		System.out.println("The words used were: ");
		System.out.println(words);
	}
}

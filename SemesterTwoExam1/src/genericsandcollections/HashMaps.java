package genericsandcollections;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args){
		
	Map<String, String> spellingMistakes = new HashMap<String, String>();
	spellingMistakes.put("callosthenics", "callisthenics");
	
	String sentenceToCheck = "Feeling unfit? Why not try some radio callosthenics?";
		
	for(String word : sentenceToCheck.split("\\W+")){
		if(spellingMistakes.containsKey(word)){
			System.out.println("The correct way to spell " + word + " is " + spellingMistakes.get(word));
		}
	}
	}
}

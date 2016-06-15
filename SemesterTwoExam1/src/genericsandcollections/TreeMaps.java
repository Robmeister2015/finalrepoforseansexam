package genericsandcollections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMaps {

	/*
	 * A TreeMap implements NavigableMap and arranges in ascending order
	 * In the below example, the highest score is found by selecting the tail
	 */
	static NavigableMap<Integer, String> examScores = new TreeMap<Integer, String>();
	
	public static void main(String[] args){
	examScores.put(90, "Sophia");
	examScores.put(20, "Isabella");
	examScores.put(10, "Emma");
	examScores.put(50, "Olivia");
	
	System.out.println("Data in the map is: " + examScores);
	System.out.println("Data in descending order is: " + examScores.descendingMap());
	System.out.println("Details of those who passed the exam: " + examScores.tailMap(40));
	System.out.println("Details of those who failed the exam: " + examScores.headMap(40));
	System.out.println("Details of the lowest score: " + examScores.firstEntry());
	}
}

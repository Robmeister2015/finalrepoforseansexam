package genericsandcollections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class WhichMapsArrangeAllowDuplicatesEtc {

	public static void main(String[] args){
//		testHashMap();
//		testHashSet();
//		testTreeSet();
		testTreeMap();
	}
	
	/*
	 * First a HashMap
	 * It doesn't allow duplicates and it doesn't sort automatically
	 * There are no guarantees as to the order of the map
	 */

	public static void testHashMap(){
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("otherkey", "value");
		hashMap.put("key", "value");
		hashMap.put("key", "value");
		hashMap.put("a", "a");
		hashMap.put("z", "z");
		
		for(String key : hashMap.keySet()){
			System.out.println(key + " " + hashMap.get(key));
		}
	}
	
	/*
	 * As with a HashMap, a HashSet does not maintain any order
	 * Get it sorted mate
	 */
	
	public static void testHashSet(){
		Set<String> hashSet = new HashSet<>();
		hashSet.add("one");
		hashSet.add("two");
		hashSet.add("three");
		hashSet.add("one");
		
		for(String s : hashSet){
			System.out.println(s);
		}
	}
	
	/*
	 * Now a TreeSet
	 * A TreeSet sorts the elements
	 */
	
	public static void testTreeSet(){
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("one");
		treeSet.add("two");
		treeSet.add("three");
		treeSet.add("four");
		treeSet.add("five");
		treeSet.add("one");
		
		for(String s : treeSet){
			System.out.println(s);
		}
	}
	
	/*
	 * Time for a TreeMap
	 * A TreeMap will store things in ascending order
	 * See other class for tailmap, headmap, etc
	 */
	
	public static void testTreeMap(){
		
		NavigableMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("1", "0");
		treeMap.put("0", "10");
		treeMap.put("10", "4");
		treeMap.put("20", "5");
		
		for(String key : treeMap.keySet()){
			System.out.println(treeMap.get(key));
		}
		
	}
}

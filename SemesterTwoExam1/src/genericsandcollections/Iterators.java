package genericsandcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {

	public static void main(String[] args){
		
		/*
		 * An iterator can be used to iterate through a list
		 */
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < 10; i ++){
			intList.add(i);
		}
		System.out.println("IntList: " + intList);
		
		Iterator<Integer> numsIter = intList.iterator();
		while(numsIter.hasNext()){
			numsIter.next();
			numsIter.remove();
		}
		System.out.println("intList after removing all elements: " + intList);
	}
}

/*
 * Below we use ListIterator. It is a subclass of Iterator and so has remove, hasNext and next, as well as a method for working
 * backwards: previous
 */
class TestPalindromeIterator{
	

	static String palindrome = "abban";
	static String palindrome2 = "navan";
	
	static List<Character> charList = new ArrayList<>();
	
	public static void main(String[] args){
	
		for(char c : palindrome.toCharArray()){
		charList.add(c);
	}
		ListIterator<Character> firstIterator = charList.listIterator();
		ListIterator<Character> secondIterator = charList.listIterator(charList.size());
		
		while(firstIterator.hasNext() && secondIterator.hasPrevious()){
			if(firstIterator.next() != secondIterator.previous()){
				System.out.println("Nicht eine palindrome!");
			}else{
				System.out.println("Es ist eine palindrome!");
			}
		}
	}
}
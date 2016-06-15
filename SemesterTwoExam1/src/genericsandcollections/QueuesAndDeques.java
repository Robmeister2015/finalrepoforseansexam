package genericsandcollections;

import java.util.LinkedList;
import java.util.Queue;

/*
 * A Queue implements FIFO (First In, First Out)
 * So when we add, it goes to the end of the list, but when we remove it goes to the front of the list.
 */
public class QueuesAndDeques {

	public static void main(String[] args){
		Queue<String> loginSequence = new LinkedList<>();
		
		loginSequence.add("Rob");
		loginSequence.add("Rob2");
		loginSequence.add("Rob3");
		
		System.out.println("The sequence is: " + loginSequence);
		
		while(!loginSequence.isEmpty()){
			System.out.println("Removing: " + loginSequence.remove());
		}
	}
}

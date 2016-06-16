package genericshierarchyexample;

import java.util.Comparator;

public class NameComparator<T> implements Comparator<Lecturer>{

	/*
	 * Compares based on name
	 * Returns =1, 0 or 1 based on the comparison
	 */
		public int compare(Lecturer student1, Lecturer student2){
			return student1.getName().compareTo(student2.getName());
		}
}

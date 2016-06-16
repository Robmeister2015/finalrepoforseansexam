package genericshierarchyexample;

import java.util.Comparator;

public class IDComparator<T> implements Comparator<Lecturer>{

	/*
	 * Compares the id numbers of two students and returns -1, 0 or 1 based on the comparison 
	 */
	@Override
	public int compare(Lecturer student1, Lecturer student2) {
		
		return student1.getId().compareTo(student2.getId());
	}

}

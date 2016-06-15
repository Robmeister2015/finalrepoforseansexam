package Comparators;

import java.util.Comparator;

public class GPAComparator implements Comparator<Student>{

	public int compare(Student student1, Student student2){
		
		return student1.getGPA().compareTo(student2.getGPA());
	}
}

package Comparators;

import java.util.Arrays;

public class ComparatorTest {

	/*
	 * The comparatorTest is overridden to give a comparison of the users selection
	 */
	
	/*
	 * compareTo returns an int, with 1 meaning the current object is 'greater than' the passed object
	 * returns 0 if the passed object is equal to the caller
	 * returns -1 if the current object < passed object
	 */
	
	/*
	 * New students, where two of them have the same ID
	 * Arranged out of order with regard to the ID
	 */
	public static void main(String[] args){
		
		Student[] students = {
				new Student("0002", "student1", 12.5),
				new Student("0002", "student2", 99.5),
				new Student("0003", "student3", 88.5),
				new Student("0001", "student4", 2.3)
		};
		
		System.out.println("Before sorting by ID: ");
		System.out.println("Student ID \t Name \t GPA");
		System.out.println(Arrays.toString(students));
		
		/*
		 * This detects the object type and searches for a compareTo method, which
		 * has been overridden in Student
		 */
		Arrays.sort(students);
		
		System.out.println("After sorting by ID: ");
		System.out.println("Student ID \t Name \t GPA");
		System.out.println(Arrays.toString(students));
		
		/*
		 * Below we will compare the GPA of the students using a new class for comparison
		 * This one uses GPAComparator, a class I've created for this purpose
		 */
		
		Arrays.sort(students, new GPAComparator());
		System.out.println("After sorting by GPA: ");
		System.out.println("Student ID \t Name \t GPA");
		System.out.println(Arrays.toString(students));
		
		
	}
	
}

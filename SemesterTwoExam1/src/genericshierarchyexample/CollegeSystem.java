package genericshierarchyexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CollegeSystem<T> {

	/*
	 * The main class, includes all methods that deal with sorting, replacing etc.
	 */
	public static void main(String[] args){
		
		/*
		 * List of ? super Lecturer
		 * This means that it can add a Lecturer object or any of its subclasses
		 * It will not allow you to add a College because this is higher in the hierarchy
		 */
		List<? super Lecturer> students = new ArrayList<>();
		
		students.add(new GoodStudent("7", "Johnny", "0874162208"));
		students.add(new GoodStudent("9", "Mary", "0874162208"));
		students.add(new GoodStudent("4", "Seamus", "0874162208"));
		
		students.add(new BadStudent("3", "Hendrick", "0874162208"));
		students.add(new BadStudent("5", "Marcin", "0853399324"));
		students.add(new BadStudent("8", "Shauna", "0872673380"));
		
		students.add(new AverageStudent("1", "Isabella", "0874162208"));
		students.add(new AverageStudent("2", "Derek", "0874162208"));
		students.add(new AverageStudent("6", "Marianna", "0874162208"));
		
		Lecturer lecturer = new Lecturer(102, "Sean Kennedy", students, "0872673380");
		
		List<Lecturer> lecturers = new ArrayList<>();
		lecturers.add(lecturer);
		
		College college = new College("001", lecturers);
		
		/*
		 * Getting the student list from the college lecturer and sending it to the methods
		 */
		sortStudentsById(college.getLecturers().get(0).getStudents());
		sortStudentsByName(college.getLecturers().get(0).getStudents());
		formatStudentPhoneNumber(college.getLecturers().get(0).getStudents());
		
	}
	
	/*
	 * This method sorts students by ID.
	 * Because the ID is a String and the List is parameterised with a generic,
	 * I had to implement my own comparator
	 */
	private static void sortStudentsById(List<? super Lecturer> studentList){
		System.out.println("Students before Sort By ID:");
		for(Object l : studentList){
			System.out.println(l.toString());
		}
		
		System.out.println();
		
		/*
		 * Call collections.sort and pass in the list as well as the comparator object
		 */
		System.out.println("Students after Sort By ID:");
		Collections.sort(studentList, new IDComparator());
		for(Object l : studentList){
			System.out.println(l.toString());
		}
	}
	
	/*
	 * This does the same as the last one, but it sorts based on name rather than ID
	 */
	private static void sortStudentsByName(List<? super Lecturer> studentList){
		System.out.println("Students before Sort By Name:");
		for(Object l : studentList){
			System.out.println(l.toString());
		}
		System.out.println();
		System.out.println("Students after Sort By Name:");
		Collections.sort(studentList, new NameComparator());
		for(Object l : studentList){
			System.out.println(l.toString());
		}
	}
	
	/*
	 * This method cycles through the studentList and formats the phone numbers
	 */
	private static void formatStudentPhoneNumber(List<? super Lecturer> studentList){
		
		/*
		 * This regex says find a word boundary and divide any 10 digit combinations into 3 and 7
		 */
		String phoneNumberRegex = "\\b(\\d{3})(\\d{7})\\b";
		Pattern p = Pattern.compile(phoneNumberRegex);
		
		Iterator<? super Lecturer> studentIter = studentList.iterator();
		while(studentIter.hasNext()){
			Lecturer lecturer = (Lecturer) studentIter.next();
			String phoneNumber = lecturer.getContactNumber();
			Matcher m = p.matcher(phoneNumber);
			while(m.find()){
				//This line sets the contact number with the old number but the first 3 digits are bracketed and a hyphen is placed before the last 7
				lecturer.setContactNumber(m.replaceAll("($1)-$2"));
			}
		}
		System.out.println("Numbers reformatted: ");
		for(Object l : studentList){
			System.out.println(l.toString());
		}
	}
}

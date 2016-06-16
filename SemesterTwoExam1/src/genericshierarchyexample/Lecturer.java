package genericshierarchyexample;

import java.util.Arrays;
import java.util.List;

import Comparators.Student;

public class Lecturer extends College implements Comparable<Lecturer>{

	/*
	 * Lecturer implements Comparable and extends College
	 * It takes a list of students as a constructor parameter
	 * No-args constructor is necessary as there is no super-constructor for the student subclasses otherwise
	 */
	private int module;
	private String name;
	private String contactNumber;
	List<? super Lecturer> students;
	
	public Lecturer(){
		
	}
	
	public Lecturer(int module, String name, List<? super Lecturer> students, String contactNumber){
		this.module = module;
		this.name = name;
		this.students = students;
		this.contactNumber = contactNumber;
	}
	
	public int getModule(){
		return this.module;
	}
	
	public String getName(){
		return this.name;
	}
	
	public List<? super Lecturer> getStudents(){
		return this.students;
	}
	
	public String getContactNumber(){
		return this.contactNumber;
	}
	
	public void setContactNumber(String contactNumber){
		this.contactNumber = contactNumber;
	}
	
	public String toString(){
		return "Module: " + this.module + " Name: " + this.name + "\n" + "Students:\n\t "
				+ Arrays.toString(this.students.toArray());
	}

	@Override
	public int compareTo(Lecturer o) {
		return this.getId().compareTo(o.getId());
	}

}

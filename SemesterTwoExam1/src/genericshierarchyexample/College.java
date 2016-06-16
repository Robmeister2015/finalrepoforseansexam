package genericshierarchyexample;

import java.util.Arrays;
import java.util.List;

public class College {

	/*
	 * The superclass of Lecturer and the 3 Student classes
	 */
	private String collegeId;
	private List<Lecturer> lecturers;
	
	public College(){
		
	}
	
	//Takes a list of Lecturers in it's constructor
	public College(String collegeId, List<Lecturer> lecturers){
		this.collegeId = collegeId;
		this.lecturers = lecturers;
	}
	
	public List<Lecturer> getLecturers(){
		return this.lecturers;
	}
	
	public String getId(){
		return this.collegeId;
	}
	
	@Override
	public String toString(){
		return "College ID: " + this.collegeId + "\nLecturers:\n\t " + Arrays.toString(this.lecturers.toArray());
	}

}

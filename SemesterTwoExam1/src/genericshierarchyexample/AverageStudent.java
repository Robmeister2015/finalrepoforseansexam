package genericshierarchyexample;

public class AverageStudent extends Lecturer implements Comparable<Lecturer>{

	/*
	 * Class for AverageStudent
	 * Identical to other students, and all implement Comparable and extend Lecturer
	 */
	private String id;
	private String name;
	private String contactNumber;
	
	public AverageStudent(String id, String name, String contactNumber){
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
	}
	
	public String getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getContactNumber(){
		return this.contactNumber;
	}
	
	public void setContactNumber(String contactNumber){
		this.contactNumber = contactNumber;
	}
	
	@Override
	public String toString(){
		return "ID: " + this.id + "\tName: " + this.name + "\tPhone Number: " + this.contactNumber;
	}
	
}

package genericshierarchyexample;

public class GoodStudent extends Lecturer implements Comparable<Lecturer>{

	/*
	 * Same as the other students, imoplements Comparable and extends Lecturer
	 */
	private String id;
	private String name;
	private String contactNumber;
	
	public GoodStudent(String id, String name, String contactNumber){
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

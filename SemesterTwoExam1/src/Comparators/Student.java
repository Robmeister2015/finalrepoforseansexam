package Comparators;

public class Student implements Comparable<Student>{

	private String id;
	private String name;
	private Double gpa;
	
	public Student(String id, String name, Double gpa){
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	public String getId(){
		return this.id;
	}
	
	@Override
	public int compareTo(Student student){
		return this.getId().compareTo(student.getId());
	}
	
	@Override
	public String toString(){
		return "\n" + this.id + "\t" + this.name + "\t" + this.gpa;
	}
	
	public boolean equals(Object o){
		return true;
	}
	
	public Double getGPA(){
		return this.gpa;
	}
	
}

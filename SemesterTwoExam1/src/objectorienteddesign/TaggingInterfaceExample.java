package objectorienteddesign;

//Implements TaggingInterface
class Class1 implements TaggingInterface{

	public void test(){
		System.out.println("here in Class 1");
	}
}

//This is an empty interface that will be used to define common parenthood
interface TaggingInterface{
	void test();
}

//Implements TaggingInterface
class Class2 implements TaggingInterface{
	
	public void test(){
		System.out.println("here in Class 2");
	}
}

public class TaggingInterfaceExample{
	
	public static void main(String[] args){
		Class1 class1 = new Class1();
		Class2 class2 = new Class2();
		aMethod(class1);
		aMethod(class2);
	}
	
	//Will implement runtime polymorphism
	static void aMethod(TaggingInterface t){
		t.test();
	}
}
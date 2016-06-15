package advancedclassdesign; 
 
 
 public class NestedClasses { 
 
 
	private int privateOuterInt = 10; 
	 
	public NestedClasses(){ 
		this.privateOuterInt = 10; 
	} 
 	 
	private int getPrivateOuterInt(){
		return privateOuterInt;
	}
	
 	public static void main(String[] args){ 
 	 
 		/* 
 		 * To instantiate a non-static inner-class, create an instance of the outer 
 		 * class and use the syntax <StaticOuter>.<StaticInner><InstanceName>=<InstanceOuter>.<new><StaticInner>(); 
 		 */ 
 		NestedClasses n = new NestedClasses(); 
 		NestedClasses.NestedClassInside innerInstance = n.new NestedClassInside(); 
 		System.out.println(innerInstance.getOuter()); 
 		 
 	} 
 	 
 	class NestedClassInside { 
 		 
 		/*
 		 * Nested classes are always associated with an outer class. See the declaration in main.
 		 */
 		public NestedClassInside(){ 
 		
 		}
 		//This method will return the private value from the outer class
 		private int getOuter(){
 			return privateOuterInt;
 		}
 	} 
 	//Accessing private members of an outer class 
 	 
 } 

package advancedclassdesign; 

 
/* 
 * Only one public class per file is allowed 
 * Because the below class is abstract, it cannot be instantiated  
 */ 

 
abstract class Shape { 
	private int radius; 
 	 
 	public Shape(int radius){ 
 		this.radius = radius; 
 	} 
 	 
 	abstract double area(); 
 	 
 	public int getRadius(){ 
 		return radius; 
 	} 
 } 
 
 
 /* 
  * Because the below class extends the abstract class Shape, it must implement 
  * any abstract methods, such as area 
  */ 
 
 
 public class CircleAbstractExample extends Shape{ 
 
 
 	public CircleAbstractExample(int radius) { 
 		super(radius); 
 	} 
 	 
 	public static void main(String[] args){ 
 		 
 		//This is fine, as it only uses a Shape reference 
 		Shape s = new CircleAbstractExample(5); 
 		System.out.println("Area is: " + s.getRadius()); 
 		// Shape s = new Shape(); Attempting to instantiate the abstract class gives a compilation error 
 	} 
 
 
 	@Override 
 	double area() { 
 		return Math.PI * super.getRadius() * super.getRadius(); 
 	} 
 } 

package advancedclassdesign;

public class CircleAndPointExampleInnerClasses {
	public static void main(String[] args){
		Circle circle = new Circle(10, 10, 12.5);
		System.out.println(circle);
	}
}

class Circle{
	
	private Point centre;
	private double radius;
	
	/*
	 * Takes the points within the circle as its parameters and creates a new Point using these variables
	 * The toString() method then prints both values for circle and point in their entirety
	 */
	
	public Circle(int x, int y, double radius){
		this.centre = new Circle.Point(x, y);
		this.radius = radius;
	}
	
	@Override
	public String toString(){
		return "Radius is: " + this.radius + "\n" + this.centre;
	}
	
	class Point{
		private int x;
		private int y;
		
		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		@Override
		public String toString(){
			return "Points: (" + this.x + ", " + this.y + ")";
		}
	}
}

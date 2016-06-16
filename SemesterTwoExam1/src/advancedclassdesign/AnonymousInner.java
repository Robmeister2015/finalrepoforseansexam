package advancedclassdesign;

public class AnonymousInner {
	
	/*
	 * This method returns an anonymous inner class, a class with no name
	 * THE CLASS HAS NO NAME
	 */
	static Shape2.Colour getDescriptiveColour(Shape2.Colour exampleParameter){
		
		return new Shape2.Colour(){
			
			@Override
			public String toString(){
			return "Your selected colours: " + exampleParameter;
			}
			
		};
		
	}
	
	public static void main(String[] args){
		Shape2.Colour shape = getDescriptiveColour(new Shape2.Colour(255, 0, 0));
		System.out.println(shape);
	}
}

/*
 * Abstract class Shape2, with nested class Colour
 * Colour takes the RGB channels as parameters
 */
abstract class Shape2{
	public static class Colour{
		int m_red, m_green, m_blue;
		
		public Colour(){
			this(0,0,0);
		}
		
		public Colour(int m_red, int m_green, int m_blue){
			this.m_red = m_red;
			this.m_green = m_green;
			this.m_blue = m_blue;
		}
		
		@Override
		public String toString(){
			return "Red: " + m_red + " Green: " + m_green + " Blue: " + m_blue;
		}
	}
}

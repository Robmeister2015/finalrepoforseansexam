package advancedclassdesign;

public class StaticNestedClasses {
	
	private static int num = 10;
	
	/*
	 * The static inner can only access static members of the outer class
	 */
	public static void main(String[] args){
		//Syntax: <StaticOuter>.<StaticInner><name>=<new><StaticOuter>.<StaticInner>)();
		StaticNestedClasses.StaticInner staticInner = new StaticNestedClasses.StaticInner();
	}
	
	static class StaticInner{
		
		public int returnNum(){
			return num;
		}
	}
	
}

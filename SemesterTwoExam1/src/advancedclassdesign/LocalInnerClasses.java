package advancedclassdesign;

public class LocalInnerClasses {

	private int j = 10;
	public static void testLocalInner(){
		int i = 10;
		/*
		 * A local inner class is local to the method or body in which it is declared
		 */

		class LocalClass{
			public int getI(){
				return i;
			}

			//Because the method enclosing this class has been declared static, this method wil not work
			//Otherwise it would be able to access the outer private variable
			//Amazing! Now we know! GI JOE!
			//If you try to change the value of i, the compiler will tell you that i should be declared final
			//This is because the local inner class only gets a copy of the variable
		}
		LocalClass lc = new LocalClass();
		System.out.println(lc.getI());
	}
}

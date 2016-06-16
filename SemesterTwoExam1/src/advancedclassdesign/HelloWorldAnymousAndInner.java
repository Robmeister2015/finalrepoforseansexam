package advancedclassdesign;

public class HelloWorldAnymousAndInner {

	/*
	 * Interface to be implemented by anything that instantiates using it (anonymous inner and local inner)
	 */
	interface HelloWorld {
		public void greet();
		public void greetSomeone(String someone);
	}
	
	/*
	 * Just a method
	 */
	public void sayHello(){
		
		/*
		 * Local inner class that implements HelloWorld and its constituent methods
		 */
		class EnglishGreeting implements HelloWorld {
			String name = "world";

			@Override
			public void greet() {
				greetSomeone("world");
				
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
				
			}
		}
		
		/*
		 * Instance of the local inner class
		 */
		HelloWorld englishGreeting = new EnglishGreeting();
		
		/*
		 * frenchGreeting is an anonymous inner class.
		 * Notice after declaration it opens curly brackets and implements the interface
		 */
		HelloWorld frenchGreeting = new HelloWorld(){
			String name = "tout le monde";

			@Override
			public void greet() {
				greetSomeone("tout le monde");
				
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + name);
				
			}
		};
		
		/*
		 * Another anonymous inner class
		 */
		HelloWorld spanishGreeting = new HelloWorld(){
			String name = "mundo";

			@Override
			public void greet() {
				greetSomeone("mundo");
				
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hola " + name);
				
			}
		};
		
		/*
		 * Calls the various internal methods in the classes
		 */
		englishGreeting.greet();
		frenchGreeting.greetSomeone("Fred");
		spanishGreeting.greet();
	}
	
	public static void main(String[] args){
		HelloWorldAnymousAndInner anonInner = new HelloWorldAnymousAndInner();
		//Call the method that creates the classes
		anonInner.sayHello();
	}
}

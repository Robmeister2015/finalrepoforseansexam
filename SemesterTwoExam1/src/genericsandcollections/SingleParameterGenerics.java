package genericsandcollections;

public class SingleParameterGenerics<T> {
	
	/*
	 * Variable of type 'T' can be anything,
	 *  as you will see in the constructor.
	 *  If you were to remove the T from the class declaration
	 *  T would no longer resolve.
	 */
	
	T val; 
	
	public SingleParameterGenerics(T arg){
		this.val = arg;
	}
}

class SingleParameterGenericsTest{
	public static void main(String[] args){
		/*
		 * Here we create an instance of of SingleParameterGenerics
		 * Giving T a type which cannot change for this object, thus giving
		 * type-safety
		 */
		
		SingleParameterGenerics<Integer> TInteger = new SingleParameterGenerics<Integer>(12); // correct
		SingleParameterGenerics<String> TString = new SingleParameterGenerics<String>("Howya world!"); // also correct
		/*
		 * Compilation error, as TInteger is already declared as type Integer.
		 */
	//	TInteger = new SingleParameterGenerics<String>("Compilation error.");
	
		/*
		 * Another compilation error, because type is Integer.
		 */
//	TInteger = new SingleParameterGenerics<Integer>("Can it take a String?");	
		
		
	}
}
package genericsandcollections;

public class MultiParameterGenerics<T1, T2>{
	T1 val1;
	T2 val2;
	
	/*
	 * This class can take two generic parameters. These parameters do not need to match. 
	 */
	
	public MultiParameterGenerics(T1 first, T2 second){
		this.val1 = first;
		this.val2 = second;
	}
	
	public T1 getFirst(){
		return val1;
	}
	
	public T2 getSecond(){
		return val2;
	}
}

class MakeMultiParameterGenerics{
	
	public static void main(String[] args){
		MultiParameterGenerics<String, Integer> stringyInt = new MultiParameterGenerics<String, Integer>("France", 2016);
		System.out.println("Euro " + stringyInt.getSecond() + " takes place in " + stringyInt.getFirst() + " this year.");
		
		/*
		 * As before, the parameters must match on both sides and be in the same order. Anything else will deliver a compilation error.
		 */
	}
}
package advancedclassdesign;

public class EnumExample {

	CarType carType;
	
	public EnumExample(CarType c){
		this.carType = c;
	}
	
	public void enumTest(){
		switch(carType){
		case AUDI:
			System.out.println("Vorsprung Durch Technik");
			break;
		case CHEVROLET:
			System.out.println("Detroit Motor City");
			break;
		case MERCEDES:
			System.out.println("We're German Like");
			break;
		}
	}
	
	public static void main(String[] args){
		EnumExample e = new EnumExample(CarType.CHEVROLET);
		e.enumTest();
	}
}

enum CarType{
	AUDI(10000), CHEVROLET(15000), MERCEDES(20000);
	
	private int price;
	
	CarType(int price){
		this.price = price;
	}
	
	public int getPrice(){
		return this.price;
	}
}

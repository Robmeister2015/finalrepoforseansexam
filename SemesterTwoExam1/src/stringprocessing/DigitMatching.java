package stringprocessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * This class uses Seáns ZipCode example for picking out digits
 */
public class DigitMatching {

	public static void main(String[] args){
		String str = "Danny Doo, Hugo-city 56010, Ph: 9876543210. Maggi Myer, "
				+ "Big Bank City 56000, ph: 9876501234.";
		Pattern pattern = Pattern.compile("\\d{5}"); //Checks that the number is at least 5 long and is all digits between 0 and 9
		Matcher m = pattern.matcher(str);
		
		while(m.find()){
			System.out.println(m.group()); //This is a problem, as it will find all sequences containing 5 digits
										   //including the sections of the phone number
		}
		
		//To find 5 digits on their own, we use the below regular expression
		pattern = Pattern.compile("\\D\\d{5}\\D");
		m = pattern.matcher(str);
		while(m.find()){
			System.out.println(m.group());
		}
		
		//To find the 5 digits using word boundaries which will cut out the space and the apostrophe
		pattern = Pattern.compile("\\b\\d{5}\\b");
		m = pattern.matcher(str);
		while(m.find()){
			System.out.println(m.group());
		}
		
		//To find 'embedded' 5 digit sequences, i.e, those not surrounded by word boundaries
		pattern = Pattern.compile("\\B\\d{5}\\B");
		m = pattern.matcher(str);
		while(m.find()){
			System.out.println(m.group());
		}
		
		pattern = Pattern.compile("\\b[ytic]");
		m = pattern.matcher(str);
		while(m.find()){
			System.out.println(m.group());
		}
		
		pattern = Pattern.compile("x?+");
		m = pattern.matcher("xx");
		while(m.find()){
			System.out.println(m.group());
		}
	}
}
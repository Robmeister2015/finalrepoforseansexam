package stringprocessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greediness {

	public static void main(String[] args){
		String t = "Longlonglong ago, in a galaxy far far away.";
		
		//This pattern is greedy (default)
		Pattern p1 = Pattern.compile(".*foo");
		Matcher m = p1.matcher("xfooxxxxxxfoo");
		
		while(m.find()){
			System.out.println("Greedy: " + m.group());
		}
		
		//This pattern is reluctant
		p1 = Pattern.compile(".*?foo");
		m = p1.matcher("xfooxxxxxxfoo");
		while(m.find()){
			System.out.println("Reluctant: " + m.group());
		}
		
		p1 = Pattern.compile(".*+foo");
		m = p1.matcher("xfooxxxxxxfoo");
		while(m.find()){
			System.out.println("Possessive: " + m.group());
		}
	}
}

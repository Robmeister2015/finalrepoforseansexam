package stringprocessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	//Find a, b or c
	String findABOrCRegex = "[abc]";
	//Find everything EXCEPT a, b or c
	String findAllButABOrC = "[^abc]";
	//Find all letters regardless of case used
	String insensitiveCaseSearch = "[a-zA-Z]";
	//Find a-d (abcd) or m-p (mnop)
	String findABCDOrMNOP = "[a-d[m-p]]";
	//Intersection of a-z and d, e or f
	String findIntersectionWithDEF = "[a-z&&[def]]";
	//a-z but not bc
	String findAllExceptBAndC = "[a-z&&[^bc]]";
	//a-z but not m-p
	String findAllExceptMNOP = "[a-z&&[^m-p]]";
	
	//Things contained in the Pattern API
	//Places where a double backslash appears is to escape a backslash, as backslash has a special meaning in Java
	//Match any character
	String matchAny = ".";
	
	//Match a digit 1-9
	String matchADigit = "\\d";
	//Match a non-digit
	String notANumber = "\\D";
	//Match a whitespace
	String whitespaceMatcher = "\\s";
	//Match not a whitespace
	String notAWhitespace = "\\S";
	//Match a word character
	String word = "\\w";
	//Match a non-word character
	String notAWord = "\\W";
	
	//Quantifiers
	//Match something once or not at all
	String matchOnceOrNotAtAll = "X?";
	//Match something 0 or more times
	String zeroOrMoreTimes = "X*";
	//Match something one or more times
	String oneOrMoreTimes = "X+";
	//Match something exactly n times
	String exactlyNTimes = "X{n}";
	//Match something at least n times
	String atLeastNTimes = "X{n,}";
	//Set max and min times
	String maximumAndMinimumNumberOfTimes = "X{n,o}";
	
	//Boundary matchers
	//Beginning of line
	String beginningOfLine = "^";
	//End of line
	String endOfLine = "$";
	//Word boundary
	String wordBoundary = "\\b";
	//Non word boundary
	String nonWordBoundary = "\\B";
	//The beginning of the input
	String inputBeginning = "\\A";
	//The end of the previous match
	String endOfPreviousMatch = "\\G";
	//End of input before final terminator
	String finalTerminator = "\\Z";
	//End of input
	String endOfInput = "\\z";
	
	/*
	 * Now we experiment with things.
	 */
	private static String testString = "Joe Bloggs, 11 Main Street, Athlone, Co. Westmeath.";
	
	public static void main(String[] args){
		Pattern pattern = Pattern.compile("\\w+"); //Breaks string into words, using word boundaries
		Matcher m = pattern.matcher(testString);
		while(m.find()){
			System.out.println(m.group());
		}
		
		pattern = Pattern.compile("a*b"); 
		m = pattern.matcher("aaaab"); //Returns true (0-many a's followed by one and only one b
		System.out.println(m.matches());
		
		m = pattern.matcher("aaaaxb");
		System.out.println(m.matches()); //Returns false, as there is an x in there
		
		m = pattern.matcher("aaaabxsf");
		System.out.println(m.lookingAt()); //Returns true because it does not require the entire region to match
	}
}

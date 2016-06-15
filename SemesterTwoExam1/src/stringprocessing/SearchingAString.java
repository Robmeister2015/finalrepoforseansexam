package stringprocessing;

public class SearchingAString {

	/*
	 * Printing the index of a particular letter in a String. This only prints the first occurence
	 */
	
	static String javaCertification = "Java Certification";
	
	public static void main(String[] args){
		//Finds capital C
		System.out.println("C occurs at " + javaCertification.indexOf("C"));
		
		//Finds lower case C
		System.out.println("c occurs at " + javaCertification.indexOf("c"));
		
		//Index printed is the beginning of the word
		System.out.println("Certification occurs at " + javaCertification.indexOf("Certification"));
		
		//Returns -1 because the string doesn't exist
		System.out.println("Gobble occurs at " + javaCertification.indexOf("Gobble"));
		
		//To continue searching, we can set a second parameter which specifies where to search from
		System.out.println("Second occurence of a: " + javaCertification.indexOf("a", 2));
		
		//Loop a search, finding all occurences of something
		int fromIndex = 0;
		
		while(javaCertification.indexOf("a", fromIndex) > -1){
			System.out.println("a occurs at " + javaCertification.indexOf("a", fromIndex));
			System.out.println(fromIndex);
			fromIndex = javaCertification.indexOf("a", fromIndex);
			fromIndex ++;
		}
		
		//Searching from the end
		System.out.println("Last occurence of a is " + javaCertification.lastIndexOf("a"));
		
		//Searching for all occurences of a from end to start
		fromIndex = javaCertification.length();
		
		while(javaCertification.lastIndexOf("a", fromIndex) > -1){
			System.out.println("a occurs at " + javaCertification.lastIndexOf("a", fromIndex));
			fromIndex = javaCertification.lastIndexOf("a", fromIndex);
			fromIndex --;
		}
		
		//Using startsWith to see if a string begins with a given string
		if(javaCertification.startsWith("J") && javaCertification.endsWith("n")){
			System.out.println("Java Certification starts with J and ends with n");
		}
		
		//Matching a region in a String
		String chat = "Oscar: I can quip on any subject. John: The Queen?. Oscar: The Queen is not a subject!";
		String matchString = " John: The Queen?.";
		
		int startIndex = chat.indexOf(".");
		System.out.println("Johns portion begins at: " + startIndex);
		if(startIndex > -1){
			boolean doesMatch = chat.regionMatches(startIndex + 1, matchString, 0, matchString.length());
			if(doesMatch){
				System.out.println("Johns response was found: " + matchString);
			}
		}
	}
}

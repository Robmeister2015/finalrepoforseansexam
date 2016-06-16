package stringprocessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModifyingStringsWithRegex {

	public static void main(String[] args) {

		//We will break this email address into its constituent parts
		String emailToParse = "joe.bloggs@example.com";

		/*
		 * The below pattern says we are looking for a non-space character all the way to a dot, then a non-space character all the way to an @
		 * And then everything thats left
		 * This is done using groups, which are separated by parentheses
		 */
		Pattern emailPattern = Pattern.compile("(\\S+)\\.(\\S+)@(\\S+)");
		Matcher emailMatcher = emailPattern.matcher(emailToParse);
		while (emailMatcher.find()) {
			System.out.println(emailMatcher.group(1));
			System.out.println(emailMatcher.group(2));
			System.out.println(emailMatcher.group(3));
		}
String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, "
+ "Near Huge Milestone, Hugo-city 56010, Ph: 0876543210, "
		+ "Email: danny@myworld.com. Maggi Myer, Post bag no 52, "
+ "Big bank post office, , Big bank city 56000, "
		+ "ph: 0876501234, Email: maggi07@myuniverse.com.";

/*
 * The below regex says we want a non-digit boundart followed by 3 digits, followed by 7 digits followed by a non-digit boundary
 * Essentially, a ten digit number for a mobile phone
 */
Pattern pattern = Pattern.compile("(\\D)(\\d{3})(\\d{7})(\\D)");
Matcher matcher = pattern.matcher(str);

/*
 * Here, we change the number. We wrap group two in brackets and place a hyphen and then append groups three and four
 */
String newStr = matcher.replaceAll("$1($2)-$3$4");
System.out.println(newStr);

/*
 * Searches for word boundary, followed by @, followed by word boundary, followed by .com
 */
pattern = Pattern.compile("\\w+@\\w+\\.com");
matcher = pattern.matcher(str);
while(matcher.find()){
System.out.println(matcher.group());
}

/*
 * Back referencing allows you to check that something is duplicated
 * The regex below ensures that the first two characters match the second two
 */

pattern = Pattern.compile("(\\d\\d)\\1");
matcher = pattern.matcher("1212");

while(matcher.find()){
	System.out.println(matcher.group(0));
}

/*
 * This regex says word boundary, followed by 25 and any digit 0-5, or 2 with any digit 0-4 followed by any digit or
 * 0 followed by any two digits 1-9, ending in a dot, with this pattern followed 3 times
 * Then it specifies that the last line follow the same pattern but without the dot
 */
String regexForIp = "\\b((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\.)){3}"
		+ "\\b(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)";

String ip = "255.245.188.123";

System.out.println(ip.matches(regexForIp));
	}
	

	}

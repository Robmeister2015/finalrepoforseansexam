package stringprocessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModifyingStringsWithRegex {

	public static void main(String[] args) {

		String emailToParse = "joe.bloggs@example.com";

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

Pattern pattern = Pattern.compile("(\\D)(\\d{3})(\\d{7})(\\D)");
Matcher matcher = pattern.matcher(str);
String newStr = matcher.replaceAll("$1($2)-$3$4");
System.out.println(newStr);
	}
}

package strings;

import java.util.Arrays;

/*
 * Topic: Important Java String Methods
 *
 * Description:
 * This program demonstrates commonly used Java String methods that are
 * frequently asked in SDET/Automation Testing interviews.
 *
 * Covered Methods:
 * 1. equals() and equalsIgnoreCase()
 * 2. length()
 * 3. trim()
 * 4. toLowerCase() and toUpperCase()
 * 5. concat()
 * 6. charAt()
 * 7. contains()
 * 8. isEmpty()
 * 9. substring()
 * 10. replace()
 * 11. indexOf() and lastIndexOf()
 * 12. split()
 *
 * Real-Time Usage:
 * String methods are heavily used in:
 * - Selenium validation
 * - API response validation
 * - Test data handling
 * - Dynamic locator handling
 * - Log and report processing
 *
 * 
 */

public class StringMethods {

	public static void main(String[] args) {

		String name = "Java";
		String name1 = "java";

		// hashCode()
		// Generates unique integer value for the String object
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());

		// == operator
		// Checks reference memory location
		System.out.println(name == name1);

		// equals()
		// Checks exact content match
		System.out.println(name.equals(name1));

		// equalsIgnoreCase()
		// Ignores uppercase/lowercase while comparing
		System.out.println(name.equalsIgnoreCase(name1));

		// length()
		// Returns total number of characters
		System.out.println(name.length());

		// trim()
		// Removes leading and trailing spaces
		String data = "   Java   ";
		System.out.println(data.trim());

		// toLowerCase() and toUpperCase()
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());

		// concat()
		// Combines two strings
		System.out.println(name.concat("Script"));

		// charAt()
		// Returns character based on index
		System.out.println(name.charAt(3));

		// contains()
		// Checks whether substring exists
		System.out.println(name.contains("Jav"));
		System.out.println(name.contains("Jva"));

		// isEmpty()
		// Checks whether string is empty
		String emptyData = "";
		System.out.println(emptyData.isEmpty());

		// substring()
		// Extracts part of a string
		String sentence = "Hello World";
		String result = sentence.substring(0, 5);
		System.out.println(result);

		// replace()
		// Replaces characters or words
		String replacedData = sentence.replace('l', 'L');
		System.out.println(replacedData);

		// indexOf() and lastIndexOf()
		// Finds character position
		System.out.println(sentence.indexOf('o'));
		System.out.println(sentence.lastIndexOf('o'));

		// split()
		// Splits string into multiple parts

		String sentence1 = "Hi how are you ?";

		String[] words = sentence1.split(" ");

		for (String word : words) {

			System.out.println(word);
		}

		System.out.println(Arrays.toString(words));

	}

}
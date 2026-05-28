package strings;

/**
 * Class Name: StringBufferMethods
 * 
 * Description: This class demonstrates commonly used methods of String and
 * StringBuffer in Java with examples.
 * 
 * Topics Covered: 1. length() 2. concat() / append() 3. charAt() 4. indexOf()
 * 5. lastIndexOf() 6. isEmpty() 7. reverse() 8. insert() 9. deleteCharAt() 10.
 * delete() 11. replace() 12. capacity()
 * 
 */

public class StringBufferMethods {

	public static void main(String[] args) {

		/*
		 * String belongs to java.lang package
		 */

		// Created inside String Constant Pool (Intern Pool)
		String str = "Hello world";

		// Created inside Heap Memory
		String name = new String("Hello world");

		/*
		 * StringBuffer belongs to java.lang package
		 */

		// Created inside Heap Memory
		StringBuffer sb = new StringBuffer("Hello world");

		// ------------------------------------------------------------
		// length()
		// ------------------------------------------------------------
		System.out.println("===== length() =====");
		System.out.println(str.length());
		System.out.println(sb.length());

		// ------------------------------------------------------------
		// concat() and append()
		// ------------------------------------------------------------
		System.out.println("\n===== concat() / append() =====");

		// String concat()
		System.out.println(str.concat("123"));

		// String concatenation using +
		System.out.println(str + "123");

		// StringBuffer append()
		System.out.println(sb.append(123));

		// ------------------------------------------------------------
		// charAt()
		// ------------------------------------------------------------
		System.out.println("\n===== charAt() =====");
		System.out.println(str.charAt(0));
		System.out.println(sb.charAt(0));

		// ------------------------------------------------------------
		// indexOf()
		// ------------------------------------------------------------
		System.out.println("\n===== indexOf() =====");

		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf("ello"));

		// StringBuffer supports only String argument
		System.out.println(sb.indexOf("e"));

		// The below line gives compilation error
		// System.out.println(sb.indexOf('e'));

		System.out.println(sb.indexOf("ello"));

		// ------------------------------------------------------------
		// lastIndexOf()
		// ------------------------------------------------------------
		System.out.println("\n===== lastIndexOf() =====");

		System.out.println(str.lastIndexOf('l'));
		System.out.println(sb.lastIndexOf("l"));

		// ------------------------------------------------------------
		// isEmpty()
		// ------------------------------------------------------------
		System.out.println("\n===== isEmpty() =====");

		System.out.println(str.isEmpty());
		System.out.println(sb.isEmpty());

		// ------------------------------------------------------------
		// reverse()
		// ------------------------------------------------------------
		System.out.println("\n===== reverse() =====");

		System.out.println(sb.reverse());

		// ------------------------------------------------------------
		// insert()
		// ------------------------------------------------------------
		System.out.println("\n===== insert() =====");

		System.out.println(sb.insert(14, " Java"));

		// ------------------------------------------------------------
		// deleteCharAt() and delete()
		// ------------------------------------------------------------
		System.out.println("\n===== deleteCharAt() / delete() =====");

		System.out.println(sb.deleteCharAt(0));
		System.out.println(sb.delete(0, 8));

		// ------------------------------------------------------------
		// replace()
		// ------------------------------------------------------------
		System.out.println("\n===== replace() =====");

		System.out.println(sb.replace(0, 5, "Hello"));

		// ------------------------------------------------------------
		// capacity()
		// ------------------------------------------------------------
		System.out.println("\n===== capacity() =====");

		/*
		 * Formula: New Capacity = (Old Capacity * 2) + 2
		 */

		StringBuffer sb2 = new StringBuffer();

		// Default capacity is 16
		System.out.println(sb2.capacity());

		// Current length
		System.out.println(sb.length());

		// Current capacity
		System.out.println(sb.capacity());
	}
}
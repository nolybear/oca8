/**
 * Copyright © 2019 Lhasa Limited
 * File created: 14 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

/**
 * @author Mark Nolan
 * @since 14 Jan 2020
 */
public class StringMethods
{
	static String string = "animals";
	//technically has an index from 0(a) to 7 (end of string), not 6 (which is s)
	public static void main(String[] args)
	{
		//counting starts from 1, indexes start from 0
		length();
		charAt();
		indexof();
		subString();
		toLowerandUpperCase();
		equalsAndIgnoreCase();
		startsWithEndsWith();
		contains();
		replace();
		trim();
	}

	private static void trim()
	{
		//removes whitespace from start and end of string
		System.out.println("\t    a b c \n".trim()); //a b c
	}

	private static void replace()
	{
//two method types, passs in just char:
		System.out.println("abcabc".replace('a','A'));
		//pass in charsequence - represents several classes (including String and String builder):
		System.out.println("abcabc".replace("a","A"));
	}

	private static void contains()
	{
		// boolean, case sensitive
		System.out.println("abc".contains("b"));

	}

	private static void equalsAndIgnoreCase()
	{
		//returns boolean
		System.out.println("abc".equals("ABC")); //false
		System.out.println("ABC".equals("ABC")); //true
		System.out.println("abc".equalsIgnoreCase("ABC"));//true

	}

	private static void startsWithEndsWith()
	{
		//returns boolean, case sensitive
		System.out.println("abc".startsWith("a")); //true
		System.out.println("abc".endsWith("C")); //false

	}

	private static void toLowerandUpperCase()
	{
		System.out.println(string.toLowerCase());
		System.out.println(string.toUpperCase());
		//remember string is immutable - orginal string will remain the same
	}

	private static void subString()
	{
		System.out.println(string.substring(3));
		System.out.println(string.substring(string.indexOf('m')));
		System.out.println(string.substring(3,4)); //start with 3, but not including but up to index 4
		System.out.println(string.substring(3,7));

		System.out.println(string.substring(3,3)); //empty as start and end at 3
//		System.out.println(string.substring(3,8)); will throw exception

	}

	private static void charAt()
	{
		System.out.println(string.charAt(0)); //returns char
		//		System.out.println(string.charAt(8)); throws exception as out of range
	}

	private static void length()
	{
		System.out.println(string.length()); //return int
	}

	public static void indexof()
	{
	//	returns int
		System.out.println(string.indexOf('a'));
		System.out.println(string.indexOf("al"));
		System.out.println(string.indexOf('a',4)); //from index-look from point 4
		System.out.println(string.indexOf("al",5)); //-1 when no match found
	}


}
/* ---------------------------------------------------------------------*
 * This software is the confidential and proprietary
 * information of Lhasa Limited
 * Granary Wharf House, 2 Canal Wharf, Leeds, LS11 5PS
 * ---
 * No part of this confidential information shall be disclosed
 * and it shall be used only in accordance with the terms of a
 * written license agreement entered into by holder of the information
 * with LHASA Ltd.
 * --------------------------------------------------------------------- */

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
public class Equality
{
	public static void main(String[] args)
	{
		//== do they refer to same object?
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append('a');
		System.out.println(one == three); //true as same object
		System.out.println(one == two); //false as different objects

		//String literals are pooled
		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x==y);//true as x and y point to same location in memory
		String z = " Hello World".trim(); //this produces "Hello World"
		System.out.println(x==z); //false as z is computed at run time. as it isnt the same at compile time, a new string obeect is created

		String xx = new String("Hello World");
		System.out.println(xx=y); //false as specified new string object.
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

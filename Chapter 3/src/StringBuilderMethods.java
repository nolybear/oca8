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
public class StringBuilderMethods
{
	static StringBuilder sb = new StringBuilder("animals");
	public static void main(String[] args)
	{
		SameAsStringMethods();
		append();
		insert();
		deleteAndDeleteCharAt();
		reverse();
		toStringMethod();
	}

	private static void toStringMethod()
	{
		sb.toString(); //converts sb to string
	}

	private static void reverse()
	{
		sb.reverse();//does what it says
	}

	private static void deleteAndDeleteCharAt()
	{
	sb.deleteCharAt(5);//will throw exception if out of bounds
	sb.delete(1,3);
	}

	private static void insert()
	{
		sb.insert(4,"-"); //will insert at 4 place, changes indexes e.g. if sb was animals, would now be ani-mals
	}

	private static void append()
	{
		//can append a variety of different data types
		System.out.println(sb.append(1).append(true));
	}

	private static void SameAsStringMethods()
	{
		String sub = sb.substring(sb.indexOf("a"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(String.format("%S %S %S",sub,len,ch));
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

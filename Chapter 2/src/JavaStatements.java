/**
 * Copyright © 2019 Lhasa Limited
 * File created: 10 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

import java.time.DayOfWeek;

/**
 * @author Mark Nolan
 * @since 10 Jan 2020
 */
public class JavaStatements
{
	public static void main(String[] args)
	{
		ifstatments();
		ifelsestatements(9);
		//what if 6?
		switchStatements(5);
		infiniteloop2();
	}

	static void ifstatments()
	{
		//if no brackets, will run first statement (change boolean and see)
		if (true)
			System.out.println("this is part of the if statement");
		System.out.println("this is not and will always run");
	}

	static void ifelsestatements(int hourOfDay)
	{
		//this will keep going until it hits a branch
		if (hourOfDay < 15)
		{
			System.out.println("Good afternoon");
		}
		else if (hourOfDay < 11)
		{
			System.out.println("Good Morning"); //unreachable code - if its less than 11, its less that 15, so will evaluate to true in first statement
		}
		else
		{
			System.out.println("Good Evening");
		}

		// be wary of = vs ==
	}

	static void TernaryOperators()
	{
		//data type do not need to be the same, but does depends on assignment operators
		System.out.println((true) ? 21 : "Zebra");
		//		int animal = (true) ? 9 : "Horse"; - does not compile
		int x = 5;
		System.out.println(x>2 ? x < 4 ? 10 : 8 : 7);
		//this is valid - add brackets to help with clarity:
		System.out.println(x>2 ? (x < 4? 10:8) : 7);
		//check if 1st expression is correct (x>2 is indeed true) so can focus on true statement:
		System.out.println(x < 4 ? 10 : 8);
		//now just normal calculation :)
	}

	static void switchStatements(int dayofWeek)
	{
		//default is optional - if present, will match that value if none other match

		// if default is not there, will skip the switch statement
		//boolean and long not supported by switch

		switch (dayofWeek)
		{
			case 0:
				System.out.println("Sunday");
				//without break, would hit a particular case (or default, would then execute rest until it hits a break elsewhere
			default: //location is not important
				System.out.println("Weekday");
			case 6:
				System.out.println("Saturday");
				break;
		}
	}

	;

	private int getSortOrder(String firstName, final String lastName)
	{
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		switch (firstName)
		{
			case "Test":
				return 52;
//			case middleName:
//				id = 5;
//				break;
			// wont compile - not a final variable (even if known)
			case suffix:
				id = 0;
				break;
//			case lastName:
//				id = 8;
//				break;
			// wont compile - not a constant (as it is passed in via the function
//			case 5:
//				id = 7;
//				break;
//			case 'J':
//				id = 10;
//				break;
//			case DayOfWeek.SUNDAY:
//				id = 15;
//				break;
			//these three wont compile - wrong case type
		}
		return id;

		}

	public void DoWhile()
	{
		int x = 0;
		do  x++; //brackets optional for single statement
		while (false);
		// diff to while, as will always excute do block even if while exits.
		System.out.println(x);
	}

	public void forStatement()
	{
		//for(initialization; booleanExpression; updateStatement)
		//{
		// again brackets optional for single statement
		//}

		for (int i = 0; i < 10; i++)
			System.out.println(i + "");
	}
	public void infiniteloop()
	{
		for (; ; )
		{
			System.out.println("Hello World");
			//infinte loop - components of for loop are optional (but still neeed ; to separate sections)
		}
	}

	public static void infiniteloop2()
	{
		for (int i=0; i<10; )
		{
			i = i++;
			int ii = i;
			//as this is post, the orignal value is returned, then the operand applied
			//e.g i = 0;
			System.out.println(i);
			System.out.println("Hello World");
		}
	}
	public void anotherforloop()
	{
		int x = 0;
		//can declare variable before loop and use it
		for (long y = 0, z = 4; x < 5 && y < 10; x++, y++)
		// can use variables (z) that do not reference each other
			// can update mltiple variables
		{
			System.out.println(y + "");
		}
		System.out.println(x);
	}

	public void redeclaringVariables()
	{
		int x = 0;
		//can declare variable before loop and use it
//		for (long y = 0, x = 4; x < 5 && y < 10; x++, y++)
		// cant redeclare a variable (x) in initalization block (duplicate variable declaration)
		// using comma - assumes you are declaring x
		// can do the following to fix it:
		long y = 10;
		for(y=0,x=4;x<5 && y < 10; x++, y++)
		// now assigning value rather than declaring it (basically - are all variables declared beforehand or not for init block)
		{
			System.out.println(y + "");
		}
		System.out.println(x);

	}

	public void datatypes()
	{
//		for(long y=0, int x=4;x<5 && y < 10; x++, y++)
		// init block - wont compile, needs to be same type
		{
//			System.out.println(y + "");
		}
	}

	public void LoopVariables()
	{

		for(long y=0,x=4;x<5 && y < 10; x++, y++)
		// now assigning value rather than declaring it (basically - are all variables declared beforehand or not for init block)
		{
			System.out.println(y + "");
		}
//		System.out.println(x); - x defined in init block ONLY - will throw error if used outside

	}

	public void forEachStatements()
	{
		// for (datatype instance: collection)
		//collection - lists and arraylists for exam
		// any other type for collection (e.g. string) - wont compile
		// datatype - e.g int name: names (assume names is list, wont compile as  wrong type)
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

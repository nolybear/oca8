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
public class StringBuilderExamples
{
	public static void main(String[] args)
	{
		StringBuilderVsString();
		CreatingStringBuilder();
	}

	private static void CreatingStringBuilder()
	{
		StringBuilder sb1 = new StringBuilder(); //empty sequence of characters
		StringBuilder sb2 = new StringBuilder("animal"); //create SB with with specific value
		StringBuilder sb3 = new StringBuilder(10); //tell sb to reserve certain number of slots for characters
	}

	private static void StringBuilderVsString()
	{
		String alpha = "";
		for(char current = 'a';current<='z';current++)
			//each iteration creates a new string object and other one becomes eligble for gc (e.g. "abc" created, "ab" deleted)
			alpha += current;
		System.out.println(alpha);

		StringBuilder beta = new StringBuilder();
		for(char current1 = 'a';current1<='z';current1++)
			//adds a charcter to the stringbuilder object - only one object created
			beta.append(current1);
		System.out.println(beta);

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

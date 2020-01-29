/**
 * Copyright © 2019 Lhasa Limited
 * File created: 29 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

/**
 * @author Mark Nolan
 * @since 29 Jan 2020
 */
public class PassingData
{
	public static void main(String[] args)
	{
		String name = "Webby";
		speak(name);
		System.out.println(name); //returns webby and not sparky - java makes a copy of variable and method recives copy
		//assignments made in method do not affect caller

		StringBuilder name1 = new StringBuilder();
		speak(name1);
		System.out.println(name1); //in this case, both name1 and s refer to same object
		// calls a method on the parameter, rather than trying to change the variable itself

	}

	public static void speak (String name)
	{
		name = "sparky";
	}

	public static void speak (StringBuilder s)
	{
		s.append("Webby");
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

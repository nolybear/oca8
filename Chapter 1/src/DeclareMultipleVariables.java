/**
 * Copyright © 2019 Lhasa Limited
 * File created: 19 Dec 2019 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

/**
 * @author Davide Capomagi
 * @since 19 Dec 2019
 */
public class DeclareMultipleVariables
{
	String s1,s2;
	String s3 = "yes", s4 = "no";
	int i1, i2, i3=0;
	//how many are declared, how many initalized?

//	int num, String value; - wont compile

	// ,- a little declaration of its own - still the same statement
	// ; = seperates statements

//	double d1, double d2; - not valid

	public static void identifers()
	{
		//rules (if // then invalid)
		int abc, $abc, _abc;
		//above are valid, start with letter, $ or _
//		int a@c, b*c - only valid characters from above allowed
		int a6;
//		int 6a; - cant start with number
//		int class, abstract, boolean - reserved words
		int Class, Abstract, Boolean;
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

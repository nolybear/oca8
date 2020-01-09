/**
 * Copyright © 2019 Lhasa Limited
 * File created: 09 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

/**
 * @author Mark Nolan
 * @since 09 Jan 2020
 */
public class AssignmentOperators
{
	public static void casting()
	{
		//use casting when going from larger to smaller data type, or coverting from FP to int value
	//error when converting from larger to smaller data types
	int x = (int)1.0;
	//outside range of values
	short y = (short)1921222;
	//floating point value for whole value type
	int z = (int)9f;
	//intepret linter as an init
	long t = 192301398193L;

	// essentially telling the compiler to ignore default behaviour e.g.
	short a = 10;
	short b = 3;
	int c = a*b;
	//default is to promote small values to int, but casting ignores this:
		short d = (short)(a*b);
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

/**
 * Copyright © 2019 Lhasa Limited
 * File created: 29 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

import java.util.ArrayList;

/**
 * @author Mark Nolan
 * @since 29 Jan 2020
 */
public class StaticVariables
{
	private static int counter = 0;
	private static final ArrayList<String> values = new ArrayList<>(); //final and cannot change
	private static final int righto;
	private static final int nighto = 3;
	private static int blah;
//	private static final int haha; wont compile unless iniilazed


	//static inilisation - runs when the class is first use
	static {

		blah = 33;
		blah = 44; // not final so can edit it as many times
		righto = 99; //can reassign final variable as the static init is first assignment and occurs upfront
//		nighto = 4; //wont compile as this is the second attempt to initilize it
	}


	public static void main(String[] args)
	{
		ArrayList<String> newValue = new ArrayList<>();
//		values = newValue;
	values.add("blah"); // we can't change values, but as it is a reference variable, we can call methods
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

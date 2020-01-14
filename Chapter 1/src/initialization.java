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
public class initialization
//fields and instance initalisation block (iib) are run in order in which they appear
	// constructur runs after all fields and iib have run
{
	public initialization() //constructor
	{
		number = 5;
	}

	public static void main(String[] args)
	{
		initialization foo = new initialization();
		System.out.println(foo.number);
	}

	private int number = 3; //field
	{number = 4; }} //initalisation block
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

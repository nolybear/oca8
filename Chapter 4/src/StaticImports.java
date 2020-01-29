/**
 * Copyright © 2019 Lhasa Limited
 * File created: 29 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

import java.util.Arrays; //import A
//import static java.util.Arrays; cant use static to import class, just static members/methods etc.
//static import - has to be import static

import java.util.List;
import static java.util.Arrays.asList; //import B

/**
 * @author Mark Nolan
 * @since 29 Jan 2020
 */
public class StaticImports
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("one","two"); //import arrays class, then access method via arrays
		List<String> list1 = asList("one","two"); //static import of method;

		//be careful - if B is imported but not A - list would not be valid
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

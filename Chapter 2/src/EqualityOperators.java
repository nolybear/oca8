/**
 * Copyright © 2019 Lhasa Limited
 * File created: 09 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

import java.io.File;

/**
 * @author Mark Nolan
 * @since 09 Jan 2020
 */
public class EqualityOperators
{
	public static void main(String[] args)
	{
		//== equals operator
		System.out.println(5==5.0);//returns true as int promoted to double
		//compare boolen values
		System.out.println(true==false);
		//compare objects including null and string
		System.out.println("boo"=="boo");
		//cant mix and match types e.g.
//		System.out.println(true=="boo");

		File x = new File("myFile.txt");
		File y = new File("myFile.txt");
		File z = x;
		System.out.println(x == y); //references only equal if both point to null or are the same object
		System.out.println(x == z);
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

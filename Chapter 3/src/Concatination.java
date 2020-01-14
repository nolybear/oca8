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
public class Concatination
{
	public static void main(String[] args)
	{
		Concat();
	}

	private static void Concat()
	{
		//if both numeric, + is numeric additon
		System.out.println(1+2);
		System.out.println("1"+"2");
		//if either operand is a string, + means concationation
		System.out.println("a" + "b" + 2);
		//expression evaluated L -> R, as 1 and 2 are numeric it does that first, then does the concat
		System.out.println(1+2+"c");
		//s += "2" same as s = s + 2
		String s = "1";
		s += "2";
		s += 3;
		System.out.println(s);
	}

	public void immutable()
	{
		String s = "name";
		//immutable - cant be made larger or smaller, and change one of the characters in it
		String name = new String("Fluffy"); //know that this is allowed
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

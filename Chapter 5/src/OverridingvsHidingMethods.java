/**
 * Copyright © 2019 Lhasa Limited
 * File created: 12 Feb 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

/**
 * @author Mark Nolan
 * @since 12 Feb 2020
 */
public class OverridingvsHidingMethods
{
	// isBiped - if static present is hiding method, if not, then we are hiding, change it and work out why the ouput is different?
	static class Dog
	{
		public static boolean isBiped()
		{
			return false;
		}

		public void getDogDescription()
		{
			System.out.println("Dog has two legs: "+ isBiped());
		}
	}

	static class Human extends Dog
	{
		public static boolean isBiped()
		{
			return true;
		}

		public void getHumanDescription()
		{
			System.out.println("Human has two legs: "+ isBiped());
		}

		public static void main(String[] args)
		{
			Human mark = new Human();
			mark.getHumanDescription();
			mark.getDogDescription();
		}
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

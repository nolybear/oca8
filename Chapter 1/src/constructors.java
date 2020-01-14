/**
 * Copyright © 2019 Lhasa Limited
 * File created: 19 Dec 2019 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

import java.util.Random;

/**
 * @author Davide Capomagi
 * @since 19 Dec 2019
 */
public class constructors
{
	public static void main(String[] args)
	{
		Swan mother = new Swan();
		mother.numberEggs = 1; //set variable
		System.out.println(mother.numberEggs); //read variable

	}

	public static void constructors()
	{
		//declare type, then name, then create the object:
		Random r = new Random();
		//Random() - () are constructor
		// no return type (e.g public void Random(){} - a method)
	}

	public static class Swan {
		int numberEggs; //instance variable
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

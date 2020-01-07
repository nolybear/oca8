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
public class VariableScope
{
	public void eatMore(boolean hungry, int amountOfFood)
			// hungry is a method parameter, scope local to method
	{
		int roomInBelly = 5; // available throughtout method
		if (hungry)
		{
			boolean timeToEat = true; //avaiable in if block
			while (amountOfFood > 0)
			{
				int amountEaten = 2;
				roomInBelly = roomInBelly - amountEaten; //avaiable in while block
				amountOfFood = amountOfFood - amountEaten;
			}
		}
		System.out.println(amountOfFood);
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

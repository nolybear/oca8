/**
 * Copyright © 2019 Lhasa Limited
 * File created: 06 Feb 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

/**
 * @author Mark Nolan
 * @since 06 Feb 2020
 */
public class inheritance
{
	public double getAverageWeight()
	{
		return 50;
	}

	protected String getNumberOfHumps()
	{
		return "Undefined";
	}
}

	class Wolf extends inheritance
	{
		//override parent method
		public double getAverageWeight()
		{
//			return getAverageWeight()+20; would call child method rather than parent method - stack overflow
			return super.getAverageWeight()+20;

		}

//		private - less accessible than parent, wont compile
		// returns different type (int) than parent (string - wont complile)
//		private int getNumberOfHumps()
//		{
//
//		}
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

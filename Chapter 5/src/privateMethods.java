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
public class privateMethods
{
	//can't override a private method in a parent class
	//but can define its own method - but is not an overriden version of the parents class method

	private String getNumberOfHumps()
	{
		return "undefined";
	}
}

class method extends privateMethods
{
	private int getNumberOfHumps() //can be diff type as not overriding
	{
		return 2;
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

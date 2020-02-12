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
public class OverridingandExceptions extends Exception
{
}

class Reptile{
	protected boolean hasLegs() throws OverridingandExceptions{
		throw new OverridingandExceptions();
	}
	protected double getWeight() throws Exception
	{
		return 2;
	}

	protected double getHeight() throws OverridingandExceptions{
		return 2;
	}

	protected int getLength()
	{
		return 10;
	}
}

class Snake extends Reptile
{
	protected boolean hasLegs()
	{
		return false;
		// no new exception defined
		//child can hide or eliminate a parents method exception without issue
	}

	protected double getWeight() throws OverridingandExceptions{
		//although differnt excpetion to parent, as Overriding is a subclass of Exception by construction
		return 2;
	}

//	protected double getHeight() throws Exception
	{
		//parent is Overriding
		//child is Exception, which is not a subclass of the parent

	}

//	protected int getLength() throws OverridingandExceptions
	{
		//no exception in parent
		//but exception in parent, therrefore it define a new exception parent doesnt have, which is not allowed
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

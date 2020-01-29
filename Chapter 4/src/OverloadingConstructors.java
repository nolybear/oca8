/**
 * Copyright © 2019 Lhasa Limited
 * File created: 29 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

/**
 * @author Mark Nolan
 * @since 29 Jan 2020
 */
public class OverloadingConstructors
{
	private String colour;
	private int weight;

	public static void main(String[] args)
	{
		new OverloadingConstructors(3);
	}

	public OverloadingConstructors(int weight)
	{
		this.weight = weight;
		colour = "brown";
		//this is alot of duplicate code, would be useful to call the other constructor:
//		new OverloadingConstructors(weight, "brown"); //needs new as contstructor
		//this wont work as expected - will create a new object rather than set it on the object we instaniate
//		this(weight,"brown"); - this calls another constructor on the same instance of the class.

		//this in constructors - must be the 1st statement in contrsuctor
	}

	public OverloadingConstructors(int weight, String colour)
	{
		this.weight = weight;
		this.colour = colour;

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

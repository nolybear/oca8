/**
 * Copyright © 2019 Lhasa Limited
 * File created: 29 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */
package pond.swan;

import pond.shore.Bird;

/**
 * @author Mark Nolan
 * @since 29 Jan 2020
 */
//in a different package than Bird, but subclass of bird
	//bird is parent, swan is subclass
public class Swan extends Bird
{
	public void swim()
	{
		//refers to protected members by inherting them
		floatInWater();
		System.out.println(text);
	}

	public void helpOtherSwanSwim()
	{
		//swan inherits from bird so allowed access
		Swan other = new Swan();
		other.floatInWater();
		System.out.println(other.text);
	}

	public void helpOtherBirdSwim()
	{
		Bird other = new Bird();
		//Bird reference is used - in different package and not inherited the bird
//		other.floatInWater();
		//this is not allowed as Swan is not a subclass of bird
	}

	//protected rule:
	// without reference to variable - inheritence!
	//used through a variable - if a subclass, access to protected allowed.
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

/**
 * Copyright © 2019 Lhasa Limited
 * File created: 29 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */
package pond.goose;

import pond.shore.Bird;

/**
 * @author Mark Nolan
 * @since 29 Jan 2020
 */
public class Goose extends Bird
{
	public void helpGooseSwim()
	{
		Goose other = new Goose();
		other.floatInWater();
		System.out.println(other.text);
	}

	public void helpOtherGooseSwim()
	{
		Bird other = new Goose(); //object is a goose stored in a bird variable
		//cant refer to members of bird class since we are not in the same package, and Bird is not a subclass of Bird
//		other.floatInWater();

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

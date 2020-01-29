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
public class Gosling extends Bird //extending allows access to any public or protected members from its parent
	//the parent in this case being goose (so couldn't get anything from any other chapter modules)
	//different package then bird (but same parent)
{
	public void swim()
	{
		floatInWater();
		System.out.println(text);
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

/**
 * Copyright © 2019 Lhasa Limited
 * File created: 29 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */
package pond.duck;

import pond.goose.Goose;
import pond.shore.Bird;

/**
 * @author Mark Nolan
 * @since 29 Jan 2020
 */
public class GooseWatcher //not in goose class
{
	public void watch() {
		Goose goose = new Goose();
//		goose.floatInWater();

		//Goose can refer to floatinwater, and not callers of goose.

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

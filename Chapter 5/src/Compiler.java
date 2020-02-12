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
public class Compiler
{
	//by default, a no argument constructor is created, which is the equivalent of this
	public Compiler()
	{
		super(); // even if you created a constructor without super, would be equivalent to this
	}

	public Compiler(int age)
	{

	}

	class Commy extends Compiler
	//if there is no noarguement constructor (e.g. 20 is present) child wont compile
	{

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

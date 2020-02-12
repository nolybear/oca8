/**
 * Copyright © 2019 Lhasa Limited
 * File created: 12 Feb 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

/**
 * @author Mark Nolan
 * @since 12 Feb 2020
 */
public class InheritingVariables
{
	protected int tailLength = 4;
	public void getInheritingVariablesTailLength()
	{
		System.out.println(String.format("[parentTail=%s]",tailLength));
	}

	class variable extends InheritingVariables
	{
		protected int tailLength = 8;
		public void getVariableTailLength()
		{
			System.out.println(String.format("[tail=%s],[parentTail=%s]",tailLength,super.tailLength));
		}
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

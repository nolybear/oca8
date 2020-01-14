/**
 * Copyright © 2019 Lhasa Limited
 * File created: 09 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

/**
 * @author Mark Nolan
 * @since 09 Jan 2020
 */
public class LogicalOperators
{
	static boolean a = true, b = false, c = true, d = false;

	public static void main(String[] args)
	{
		AND();
		InclusiveOR();
		ExclusiveOR();
		shortCircuts();
	}

	public static void AND()
	{
		//AND is only true if both operands are true
		System.out.println(a & b);
		System.out.println(b & d);
		System.out.println(a & c);

	}

	public static void InclusiveOR()
	{
		// Inclusive OR is only false if both operands are false
		System.out.println(a | b);
		System.out.println(a | c);
		System.out.println(b | d);

	}

	public static void ExclusiveOR()
	{
		// only true if both operands are different
		System.out.println(a ^ b);
		System.out.println(a ^ c);
		System.out.println(a ^ d);
	}

	public static void shortCircuts()
	{
		boolean x = true, y = false;
		if (y || x)
		{
			System.out.println(1);
		}
		if (x || y)
		{
			System.out.println(2);
		}
		if (x && y)
		{
			System.out.println(5);
		}
		if (y && x)
		{
			System.out.println(4);
		}
		//&& if lhs is true, will then evaluate RHS

		//|| if lhs is false, will then evaulate RHS

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

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
public class UnaryOperators
{
	public static void main(String[] args)
	{
		System.out.println(!true);
		double x = 3;
		x = -x;
		System.out.println(x);

		int a = 3;
		int b = ++a * 5 / a-- + --a;
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		PreandPostOperators();
	}

	public static void PreandPostOperators()
	{
		//if pre operator is applied first and value returned is new value
		int x = 3;
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x);
		//if post - orginal value is returned then operand is applied afterwards
		int y = 3;
		System.out.println(y);
		System.out.println(y++);
		System.out.println(y);
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

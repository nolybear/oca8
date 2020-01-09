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
public class ArithmeticOperators
{
	public static void main(String[] args)
	{
		// multiplicative operators (*,/,%) have higher order than additive (+,-)
		int x = 2 * 5 + 3 * 4 - 8;
		System.out.println(x);
		// if (), they are calculated first
		int y = 2 * ((5 + 3) * 4 - 8);
		System.out.println(y);
		// / gives you nearest whole value number divides into, % gives remainder
		System.out.println(11/3);
		System.out.println(11%3);
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

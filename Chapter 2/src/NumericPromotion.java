/**
 * Copyright © 2019 Lhasa Limited
 * File created: 09 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : NumericPromotion$
 */

/**
 * @author Mark Nolan
 * @since 09 Jan 2020
 */
public class NumericPromotion
{

	public static void main(String[] args)
	{

	}

	public void Rule1()

	{
		//1 - if two different types - will automatically promote one to larger value
		int x = 1;
		long y = 5;
		//what type will it be?
		//	int z = x + y;
		//	long z = x + y;
		System.out.println(x + y);
	}

	public void Rule2()
	{
		//2 if one is INTegral and other is floating point (contains .) type, will promote int to FP data type
		double x = 39.21;
		float y = 2.1f;

		// what is the data type?
//		double z = x + y;
//		float z = x + y;
	}

	public void Rule3()
	{
		// smaller data types (byte,short,char) are promoted to int

		short x = 10;
		short y = 3;

		//what is data type?
//		short z = x +y;
//		int z = x + y;
	}

	public void Rule4()
	{
		// After all promotion has occured and opearands same data type, result will have same data type as promoted operands

		short x = 14;
		float y = 13;
		double z = 30;

		//What is the datatype of x*y/z
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

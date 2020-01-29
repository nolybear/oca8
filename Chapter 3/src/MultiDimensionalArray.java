/**
 * Copyright © 2019 Lhasa Limited
 * File created: 22 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

/**
 * @author Mark Nolan
 * @since 22 Jan 2020
 */
public class MultiDimensionalArray
{
	public static void main(String[] args)
	{
		String [][] rectangle = new String[3][2];
		//array rectangle with three elements, each refers to an array of two elements;
		rectangle[0][1] = "set"; //array 0 from rectangle, then array 1 in that array is now set
		//can define arrays 1st dimentsion, and define the siz of each array separatly
		int [][] blar = new int[4][];
		blar[0] = new int[5];

		//can loop through array:
		int[][] differentSizes = {{1,4},{3},{9,8,7}};
		for (int[] outer: differentSizes)
		{
			for(int inner:outer)
			{
				System.out.println(inner);
			}
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

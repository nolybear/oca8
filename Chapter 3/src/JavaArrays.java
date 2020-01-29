/**
 * Copyright © 2019 Lhasa Limited
 * File created: 14 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

import java.util.Arrays;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * @author Mark Nolan
 * @since 14 Jan 2020
 */
public class JavaArrays
{
	public static void main(String[] args)
	{
		//indexes start at 0
		//tells you its an array, 3 represents size
		int[] numbers = new int[3]; //will create an empty array - all emements set to default value of that type
		int[] numbers2 = {42,55,99}; //specify inital values of array.
		//can write [] before or after name, and space is optional e.g
		int numb3[]; //not instantied. a reference variable to null

		int[] ids, types; //both arrays
		int id[], type; //one array, one int

		java.lang.String[] mammals = {"monkey","chimp","donkey"};
		System.out.println(mammals.length); //3
		System.out.println(mammals[0]); // monkey

		String [] birds = new String[6];
		System.out.println(birds.length); // 6 elements in array, but will all be default value (null)
		Arrays.sort(numbers2); //remember, if string will sort in alphabetical order (e.g. 10 100 9 if strings)

		int[] numbers23 = {2,3,4,5};
		//searching - if not sorted, result not predictible
		System.out.println(Arrays.binarySearch(numbers23,2)); //returns 1 (index)
		// if not found, we negate the value of where it should be in the index then subtract one:
		System.out.println(Arrays.binarySearch(numbers23,9));
		//returns -5 - would be inserted at index 4. negate it (-4), then subtract 1 (-5)


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

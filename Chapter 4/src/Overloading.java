/**
 * Copyright © 2019 Lhasa Limited
 * File created: 29 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

/**
 * @author Mark Nolan
 * @since 29 Jan 2020
 */
public class Overloading
{
	//different methods with same name but different type parameters
	public static void main(String[] args)
	{
//java will always pick most specific version of a method
		//e.g if you had a method fly(Object o) and fly (String s)
		//fly("haha) use string, fly(1) would use object
	}

	public void fly (int numMiles){}
//	public int fly(int numMiles){} viewed as same as one above, only differst by return type, same variabbles so seen as the same method
//public static void fly (int numMiles){} seen as the same
	public void fly (short numFeet){}
	public boolean fly(){return false}
	void fly (int numMiles, short numFeet){}
	public void fly(short numFeet, int NumMiles) throws Exception{}

	//varargs
//	public void fly(int[] lengths){} varargs treated as if were array, so both methods are the same
	public void fly(int... lengths){};

	//order for methods:
	//1 Exact match by type
	//2 Larger primative type
	//Autoboxed types
	//Varargs




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

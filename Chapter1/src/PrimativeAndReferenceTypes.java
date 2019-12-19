/**
 * Copyright © 2019 Lhasa Limited
 * File created: 19 Dec 2019 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

/**
 * @author Davide Capomagi
 * @since 19 Dec 2019
 */
public class PrimativeAndReferenceTypes
{
	//primative types
	boolean foo = true;
	byte foo1 = 123;
	short foo2 = 123;
	int foo3 = 123;
	long foo4 = 123;
	float foo5 = 123.45f;
	double foo6 = 123.456;
	char foo7 = 'a';


	byte maxpos = 127;
	byte maxneg = -128;

//	long max = 12345678933;
	/*
	won't compile:
	int num = 200;
	int num - datatype
	200 - literal
	java always assumes you are defining an init value with a literal

	 */

	int underscore = 1_000_000;
	//can be at start, end or BY(b4/after) decimal

	public static void ReferenceType()
	{
		//ref type is an object (instance of a class)
//		today = new java.util.Date();
		//today references to a data object in memory (a data reference)
		//roday can be used to access the various fields and methods of this object

	}

	public static void differences()
	{
		//int value = null; wont compile
		String s = null;

		String reference = "hello";
		int len = reference.length();
//		int bad = len.length - prim do not have methods declared on them
		//prim lowercase, ref Capitalised
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

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
public class CompoundAssignmentOperators
{
	public static void main(String[] args)
	{


	int x = 2, z = 3;
	x = x * z; //simple
		x *= z; //compound
	//lhs of compound has to be declared e.g
		int a = 3; //wont compile is this not here
	a *=z;
	//compound assigments can also cast
		long d = 10;
		int e = 5;
		e = (int) (e * d);
		//or
		 e *= d;


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

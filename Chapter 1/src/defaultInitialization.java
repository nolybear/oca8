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
public class defaultInitialization
{
static int thisisaClassVariable = 5;
	public static void main(String[] args)
	{

	}

	public void localVariable(){
		int y = 10;
		//defined with method
	int z; // is declared here
//	int reply = z; - needs to be intialized before use
	z = 3; //is now initalized
	int reply = z;

	}

	public void findAnswer(boolean boo)
	{
		int a,b;
		if(boo)
		{
			a=3;
			b=4;
		}
		else
		{
			a=4;
		}
		//which will not be valid?
//		System.out.println(a);
//		System.out.println(b);
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

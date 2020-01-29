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
public class Methods
{
	public static void main(String[] args)
	{

	}

	//can use varargs
	public void walk1(int... num){};
	public void walk2 (int start, int...nums){}
//	public void walk3(int...nums, int start) {}; varargs has to be at end of list
//	public void walk4(int...start, int... nums) {}; vararg in a position not at end.

	//access modifers
	//private - only accessible within same class.
	//modfiers are optional. if not included the default is package private (any classes within same package can use it)

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

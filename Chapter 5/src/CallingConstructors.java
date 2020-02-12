/**
 * Copyright © 2019 Lhasa Limited
 * File created: 06 Feb 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

/**
 * @author Mark Nolan
 * @since 06 Feb 2020
 */

class Primate{
	public Primate() {
		//super() inserted by compiler
		System.out.println("Primate");
	}
}

class Ape extends Primate
{
	public Ape(){
		//super() inserted by compiler
		System.out.println("Ape");
	}
}
public class CallingConstructors extends Ape
{
	//inserts a default no arg constructor with super as first statement
	public static void main(String[] args)
	{
		new CallingConstructors();
		//parent will always be called first
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

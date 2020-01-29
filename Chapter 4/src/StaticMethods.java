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
public class StaticMethods
{
	private String name = "Static class";

	public static void main(String[] args)
	{
		// accessing a staic member
		Methods.main(new String[0]);
		System.out.println(Methods.count);

		first();
		second();
//		third(); wont compile - making a static reference to non static method
		new StaticMethods().third(); //call third as an instance method
	}

	public static void first (){};
	public static void second(){};
	public void third() {
		System.out.println(name); //if method is static, will complain as refering to non static name, change name to be static
	}

	public void blah()
	{
		//can use an instance of the object to call a static method
		Methods m = new Methods();
		System.out.println(m.count);
		m = null;
		System.out.println(m.count); // m is still a method object - compiler checks for type of reference and uses that instead of object
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

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
public class Constructors
{
	private String colour;
	private String nice;
	public Constructors()
	{
		System.out.println("constructor");
	}

	public Constructors(String colour)
	{
		this.colour = colour; //use this to assign the parameter from the method to the instance variable
		colour = this.colour; //this is no good - this will assign the parameter the instance variable (so will be blank)
		nice = colour; // this is fine as different name
		this.colour = "white"; // this is fine, but not needed

		//EVERY CLASS IN JAVA HAS A DEFAULT CONSTRUCTOR e.g. inthis case would equal to pubic Rabbit(){}
		//no need to write this as java will assume it.
	}

//	public bunny() not valid Constructor as lowercase - has to be same name as class
	public void Constructors(){}; //valid method but not constrctor (use of void)

	//new Constructors(); //creating a new object - instantiation
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

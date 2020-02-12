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
public class SuperConstructors
{
	private int age;
	private String name;
			public SuperConstructors(int age){
				super(); //call to java.lang.object parent constructor which doesn't take arguments
				this.age = age;
				this.name = null;
			}

			public SuperConstructors(int age, String name)
			{
				this.age = age;
				this.name = name;
			}

			class Super extends SuperConstructors
			{
				public Super(int age)
				{
					super(age,"Gorrila"); //call to parent(SuperConstrutors) constructor, can use multiple constructors
					super.getClass(); //super.calls a function from parent class
				}

				public Super(){
					this(4); //calls other constructor in Super class
				}
//both this and super have to be first line

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

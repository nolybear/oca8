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
public class EncapsulatingData
{
//	int numberofEggs;
	//this variable is accessiable by default to to any class in the package
	//no control of what gets set in our own class
	//e.g Counter.numberofEggs = -1;

	//encapsulation means only methods in the class can refer to the instance variable. Callers are required to use the methood
private int numberOfEggs; //private to class

public int getNumberOfEggs() { //getter
	return numberOfEggs;
}

public void setNumberOfEggs(int numberOfEggs){ //setter
	if(numberOfEggs >=0) //guard
		this.numberOfEggs = numberOfEggs;
}
//we can make a class immutable by removing the setter and use a constructor to set the value.

//encapsulation - data is private and getters and setters are public
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

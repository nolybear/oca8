/**
 * Copyright © 2019 Lhasa Limited
 * File created: 07 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

/**
 * @author Davide Capomagi
 * @since 07 Jan 2020
 */
public class DestroyingObjects
{
	public void delete()
	{
		//not always guarrenteed to run
System.gc();
	}

	public static void main (String[] args) {
		String one, two; // no objects yet
		// now objects are being created - this are added to the heap
		// the object doesn't have a name, can only be accessed by a reference (e.g one or two)
		one = new String("a");
		two = new String("b");
		// now one points to the two object -> the object (in this case "a") is eligable for collection
		one = two;
		//three is pointing to "b" not "a"
		String three = one;
		one = null;
	}

	//finalize() call cound run zero or one time - only runs if objecrt is eligble for garbage collection

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

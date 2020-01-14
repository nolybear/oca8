/**
 * Copyright © 2019 Lhasa Limited
 * File created: 19 Dec 2019 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.lang.System;
import java.lang.*;
//These do not to be imported as it auto imported

//import java.util.*;
//imports classes from java.util package
import java.sql.Date;
//import java.util.Date;
import java.util.Random;

/**
 * @author Davide Capomagi
 * @since 19 Dec 2019
 */
public class packages
{
	public static void main(String[] args)
	{
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}

	public static void read(Files files) {
		Paths.get("name");
		//how can we reduce the number of imports for this?
	}

	public static void conflicts(){
		//this is part of java util
		// also part of java.sql.Date
		// so what happens if java.sql.* is used?
		// explict import always take precdence
		// What happens if we explcitly define both?
		Date date;
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

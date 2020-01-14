/**
 * Copyright © 2019 Lhasa Limited
 * File created: 14 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

/**
 * @author Mark Nolan
 * @since 14 Jan 2020
 */
public class AdvancedFlowControl
{
	public static void main(String[] args)
	{
NestedLoops();
	}

	public static void NestedLoops()
	{
		int x = 20;
		while(x>0) {
			do {
				x -= 2;
			}
			while (x>5);
			x--;
			System.out.println(x+"\t");
		}

	}

	public void OptionalLabels()
	{
		int counter = 0;
		//start is a label - can be called by break now
		start: {
			for (int i = 0; i <= 10; i++) {
				for (int j = 0; j <= 10; j++) {
					if (i == 5)
						break start; // this will now break out the start code
				}
				counter++;
			}
		}
		System.out.println(counter);
	}

	public void ContinueLabels()
	{
		start: for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 10; j++) {
				System.out.print("#");
				if (j >= i)
					continue start; // when it hits will go back to the top where start is
			}
			System.out.println("This will never"
					+ " be printed");
		}
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

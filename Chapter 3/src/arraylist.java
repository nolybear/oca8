/**
 * Copyright © 2019 Lhasa Limited
 * File created: 22 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.print.DocFlavor;

/**
 * @author Mark Nolan
 * @since 22 Jan 2020
 */
public class arraylist
{
	ArrayList list = new ArrayList();


	public static void main(String[] args)
	{

	}

	public void creatingAnArrayList()
	{
		ArrayList list1 = new ArrayList(); // contains space for default num of elements but dont fill in any slots
		ArrayList list2 = new ArrayList(10); //specify number of slots
		ArrayList list3 = new ArrayList(list2); //make copy of list2 array
		ArrayList<String> list4 = new ArrayList<String>(); //specify type
		ArrayList<String> list5 = new ArrayList(); //specify type
		List<String> list 6 = new ArrayList();//store and arraylist in a list
		java.util.ArrayList<String> lst7 = new List<>(); //cant story list in arraylist
	}

	public void add()
	{
		list.add("Hawk");
		list.add(true); //as list type hasnt been defined, the type is object, which includes everything apart from primatives
		System.out.println(list);

		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
//		safer.add(true); wont compile

		//can specify where in array to add value:
		safer.add(0,"hawk");
	}

	public void remove()
	{
		//returns boolean if removed or not
		list.remove("poo"); //returns true if removed, false if not (i.e value is not in list)
		list.remove(0); //removes element at 0
		list.remove(100); //will throw indexoutofboundsexception
	}

	public void set()
	{
		list.set(0,"blah"); //will replace whats at index 0 with blah
		list.set(100,"haha"); //exception
	}

	public void isEmptyandSize()
	{
		list.isEmpty();//isempty returns true is no slots being used
		list.size(); //returns int of size
	}

	public void clear()
	{
		//discard all elements in array (returns void)
		list.clear();
	}

	public void contains()
	{
		//returns true if list contains
		list.contains("blah");
	}

	public void equals()
	{
		//compare two lists to see if they contain the same elements in the same order
		list.equals(list);
		//empty lists are equal.
	}

	public void WrapperClasses()
	{
		//if we want to put primatives in an object, we can use a wrapper class, an object type that corresponsds to the primative
		//e.g primative boolean, can construct new Boolean(true)
		int primative = Integer.parseInt("123"); //returns primative, converts string
		Integer wrapper = Integer.valueOf("123"); //converts String to Integer Wrapper Class
		//charc doesnt do this
	}

	public void AutoBoxing()
	{
		//java will convert prmative value to relevant wrapper class:
		List<Double> weights = new ArrayList<>();
		weights.add(50.5); //autoboxing
		weights.add(new Double(60)); //pass in Double object, rather than autobox it


	}
	public void converting()
	{
		List<String> list = new ArrayList<>();
		list.add("hawk");
		Object [] objectArray = list.toArray(); //defaults to object type
		String [] stringArray = list.toArray(new String[0]); //speify array type. 0 as size so it creates a new array of proper size

		String[] array = {"hawk","robin"};
		List<String> list2 = Arrays.asList(array); //this is fixed size, backed version of list
		list2.set(1,"test"); //fine as set is just replacing
		array[0] = "new"; //fine as it changes both the array and therefore the list
		list2.remove(1); //throws exception as can't change size of list
	}

	public void Sorting()
	{
		//sorting an arraylist:
		List<Integer> numbers = new ArrayList<>();
		numbers.add(6);
		numbers.add(3);
		Collections.sort(numbers);
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

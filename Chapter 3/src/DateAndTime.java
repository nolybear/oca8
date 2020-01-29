/**
 * Copyright © 2019 Lhasa Limited
 * File created: 22 Jan 2020 by Mark Nolan
 * Creator : Mark Nolan
 * Version : $
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author Mark Nolan
 * @since 22 Jan 2020
 */
public class DateAndTime
{
	public static void main(String[] args)
	{
		System.out.println(LocalDate.now()); //just data
		System.out.println(LocalTime.now()); //just time
		System.out.println(LocalDateTime.now()); //time and date

		System.out.println(LocalDate.of(2015, Month.APRIL, 20)); //can also pass month as int
		//localtime - can just specify hour and minute:
		System.out.println(LocalTime.of(6, 15)); // can also pass in seconds and nano if you want

		// no need for constructors - private constructors to force you to use static methods
		//		LocalDate d = new LocalDate(); - wont compile, cant construct objet directly
		System.out.println(LocalDate.of(2015, Month.JANUARY, 32)); //throws datetimeexception
	}

	public void ManipulatingDatesAndTImes()
	{
		//datetime etc are immutable like string, must assign to a reference variable:
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();
		date.plusDays(3);
		date.plusWeeks(3);
		date.plusMonths(2);
		date.plusYears(1);
		datetime.minusDays(1);
		datetime.minusHours(3);
		datetime.minusSeconds(1);

		LocalDateTime combi = LocalDateTime.of(date, time).minusDays(1).minusHours(3);
	}

	public void period()
	{
		//instead of using plus methods. can specify amount of years months days weeks in a period and pass in.
		Period blah = Period.of(1, 0, 7)// also ofyears,ofmonths,ofweeks,ofdays;
		Period haha = Period.ofYears(1).ofWeeks(3); //will only run last one (weeks)

		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();

		date.plus(blah);
		datetime.plus(blah);
		time.plus(blah); // throw exception.
	}

	public void format()
	{
		//can format any data types
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();

		date.format(DateTimeFormatter.BASIC_ISO_DATE);
		time.format(DateTimeFormatter.BASIC_ISO_DATE); //throws exception as time cant be formatted as date.
		datetime.format(DateTimeFormatter.BASIC_ISO_DATE);

		DateTimeFormatter shortstyle = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		//can do either way:
		date.format(shortstyle);
		shortstyle.format(date);

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

package ru.antonevane.ch6;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Date_Calendar_Currency_Formating {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		Calendar c = Calendar.getInstance();
		Locale loc = new Locale("us");
		Date d = c.getTime();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, loc);
		String s = df.format(d);
		System.out.println(s);
		{

		}

		NumberFormat nf = NumberFormat.getCurrencyInstance(loc);
		System.out.println(nf.format(120.00));

		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.toString());
		System.out.println(c1.getTime());
		System.out.println(c1.getTimeInMillis());
		System.out.println(Calendar.MONDAY == c1.getFirstDayOfWeek());
		System.out.println(c1.getFirstDayOfWeek());

		float f = 10.1126f;
		NumberFormat fn = NumberFormat.getInstance();
		System.out.println(fn.getMaximumFractionDigits()); // Выведет 3
		System.out.print(fn.format(f) + " "); // Выведет 10,113
		// Можно расширить
		fn.setMaximumFractionDigits(5);

		System.out.println(fn.format(f) + " "); // Выведет 10,1126
		System.out.println(fn.parse("1234.567"));
		fn.setParseIntegerOnly(false);
		System.out.println(fn.parse("1234.567"));

	}
}

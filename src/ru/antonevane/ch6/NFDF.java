package ru.antonevane.ch6;

import java.text.NumberFormat;
import java.text.ParseException;

public class NFDF {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		String s = "a123,22sf ff1111 13";

		NumberFormat format = NumberFormat.getInstance();
		format.setMaximumFractionDigits(20);

		System.out.println(""+format.format(s));

		System.out.println(""+format.parse(s));

	}

}

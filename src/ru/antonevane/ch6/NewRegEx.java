package ru.antonevane.ch6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewRegEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern p = Pattern.compile("Hello");
		Matcher m = p.matcher("My name is Hello");
		while (m.find()) {
			System.out.print(m.start() + " " + m.end() + " " + m.group());
		}

	}

}

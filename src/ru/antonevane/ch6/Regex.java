package ru.antonevane.ch6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String source = "";
		Pattern pattern = Pattern.compile("a?");

		Matcher matcher = pattern.matcher(source);

		while (matcher.find()) {
			System.out.print("'" + matcher.group() + "'\t :");
			System.out.print(matcher.start() + " ");
			System.out.print(matcher.end() + "\n");
		}
	}

}

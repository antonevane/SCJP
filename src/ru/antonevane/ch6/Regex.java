package ru.antonevane.ch6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String source = "q 1 22 _z";
		Pattern pattern = Pattern.compile("\\d+");

		Matcher matcher = pattern.matcher(source);

		while (matcher.find()) {
			System.out.print("'" + matcher.group() + "'\t :");
			System.out.print(matcher.start() + "\n");
		}
	}

}

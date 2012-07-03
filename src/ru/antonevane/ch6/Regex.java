package ru.antonevane.ch6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String source = "yyxxxyxx";
		Pattern pattern = Pattern.compile(".??xx");

		Matcher matcher = pattern.matcher(source);

		while (matcher.find()) {
			System.out.print("'" + matcher.group() + "'\t :");
			System.out.print(matcher.start() + " ");
			System.out.print(matcher.end() + "\n");
		}
		
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("a1b34ef");
		boolean b = false;
		int z = 0;
		while(b = m.find()) {
		z++;
		}
		System.out.println(z);
		
	}
}
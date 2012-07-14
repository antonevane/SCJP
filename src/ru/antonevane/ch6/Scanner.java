package ru.antonevane.ch6;

import java.util.Locale;

public class Scanner {

	public static void main(String[] args) {
		String source = "1 2 3";
		java.util.Scanner scanner = new java.util.Scanner(source);
		scanner.useDelimiter(",");
		scanner.useLocale(Locale.getDefault());
		
		int radix = 10;
		scanner.useRadix(radix);
		
		while (scanner.hasNext()) {
			scanner.next();
			scanner.nextShort();
			
			scanner.nextShort(radix);
			scanner.close();
			System.out.println(scanner.next());
		}
	}
}

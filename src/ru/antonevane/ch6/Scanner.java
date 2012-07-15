package ru.antonevane.ch6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Locale;

public class Scanner {

	public static void main(String[] args) throws FileNotFoundException {
		String source = "1,2,3";
		java.util.Scanner scanner = new java.util.Scanner(source);
		scanner.useDelimiter(",");
		scanner.useLocale(Locale.getDefault());

		new java.util.Scanner(source);
		new java.util.Scanner(new File(""));
		new java.util.Scanner(new FileInputStream(""));
		new java.util.Scanner(new Readable() {

			@Override
			public int read(CharBuffer cb) throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}

		});
		new java.util.Scanner(new File(""));
		new java.util.Scanner(new File(""));
		new java.util.Scanner(new File(""));

		int radix = 10;
		scanner.useRadix(radix);

		while (scanner.hasNext()) {
			scanner.next();
			scanner.nextShort();

			System.out.println(scanner.nextShort(radix));

		}

		scanner.close();
	}
}

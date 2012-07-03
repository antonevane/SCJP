package ru.antonevane.ch6;

public class Scanner {

	public static void main(String[] args) {
		String source = "1 2 3";
		java.util.Scanner scanner = new java.util.Scanner(source);
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
	}
}

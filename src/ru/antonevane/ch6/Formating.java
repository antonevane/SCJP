package ru.antonevane.ch6;

import java.io.Console;

public class Formating {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Console c1 = System.console();
		Console c2 = System.console();
		float f = 1.0f;
		long l = 1;
		
		f =l;
		System.out.println(c1== c2);
	System.out.println(f);
	}

}

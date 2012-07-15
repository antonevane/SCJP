package ru.antonevane.ch6;

public class Formatters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double a = -1.000011121;
		// System.out.format("%0,7d", 1232349.01f);
		
		System.out.format(">%1$0,20.1f<", a);

	}

}

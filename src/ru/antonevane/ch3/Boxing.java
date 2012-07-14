package ru.antonevane.ch3;

public class Boxing {
	static void go(Long x) {
		System.out.println("Long");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int b = 5;
		// go(b); // must widen then box - illegal

	}

}

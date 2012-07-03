package ru.antonevane.ch5;

public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char c = '\u0001';

		switch (c) {
			case 65535:
				System.out.println("1");
				break;

			case '\u0001':
				System.out.println("\u0001");
				break;

//			case 65536:
//				System.out.println("1");
//				break;

			default:
				System.out.println("Default");
				break;
		}

	}

}

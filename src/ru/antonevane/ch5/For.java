package ru.antonevane.ch5;

public class For {

	public static void main(String[] args) {
		args = new String[3];
		for (int i = 0, x = 0; i < args.length; i++, x = ++i) {
			System.out.println(x);
		}

		for (String string : args) {

		}

		int d = 3;
		for (int a = 1; d != 1; System.out.println("iterate")) {
			d = d - a;
		}

		int b = 3;
		for (int a = 1; b != 1; new String()) {
			b = b - a;
		}

		label: for (int i = 0; i < args.length; i++) {
			System.out.println("InLOOP");
			break label;
		}

		shit_twice: System.out.println("Label shit_twice");
		System.out.println("Label shit_twice againg");

	}

}

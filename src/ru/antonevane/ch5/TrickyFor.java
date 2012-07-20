package ru.antonevane.ch5;

public class TrickyFor {

	/**
	 * @param args
	 */
	public final static void main(String[] args) {
		String o = "";
		z: for (int x = 0; x < 3; x++) {
			System.out.println("X: " + x);
			for (int y = 0; y < 2; y++) {
				System.out.println("Before X: " + x + " Y: " + x);
				if (x == 1)
					break;
				if (x == 2 && y == 1)
					break z;
				System.out.println("After X: " + x + " Y: " + x);
				o = o + x + y;
				System.out.println("After X: " + x + " Y: " + x + " o = " + o);
			}
		}

		System.out.println(o);

	}

}

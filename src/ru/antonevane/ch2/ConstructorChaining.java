package ru.antonevane.ch2;

public class ConstructorChaining {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Horsy horsy = new Horsy();
	}

}

class Animaling {
	int x = 10;
	int z;

	public Animaling() {
		check();
	}
	
	public Animaling(String a) {
		check();
	}
	
	private void check() {
		System.out.println(x);
		System.out.println(z);
	}
}

class Horsy extends Animaling {
	int y = 1;

	public Horsy() {
		check();
	}
	
	private void check() {
		System.out.println(x);
		System.out.println(z);
		System.out.println(y);
	}
}

package ru.antonevane.ch2;

public class PolymorphOverride {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Polym polym = new Over();

		System.out.println(polym.a);
		polym.a(Integer.valueOf(1));
	}

}

class Polym {
	public int	a	= 11;

	protected void a() {
		System.out.println("Private Polym A");
	}

	protected void a(Long i) {
		System.out.println("Private Polym A");
	}

	protected void a(Object o) {
		System.out.println("Object o  Polym A");
	}
}

class Over extends Polym {
	public int	a	= 12;

	protected void a() {
		System.out.println("Over Polym A");
	}
}
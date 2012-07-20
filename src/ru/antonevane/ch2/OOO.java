package ru.antonevane.ch2;

public class OOO {

	public static void main(String[] args) {
		ParentA aCb = new ChildB();
		System.out.println("CB a: " + aCb.a);
		aCb.a();
		aCb.y();

		ParentA aCc = new ChildC();
		System.out.println("CC a: " + aCc.a);
		aCc.a();
		aCc.y();

		AllMyPain intf = (AllMyPain) aCb;
		System.out.println("CC a: " + aCc.a);
	}

}

interface AllMyPain {
}

class ParentA implements AllMyPain {
	int a = 1;
	private int z = 2;

	void a() {
		System.out.println("ParentA overloaded");
	}

	private void x() {

	}

	protected static void y() {
		System.out.println("ParentA static y");
	}

}

class ChildB extends ParentA {
	int a = 3;
	private int z = 4;

	void a() {
		System.out.println("ChildB overloaded");
	}

	private void x() {

	}

	protected static void y() {
		System.out.println("ChildB static y");
	}

}

class ChildC extends ParentA {
	int a = 5;
	private int z = 6;

	void a() {
		System.out.println("ChildC");
	}

	private void x() {

	}

	protected static void y() {
		System.out.println("ChildC static y");
	}
}
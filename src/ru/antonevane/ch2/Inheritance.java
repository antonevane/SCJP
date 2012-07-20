package ru.antonevane.ch2;

public class Inheritance {
	public static void main(String[] args) {
		B1 b1 = null;
		A1 a1 = null;
		
		((A1)b1).getB(1);
	}

	public void getA() {
	}
}

class B1 extends A1 {

	B1() {
		s = "as";
	}

	public void getB() {
		super.getB();
	}

	public static void getB(int x) {
		System.out.println("B.B(int)");
	}

	public void getB(int z, String name) {
	}
}

class A1 {
	A1() {
	}

	protected String s = "";

	public static void getA() {
	}
	
	public static void getB(int x) {
		System.out.println("A.B(int)");
	}

	public void getB() {
		System.out.println("A.B");
	}
}
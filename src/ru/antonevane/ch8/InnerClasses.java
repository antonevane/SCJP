package ru.antonevane.ch8;

public class InnerClasses {

	public static void main(String[] args) {
		InnerClasses ic = new InnerClasses();
		InnerClasses.Inner in = ic.new Inner();
		in.go();

	}

	class Inner {
		void go() {
			System.out.println("Inner");
		}
	}

	private Inner ic = new Inner();
	public static void innerWiredDecalre() {
		final int a = 10;
		abstract class Inner2 {
			private void go() {
			}
		}
	}
}

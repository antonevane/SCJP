package ru.antonevane.ch8;

public class AnonymousClass {

	public static void main(String[] args) {
		Super superRef = new Super() {
			public void run() {
			}
		};
	}

}

class Super {
	public void run() {
		System.out.println("Super run");
	}
}
package ru.antonevane.ch2;

public class InstanceOf {

	public static void main(String[] args) {
		C c = new C();
		A a = new B();
		//	System.out.println(c instanceof B);
	}}

class A {}
class B extends A {}
class C {}
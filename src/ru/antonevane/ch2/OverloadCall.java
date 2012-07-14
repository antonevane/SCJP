package ru.antonevane.ch2;

public class OverloadCall {
	public void run(C1 c) {System.out.println("C");}
	public void run(BZ b) {System.out.println("B");}

	public static void main(String[] args) {
		BZ b = new BZ();
		C1 c = new C1();
		C1 cAsb = new BZ();
		
		C1 z = (C1) (new BZ());
		
		BZ zb = (BZ) c;

		OverloadCall o = new OverloadCall();
		o.run(b);
		o.run(c);
		o.run(cAsb);
}}

class C1 {}

class BZ extends C1 {}
package ru.antonevane.ch2;

public class TrickyConstructor {
	int i;
	String titel;
	
	
	protected TrickyConstructor (String s){
		titel = s;
	}
	
	TrickyConstructor (int i){
		this.i = i;
		titel = "World";
	}
}

class SubChild extends TrickyConstructor {

	protected SubChild(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
}

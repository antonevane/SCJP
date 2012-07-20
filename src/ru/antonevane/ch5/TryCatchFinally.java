package ru.antonevane.ch5;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			System.out.println("Try");
		} finally {
			new TryCatchFinally();
		}

		int x = 1;
		assert (x == 1) : x;
		
		getV();
	}
	
	
	static void getV(String ... s){
		System.out.println(s.length);
	}
}

package ru.antonevane.ch3;

public class PrivateEnum {

	enum TrickyEnim {
		A(1), B(1);
		
		private int myValue;
		
		TrickyEnim (int myValue){
			this.myValue = myValue;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x;
//		x++;
	System.out.println( TrickyEnim.A.myValue);

	}
	
	public void trick(int sameName){
		sameName++;
		for (int sameName = 0; sameName < array.length; sameName++) {
		}
	}

}

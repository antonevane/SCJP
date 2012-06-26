package ru.antonevane;

public class Wrappers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer wrapperObject = Integer.valueOf("1");
		int intObject = Integer.parseInt("11");

		Integer i1 = 127;
		Integer i2 = 127;
		if(i1 == i2) {
			System.out.println("Equals");; // False because > 127
		}
		int[][] a = {{1,2,}, {3,4}};
		for (int i = 0; i < a.length; i++) {
			int[] js = a[i];
			for (int j = 0; j < js.length; j++) {
				int k = js[j];
				System.out.println("K: " +k);
				
			}
			System.out.println("ROW");
			
		}
	}

}

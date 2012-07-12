package ru.antonevane.ch3;

public class Arrays {
	public static void main(String[] args) {
		int[][] ar = new int[1][];
		int[] c = new int[2];

		ar[0] = c;
		
		int[] z = new int [] {10,1}; 

		Integer i = new Integer("2");
		i = Integer.valueOf("1000", 2);
		System.out.println(i);
		Character ch = new Character('c');
	}
}

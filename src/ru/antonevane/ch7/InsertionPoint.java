package ru.antonevane.ch7;

import java.util.*;

public class InsertionPoint {

	public static void main(String[] args) {
		String[] s = { "map", "pen", "marble", "key" };

		Othello o = new Othello();

		Arrays.sort(s, o);
		System.out.println("###After sort###");
		for (int i = 0; i < s.length; i++) {

			System.out.print(i + ": " + s[i] + ", ");
		}
		System.out.println("\n######\n");

		for (String s2 : s)
			System.out.print(s2 + " ");

		System.out.println(Arrays.binarySearch(s, "Z"));
	}

	static class Othello implements Comparator<String> {
		public int compare(String a, String b) {
			int i = b.compareTo(a);
			System.out.println(i);
			return i;
		}
	}

}

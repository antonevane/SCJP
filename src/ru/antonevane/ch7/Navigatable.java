package ru.antonevane.ch7;

import java.util.TreeSet;

public class Navigatable {

	public static void main(String[] args) {
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1545);
		times.add(1645);
		times.add(1945);
		
		System.out.println(times.floor(1644));
		System.out.println(times.ceiling(1644));
	}

}

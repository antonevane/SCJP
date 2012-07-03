package ru.antonevane.ch7;

import java.util.ArrayList;
import java.util.List;

public class CollectionFramework {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("z");
		list.add("a");
		list.add("b");
		list.add("a");
		int idx = 0;

		for (String string : list) {
			System.out.println(string + " : " + idx);
			idx++;
		}
		list.remove("a");

		idx = 0;
		System.out.println("\n");
		for (String string : list) {
			System.out.println(string + " : " + idx);
			idx++;
		}

	}

}

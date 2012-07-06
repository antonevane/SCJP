package ru.antonevane.ch7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sort {

	public static void main(String[] args) {
		String[] data = { "a", "A", "D", "d", "s" };
		Arrays.sort(data);
		for (String string : data) {
			System.out.print(string + " ");
		}

		Arrays.sort(data, Collections.reverseOrder());
		System.out.println();
		for (String string : data) {
			System.out.print(string + " ");
		}

		Sort[] dataSort = { new Sort(), new Sort(), new Sort(), new Sort(), new Sort() };

		Arrays.sort(data);
		System.out.println();
		for (Sort sort : dataSort) {
			System.out.print(sort + " ");
		}

		Arrays.sort(data, Collections.reverseOrder());
		System.out.println();  
		for (Sort sort : dataSort) {
			System.out.print(sort + " ");
		}
	}

}

class OwnComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
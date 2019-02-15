package com.infotect;

import java.util.ArrayList;
import java.util.List;

public class Icecream {
	public static void main(String[] args) {

		int[] a = { 1, 5, 4, 3, 2 };
		int n = a.length;
		int V = 4;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = n - 1; i >= 0; i--) {
			// Find denominations
			while (V >= a[i]) {
				V -= a[i];
				list.add(a[i]);
			}
		}

		System.out.println(list);

	}

}

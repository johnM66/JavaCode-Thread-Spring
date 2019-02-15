package com.infotect;

import java.util.ArrayList;
import java.util.List;

public class SumArray {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(0);
		list.add(0);
		list.add(0);

		int size = list.size();
		System.out.println(size);
		int mid = size / 2;
		System.out.println(mid);
		int sum = 0;
		int sum_second = 0;
		/*
		 * for (int i = 0; i < mid; i++) { sum += list.get(i);
		 * 
		 * }
		 */
		for (int i = mid + 1; i < size; i++) {
			sum_second = sum_second + list.get(i);
		}
		System.out.println(sum_second);

	}
}

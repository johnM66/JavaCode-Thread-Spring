package com.infotect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		hashmap.put(1, 12);
		hashmap.put(5, 56);
		hashmap.put(6, 99);
		hashmap.put(7, 45);

		Set<Entry<Integer, Integer>> entrySet = hashmap.entrySet();
		List l = new ArrayList(entrySet);
		Collections.sort(l, new MyCom());
		hashmap.clear();

	}

}

class MyCom implements Comparator<Entry<Integer, Integer>> {

	@Override
	public int compare(Entry e1, Entry e2) {
		Integer i1 = (Integer) e1.getValue();
		Integer i2 = (Integer) e2.getValue();
		return i1.compareTo(i2);
	}

}

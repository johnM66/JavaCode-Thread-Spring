package com.infotect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CompareValuesInHashMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 20);
		map.put("C++", 45);
		map.put("Python", 2);
		map.put("Unix", 67);
		map.put("MAC", 26);
		map.put("Why this kolavari", 93);

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(entrySet);

		/*
		 * Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
		 * 
		 * @Override public int compare(Entry<String, Integer> var1, Entry<String,
		 * Integer> var2) { // TODO Auto-generated method stub return
		 * (var1.getValue()).compareTo(var2.getValue()); } });
		 */
		Collections.sort(list, (e1, e2) -> e1.getValue().compareTo(e2.getValue()));
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + "-----------" + entry.getValue());
		}

		}



	}


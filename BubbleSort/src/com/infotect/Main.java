package com.infotect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "A", 2000));
		list.add(new Employee(2, "B", 3000));
		list.add(new Employee(3, "C", 4000));
		list.add(new Employee(4, "D", 5000));

		Predicate<Employee> pre = e -> e.sal > 2000 && e.sal < 6000;
		
		list.forEach(e -> e.setSal(e.getSal() * 5));

		list.forEach(s -> System.out.println(s.getSal()));

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");

		BiConsumer<Integer, String> bi = (key, value) -> System.out.println("Key:" + key + " Value:" + value);
		bi.accept(5, "9");
		map.forEach(bi);


	}

}

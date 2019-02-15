package com.infotect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatDemo {

	public static void main(String[] args) {
		List<String> list12 = Arrays.asList("A1", "A2", "A3");
		List<String> list23 = Arrays.asList("B1", "B2", "B3", "B6");

		/*Stream<String> concat = Stream.concat(list1.stream(), list2.stream());
		concat.forEach(s -> System.out.println(s));*/
		
		// Predicate<String> pre = e -> e.startsWith("A");

		// long count = list12.stream().filter(e -> e.startsWith("M")).count();
		// System.out.println(count);

		// list23.stream().sorted().forEach(s -> System.out.println(s));

		/*List<Book> list1 = new ArrayList<>();
		List<Book> list2 = new ArrayList<>();
		{
			list1.add(new Book("Core Java", 200));
			list1.add(new Book("Spring MVC", 300));
			list1.add(new Book("Learning Freemarker", 150));

			list2.add(new Book("Core Java", 200));
			list2.add(new Book("Spring MVC", 300));
			list2.add(new Book("Learning Hibernate", 400));
		}

		List<Book> result = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		result.forEach(b -> System.out.println(b.getName() + " " + b.getPrice()));

		// System.out.println(result);
	}*/

		List<Integer> list = Arrays.asList(3, 5, 6);
		// boolean allMatch = list.stream().allMatch(p -> p % 2 == 0);
		int collect = list.stream().collect(Collectors.summingInt(s -> s));
		System.out.println(collect);
}
}

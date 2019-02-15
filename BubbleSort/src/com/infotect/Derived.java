package com.infotect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.infotect.Emp_Comparator.CustomComparator;

class Derived extends Base {

	public void f1() {
		System.out.println("Child");
	}

	public static void main(String[] args) {
		List<Emp_Comparator> al = new ArrayList<>();
		Emp_Comparator obj1 = new Emp_Comparator("Ajay", 27);
		Emp_Comparator obj2 = new Emp_Comparator("Sneha", 23);
		Emp_Comparator obj3 = new Emp_Comparator("Simran", 37);
		Emp_Comparator obj4 = new Emp_Comparator("Ajay", 22);
		Emp_Comparator obj5 = new Emp_Comparator("Ajay", 29);
		Emp_Comparator obj6 = new Emp_Comparator("Sneha", 22);

		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);

		Iterator<Emp_Comparator> custIterator = al.iterator();

		System.out.println("Before Sorting:\n");
		while (custIterator.hasNext()) {
			System.out.println(custIterator.next());
		}

		Collections.sort(al, new CustomComparator());

		System.out.println("\n\nAfter Sorting:\n");
		for (Emp_Comparator customer : al) {
			System.out.println(customer);
		}

	}

}

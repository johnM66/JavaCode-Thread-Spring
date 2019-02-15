package com.infotect;

import java.util.Comparator;

public class Emp_Comparator {

	private String name;
	private int age;

	public Emp_Comparator(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Emp_Comparator [name=" + name + ", age=" + age + "]";
	}

	static class CustomComparator implements Comparator<Emp_Comparator> {

	@Override
	public int compare(Emp_Comparator e1, Emp_Comparator e2) {
			int NameCompare = e1.getName().compareTo(e2.getName());
			int ageCompare = e1.getAge().compareTo(e2.getAge());
           if(NameCompare==0) {
				return ((ageCompare == 0) ? NameCompare : ageCompare);
           }
			else {
				return NameCompare;
			}
	}
}
}

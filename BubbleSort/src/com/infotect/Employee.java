package com.infotect;

public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	public int id;
	public String name;
	public int sal;

	public Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

}

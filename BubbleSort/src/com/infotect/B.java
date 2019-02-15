package com.infotect;

abstract class Demo {

	public int a;

	Demo() {
		a = 10;
	}

	abstract public void set();

	abstract public void get();


}

public class B extends Demo {

	public void set(int a) {
		this.a = a;
	}

	public void get() {
		System.out.println("a = " + a);
	}

	public static void main(String[] args)
    {
		B obj = new B();
        obj.set(20);
        obj.get();
    }

	@Override
	public void set() {
		// TODO Auto-generated method stub

	}

}
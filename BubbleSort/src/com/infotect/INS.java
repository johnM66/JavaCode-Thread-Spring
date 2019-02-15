package com.infotect;

public class INS {
	int a = 10;

	static {
		System.out.println("SSSSSSSSSSSSSSSSSSS");
	}

	INS() {
		System.out.println("VVVVVVVVVVVVVVVVVVVVVV");

	}

	{
		a = 30;
		System.out.println("aaaaaaaaaaaaaaaaaaaaaa");
		m();
	}

	public void m() {
		// a = 20;
		System.out.println("CCCCCCCCCCCCCCCCCCCCCCC" + a);
	}

	public static void main(String[] args) {
		INS i = new INS();

		/*
		 * Integer b = 2; Integer c = 200; Integer d = 2; Integer e = 200;
		 * System.out.println(b == d); System.out.println(c == e);
		 */

	}
}

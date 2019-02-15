package com.infotect;

import java.util.ArrayList;
import java.util.List;

public class MainB {
	public static void main(String[] args) {
		B b = new B();

		// String str = b.getStr();
		// System.out.println(str);

		List<String> list = new ArrayList<String>();
		b.setStr("b");
		list.addAll(b);

	}
}

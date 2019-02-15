package com.infotect;

public class OverLoading {
   public int sum(int a,int b) {
	   int sum = a+b; 
		System.out.println("1");
       return sum; 
   }
   
	public double add(int a, int b) {
	   double sum = a+b+0.0; 
		System.out.println("2");
       return sum;
   }

	public void test(String s) {

		System.out.println("3" + s);

	}

	public void test(Object s) {

		System.out.println("d" + s);
	}

	public static void main(String[] args) {
		OverLoading o = new OverLoading();
		double add2 = o.add(1, 2);
		// double add = o.add(11, 11);
		o.test(null);

		String str = "manas";
		String str1 = "manas1";

		if (str == str1) {
			System.out.println("checked");
		}

		// System.out.println();
		// System.out.println(add2);
	}
}

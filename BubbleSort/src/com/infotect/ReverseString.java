package com.infotect;

public class ReverseString {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 6, 3, 5, 6, 8, 1, 8, 9, 4, 9 };
		String str = "manas9768";
		String reverse = "";
		int number = 456;
		int n = 5;
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		// String result = recursiveString(str);
		// System.out.println(reverse + " " + result);
		// reversertheNumber(number);
		// fibonacci(n);
		// primeNumbers(n);
		// int fact = factorialNumber(n);
		// System.out.println(fact);
		// removeDuplicate(arr);
		/*
		 * selectionSort(arr); for (int i : arr) { System.out.print(i + "\n"); }
		 */
		// smallestArray(arr);
		// recurisveFabbo(10);
		for (int i = 2; i <= 10; i++) {
			int recurisveFabbo = recurisveFabbo(i);
			System.out.print(recurisveFabbo + " ");
		}
	}

	private static int recurisveFabbo(int i) {
		if (i == 1 || i == 2) {
			return 1;
		}
		return recurisveFabbo(i - 1) + recurisveFabbo(i - 2);

	}

	private static void smallestArray(int[] arr) {
		int min = arr[0];
		int largest=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			else if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println(min + " " + largest);

	}

	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
					int temp = arr[min];
					arr[min] = arr[i];
					arr[i] = temp;
				}
			}
		}

	}




	private static void removeDuplicate(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = arr[arr.length - 1];
					len--;
					j--;
				}
			}
		}
	}

	private static int factorialNumber(int n) {
		if (n == 1) {
			return n;
		}
		return n * factorialNumber(n - 1);

	}

	private static void primeNumbers(int n) {
		int flag = 0;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println("Not Prime");
				flag = 1;
				break;
			}

		}
		if (flag == 0) {
			System.out.println("Prime");
		}
	}

	private static void fibonacci(int n) {
		int first = 0, second = 1;
		for (int i = 0; i < n; i++) {
			int temp = first + second;
			first = second;
			second = temp;
			System.out.println(temp + " ");

		}

	}

	private static void reversertheNumber(int number) {
		int sum = 0;
		int rev = number;
		while (number > 0) {
			rev = number % 10;
			sum = sum * 10 + rev;
			number = number / 10;

		}
		System.out.println(sum);

	}

	private static String recursiveString(String str) {
		if (str.isEmpty())
			return str;

		return recursiveString(str.substring(1)) + str.charAt(0);
	}

}

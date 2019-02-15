package com.infotect;

import java.util.LinkedList;
import java.util.List;

public class MainThread {
	public static void main(String[] args) {
		List<Integer> sharedQueue = new LinkedList<Integer>();
		Producer produce = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);

		Thread t1 = new Thread(produce);
		Thread t2 = new Thread(consumer);
		t1.start();
		t2.start();
	}
}

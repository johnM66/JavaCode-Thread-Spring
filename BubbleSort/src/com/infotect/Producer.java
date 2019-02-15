package com.infotect;

import java.util.List;

public class Producer implements Runnable {
	List<Integer> sharedQueue;
	int max_size = 3;

	public Producer(List<Integer> sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void produce(int i) throws InterruptedException {
		synchronized (sharedQueue) {
			while (sharedQueue.size() == max_size) {
				System.out.println("Queue is full");
				sharedQueue.wait();
			}

			synchronized (sharedQueue) {
				System.out.println("Produced:" + i);
				sharedQueue.add(i);
				Thread.sleep(1000);
				sharedQueue.notify();
			}

		}
	}
}

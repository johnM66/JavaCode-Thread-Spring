package com.infotect;

import java.util.List;

public class Producer_1 implements Runnable {

	private List<Integer> sharedQueue;
	private int maxSize = 2;

	public Producer_1(List<Integer> sharedQueue, int maxSize) {
		super();
		this.sharedQueue = sharedQueue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				produce(i);
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void produce(int i) throws InterruptedException {
		synchronized (sharedQueue) {
			while (sharedQueue.size() == maxSize) {
				System.out.println("Queue is full, producerThread is waiting for "
						+ "consumerThread to consume, sharedQueue's size= " + maxSize);
				sharedQueue.wait();
			}
		}

		synchronized (sharedQueue) {

			sharedQueue.add(i);
			sharedQueue.notify();

		}

	}

}

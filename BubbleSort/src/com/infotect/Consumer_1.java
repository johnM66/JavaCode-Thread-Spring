package com.infotect;

import java.util.List;

public class Consumer_1 implements Runnable {

	private List<Integer> sharedQueue;
	private int maxSize = 2;

	public Consumer_1(List<Integer> sharedQueue, int maxSize) {
		super();
		this.sharedQueue = sharedQueue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 5; i++) {
			try {
				consume(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void consume(int i) throws InterruptedException {
		synchronized (sharedQueue) {
			while (sharedQueue.size() == 0) {
				System.out.println("Queue is full, producerThread is waiting for "
						+ "consumerThread to consume, sharedQueue's size= " + maxSize);
				sharedQueue.wait();

			}
		}
		
		
		synchronized (sharedQueue) {

			sharedQueue.remove(0);
			sharedQueue.notify();

		}

	}

}

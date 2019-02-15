package com.infotect;

import java.util.List;

public class Consumer implements Runnable {
	List<Integer> sharedQueue;

	public Consumer(List<Integer> sharedQueue) {
		super();
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				consumar(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void consumar(int i) throws InterruptedException {
		synchronized (sharedQueue) {
			while (sharedQueue.size() == 0) {
				System.out.println("Queue is empty, consumerThread is waiting for "
						+ "producerThread to produce, sharedQueue's size= 0");
				sharedQueue.wait();
			}
		}
		synchronized (sharedQueue) {
			Thread.sleep(1000);
			System.out.println("CONSUMED : " + sharedQueue.remove(0));
			sharedQueue.notify();

		}

	}

}

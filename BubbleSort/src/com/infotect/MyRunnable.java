package com.infotect;

import java.util.concurrent.Phaser;

public class MyRunnable implements Runnable {

	Phaser phaser;

	public MyRunnable(Phaser phaser, String name) {
		super();
		this.phaser = phaser;
		this.phaser.register();
		System.out.println(name + " - New unarrived party has " + "been registered with phaser");
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " - party has arrived and is working in " + "Phase-"
				+ phaser.getPhase());
		phaser.arriveAndAwaitAdvance();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}



}

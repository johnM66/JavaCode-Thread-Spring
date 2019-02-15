package com.infotect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Phaser;

public class PhaserExample {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Phaser phaser = new Phaser(1);
		System.out
				.println("new phaser with 1 registered unArrived parties" + " created and initial phase  number is 0 ");

		Thread thread1 = new Thread(new MyRunnable(phaser, "first"), "Thread-1");
		Thread thread2 = new Thread(new MyRunnable(phaser, "second"), "Thread-2");
		Thread thread3 = new Thread(new MyRunnable(phaser, "third"), "Thread-3");
		thread1.start();
		thread2.start();
		thread3.start();
		Constructor<PhaserExample> declaredConstructor = PhaserExample.class.getDeclaredConstructor();
		PhaserExample newInstance = declaredConstructor.newInstance();
		int hashCode = newInstance.hashCode();

		System.out.println(hashCode);
	}



}

package com.infotect;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Caal {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Set<Callable<String>> callables = new HashSet<Callable<String>>();
		
		callables.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "Manas";
			}
			
		});

		callables.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "Kumar";
			}

		});

		callables.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "MAity";
			}

		});

		List<Future<String>> invokeAny = executorService.invokeAll(callables);
		invokeAny.forEach(F -> {
			try {
				System.out.println(F.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		// System.out.println(invokeAny);
		executorService.shutdown();
	}

}

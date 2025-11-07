package com;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableDemo {
	public static void main(String [] args) throws InterruptedException, ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(4);
		
		CompletableFuture.supplyAsync(
				() -> {
					System.out.println("Cáculo 1 en " + Thread.currentThread().getName());
					return 5;
				},pool)
		.thenApply(x -> x * 2)
		.thenAcceptAsync( 
				resultado -> System.out.println("Resultado final " + resultado), pool)
				.get();
		pool.shutdown();
		
		
	}
}

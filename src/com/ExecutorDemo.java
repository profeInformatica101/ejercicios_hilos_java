package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {
	public static void main(String [] args) throws InterruptedException {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		for(int i=1; i <=5; i++) {
			pool.submit(new Hilo("tarea-" + i));
		}
		pool.shutdown();
		pool.awaitTermination(3, TimeUnit.SECONDS);
		System.out.println("Todas las tareas completadas");
	}

}

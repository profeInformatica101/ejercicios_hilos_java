package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimuladorHilos {
	public static void main(String [] args) {
		nHilos(100);
	}
	public static void nHilos(int n) {
		List<Thread> lista = new ArrayList<>();
		
		// Crear los hilos
		for(int i = 1; i <= n ; i++) {
			Thread t = new Thread(new Hilo("Hilo "+ i));
			lista.add(t);
		}
		
		// Mezclar orden de ejecución
		Collections.shuffle(lista);
		
		//Ejecutar aleatoriamente
		for(Thread t:lista) {
			t.start();
			try {
				Thread.sleep((int)(Math.random()*300));
			}catch(InterruptedException e) {}
		}
		
		for(Thread t : lista) {
			try {
				t.join();
			}catch(InterruptedException ignored) {}
		}
		
		System.out.println("Todos los hilos han terminado su ejecución");
	}
	

}

package com;

public class Ejercicio3 {
	public static void main(String [] args) {
		//Crea un hilo que imprima los números del 1 al 5
		// haciendo una pausa de 1 segundo entre cada número.
		
		Thread hilo = new Thread(
				()->{
					for(int i=1; i<=5; i++) {
						System.out.println("Soy " + Thread.currentThread().getName());
						System.out.println("i: "+ i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							
						}
					}
				}
				);
		hilo.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Soy " + Thread.currentThread().getName() + ", i: "+ i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

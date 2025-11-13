package com;
/**
 * Crea un hilo que imprima su nombre cada vez que se ejecuta (por ejemplo, "Ejecutando: Hilo-Usuario").


 */
public class Ejercicio2 {
	

	
	public static void main(String [] args) {
		Runnable r1 = ()->{ System.out.println("##" + Thread.currentThread().getName());};	
		Thread hilo = new Thread(r1);
		hilo.setName("Hilo-Usuario");
		hilo.start();
		Thread hilo2 = new Thread(r1);
		hilo2.setName("Otro-usuario");
		hilo2.start();
		
	}
	
}

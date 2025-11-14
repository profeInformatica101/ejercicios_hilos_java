package com;
/**
 * Ejercicio 7 · Interrumpiendo hilos interrupt() isInterrupted()
Crea un hilo que cuente indefinidamente y, desde el hilo principal, 
interrúmpelo después de unos segundos para que termine de forma limpia.
 */
public class Ejercicio7 {
	public static void main(String [] args) {
		//Crea un hilo que cuente indefinidamente y, desde el hilo principal, 
		Thread hilo = new Thread(()->{
			int contador = 0;
			//En el hilo, usa un bucle while (!Thread.currentThread().isInterrupted()).
			//Dentro del bucle, imprime un contador y haz sleep(500).

				try {
					while(true) {
						contador++;
						System.out.println("Contador: "+ contador);
					Thread.sleep(500);
					}
				} catch (InterruptedException e) {
					
					
					/*Thread.currentThread().interrupt();*/
				}
			
			
			System.out.println("El hilo finalizo");
		});
		
		
		//En el main, tras start(), espera con sleep(2000) y luego llama a t.interrupt().
		hilo.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		hilo.interrupt();

		//Maneja InterruptedException terminando el hilo con un mensaje claro.
	}
}

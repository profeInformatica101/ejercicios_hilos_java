package com;
//Muestra los estados de un hilo antes de arrancar, 
//mientras está trabajando y una vez que ha terminado.

public class Ejercicio4 {

	public static void main(String [] args) {
		//Crea un Thread cuyo run() haga sleep(500).
		Thread hilo = new Thread(()->{
			System.out.println("Hilo: ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		//Antes de start(): muestra t.getState() (debería ser NEW).
		System.out.println("Estado antes de start()" + hilo.getState());
				
		//Tras start(), imprime getState() y isAlive().
		hilo.start();
		System.out.println("Después de start()" + hilo.getState());
		System.out.println("is Alive?" + hilo.isAlive());
		
		
		//Después de join(), verifica que el estado es TERMINATED y isAlive() == false.
		try {
			hilo.join();
			System.out.println("Después de join()" + hilo.getState());
			System.out.println("is Alive?" + hilo.isAlive());
			
		}catch(InterruptedException iex) {
			
		}
	}
}

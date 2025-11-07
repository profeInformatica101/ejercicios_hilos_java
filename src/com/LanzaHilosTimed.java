package com;

public class LanzaHilosTimed {
	public static void main(String [] args) throws InterruptedException {
		Thread t = new Thread( () -> {
				try {
					//El hilo se bloque en TIMED_WAITING durante 2 segundos
					Thread.sleep(2000);
				}catch(InterruptedException ignored) {}
				}, "tiempo"	);
		t.start(); // h comienza a ejecutarse
		Thread.sleep(50); // le damos tiempo para entrar en sleep
		//Thread.sleep(1);
		System.out.println(t.getName()  + " --> " + t.getState()); // TIMED_WAITING O RUNNEABLE según el timming
	}
}

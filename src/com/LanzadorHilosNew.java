package com;

public class LanzadorHilosNew {
	public static void main(String [] args) throws InterruptedException{
		Thread h = new Thread(new Hilo("nuevo"));
		System.out.println(h.getName() + "---> "+ h.getState());

	}
}

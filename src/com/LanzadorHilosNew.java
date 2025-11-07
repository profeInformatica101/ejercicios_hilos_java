package com;

public class LanzadorHilosNew {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		Thread h = new Thread(new Hilo("runneable"));
		h.start();
	 
		System.out.println(h.getName() + " ---> " + h.getState());
		Thread.sleep(50);	
		
	}

}

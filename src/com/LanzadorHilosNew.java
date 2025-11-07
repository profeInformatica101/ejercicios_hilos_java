package com;

public class LanzadorHilosNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread h = new Thread(new Hilo("nuevo"));
		
		System.out.println(h.getName() + "---> " + h.getState());
		
	}

}

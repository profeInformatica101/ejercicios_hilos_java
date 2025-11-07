package com;

public class LanzadorProcesos {
	public static void main(String [] args) {
		// Definimos los comandos que queremos ejecutar
		String[][] comandos={{"ping", "-c", "2", "google.com"}, {"java", "-version"}, {"ls", "-l"}};
		for(String [] comando : comandos) {
			Thread hilo = new Thread(()-> ejec
		}
	}
}

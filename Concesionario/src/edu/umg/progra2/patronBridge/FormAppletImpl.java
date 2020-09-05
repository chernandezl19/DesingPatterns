package edu.umg.progra2.patronBridge;
import java.util.Scanner;
public class FormAppletImpl implements FormularioImpl{

	Scanner reader = new Scanner (System.in);
	
	public String administraZonaIndicada() {
		return reader.next();
	}

	
	public void dibujaTexto(String texto) {
		System.out.println("Applet: " + texto);
		
	}

	
}

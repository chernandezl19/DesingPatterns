package mediador;

import java.util.Scanner;

public class ZonaInformacion extends Control{
	
	Scanner reader = new Scanner(System.in);
	
	public ZonaInformacion(String nombre) {
		super(nombre);
	}
	
	public void informa() {
		System.out.println(String.format("Información de: %s", nombre));
		setValor(reader.nextLine());
		this.modifica();
	}
}
package edu.umg.progra2.proxy;

import edu.umg.progra2.proxy.Animacion;

public class Video implements Animacion {
	public void clic() {
	}

	public void dibuja() {
		System.out.println("Mostrar el v�deo");
	}

	public void carga() {
		System.out.println("Cargar el v�deo");
	}

	public void reproduce() {
		System.out.println("Reproducir el v�deo");
	}
}

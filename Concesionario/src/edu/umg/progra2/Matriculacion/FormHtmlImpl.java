package edu.umg.progra2.Matriculacion;

import java.util.Scanner;

public class FormHtmlImpl implements FormularioImpl{
	Scanner reader = new Scanner(System.in);
	@Override
	public void dibujaTexto(String texto) {
		// TODO Auto-generated method stub
		System.out.println("HTML: " + texto);
	}

	@Override
	public String administraZonaIndicada() {
		// TODO Auto-generated method stub
		return reader.next();
	}
}

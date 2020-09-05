package edu.umg.progra2.observador;

import java.util.*;

public abstract class Sujeto{
	protected List<Observador> observadores = new ArrayList<Observador>();
	
	public void agrega(Observador observador) {
		observadores.add(observador);
	}
	
	public void suprime(Observador observador) {
		observadores.remove(observador);
	}
	
	public void notifica() {
		for(Observador observador: observadores)
			observador.actualiza();
	}
	
	
	
}


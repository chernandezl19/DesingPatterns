package edu.umg.progra2.documentacion;

import java.util.ArrayList;
import java.util.List;

public abstract class Documentacion {

	public List<String> contenido = new ArrayList<String>();
	
	public abstract void agregarDocumento (String documento);
	
	public abstract void imprime();
}

package edu.umg.progra2.patronBridge;

public abstract class FormularioMatriculacion {
	
protected String contenido;
protected FormularioImpl implementacion;

public FormularioMatriculacion (FormularioImpl implementacion) {
	this.implementacion = implementacion;
}

public void visualiza() {
	implementacion.dibujaTexto("n�mero de matricula existente");
}

public void generaDocumento() {
	implementacion.dibujaTexto("Solicitiud de matriculaci�n");
	implementacion.dibujaTexto("n�mero de matricula: "+ contenido);
}

public boolean administraZona() {
	contenido =implementacion.administraZonaIndicada();
	return this.controlZona(contenido);
}
protected abstract boolean controlZona (String matricula);
}

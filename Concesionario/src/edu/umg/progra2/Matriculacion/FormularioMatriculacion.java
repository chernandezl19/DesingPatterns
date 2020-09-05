package edu.umg.progra2.Matriculacion;

public abstract class FormularioMatriculacion {
	protected String contenido;
	protected FormularioImpl implementacion;
	protected abstract boolean controlZona(String matriculacion);
	
	public FormularioMatriculacion(FormularioImpl implementacion) {
		this.implementacion = implementacion;		
	}
	public void visualiza() {
		implementacion.dibujaTexto("Numero de matricula Existente: ");	
	}
	public void generarDocumento() {
		implementacion.dibujaTexto("Solicitud de Matriculacion: ");
		implementacion.dibujaTexto("Numero de matricula: " + contenido);
	}
	public boolean administraZona() {
		contenido = implementacion.administraZonaIndicada();
		return this.controlZona(contenido);		
	}
}

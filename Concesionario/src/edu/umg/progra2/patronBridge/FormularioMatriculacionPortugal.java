package edu.umg.progra2.patronBridge;

public class FormularioMatriculacionPortugal extends FormularioMatriculacion{

	public FormularioMatriculacionPortugal (FormularioImpl implementacion) {
		super (implementacion);
	}
	
	protected boolean controlZona (String matricula) {
		return matricula.length()==6;
	}
	
}

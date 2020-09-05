package edu.umg.progra2.patronBridge;

public class FormularioMatriculacionEspaña extends FormularioMatriculacion {

	public FormularioMatriculacionEspaña (FormularioImpl implementacion) {
		super(implementacion);
	}

	protected boolean controlZona (String matricula) {
		return matricula.length()==7;
	}
}

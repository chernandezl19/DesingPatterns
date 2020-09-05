package edu.umg.progra2.Matriculacion;

public class FormularioMatriculacionPortugal extends FormularioMatriculacion{

	public FormularioMatriculacionPortugal(FormularioImpl implementacion) {
		super(implementacion);
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	protected boolean controlZona(String matriculacion) {
		// TODO Auto-generated method stub
		return matriculacion.length() == 6;
	}

}

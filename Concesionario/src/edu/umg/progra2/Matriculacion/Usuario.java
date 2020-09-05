package edu.umg.progra2.Matriculacion;

public class Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FormularioMatriculacionPortugal formulario1 = new FormularioMatriculacionPortugal (new FormAppletImpl());
		formulario1.visualiza();
		if (formulario1.administraZona())
			formulario1.generarDocumento();
		System.out.println();
		FormularioMatriculacionEspaña formulario2 = new FormularioMatriculacionEspaña (new FormAppletImpl());
		formulario2.visualiza();
		if (formulario2.administraZona())
			formulario2.generarDocumento();
	}
}

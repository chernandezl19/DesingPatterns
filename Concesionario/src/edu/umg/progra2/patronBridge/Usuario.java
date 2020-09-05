package edu.umg.progra2.patronBridge;

public class Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	FormularioMatriculacionPortugal formulario1=new 
			FormularioMatriculacionPortugal (new FormHtmlImpl());
	formulario1.visualiza();
	
	if(formulario1.administraZona()) 
		formulario1.generaDocumento();
		System.out.println();
		
		FormularioMatriculacionEspaña formulario2=new 
				FormularioMatriculacionEspaña (new FormAppletImpl());
		formulario2.visualiza();
	
	if(formulario2.administraZona()) 
		formulario2.generaDocumento();
	}
}

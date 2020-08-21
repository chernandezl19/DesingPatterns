package edu.umg.progra2.documentacion;

public class DocumentacionTXT extends Documentacion{
	
	public void agregarDocumento(String documento) {
		if (documento.startsWith("<TXT>")) contenido.add(documento);
	}
	
	public void imprime() {
		System.out.println("DOCUMENTO TXT");
		for(String s: contenido) System.out.println(s);
	}
}

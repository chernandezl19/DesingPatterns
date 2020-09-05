package edu.umg.progra2.documentacion;

public class DocumentacionTxt extends Documentacion{
	
	
	
	@Override
	public void agregarDocumento(String documento) {
		if (documento.startsWith("<txt>"))
			contenido.add(documento);

	}

	@Override
	public void imprime() {
		System.out.println("DOCUMENTO txt");
		for (String s: contenido) {
			System.out.println(s);
		}

	}

}

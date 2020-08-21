package edu.umg.progra2.documentacion;

public class DocumentacionPDF extends Documentacion {

	@Override
	public void agregarDocumento(String documento) {
		if (documento.startsWith("<PDF>"))
			contenido.add(documento);

	}

	@Override
	public void imprime() {
		System.out.println("DOCUMENTO PDF");
		for (String s: contenido) {
			System.out.println(s);
		}

	}

}

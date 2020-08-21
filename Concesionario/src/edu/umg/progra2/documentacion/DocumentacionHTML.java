package edu.umg.progra2.documentacion;

public class DocumentacionHTML extends Documentacion {

	@Override
	public void agregarDocumento(String documento) {
		if (documento.startsWith("<HTML>"))
			contenido.add(documento);

	}

	@Override
	public void imprime() {
		System.out.println("DOCUMENTO HTML");
		for (String s: contenido) {
			System.out.println(s);
		}

	}

}

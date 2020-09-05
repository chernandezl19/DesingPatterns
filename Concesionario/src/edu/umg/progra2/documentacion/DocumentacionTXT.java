package edu.umg.progra2.documentacion;

public class DocumentacionTXT extends Documentacion{

	@Override
	public void agregarDocumento(String documento) {
		// TODO Auto-generated method stub
		if (documento.startsWith("<TXT>"))
			contenido.add(documento);
	}

	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		System.out.println("DOCUMENTO TXT");
		for (String s: contenido) {
			System.out.println(s);
		}

	}

}

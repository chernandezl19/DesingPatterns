package edu.umg.progra2.documentacionCliente;

import java.util.ArrayList;

public class DocumentacionEnBlanco extends Documentacion {
	
	public static DocumentacionEnBlanco _instance = null;
	
	private DocumentacionEnBlanco() {
		documentos = new ArrayList<Documento>();
	}

	public static DocumentacionEnBlanco Instance() {
		if (_instance==null) {
			_instance = new DocumentacionEnBlanco();
		}
		return _instance;
	}
	
	public void incluye(Documento documento) {
		documentos.add(documento);
	}
	public void excluye(Documento documento) {
		documentos.remove(documento);
	}
}

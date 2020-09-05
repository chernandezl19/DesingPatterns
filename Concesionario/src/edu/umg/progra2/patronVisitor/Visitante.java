package edu.umg.progra2.patronVisitor;

public interface Visitante {
	void visita(EmpresaSinFilial empresa);
	void visita(EmpresaMadre empresa);
}

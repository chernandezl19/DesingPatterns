package edu.umg.progra2.patronVisitor;

public class EmpresaSinFilial extends Empresa {
	public EmpresaSinFilial(String nombre, String email, String direccion) {
		super(nombre, email, direccion);
	}

	public void aceptaVisitante(Visitante visitante) {
		visitante.visita(this);
	}

	public boolean agregaFilial(Empresa filial) {
		return false;
	}
}

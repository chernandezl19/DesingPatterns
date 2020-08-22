package edu.umg.progra2.documentacionCliente;

public abstract class Documento implements Cloneable {
	
	protected String contenido = new String();
	public Documento duplica() {
		try {
			Documento resultado = (Documento) this.clone();
			return resultado;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void rellena(String informacion) {
		contenido = informacion;
	}

	public abstract void imprime();
	public abstract void visualiza();
}

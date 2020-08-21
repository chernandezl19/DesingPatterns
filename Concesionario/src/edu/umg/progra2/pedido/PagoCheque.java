package edu.umg.progra2.pedido;

public class PagoCheque extends Pedido{
	
	public PagoCheque(double importe) {
		super(importe);
	}
	
	public boolean valida() {
		return true;
	}
	
	public void paga() {
		System.out.println("El pago del pedido por importe de: " + importe + " se ha realizado con exito.");
	}
}

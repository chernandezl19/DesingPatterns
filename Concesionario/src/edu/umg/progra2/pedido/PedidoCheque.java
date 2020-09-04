package edu.umg.progra2.pedido;

public class PedidoCheque extends Pedido{
	public PedidoCheque(double importe) {
		super(importe);
	}
	
	public boolean valida() {
		return (importe >= 2000.0 && importe <= 10000);
	}
	
	public void paga() {
		System.out.println("El pedido a cheque de :" + importe + " se ha realizado.");
	}
		
}

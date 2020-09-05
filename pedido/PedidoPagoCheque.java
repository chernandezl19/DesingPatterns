package edu.umg.progra2.pedido;

public class PedidoPagoCheque extends Pedido {

	public PedidoPagoCheque(double importe) {
		super(importe);
	}

	@Override
	public boolean valida() {
		return (importe >= 1000.0 && importe <= 5000);
	}

	@Override
	public void paga() {
		System.out.println("El pedido a cheque de :" + importe + " se ha realizado.");

	}

}

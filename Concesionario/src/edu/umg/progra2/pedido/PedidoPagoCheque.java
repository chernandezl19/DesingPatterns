package edu.umg.progra2.pedido;

public class PedidoPagoCheque extends Pedido{
	
	public PedidoPagoCheque(double importe) {
		super(importe);
	}
	@Override
	public boolean valida() {
		return true;
	}

	@Override
	public void paga() {
		System.out.println("El pedido de pago con Cheque :" + importe + " se ha realizado.");
		
	}

}

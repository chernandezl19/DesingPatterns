package edu.umg.progra2.pedido;

public class PedidoPagoCheque extends Pedido{

	public PedidoPagoCheque(double importe) {
		super(importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean valida() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void paga() {
		// TODO Auto-generated method stub
		System.out.println("El pedido pago con Cheque de :" +importe+ " se ha realizado.");
	}

}

package edu.umg.progra2.pedido;

public class PedidoCheque extends Pedido {

	public PedidoCheque(double importe) {
		super(importe);
	}

	@Override
	public boolean valida() {
		// TODO Auto-generated method stub
		return importe>=5000;
	}

	@Override
	public void paga() {
		// TODO Auto-generated method stub
		System.out.println("el pago del pedido por importe de: "+importe+"se ha realizado con exito");

	}

}

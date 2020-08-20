package edu.umg.progra2.pedido;

public class PedidoCheque extends Pedido {

    public PedidoCheque(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return (importe>=50000 && importe<=100000);
    }

    @Override
    public void paga() {
        System.out.println("El pedido a cheque de " + importe + " ha sido procesado con exito");
    }
}

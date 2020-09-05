package prograumg;

public class PedidoCheque extends Pedido {
public PedidoCheque(double importe) {
super(importe);
}
@Override
public boolean valida() {
return true;
}
@Override
public void paga() {
System.out.println("el pago del pedido por cheque de: " + importe + " se ha
realizado con exito");
}
}

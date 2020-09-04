package edu.umg.edu.estructuracion_y_comportamiento;

public class Usuario {

	public static void main(String[] args) 
	{
		Pedido PedidoEspaña = new PedidoEspaña();
		PedidoEspaña.setImporteSinIVA(10000);
		PedidoEspaña.calculaPrecioConIVA();
		PedidoEspaña.visualiza();
		
		
		Pedido PedidoLuxemburgo = new PedidoLuxemburgo();
		PedidoLuxemburgo.setImporteSinIVA(10000);
		PedidoLuxemburgo.calculaPrecioConIVA();
		PedidoLuxemburgo.visualiza();
	}
}

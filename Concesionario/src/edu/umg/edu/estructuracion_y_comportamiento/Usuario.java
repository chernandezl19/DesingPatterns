package edu.umg.edu.estructuracion_y_comportamiento;

public class Usuario {

	public static void main(String[] args) 
	{
		Pedido PedidoEspa�a = new PedidoEspa�a();
		PedidoEspa�a.setImporteSinIVA(10000);
		PedidoEspa�a.calculaPrecioConIVA();
		PedidoEspa�a.visualiza();
		
		
		Pedido PedidoLuxemburgo = new PedidoLuxemburgo();
		PedidoLuxemburgo.setImporteSinIVA(10000);
		PedidoLuxemburgo.calculaPrecioConIVA();
		PedidoLuxemburgo.visualiza();
	}
}

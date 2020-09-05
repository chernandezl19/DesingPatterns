package edu.umg.progra2.patronCommand;
import java.util.*;
public class SolicitudRebaja {
	
	protected List<Vehiculo> vehiculosEnStock =
			new ArrayList <Vehiculo>();
	protected long hoy;
	protected long tiempoEnStock;
	protected double tasaDescuento;
	
	public SolicitudRebaja(long hoy, long tiempoEnStock,
			double tasaDescuento) {
		this.hoy=hoy;
		this.tiempoEnStock=tiempoEnStock;
		this.tasaDescuento=tasaDescuento;
	}
	
	public void rebaja(List<Vehiculo> vehiculos) {
		vehiculosEnStock.clear();
		for (Vehiculo vehiculo: vehiculos)
			if (vehiculo.getTiempoEnStock(hoy) >=tiempoEnStock)
				vehiculosEnStock.add(vehiculo);
		for (Vehiculo vehiculo: vehiculosEnStock)
			vehiculo.modificaPrecio(1.0 - tasaDescuento);
	}
	
	public void anula(){
		for (Vehiculo vehiculo: vehiculosEnStock)
			vehiculo.modificaPrecio(1.0 / (1.0 - tasaDescuento));
	}
	
	public void restablece() {
		for (Vehiculo vehiculo: vehiculosEnStock)
			vehiculo.modificaPrecio(1.0 - tasaDescuento);
	}
}

package edu.umg.progra2.patronCommand;

public class Usuario {
	
	public static void main (String [] args) {
		
		Vehiculo vehiculo1 = new Vehiculo("A01", 1, 1000.0);
		Vehiculo vehiculo2 = new Vehiculo("A11", 6, 2000.0);
		Vehiculo vehiculo3 = new Vehiculo("Z03", 2, 3000.0);
		Catalogo catalogo = new Catalogo();
		catalogo.agrega(vehiculo1);
		catalogo.agrega(vehiculo2);
		catalogo.agrega(vehiculo3);
		System.out.println("Visualizacion inicial del catalogo");
		catalogo.visualiza();
		System.out.println();
		SolicitudRebaja solicitudRebaja = new SolicitudRebaja
				(10, 5, 0.1);
		catalogo.ejecutaSolicitudRebaja(solicitudRebaja);
		System.out.println("Visualizacion del catalogo tras " + 
		"ejecutar la primera solicitud");
		catalogo.visualiza();
		System.out.println();
		SolicitudRebaja solicitudRebaja2 = new SolicitudRebaja
				(10, 5, 0.5);
		catalogo.ejecutaSolicitudRebaja(solicitudRebaja2);
		System.out.println("Visualizacion del catalogo tras " + 
				"ejecutar la segunda solicitud");
		catalogo.visualiza();
		System.out.println();
		catalogo.anulaSolicitudRebaja(1);
		System.out.println("Visualizacion del catalogo tras " + 
				"anular la primera solicitud");
		catalogo.visualiza();
		System.out.println();
		catalogo.restableceSolicitudRebaja(1);
		System.out.println("Visualizacion del catalogo tras " + 
				"restablecer la primera solicitud");
		catalogo.visualiza();
		System.out.println();
	}

}

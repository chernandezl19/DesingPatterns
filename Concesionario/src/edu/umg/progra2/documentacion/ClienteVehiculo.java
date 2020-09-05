package edu.umg.progra2.documentacion;

import java.util.Scanner;

public class ClienteVehiculo {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ConstructorDocumentacionVehiculo constructor;
		System.out.println("GENERAR DOCUMENTACION");
		System.out.println("1. HTML");
		System.out.println("2. PDF");
		int opcion = reader.nextInt();
		if (opcion==1) {
			constructor = new ConstructorDocumentacionVehiculoHTML();
		}else {
			constructor = new ConstructorDocumentacionVehiculoPDF();
		}

		Vendedor vendedor = new Vendedor(constructor);
		Documentacion documentacion = vendedor.construye("Juan Perez");
		
		documentacion.imprime();
	}

}

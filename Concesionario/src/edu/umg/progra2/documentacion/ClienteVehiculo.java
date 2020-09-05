package edu.umg.progra2.documentacion;

import java.util.Scanner;

public class ClienteVehiculo {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ConstructorDocumentacionVehiculo constructor;
		System.out.println("GENERAR DOCUMENTACION");
		System.out.println("1. HTML");
		System.out.println("2. PDF");
		System.out.println("3. TXT");
		int opcion = reader.nextInt();
		if (opcion==1) {
			constructor = new ConstructorDocumentacionVehiculoHTML();
		}
		else if(opcion ==2) {
			constructor = new ConstructorDocumentacionVehiculoPDF();
		}
		else
		{
			constructor = new ConstructorDocumentacionVehiculoTXT();
		}

		Vendedor vendedor = new Vendedor(constructor);
		Documentacion documentacion = vendedor.construye("Juan Perez");
		
		documentacion.imprime();
	}

}

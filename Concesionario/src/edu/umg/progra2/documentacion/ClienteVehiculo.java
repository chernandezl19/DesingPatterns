package edu.umg.progra2.documentacion;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClienteVehiculo {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ConstructorDocumentacionVehiculo constructor = null;
		System.out.println("GENERAR DOCUMENTACION");
		System.out.println("1. HTML");
		System.out.println("2. PDF");
		System.out.println("3. TXT");
		int opcion = reader.nextInt();
		switch (opcion) {
			case 1:
				constructor = new ConstructorDocumentacionVehiculoHTML();
			break;
			
			case 2:
				constructor = new ConstructorDocumentacionVehiculoPDF();
			break;
				
			case 3:
				constructor = new ConstructorDocumentacionVehiculoTXT();
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.WARNING_MESSAGE);
			break;
		}

		try {
			Vendedor vendedor = new Vendedor(constructor);
			Documentacion documentacion = vendedor.construye("Juan Perez");
		
			documentacion.imprime();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error en la ejecucion", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}

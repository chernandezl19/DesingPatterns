package edu.umg.progra2.comercial;

public class TestComercial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comercial elComercial = Comercial.Istance();
		elComercial.setNombre("Excel Automotriz");
		elComercial.setDireccion("Guatemala");
		elComercial.setEmail("excel@gmail.com");
		visualiza();
	}

	public static void visualiza() {
		Comercial elComercial = Comercial.Istance();
		elComercial.visualiza();
	}
}

package com.umg.tarea6;

public class Cliente {
    public static void main(String[] args)
	{
	FabricaOpcion fabrica = new FabricaOpcion();

	VehiculoSolicitado vehiculo = new VehiculoSolicitado();

	vehiculo.agregaOpciones("air bag" , 80, fabrica);

	vehiculo.agregaOpciones("dirección asistida ", 90, fabrica);

	vehiculo.agregaOpciones("elevalunas eléctricos ", 85, fabrica);

	vehiculo.muestraOpciones();
	}
}

package AlquilerUnitario;

import vehiculo.Vehiculo;

public class AlquilerUnitario {

	private Vehiculo vehiculoAlquilado;
	private int cantidadDiasAlquiler;
	
	public AlquilerUnitario(Vehiculo vehiculoAlquilado, int cantidadDias) {
		
		this.vehiculoAlquilado = vehiculoAlquilado;
		this.cantidadDiasAlquiler = cantidadDias;
	}
	
}

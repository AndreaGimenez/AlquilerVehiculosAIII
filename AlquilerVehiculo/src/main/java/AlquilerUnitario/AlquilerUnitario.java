package AlquilerUnitario;

import vehiculo.Vehiculo;

public class AlquilerUnitario {
	
	private static Integer numeradorAlquileres = new Integer(0);
	
	private Vehiculo vehiculoAlquilado;
	private int cantidadDiasAlquiler;
	private int numeroDeAlquiler;
	
	public AlquilerUnitario(Vehiculo vehiculoAlquilado, int cantidadDias) {
		
		this.vehiculoAlquilado = vehiculoAlquilado;
		this.cantidadDiasAlquiler = cantidadDias;
		this.numeroDeAlquiler = numeradorAlquileres++;
	}

	public Vehiculo getVehiculo() {
		
		return this.vehiculoAlquilado ;
	}

	public Integer getCantidadDias() {
		
		return this.cantidadDiasAlquiler;
	}

	public int getNumeroAlquiler() {
		
		return this.numeroDeAlquiler;
	}

	public Integer obtenerPrecio() {
		
		return vehiculoAlquilado.obtenerPrecioPorDia(this.cantidadDiasAlquiler);
	
	}

}

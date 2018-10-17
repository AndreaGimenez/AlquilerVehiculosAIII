package Alquiler.java;

import java.util.ArrayList;
import java.util.Collection;

import AlquilerUnitario.AlquilerUnitario;

public class Alquiler {
	
	private Collection<AlquilerUnitario> alquileresDelClientes;
	
	public Alquiler() {
		this.alquileresDelClientes = new ArrayList<AlquilerUnitario>();
	}

	public Integer cantidadItems() {
		
		return ((Integer)alquileresDelClientes.size());
	}

	public void agregar(AlquilerUnitario unAlquilerUnitario) {
		
		alquileresDelClientes.add(unAlquilerUnitario);
	}
}

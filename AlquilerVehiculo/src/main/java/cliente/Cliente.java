package cliente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import Alquiler.java.Alquiler;
import AlquilerUnitario.AlquilerUnitario;

public class Cliente {

	private static Integer numerador = new Integer(0);
	
	private Integer numero;
	private String nombre;
	private Collection<Alquiler> alquileresDelCliente;
	
	
	public Cliente(String nombre) {
		
		this.numero = ++numerador;
		this.nombre = nombre;
		this.alquileresDelCliente = new ArrayList<Alquiler>();
		
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public String getNombre() {
		return nombre;
	}

	public Collection<Alquiler> obtenerAlquileres() {
		// TODO Auto-generated method stub
		return this.alquileresDelCliente;
	}

	public void agregarAlquiler(Alquiler nuevoAlquiler) {
		// TODO Auto-generated method stub
		alquileresDelCliente.add(nuevoAlquiler);
	}

}

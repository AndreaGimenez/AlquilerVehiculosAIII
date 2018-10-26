package cliente;

import java.util.ArrayList;
import java.util.Collection;
import Alquiler.java.Alquiler;

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
		
		return this.alquileresDelCliente;
	}

	public void agregarAlquiler(Alquiler nuevoAlquiler) {
		
		alquileresDelCliente.add(nuevoAlquiler);
	}

	public Integer obtenerPrecioAlquileres() {
		
		Integer precio = 0;
		
		for( Alquiler alquiler : alquileresDelCliente ) {
			precio += alquiler.obtenerPrecio();
		}
		
		return precio;
	}

}

package Alquiler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Alquiler.java.Alquiler;
import AlquilerUnitario.AlquilerUnitario;
import vehiculo.Camion;
import vehiculo.Coche;

public class AlquilerTest {
	
	@Test
	public void testSeAgregaUnAlquilerUnitarioAlAlquilerLosAlquileresDelClienteDeberianTenerEseAlquiler() {
		
		Coche unCoche = new Coche("123456", "Ford Fiesta", 2016, 5, false);
		AlquilerUnitario unAlquilerUnitario = new AlquilerUnitario(unCoche, 5);
		
		Alquiler nuevoAlquiler = new Alquiler();
		
		assertEquals(new Integer(0), nuevoAlquiler.cantidadItems());
		
		nuevoAlquiler.agregar(unAlquilerUnitario);
		
		assertEquals(new Integer(1), nuevoAlquiler.cantidadItems());
		
	}
	
	@Test
	public void testSeAgreganDosAlquileresUnitarioAUnAlquilerLosAlquileresDelClienteDeberianTenerDosAlquileres() {
		
		Coche unCoche = new Coche("123456", "Ford Fiesta", 2016, 5, false);
		Camion unCamion = new Camion("456789", "Mercedes Benz", 2014, 500);
		
		AlquilerUnitario unAlquilerUnitario = new AlquilerUnitario(unCoche, 5);
		AlquilerUnitario otroAlquilerUnitario = new AlquilerUnitario(unCamion, 10);
		
		Alquiler nuevoAlquiler = new Alquiler(); 
		nuevoAlquiler.agregar(unAlquilerUnitario);
		nuevoAlquiler.agregar(otroAlquilerUnitario);
		
		assertEquals(new Integer(2), nuevoAlquiler.cantidadItems());
		
	}
	
	@Test
	public void testSeAgreganDosAlquileresUnitariosConValorAUnAlquilerObtenerValorTotalDeberiaDevolverElValorCorrecto() {
		
		Coche unCoche = new Coche("123456", "Ford Fiesta", 2016, 5, false);
		Camion unCamion = new Camion("456789", "Mercedes Benz", 2014, 500);
		
		AlquilerUnitario unAlquilerUnitario = new AlquilerUnitario(unCoche, 5);
		AlquilerUnitario otroAlquilerUnitario = new AlquilerUnitario(unCamion, 10);
		Alquiler alquiler = new Alquiler(); 
		alquiler.agregar(unAlquilerUnitario);
		alquiler.agregar(otroAlquilerUnitario);
		
		assertEquals(new Double(1512000.0), alquiler.obtenerPrecio());
		
	}
	
}

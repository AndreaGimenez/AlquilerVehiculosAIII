package Alquiler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Alquiler.java.Alquiler;
import AlquilerUnitario.AlquilerUnitario;
import vehiculo.Coche;

public class AlquilerTest {
	
	@Test
	public void testSeAgregaUnAlquilerUnitarioAlAlquilerAlquilerDeberiaTenerEseAlquilerUnitario() {
		
		Coche unCoche = new Coche("123456", "Ford Fiesta", 2016, 5);
		AlquilerUnitario unAlquilerUnitario = new AlquilerUnitario(unCoche, 5);
		
		Alquiler nuevoAlquiler = new Alquiler();
		
		assertEquals(new Integer(0), nuevoAlquiler.cantidadItems());
		nuevoAlquiler.agregar(unAlquilerUnitario);
		
		assertEquals(new Integer(1), nuevoAlquiler.cantidadItems());
		
	}
}

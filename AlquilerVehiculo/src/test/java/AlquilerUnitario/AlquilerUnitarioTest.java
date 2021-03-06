package AlquilerUnitario;

import static org.junit.Assert.*;
import vehiculo.*;

import org.junit.Test;

public class AlquilerUnitarioTest{
	
	@Test
	public void testSeCreaUnAlquilerConVehiculoMarcaFordFiestaYDias7DeberiaVerificarEsosValores(){
		
		Coche coche = new Coche("123456", "FordFiesta",2015,5, false);
		
		AlquilerUnitario nuevoAlquilerUnitario = new AlquilerUnitario(coche,7);
		
		assertEquals("123456", nuevoAlquilerUnitario.getVehiculo().getMatricula());
		assertEquals(new Integer(7), nuevoAlquilerUnitario.getCantidadDias());
				
	}
	
	@Test
	public void testSecreanDosAlquileresSusNumerosDeClienteDeberianSerConsecutivos() {
		Coche unCoche = new Coche("123456", "Ford Fiesta",2015,5, false);
		Coche otroCoche = new Coche("456789", "Fiat Uno",2016,5, false);
		
		AlquilerUnitario primeroAlquiler = new AlquilerUnitario(unCoche, 7) ;
		AlquilerUnitario segundoAlquiler = new AlquilerUnitario(otroCoche, 3) ;
		
		assertEquals(1, segundoAlquiler.getNumeroAlquiler() - primeroAlquiler.getNumeroAlquiler());
		
	}
	
	@Test
	public void testSeCreaUnAlquilerUnitarioDeCoche5PlazasPor7DiasElCostoDeberiaSer7000() {
		
		Coche coche = new Coche("123456", "Ford Fiesta", 2016, 5, false);
		AlquilerUnitario alquilerUnitario = new AlquilerUnitario(coche, 7);
		
		assertEquals(new Double (7000.0), alquilerUnitario.obtenerPrecio());
		
	}
	 
	@Test
	public void testSeCreaUnAlquilerUnitarioDeCamionConPma400Por10DiasElCostoDeberiaSer1207000() {
		
		Camion camion = new Camion("123456", "Mercedes Benz", 2018, 400); 
		AlquilerUnitario alquilerUnitario = new AlquilerUnitario(camion, 10);

		assertEquals(new Double(1207000), alquilerUnitario.obtenerPrecio());
	}
	
	@Test
	public void testSeCreaUnAlquilerUnitarioDeMicrobusCon20PlazasPor3DiasElCostoDeberiaSer11700() {
		
		Microbus microbus = new Microbus ("123456", "Traffic", 2016, 20);
		AlquilerUnitario alquilerUnitario = new AlquilerUnitario(microbus, 3);
		
		assertEquals(new Double(11700.0), alquilerUnitario.obtenerPrecio());
	}
	
	@Test
	public void testSeCreaAlquilerDeVehiculoDePasajerosPorCeroDiasElPrecioDeberiaSerCero() {
		
		Microbus microbus = new Microbus ("123456", "Traffic", 2016, 20);
		AlquilerUnitario alquilerUnitario = new AlquilerUnitario(microbus, 0);
		
		assertEquals(new Double(0), alquilerUnitario.obtenerPrecio());
		
		Coche coche = new Coche("123456", "Ford Fiesta", 2016, 5, false);
		AlquilerUnitario otroAlquilerUnitario = new AlquilerUnitario(coche, 0);
		
		assertEquals(new Double (0.0), otroAlquilerUnitario.obtenerPrecio());
	}
	
	@Test
	public void testSeCreaAlquilerDeCamionPorCeroDiasElPrecioDeberiaSerCero() {
		
		Camion camion = new Camion("123456", "Mercedes Benz", 2018, 400); 
		AlquilerUnitario alquilerUnitario = new AlquilerUnitario(camion, 0);

		assertEquals(new Double(0.0), alquilerUnitario.obtenerPrecio());
	}

}
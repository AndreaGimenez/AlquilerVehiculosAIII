package AlquilerUnitario;

import static org.junit.Assert.*;
import vehiculo.*;

import org.junit.Test;

import Alquiler.java.Alquiler;

public class AlquilerUnitarioTest{
	
	@Test
	public void testSeCreaUnAlquilerConVehiculoMarcaFordFiestaYDias7DeberiaVerificarEsosValores(){
		
		Coche coche = new Coche("123456", "FordFiesta",2015,5);
		
		AlquilerUnitario nuevoAlquilerUnitario = new AlquilerUnitario(coche,7);
		
		assertEquals("123456", nuevoAlquilerUnitario.getVehiculo().getMatricula());
		assertEquals(new Integer(7), nuevoAlquilerUnitario.getCantidadDias());
				
	}
	
	@Test
	public void testSecreanDosAlquileresSusNumerosDeClienteDeberianSerConsecutivos() {
		Coche unCoche = new Coche("123456", "Ford Fiesta",2015,5);
		Coche otroCoche = new Coche("456789", "Fiat Uno",2016,5);
		
		AlquilerUnitario primeroAlquiler = new AlquilerUnitario(unCoche, 7) ;
		AlquilerUnitario segundoAlquiler = new AlquilerUnitario(otroCoche, 3) ;
		
		assertEquals(1, segundoAlquiler.getNumeroAlquiler() - primeroAlquiler.getNumeroAlquiler());
		
	}
	
	@Test
	public void testSeCreaUnAlquilerUnitarioDeCoche5PlazasPor7DiasElCostoDeberiaSer7000() {
		
		Coche coche = new Coche("123456", "Ford Fiesta", 2016, 5);
		AlquilerUnitario alquilerUnitario = new AlquilerUnitario(coche, 7);
		
		assertEquals(new Integer (7000), alquilerUnitario.obtenerPrecio());
		
	}
	
	@Test
	public void testSeCreaUnAlquilerUnitarioDeCamionConPma400sPor10DiasElCostoDeberiaSer1205000() {
		
		Camion camion = new Camion("123456", "Mercedes Benz", 2018, 400);
		AlquilerUnitario alquilerUnitario = new AlquilerUnitario(camion, 10);
		
		assertEquals(new Integer(1205000), alquilerUnitario.obtenerPrecio());
		
	}
		
}
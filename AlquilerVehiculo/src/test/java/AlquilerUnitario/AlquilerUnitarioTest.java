package AlquilerUnitario;

import static org.junit.Assert.*;
import vehiculo.*;

import org.junit.Test;

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
		
}
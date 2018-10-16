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
				
	}
	
}
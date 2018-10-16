package vehiculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CocheTest {
	
	@Test
	public void testGetMatriculaDeberiaDevolver123456() {
		
		Coche nuevoCoche = new Coche("123456", "Ford Fiesta", 2015, 5);
		assertEquals("123456", nuevoCoche.getMatricula());
		
		Coche otroCoche = new Coche("456789", "Fiat Uno", 2013, 5);
		assertEquals("456789", otroCoche.getMatricula());
	}
	
	@Test 
	public void testGetMarcaDeberiaDevolverFordFiesta() {
		
		Coche coche = new Coche("123456", "Ford Fiesta", 2016, 5);
		assertEquals("Ford Fiesta", coche.getMarca());
	}
	
	@Test
	public void testGetModeloDeberiaDevolver2016() {
		Coche coche = new Coche("456789", "Fiat Uno", 2013, 5);
		assertEquals(new Integer(2013), coche.getModelo());
	}
	
	@Test
	public void testGetCantidadPlazasDeberiaDevolver5() {
		
		Coche coche = new Coche("123456", "Fiat Palio", 2016, 5);
		assertEquals(new Integer(5), coche.getCantidadPlazas());
	}
}

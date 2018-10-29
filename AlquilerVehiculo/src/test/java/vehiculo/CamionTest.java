package vehiculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CamionTest {
	
	@Test
	public void testGetMatriculaDeberiaDevolver123456() {
		
		Camion nuevoCamion = new Camion("123456", "Mercedes", 2015, 456);
		assertEquals("123456", nuevoCamion.getMatricula());
		
		Camion otroCamion = new Camion("456789", "Mercedes", 2013, 789);
		assertEquals("456789", otroCamion.getMatricula());
	}
	
	@Test
	public void testGetMarcaDeberiaDevolverFordFiesta() {
		
		Camion Camion = new Camion("123456", "Mercedes", 2016, 456);
		assertEquals("Mercedes", Camion.getMarca());
	}
	
	@Test
	public void testGetModeloDeberiaDevolver2016() {
		Camion Camion = new Camion("456789", "Mercedes", 2013, 789);
		assertEquals(new Integer(2013), Camion.getModelo());
	}
	
	@Test
	public void testGetPmaDeberiaDevolver456() {
		
		Camion Camion = new Camion("123456", "Mercedes", 2016, 456);
		assertEquals(new Integer(456), Camion.getPma());
	}
	
	@Test
	public void testElPrecioBaseDeUnCamionConPma400DeberiaSer122500() {
		
		Camion camion = new Camion("123456", "Mercedes Benz", 2016, 400);
		assertEquals(new Integer(122500), camion.obtenerPrecio(1));
	}
		
}

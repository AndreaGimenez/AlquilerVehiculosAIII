package vehiculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CocheTest {
	
	@Test
	public void testGetMatriculaDeberiaDevolver123456() {
		
		Coche nuevoCoche = new Coche("123456", "Ford Fiesta", 2015, 5, false);
		assertEquals("123456", nuevoCoche.getMatricula());
		
		Coche otroCoche = new Coche("456789", "Fiat Uno", 2013, 5, false);
		assertEquals("456789", otroCoche.getMatricula());
	}
	
	@Test 
	public void testGetMarcaDeberiaDevolverFordFiesta() {
		
		Coche coche = new Coche("123456", "Ford Fiesta", 2016, 5, false);
		assertEquals("Ford Fiesta", coche.getMarca());
	}
	
	@Test
	public void testGetModeloDeberiaDevolver2016() {
		Coche coche = new Coche("456789", "Fiat Uno", 2013, 5, false);
		assertEquals(new Integer(2013), coche.getModelo());
	}
	
	@Test
	public void testGetCantidadPlazasDeberiaDevolver5() {
		
		Coche coche = new Coche("123456", "Fiat Palio", 2016, 5, false);
		assertEquals(new Integer(5), coche.getCantidadPlazas());
	}
	
	@Test
	public void testElPrecioDeUnCoche5PlazasNoPremiumPorDiaDeberiaSer1000() {
		
		Coche coche = new Coche("123456", "Fiat Palio", 2016, 5, false);
		assertEquals(new Double(1000.0), coche.obtenerPrecio(1), new Double(0.1));
	}
	
	@Test
	public void testElPrecioDeUnCoche5PlazasNoPremiumPor5DiasDeberiaSer5000() {
		
		Coche coche = new Coche("123456", "Fiat Palio", 2016, 5, false);
		assertEquals(new Double(5000.0), coche.obtenerPrecio(5), new Double(0.1));
	}
	
	@Test
	public void testElPrecioDeUnCoche5PlazasNoPremiumBlindadoPorDiaDeberiaSer1150() {
		
		Coche coche = new Coche("123456", "Fiat Palio", 2016, 5, true);
		assertEquals(new Double(1150.0), coche.obtenerPrecio(1), new Double(0.1));
	}
	
	@Test
	public void testElPrecioDeUnCoche5PlazasNoPremiumBlindadoPor5DiasDeberiaSer5750() {
		
		Coche coche = new Coche("123456", "Fiat Palio", 2016, 5, true);
		assertEquals(new Double(5750.0), coche.obtenerPrecio(5), new Double(0.1));
	}
}

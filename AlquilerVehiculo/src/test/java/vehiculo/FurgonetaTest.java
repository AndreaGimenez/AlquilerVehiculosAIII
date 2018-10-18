package vehiculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FurgonetaTest {
	
	@Test
	public void testSeCreaUnaFurgonetaConMatricula123MarcaRenaultModelo2017Pma150() {
		
		Furgoneta furgoneta = new Furgoneta("123", "Renault", 2017, 150);
		
		assertEquals("123", furgoneta.getMatricula());
		assertEquals("Renault", furgoneta.getMarca());
		assertEquals(new Integer(2017), furgoneta.getModelo());
		assertEquals(new Integer(150), furgoneta.getPma());
	}
	
	@Test
	public void testElPrecioBaseDeUnaFurgonetaConPma200DeberiaSer60500() {
		
		Furgoneta furgoneta = new Furgoneta("123456", "Renault", 2015, 200);
		assertEquals(new Integer(60500), furgoneta.obtenerPrecioPorDia());
	} 
}

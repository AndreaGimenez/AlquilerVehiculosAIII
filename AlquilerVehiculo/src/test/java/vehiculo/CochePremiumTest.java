package vehiculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CochePremiumTest {
	
	@Test
	public void testSeCreaUnCochePremiumMarcaBMWModelo2018YSusAtributosSonCorrectos() {
		
		CochePremium cochePremium = new CochePremium("123456","BMW",2018,5);
		assertEquals("123456", cochePremium.getMatricula());
		assertEquals("BMW", cochePremium.getMarca());
		assertEquals(new Integer(2018), cochePremium.getModelo());
		assertEquals(new Integer(5), cochePremium.getCantidadPlazas());
	}
	
	@Test
	public void testElPrecioDeAlquilerPorDiaDeUnCochePremium5PlazasDeberiaSer1250() {
		CochePremium cochePremium = new CochePremium("123456","AUDI",2018,5);
		
		assertEquals(new Integer(1250), cochePremium.obtenerPrecio(1));
	}
	
	@Test
	public void testElPrecioDeAlquilerDeUnCochePremium5PlazasPor5DiasDeberiaSer6250() {
		CochePremium cochePremium = new CochePremium("123456","AUDI",2018,5);
		
		assertEquals(new Integer(6250), cochePremium.obtenerPrecio(5));
	}
}

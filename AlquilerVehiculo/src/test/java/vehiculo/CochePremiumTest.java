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
	public void testCrearUnCochePremiumMarcaAUDIModelo2014DeberiaLanzarCochePremiumInvalidoException(){
		
		
		
	}
	
}

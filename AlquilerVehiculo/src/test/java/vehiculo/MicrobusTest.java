package vehiculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MicrobusTest {
	
	@Test
	public void testSeCreaUnMicrobusConMatricula123MarcaTrafficModelo2015Plazas20DeberianVerificarseEsosValores() {
		
		Microbus microbus = new Microbus("123", "Traffic", 2015, 20);
		
		assertEquals("123", microbus.getMatricula());
		assertEquals("Traffic", microbus.getMarca());
		assertEquals(new Integer(2015), microbus.getModelo());
		assertEquals(new Integer(20), microbus.getCantidadPlazas());
	}
	
	@Test
	public void testElPrecioBaseDeUnMicrobusCon20PlazasDeberiaSer3900() {
		
		Microbus microbus = new Microbus("123456", "Traffic", 2015, 20);
		assertEquals(new Integer(3900), microbus.obtenerPrecioPorDia());
	}
}

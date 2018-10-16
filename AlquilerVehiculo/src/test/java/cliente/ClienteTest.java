package cliente;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {

	
	@Test
	public void testDadoUnClienteConNombrePedroAlObtenerNombreDeberiaDevolverPedro() {
		
		Cliente cliente = new Cliente("Pedro");
		
		assertEquals("Pedro", cliente.getNombre());
	}
	
	@Test
	public void testCuandoSeCreanDosClientesElSegundoClienteDeberiaTenerUnNumeroConsecutivoAlPrimero() {
		
		Cliente primerCliente = new Cliente("Pedro");
		Cliente segundoCliente = new Cliente("Jose");
		
		assertEquals(segundoCliente.getNumero().intValue() - primerCliente.getNumero().intValue(), 1);
	}
}

package cliente;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Alquiler.java.Alquiler;
import AlquilerUnitario.AlquilerUnitario;
import vehiculo.Coche;

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
	
	@Test
	public void testSeCreaUnClienteYSeLeAgregaUnAlquilerAhoraDeberiaTenerUnAlquiler(){
		Cliente cliente = new Cliente("Ana");
		Coche coche = new Coche("123456", "Ford Fiesta", 2015,5);
		
		AlquilerUnitario alquilerUnitario = new AlquilerUnitario(coche, 8);
		Alquiler nuevoAlquiler = new Alquiler();
		nuevoAlquiler.agregar(alquilerUnitario);
		assertEquals(new Integer(0),((Integer)cliente.obtenerAlquileres().size()));
		cliente.agregarAlquiler(nuevoAlquiler);
		assertEquals(new Integer(1),((Integer)cliente.obtenerAlquileres().size()));
		
	}
	
	
}

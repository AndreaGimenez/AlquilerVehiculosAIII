package cliente;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ListadoClientesTest {
	
	@Test
	public void testSeAgregaUnClienteDeNombreManuelYSeLoEncuentra() throws ClienteNoEncontradoException{
		
		Cliente cliente = new Cliente ("Manuel");
		Cliente otroCliente = new Cliente ("Matias");
		Cliente otroOtroCliente = new Cliente ("Jorge");
		
		ListadoClientes listado = new ListadoClientes();
		
		listado.agregar(cliente);
		listado.agregar(otroCliente);
		listado.agregar(otroOtroCliente);
		
		cliente = listado.obtener("Matias");
		
		assertEquals("Matias", cliente.getNombre());
		
	}
}



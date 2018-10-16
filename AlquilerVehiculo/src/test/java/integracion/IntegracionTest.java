package integracion;

import static org.junit.Assert.*;

import org.junit.Test;

import cliente.Cliente;
import cliente.ClienteNoEncontradoException;
import cliente.ListadoClientes;
import vehiculo.Camion;
import vehiculo.CatalogoVehiculos;
import vehiculo.Coche;
import vehiculo.MatriculaRepetidaException;
import vehiculo.VehiculoNoEncontradoException;


public class IntegracionTest {

	@Test
	public void agregarCoches() throws VehiculoNoEncontradoException, MatriculaRepetidaException {
		
		CatalogoVehiculos catalogoVehiculos = new CatalogoVehiculos();
		
		Coche cocheFord = new Coche("123456", "Ford Fiesta", 2015, 4);
		Coche cocheBMW = new Coche("123457", "BMW", 2017, 5);
		
		catalogoVehiculos.agregar(cocheFord);
		catalogoVehiculos.agregar(cocheBMW);
		
		assertEquals("123456", catalogoVehiculos.obtener("123456").getMatricula());
		assertEquals("Ford Fiesta", catalogoVehiculos.obtener("123456").getMarca());
		assertEquals(new Integer(2015), catalogoVehiculos.obtener("123456").getModelo());
		assertEquals(new Integer(4), ((Coche)catalogoVehiculos.obtener("123456")).getCantidadPlazas());
		
		assertEquals(catalogoVehiculos.obtener("123457").getMatricula(), "123457");
		assertEquals("BMW", catalogoVehiculos.obtener("123457").getMarca());
		assertEquals(new Integer(2017), catalogoVehiculos.obtener("123457").getModelo());
		assertEquals(new Integer(5), ((Coche)catalogoVehiculos.obtener("123457")).getCantidadPlazas());
	}
	
	@Test
	public void agregarCocheYCamion() throws MatriculaRepetidaException, VehiculoNoEncontradoException {
		
		CatalogoVehiculos catalogoVehiculos = new CatalogoVehiculos();
		Coche coche = new Coche("123456", "Ford Fiesta", 2015, 4);
		Camion camion = new Camion("456789", "Mercedes Benz", 2018, 456);
		
		catalogoVehiculos.agregar(coche);
		catalogoVehiculos.agregar(camion);
		
		
		
		assertEquals("123456", catalogoVehiculos.obtener("123456").getMatricula());
		assertEquals("Ford Fiesta", catalogoVehiculos.obtener("123456").getMarca());
		assertEquals(new Integer(2015), catalogoVehiculos.obtener("123456").getModelo());
		assertEquals(new Integer(4), ((Coche)catalogoVehiculos.obtener("123456")).getCantidadPlazas());
		 
		assertEquals("456789", catalogoVehiculos.obtener("456789").getMatricula());
		assertEquals("Mercedes Benz", catalogoVehiculos.obtener("456789").getMarca());
		assertEquals(new Integer(2018), catalogoVehiculos.obtener("456789").getModelo());
		assertEquals(new Integer(456), ((Camion)catalogoVehiculos.obtener("456789")).getPma());
	}
	
	@Test
	public void agregarClientes() throws ClienteNoEncontradoException {
		
		ListadoClientes listadoClientes = new ListadoClientes();
		
		Cliente clientePedro = new Cliente("Pedro");
		Cliente clienteJose = new Cliente("Jose");
		Cliente clienteNoAgregado = new Cliente("No Agregado");
		
		listadoClientes.agregar(clientePedro);
		listadoClientes.agregar(clienteJose);
		
		assertEquals(clientePedro.getNumero(), listadoClientes.obtener(clientePedro.getNumero()).getNumero());
		assertEquals(clienteJose.getNumero(), listadoClientes.obtener(clienteJose.getNumero()).getNumero());
		
		try {
			listadoClientes.obtener(clienteNoAgregado.getNumero());
			fail("Expected exception");
		}catch(Exception e){
			assertTrue(e instanceof ClienteNoEncontradoException);
		}
	}
}

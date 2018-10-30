package integracion;

import static org.junit.Assert.*;

import org.junit.Test;

import Alquiler.java.Alquiler;
import AlquilerUnitario.AlquilerUnitario;
import cliente.Cliente;
import cliente.ClienteNoEncontradoException;
import cliente.ListadoClientes;
import vehiculo.Camion;
import vehiculo.CatalogoVehiculos;
import vehiculo.Coche;
import vehiculo.Furgoneta;
import vehiculo.MatriculaRepetidaException;
import vehiculo.Microbus;
import vehiculo.VehiculoNoEncontradoException;


public class IntegracionTest {

	@Test
	public void agregarCoches() throws VehiculoNoEncontradoException, MatriculaRepetidaException {
		
		CatalogoVehiculos catalogoVehiculos = new CatalogoVehiculos();
		
		Coche cocheFord = new Coche("123456", "Ford Fiesta", 2015, 4, false);
		Coche cocheBMW = new Coche("123457", "BMW", 2017, 5, false);
		
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
		Coche coche = new Coche("123456", "Ford Fiesta", 2015, 4, false);
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
	
	@Test
	public void testSeAgreganDosAlquileresConValorALosAlquileresDeUnClienteObtenerValorTotalDeberiaDevolverElValorCorrecto() {
		
		Cliente cliente = new Cliente("Ana");
		
		Coche unCoche = new Coche("123456", "Ford Fiesta", 2016, 5, false);
		Microbus unMicrobus = new Microbus ("147258", "Fiat Punto", 2017, 20);
		Camion unCamion = new Camion("456789", "Mercedes Benz", 2014, 500);
		Furgoneta unaFurgoneta = new Furgoneta ("852963", "Toyota", 2014, 250);
		
		AlquilerUnitario primerAlquilerUnitario = new AlquilerUnitario(unCoche, 7);
		AlquilerUnitario segundoAlquilerUnitario = new AlquilerUnitario(unMicrobus, 3);
		AlquilerUnitario tercerAlquilerUnitario = new AlquilerUnitario(unCamion, 5);
		AlquilerUnitario cuartoAlquilerUnitario = new AlquilerUnitario(unaFurgoneta, 6);
		
		Alquiler primerAlquiler = new Alquiler();
		Alquiler segundoAlquiler = new Alquiler();

		primerAlquiler.agregar(primerAlquilerUnitario);
		primerAlquiler.agregar(segundoAlquilerUnitario);
		segundoAlquiler.agregar(tercerAlquilerUnitario);
		segundoAlquiler.agregar(cuartoAlquilerUnitario);
		
		cliente.agregarAlquiler(primerAlquiler);
		assertEquals(new Double(18700.0), cliente.obtenerPrecioAlquileres());
		cliente.agregarAlquiler(segundoAlquiler);
		assertEquals(new Double(1226200.0), cliente.obtenerPrecioAlquileres());
	}
	
	/*@Test
	public void testSeBuscaElCostoDeLosAlquileresDeUnClienteValidoEseCostoDeberiaSerCorrecto() throws ClienteNoEncontradoException {
		
		Cliente cliente = new Cliente("Ana");
		Cliente otroCliente = new Cliente("Andrea");
		
		ListadoClientes listadoDeClientes = new ListadoClientes();
		
		listadoDeClientes.agregar(cliente);
		listadoDeClientes.agregar(otroCliente);
		
		Coche unCoche = new Coche("123456", "Ford Fiesta", 2016, 5);
		Microbus unMicrobus = new Microbus ("147258", "Fiat Punto", 2017, 20);
		Camion unCamion = new Camion("456789", "Mercedes Benz", 2014, 500);
		Furgoneta unaFurgoneta = new Furgoneta ("852963", "Toyota", 2014, 250);
		
		AlquilerUnitario primerAlquilerUnitario = new AlquilerUnitario(unCoche, 7);
		AlquilerUnitario segundoAlquilerUnitario = new AlquilerUnitario(unMicrobus, 3);
		AlquilerUnitario tercerAlquilerUnitario = new AlquilerUnitario(unCamion, 5);
		AlquilerUnitario cuartoAlquilerUnitario = new AlquilerUnitario(unaFurgoneta, 6);
		
		Alquiler primerAlquiler = new Alquiler();
		Alquiler segundoAlquiler = new Alquiler();

		primerAlquiler.agregar(primerAlquilerUnitario);
		primerAlquiler.agregar(segundoAlquilerUnitario);
		segundoAlquiler.agregar(tercerAlquilerUnitario);
		segundoAlquiler.agregar(cuartoAlquilerUnitario);
		
		cliente.agregarAlquiler(primerAlquiler);
		//assertEquals(new Integer(18700), cliente.obtenerPrecioAlquileres());
		
		otroCliente.agregarAlquiler(segundoAlquiler);
		//assertEquals(new Integer(1226200), cliente.obtenerPrecioAlquileres());
		
		assertEquals(new Integer(18700), listadoDeClientes.obtener("Ana").obtenerPrecioAlquileres());
		assertEquals(new Integer(1207500), listadoDeClientes.obtener("Andrea").obtenerPrecioAlquileres());
	}*/
}

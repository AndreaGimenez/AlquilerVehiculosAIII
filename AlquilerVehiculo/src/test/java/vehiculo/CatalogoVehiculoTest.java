package vehiculo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatalogoVehiculoTest {
	
	@Test
	public void testAgregarDeberiaAgregarAlCatalogoUnCocheConMatricula123456() throws VehiculoNoEncontradoException, MatriculaRepetidaException {
		
		Coche nuevoCoche = new Coche("123456", "Ford Fiesta", 2015, 5);
		CatalogoVehiculos nuevoCatalogo = new CatalogoVehiculos();
		
		nuevoCatalogo.agregar(nuevoCoche);
		
		assertEquals("123456", nuevoCatalogo.obtener("123456").getMatricula());
		
	} 
	
	@Test(expected = VehiculoNoEncontradoException.class)
	public void testObtenerUnVehiculoInexistenteDeberiaLanzarCocheNoEncontradoException() throws VehiculoNoEncontradoException {
		
		CatalogoVehiculos nuevoCatalogo = new CatalogoVehiculos();
		
		nuevoCatalogo.obtener("123456");
	}
	
	@Test(expected = MatriculaRepetidaException.class)
	public void testAgregarDosVehiculosConIgualMatriculaDeberiaLanzaMatriculaRepetidaException() throws MatriculaRepetidaException {
		
		CatalogoVehiculos nuevoCatalogo = new CatalogoVehiculos();
		Coche coche = new Coche("123456", "Ford Fiesta", 2015, 5);
		Coche otroCoche = new Coche("123456", "Fiat Palio", 2018, 5);
		
		nuevoCatalogo.agregar(coche);
		nuevoCatalogo.agregar(otroCoche);
	}
	
	@Test
	public void testAgregarDeberiaAgregarUnCamionConMatricula456789() throws VehiculoNoEncontradoException, MatriculaRepetidaException {
		
		Camion camion = new Camion("456789", "Mercedes", 2018, 789);
		CatalogoVehiculos catalogo = new CatalogoVehiculos();
		
		catalogo.agregar(camion);
		
		assertEquals("456789", catalogo.obtener("456789").getMatricula());
	}
}



package vehiculo;

import java.util.ArrayList;
import java.util.Collection;

public class CatalogoVehiculos { 
	
	private Collection<Vehiculo> vehiculos;
	
	public CatalogoVehiculos() {
		vehiculos = new ArrayList<Vehiculo>();
	}
	
	public void agregar(Vehiculo esteVehiculo) throws MatriculaRepetidaException {
		
		boolean encontrado;
		try {
			obtener(esteVehiculo.getMatricula());
			encontrado = true;
		} catch (VehiculoNoEncontradoException e) {
			encontrado = false;
		}
		
		if(encontrado) {
			throw new MatriculaRepetidaException();
		}else {
			vehiculos.add(esteVehiculo);
		}
	}

	public Vehiculo obtener(String matricula) throws VehiculoNoEncontradoException {

		Vehiculo vehiculoADevolver = null;
		
		for(Vehiculo vehiculo : vehiculos) {
			if(vehiculo.getMatricula().equals(matricula)) {
				vehiculoADevolver = vehiculo;
			}
		}
		
		if(vehiculoADevolver == null) {
			throw new VehiculoNoEncontradoException();
		}
		
		return vehiculoADevolver;
	}


}

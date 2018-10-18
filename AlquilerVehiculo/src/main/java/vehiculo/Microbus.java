package vehiculo;

public class Microbus extends VehiculoDePasageros{

	public Microbus(String matricula, String marca, Integer modelo, Integer cantidadPlazas) {
		super(matricula, marca, modelo, cantidadPlazas, new Integer(1500));
		
	}
	
	public Integer obtenerPrecioPorDia() {
		
		return (this.componenteBasePorDia + this.plazas*120 );
	}
	
}

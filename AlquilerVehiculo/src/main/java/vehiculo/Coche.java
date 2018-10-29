package vehiculo;

public class Coche extends VehiculoDePasageros{


	public Coche(String matricula, String marca, Integer modelo, Integer cantidadPlazas) {
		
		super(matricula, marca, modelo, cantidadPlazas, new Integer(500));
		
	}
	
	public Integer obtenerPrecio(Integer cantidadDias) {
		
		return (this.componenteBasePorDia + this.plazas * 100 ) * cantidadDias;
	}
}
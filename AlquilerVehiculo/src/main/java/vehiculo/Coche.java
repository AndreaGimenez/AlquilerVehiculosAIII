package vehiculo;

public class Coche extends VehiculoDePasageros{

	protected double factorBlindado;
	
	public Coche(String matricula, String marca, Integer modelo, Integer cantidadPlazas, Boolean blindado) {
		
		super(matricula, marca, modelo, cantidadPlazas, new Double(500));
		if(blindado) {
			factorBlindado = 0.15;
		}
		else {
			factorBlindado = 1.0;
		}

	}
	
	public Double obtenerPrecio(Integer cantidadDias) {
		
		return ((this.componenteBasePorDia + this.plazas * 100 ) * cantidadDias * factorBlindado);
	}
}
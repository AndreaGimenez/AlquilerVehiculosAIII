package vehiculo;

public class Coche extends Vehiculo{

	private Integer plazas;

	public Coche(String matricula, String marca, Integer modelo, Integer cantidadPlazas) {
		
		super(matricula, marca, modelo, new Integer(500));
		this.plazas = cantidadPlazas;
		
	}

	public Integer getCantidadPlazas() {
		
		return this.plazas;
	}
	
	public Integer obtenerPrecioPorDia(int cantidadDiasAlquiler) {
		
		return ( this.componenteBasePorDia + this.plazas*100 )*cantidadDiasAlquiler;
	}
}

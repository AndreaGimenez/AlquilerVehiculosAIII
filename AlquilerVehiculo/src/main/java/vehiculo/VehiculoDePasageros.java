package vehiculo;

public abstract class VehiculoDePasageros extends Vehiculo {
	
	protected Integer plazas;
	
	public VehiculoDePasageros(String matricula, String marca, Integer modelo, Integer cantidadPlazas, Integer componenteBasePorDia) {
		super(matricula,marca,modelo,componenteBasePorDia);
		this.plazas = cantidadPlazas ;
	}
	
	public Integer getCantidadPlazas() {
		
		return this.plazas;
	}
	
	public abstract Integer obtenerPrecio(Integer cantidadDias);
}
 
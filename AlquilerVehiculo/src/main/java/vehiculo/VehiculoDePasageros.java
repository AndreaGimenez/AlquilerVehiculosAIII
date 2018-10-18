package vehiculo;

public class VehiculoDePasageros extends Vehiculo {
	
	protected Integer plazas;
	
	public VehiculoDePasageros(String matricula, String marca, Integer modelo, Integer cantidadPlazas, Integer componenteBasePorDia) {
		super(matricula,marca,modelo,componenteBasePorDia);
		this.plazas = cantidadPlazas ;
	}
	
	public Integer getCantidadPlazas() {
		
		return this.plazas;
	}

}
 
package vehiculo;

public class Coche extends Vehiculo{

	private Integer plazas;

	public Coche(String matricula, String marca, Integer modelo, Integer cantidadPlazas) {
		
		super(matricula, marca, modelo);
		this.plazas = cantidadPlazas;
	}

	public Integer getCantidadPlazas() {
		
		return this.plazas;
	}

}

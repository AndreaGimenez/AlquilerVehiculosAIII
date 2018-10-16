package vehiculo;

public class Camion extends Vehiculo {
	
	private Integer pma;
	
	public Camion(String matricula, String marca, Integer modelo, Integer pma) {
		super(matricula, marca, modelo);
		this.pma = pma ;
	}
	
	public Integer getPma() {
		
		return this.pma;
	}
}

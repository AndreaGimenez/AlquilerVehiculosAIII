package vehiculo;

public class Camion extends VehiculoDeCarga {
		
	public Camion(String matricula, String marca, Integer modelo, Integer pma) {
		super(matricula, marca, modelo,pma, new Integer(500 + (300*pma)) );
		
	}
	
}

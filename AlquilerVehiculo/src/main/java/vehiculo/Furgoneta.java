package vehiculo;

public class Furgoneta extends VehiculoDeCarga {

	public Furgoneta(String matricula, String marca, Integer modelo, Integer pma) {
		super(matricula, marca,modelo,pma, new Integer(500 + 300*pma));
	}
	
}

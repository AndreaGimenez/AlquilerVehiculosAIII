package vehiculo;

public class Camion extends VehiculoDeCarga {
		
	public Camion(String matricula, String marca, Integer modelo, Integer pma) {
		super(matricula, marca, modelo,pma, new Double(500 + (300*pma)) );
		
	}
	
	public Double obtenerPrecio(Integer cantidadDias) {
		
		Double precio = 0.0 ;
		
		if(cantidadDias != 0) {
			precio = 2000 + ( (this.componenteBasePorDia)*cantidadDias); 
		}
		
		return precio ;
	}
}

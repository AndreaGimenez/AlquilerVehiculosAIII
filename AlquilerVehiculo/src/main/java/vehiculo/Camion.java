package vehiculo;

public class Camion extends VehiculoDeCarga {
		
	public Camion(String matricula, String marca, Integer modelo, Integer pma) {
		super(matricula, marca, modelo,pma, new Integer(500 + (300*pma)) );
		
	}
	
	public Integer obtenerPrecio(Integer cantidadDias) {
		
		Integer precio = 0 ;
		
		if(cantidadDias != 0) {
			precio = 2000 + ( (this.componenteBasePorDia)*cantidadDias); 
		}
		
		return precio ;
	}
}

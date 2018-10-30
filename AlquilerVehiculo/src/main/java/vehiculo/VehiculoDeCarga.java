package vehiculo;

public abstract class VehiculoDeCarga extends Vehiculo{
	
	protected Integer pma;
	
	public VehiculoDeCarga(String matricula, String marca, Integer modelo, Integer pma, Double componenteBasePorDia) {
		super(matricula, marca, modelo, componenteBasePorDia);
		this.pma = pma ;
		
	}
	
	public Integer getPma() {
		
		return this.pma;
	}
	
	public Double obtenerPrecio(Integer cantidadDiasAlquiler) {
		
		return (( this.componenteBasePorDia)*cantidadDiasAlquiler); 
	}
 
} 

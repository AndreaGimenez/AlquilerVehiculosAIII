package vehiculo;

public class CochePremium extends Coche{

	public CochePremium(String matricula, String marca, Integer modelo, Integer cantidadPlazas, Boolean blindado) {
		
		super(matricula, marca, modelo, cantidadPlazas, blindado);
		
	}
	
	public Double obtenerPrecio(Integer cantidadDias) {
		
		return ( (this.componenteBasePorDia + this.plazas * 150 ) * cantidadDias * factorBlindado );
	}
	
}

package vehiculo;

public class CochePremium extends Coche{

	public CochePremium(String matricula, String marca, Integer modelo, Integer cantidadPlazas) {
		
		super(matricula, marca, modelo, cantidadPlazas);
		
	}

	private boolean validarPremium(String marca, Integer modelo) {
		
		return (((marca=="AUDI")||(MARCA=="BMW")) & (modelo>=2016));
	}
	
	public Integer obtenerPrecio(Integer cantidadDias) {
		
		return (this.componenteBasePorDia + this.plazas * 150 ) * cantidadDias;
	}
	
}

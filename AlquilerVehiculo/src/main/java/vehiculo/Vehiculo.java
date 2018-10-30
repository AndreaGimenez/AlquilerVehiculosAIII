package vehiculo;

public abstract class Vehiculo {
	private String matricula;
	private String marca;
	private Integer modelo;
	protected Double componenteBasePorDia;
	
	public Vehiculo(String matricula, String marca, Integer modelo, Double componenteBasePorDia) {

		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.componenteBasePorDia = componenteBasePorDia;
	}
	
	public String getMatricula() {

		return this.matricula;
	}

	public String getMarca() {
		
		return this.marca;
	}

	public Integer getModelo() {
	
		return this.modelo; 
	}
	
	public abstract Double obtenerPrecio(Integer cantidadDias);
}

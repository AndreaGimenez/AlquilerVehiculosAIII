package cliente;

public class Cliente {

	private static Integer numerador = new Integer(0);
	
	private Integer numero;
	private String nombre;
	
	
	public Cliente(String nombre) {
		
		this.numero = ++numerador;
		this.nombre = nombre;
		
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public String getNombre() {
		return nombre;
	}

}

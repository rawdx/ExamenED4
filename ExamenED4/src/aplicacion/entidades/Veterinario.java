package aplicacion.entidades;

public class Veterinario extends Usuario {
	
	private String numeroColegiado;
	
	public Veterinario(String nombre, String apellidos, String numeroColegiado) {
		super(nombre, apellidos);
		this.numeroColegiado = numeroColegiado;
		this.esVeterinario = true;
	}

}

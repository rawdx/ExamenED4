package aplicacion.entidades;

public class Propietario extends Usuario {
	
	private int numeroMascotas;
	
	public Propietario(String nombre, String apellidos, int numeroMascotas) {
		super(nombre, apellidos);
		this.numeroMascotas = numeroMascotas;
		this.esVeterinario = false;
	}
	
	
}

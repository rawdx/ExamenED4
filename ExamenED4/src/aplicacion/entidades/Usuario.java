package aplicacion.entidades;

public class Usuario {
	
	protected int codigoIdentificador;
	protected String nombre;
	protected String apellidos;
	protected boolean esVeterinario;
	
	public int getCodigoIdentificador() {
		return codigoIdentificador;
	}
	
	public void setCodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public boolean isEsVeterinario() {
		return esVeterinario;
	}

	public void setEsVeterinario(boolean esVeterinario) {
		this.esVeterinario = esVeterinario;
	}


	public Usuario(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Usuario [codigoIdentificador=" + codigoIdentificador + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", esVeterinario=" + esVeterinario + "]";
	}
	
	
}

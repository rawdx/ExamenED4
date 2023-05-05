package aplicacion.servicios;

import java.util.ArrayList;

import aplicacion.entidades.Usuario;

public interface InterfazMenu {
	
	public int mostrarMenu();
	
	public void guardarFichero(ArrayList<Usuario> listaUsuarios);
	
	public void mostrarUsuarios(ArrayList<Usuario> listaUsuarios);
}

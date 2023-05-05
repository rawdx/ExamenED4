package aplicacion.controladores;

import java.util.ArrayList;

import aplicacion.entidades.Usuario;
import aplicacion.servicios.ImplMenu;
import aplicacion.servicios.ImplPropietario;
import aplicacion.servicios.ImplVeterinario;
import aplicacion.servicios.InterfazMenu;
import aplicacion.servicios.InterfazUsuario;

public class Menu {

	public static void main(String[] args) {
		try {
			InterfazMenu intM = new ImplMenu();
			InterfazUsuario intU;

			ArrayList<Usuario> listaUsuarios = new ArrayList<>();

			int opcion;
			do {
				opcion = intM.mostrarMenu();

				// Dependiendo de la opción escogida se utilizará una implementación u otra
				switch (opcion) {
				case 1:
					intU = new ImplVeterinario();
					intU.addUsuario(listaUsuarios);
					break;
				case 2:
					intU = new ImplPropietario();
					intU.addUsuario(listaUsuarios);
					break;
				case 3:
					//Se guardan los datos en el fichero y se muestran en consola
					intM.guardarFichero(listaUsuarios);
					intM.mostrarUsuarios(listaUsuarios);
					break;
				}
			} while (opcion != 0);

		} catch (Exception e) {
			System.err.println("[Error] Ejecute el codigo de nuevo: " + e);
		}
	}

}

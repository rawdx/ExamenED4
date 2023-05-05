package aplicacion.servicios;

import java.util.ArrayList;
import java.util.Scanner;

import aplicacion.entidades.Propietario;
import aplicacion.entidades.Usuario;

public class ImplPropietario implements InterfazUsuario {

	@Override
	public void addUsuario(ArrayList<Usuario> listaUsuarios) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca el nombre: ");
		String nombre = sc.nextLine();

		System.out.print("Introduzca los apellidos: ");
		String apellidos = sc.nextLine();
		
		System.out.print("Introduzca el número de mascotas: ");
		int numeroMascotas = sc.nextInt();

		Usuario user = new Propietario(nombre, apellidos, numeroMascotas);

		user.setCodigoIdentificador(listaUsuarios.size() + 1);

		listaUsuarios.add(user);
	}

}

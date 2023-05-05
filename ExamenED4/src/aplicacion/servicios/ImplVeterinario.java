package aplicacion.servicios;

import java.util.ArrayList;
import java.util.Scanner;

import aplicacion.entidades.Usuario;
import aplicacion.entidades.Veterinario;

public class ImplVeterinario implements InterfazUsuario {

	@Override
	public void addUsuario(ArrayList<Usuario> listaUsuarios) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca el nombre: ");
		String nombre = sc.nextLine();

		System.out.print("Introduzca los apellidos: ");
		String apellidos = sc.nextLine();
		
		System.out.print("Introduzca el número de colegiado: ");
		String numeroColegiado = sc.nextLine();

		Usuario user = new Veterinario(nombre, apellidos, numeroColegiado);

		user.setCodigoIdentificador(listaUsuarios.size() + 1);

		listaUsuarios.add(user);
	}

}

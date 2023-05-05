package aplicacion.servicios;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import aplicacion.entidades.Usuario;

public class ImplMenu implements InterfazMenu {

	@Override
	public int mostrarMenu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n[Clinica Veterinaria]");
		System.out.println("1. Añadir veterinario");
		System.out.println("2. Añadir propietario");
		System.out.println("3. Mostrar usuarios");
		System.out.println("0. Salir");
		System.out.print("\nIntroduzca una opción: ");

		int opcion = sc.nextInt();
		while (opcion < 0 || opcion > 3) {
			System.err.print("[Error] Introduzca una opción válida: ");
			opcion = sc.nextInt();
		}
		return opcion;
	}

	@Override
	public void guardarFichero(ArrayList<Usuario> listaUsuarios) {
		try {
			//Para crear el fichero he creado una carpeta pruebas y está con ruta absoluta,
			//de otra forma sale acceso denegado
			File file = new File("C:\\pruebas\\usuarios.txt");
			file.createNewFile();
			
			FileWriter fw = new FileWriter(file);
	        PrintWriter pw = new PrintWriter(fw);
	        
	        for(int i = 0; i < listaUsuarios.size(); i++) {
	        	pw.println(listaUsuarios.get(i).getNombre() + ";" + listaUsuarios.get(i).getApellidos());
	        }
		}
		catch (Exception e){
			System.out.println(e);
		}
	}

	@Override
	public void mostrarUsuarios(ArrayList<Usuario> listaUsuarios) {
		
		if (listaUsuarios.size() != 0)
			for (Usuario user: listaUsuarios)
				System.out.println(user.toString());
	}
	
	

}

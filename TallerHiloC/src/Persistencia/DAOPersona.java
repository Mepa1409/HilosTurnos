package Persistencia;

import java.util.ArrayList;
import java.util.Date;

import Model.User;
import Utilidades.Archivo;

public class DAOPersona {
	private String RUTA = "Recursos/Personas.txt";

	// Set
	public void guardarPersona(User u) {

		new Archivo().AgregarContenido(RUTA, u.getCedula() + "," + u.getName());

	}

	// Get
	public ArrayList<User> mostrarDatosPersonas() {
		// Obtener conetenido de mi archivo plano
	
		ArrayList<String> datos = new Archivo().ContenidoArchivo(RUTA);
		ArrayList<User> listadoPersonas = new ArrayList<User>();	

		for (int i = 0; i < datos.size(); i++) {
			User us = new User();

			// Separo cada linea de datos en atributos
			String Linea[] = datos.get(i).split(",");
			
			us.setCedula(Linea[0]);
			us.setName(Linea[1]);
			

			

			listadoPersonas.add(us);

		}

		return listadoPersonas;

	}

	// Metodo para obtener la informacion

}

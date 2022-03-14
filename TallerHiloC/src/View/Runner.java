package View;

import Logic.Hilo1;
import Persistencia.DAOPersona;

public class Runner {

	public static void main(String[] args) {
		
		DAOPersona pers = new DAOPersona();
		
		VentanaPrincipal frame = new VentanaPrincipal();
		frame.setVisible(true);		
		
	}

}

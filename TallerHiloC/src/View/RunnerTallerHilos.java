package View;

import Logic.Hilo1;
import Persistencia.DAOPersona;

public class RunnerTallerHilos {

	public static void main(String[] args) {
		//Thread Hilo1 = new Thread(new Hilo1());
		//Hilo1.start();
		DAOPersona pers = new DAOPersona();
		
		VentanaPrincipal frame = new VentanaPrincipal();
		frame.setVisible(true);
		
	}

}

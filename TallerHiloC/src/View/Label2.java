package View;

import java.util.ArrayList;

import javax.swing.JLabel;

import Persistencia.DAOPersona;

public class Label2 extends JLabel implements Runnable {
	DAOPersona userList = new DAOPersona();
	static ArrayList<String> listadoPersonasAtendidasB= new ArrayList();

	Thread thread = null;

    public Label2(String text) {
        super(text);
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    @Override
    public void run() {
        while(true) {
            for(int i=1;i<5000;i++) {
            	int suma = (int) (Math.random() * (99 - 0 + 1) + 0);
            	String name =""+userList.mostrarDatosPersonas().get(suma);
            	String texto = "<html><body><center>B" + i + "<br>" + userList.mostrarDatosPersonas().get(suma)
						+ " </body></html>";
            	String texto2=userList.mostrarDatosPersonas().get(suma).getName() +  " B"+ i+"\n";
            	listadoPersonasAtendidasB.add(texto2);
                setText(texto);
                try {
                    Thread.sleep((int)(Math.random()*(8000-2000+1)+2000));
                    repaint();
                }
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
    }

    public String MostrarArray() {
    	String info="";
    	for(int i=0 ;i<listadoPersonasAtendidasB.size();i++) {
    	info+=listadoPersonasAtendidasB.get(i).toString() + "\n";
    	}
    
    	return info;
    }
    
    
}
package View;

import java.util.ArrayList;

import javax.swing.JLabel;

import Persistencia.DAOPersona;

public class Label3 extends JLabel implements Runnable{
	Thread thread = null;
	DAOPersona userList = new DAOPersona();
	static ArrayList<String> listadoPersonasAtendidasC= new ArrayList();



    public Label3(String text) {
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
            	String texto = "<html><body><center>C" + i + "<br>" + userList.mostrarDatosPersonas().get(suma)
						+ " </body></html>";
                setText(texto);
                String texto2=userList.mostrarDatosPersonas().get(suma).getName() +  " C"+ i+"\n";
            	listadoPersonasAtendidasC.add(texto2);

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
    	for(int i=0 ;i<listadoPersonasAtendidasC.size();i++) {
    	info+=listadoPersonasAtendidasC.get(i).toString() + "\n";
    	}
    	
    	return info;
    }
}

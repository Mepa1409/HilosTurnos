package View;

import java.awt.Label;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import Model.User;
import Persistencia.DAOPersona;

public class Label1 extends JLabel implements Runnable {
	Thread thread = null;
	static ArrayList<String> listadoPersonasAtendidas= new ArrayList(); 
	DAOPersona userList = new DAOPersona();
	String[] name=null;
	JTextArea child = null;

    public Label1(String text) {
        super(text);
    }    

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
        
            }
    public void stop() {
        if (thread == null) {
            thread = new Thread(this);
            thread.stop();
        }
    }
            
    public void setChild(JTextArea child) {
    	this.child = child;
    }
        
    

    @Override
    public void run() {
    
        while(true) {
        	
            for(int i=1;i<5000;i++) { 
            	int contador=0;
            	contador++;
            	int suma = (int) (Math.random() * (99 - 0 + 1) + 0);             	
            	String texto = "<html><body><center>A" + i + "<br>" + userList.mostrarDatosPersonas().get(suma)
						+ " </body></html>";
            	String texto2=userList.mostrarDatosPersonas().get(suma).getName() +  " A"+ i+"\n";
            	listadoPersonasAtendidas.add(texto2);
             
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
    	for(int i=0 ;i<listadoPersonasAtendidas.size();i++) {
    	info+=listadoPersonasAtendidas.get(i).toString() + "\n";
    	}
    	return info;
    }
    
    
}
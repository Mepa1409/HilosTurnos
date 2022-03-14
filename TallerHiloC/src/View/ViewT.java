package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.Label;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class ViewT {

	private JPanel contentPane;
	
	Label1 label1 ;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewT frame = new ViewT();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
**/
	/**
	 * Create the frame.
	 */
	public ViewT(String texto) {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setBounds(100, 100, 450, 300);
		//contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		//contentPane.setLayout(null);
		//label1 = new Label1(""); 
		


		JTextArea VentanillaA = new JTextArea();
		//VentanillaA.setBounds(5, 5, 424, 193);
		//System.out.println(label1.MostrarArray());
		VentanillaA.setText(texto);
		//VentanillaA.setRows(25);
		//VentanillaA.setColumns(25);
		//VentanillaA.setWrapStyleWord(true);
		//VentanillaA.setEditable(false);
		JScrollPane sp = new JScrollPane(VentanillaA);
	
		JOptionPane.showMessageDialog(null, sp);
	}

}

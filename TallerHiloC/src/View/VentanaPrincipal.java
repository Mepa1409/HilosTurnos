package View;

import java.awt.Font;
import java.awt.TextArea;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.User;
import Persistencia.DAOPersona;

import javax.swing.border.LineBorder;
import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.border.CompoundBorder;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {
	DefaultTableModel model = new DefaultTableModel();

	private JPanel contentPane;
	static Label1 lblTurno1 = new Label1("Turno 1");
	static Label2 lblTurno2 = new Label2("Turno 2");
	static Label3 lblTurno3 = new Label3("Turno 3");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {			
			public void run() {
				try {
					//ListUsers frame = new ListUsers();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Launch the application.
	 */
	/**
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { VentanaPrincipal frame = new
	 * VentanaPrincipal(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */
	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Titulo = new JLabel("EPS --Sistemas de Turnos--");
		Titulo.setBounds(229, 11, 387, 82);
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setFont(new Font("Tahoma", Font.ITALIC, 30));
		contentPane.add(Titulo);

		lblTurno1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurno1.setBounds(80, 160, 230, 70);
		lblTurno1.start();
		contentPane.add(lblTurno1);
		
		
		lblTurno2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurno2.setBounds(350, 160, 210, 70);
		lblTurno2.start();
		contentPane.add(lblTurno2);

		JPanel panel1 = new JPanel();
		panel1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.GRAY, Color.GRAY, null));
		panel1.setBounds(80, 122, 233, 170);
		contentPane.add(panel1);

		JLabel Ventanilla1 = new JLabel("  VENTANILLA CITAS");
		panel1.add(Ventanilla1);
		Ventanilla1.setForeground(Color.RED);
		Ventanilla1.setBackground(Color.RED);
		Ventanilla1.setVerticalAlignment(SwingConstants.TOP);
		Ventanilla1.setFont(new Font("Tahoma", Font.BOLD, 13));

		JPanel panel2 = new JPanel();
		panel2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.GRAY, Color.GRAY, null));
		panel2.setBounds(340, 122, 228, 170);
		contentPane.add(panel2);

		JLabel lblVentanilla = new JLabel("  VENTANA APROBACIONES");
		lblVentanilla.setVerticalAlignment(SwingConstants.TOP);
		lblVentanilla.setForeground(Color.RED);
		lblVentanilla.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVentanilla.setBackground(Color.RED);
		panel2.add(lblVentanilla);

		//Label3 lblTurno3 = new Label3("Turno 3");
		lblTurno3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurno3.setBounds(610, 160, 210, 70);
		lblTurno3.start();
		contentPane.add(lblTurno3);

		JPanel panel3 = new JPanel();
		panel3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.GRAY, Color.GRAY, null));
		panel3.setBounds(598, 122, 226, 170);
		contentPane.add(panel3);

		JLabel lblVentanilla_1 = new JLabel("  VENTANA Servicio al Cliente");
		lblVentanilla_1.setVerticalAlignment(SwingConstants.TOP);
		lblVentanilla_1.setForeground(Color.RED);
		lblVentanilla_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblVentanilla_1.setBackground(Color.RED);
		panel3.add(lblVentanilla_1);
		
		JButton btnNewButton = new JButton("Lista de Espera");
		btnNewButton.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				//ListUsers listUser = new ListUsers();
				//listUser.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 16));
		btnNewButton.setBounds(41, 27, 153, 39);
		contentPane.add(btnNewButton);	
		
		JButton HistorialA = new JButton("Historial A");
		HistorialA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewT frame = new ViewT(lblTurno1.MostrarArray());
				//frame.setVisible(true);
				
			}
		});
		
		HistorialA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		HistorialA.setBounds(131, 329, 130, 49);
		contentPane.add(HistorialA);
		
		JButton HistorialC = new JButton("Historial C");
		HistorialC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewT frame = new ViewT(lblTurno3.MostrarArray());
			}
		});
		HistorialC.setFont(new Font("Tahoma", Font.PLAIN, 17));
		HistorialC.setBounds(653, 333, 145, 45);
		contentPane.add(HistorialC);
		
		JButton HistorialB = new JButton("Historial B");
		HistorialB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewT frame = new ViewT(lblTurno2.MostrarArray());
			}
		});
		HistorialB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		HistorialB.setBounds(376, 329, 145, 49);
		contentPane.add(HistorialB);

	}
}
	

package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Persistencia.DAOPersona;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ListUsers extends JFrame {
	DefaultTableModel model = new DefaultTableModel();
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
public void cargaAuto() {
		
		DAOPersona dataPers = new DAOPersona();
		ArrayList<Object>nameCol = new ArrayList<Object>();
		
		for (int i = 0; i < dataPers.mostrarDatosPersonas().size(); i++) {
			nameCol.add(dataPers.mostrarDatosPersonas().get(i).getName());
			model.addColumn(nameCol);
		}
		this.table.setModel(model);
		ArrayList<Object[]>datos = new ArrayList<Object[]>();
		
		for (int i = 0; i < dataPers.mostrarDatosPersonas().size(); i++) {
			Object[]informacion= new Object[] {dataPers.mostrarDatosPersonas().get(i).getName(),dataPers.mostrarDatosPersonas().get(i).getName()};
			datos.add(informacion);
		}
		for(Object []DatosUsers : datos) {
			model.addRow(DatosUsers);
		}
		table.setModel(model);
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListUsers frame = new ListUsers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListUsers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DAOPersona dataPers = new DAOPersona();
		ArrayList<Object>nameCol = new ArrayList<Object>();
		//dataPers.mostrarDatosPersonas().size()
		for (int i = 0; i < 1; i++) {
			nameCol.add(dataPers.mostrarDatosPersonas().get(i).getName());
			//model.addRow(nameCol);
			model.addColumn(nameCol);
		}
		ArrayList<Object[]>datos = new ArrayList<Object[]>();
		
		for (int i = 0; i < dataPers.mostrarDatosPersonas().size(); i++) {
			Object[]informacion= new Object[] {dataPers.mostrarDatosPersonas().get(i).getName(),dataPers.mostrarDatosPersonas().get(i).getName()};
			datos.add(informacion);
		}
		for(Object []DatosUsers : datos) {
			model.addRow(DatosUsers);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 59, 528, 494);
		contentPane.add(scrollPane);
		
		JTable table = new JTable();
		scrollPane.setViewportView(table);
		
				table.setEnabled(false);
				table.setRowSelectionAllowed(false);
				table.setBorder(new LineBorder(Color.BLACK));
				table.setModel(new DefaultTableModel(new Object[][] {
						{ "Historial C1", "Historial C2", "Historial C3" }, { "a","b" ,"c"  }, { null, null, null }

				}, new String[] { "C1", "C2", "C3" }) {
					Class[] columnTypes = new Class[] { String.class, String.class, String.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
					

				});
				table.setModel(model);
				
				JLabel lblNewLabel = new JLabel("Lista de Espera");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
				lblNewLabel.setBounds(228, 11, 125, 37);
				contentPane.add(lblNewLabel);
		
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel label_4;
	private JButton button_3;
	private JButton button_2;
	private JButton button_1;
	private JButton button;
	private JLabel lblRegistro;
	private JLabel lblRecycler;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JLabel lblCorreo;
	private JLabel lblDireccion;
	private JLabel lblNombre;
	private JButton btnNewButton;
	private JLabel lblColecta;
	private JLabel lblLugar;
	private JLabel lblHora;
	private JLabel lblMaterial;
	private JLabel lblFecha;
	private JComboBox comboBox_3;
	private JComboBox comboBox_2;
	private JComboBox comboBox_1;
	private JComboBox comboBox;
	private JLabel label_3;
	private JLabel label_2;
	private JLabel label_1;
	private JLabel label;
	private JButton btnSubir;
	private JLabel lblVerInformacionDe;
	private JLabel lblVoluntariado;
	private JLabel lblVerInformacionDe_1;
	private JLabel lblVerInformacion;




















	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Voluntariado voluntariado1 = new Voluntariado();
		Usuario usuario1 = new Usuario(); 

		frame = new JFrame();
		frame.setBounds(100, 100, 917, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblRegistro = new JLabel("Registro");
		lblRegistro.setForeground(Color.BLUE);
		lblRegistro.setBounds(10, 42, 65, 14);
		panel.add(lblRegistro);
		
		lblRecycler = new JLabel("Re-Cycler");
		lblRecycler.setForeground(Color.BLUE);
		lblRecycler.setBounds(398, 11, 60, 14);
		panel.add(lblRecycler);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 76, 46, 14);
		panel.add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(105, 73, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(10, 107, 85, 14);
		panel.add(lblContrasea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(105, 104, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(10, 138, 46, 14);
		panel.add(lblCorreo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(105, 135, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(10, 169, 65, 14);
		panel.add(lblDireccion);
		
		textField_3 = new JTextField();
		textField_3.setBounds(105, 166, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(105, 197, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 200, 46, 14);
		panel.add(lblNombre);
		
		btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usuario1.setUserName(String.valueOf(textField.getText()));
				usuario1.setContrasena(String.valueOf(textField_1.getText()));
				usuario1.setCorreo(String.valueOf(textField_2.getText()));
				usuario1.setDireccion(String.valueOf(textField_3.getText()));
				usuario1.setNombre(String.valueOf(textField_4.getText()));
				
			}
		});
		btnNewButton.setBounds(10, 234, 89, 23);
		panel.add(btnNewButton);
		
		lblColecta = new JLabel("Colecta");
		lblColecta.setForeground(Color.BLUE);
		lblColecta.setBounds(294, 39, 53, 20);
		panel.add(lblColecta);
		
		lblMaterial = new JLabel("Material");
		lblMaterial.setBounds(294, 75, 76, 17);
		panel.add(lblMaterial);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Metal", "Plastico", "Papel", "Vidrio"}));
		comboBox.setBounds(377, 74, 96, 19);
		panel.add(comboBox);
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(294, 106, 46, 17);
		panel.add(lblFecha);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"21 de Abril", "24 de Abril", "26 de Abril", "29 de Abril"}));
		comboBox_1.setBounds(377, 104, 96, 20);
		panel.add(comboBox_1);
		
		lblLugar = new JLabel("Lugar");
		lblLugar.setBounds(294, 138, 46, 17);
		panel.add(lblLugar);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(377, 135, 96, 20);
		panel.add(textField_5);
		
		button = new JButton("Ingresar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		button.setBounds(294, 234, 89, 23);
		panel.add(button);
		
		lblVoluntariado = new JLabel("Voluntariado");
		lblVoluntariado.setForeground(Color.BLUE);
		lblVoluntariado.setBounds(570, 27, 96, 20);
		panel.add(lblVoluntariado);
		
		lblHora = new JLabel("Hora");
		lblHora.setBounds(570, 76, 76, 17);
		panel.add(lblHora);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"8:00", "11:00", "14:00", "15:00"}));
		comboBox_2.setBounds(652, 74, 96, 19);
		panel.add(comboBox_2);
		
		JLabel label = new JLabel("Fecha");
		label.setBounds(570, 106, 46, 17);
		panel.add(label);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"21 de Abril", "24 de Abril", "26 de Abril", "29 de Abril"}));
		comboBox_3.setBounds(652, 107, 96, 20);
		panel.add(comboBox_3);
		
		label_1 = new JLabel("Lugar");
		label_1.setBounds(570, 137, 46, 17);
		panel.add(label_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(652, 138, 96, 20);
		panel.add(textField_6);
		
		button_1 = new JButton("Ingresar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				voluntariado1.setHora(String.valueOf(comboBox_2.getSelectedItem()));
				voluntariado1.setFecha(String.valueOf(comboBox_3.getSelectedItem()));
				voluntariado1.setLugar(String.valueOf(textField_6.getText()));


				
			}
		});
		button_1.setBounds(570, 234, 89, 23);
		panel.add(button_1);
		
		lblVerInformacion = new JLabel("Ver informacion de Usuario");
		lblVerInformacion.setForeground(Color.RED);
		lblVerInformacion.setBounds(10, 369, 170, 14);
		panel.add(lblVerInformacion);
		
		label_2 = new JLabel("...");
		label_2.setBounds(10, 428, 867, 20);
		panel.add(label_2);
		
		btnSubir = new JButton("Solicitar");
		btnSubir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label_2.setText(String.valueOf(usuario1));
				
			}
		});
		btnSubir.setBounds(10, 394, 89, 23);
		panel.add(btnSubir);
		
		lblVerInformacionDe = new JLabel("Ver informacion de Colecta");
		lblVerInformacionDe.setForeground(Color.RED);
		lblVerInformacionDe.setBounds(10, 459, 164, 14);
		panel.add(lblVerInformacionDe);
		
		button_2 = new JButton("Solicitar");
		button_2.setBounds(10, 484, 89, 23);
		panel.add(button_2);
		
		label_3 = new JLabel("...");
		label_3.setBounds(10, 518, 881, 14);
		panel.add(label_3);
		
		lblVerInformacionDe_1 = new JLabel("Ver informacion de Voluntariado");
		lblVerInformacionDe_1.setForeground(Color.RED);
		lblVerInformacionDe_1.setBounds(10, 282, 219, 14);
		panel.add(lblVerInformacionDe_1);
		
		button_3 = new JButton("Solicitar");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label_4.setText(String.valueOf(voluntariado1));
				
			}
		});
		button_3.setBounds(10, 335, 89, 23);
		panel.add(button_3);
		
		label_4 = new JLabel("...");
		label_4.setBounds(10, 301, 846, 23);
		panel.add(label_4);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}

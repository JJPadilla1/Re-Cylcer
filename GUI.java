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
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.ScrollPane;
import java.awt.TextArea;

public class GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
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
	private JComboBox comboBox_2;
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
	private JDateChooser dateChooser;
	private JDateChooser dateChooser_1;
	private JComboBox comboBox_1;
	private JComboBox comboBox_3;
	private Component verticalStrut;
	private Component verticalStrut_1;
	private Component verticalStrut_2;
	private Box verticalBox;
	private JLabel lblEmpresa;
	private JButton btnSolicitar;
	private JLabel lblVerInformacionDe_2;
	private TextArea textArea;
	private TextArea textArea_1;
	private TextArea textArea_2;
	private JTextField textField_5;
	private JLabel lblTelefono;




















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
		Colecta colecta1 = new Colecta();

		frame = new JFrame();
		frame.setBounds(100, 100, 1042, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblRegistro = new JLabel("Registro");
		lblRegistro.setForeground(Color.BLUE);
		lblRegistro.setBounds(10, 42, 65, 14);
		panel.add(lblRegistro);
		
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
				usuario1.setTelefono(String.valueOf(textField_5.getText()));
				
			}
		});
		btnNewButton.setBounds(6, 272, 89, 23);
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
		
		lblLugar = new JLabel("Lugar");
		lblLugar.setBounds(294, 138, 46, 17);
		panel.add(lblLugar);
		
		button = new JButton("Ingresar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				colecta1.setMaterial(String.valueOf(comboBox.getSelectedItem()));
				colecta1.setFecha(String.valueOf(dateChooser.getDate()));
				colecta1.setLugar(String.valueOf(comboBox_1.getSelectedItem()));
				
				
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
		
		label_1 = new JLabel("Lugar");
		label_1.setBounds(570, 137, 46, 17);
		panel.add(label_1);
		
		button_1 = new JButton("Ingresar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				voluntariado1.setHora(String.valueOf(comboBox_2.getSelectedItem()));
				voluntariado1.setFecha(String.valueOf(dateChooser_1.getDate()));
				voluntariado1.setLugar(String.valueOf(comboBox_3.getSelectedItem()));

				
			}
		});
		button_1.setBounds(570, 234, 89, 23);
		panel.add(button_1);
		
		lblVerInformacion = new JLabel("Ver informacion de Usuario");
		lblVerInformacion.setForeground(Color.RED);
		lblVerInformacion.setBounds(10, 306, 170, 14);
		panel.add(lblVerInformacion);
		
		label_2 = new JLabel("...");
		label_2.setBounds(10, 366, 867, 20);
		panel.add(label_2);
		
		btnSubir = new JButton("Solicitar");
		btnSubir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(String.valueOf(usuario1));
				
			}
		});
		btnSubir.setBounds(6, 331, 89, 23);
		panel.add(btnSubir);
		
		lblVerInformacionDe = new JLabel("Ver informacion de Colecta");
		lblVerInformacionDe.setForeground(Color.RED);
		lblVerInformacionDe.setBounds(258, 306, 164, 14);
		panel.add(lblVerInformacionDe);
		
		button_2 = new JButton("Solicitar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText(String.valueOf(colecta1));
			}
		});
		button_2.setBounds(258, 331, 89, 23);
		panel.add(button_2);
		
		label_3 = new JLabel("...");
		label_3.setBounds(258, 369, 881, 14);
		panel.add(label_3);
		
		lblVerInformacionDe_1 = new JLabel("Ver informacion de Voluntariado");
		lblVerInformacionDe_1.setForeground(Color.RED);
		lblVerInformacionDe_1.setBounds(526, 306, 219, 14);
		panel.add(lblVerInformacionDe_1);
		
		button_3 = new JButton("Solicitar");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textArea_2.setText(String.valueOf(voluntariado1));
				
			}
		});
		button_3.setBounds(526, 331, 89, 23);
		panel.add(button_3);
		
		label_4 = new JLabel("...");
		label_4.setBounds(526, 365, 846, 23);
		panel.add(label_4);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(377, 107, 96, 19);
		panel.add(dateChooser);
		
		dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(652, 107, 96, 19);
		panel.add(dateChooser_1);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Cayala", "San Cristobal", "Palacio Nacional", "Vista Hermosa", "La Reforma", "El Trebol", "Zona 3"}));
		comboBox_1.setBounds(377, 138, 96, 19);
		panel.add(comboBox_1);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Cayala", "San Cristobal", "Palacio Nacional", "Vista Hermosa", "La Reforma", "El Trebol", "Zona 3"}));
		comboBox_3.setBounds(652, 138, 96, 19);
		panel.add(comboBox_3);
		
		verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(190, 0, 104, 576);
		panel.add(verticalStrut);
		
		verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setBounds(461, 36, 104, 546);
		panel.add(verticalStrut_1);
		
		verticalStrut_2 = Box.createVerticalStrut(20);
		verticalStrut_2.setBounds(736, 0, 104, 576);
		panel.add(verticalStrut_2);
		
		verticalBox = Box.createVerticalBox();
		verticalBox.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		verticalBox.setBounds(479, 11, 70, 25);
		panel.add(verticalBox);
		
		lblRecycler = new JLabel("Re-Cycler");
		verticalBox.add(lblRecycler);
		lblRecycler.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRecycler.setForeground(Color.BLACK);
		
		lblEmpresa = new JLabel("Empresa");
		lblEmpresa.setForeground(Color.BLUE);
		lblEmpresa.setBounds(834, 27, 96, 20);
		panel.add(lblEmpresa);
		
		btnSolicitar = new JButton("Solicitar");
		btnSolicitar.setBounds(817, 103, 89, 23);
		panel.add(btnSolicitar);
		
		lblVerInformacionDe_2 = new JLabel("Ver informacion de Empresa");
		lblVerInformacionDe_2.setForeground(Color.RED);
		lblVerInformacionDe_2.setBounds(817, 76, 219, 14);
		panel.add(lblVerInformacionDe_2);
		
		textArea = new TextArea();
		textArea.setBounds(10, 391, 200, 175);
		panel.add(textArea);
		
		textArea_1 = new TextArea();
		textArea_1.setBounds(280, 391, 200, 175);
		panel.add(textArea_1);
		
		textArea_2 = new TextArea();
		textArea_2.setBounds(548, 391, 200, 175);
		panel.add(textArea_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(105, 228, 86, 20);
		panel.add(textField_5);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(10, 234, 46, 14);
		panel.add(lblTelefono);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}

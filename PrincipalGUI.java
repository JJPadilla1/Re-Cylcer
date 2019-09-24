import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class PrincipalGUI {

	private JFrame frame;
	private JTextField txtGananciasCalculadora;
	private TextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalGUI window = new PrincipalGUI();
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
	public PrincipalGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 824, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRecycler = new JLabel("Re-Cycler");
		lblRecycler.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecycler.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblRecycler.setBounds(10, 11, 764, 52);
		frame.getContentPane().add(lblRecycler);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Inicio de Sesi\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 74, 191, 212);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Correo:");
		lblNewLabel.setBounds(10, 26, 46, 14);
		panel.add(lblNewLabel);
		
		JTextPane txtCorreo = new JTextPane();
		txtCorreo.setBounds(10, 40, 170, 20);
		panel.add(txtCorreo);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(10, 71, 83, 14);
		panel.add(lblContrasea);
		
		JTextPane txtContrasena = new JTextPane();
		txtContrasena.setBounds(10, 85, 170, 20);
		panel.add(txtContrasena);
		
		JButton btnIniciarSesin = new JButton("Iniciar sesi\u00F3n");
		btnIniciarSesin.setBounds(41, 116, 119, 23);
		panel.add(btnIniciarSesin);
		
		JTextArea txtAreaInicioDeSesion = new JTextArea();
		txtAreaInicioDeSesion.setEditable(false);
		txtAreaInicioDeSesion.setBounds(10, 151, 170, 46);
		panel.add(txtAreaInicioDeSesion);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Calculadora de Reciclaje", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 297, 191, 210);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Material:");
		lblNewLabel_1.setBounds(10, 25, 67, 14);
		panel_1.add(lblNewLabel_1);
		
		JComboBox cbMaterialCalculadora = new JComboBox();
		cbMaterialCalculadora.setModel(new DefaultComboBoxModel(new String[] {"Metal", "Plastico", "Vidrio", "Papel"}));
		cbMaterialCalculadora.setBounds(10, 41, 171, 20);
		panel_1.add(cbMaterialCalculadora);
		
		JLabel lblNewLabel_2 = new JLabel("Peso en Kilogramos:");
		lblNewLabel_2.setBounds(10, 72, 149, 14);
		panel_1.add(lblNewLabel_2);
		
		JTextPane txtPesoCalculadora = new JTextPane();
		txtPesoCalculadora.setBounds(10, 88, 171, 20);
		panel_1.add(txtPesoCalculadora);
		
		JLabel lblNewLabel_3 = new JLabel("Ganancias estimadas (Q):");
		lblNewLabel_3.setBounds(10, 163, 149, 14);
		panel_1.add(lblNewLabel_3);
		
		txtGananciasCalculadora = new JTextField();
		txtGananciasCalculadora.setEditable(false);
		txtGananciasCalculadora.setBounds(10, 179, 171, 20);
		panel_1.add(txtGananciasCalculadora);
		txtGananciasCalculadora.setColumns(10);
		
		Aplicacion obtener = new Aplicacion();

		
		JButton btnCalculadora = new JButton("Calcular");
		btnCalculadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean v;
				v = (obtener.getvalidacion(txtPesoCalculadora.getText()));
				
				if (v ==true) {
				
				
				txtGananciasCalculadora.setText(obtener.getcalculadora(String.valueOf(cbMaterialCalculadora.getSelectedItem()), Float.parseFloat((txtPesoCalculadora.getText()))));
			}
				else {
					txtPesoCalculadora.setText("Caracteres Invalidos");
					
				}
			}
		}
		);
		btnCalculadora.setBounds(43, 119, 89, 23);
		panel_1.add(btnCalculadora);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Participar en una colecta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(211, 74, 191, 433);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox cbMaterialColecta = new JComboBox();
		cbMaterialColecta.setModel(new DefaultComboBoxModel(new String[] {"Metal", "Plastico", "Vidrio", "Papel"}));
		cbMaterialColecta.setBounds(10, 40, 171, 20);
		panel_2.add(cbMaterialColecta);
		
		JLabel label = new JLabel("Material:");
		label.setBounds(10, 24, 66, 14);
		panel_2.add(label);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha:");
		lblNewLabel_4.setBounds(10, 73, 46, 14);
		panel_2.add(lblNewLabel_4);
		
		JComboBox cdFechaColecta = new JComboBox();
		cdFechaColecta.setModel(new DefaultComboBoxModel(new String[] {"29 de Septiembre", "4 de Octubre", "17 de Octubre", "30 de Octubre", "13 de Noviembre"}));
		cdFechaColecta.setBounds(10, 88, 171, 20);
		panel_2.add(cdFechaColecta);
		
		JLabel lblLugar = new JLabel("Lugar:");
		lblLugar.setBounds(10, 119, 46, 14);
		panel_2.add(lblLugar);
		
		JComboBox cbLugarColecta = new JComboBox();
		cbLugarColecta.setModel(new DefaultComboBoxModel(new String[] {"Ciudad de Guatemala", "Coban", "Antigua Guatemala", "Mixco", "Xela"}));
		cbLugarColecta.setBounds(10, 136, 171, 20);
		panel_2.add(cbLugarColecta);
		
		JButton btnAnadirColecta = new JButton("A\u00F1adir");
		btnAnadirColecta.setBounds(10, 168, 80, 23);
		panel_2.add(btnAnadirColecta);
		
		JLabel lblNewLabel_5 = new JLabel("Colectas Inscritas:");
		lblNewLabel_5.setBounds(10, 217, 171, 14);
		panel_2.add(lblNewLabel_5);
		
		JButton btnQuitarColecta = new JButton("Quitar");
		btnQuitarColecta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQuitarColecta.setBounds(100, 168, 81, 23);
		panel_2.add(btnQuitarColecta);
		
		TextArea textArea_2 = new TextArea();
		textArea_2.setBounds(10, 236, 171, 187);
		panel_2.add(textArea_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ofrecerse como voluntario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(412, 74, 191, 433);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblHoraVoluntariado = new JLabel("Hora:");
		lblHoraVoluntariado.setBounds(10, 24, 46, 14);
		panel_3.add(lblHoraVoluntariado);
		
		JComboBox cbHoraVoluntariado = new JComboBox();
		cbHoraVoluntariado.setModel(new DefaultComboBoxModel(new String[] {"08:00", "10:00", "12:00", "14:00", "16:00"}));
		cbHoraVoluntariado.setBounds(10, 41, 171, 20);
		panel_3.add(cbHoraVoluntariado);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(10, 72, 46, 14);
		panel_3.add(lblFecha);
		
		JComboBox cbFechaVoluntariado = new JComboBox();
		cbFechaVoluntariado.setModel(new DefaultComboBoxModel(new String[] {"29 de Septiembre", "4 de Octubre", "17 de Octubre", "30 de Octubre", "13 de Noviembre"}));
		cbFechaVoluntariado.setBounds(10, 87, 171, 20);
		panel_3.add(cbFechaVoluntariado);
		
		JLabel lblLugar_1 = new JLabel("Lugar:");
		lblLugar_1.setBounds(10, 118, 46, 14);
		panel_3.add(lblLugar_1);
		
		JComboBox cbLugarVoluntariado = new JComboBox();
		cbLugarVoluntariado.setModel(new DefaultComboBoxModel(new String[] {"Ciudad de Guatemala", "Coban", "Antigua Guatemala", "Mixco", "Xela"}));
		cbLugarVoluntariado.setBounds(10, 134, 171, 20);
		panel_3.add(cbLugarVoluntariado);
		
		JButton btnAnadirVoluntariado = new JButton("A\u00F1adir");
		btnAnadirVoluntariado.setBounds(10, 165, 79, 23);
		panel_3.add(btnAnadirVoluntariado);
		
		JButton btnQuitarVoluntariado = new JButton("Quitar");
		btnQuitarVoluntariado.setBounds(99, 165, 82, 23);
		panel_3.add(btnQuitarVoluntariado);
		
		JLabel lblVoluntariadosInscritos = new JLabel("Voluntariados inscritos:");
		lblVoluntariadosInscritos.setBounds(10, 216, 151, 14);
		panel_3.add(lblVoluntariadosInscritos);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(10, 236, 171, 187);
		panel_3.add(textArea_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Informaci\u00F3n:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(613, 74, 185, 433);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnDatosEmpresas = new JButton("Datos de Empresas");
		btnDatosEmpresas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(obtener.getinformacionempresas());
				
			}
		});
		btnDatosEmpresas.setBounds(10, 21, 165, 23);
		panel_4.add(btnDatosEmpresas);
		
		JButton btnPreguntasFrecuentes = new JButton("Preguntas Frecuentes");
		btnPreguntasFrecuentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(obtener.getpreguntasfrecuentes());
			}
		});
		btnPreguntasFrecuentes.setBounds(10, 55, 165, 23);
		panel_4.add(btnPreguntasFrecuentes);
		
		JButton btnAcercaDeNosotros = new JButton("Acerca de Nosotros");
		btnAcercaDeNosotros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(obtener.getinformacionsobrenosotros());
			}
		});
		btnAcercaDeNosotros.setBounds(10, 89, 165, 23);
		panel_4.add(btnAcercaDeNosotros);
		
		textArea = new TextArea();
		textArea.setBounds(10, 118, 165, 305);
		panel_4.add(textArea);
	}
}

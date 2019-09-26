import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Registro {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro window = new Registro();
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
	public Registro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Re-Cycler");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 36));
		frame.getContentPane().add(label, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Registro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel label_1 = new JLabel("Correo:");
		label_1.setBounds(10, 26, 83, 14);
		panel.add(label_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 40, 170, 20);
		panel.add(textPane);
		
		JLabel label_2 = new JLabel("Contrase\u00F1a:");
		label_2.setBounds(10, 71, 100, 14);
		panel.add(label_2);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(10, 85, 170, 20);
		panel.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(200, 40, 170, 20);
		panel.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(200, 85, 170, 20);
		panel.add(textPane_3);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(200, 26, 83, 14);
		panel.add(lblNombre);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(200, 71, 83, 14);
		panel.add(lblDireccin);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(10, 131, 170, 20);
		panel.add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setBounds(200, 131, 170, 20);
		panel.add(textPane_5);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(10, 116, 100, 14);
		panel.add(lblTelefono);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(200, 116, 83, 14);
		panel.add(lblUsername);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aplicacion op = new Aplicacion();
				
				if(textPane_5.getText().equals(null) || textPane_1.getText().equals(null) || textPane.getText().equals(null) || textPane_4.getText().equals(null) || textPane_3.getText().equals(null) || textPane_2.getText().equals(null));{
					JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
					String x = JOptionPane.showInputDialog("Ingrese el username");
					String y =JOptionPane.showInputDialog("Ingrese la contrasena");
					String z = JOptionPane.showInputDialog("Ingrese el correo");
					String w =JOptionPane.showInputDialog("Ingrese el telefono");
					String r = JOptionPane.showInputDialog("Ingrese la direccion");
					String a =JOptionPane.showInputDialog("Ingrese el nombre");
					textPane_5.setText(x);
					textPane_1.setText(y);
					textPane.setText(z);
					textPane_4.setText(w);
					textPane_3.setText(r);
					textPane_2.setText(a);
				}
					
				 
				if(textPane_5.getText() != (null) && textPane_1.getText() != (null) && textPane.getText()!=(null) && textPane_4.getText()!=(null) && textPane_3.getText()!=(null) && textPane_2.getText()!=(null));{
				op.anadir(new Usuario(textPane_5.getText(), textPane_1.getText(), textPane.getText(), textPane_4.getText(), textPane_3.getText(), textPane_2.getText()));
				Login ventanalogin = new Login();
				ventanalogin.frame.setVisible(true);
				Registro.this.frame.dispose();}
				
			}	
			});
		btnRegistrarse.setBounds(72, 171, 108, 23);
		panel.add(btnRegistrarse);
		
		JButton btnInicioDeSesin = new JButton("Iniciar Sesi\u00F3n");
		btnInicioDeSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login ventanalogin = new Login();
				ventanalogin.frame.setVisible(true);
				Registro.this.frame.dispose();
			}
		});
		btnInicioDeSesin.setBounds(200, 171, 115, 23);
		panel.add(btnInicioDeSesin);
		
		JLabel lblyaTienesUna = new JLabel("\u00BFYa tienes una cuenta?");
		lblyaTienesUna.setBounds(200, 158, 170, 14);
		panel.add(lblyaTienesUna);
	}
}

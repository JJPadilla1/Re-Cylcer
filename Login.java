import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
import java.awt.event.ActionEvent;

public class Login {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
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
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Inicio de Sesi\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel label_1 = new JLabel("Correo:");
		label_1.setBounds(10, 26, 46, 14);
		panel.add(label_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 40, 170, 20);
		panel.add(textPane);
		
		JLabel label_2 = new JLabel("Contrase\u00F1a:");
		label_2.setBounds(10, 71, 83, 14);
		panel.add(label_2);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(10, 85, 170, 20);
		panel.add(textPane_1);
		
		JButton button = new JButton("Iniciar sesi\u00F3n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aplicacion op = new Aplicacion();
				String contra ="";
				String correo = "";
				if(op.loginContra(contra).equals(textPane.getText()) && op.loginCorreeo(correo).equals(textPane_1.getText()));{
					PrincipalGUI aplicacion = new PrincipalGUI();
					aplicacion.frame.setVisible(true);
					Login.this.frame.dispose();}
				}
				
				
			
		});
		button.setBounds(41, 116, 119, 23);
		panel.add(button);
	}

}

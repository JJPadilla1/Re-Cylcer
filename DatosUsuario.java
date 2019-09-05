
public class DatosUsuario {
	private String usuario;
	private String contrasena;
	private String correo;
	private String telefono;
	private String direccion;
	private String nombre;
	
	public DatosUsuario() {
		usuario = "";
		contrasena = "";
		correo = "";
		telefono = "";
		direccion = "";
		nombre = "";
	}
	
	//Usuario
	public String UserName() {
		usuario = GUI.textField.getText();
		return usuario;
	}
	
	public String Contrasena() {
		contrasena = GUI.textField_1.getText();
		return contrasena;
	}
	
	public String Correo() {
		correo = GUI.textField_2.getText();
		return correo;
	}
	
	public String Direccion() {
		direccion = GUI.textField_3.getText();
		return direccion;
	}
	
	public String Telefono() {
		telefono = GUI.textField_4.getText();
		return telefono;
	}
	public String Nombre() {
		nombre = GUI.textField_5.getText();
		return nombre;
	}
	
	
}

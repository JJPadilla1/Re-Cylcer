import java.util.ArrayList;
/**
 * @author  Grupo Re-Cycler
 * @date 23-08-2019
 * Universidad del Valle de Guatemala
 * Main, aplicación, Re-cycler
 */

 //Declarar las clases como un Arraylist
public class Array{
    private ArrayList<Empresa> empresas;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Voluntariado> voluntariados;
    private ArrayList<Colecta> colectas;

    public Array (){}
    

//Constructor

public ArrayList getEmpresa(){
    empresas = new ArrayList<Empresa>();
    return empresas;
    }
public ArrayList getUsuario(){
    usuarios = new ArrayList<Usuario>();
    return usuarios;
    }
public ArrayList getVoluntariado(){
    voluntariados = new ArrayList<Voluntariado>();
    return voluntariados;
    }
public ArrayList getColecta(){
    colectas = new ArrayList<Colecta>();
    return colectas;
    }
public void setEmpresa(int x, String NombreEmpresa, String Correo, String Telefono, String Direccion){
    Empresa[x].setNombreEmpresa(NombreEmpresa);
    Empresa[x].setCorreo(Correo);
    Empresa[x].setTelefono(Telefono);
    Empresa[x].setDireccion(Direccion);
}
public void setUsuario(int x, String UserName, String Contrasena, String Correo, String Telefono, String Direccion, String Nombre){
    Usuario[x].setUserName(UserName);
    Usuario[x].setContrasena(Contrasena);
    Usuario[x].setCorreo(Correo);
    Usuario[x].setTelefono(Telefono);
    Usuario[x].setDireccion(Direccion);
    Usuario[x].setNombre(Nombre);
}
public void setVoluntariado(int x, String Lugar, String Fecha){
    Voluntariado[x].setLugar(Lugar);
    Voluntariado[x].setFecha(Fecha);
}
public void setColecta(int x, String Material, String Fecha, String Lugar){
    Colecta[x].setMaterial(Material);
    Colecta[x].setFecha(Fecha);
    Colecta[x].setLugar(Lugar);
}
public String toString(){
    return "\nEmpresa: " + empresas
            + "\nUsuarios: " + usuarios
            + "\nVoluntariados: " + voluntariados
            + "\nColectas: " + colectas;

}
}
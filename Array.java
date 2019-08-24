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
    private Usuario usuario;
    private ArrayList<Voluntariado> voluntariados;
    private ArrayList<Colecta> colectas;

    public Array (){
        empresas = new ArrayList<Empresa>();
        usuario = new Usuario();
        voluntariados = new ArrayList<Voluntariado>();
        colectas = new ArrayList<Colecta>();
    }

//Constructor

public ArrayList<Empresa> getEmpresa(){
    return empresas;
    }
public Usuario getUsuario(){
    return usuario;
    }
public ArrayList<Voluntariado> getVoluntariado(){
    return voluntariados;
    }
public ArrayList<Colecta> getColecta(){
    return colectas;
    }

//Método para agregar nueva empresa
//@param NombreEmpresa Nombre de la empresa de reciclaje que el usuario desea agregar
//@param Correo Corereo de la empresa de reciclaje que el usuario desea agregar
//@param Telefono Telefono de la empresa de reciclaje que el usuario desea agregar
//@param Direccion Direccion de la empresa de reciclaje que el usuario desea agregar
public void setNewEmpresa(String NombreEmpresa, String Correo, String Telefono, String Direccion ){
    //Se crea un objeto de tipo Empresa
    Empresa Business = new Empresa();
    //Todos los sets de Empresa para el objeto Business
    Business.setNombreEmpresa(NombreEmpresa);
    Business.setCorreo(Correo);
    Business.setTelefono(Telefono);
    Business.setDireccion(Direccion);
    //Se agrega al arraylist Empresas el array Business
    empresas.add(Business);
}

//Método para cambiar los datos de una empresa existente
//@param x número de la posición de la empresa que se desea cambiar la información
//@param NombreEmpresa Nombre de la empresa de reciclaje que el usuario desea modificar
//@param Correo Corereo de la empresa de reciclaje que el usuario desea modificar
//@param Telefono Telefono de la empresa de reciclaje que el usuario desea modificar
//@param Direccion Direccion de la empresa de reciclaje que el usuario desea modificar
public void modificarEmpresa(int x, String NombreEmpresa, String Correo, String Telefono, String Direccion){
    //Se crea un objeto de tipo Empresa
    Empresa Business = new Empresa();
    //Todos los sets de Empresa para el objeto Business
    Business.setNombreEmpresa(NombreEmpresa);
    Business.setCorreo(Correo);
    Business.setTelefono(Telefono);
    Business.setDireccion(Direccion);
    //Se sustituye los nuevos datos "Business" en la posición x del arraylist empresas
    empresas.set(x,Business);
}


//Método para setear los datos del usuario
//@param Username Username del usuario 
//@param Contraseña Contraseña que el usuario desee
//@param Correo Correo que el usuario desea agregar
//@param Telefono Telefono que el usuario desea agregar
//@param Direccion Direccion que el usuario desea agregar
//@param Nombre Nombre del usuario que desee registrar
public void setUsuario(String UserName, String Contrasena, String Correo, String Telefono, String Direccion, String Nombre){
    usuario.setUserName(UserName);
    usuario.setContrasena(Contrasena);
    usuario.setCorreo(Correo);
    usuario.setTelefono(Telefono);
    usuario.setDireccion(Direccion);
    usuario.setNombre(Nombre);
}



//Método para agregar nuevo voluntariado
//@param Lugar = Lugar del voluntaridao que el usuario desea agregar
//@param Fecha = Fecha del voluntariado que el usuario desea agregar
public void setNewVoluntariado(String Lugar, String Fecha){
    //Se crea un objeto de tipo Voluntariado
    Voluntariado Business = new Voluntariado();
    //Todos los sets de Voluntariado para el objeto Business
    Business.setLugar(Lugar);
    Business.setFecha(Fecha);
    //Se agrega al arraylist Empresas el array Business
    voluntariados.add(Business);
}

//Método para cambiar los datos de un voluntariado existente
//@param x número de la posición del voluntariado que se desea cambiar la información
//@param Lugar Lugar del voluntariado que el usuario desea modificar
//@param Fecha Fecha del voluntariado que el usuario desea modificar
public void modificarVoluntariado(int x,String Lugar, String Fecha){
    //Se crea un objeto de tipo Voluntariado
    Voluntariado Business = new Voluntariado();
    //Todos los sets de Voluntariado para el objeto Business
    Business.setLugar(Lugar);
    Business.setFecha(Fecha);
    //Se sustituye los nuevos datos "Business" en la posición x del arraylist voluntariados
    voluntariados.set(x,Business);
}




//Método para agregar nueva colecta
//@param Material de reciclaje que el usuario desea agregar a la Colecta
//@param Fecha Fecha de la colectan de reciclaje que el usuario desea agregar
//@param Lugar Lugar de la colecta de reciclaje que el usuario desea agregar
public void setNewColecta(String Material, String Fecha, String Lugar){
    //Se crea un objeto de tipo Colecta
    Colecta Business = new Colecta();
    //Todos los sets de Colecta para el objeto Business
    Business.setMaterial(Material);
    Business.setFecha(Fecha);
    Business.setLugar(Lugar);
    //Se agrega al arraylist Empresas el array Business
    colectas.add(Business);
}
//Método para cambiar los datos de una colecta existente
//@param x número de la posición de la colecta que se desea cambiar la información
//@param NombreEmpresa Nombre de la empresa de reciclaje que el usuario desea modificar
//@param Correo Corereo de la empresa de reciclaje que el usuario desea modificar
//@param Telefono Telefono de la empresa de reciclaje que el usuario desea modificar
//@param Direccion Direccion de la empresa de reciclaje que el usuario desea modificar
public void modificarColecta(int x, String Material, String Fecha, String Lugar){
    //Se crea un objeto de tipo Colecta
    Colecta Business = new Colecta();
    //Todos los sets de Empresa para el objeto Business
    Business.setMaterial(Material);
    Business.setFecha(Fecha);
    Business.setLugar(Lugar);
    //Se sustituye los nuevos datos "Business" en la posición x del arraylist colectas
    colectas.set(x,Business);
}



public String toString(){
    return "\nEmpresa: " + empresas
            + "\nUsuario: " + usuario
            + "\nVoluntariados: " + voluntariados
            + "\nColectas: " + colectas;

}
}
import java.util.ArrayList;
/**
 * @author  Grupo Re-Cycler
 * @date 23-08-2019
 * Universidad del Valle de Guatemala
 * Modelador de aplicación Re-cycler
 */



/**
 * Declarar las clases como un Arraylist
 */
public class Aplicacion{
    private ArrayList<Empresa> empresas;
    private Usuario usuario;
    private ArrayList<Voluntariado> voluntariados;
    private ArrayList<Colecta> colectas;

    public Aplicacion (){
        empresas = new ArrayList<Empresa>();
        usuario = new Usuario();
        voluntariados = new ArrayList<Voluntariado>();
        colectas = new ArrayList<Colecta>();
    }

    /**
     * Método para obtener la lista de empresas
     * @return ArrayList con las empresas
     */
    public ArrayList<Empresa> getEmpresa(){
        return empresas;
        }
    
    /**
     * Método para obtener objeto de usuario
     * @return Objeto de tipo usuario
     */  
    public Usuario getUsuario(){
        return usuario;
        }

    /**
     * Método para obtener la lista de voluntariados
     * @return ArrayList con los voluntariados
     */
    public ArrayList<Voluntariado> getVoluntariado(){
        return voluntariados;
        }

    /**
     * Método para obtener la lista de colectas
     * @return ArrayList con las colectas
     */
    public ArrayList<Colecta> getColecta(){
        return colectas;
        }

    /**
     * Método para agregar nueva empresa al ArrayList de empress.
     * @param NombreEmpresa Nombre de la empresa de reciclaje que el usuario desea agregar
     * @param Correo Corereo de la empresa de reciclaje que el usuario desea agregar
     * @param Telefono Telefono de la empresa de reciclaje que el usuario desea agregar
     * @param Direccion Direccion de la empresa de reciclaje que el usuario desea agregar
     * @param Material Material de la empresa
     */
    public void setNewEmpresa(String NombreEmpresa, String Correo, String Telefono, String Direccion, String Material){
        /**
         * Se crea un objeto de tipo Empresa
         */
        Empresa Business = new Empresa();
        /**
         * Todos los sets de Empresa para el objeto Business
         */
        Business.setNombreEmpresa(NombreEmpresa);
        Business.setCorreo(Correo);
        Business.setTelefono(Telefono);
        Business.setDireccion(Direccion);
        Business.setMaterial(Material);

        /** 
         * Se agrega al arraylist Empresas el array Business
         */
        empresas.add(Business);
        
    }

    /** 
     * Método para cambiar los datos de una empresa existente
     * @param x Indice de la empresa de la cual se quiere cambiar la información
     * @param NombreEmpresa Nombre de la empresa de reciclaje que el usuario desea modificar
     * @param Correo Corereo de la empresa de reciclaje que el usuario desea modificar
     * @param Telefono Telefono de la empresa de reciclaje que el usuario desea modificar
     * @param Direccion Direccion de la empresa de reciclaje que el usuario desea modificar
     * @param Material Material que colecta la empresa
     * 
     */
    public void modificarEmpresa(int x, String NombreEmpresa, String Correo, String Telefono, String Direccion, String Material){
        /**
         * Se crea un objeto de tipo Empresa
         */
        Empresa Business = new Empresa();
        /**
         * Todos los sets de Empresa para el objeto Business
         */
        Business.setNombreEmpresa(NombreEmpresa);
        Business.setCorreo(Correo);
        Business.setTelefono(Telefono);
        Business.setDireccion(Direccion);
        Business.setMaterial(Material);

        /**
         * Se sustituye los nuevos datos "Business" en la posición elegida del arraylist empresas
         */
        empresas.set(x,Business);
        
    }



    /**
     * Constructor con parámetros
     * @param UserName Nombre de usuario
     * @param Contrasena Contraseña de la cuenta
     * @param Correo Correo electrónico de la cuenta
     * @param Telefono Númrero telefónico de la cuenta
     * @param Direccion Dirección registrada en la cuenta
     * @param Nombre Nombre real del usuario
     */
    public void setUsuario(String UserName, String Contrasena, String Correo, String Telefono, String Direccion, String Nombre){
        usuario.setUserName(UserName);
        usuario.setContrasena(Contrasena);
        usuario.setCorreo(Correo);
        usuario.setTelefono(Telefono);
        usuario.setDireccion(Direccion);
        usuario.setNombre(Nombre);
    }



    /** Método para agregar nuevo voluntariado
     * @param Lugar = Lugar del voluntaridao que el usuario desea agregar
     * @param Fecha = Fecha del voluntariado que el usuario desea agregar
     * @param Hora = Hora del voluntarido que desea agregar.
     */
    public void setNewVoluntariado(String Lugar, String Fecha, String Hora){
        /**
         * Se crea un objeto de tipo Voluntariado
         */
        Voluntariado Business = new Voluntariado();
        /**
         * Todos los sets de Voluntariado para el objeto Business
         */
        Business.setLugar(Lugar);
        Business.setFecha(Fecha);
        Business.setHora(Hora);


        /**
         * Se agrega al arraylist Empresas el array Business
         */
        voluntariados.add(Business);
    }

    /** Método para cambiar los datos de un voluntariado existente
     * @param x número de la posición del voluntariado que se desea cambiar la información
     * @param Lugar Lugar del voluntariado que el usuario desea modificar
     * @param Fecha Fecha del voluntariado que el usuario desea modificar
     * @param Hora Hora del voluntariado que desea modificar
     */
    public void modificarVoluntariado(int x,String Lugar, String Fecha, String Hora){
        /**
         * Se crea un objeto de tipo Voluntariado
         */
        Voluntariado Business = new Voluntariado();
        /** 
         * Todos los sets de Voluntariado para el objeto Business
         */
        Business.setLugar(Lugar);
        Business.setFecha(Fecha);
        Business.setHora(Hora);
        /**
         * Se sustituye los nuevos datos "Business" en la posición x del arraylist voluntariados
         */
        voluntariados.set(x,Business);
    }




    /** Método para agregar nueva colecta
     * @param Material de reciclaje que el usuario desea agregar a la Colecta
     * @param Fecha Fecha de la colectan de reciclaje que el usuario desea agregar
     * @param Lugar Lugar de la colecta de reciclaje que el usuario desea agregar
     */
    public void setNewColecta(String Material, String Fecha, String Lugar){
        /**
         * Se crea un objeto de tipo Colecta
         */
        Colecta Business = new Colecta();
        /**
         * Todos los sets de Colecta para el objeto Business
         */
        Business.setMaterial(Material);
        Business.setFecha(Fecha);
        Business.setLugar(Lugar);
        /**
         * Se agrega al arraylist Empresas el array Business
         */
        colectas.add(Business);
    }

    /**
     * Setter para colecta específica
     * @param x Posición (indice) de colecta a modificar
     * @param Material Material a recolectar en colecta
     * @param Fecha Fecha en la que se dará la colecta
     * @param Lugar Lugar en el que se realizará la colecta
     */
    public void modificarColecta(int x, String Material, String Fecha, String Lugar){
        /**
         * Se crea un objeto de tipo Colecta
         */
        Colecta Business = new Colecta();
        /**
         * Todos los sets de Empresa para el objeto Business
         */
        Business.setMaterial(Material);
        Business.setFecha(Fecha);
        Business.setLugar(Lugar);
        /**
         * Se sustituye los nuevos datos "Business" en la posición x del arraylist colectas
         */
        colectas.set(x,Business);
    }



    /**
     * Método toString (concatena los atributos del objeto en un string)
     * @return String con datos de empresas
     */
    public String toString(){
        String PrintEmpresa = "\nEmpresas: ";
        String PrintUsuario = "\nUsuario: " + usuario.toString();
        String PrintVoluntariados = "\nVoluntariados: ";
        String PrintColectas = "\nColectas: ";

        for (int i = 0; i < empresas.size(); i = i + 1){
            PrintEmpresa = PrintEmpresa + empresas.get(i).toString();
        }

        for (int i = 0; i < voluntariados.size(); i = i + 1){
            PrintVoluntariados = PrintVoluntariados + voluntariados.get(i).toString();
        }  
        
        for (int i = 0; i < colectas.size(); i = i + 1){
            PrintColectas = PrintColectas + colectas.get(i).toString();
        }   

        return PrintEmpresa + PrintUsuario + PrintVoluntariados + PrintColectas;

    }
}

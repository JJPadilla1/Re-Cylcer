import java.util.*;
/**
 * @author  Grupo Re-Cycler
 * @date 18-08-2019
 * Universidad del Valle de Guatemala
 * Modelar perfil de Empresa
 */

public class Empresa{
    private String NombreEmpresa;
    private String Correo;
    private String Telefono;
    private String Direccion;
    private String[] Material;

    /**
     *constructor
    */
    public Empresa(){
        NombreEmpresa = "";
        Correo = "";
        Telefono = "";
        Direccion = "";
        String[] Material = {"", "", "", "", ""};
    }

    /**
     * Función para cambiar NombreEmpresa del Empresa
     * @param NombreEmpresa Cadena con NombreEmpresa del Empresa
     */
    public void setNombreEmpresa(String NombreEmpresa){
        this.NombreEmpresa = NombreEmpresa;
    }

    /**
     * Funcion para obtener NombreEmpresa del Empresa
     * @return Devuelve NombreEmpresa del Empresa
     */
    public String getNombreEmpresa(){
        return NombreEmpresa;
    }  
    
    /**
     * Función para cambiar Correo del Empresa
     * @param Correo Cadena con Correo del Empresa
     */
    public void setCorreo(String Correo){
        this.Correo = Correo;
    }

    /**
     * Funcion para obtener Correo del Empresa
     * @return Devuelve Correo del Empresa
     */
    public String getCorreo(){
        return Correo;
    }   


    /**
     * Función para cambiar Telefono del Empresa
     * @param Telefono Cadena con Telefono del Empresa
     */
    public void setTelefono(String Telefono){
        this.Telefono = Telefono;
    }

    /**
     * Funcion para obtener Telefono del Empresa
     * @return Devuelve Telefono del Empresa
     */
    public String getTelefono(){
        return Telefono;
    }  


    /**
     * Función para cambiar Direccion del Empresa
     * @param Direccion Cadena con Direccion del Empresa
     */
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    
    /**
     * Funcion para obtener Direccion del Empresa
     * @return Devuelve Direccion del Empresa
     */
    public String getDireccion(){
        return Direccion;
    }   


        /**
     * Función para cambiar Material de la Empresa cuando se tiene 1 material
     * @param Material Cadena con Material de la Empresa
     */
    public void setMaterial(String Material){
        this.Material[0] = Material;
    }

    /**
     * Función para cambiar Material de la Empresa cuando se tienen 2 materiales
     * @param Material1 Cadena con Material1 de la Empresa
     * @param Material2 Cadena con Material2 de la Empresa
     */
    public void setMaterial(String Material1, String Material2){
        this.Material[0] = Material1;
        this.Material[1] = Material2;
    }

    /**
     * Función para cambiar Material de la Empresa cuando se tienen 3 materiales
     * @param Material1 Cadena con Material1 de la Empresa
     * @param Material2 Cadena con Material2 de la Empresa
     * @param Material3 Cadena con Material3 de la Empresa
     */
    public void setMaterial(String Material1, String Material2, String Material3){
        this.Material[0] = Material1;
        this.Material[1] = Material2;
        this.Material[2] = Material3;
    } 

    /**
     * Función para cambiar Material de la Empresa cuando se tienen 4 materiales
     * @param Material1 Cadena con Material1 de la Empresa
     * @param Material2 Cadena con Material2 de la Empresa
     * @param Material3 Cadena con Material3 de la Empresa
     * @param Material4 Cadena con Material4 de la Empresa
     */
    public void setMaterial(String Material1, String Material2, String Material3, String Material4){
        this.Material[0] = Material1;
        this.Material[1] = Material2;
        this.Material[2] = Material3;
        this.Material[3] = Material4;
    }       

    /**
     * Funcion para obtener Material de la Empresa
     * @return Devuelve Materiales de la Empresa
     */
    public String getMaterial(){
        String x = "";
        for ( String i : Material){
            x += i + ", ";
        }
        return x;
    }   

    /**
     * Funcion que devuelve un string con datos del Empresa
     * @return Devuelve String con datos del Empresa
     */
    public String toString(){
        return "\nEmpresa: " + NombreEmpresa
                + "\nCorreo electronico: " + Correo
                + "\nNumero telefonico: " + Telefono
                + "\nDireccion del domicilio: " + Direccion;

    }
}
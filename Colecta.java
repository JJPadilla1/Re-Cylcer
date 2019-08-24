/**
 * @author  Grupo Re-Cycler
 * @date 18-08-2019
 * Universidad del Valle de Guatemala
 * Modelar Colectas futuras
 */

public class Colecta{
    private String[] Material;
    private String Fecha;
    private String Lugar;


    /**
     *constructor
    */
    public Colecta(){
        String[] Material = {"", "-", "-", "-"};
        Fecha = "";
        Lugar = "";
    }

    /**
     * Función para cambiar Material de la Colecta cuando se tiene 1 material
     * @param Material Cadena con Material de la Colecta
     */
    public void setMaterial(String Material){
        this.Material[0] = Material;
    }

    /**
     * Función para cambiar Material de la Colecta cuando se tienen 2 materiales
     * @param Material1 Cadena con Material1 de la Colecta
     * @param Material2 Cadena con Material2 de la colecta
     */
    public void setMaterial(String Material1, String Material2){
        this.Material[0] = Material1;
        this.Material[1] = Material2;
    }

    /**
     * Función para cambiar Material de la Colecta cuando se tienen 3 materiales
     * @param Material1 Cadena con Material1 de la Colecta
     * @param Material2 Cadena con Material2 de la colecta
     * @param Material3 Cadena con Material3 de la colecta
     */
    public void setMaterial(String Material1, String Material2, String Material3){
        this.Material[0] = Material1;
        this.Material[1] = Material2;
        this.Material[2] = Material3;
    } 

    /**
     * Función para cambiar Material de la Colecta cuando se tienen 4 materiales
     * @param Material1 Cadena con Material1 de la Colecta
     * @param Material2 Cadena con Material2 de la colecta
     * @param Material3 Cadena con Material3 de la colecta
     * @param Material4 Cadena con Material4 de la colecta
     */
    public void setMaterial(String Material1, String Material2, String Material3, String Material4){
        this.Material[0] = Material1;
        this.Material[1] = Material2;
        this.Material[2] = Material3;
        this.Material[3] = Material4;
    }       

    /**
     * Funcion para obtener Material de la Colecta
     * @return Devuelve Materiales de la Colecta
     */
    public String getMaterial(){
        String x = "";
        for ( String i : Material){
            x += i + ", ";
        }
        return x;
    }   


    /**
     * Función para cambiar Fecha de la Colecta
     * @param Fecha Cadena con Fecha de la Colecta
     */
    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }

    /**
     * Funcion para obtener Fecha de la Colecta
     * @return Devuelve Fecha de la Colecta
     */
    public String getFecha(){
        return Fecha;
    }   


    /**
     * Función para cambiar Lugar de la Colecta
     * @param Lugar Cadena con Lugar de la Colecta
     */
    public void setLugar(String Lugar){
        this.Lugar = Lugar;
    }

    /**
     * Funcion para obtener Lugar de la Colecta
     * @return Devuelve Lugar de la Colecta
     */
    public String getLugar(){
        return Lugar;
    }   


    /**
     * Método que devuelve los datos de la colecta
     * @return Devuelve los datos de la colecta
     */

    public String toString(){
            String x = "";
        for ( String i : Material){
            x += i + ", ";
        }
        return "\nLugar: " + Lugar
                + "\nFecha: " + Fecha
                + "\nMateriales: " + x;
    }
}
/**
 * @author  Grupo Re-Cycler
 * @date 05-09-2019
 * Universidad del Valle de Guatemala
 * Modelador de Preguntas frecuentes Re-cycler
 */

public class Pregunta{
    private String Pregunta;
    private String Respuesta;

    public Pregunta(){
        this.Pregunta = "";
        this.Pregunta = "";
    }
    public void setPreguntas(String Pregunta){
        this.Pregunta = Pregunta;
    }
    public void setRespuestas(String Respuesta){
        this.Respuesta = Respuesta;
    }
    public String getPregunta(){
        return Pregunta;
    }
    public String getRespuesta(){
        return Respuesta;
    }
    public String toString(){
        return "\nPregunta: " + Pregunta + "\nRespuesta: " + Respuesta; 
    }
}

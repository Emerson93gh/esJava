
package domain;

public class Persona {

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    public Persona(String nombre){
        this.nombre = nombre;
        //incrementar contador por cado objeto nuevo
        Persona.contadorPersonas++;
        //asignar nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override //anotacion que dice que sobreescribimos el metodo toString
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
}

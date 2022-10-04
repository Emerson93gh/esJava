package clases;

public class Persona {
    //Atributos de la clase
    public String nombre;
    public String apellido;
    
    //metodos (reutilizables)
    public void desplegarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}

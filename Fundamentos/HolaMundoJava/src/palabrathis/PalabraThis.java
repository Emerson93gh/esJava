package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona apellido: " + persona.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        //super(); llamada implicita al constructor de la clase padre (object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this:" + this);
        new Imprimir().imprimir(this); //objeto con otra sintaxis
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir:" + persona);
        System.out.println("impresion del objeto actual (this)" + this);
    }
}

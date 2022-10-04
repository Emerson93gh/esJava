
package pasoporreferencia;

import clases.Persona; //no es común ni la mejor forma

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Alex";
        System.out.println("persona1 = " + persona1.nombre);
        cambiaValor(persona1);
        System.out.println("persona1 = " + persona1.nombre);
    }
    
    public static void cambiaValor(Persona persona){
        persona.nombre = "Karla";
    }
}


package test;

import domain.Persona;


public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10; //ya no se puede modificar por el final
        System.out.println("miVariable = " + miVariable);
        
        System.out.println("Mi constante: " + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        System.out.println("persona1 = " + persona1.getNombre());
        
        persona1.setNombre("Carlos");
        System.out.println("persona1 = " + persona1.getNombre());
    }
}

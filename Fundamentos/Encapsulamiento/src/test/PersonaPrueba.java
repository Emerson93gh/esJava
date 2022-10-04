
package test;
import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
        System.out.println("persona1 = " + persona1);//se puede omitir el toString si se usa println y si ya está definido(en: Persona)
        persona1.setNombre("Juan Carlos");
        //System.out.println("persona1 nombre = " + persona1.getNombre());
        //System.out.println("persona1 sueldo = " + persona1.getSueldo());
        //System.out.println("persona1 eliminiado = " + persona1.isEliminado());
        System.out.println("persona1 = " + persona1.toString());
    }
}

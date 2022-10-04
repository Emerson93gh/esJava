package test;

import datos.*;
import domain.Persona;
import java.util.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        
        //Insertando un nuevo objeto de tipo Persona
//        Persona personaNueva = new Persona("Carlos", "Esparza", "ce@mail.com", "45454545");
//        personaDAO.insertar(personaNueva);

        //Modificando un objeto de Persona existente
//        Persona personaModificar = new Persona(4, "Juan Carlos", "Esparza", "jcesparza@mail.com", "454545");
//        personaDAO.actualizar(personaModificar);

        //Eliminar un registro
        Persona personaEliminar = new Persona(4);
        personaDAO.eliminar(personaEliminar);
        
        //Listado de personas
        List<Persona> personas = personaDAO.seleccionar();
        //for(Persona persona: personas){}
        personas.forEach(persona -> { 
            System.out.println("persona = " + persona);
        });
        
        
    }
}

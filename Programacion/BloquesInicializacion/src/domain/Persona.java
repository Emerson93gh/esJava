package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    //Se ejecutan antes del constructor
    static { //bloque de inicializacion estatico
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
        
    }
    {   //bloque de inicializacion no estatico
        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = Persona.contadorPersona++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}

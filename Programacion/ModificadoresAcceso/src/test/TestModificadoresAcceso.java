package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Publico");
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
        //Con ptotected no se puede utiliar el objeto de la Clase1
        
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
    }
}

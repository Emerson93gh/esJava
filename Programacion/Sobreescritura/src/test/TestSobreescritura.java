package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
//        Gerente gerente1 = new Gerente("Juan", 5000, "sistemas");
//        System.out.println("gerente1 = " + gerente1.obtenerDetalles());

        
        Empleado empleado = new Empleado("Juan", 5000);
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        
        Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
        //System.out.println("gerente = " + gerente.obtenerDetalles());
        imprimir(gerente);
    }
    
    //Polimorfismo, multiples comportamientos (de la clase padre con informacion de clase hija)
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}

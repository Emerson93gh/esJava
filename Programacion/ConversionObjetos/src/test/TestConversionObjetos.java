package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        
        //System.out.println(empleado.obtenerDetalles());
        
        //Downcasting, tipo de clase padre a tipo de clase hija
        //((Escritor) empleado).getTipoEscritura();//conversion de objetos
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //Upcasting, tipo de clase hija a tipo de clase padre
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}

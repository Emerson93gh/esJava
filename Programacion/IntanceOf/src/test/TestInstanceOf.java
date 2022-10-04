package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        //tipo de la variable - tipo donde apunta en memoria
        Empleado empleado = new Empleado("Juan", 5000);
        //determinarTipo(empleado);
        empleado = new Gerente("Karla", 10000, "Contabilidad");
        determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) {
        //primero desde clases hijas y luego clases padres
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente)empleado;//convertir al tipo gerente para acceder a atributos o metodos de clase hija
            System.out.println("gerente = " + gerente.getDepartamento());
//            ((Gerente) empleado).getDepartamento(); //resume las dos lineas anteriores
//            System.out.println("empleado = " + ((Gerente) empleado).getDepartamento());
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            System.out.println("empleado = " + empleado.getNombre());
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
            
        }
    }
}

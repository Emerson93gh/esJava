package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{//se comentaria el try y catch para que quede más limpio con el RuntimeException
        resultado = division(10, 0);
        //se pueden mostrar varias excepciones, empezar por menos jerarquia
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion: ");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Ocurrio un error de tipo Exception: ");
            //e.printStackTrace(System.out); //mas a detalle
            System.out.println(e.getMessage()); //solo el nombre de la excepcion
        }
        finally{
            System.out.println("Se reviso la division entre cero");
        }
        
        System.out.println("resultado = " + resultado);
        
    }
}

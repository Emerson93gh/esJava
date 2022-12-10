package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        // Interface LIST, respeta el orden ingresado
        // Mas lento y permite elementos duplicados
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        imprimir(miLista);

        // Iterface SET, no respeta el orden ingresado
        // Mas rapido y no permite elementos duplicados
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        imprimir(miSet);
        
        // Interface MAP
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Miguel");
        miMapa.put("valor2", "Angel");
        miMapa.put("valor3", "Rosaura");
        
        String elemento = (String) miMapa.get("valor1");
        System.out.println("elemento = " + elemento);
        // imprimir solo las keys
        imprimir(miMapa.keySet());
        // imprimir solo los valores asociados a cada llave
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection coleccion) {
//        for (Object elemento : coleccion) {
//            System.out.println("elemento = " + elemento);
//        }
        //funcion de flecha o lambda
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}

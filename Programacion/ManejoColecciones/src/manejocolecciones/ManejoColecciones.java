package manejocolecciones;

import java.util.*;

public class ManejoColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();//agrega elementos de forma dinamica y ordenada
        miLista.add("1");
        miLista.add(2);
        miLista.add(3);
        //elemento repetido
        miLista.add(3);
        //imprimir(miLista);
        
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        //valor duplicado
        miSet.add("300");//no se imprimio el duplicado
        //imprimir(miSet);
        
        Map miMapa = new HashMap();
        //llave - valor
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Carlos");
        //elemento repetido, sustituye al valor agregado
        miMapa.put("valor3", "Rosario");
        
        //imprimimoa las llaves
        imprimir(miMapa.keySet());
        //imprimimos valores
        imprimir(miMapa.values());
        //imprimimos un solo valor
        System.out.println(miMapa.get("valor3"));
        
    }
    
    private static void imprimir(Collection coleccion){ //interfaz padre de todas las colecciones
        for(Object elemento: coleccion){
            System.out.println("elemento = " + elemento);
        }
        System.out.println("");
    }
}

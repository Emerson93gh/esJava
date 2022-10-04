
package Operaciones;

public class Aritmetica {
    //Atributos
    int a;
    int b;
    
    //constructor vacio (metodo especial)
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    //constructor para inicializar, con sobrecarga
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        
    }
    
    //Metodos
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        //int resultado = a + b;
        //return resultado;
        return a + b;
    }
    
    public int sumarConArgumentos(int a, int b){ //si son iguales ya se requiere el uso de this
        this.a = a; //El argumento a se asigna al atributo this.a
        this.b = b; //
        return this.sumarConRetorno();
        /*
        this es un operador que distingue un atributo de la clase de una variable local
        y el uso de this es opcional, pero por buena practica
        */
    }
}

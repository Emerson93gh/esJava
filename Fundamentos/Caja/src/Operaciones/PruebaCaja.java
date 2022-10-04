package Operaciones;

public class PruebaCaja {
    public static void main(String[] args) {
        var ancho = 3;
        var alto = 2;
        var profundo = 6;
        
        Caja caja1 = new Caja();
        caja1.calcularVolumenConArgumentos(ancho, alto, profundo);
        System.out.println("caja1 con volumen = " + caja1.calcularVolumen());
    }
}

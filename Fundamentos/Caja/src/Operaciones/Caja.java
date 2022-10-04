package Operaciones;

public class Caja {
    //Atributos
    int ancho;
    int alto;
    int profundo;
    
    //Constructores
    public Caja(){
        System.out.println("Dentro de constructor vacio");
    }
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    //Metodos
    public int calcularVolumen(){
        return this.ancho * this.alto * this.profundo;
    }
    public int calcularVolumenConArgumentos(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        return this.calcularVolumen();
    }
}

package paquete1;

public class Clase1 {
    //public
    public String atributoPublico = "Valor atributo publico";
    
//    public Clase1(){
//        System.out.println("Constructor publico");
//    }
    
    public void metodoPublico(){
        System.out.println("Metodo publico");
        System.out.println(" ");
    }
    
    
    
    //protected, para heredar a clase hija
    protected String atributoProtected = "Valor atributo protected";
    
    protected Clase1(){
        System.out.println("Constructor protected");
    }
    
    public Clase1(String arg){
        System.out.println("Constructor publico");
    }
    
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
    
    //Default o package para ser mas restricivo, solo para un mismo paquete
    //Private, mucho mas restricitivo, para una misma clase o por get y set.
}

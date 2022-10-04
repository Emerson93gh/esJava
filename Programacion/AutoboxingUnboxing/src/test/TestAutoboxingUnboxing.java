package test;

public class TestAutoboxingUnboxing {
    //Clases envolventes de tipos primitivos - tipos object
    /*
    int - Integer
    long - Long
    float - Float
    double - Double
    boolean - Boolean
    byte - Byte
    char - Char
    short - Short
    */
    
    public static void main(String[] args) {
        Integer entero = 10; //Autoboxing
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.doubleValue()); //conversion
        
        int entero2 = entero; //Unboxing
        System.out.println("entero2 = " + entero2);
    }
    
}

package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        //polimorfismo y upcasting
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}

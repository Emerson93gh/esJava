
public class SegundaParte { //Sentencias de control
    public static void main(String [] args){
        //if - else
        var condicion = true;
        
        if(condicion){
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }
        //ejercicio
        var numero = 2;
        var numeroTexto = "Numero desconocido";
        
        if(numero == 1){
            numeroTexto = "Numero 1";
        } else if(numero == 2){
            numeroTexto = "Numero 2";
        } else if(numero == 3){
            numeroTexto = "Numero 3";
        } else if(numero == 4){
            numeroTexto = "Numero 4";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        
        //ejercicio 2
        var mes = 1;
        var estacion = "Estacion desconocida";
        
        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }else if(mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }else if(mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }else if(mes == 9 || mes == 10 || mes == 11){
            estacion = "Otoño";
        }
        System.out.println("estacion = " + estacion);
        
        //switch
        var numero2 = 2;
        var numeroTexto2 = "Valor desconocido";
        
        switch(numero2){
            case 1:
                numeroTexto2 = "Numero uno";
                break;
            case 2:
                numeroTexto2 = "Numero dos";
                break;
            case 3:
                numeroTexto2 = "Numero tres";
                break;
            case 4:
                numeroTexto2 = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto2 = " + numeroTexto2);
        
        //ejercicio2
        var mes2 = 10;
        var estacion2 = "Estacion desconocida";
        
        switch(mes2){
            case 1: case 2: case 12:
                estacion2 = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion2 = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion2 = "Verano";
                break;
            case 9: case 10: case 11:
                estacion2 = "Otoño";
                break;
        }
        System.out.println("estacion2 = " + estacion2);
        
        //Ciclos en java
        var contador = 0;
        while(contador < 3){
            System.out.println("contador = " + contador);
            contador++;
        }
        
        //ciclo do while
        var contador2 = 0;
        do{
            System.out.println("contador2 = " + contador2);
            contador2++;
        }while(contador2 < 3);
        
        //ciclo for
        for(var contador3 = 0; contador3 < 3; contador3++){
            if(contador3 % 2 == 0){
                System.out.println("contador3 = " + contador3);
                break; //rompe el ciclo
            }
        }
        
        for(var contador4 = 0; contador4 < 3; contador4++){
            if(contador4 % 2 != 0){
                continue; //ir a la siguiente iteracion
            }
            System.out.println("contador4 = " + contador4);
        }
    }
}

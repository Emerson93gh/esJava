
import java.util.Scanner;

public class Tareas {
    public static void main(String [] args){
        Scanner consola = new Scanner(System.in);
        var valorTexto = "Valor desconocido";
        System.out.println("Proporciona un valor entre 0 y 10:");
        var valor = Integer.parseInt(consola.nextLine());
        if(valor >= 9 && valor <= 10){
            valorTexto = "A";
        }else if(valor >= 8 && valor < 9){
            valorTexto = "B";
        }else if(valor >= 7 && valor < 8){
            valorTexto = "C";
        }else if(valor >= 6 && valor < 7){
            valorTexto = "D";
        }else if(valor >= 0 && valor < 6){
            valorTexto = "F";
        }
        System.out.println(valorTexto);
    }
}

/*  TAREAS COMENTADAS
TAREA6: SISTEMA DE CALIFICACIONES


TAREA5: EL MAYOR DE DOS NUMEROS
Scanner consola = new Scanner(System.in);
System.out.println("Proporciona el numero1:");
var numero1 = Integer.parseInt(consola.nextLine());
System.out.println("Proporciona el numero2:");
var numero2 = Integer.parseInt(consola.nextLine());

var numeroMayor = (numero1 > numero2) ? "numero1: " + numero1 :
        "numero2: " + numero2;
System.out.println("El numero mayor es " + numeroMayor);

TAREA4: AREA Y PERIMETRO DE UN RECTANGULO
Scanner consola = new Scanner(System.in);
System.out.println("Proporciona el alto:");
var alto = Integer.parseInt(consola.nextLine());
System.out.println("Proporciona el ancho:");
var ancho = Integer.parseInt(consola.nextLine());

var area = alto * ancho;
var perimetro = (alto + ancho) * 2;

System.out.println("Area: " + area);
System.out.println("Perimetro: " + perimetro);

TAREA3: PEDIR INFO DE UN LIBRO
Scanner consola = new Scanner(System.in);
System.out.println("Proporciona el nombre: ");
String nombre = consola.nextLine();
System.out.println("Proporciona el id: ");
var id = Integer.parseInt(consola.nextLine());
System.out.println("Proporciona el precio: ");
var precio = Double.parseDouble(consola.nextLine());
System.out.println("Proporciona el envio gratuito true/false: ");
var envio = Boolean.parseBoolean(consola.nextLine());

System.out.println(nombre + " #" + id);
System.out.println("Precio: $" + precio);
System.out.println("Envio gratuito: " + envio);

*/

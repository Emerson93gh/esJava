
import java.util.Scanner;

//Clase 01
public class HolaMundo {
    public static void main(String args[]){
        var saludo = "Hola mundo desde Java";
        System.out.println(saludo);
        /*
        //Clase 02 variables primitivas
        int miVariableEntera = 25;
        System.out.println(miVariableEntera);
        //modificamos valor de var
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "adios";
        System.out.println(miVariableCadena);
        
        //var
        var miVariableEntera2 = 10;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "nueva cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        //valores permitidos de nombres de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        
        //Concatenacion de cadenas
        var usuario = "Juan";
        var titulo = "Ingeniero";
        
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j); //suma de numeros
        System.out.println(i + j + usuario); //primero suma y concatenacion de cadena
        System.out.println(usuario + i + j); //concatenacion como contexto en cadena
        System.out.println(usuario + (i + j)); //parentesis mayor prioridad y luego concatena
        
        //caracteres especiales
        
        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
        
        //Clase Scanner
        usuario = "Carlos"; //informacion duo, que no la brinda el usuario
        System.out.println("usuario = " + usuario);
        
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        //usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe tu titulo: ");
        //titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
        
        //Ejercicio
        
        System.out.println("Proporciona el titulo:");
        //String titulo2 = consola.nextLine();
        System.out.println("Proporciona el autor:");
        //String autor = consola.nextLine();
        //System.out.println(titulo2 + " fue escrito por " + autor);
        
        //Tipos primitivos enteros: byte, short, int, long
        byte numeroByte = 10;
        System.out.println("Valor minimo de byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de byte: " + Byte.MAX_VALUE);
        
        numeroByte = (byte)129;
        
        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo de short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de short: " + Short.MAX_VALUE);
        
        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        
        long numeroLong = 10;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        
        //tipos primitivos de tipo flotante: float y doble
        float numeroFloat = 10.0F; //F literal de tipo flotante
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);
        
        double numeroDouble = 10;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);
        
        //Inferencia de tipos
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numerodouble = 10.0;
        System.out.println("numerodouble = " + numerodouble);
        
        var numeroFloat2 = 10.0F;
        System.out.println("numeroFloat2 = " + numeroFloat2);
        
        //Tipo char
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);
        
        var varCharDecimal1 = (char)33;
        System.out.println("varCharDecimal1 = " + varCharDecimal1);
        
        var varCharSimbolo1 = '!';
        System.out.println("varCharSimbolo1 = " + varCharSimbolo1);
        
        //conversion
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
        int letra = 'a';
        System.out.println("letra = " + letra);
        
        //tipos primitivos tipo boolean (o tipo bandera)
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);
        //ejemplo de algoritmos
        if(varBoolean == true){
            System.out.println("La bandera es verdadera");
        }
        else{
            System.out.println("La bandera es falsa");
        }
        
        var edad = 30;
        var esAdulto = edad >= 18;
        if(esAdulto){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
        
        //conversion de tipos primitivos
        var edad2 = Integer.parseInt("20");
        System.out.println("edad2 = " + (edad2 + 1));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Ejercicio pedir un valor
        System.out.println("Ingrese una edad: ");
        //edad2 = Integer.parseInt(consola.nextLine());
        System.out.println("edad2 = " + edad2);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(3);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter:");
        //caracter = consola.nextLine().charAt(0);
        //System.out.println("caracter = " + caracter);
        
        //operadores
        /*
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        var resultado2 = 3.0 / b;   // o 3D o 3F    para tipo flotante
        System.out.println("resultado division = " + resultado2);
        
        resultado = a % b;  //residuo de la division en valor entero
        System.out.println("resultado modulo = " + resultado);
        
        if(a % 2 == 0)
            System.out.println("Es numero par");
        else
            System.out.println("Es numero impar");
        
        //operadores de asignacion
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println("c = " + c);
        a += 1; //a = a + 1;
        System.out.println("a = " + a);
        a += 3;
        System.out.println("a = " + a);
        a -= 2;
        System.out.println("a = " + a);
        a *= 5;
        System.out.println("a = " + a);
        a /= 2;
        System.out.println("a = " + a);
        a %= 2;
        System.out.println("a = " + a);
        
        //operadores unarios
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //intremento
        //pre incremento, sim antes de la var
        var e = 3;
        var f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //pos incremento, sim despues de la var
        var g = 5;
        var h = g++;
        System.out.println("g = " + g); //teniamos pendiente un incremento
        System.out.println("h = " + h);
        
        //igual seria con el decremento
        
        //operadores de asignacion e igualdad
        var a = 3;
        var b = 2;
        
        var c = (a == b);
        System.out.println("c = " + c);
        var d = a != b;
        System.out.println("d = " + d);
        
        var cadena = "Hola";
        var cadena2 = "Adios";
        var e = cadena == cadena2; //compara ref de objetos
        System.out.println("e = " + e);
        var f = cadena.equals(cadena2); //compara el contenido
        System.out.println("f = " + f);
        
        //operadores relacionales
        var g = a >= b;
        System.out.println("g = " + g);
        
        if(a % 2 == 0)
            System.out.println("Es numero par");
        else
            System.out.println("Es numero impar");
        
        var edad3 = 16;
        var adulto = 18;
        
        if(edad3 >= adulto){
            System.out.println("Es adulto");
        } else {
            System.out.println("Es menor de edad");
        }
        
        //operadores condicionales
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = a >= 0 && a <= 10;
        if(resultado){
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }
        
        var vacaciones = true;
        var diaDescanso = false;
        
        if(vacaciones || diaDescanso){
            System.out.println("Padre puede asistir al juego del hijo");
        } else {
            System.out.println("Padre esta ocupado");
        }
        
        //operador ternario
        var resultado = (3 > 2) ? "Verdadero" : "Falso" ;
        System.out.println("resultado = " + resultado);
        
        var numero = 8;
        resultado = (numero % 2 == 0) ? "Numero par" : "Numero impar";
        System.out.println("resultado = " + resultado);
        
        //precedencia de operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado2 = 4 + 5 * 6 / 3;
        System.out.println("resultado2 = " + resultado2);
        */
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.my.company.ejemplos;

/* Importaciones */
import java.util.Scanner;

/**
 *
 * @author LaParca25
 */
public class Ejemplos {

    public static void main(String[] args) {

        operaciones();

    }

    // Estructuras de control, menu
    public static void menu() {

        // Variables
        Scanner leer = new Scanner(System.in);
        int x;

        // Menu
        System.out.println("--------------------");
        System.out.println("---MENÚ---");
        System.out.println("1. Ejemplo Nombre");
        System.out.println("2. Ejemplo Suma");
        System.out.println("3. Ejemplo Comparación");
        System.out.println("4. Ejemplo Par");
        System.out.println("5. Ejemplo Division");
        System.out.println("6. Ejemplo Exponente");
        System.out.println("7. Ejemplo Triangulo");
        System.out.println("8. Ejemplo Viaje Instituto");
        System.out.println("9. Ejemplo Viaje Salarios");
        System.out.println("10. Ejemplo Viaje Cumpleaños");
        System.out.println("--------------------");

        x = leer.nextInt();

        // CASE
        switch (x) {

            case 1:

                nombre();
                break;

            case 2:

                suma();
                break;

            case 3:

                comparacion();
                break;
            case 4:

                par();
                break;
            case 5:

                division();
                break;
            case 6:

                exponente();
                break;

            case 7:

                triangulo();
                break;

            case 8:

                viaje_instituto();
                break;

            case 9:

                salarios();
                break;

            case 10:

                cumpleanos();
                break;

        }

    }

    // Ejemplo comparacion
    public static void comparacion() {

        //Variables
        Scanner leer = new Scanner(System.in);
        int x, y;

        System.out.print("Introduce un número:");
        x = leer.nextInt();
        System.out.print("Introduce un segundo número:");
        y = leer.nextInt();

        //Equiparar
        if (x == y) {
            System.out.print("el primer número es igual que el segundo");
        } else {
            if (x > y) {
                System.out.print("el primer número es mayor que el segundo");
            } else {
                System.out.print("el segundo número es mayor que el primero");
            }
        }
    }

    // Ejemplo nombre
    public static void nombre() {

        // Variables
        Scanner leer = new Scanner(System.in);
        String str;

        // Escribir nombre
        System.out.print("Introduce un nombre:");
        str = leer.nextLine();

        // Resultado
        /*    if (str.equal(String)){ */
        System.out.print("Te llamas " + str);
        /*    } */

    }

    // Ejemplo suma
    public static void suma() {

        // Variables
        Scanner leer = new Scanner(System.in);
        int x, y;

        // Escribir numeros
        System.out.print("Introduce un número:");
        x = leer.nextInt();
        System.out.print("Introduce un segundo número:");
        y = leer.nextInt();

        // Resultado
        System.out.print(x + y);
    }

    // Ejemplo par
    public static void par() {

        // Variables
        Scanner leer = new Scanner(System.in);
        int x;

        // Escribir numeros
        System.out.print("Introduce un número:");
        x = leer.nextInt();

        // Salida   
        if (x % 2 == 0) {
            System.out.print("El número es par");
        } else {
            System.out.print("El número es impar");
        }
    }

    // Ejemplo división
    public static void division() {

        // Variables
        Scanner leer = new Scanner(System.in);
        float x, y;

        // Escribir numeros
        System.out.print("Introduce un número:");
        x = leer.nextFloat();
        System.out.print("Introduce un segundo número:");
        y = leer.nextFloat();

        // Resultado
        if (y == 0) {
            System.out.print("¡ERROR!");
        } else {
            System.out.print("El resultado es " + (x / y));
        }
    }

    // Ejemplo exponente
    public static void exponente() {

        // Variables
        Scanner leer = new Scanner(System.in);
        int bas, exp;

        // Escribir numeros
        System.out.print("Introduce la base:");
        bas = leer.nextInt();
        System.out.print("Introduce el exponente:");
        exp = leer.nextInt();

        // Resultado
        if (exp == 0) {
            System.out.print("El resultado es 1");
        } else {

            if (exp < 0) {

                double res = Math.pow(bas, exp);
                System.out.print("El resultado es " + (1 / res));

            } else {
                double res = Math.pow(bas, exp);
                System.out.println("El resultado es " + res);
            }

        }

    }

    // Ejemplo triangulo
    public static void triangulo() {
        // Variables

        Scanner leer = new Scanner(System.in);
        int a, b, c;

        // Escribir medidas
        System.out.print("Introduce la medida del lado a:");
        a = leer.nextInt();
        System.out.print("Introduce la medida del lado b:");
        b = leer.nextInt();
        System.out.print("Introduce la medida del lado c:");
        c = leer.nextInt();

        //RECTANGULO
        if (a > b && a > c) {
            if ((Math.pow(a, 2)) == (Math.pow(b, 2)) + (Math.pow(c, 2))) {
                System.out.print("Es un triángulo rectangulo");
            }
        } else if (b > a && b > c) {
            if ((Math.pow(b, 2)) == (Math.pow(a, 2)) + (Math.pow(c, 2))) {
                System.out.print("Es un triángulo rectangulo");
            }
        } else if (c > a && c > b) {
            if ((Math.pow(c, 2)) == (Math.pow(a, 2)) + (Math.pow(b, 2))) {
                System.out.print("Es un triángulo rectangulo");
            }
        }

        // EQUILATERO
        if (a == b && b == c && a == c) {
            System.out.print("Es un triángulo equilatero");
        }

        //ESCALENO
        if (a != b && b != c && a != c) {
            System.out.print("Es un triángulo escaleno");
        }

        //ISOSCELES
        if ((a == b && b != c) || (b == c && a != b) || (a == c && b != c)) {
            System.out.print("Es un triángulo isosceles");
        }

    }

    // Ejemplo viaje instituto
    public static void viaje_instituto() {

        // Variables
        Scanner leer = new Scanner(System.in);
        int alumnos, precio, resultado;

        //Introducir numero de alumnos
        System.out.print("Introduce la cantidad de alumnos que van al viaje:");
        alumnos = leer.nextInt();

        // 50 alumnos o mas
        if (alumnos >= 50) {

            precio = 40;
            resultado = precio * alumnos;

            System.out.print("Hay que pagar: " + resultado + "€, es decir, hay que pagar 40€ por alumno");

        } else {

            // 30 a 49 alumnos
            if ((alumnos >= 30) && (alumnos <= 49)) {

                precio = 48;
                resultado = precio * alumnos;

                System.out.print("Hay que pagar: " + resultado + "€, es decir, hay que pagar 48€ por alumno");

            } else {

                // 20 a 29 alumnos
                if ((alumnos >= 20) && (alumnos <= 29)) {

                    precio = 56;
                    resultado = precio * alumnos;

                    System.out.print("Hay que pagar: " + resultado + "€, es decir, hay que pagar 56€ por alumno");

                } else {

                    //alumnos menos de 30
                    if (alumnos < 30) {

                        precio = 2000;
                        resultado = precio / alumnos;

                        System.out.print("Hay que pagar: " + precio + "€, es decir, hay que pagar " + resultado + " por alumno");

                    }
                }

            }

        }
    }

    // Ejemplo salarios
    public static void salarios() {

        // Variables
        Scanner leer = new Scanner(System.in);
        int salario, salinc;

        //Introducir salario
        System.out.print("Introduce su salario:");
        salario = leer.nextInt();

        //Comparar salario
        if ((salario >= 0) && (salario <= 9000)) {

            salinc = (salario * 20 / 100);

            System.out.print("Su salario se ha incrementado un 20%. Su nuevo salario es: " + (salario + salinc));

        } else {

            if ((salario >= 9001) && (salario <= 15000)) {

                salinc = (salario * 10 / 100);

                System.out.print("Su salario se ha incrementado un 10%. Su nuevo salario es: " + (salario + salinc));

            } else {

                if ((salario >= 15001) && (salario <= 20000)) {

                    salinc = (salario * 5 / 100);

                    System.out.print("Su salario se ha incrementado un 5%. Su nuevo salario es: " + (salario + salinc));

                } else {

                    if (salario >= 20001) {

                        salinc = (salario * 3 / 100);

                        System.out.print("Su salario se ha incrementado un 3%. Su nuevo salario es: " + (salario + salinc));
                    }
                }
            }
        }
    }

    // Ejemplo cumpleanos
    public static void cumpleanos() {

        // Variables
        Scanner leer = new Scanner(System.in);
        int edad;

        //Introducir numero de alumnos
        System.out.print("Introduce la tu edad:");
        edad = leer.nextInt();

        //Comprobar edad
        if (edad > 15) {
            System.out.print("PUEDES ENTRAR PERO TRAYENDO REGALO");
        } else {
            if (edad == 15) {
                System.out.print("PUEDES ENTRAR");
            } else {
                System.out.print("NO PUEDES ENTRAR");
            }
        }

    }

    //Estrucuta While
    public static void whil() {

        int i = 0;

        while (i <= 100) {
            //System..println(i);
            i++;
        }
    }

    //Numeros hasta usuario
    public static void numero() {

        Scanner leer = new Scanner(System.in);
        int n;

        System.out.println("Introduce un numero");
        n = leer.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i);

        }
    }

    //Numeros del 1 al 100
    public static void num() {
        Scanner leer = new Scanner(System.in);
        int n;
        Scanner leer1 = new Scanner(System.in);
        int n1;
        Scanner leer2 = new Scanner(System.in);
        int n2;
        Scanner leer3 = new Scanner(System.in);
        int n3;
        Scanner leer4 = new Scanner(System.in);
        int n4;
        Scanner leer5 = new Scanner(System.in);
        int n5;
        Scanner leer6 = new Scanner(System.in);
        int n6;
        Scanner leer7 = new Scanner(System.in);
        int n7;
        Scanner leer8 = new Scanner(System.in);
        int n8;
        Scanner leer9 = new Scanner(System.in);
        int n9;

        System.out.println("Introduce un numero");
        n = leer.nextInt();
        System.out.println("Introduce un numero");
        n1 = leer1.nextInt();
        System.out.println("Introduce un numero");
        n2 = leer2.nextInt();
        System.out.println("Introduce un numero");
        n3 = leer3.nextInt();
        System.out.println("Introduce un numero");
        n4 = leer4.nextInt();
        System.out.println("Introduce un numero");
        n5 = leer5.nextInt();
        System.out.println("Introduce un numero");
        n6 = leer6.nextInt();
        System.out.println("Introduce un numero");
        n7 = leer7.nextInt();
        System.out.println("Introduce un numero");
        n8 = leer8.nextInt();
        System.out.println("Introduce un numero");
        n9 = leer9.nextInt();

        System.out.println("SUMA: " + (n + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9) + "PROMEDIO" + ((n + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9) / 10));

    }

    //Adivinar nombre
    public static void adivinanza() {

        Scanner leer = new Scanner(System.in);
        String nom = "Pedro";
        String nom2 = null;

        do {
            System.out.println("Introduce un nombre");
            nom2 = leer.next();

            if (nom.equals(nom2)) {

                System.out.println("Lo has adivinado");

            } else {
                System.out.println("No lo has adivinado. Intentalo de nuevo");
            }
        } while ((!nom.equals(nom2)));
    }

    //Tiradas de dados
    public static void dados() {

        Scanner leer = new Scanner(System.in);
        int n1, n2;
        String op = "";

        do {
            n1 = ((int) (Math.random() * 6 + 1));
            n2 = ((int) (Math.random() * 6 + 1));

            System.out.println("dado 1: " + n1);
            System.out.println("dado 1: " + n2);

            if (n1 != n2) {

                System.out.println(n1 + n2);

            } else {
                System.out.println("Los numeros que han salido son los mismos");
            }

            System.out.println("Quieres volver a intentarlo? (y/n)");
            op = leer.nextLine();

        } while (op.equals("y"));
    }

    //Adivina numero
    public static void adivnum() {
        Scanner scn = new Scanner(System.in);
        int num = 10;
        int num2;

        do {
            System.out.println("Escribe un numero");
            num2 = scn.nextInt();

            if (num2 == num) {
                System.out.println("Acertaste");
            } else {
                if (num2 < num) {
                    System.out.println("Mas grande");
                } else {
                    System.out.println("Mas pequeño");
                }
            }

        } while (num != num2);
    }

    // Reloj
    public static void reloj() throws InterruptedException {

        Scanner scn = new Scanner(System.in);
        int hora;
        int min;
        int seg = 0;
        System.out.println("Introduce la hora:");
        hora = scn.nextInt();
        System.out.println("Introduce los minutos:");
        min = scn.nextInt();

        while (true) {
            System.out.println(hora + ":" + min + ":" + seg);
            if (seg < 59) {
                seg++;
            } else {
                seg = 0;
                if (min < 59) {
                    min++;
                } else {
                    min = 0;
                    if (hora < 23) {
                        hora++;
                    } else {
                        hora = 0;
                    }
                }
            }
            Thread.sleep(1000);
        }

    }

    // Calendario 
    // Enero, Marzo, Mayo, Julio Agosto Octubre Dicieembree
    public static void calendario() {

        Scanner scn = new Scanner(System.in);
        int mes = 0;

        do {
            System.out.println("Escribe un numero del 1 al 12");
            mes = scn.nextInt();

        } while (mes < 1 || mes > 12);

        switch (mes) {
            case 1:
                System.out.println("Enero tiene 31 días");
            case 2:
                System.out.println("Febrero tiene 28 días");
            case 3:
                System.out.println("Marzo tiene 31 días");
            case 4:
                System.out.println("Abril tiene 30 días");
            case 5:
                System.out.println("Mayo tiene 31 días");
            case 6:
                System.out.println("Junio tiene 30 días");
            case 7:
                System.out.println("Julio tiene 31 días");
            case 8:
                System.out.println("Agosto tiene 31 días");
            case 9:
                System.out.println("Septiembre tiene 30 días");
            case 10:
                System.out.println("Octubre tiene 31 días");
            case 11:
                System.out.println("Noviembre tiene 30 días");
            case 12:
                System.out.println("Dicembre tiene 31 días");
        }
    }

    //Operaciones
    public static void operaciones() {

        Scanner scn = new Scanner(System.in);
        int num1, num2;
        String opc;

        do {
            System.out.println("------MENU------");
            System.out.println("a. Area del triangulo");
            System.out.println("b. Area del cuadrado");
            System.out.println("c. Area del circulo");
            System.out.println("d. Area del rectangulo");
            System.out.println("e. Salir");
            opc = scn.next();
        } while (!opc.toLowerCase().equals("e"));

        switch (opc) {
            case "a":

                System.out.println("-----TRIANGULO-----");
                System.out.println("Introduce la base");
                num1 = scn.nextInt();
                System.out.println("Introduce la altura");
                num2 = scn.nextInt();

                System.out.println("El area del triangulo es: " + (num1 * num2) / 2);
                break;
            case "b":

                System.out.println("-----CUADRADO-----");
                System.out.println("Introduce el lado");
                num1 = scn.nextInt();

                System.out.println("El area del triangulo es: " + (num1 * num1));
                break;

            case "c":

                System.out.println("-----CIRCULO-----");
                System.out.println("Introduce el radio");
                num1 = scn.nextInt();

                System.out.println("El area del triangulo es: " + (3.14 * num1 * num1));
                break;

            case "d":

                System.out.println("-----RECTANGULO-----");
                System.out.println("Introduce la base");
                num1 = scn.nextInt();
                System.out.println("Introduce la altura");
                num2 = scn.nextInt();

                System.out.println("El area del triangulo es: " + (num1 * num2));
                break;

            case "e":
                break;
            default:
                break;

        }

    }
    
    //funciones
    
    public static boolean esPrimo (int n){
        int divisores = 0;
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                divisores++;
            }
        }
        if (divisores>0){
            return false;
        }else{
            return true;
        }
    }
}

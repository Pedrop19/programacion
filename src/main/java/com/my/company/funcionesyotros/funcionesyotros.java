/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.funcionesyotros;

/* Importaciones */

import static com.my.company.ejemplos.Ejemplos.operaciones;
import java.util.Scanner;

/**
 *
 * @author LaParca25
 */
public class funcionesyotros {
    
     public static void main(String[] args) {
         
         
         
         primeros10(1);
                
    }
     
     //10primerosprimos
    
    public static void diezPrimerosPrimos() {
        
        //Variables
        
        int contPrimos = 0;
        int i = 1;
        boolean esPrimo;
        
        //Sacar 10 primeros primos
        
        while (contPrimos < 10) {
            if (esPrimo (i)) {
                System.out.println("El " + i + " es primo");
                contPrimos++;
            }
        i++;
        }
    } 
    
   //Funciones
    
    public static boolean esPrimo (int n){
        
        // Variables
        
        int divisores = 0;
        
        //Saber si es primo o no
        
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
    
    public static void primos(){
        int x = 1;
        int prod = 1;
        
        while (x<20){
            prod = prod*x;
            x = x+2;
        }
        
        System.out.println("El producto de los 10 primeros primos es: " + prod);
    }
    
    public static int producto10(){
        int x = 1;
        int prod = 1;
        
        while (x<20) {
            prod = prod*x;
            x = x+2;
        }
        return prod;
    }
    
    public static void fibonnaci (){
        
        //Variables
        
        Scanner sc = new Scanner(System.in);
        int n, t1 = 0, t2 = 1;
        
        //Pedir el enesimo numero al usuario
        
        System.out.println("Introduce el enesimo término");
        n = sc.nextInt();
        
        //Estetica
        
        System.out.print("Primeros " + n + " terminos: ");
        
        //Estructura de control
        
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
    
    public static int factorial (int n){
        
        int acum = 1;
        
        if (n==0){
            return 1;
        }else{
            for (int i = 1; i <= n; i++){
                acum = acum*i;
            }
            return acum;
        }
    }
    
    public static int factorialrec (int n){
        if (n==0 || n==1){
            return 1;
        }else{
            return n + factorial(n-1);
        }
    }
    
    public static int potencia(int base, int exponente){
        if(exponente==0)
            return 1;
        else
            return base * potencia(base,exponente-1);
    }
     
    public static String palabraAlReves(String palabra) {
        if (palabra.length() == 1)
            return palabra;
        else
            return palabraAlReves(palabra.substring(1)) + palabra.charAt(0);
     
    }
    
    public static void numeroAlReves (int num){
        
        if(num<10){
            System.out.print(num);
            return;
        }
        else{
            System.out.print(num % 10);
            numeroAlReves (num/10);
        }
            
    }
    
    public static void Piramide(int alt, int c) {

        for (int i = 0; i < c; i++){
            System.out.print("*");
        }
        System.out.println(" ");
        if(c < alt){
            Piramide(alt, c+1);
        }
    }
    
    public static int fibonrecur (int n){
        
        if(n <= 1)
            return n;
        else
            return fibonrecur (n-1) + fibonrecur (n-2);
    }
    
    public static int producto_impares (int n){
        if(n==0){
            return 0;
        }
        if(n%2 != 0){
            return n * producto_impares(n-1);
        }
            return producto_impares(n-1);
    }
    
    public static void primeros10 (int n){
        if (n<=10){
            System.out.print(n);
            primeros10 (n+1);
        }
    }
    
    
}
    
   

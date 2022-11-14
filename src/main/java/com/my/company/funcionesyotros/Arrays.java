/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.funcionesyotros;

import static com.my.company.ejemplos.Ejemplos.operaciones;
import java.util.Scanner;

/**
 *
 * @author LaParca25
 */
public class Arrays {
    
    
    public static void main (String[] args){
        arrayprimo();
    }
    
    public static void ejemploarray(){
     
        //Declaracion del array

        int v [] = new int[5];

        //Asignacion de valores del array

        v[0] = 8;
        v[1] = 7;
        v[2] = 5; 
        v[3] = 7;
        v[4] = 9;

        //Bucle for para mostrar los diferentes valores del array

        for (int i = 0; i < 5; i++){
            System.out.println("La posición " + i + "de v contiene: " + v[i]);
        }
    }
    
    public static void ejemploarray2() {
        
        final int TAM = 5;
        Scanner sc = new Scanner(System.in);
        int acum = 0;
        int media;
        
        int v [] = new int [TAM];
        
        for (int i = 0; i < TAM; i++) {
            System.out.println("Introduce la posición " + i + " del vector: ");
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            acum += v[i]; 
        }
        
         media = acum/TAM;
         System.out.println("La media del vector es " + media);
    }
    
    public static void arraystring() {
               
        String pal = "Carlos";
        final int TAM = 5;
        char v [] = new char[pal.length()];
        
        for (int i = 0; i < pal.length(); i++) {
            v[i] = pal.charAt(i);
        }
        for (int i = 0; i < TAM; i++) {
            System.out.println(v[i]);
        }
    }
    
    public static void arrayprimo(){
        
        final int TAM = 5;
        Scanner sc = new Scanner(System.in);
        
        int v [] = new int [TAM];
        
        for (int i = 0; i < TAM; i++) {
            v[i] = i+1;
        }
        
        for (int i = 0; i < TAM; i++) {
            if(esPrimo(v[i])){
                System.out.println(v[i] + "es primo");
            }else{
                System.out.println(v[i] + "no es primo");
            }
        }
        
    }
    
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
    
    public static void eje4(){
        
        final int TAM = 4;
        int v1[] = new int[TAM];
        int v2[] = new int[TAM];
        Scanner sc = new Scanner(System.in);
        
        
         for (int i = 0; i < TAM; i++) {
            System.out.println("Introduce la posición " + i + " del vector: ");
            v1[i] = sc.nextInt();
            v2[i] = sc.nextInt();
        }
         
        boolean iguales = true;
        for (int i = 0; i < TAM; i++) {
           if( v1[i] != v2[i]){
              iguales = false;
           }

        }
    }
  
}

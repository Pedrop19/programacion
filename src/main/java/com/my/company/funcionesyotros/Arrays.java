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
       
        ejer6();
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
        
        Scanner sc = new Scanner(System.in);

        final int size = 4;
        int[] array1 = new int[size];
        int[] array2 = new int[size];

        System.out.println("Introduce los valores del primer array:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Introduce los valores del segundo array:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }

        
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    System.out.println("Los arrays no coinciden.");
                    break;
                } else if (i == array1.length - 1) {
                    System.out.println("Los arrays coinciden.");
                }
            }
    }
    
    public static boolean ejer5(int n, int[]array) {
        
      for (int i = 0; i < array.length; i++) {
            if (array[i] == n){
                return true;
            }
      }
        return false;
    }
    
    public static void ejer6(){
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el tamaño del vector 1");

        int size1 = scanner.nextInt();

        int[] vector1 = new int[size1];

        System.out.println("ingrese el tamaño del vector 2");

        int size2 = scanner.nextInt();

        int[] vector2 = new int[size2];

        System.out.println("ingrese los valores del vector 1");

        for (int i = 0; i < size1; i++) {

        vector1[i] = scanner.nextInt();

        }

        System.out.println("ingrese los valores del vector 2");

        for (int i = 0; i < size2; i++) {

        vector2[i] = scanner.nextInt();

        }

        int[] vector3 = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {

        vector3[i] = vector1[i];

        }

        for (int i = 0; i < size2; i++) {

        vector3[i + size1] = vector2[i];

        }


        System.out.println("vector 3");

        for (int i = 0; i < vector3.length; i++) {

        System.out.print(vector3[i] + " ");

        }

        }

        }
     


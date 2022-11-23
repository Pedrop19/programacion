/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.Simulacros;

import java.util.Scanner;

/**
 *
 * @author LaParca25
 */
public class simulacro2 {
    
    public static void main(String[] args) {
        ejer3 ();
    }
    
    /* Realiza un procedimiento que pida al usuario un tamaño que se usará
    para crear dos arrays con esa longitud. Se cargarán con los datos que
    introduzca el usuario y devolverá la cantidad de valores posicionales
    iguales, es decir, aquellos que tienen mismo índice y contenido. */
    
    public static void ejer1(){
        
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Introduce el tamañano de los arrays");

        int size1 = sc.nextInt();
        
        int[] v1  = new int[size1];
        int[] v2  = new int[size1];
       
        
        System.out.println("Ingrese los valores del primer vector ");
        
        for (int i = 0; i < size1; i++) {
            
            v1[i] = sc.nextInt();
        }
        
        System.out.println("Introduce los valores del segundo vector ");
            
        for (int i = 0; i < size1; i++) {
            v2[i] = sc.nextInt();            
        }
        
        int cont = 0;
        
        for (int i = 0; i < size1; i++) {
            
            if(v1[i] == v2[i] )
                cont++;
            
        }
        
        System.out.println(cont);
        
    }
    
     /*Realiza un procedimiento que pida al usuario un tamaño que se usará
    para crear un array con esa longitud. Se cargarán con los datos que
    introduzca el usuario y mostrará cuántos números son positivos, cuántos 
    negativos y cuántos son cero.*/
    
    public static void ejer2 (){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamañano del array");

        int size1 = sc.nextInt();
        
        int[] v1  = new int[size1];
       
        
        System.out.println("Ingrese los valores del primer vector ");
        
        for (int i = 0; i < size1; i++) {
                       
            v1[i] = sc.nextInt();
        }
        
        int neg = 0;
        int pos = 0;
        int cer = 0;
        
        for (int i = 0; i < size1; i++) {
            
            if (v1[i] < 0){
                neg++;
            }else{
                if(v1[i] == 0){
                    cer++;
                }else{
                    if(v1[i] > 0){
                        pos++;
                    }
                }
                
            }
        }
        
        System.out.println("Positivos: " + pos + " Negativos: " + neg + " Ceros: " + cer);
    }
    
    /*Realiza un procedimiento para leer la altura de N personas y una vez
    calculada la altura media, decir si hay más personas con altura superior 
    a la media, si es al contrario o si hay las mismas.*/
    
    public static void ejer3 (){
        
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Introduce la cantidad de personas que se van a comparar: ");

        int size1 = sc.nextInt();
        
        int[] alturas  = new int[size1];
       
        
        System.out.println("Ingrese las alturas a comparar ");
        
        for (int i = 0; i < size1; i++) {
            
            alturas[i] = sc.nextInt();
        }
        
       int suma = 0;
       
        for (int i = 0; i < size1; i++) {
            suma = suma + alturas[i];
        }
        float media = suma / size1;
        System.out.println(media);
       
        
        int mayor = 0;
        int menor = 0;
        
        for (int i = 0; i < size1; i++) {
                if(alturas[i] < media){
                    menor++;
                }else{
                    if(alturas[i] > media){
                        mayor ++;
                    }
                }
                
            
        if(mayor > menor){
            System.out.println("Hay más personas que superan la media");
        if(menor > mayor ){
            System.out.println("Hay más personas que no superan la media");
        if(menor == mayor){       
            System.out.println("Hay las mismas personas que superan y estan por debajo de la media");
                }
            }
        }
    }
}

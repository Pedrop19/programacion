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
public class simulacroexamen {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuántos alumnos hay en clase?");

        int size1 = sc.nextInt();
        
        String[] nombres = new String[size1];
        
        int[] notas = new int[size1];

        for (int i = 0; i < size1; i++) {
            
            System.out.println("Ingrese el nombre del alumno ");
            nombres[i] = sc.next();
            System.out.println("Ingrese la nota del alumno " + nombres[i]);
            notas[i] = sc.nextInt();
            
        }

        int opcion = 0;
        
        do {
            System.out.println("1 - Mostrar la media de la clase");
            System.out.println("2 - Mostrar el nombre del alumn@ con la nota más alta");
            System.out.println("3 - Mostrar el nombre del alumn@ con la nota más baja");
            System.out.println("4 - Mostrar todos los datos");
            System.out.println("5 - Salir del programa");
            opcion = sc.nextInt();

            switch (opcion) {
                
                case 1:
                    int suma = 0;
                    for (int i = 0; i < size1; i++) {
                        suma = suma + notas[i];
                    }
                    float media = suma / size1;
                    System.out.println("La media de la clase es " + media);
                    break;
                    
                case 2:
                    
                    int notaMaxima = notas[0];
                    
                    String nombreMaxima = nombres[0];
                    
                    for (int i = 0; i < size1; i++) {
                        
                        if (notas[i] > notaMaxima) {
                            
                            nombreMaxima = nombres[i];
                            
                            notaMaxima = notas[i];
                            
                        }
                    }
                    
                    System.out.println("La nota más alta es " + notaMaxima + " y su nombre es " + nombreMaxima);
                    
                    break;
                    
                case 3:
                    
                    int notaMinima = notas[0];
                    
                    String nombreMinima = nombres[0];
                    
                    for (int i = 0; i < size1; i++) {
                        
                        if (notas[i] < notaMinima) {
                            
                            nombreMinima = nombres[i];
                            
                            notaMinima = notas[i];
                            
                        }                       
                    }
                    
                    System.out.println("La nota más baja es " + notaMinima + " y su nombre es " + nombreMinima);
                    
                    break;
                    
                case 4:
                    
                    for (int i = 0; i < size1; i++) {
                        
                        System.out.println("La nota de " + nombres[i] + " es " + notas[i]);
                        
                    }
                    break;
                    
                default:
                    
                    System.out.println("No ha elegido una opción válida");
                    
                    System.out.println("");
                    
                break;
            }

        } while (opcion != 5);
        
        System.out.println("Adiós");
    }
}
   


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Simulacros;

import java.util.Scanner;

/**
 *
 * @author LaParca25
 */
public class examen {
    
      public static void main(String[] args) {
          
        int size;       
        double precio;        
        int stock;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número de juguetes:");
        size = sc.nextInt();
        String[] nombres = new String[size];
        double[] precios = new double[size];
        int[] stocks = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.println("Introduce el nombre del juguete:");
            nombres[i] = sc.next();
            System.out.println("Introduce el precio del juguete:");
            precios[i] = sc.nextDouble();
            System.out.println("Introduce el stock del juguete:");
            stocks[i] = sc.nextInt();
        }
        
        System.out.println("La carga de datos se ha completado");
        
        int opcion;
        
        do {
            
            System.out.println("1 - Vender Juguete");
            System.out.println("2 - Reponer juguete");
            System.out.println("3 - Cambiar el precio");
            System.out.println("4 - Juguete más barato");
            System.out.println("5 - Mostrar datos");
            System.out.println("6 - Salir del programa");
            System.out.println("Introduce una opción:");
            opcion = sc.nextInt();
            
            switch (opcion) {
                
                case 1:
                    System.out.println("Introduce el nombre del juguete a vender:");
                    String nombre = sc.next();
                    for (int i = 0; i < size; i++) {
                        if (nombres[i].equals(nombre) && stocks[i] > 0) {
                            stocks[i]--;
                            System.out.println("Se ha vendido el juguete");
                            break;
                        } else if (nombres[i].equals(nombre) && stocks[i] == 0) {
                            System.out.println("No hay stock del juguete");
                            break;
                        } else if (i == size - 1) {
                            System.out.println("No existe el juguete");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Introduce el nombre del juguete a reponer:");
                    nombre = sc.next();
                    int reposicion;
                    for (int i = 0; i < size; i++) {
                        if (nombres[i].equals(nombre)) {
                            System.out.println("Introduce la cantidad que se repone:");
                            reposicion = sc.nextInt();
                            stocks[i] += reposicion;
                            System.out.println("Se ha repuesto el juguete");
                            break;
                        } else if (i == size - 1) {
                            System.out.println("No existe el juguete");
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Introduce el nombre del juguete para cambiar el precio:");
                    nombre = sc.next();
                    for (int i = 0; i < size; i++) {
                        if (nombres[i].equals(nombre)) {
                            System.out.println("El precio actual es de " + precios[i] + " euros");
                            System.out.println("Introduce el nuevo precio:");
                            precio = sc.nextDouble();
                            precios[i] = precio;
                            System.out.println("Se ha cambiado el precio");
                            break;
                        } else if (i == size - 1) {
                            System.out.println("No existe el juguete");
                        }
                    }
                    break;
                case 4:
                    
                    double min = precios[0];
                    
                    for (int i = 1; i < size; i++) {
                        
                        if (precios[i] < min)
                            min = precios[i]; 
                    }
                    for (int i = 0; i < size; i++) {
                        
                        if (precios[i] == min) {
                            
                            System.out.println("El juguete más barato es " + nombres[i] + " y cuesta " + precios[i] + " euros");
                            break;
                        }
                    }
                    break;
                    
                case 5:
                    for (int i = 0; i < size; i++) {
                        
                        System.out.println("El juguete " + nombres[i] + " vale " + precios[i]);
                        
                    }
                    break;
                    
                default :
                    
                    System.out.println("No ha elegido una opción válida");
                    
                    System.out.println("");
                    
                break;
  
            } 
        
       
        }while (opcion != 6);
        
         System.out.println("Adiós"); 
    }  
      
}


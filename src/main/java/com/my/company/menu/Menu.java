/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.menu;

import java.util.Scanner;

/**
 *
 * @author LaParca25
 */
public class Menu {
    
    public static void main(String[] args) {

        menu ();

    }
    
    //Menu
    
    public static void menu() {
        
        //Variables
        
        int opcion;
        int saldo = 2300;
        
        //BucleParaMenu
        
        do {
            System.out.println("--- CAJERO AUTOMATICO ---");
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("1. Sacar Dinero");
            System.out.println("2. Ingresar Dinero");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Solicitar Préstamo");
            System.out.println("5. Salir");
            

            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();

            switch (opcion) {
                
                //SacarDinero
                
                case 1:
                    
                    System.out.println("--- RETIRAR DINERO ---");
                    System.out.println("");
                    System.out.println("¿Qué cantidad desea retirar?");
                    int retirada = sc.nextInt();
                    
                    if(retirada>saldo){
                        System.out.println("");
                        System.out.println("Saldo insuficiente");
                        System.out.println("");
                    }else{
                        saldo=saldo-retirada;
                        System.out.println("");
                        System.out.println("Saldo disponible: " + saldo + "€");
                        System.out.println("");
                    }
                    
                break;
                
                //IngresarDinero
                
                case 2:
                   
                    System.out.println("--- INGRESAR DINERO ---");
                    System.out.println("");
                    System.out.println("¿Qué cantidad desea ingresar? Recuerde que el limite son 1000€");
                    int ingreso = sc.nextInt();
                    
                    if(ingreso>1000){
                        System.out.println("");
                        System.out.println("Límite de ingreso superado");
                        System.out.println("");
                    }else{
                        saldo=saldo+ingreso;
                        System.out.println("");
                        System.out.println("Saldo disponible: " + saldo + "€");
                        System.out.println("");
                    }
                break;

                //ConsultarSaldo
                
                case 3:
                    
                   System.out.println("--- CONSULTA DE SALDO ---");
                   System.out.println("");
                   System.out.println("Saldo disponible: " + saldo + "€");
                   System.out.println("");

                    
                break;

                //SolicitarPrestamo
                
                case 4:
                    
                   System.out.println("--- PEDIR PRESTAMO ---");
                   System.out.println("");
                   System.out.println("¿Cuánto dinero desea solicitar?");
                   int prestamo = sc.nextInt();
                   
                   if(prestamo>(saldo*2)){
                       System.out.println("Lo sentimos pero en estos momentos no podemos ofrecerle el prestamo solicitado");
                       System.out.println("");
                   }else{
                       System.out.println("El prestamo solicitado ha sido ingresada en su cuenta");
                       System.out.println("");
                       saldo=prestamo+saldo;
                       System.out.println("Saldo disponible: " + saldo + "€");
                       System.out.println("");
                   }
                    
                break;
                
                case 5:
                    System.out.println("Gracias por confiar en nosotros");
                    System.out.println("");
                break;

                default:
                    System.out.println("No ha elegido una opción válida");
                    System.out.println("");
                break;
            }
        } while (opcion != 5);
    }
}

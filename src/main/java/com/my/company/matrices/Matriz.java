/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.matrices;

import java.util.Scanner;

/**
 *
 * @author LaParca25
 */
public class Matriz {
    
    public static void main(String[] args) {
        
        
   
        
        int m [][] = {{1,1},{2,2}};
        int m2 [][] = {{1,1},{2,2}};
        int mr [][] = new int [2][2];
        
        mr = ejer3(m, m2, mr);
        
        System.out.println("MOSTRANDO CONTENIDO DE M2");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(mr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void ejer1 () {
        Scanner leern = new Scanner(System.in);
        
        System.out.println("Introduce el valor de n: ");
        int n = leern.nextInt();
        
       
        int mat [][] = new int [n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if(i == j)
                    mat[i][j] = 1;
                else
                    mat[i][j] = 0; 
            System.out.print(mat[i][j] + " ");
            } 
            System.out.println();
        }
        System.out.println();
    }
    
    public static int[][] ejer2 (int m[][], int m2[][], int n){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m2[i][j] = n*(m[i][j]);                
            }
        }
        return m2;
        
    }
    
    public static void MostrarMatriz () {
        
        int m [][] = new int [2][2];
        
        System.out.println("MOSTRANDO CONTENIDO DE M2");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] ejer3 (int m[][], int m2[][], int mr[][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
               mr [i][j] = (m[i][j] + m2[i][j]);           
            }
        }
        return mr;
        
    }
    
}

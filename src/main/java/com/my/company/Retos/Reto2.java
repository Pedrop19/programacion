/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.Retos;
/**
 *
 * @author LaParca25
 */
public class Reto2 {

     public static void main(String[] args) {    
            
         reto2();
         
    }
    
    public static void reto2(){
        
        int [] array1 = {116,104,97,110,107,115,102,111,114,112,108,97,121,105,110,103,99,111,100,101,109,98,101,114,112,108,101,97,115,101,115,104,97,114,101};
         
        for (int i = 0; i < array1.length; i++) {
           if(array1[i] >= 0 && array1[i] <128 ){
               char convert = (char)array1[i];
               System.out.print(convert);
            }
        }
    }
    
    
}
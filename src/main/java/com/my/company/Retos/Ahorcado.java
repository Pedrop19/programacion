/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.Retos;

/**
 *
 * @author LaParca25
 */
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
            
		Scanner sc = new Scanner(System.in);
		
		String[] palabras = {"palabra", "casa", "estudiante", "java"};
		String letra = "";
		
		// Eligo una palabra al azar
                
		int PalabraAleatoria = (int) (Math.random() * palabras.length);
		String palabra = palabras[PalabraAleatoria];
		
		// Creo un array para guardar las letras que se acierten
                
		char[] letrasAcertadas = new char[palabra.length()];
		
		int vidas = 5;
		boolean ganar = false;
		
		while(vidas > 0 && !ganar) {
			
			// Mostrar la palabra con asteriscos cada vez que ponga una letra
                        
			for(int i = 0; i < palabra.length(); i++) {
				if(palabra.charAt(i) == letrasAcertadas[i]) {
					System.out.print(palabra.charAt(i));
				}
				else {
					System.out.print("*");
				}
			}
			
			System.out.println();
			
			System.out.print("Dime una letra: ");
			letra = sc.nextLine();
			
			// Compruebo que la letra este dentro de la palabra
                        
			boolean letraenlaPalabra = false;
			for(int i = 0; i < palabra.length(); i++) {
				if(palabra.charAt(i) == letra.charAt(0)) {
					letrasAcertadas[i] = letra.charAt(0);
					letraenlaPalabra = true;
				}
			}
			
			// Comprobamos si ha adivinado la palabra
                        
			boolean todaslasletrasadivinadas = true;
			for(int i = 0; i < palabra.length(); i++) {
				if(palabra.charAt(i) != letrasAcertadas[i]) {
					todaslasletrasadivinadas = false;
				}
			}
			
			if(todaslasletrasadivinadas) {
				ganar = true;
				System.out.println("¡Enhorabuena! Has ganado.");
			}
			else if(!letraenlaPalabra) {
				vidas--;
				System.out.println("La letra no esta en la palabra. Te quedan " + vidas + " vidas.");
			}
		}
		
		if(!ganar) {
			System.out.println("OHHHH! Has perdido. La palabra era: " + palabra);
		}
		
	}

}
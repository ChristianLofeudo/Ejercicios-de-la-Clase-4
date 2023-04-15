package ejercicios;

import java.util.Scanner;

public class Ejercicio1C {
	
		static int Ordenar (int n1, int n2, int n3, char letra1) {	
			if (letra1 == 'b') {			
				if ((n1 > n2) && (n2 > n3)) System.out.println("El orden descendente es " + n1 + " " + n2 + " " + n3);
				else if((n1 > n3) && (n3 > n2)) System.out.println("El orden descendente es " + n1 + " " + n3 + " " + n2);
				else if ((n2 > n1) && (n1 > n3)) System.out.println("El orden descendente es " + n2 + " " + n1 + " " + n3);
				else if ((n2 > n3) && (n3 > n1)) System.out.println("El orden descendente es " + n2 + " " + n3 + " " + n1);
				else if((n3 > n2) && (n2 > n1)) System.out.println("El orden descendente es " + n3 + " " + n2 + " " + n1);		
				else  System.out.println("El orden descendente es " + n3 + " " + n1 + " " + n2);  
			}
			if (letra1 == 'a') {
				if ((n1 < n2) && (n2 < n3)) System.out.println("El orden ascendente es " + n1 + " " + n2 + " " + n3);
				else if((n1 < n3) && (n3 < n2)) System.out.println("El orden ascendente es " + n1 + " " + n3 + " " + n2);
				else if ((n2 < n1) && (n1 < n3)) System.out.println("El orden ascendente es " + n2 + " " + n1 + " " + n3);
				else if ((n2 < n3) && (n3 < n1)) System.out.println("El orden ascendente es " + n2 + " " + n3 + " " + n1);
				else if((n3 < n2) && (n2 < n1)) System.out.println("El orden ascendente es " + n3 + " " + n2 + " " + n1);
				else  System.out.println("El orden ascendente es " + n3 + " " + n1 + " " + n2);
			}		
			return n1; 
		}

		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			int a = 15,b = 0,c = 3; // Detecta los valores y solo le pide al usuario ingresar los datos faltantes.
			char letra;				
			
			if (a == 0) {
				System.out.print("Ingresar primer entero: ");
				a = teclado.nextInt();
			} else System.out.println(a +" es el primer entero.");
			
			if (b == 0) {
			System.out.print("Ingresar segundo entero: ");
			b = teclado.nextInt();
			} else System.out.println(b + " es el segundo entero.");
			
			if (c == 0) {
			System.out.print("Ingresar tercer entero: ");
			c = teclado.nextInt();
			} else System.out.println(c + " es el tercer entero.");
			
			System.out.print("Para ordenar los números en orden ascendente ingrese 'a', o 'b' para descendente: ");
			letra = teclado.next().charAt(0);						
			Ordenar(a,b,c,letra);
		}
	}


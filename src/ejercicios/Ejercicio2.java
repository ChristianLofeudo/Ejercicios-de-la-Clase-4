package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
	
	private static int sumar(File arch, char operador) throws FileNotFoundException {
		int producto= 0, suma= 0;
		boolean bandera1Entrada= true;
		Scanner sumaNumeros = new Scanner(arch);
		
		if (operador == 's') {
			while (sumaNumeros.hasNextInt()) {
				suma = suma + sumaNumeros.nextInt();				
			} return suma; 
		}
		else {
			System.out.println("Entra por multiplicación: ");
			while (sumaNumeros.hasNextInt()) {
				if (bandera1Entrada) {
					producto = sumaNumeros.nextInt();
					bandera1Entrada = false;
				} else producto = producto * sumaNumeros.nextInt();
					System.out.println(producto+" ");
					
			} return suma;
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		File archivo = new File ("C:\\temp\\miprimerarchivonum.txt");
		char operador = 's';
		int resultado = sumar(archivo,operador);
		System.out.println("El resultado es: "+ resultado);
	}
}

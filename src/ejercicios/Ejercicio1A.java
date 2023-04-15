package ejercicios;

public class Ejercicio1A {
	
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
		int a = 20;
		int b = 80;
		int c = 40;
		char letra = 'a'; // El valor del caracter controla el orden de los números. La 'a' para orden ascendente, y 'b' para descendente.
		Ordenar (a,b,c,letra);		
	}
}

package Ejercicios_1_0;
import java.util.Scanner;

public class Ejercicio_1_0_15 {

	public static void main(String[] args) {

		float nuevo = 0, suma = 0, contador = 0, resultado = 0, corte;

		corte = -1;

		// leer por teclado
		Scanner leer = new Scanner(System.in);



		while (nuevo != corte) {
			
			// Pedir por pantalla
			System.out.println("Escribe tu Número");
			nuevo = leer.nextFloat();
			suma=suma+nuevo;
			contador=contador+1;
		}
		
		resultado=suma/contador;
		System.out.println("La media de los numero es "+resultado);

	}

}

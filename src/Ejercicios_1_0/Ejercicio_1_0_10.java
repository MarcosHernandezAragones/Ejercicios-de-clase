package Ejercicios_1_0;
import java.util.Scanner;

public class Ejercicio_1_0_10 {

	public static void main(String[] args) {

		int num1;

		// leer por teclado
		Scanner leer = new Scanner(System.in);

		// Pedir por pantalla
		System.out.println("Escribe tu Número");
		num1 = leer.nextInt();

		
		while (num1==0) {
			System.out.println("Escribe tu Número");
			num1 = leer.nextInt();
		}
		if (num1 % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El númeor es impar");
		}
		
	}

}

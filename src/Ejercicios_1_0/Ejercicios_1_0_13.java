package Ejercicios_1_0;
import java.util.Scanner;

public class Ejercicios_1_0_13 {

	public static void main(String[] args) {

		int num1,num2=1,suma=0;
		
		// leer por teclado
		Scanner leer = new Scanner(System.in);

		// Pedir por pantalla
		System.out.println("Escribe tu Número");
		num1 = leer.nextInt();
		
		
		while (num2<=num1) {
			System.out.println(num2);
			suma=suma+num2;
			num2=num2+1;
		}
		
		System.out.println(suma);
	}

}

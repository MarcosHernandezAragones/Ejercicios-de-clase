package Ejercicios_1_0;
import java.util.Scanner;

public class Ejercicio_1_0_14 {

	public static void main(String[] args) {

		int num1,num2,num3,suma=0;

		// leer por teclado
		Scanner leer = new Scanner(System.in);

		// Pedir por pantalla
		System.out.println("Escribe tu Número");
		num1 = leer.nextInt();
		
		num2=num1;
		num3=num1;
		
		while (num2>0) {
			if (num1 % 2 == 0) {
				suma=suma+num1;
				num2=num2-1;
				num1=num1+2;
			} else {
				num1=num1+1;
			}
		}
		
		System.out.println("La suma de los "+ num3 +" es igual a "+suma);

	}

}

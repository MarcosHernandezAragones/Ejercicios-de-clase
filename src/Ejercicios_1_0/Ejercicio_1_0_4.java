package Ejercicios_1_0;
import java.util.Scanner;

public class Ejercicio_1_0_4 {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		//leer por teclado
		Scanner leer= new Scanner(System.in);
				
		//Pedir por pantalla
		System.out.println("Escribe tu Número");
		num1=leer.nextInt();
		
		System.out.println("Escribe otro Número");
		num2=leer.nextInt();
		
		System.out.println("Escribe otro Número");
		num3=leer.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println("El mayor es "+ num1);
		}else {
			if (num2>num3) {
				System.out.println("El mayor es el "+ num2);
			} else {
				System.out.println("El mayor es el "+ num3);
			}
		}

	}

}

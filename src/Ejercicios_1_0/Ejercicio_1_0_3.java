package Ejercicios_1_0;
import java.util.Scanner;

public class Ejercicio_1_0_3 {

	public static void main(String[] args) {
		
		
		int num1,num2;
		
		//leer por teclado
		Scanner leer= new Scanner(System.in);
				
		//Pedir por pantalla
		System.out.println("Escribe tu Número");
		num1=leer.nextInt();
		
		System.out.println("Escribe tu Número");
		num2=leer.nextInt();
		
		if(num1==num2) {
			System.out.println("Los dos son iguales");
			
		}else {
			if(num1<num2) {
				System.out.println("El mayor el es "+num2);
			}else {
				if(num1>num2) {
					System.out.println("El mayor es "+ num1);
				}
			}
		}

	}
}

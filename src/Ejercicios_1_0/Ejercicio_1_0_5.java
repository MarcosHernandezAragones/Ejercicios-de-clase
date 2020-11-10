package Ejercicios_1_0;
import java.util.Scanner;

public class Ejercicio_1_0_5 {

	public static void main(String[] args) {
		
		int num1,num2,num3,num4=0;
		
		//leer por teclado
		Scanner leer= new Scanner(System.in);
		
		//Pedir por pantalla
		System.out.println("Escribe tu Número");
		num1=leer.nextInt();
		
		System.out.println("Escribe otro Número");
		num2=leer.nextInt();
		
		System.out.println("Escribe otro Número");
		num3=leer.nextInt();
		
		if (num1<0) {
			num4=num1*num2*num3;
			System.out.println("El producto d los factores es "+num4);
		} else {
			num4=num1+num2+num3;
			System.out.println("La suma de los productos son "+num4);
		}

	}

}

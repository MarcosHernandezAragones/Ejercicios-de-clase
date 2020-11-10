package Ejercicios_1_0;
import java.util.Scanner;

public class Ejercicio_1_0_6 {

	public static void main(String[] args) {
		
		int num1,raiz;
		
		//leer por teclado
		Scanner leer= new Scanner(System.in);
		
		//Pedir por pantalla
		System.out.println("Escribe tu Número");
		num1=leer.nextInt();
		
		raiz=(int) Math.sqrt(num1);
		
		if (num1<=0) {
			System.out.println("Error");
		} else {
			System.out.println("Del número "+num1+", su potencia es "+(num1*num1)+", y su raiz es "+ raiz);
		}

	}

}

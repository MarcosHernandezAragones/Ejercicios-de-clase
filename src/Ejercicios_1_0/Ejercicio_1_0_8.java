package Ejercicios_1_0;
import java.util.Scanner;

public class Ejercicio_1_0_8 {

	public static void main(String[] args) {

		String nombre = "";
		float num1,fin;
		
		//leer por teclado
		Scanner leer= new Scanner(System.in);
		
		//Pedir por pantalla
		System.out.println("Escribe tu Número");
		num1=leer.nextInt();
		
		System.out.println("Escribe el Mes");
		nombre=leer.next();
		
		fin=num1-((num1*15)/100);
		
		
		if (nombre.equalsIgnoreCase("Octubre")) {
			System.out.println("El precio menos un 15% es "+ fin);
		} else {
			System.out.println("El precio es "+num1);
		}

	}



}

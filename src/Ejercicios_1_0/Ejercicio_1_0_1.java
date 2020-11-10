package Ejercicios_1_0;
import java.util.Scanner;

public class Ejercicio_1_0_1 {

	public static void main(String[] args) {
		
		/*
		 * 1) Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo
		 * que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables
		 * (recuerda la asignación).
		 */

		//Declarar variables e inicializarlas
		//enteros
		int num1=0;
		int num2=0;
		int num3=0;
		
		//reales
		float real=0;
		
		//caracteres
		String nombre="";
		char letra;
		letra='a';
		
		//subcadena
		System.out.println(nombre.substring(5,9));
		//Sacar texto desde donde quieres hasta el final para el primero es 0,1
		
		for (int i = 0; i < nombre.length(); i++) {
			System.out.println(nombre.substring(i,i+1));
		};
		
		
		//logicos
		boolean bandera=true;
		
		//leer por teclado
		Scanner leer= new Scanner(System.in);
		
		//Pedir por pantalla
		System.out.println("Escribe tu Número");
		num1=leer.nextInt();
		
		System.out.println("Escribe otro Número");
		num2=leer.nextInt();
		
		num3=num1;
		num1=num2;
		num2=num3;
		
		
		System.out.println("el primer número ahora es  "+num1+" y el segundo número es "+num2);
		
	}

}

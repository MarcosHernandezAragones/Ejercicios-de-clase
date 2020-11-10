package Ejercicios_1_0;
import java.util.Scanner;

public class Ejercicio_1_0_2 {

	public static void main(String[] args) {
		
		int num1,num2,num3=0;
		//leer por teclado
		Scanner leer= new Scanner(System.in);
		
		
		//Pedir por pantalla
		System.out.println("Escribe tu Número");
		num1=leer.nextInt();
				
		System.out.println("Escribe otro Número");
		num2=leer.nextInt();
		
		num3=num1+num2;
		System.out.println("La suma de los numero es "+num3);
		
		num3=num1-num2;
		System.out.println("La resta de los número es "+num3);
		
		num3=num1*num2;
		System.out.println("La multiplicación es "+num3);
		
		num3=num1/num2;
		System.out.println("La división de los número es " + num3);
		

	}

}

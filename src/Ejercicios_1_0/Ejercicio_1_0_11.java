package Ejercicios_1_0;
import java.util.Scanner;

public class Ejercicio_1_0_11 {

	public static void main(String[] args) {

		boolean bachiller = true;
		boolean prueba = true;

		// leer por teclado
		Scanner leer = new Scanner(System.in);

		// Pedir por pantalla
		System.out.println("Has aprobado bachillerato");
		bachiller = leer.nextBoolean();

		if (bachiller == true) {
			System.out.println("Puedes entrar");
		} else {
			
			System.out.println("Has aprobado La prueba de acceso");
			prueba = leer.nextBoolean();
			if (prueba==true) {
				System.out.println("Puedes entrar");
			}else {
				System.out.println("No puedes entrar");
			}
		}

	}

}

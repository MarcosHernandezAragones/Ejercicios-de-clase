package Ejercicios_1_0;
import java.util.Scanner;

public class ejercicio_1_0_16 {

	public static void main(String[] args) {

		int num1 = 0;
		String palabra="";
		boolean inter = true;

		// leer por teclado
		Scanner leer = new Scanner(System.in);

		

		while ((inter = true)) {
			// Pedir por pantalla
			System.out.println("Dime la Contraseña");
			palabra = leer.next();
			
			if ((palabra.equals("eureka")) || (num1==3)) {
				inter=false;
			}else {
				System.out.println("No es la contraseña");
				num1=num1+1;
			}
			
		}
		

	}

}

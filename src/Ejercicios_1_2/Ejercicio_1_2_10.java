package Ejercicios_1_2;

public class Ejercicio_1_2_10 {

	
	public static int cuentaletra(String frase,String letra) {
		int contador=0;
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.substring(i,i+1).equalsIgnoreCase(letra)) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(cuentaletra("Hola Juan", "a"));
		
		
	}

}

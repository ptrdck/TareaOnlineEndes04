package notas;

import java.util.Scanner;

/**
 * Representamos la clase principal del proyecto.
 * 
 * @author ppcf_
 *
 */

public class Notas {
	
	/**
	 * Iniciamos método main
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * El método Scanner leera una entrada que se almacenará en la variable num.
        La variable num debe ser un entero. 
		 */
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int num_nota = 0;
		
		/**
		 *  Inicializamos la variable calificación con un valor vacío al principio.
        Esta variable será de tipo String o cadena.
		 */
		
		String calificacion = "";
		
		/**
		 * En pantalla pondremos el mensaje que queremos
		 */
		System.out.print("Introduzca una nota: ");
		
		/**
		 * Almacenamos la variable que debe ser un entero
		 */
		num_nota = reader.nextInt();
		
		/**
		 * Invocamos al método que evalúa el entero ingresado.
        Este método está declarado en la clase Califica
		 */
		calificacion = Califica.califica(num_nota);
		
		/**
		 * Una vez procesado el método califica lo imprimiremos en pantalla
		 */
		System.out.println(calificacion);
		
		/**
		 * Cerramos el programa
		 */
		reader.close();
	}
}
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
	 * Iniciamos m�todo main
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * El m�todo Scanner leera una entrada que se almacenar� en la variable num.
        La variable num debe ser un entero. 
		 */
		Scanner reader = new Scanner(System.in);// Para pedir n�meros por teclado
		int num_nota = 0;
		
		/**
		 *  Inicializamos la variable calificaci�n con un valor vac�o al principio.
        Esta variable ser� de tipo String o cadena.
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
		 * Invocamos al m�todo que eval�a el entero ingresado.
        Este m�todo est� declarado en la clase Califica
		 */
		calificacion = Califica.califica(num_nota);
		
		/**
		 * Una vez procesado el m�todo califica lo imprimiremos en pantalla
		 */
		System.out.println(calificacion);
		
		/**
		 * Cerramos el programa
		 */
		reader.close();
	}
}
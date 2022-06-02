package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		
		int num_nota = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		num_nota = reader.nextInt();
		
		calificacion = Califica.califica(num_nota);
		
		System.out.println(calificacion);
		reader.close();
	}
}
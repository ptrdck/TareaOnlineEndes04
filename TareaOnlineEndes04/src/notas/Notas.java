package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);// Para pedir n�meros por teclado
		
		int nota = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		nota = reader.nextInt();
		
		if (nota >= 0 && nota < 5)
		calificacion = "Suspenso";
		else if (nota >= 5 && nota < 7)
		calificacion = "Aprobado";
		else if (nota >= 7 && nota <9)
		calificacion = "Notable";
		else if (nota >= 9 && nota <= 10)
		calificacion = "Sobresaliente";
		else
		calificacion = "La nota introducida no es correcta";
		
		System.out.println(calificacion);
		reader.close();
	}
}
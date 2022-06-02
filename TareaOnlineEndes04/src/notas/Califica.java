package notas;

public class Califica {

	/**
	 * @param nota
	 * @return
	 */
	public static String califica(int nota) {
		String calificacion;
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
		return calificacion;
	}

}

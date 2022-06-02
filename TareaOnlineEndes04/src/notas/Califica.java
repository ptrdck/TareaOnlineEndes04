package notas;

/**
 * Iniciamos Clase Califica que contendrá el método 
 * que clasificará una nota para devolver una calificación
 * @author ppcf_
 *
 */

public class Califica {

	/**
	 * Declaración del método que devuelve una calificación
	 * a partir de una nota.
	 * @param nota
	 * @return
	 */
	public static String califica(int nota) {
		
		 /**
		  * Declaramos la variable de salida llamada calificación.
		  */
		String calificacion;
		
		/**
		 * Inicializamos un procedimiento condicional que evaluará 
        el parámetro de entrada y la clasificará según su estado
        en los intervalos, lo que dará una clasificación por cada intervalo al 
        que pertenezca. Se introduce también un error por si no pertenece
        a los intervalos declarados.
		 */
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
		
		/**
		 *  Retornará la variable de salida.
		 */
		return calificacion;
	}

}

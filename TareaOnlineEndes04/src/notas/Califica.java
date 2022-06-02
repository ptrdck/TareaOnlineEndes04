package notas;

/**
 * Iniciamos Clase Califica que contendr� el m�todo 
 * que clasificar� una nota para devolver una calificaci�n
 * @author ppcf_
 *
 */

public class Califica {

	/**
	 * Declaraci�n del m�todo que devuelve una calificaci�n
	 * a partir de una nota.
	 * @param nota
	 * @return
	 */
	public static String califica(int nota) {
		
		 /**
		  * Declaramos la variable de salida llamada calificaci�n.
		  */
		String calificacion;
		
		/**
		 * Inicializamos un procedimiento condicional que evaluar� 
        el par�metro de entrada y la clasificar� seg�n su estado
        en los intervalos, lo que dar� una clasificaci�n por cada intervalo al 
        que pertenezca. Se introduce tambi�n un error por si no pertenece
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
		 *  Retornar� la variable de salida.
		 */
		return calificacion;
	}

}

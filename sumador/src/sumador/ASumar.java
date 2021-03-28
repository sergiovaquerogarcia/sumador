package sumador;

/**
 * CLASE para SUMAR los DÍGITOS que componen un NÚMERO.
 * @author Sergio Vaquero
 * @version 1.0
 *
 */
public class ASumar {
	
	private String numero;

	/**
	 * CONSTRUCTOR de la CLASE con parámetro.
	 * @param numero. Número a Sumar
	 */
	public ASumar(String numero) {
		this.numero = numero;
	}

	/**
	 * MÉTODO para MOSTRAR el RESULTADO de la SUMA de todos los dígitos de un número.
	 * @param num. Cadena que contiene el número a sumar.
	 * @return devuelve una Cadena donde muestra en número introducido y la suma de todos sus dígitos.
	 */
	public String mostrar(String num) {
		String aux = num;
		
		if (aux.charAt(0) == '-')
			return null;
		if (aux.length() == 1) {
			return (aux + " = " + aux);
		}
		else return (aux + " = " + aux);
		
		
	}

}

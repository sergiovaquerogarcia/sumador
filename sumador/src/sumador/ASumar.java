package sumador;

/**
 * CLASE para SUMAR los D�GITOS que componen un N�MERO.
 * @author Sergio Vaquero
 * @version 1.0
 *
 */
public class ASumar {
	
	private String numero;

	/**
	 * CONSTRUCTOR de la CLASE con par�metro.
	 * @param numero. N�mero a Sumar
	 */
	public ASumar(String numero) {
		this.numero = numero;
	}

	/**
	 * M�TODO para MOSTRAR el RESULTADO de la SUMA de todos los d�gitos de un n�mero.
	 * @param num. Cadena que contiene el n�mero a sumar.
	 * @return devuelve una Cadena donde muestra en n�mero introducido y la suma de todos sus d�gitos.
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

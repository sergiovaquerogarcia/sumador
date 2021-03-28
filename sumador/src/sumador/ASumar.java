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
		String aux = num, resultado=null;
		int sumTotal = 0;
				
		if (aux.charAt(0) == '-')
			return null;
		if (aux.length() == 1) {
			return (aux + " = " + aux);
		}
		
		sumTotal = total (num);
		resultado = presentacion(aux, sumTotal);
		
		return numero + " = " + resultado;
		
	}
	
	/**
	 * M�TODO que realiza la suma de cada uno de los d�gitos que componen el n�mero.
	 * @param valor_inicial n�mero a Sumar
	 * @return devuelve el resultado de la suma de los d�gitos.
	 */
	public int total(String valor_inicial) {
        int suma = 0;

        
      	for (int i = 0; i < valor_inicial .length(); i++) {
            String digito = valor_inicial.substring(i, i+1);
            suma = suma + Integer.parseInt(digito);	          
        }
	    return suma;
    }
	
	/**
	 * M�todo para presentar el resultado en forma de sumandos
	 * @param num es el n�mero que se quiere mostrar.
	 * @param sumaTotal es el total de la suma de los d�gitos del n�mero.
	 * @return devuelve la suma de los d�gitos como sumandos y el resultado de la suma
	 */
	public String presentacion(String num, int sumaTotal) {
		String resultado="";
		for(int i=0; i<num.length(); i++)
		{
			if(i == num.length()-1){
				resultado = resultado + num.substring(i,i+1) + '=' + sumaTotal;
			}
			else {
				resultado = resultado + num.substring(i,i+1) + '+';
			}
		}
		return resultado;
	}

}

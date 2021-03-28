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
	 * MÉTODO que realiza la suma de cada uno de los dígitos que componen el número.
	 * @param valor_inicial número a Sumar
	 * @return devuelve el resultado de la suma de los dígitos.
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
	 * Método para presentar el resultado en forma de sumandos
	 * @param num es el número que se quiere mostrar.
	 * @param sumaTotal es el total de la suma de los dígitos del número.
	 * @return devuelve la suma de los dígitos como sumandos y el resultado de la suma
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

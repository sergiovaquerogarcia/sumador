package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * CLASE JUNIT para realizar los Test de Prueba
 * @author Sergio Vaquero
 * @version 1.0
 *
 */
public class TestASumar {

	/**
	 *  TEST para comprobar un número de 1 sólo dígito 
	 */
	@Test
	public void testUnaCifra() {
		 ASumar numero = new ASumar("4");
	     String resultado = numero.mostrar("4");
	     assertEquals("4 = 4",resultado );
	}
	
	/**
	 *  TEST para comprobar si el número es negativo
	 */
	@Test
	public void testEsNegativo() {
		 ASumar numero = new ASumar("-40");
	     String resultado = numero.mostrar("-40");
	     assertNull(resultado);
	}

}

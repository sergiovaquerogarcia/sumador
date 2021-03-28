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
	 *  TEST para comprobar un n�mero de 1 s�lo d�gito 
	 */
	@Test
	public void testUnaCifra() {
		 ASumar numero = new ASumar("4");
	     String resultado = numero.mostrar("4");
	     assertEquals("4 = 4",resultado );
	}
	
	/**
	 *  TEST para comprobar si el n�mero es negativo
	 */
	@Test
	public void testEsNegativo() {
		 ASumar numero = new ASumar("-40");
	     String resultado = numero.mostrar("-40");
	     assertNull(resultado);
	}

	/**
	 * Test para un n�mero de m�s de 1 d�gito
	 * 
	 */
	@Test 
	public void testMasDeUnDigito() {
		 ASumar sumi = new ASumar("2450");
	     String resultado = sumi.mostrar("2450");
	     assertEquals("2450 = 2+4+5+0=11",resultado );
		
	}
}

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

}

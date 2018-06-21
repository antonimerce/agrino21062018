package boaEx;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoaTest {
	Boa jen;
	Boa ken;

	@Before
	public void setUp() throws Exception {
		jen = new Boa("Jennifer", 2, "grapes");
		ken = new Boa("Kenneth", 3, "granola bars");
	}

	@Test
	public void testIsHealthy() {
		assertFalse("Jen no ha d'estar sana",jen.isHealthy());
		assertTrue("Ken hauria d'estar sana",ken.isHealthy());
	}

	@Test
	public void testFitsInCage() {
		assertFalse("No pot entrar",jen.fitsInCage(2));
		assertTrue("Hauria d'entrar",jen.fitsInCage(5));
	}

	@Test
	public void testLength() {
		assertEquals("la jen ha de mesurar dos",2,jen.lengthInInches());
	}


	
}

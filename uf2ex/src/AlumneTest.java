import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


public class AlumneTest {

		Alumne al1;
		Alumne al2;
		
		@Before
		public void setUp() throws Exception {
			al1 = new Alumne("Antoni", 17, 2007, 8, 8);
			al2 = new Alumne("Cristian", 20, 2006, 8, 9);
		}

		@Test
		public void testEsMajorEdat() {
			assertFalse("No es major d'edat",al1.esMajorEdat());
			assertTrue("Si es major d'edat",al2.esMajorEdat());
		}
		
		@Test
		public void testAprovaM5() {
			assertFalse("No pasa m5",al2.aprovaM5(50));
			assertTrue("Si pasa m5",al1.aprovaM5(90));
		}
		
		@Test
		public void testAnysMatriculat() {
			assertEquals("Porta 2 anys",2,al2.anysMatriculat(2008));
		}
		
		@Test
		public void testPassaASegon() {
			
			assertTrue("Si pasa a m5",al1.passaASegon());
			assertTrue("També pasa a m5",al2.passaASegon());
		}

}

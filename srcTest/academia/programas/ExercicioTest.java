package academia.programas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExercicioTest {

	
	private Exercicio exc1;
	
	@Before
	public void criaExercicio() throws Exception {
		exc1 = new Exercicio("abdominal", 200);
	}
	
	@Test
	public void testExercicio() {
		assertEquals("abdominal",exc1.getNome());
		assertEquals(200.0, exc1.getCph(), 0.001);
	}
	
	@Test(expected=Exception.class)
	public void testNomeNull() throws Exception {
	 Exercicio aux = new Exercicio(null, 200);
	}
	
	@Test(expected=Exception.class)
	public void testNomeVasio() throws Exception {
	 Exercicio aux = new Exercicio("", 200);
	}
	
	@Test(expected=Exception.class)
	public void testNomeComExpaco() throws Exception {
	 Exercicio aux = new Exercicio(" ", 200);
	}

	@Test(expected=Exception.class)
	public void testCaloriasNegativas() throws Exception {
	 Exercicio aux = new Exercicio("Corrida", -200);
	}
	
	@Test(expected=Exception.class)
	public void testZeroCaloria() throws Exception {
	 Exercicio aux = new Exercicio(null, 0);
	}
	
	@Test(expected=Exception.class)
	public void testSetCphZero() throws Exception {
	 exc1.setCph(0);
	}
	
	@Test(expected=Exception.class)
	public void testSetCphNegativo() throws Exception {
	 exc1.setCph(-0.1);
	}
	
	@Test
	public void testEqualsObject() throws Exception {
		assertEquals(exc1, exc1);
		Exercicio exc2 = new Exercicio("abdominal", 200);
		assertEquals(exc1, exc2);
		Exercicio exc3 = new Exercicio("corrida", 700);
		assertNotEquals(exc1, exc3);
		Exercicio exc4 = new Exercicio("abdominal", 200.1);
		assertNotEquals(exc1, exc4);
		Exercicio exc5 = new Exercicio("natacao", 700);
		assertNotEquals(exc3, exc5);
	}
	
/*	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCph() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalPerMinutes() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}*/

}

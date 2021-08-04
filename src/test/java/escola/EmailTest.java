package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void naoDeveAceitarEmailInvalido() {
			assertThrows(IllegalArgumentException.class, () -> new Email(null));
			
			assertThrows(IllegalArgumentException.class, () -> new Email(""));
			
			assertThrows(IllegalArgumentException.class, () -> new Email("a@a.a"));
	}
	
	@Test
	void deveAceitarEmailValido() {
		
		assertTrue(new Email().validar("fulano@gmail.com"));
	}
}

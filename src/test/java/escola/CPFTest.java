package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CPFTest {

	@Test
	void naoAceitaCPFInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new CPF("111.212.22-09"));
		assertThrows(IllegalArgumentException.class, () -> new CPF(null));
	}
	
	@Test
	void aceitaCPFValido() {
		assertTrue(new CPF("121.234.451-98").getDigitos().isEmpty());
	}

}

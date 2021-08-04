package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelefoneTest {

	@Test
	void naoAceitaTelefoneInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "12345678"));
	}
	
	@Test
	void aeitaTelefoneValido() {
		assertFalse(new Telefone("11", "12345678").getDdd().isEmpty());
		assertFalse(new Telefone("11", "123456789").getNumero().isEmpty());
	}

}

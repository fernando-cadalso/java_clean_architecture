package escola;

public class CPF {

	private String digitos;

	public CPF(String digitos) {

		if (digitos == null || !digitos.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}"))
			throw new IllegalArgumentException("CPF inválido. Verifique.");
		
		this.digitos = digitos;
	}

	public String getDigitos() {
		return digitos;
	}
	
	
	
}

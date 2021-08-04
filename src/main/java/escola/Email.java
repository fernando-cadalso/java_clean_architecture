package escola;

public class Email {

	private String conteudo;

	public Email(String conteudo) {

		if (conteudo == null || !validar(conteudo))
			throw new IllegalArgumentException("E-mail inválido. Verifique a grafia.");
		this.conteudo = conteudo;
	}

	public Email() {
	}

	public boolean validar(String email) {
		return email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
	}
}

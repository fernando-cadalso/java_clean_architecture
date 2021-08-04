package escola;

public class Telefone {

	private String ddd;
	private String numero;

	public Telefone(String ddd, String numero) {

		if (!validaDDD(ddd) || !validaNumero(numero))
			throw new IllegalArgumentException("Verifique o DDD e o número.");

		this.ddd = ddd;
		this.numero = numero;
	}

	public boolean validaNumero(String param) {
		
		if (param == null)
			return false;
		
		return param.matches("\\d{8}||\\d{9}");
	}

	public boolean validaDDD(String param) {
		
		if (param == null)
			return false;
		
		return param.matches("\\d{2}");
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}
	
}

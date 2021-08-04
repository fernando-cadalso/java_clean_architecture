package escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private CPF cpf;
	private String nome;
	private Email email;

	private List<Telefone> telefones = new ArrayList<>();

	/*
	 * Regra do domínio do negócio. Os telefones pertencem ao Aluno, logo esse
	 * objeto adiciona os números.
	 */
	public void adicionaTelefone(String ddd, String numero) {
		telefones.add(new Telefone(ddd, numero));
	}

	public Aluno(String nome, CPF cpf, Email email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public CPF getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public Email getEmail() {
		return email;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

}

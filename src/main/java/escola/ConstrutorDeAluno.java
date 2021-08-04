package escola;

public class ConstrutorDeAluno {

	private Aluno aluno;
	
	public ConstrutorDeAluno comNomeCpfEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(nome, new CPF(cpf), new Email(email));
		return this;
	}
	
	public ConstrutorDeAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionaTelefone(ddd, numero);
		return this;
	}
	
	public Aluno criar() {
		return this.aluno;
	}
	
}

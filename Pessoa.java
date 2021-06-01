package saudefacil;

public abstract class Pessoa { 
	// atributos e nivel de visibilidade
	protected String nome;
	protected String endereco;
	protected String email;
	protected long telefone;
	
	public abstract void cadastrar();
	public void excluir(boolean S, boolean N) {
	}	
	
	
	//método construtor.
	public Pessoa(String nome, String endereco, String email, long telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	//acessores e modificadores.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	

	
	
}


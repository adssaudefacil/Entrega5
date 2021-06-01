package saudefacil;


public class Usuario extends Pessoa {
	private Conta usuario;
	private long cpf;
	
	@Override
	public void cadastrar() {
		System.out.println("Usuário " + this.getNome() + "cadastrado com sucesso!" );
		
	}

	public Usuario(String nome, String endereco, String email, long telefone, Conta usuario,
			long cpf) {
		super(nome, endereco, email, telefone);
		this.usuario = usuario;
		this.cpf = cpf;
	}

	public Conta getUsuario() {
		return usuario;
	}

	public void setUsuario(Conta usuario) {
		this.usuario = usuario;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}




}
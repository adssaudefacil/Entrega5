package saudefacil;

public class Familiar extends Pessoa {
	private String nivel;
		
	@Override
	public void cadastrar() {
	System.out.println("Familiar " + this.getNome() + "cadastrado com sucesso!" );
		
	}

	public void excluir(boolean S, boolean N) {
			super.excluir(S, N);
			System.out.println("Deseja excluir resgistro do Familiar: " + this.getNome() + "?");
			System.out.println("S para Sim. N para Não. ");
			if (S = true) {
				System.out.println("Familiar" + this.getNome() + "excluído com sucesso!");
			} else {
				System.out.println("Retorne ao Menu Principal.");
			}
	}

	
	public Familiar(String nome, String endereco, String email, long telefone, String nivel) {
		super(nome, endereco, email, telefone);
		this.nivel = nivel;
		
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}


	
	
		
	
}
